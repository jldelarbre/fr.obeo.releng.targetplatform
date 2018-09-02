package fr.obeo.releng.targetplatform.util;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Singleton;

@Singleton
public class PreferenceSettings {
	
	private boolean updated = false;
	
	public static final String DUPLICATED_IU_IMPORT_WARN = "warning";
	public static final String DUPLICATED_IU_IMPORT_INFO = "info";
	public static final String DUPLICATED_IU_IMPORT_SILENT = "silent";
	public static final String DUPLICATED_IU_IMPORT_DEFAULT = DUPLICATED_IU_IMPORT_WARN;
	
	private String duplicatedIUWarnPreference = DUPLICATED_IU_IMPORT_DEFAULT;
	
	public static final boolean USE_ENV_DEFAULT_SETTING = false;

	/** Under eclipse default behavior is not to use environment variable to override target variables,
	 * if launched through command line or maven it is set to true */
	private boolean useEnv = USE_ENV_DEFAULT_SETTING;
	
	public static final String OVERRIDE_LIST_DEFAULT = "";
	private String overrideList = OVERRIDE_LIST_DEFAULT;

	public boolean isUseEnv() {
		return useEnv;
	}

	public void setUseEnv(boolean useEnv) {
		if (useEnv != this.useEnv) {
			updated = true;
		}
		this.useEnv = useEnv;
	}

	public String getDuplicatedIUWarnPreference() {
		return duplicatedIUWarnPreference;
	}

	public void setDuplicatedIUWarnPreference(String duplicatedIUWarnPreference) {
		this.duplicatedIUWarnPreference = duplicatedIUWarnPreference;
	}
	
	public List<String> getOverrideList() {
		List<String> splittedOverrideList = new ArrayList<String>();
		try {
			splittedOverrideList.addAll(OverrideListSplitter.splitOverrideList(overrideList));
		} catch (Exception e) {
		}
		return splittedOverrideList;
	}
	
	public void setOverrideList(String overrideList) {
		if (!overrideList.equals(this.overrideList)) {
			updated = true;
		}
		this.overrideList = overrideList;
	}

	/**
	 * @return true if OK
	 */
	public static boolean checkOverrideList(String pOverrideList) {
		try {
			OverrideListSplitter.splitOverrideList(pOverrideList);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean isUpdated() {
		boolean status = updated;
		updated = false;
		return status;
	}

	public static final class OverrideListSplitter {
		private static final String EQ = "=";
		private static final String QUOTE = "\"";
		
		public static List<String> splitOverrideList(String pOverrideList) throws Exception {
			List<String> overrideVarSplitted = new ArrayList<String>();
			
			String trailingInput = pOverrideList.trim();
			while(!trailingInput.isEmpty()) {
				trailingInput = processNextOverride(trailingInput, overrideVarSplitted);
			}
			
			return overrideVarSplitted;
		}
		
		// Override => var1=value1
		private static String processNextOverride(String pTrailingInput , List<String> overrideVarSplitted) throws Exception {
			String trailingInput = pTrailingInput.trim();
			String varName = getNextVarName(trailingInput);
			String varValue = getNextVarValue(trailingInput);
			
			trailingInput = trailingInput.replaceFirst(varName, "").replaceFirst(EQ, "").trim();
			trailingInput = trailingInput.replaceFirst(varValue, "").trim();
			
			varValue = varValue.replaceAll(QUOTE, "");
			
			overrideVarSplitted.add(varName + "=" + varValue);
			
			return trailingInput;
		}
		
		private static String getNextVarName(String pTrailingInput) throws Exception {
			int nextEqualPos = pTrailingInput.indexOf(EQ);
			if (nextEqualPos == -1) {
				throw new Exception();
			}
			return pTrailingInput.substring(0, nextEqualPos).trim();
		}
		
		private static String getNextVarValue(String pTrailingInput) throws Exception {
			String varName = getNextVarName(pTrailingInput);
			String trailingInput = pTrailingInput.replaceFirst(varName, "").replaceFirst(EQ, "").trim();
			
			String varValue = null;
			if (trailingInput.startsWith(QUOTE)) {
				int nextQuotePos = trailingInput.indexOf(QUOTE, 1);
				if (nextQuotePos == -1) {
					throw new Exception();
				}
				varValue = trailingInput.substring(0, nextQuotePos+1);
			}
			else {
				int nextSpace = trailingInput.indexOf(" ");
				if (nextSpace != -1) {
					varValue = trailingInput.substring(0, nextSpace);
				}
				else {
					varValue = trailingInput.trim();
				}
			}
			
			return varValue;
		}
	}
}
