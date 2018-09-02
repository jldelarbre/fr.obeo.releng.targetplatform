package fr.obeo.releng.targetplatform.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Singleton;

import fr.obeo.releng.targetplatform.TargetPlatformBundleActivator;

@Singleton
public class ImportVariableManager {
	
	private static final String ENV = "environment";
	private static final String USE_ENV = "--useenv";
	public static final String OVERRIDE = "--override";
	public static final String TPD_VAR_PREFIX = "TPD_VAR_";

	private String[] filesToProcess = new String[0];
	private Map<String, String> overrideVarDefMap = new HashMap<String, String>();

	private int useEnvPos;
	private int overridePos;
	private int numOverrideVar;
	private boolean isLoaded = false;

	/**
	 * @param args - tpd filename list to process must be first (at least one element is expected)
	 * 			   - optional "--useenv" (case incensitive), if present look in environment for
	 * 			     variable override. Environment variable name = TPD_VAR_XXX, environment variable
	 * 			     value = varname=varvalue
	 * 			   - "--override" list of pair "variable definition name", "variable value" varname=varvalue
	 */
	public void processCommandLineArguments(String[] args) {
		clear();

		if (isUseEnvPresent(args)) {
			// We scan environment variables to extract those for TPD
			//
			// Remark: if unit tests are launched with environment variables for TPD defined
			// it may leads to error
			Map<String, String> env = System.getenv();
			for (String envName : env.keySet()) {
				if (envName.startsWith(TPD_VAR_PREFIX)) {
					String tpdOverrideVar = env.get(envName);
					importOverridingVariable(tpdOverrideVar, ENV, envName);
				}
			}
		}

		computeOverrideVarPositions(args);
		for (int i = 1 ; i <= numOverrideVar ; i++) {
			String curImport = args[overridePos + i];
			importOverridingVariable(curImport, "command line", null);
		}
		
		int numTpdFile = getNumTpdFile(args);
		filesToProcess = new String[numTpdFile];
		for (int i = 0 ; i < numTpdFile ; ++i) {
			filesToProcess[i] = args[i];
		}
		
		isLoaded = true;
	}

	private void importOverridingVariable(String curImport, String source, String varEnvName) {
		String[] varImport = curImport.split("=");
		
		String envVarString = "";
		if (source.compareTo(ENV) == 0) {
			envVarString = " (" + varEnvName + ") ";
		}
		
		if (varImport.length != 2) {
			System.out.println("[WARNING] - TPD - Wrong variable definition from " + source + envVarString + ": " + curImport
					+ " (format: varName=varValue or varName=\"varValue with space\")");
			return;
		}
		System.out.println("[INFO] - TPD - Imported variable from " + source + envVarString + ": " + curImport);
		overrideVarDefMap.put(varImport[0], varImport[1]);
	}
	
	/**
	 * @param variableName 	name of variable existing in tpd file or included tpd file
	 * 						which will be override by variable passed through command line
	 * 						or environment variable (imported variable).
	 * 						Command line variables have higher priority than environment variables
	 * @return Variable value or null if variable does not exist in imported variable
	 */
	public String getVariableValue(String variableName) {
		checkReload();
		return overrideVarDefMap.get(variableName);
	}

	/**
	 * @return tpd filename list passed in argument
	 */
	public String[] getFilesToProcess() {
		checkReload();
		return filesToProcess;
	}
	
	private void checkReload() {
		TargetPlatformBundleActivator instance = TargetPlatformBundleActivator.getInstance();
		PreferenceSettings preferenceSettings = instance.getPreferenceSettings();
		if (isLoaded && !preferenceSettings.isUpdated()) {
			return;
		}
		//If not already loaded => we are under eclipse otherwise if launched from
		//command line/maven, command line arguments are already processed at startup
		//Other case under eclipse but preference page has been updated
		List<String> args = new ArrayList<String>();
		args.add(null);
		if (preferenceSettings.isUseEnv()) {
			args.add(USE_ENV);
		}
		List<String> overrideList = preferenceSettings.getOverrideList();
		if (!overrideList.isEmpty()) {
			args.add(OVERRIDE);
			args.addAll(overrideList);
		}
		String[] argsArray = new String[args.size()];
		processCommandLineArguments(args.toArray(argsArray));
	}
	
	private boolean isUseEnvPresent(String[] args) {
		if (args.length < 2) {
			return false;
		}
		for (int i = 1 ; i < args.length ; ++i) {
			if (USE_ENV.compareToIgnoreCase(args[i]) == 0) {
				useEnvPos = i;
				return true;
			}
		}
		return false;
	}
	
	private void computeOverrideVarPositions(String[] args) {
		numOverrideVar = 0;
		if (args.length < 2) {
			return;
		}
		overridePos = args.length;
		for (int i = 1 ; i < args.length ; ++i) {
			if (OVERRIDE.compareToIgnoreCase(args[i]) == 0) {
				overridePos = i;
				break;
			}
		}
		for (int i = overridePos + 1 ; i < args.length ; ++i) {
			if (USE_ENV.compareToIgnoreCase(args[i]) == 0) {
				break;
			}
			++numOverrideVar;
		}
	}
	
	private int getNumTpdFile(String[] args) {
		int numTpd = args.length;
		
		if (numTpd > useEnvPos) {
			numTpd = useEnvPos;
		}
		if (numTpd > overridePos) {
			numTpd = overridePos;
		}
		
		return numTpd;
	}
	
	//Only public for test: cleanup. Same instance is used across tests
	public void clear() {
		filesToProcess = new String[0];
		overrideVarDefMap.clear();
	}
}
