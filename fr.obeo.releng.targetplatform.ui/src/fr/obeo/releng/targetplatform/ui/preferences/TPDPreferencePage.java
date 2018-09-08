package fr.obeo.releng.targetplatform.ui.preferences;

import java.util.Map;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import fr.obeo.releng.targetplatform.TargetPlatformBundleActivator;
import fr.obeo.releng.targetplatform.ui.internal.TargetPlatformActivator;
import fr.obeo.releng.targetplatform.util.ImportVariableManager;
import fr.obeo.releng.targetplatform.util.PreferenceSettings;

public class TPDPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {
	
	private String duplicatedIUWarnPreference2BeSet;
	private boolean useEnvSetting2BeSet;
	private int maxRetry;
	private String variableOverridList;
	
	private Label labelErr;
	
	public TPDPreferencePage() {
		super(GRID);
		setPreferenceStore(TargetPlatformActivator.getInstance().getPreferenceStore());
		setDescription("TPD options preference page");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(new RadioGroupFieldEditor(
				TPDPreferenceConstants.P_CHOICE_DUPLICATED_IU_WARNING,
			"Warning behavior of duplicated IU from included target platforms",
			1,
			new String[][] {
					{ "Display &Warning", PreferenceSettings.DUPLICATED_IU_IMPORT_WARN },
					{ "Display &Info", PreferenceSettings.DUPLICATED_IU_IMPORT_INFO },
					{ "&Silent", PreferenceSettings.DUPLICATED_IU_IMPORT_SILENT }
		}, getFieldEditorParent()));
		
		addField(new BooleanFieldEditor(
				TPDPreferenceConstants.P_CHOICE_USE_ENV,
				"\nUse &environment variables to override variable values in tpd files\n(need restart only if environment change)",
				getFieldEditorParent()));
		Label label = new Label(getFieldEditorParent(),SWT.NONE); // Dirty trick to get widget align in FieldEditorPreferencePage
		label.setText("\nNumber of &retry when loading a location or an \"include\" tpd");
		addField(new IntegerFieldEditor(
				TPDPreferenceConstants.P_CHOICE_NUM_RETRY,
				"",
				getFieldEditorParent()));
		
		showLoadedEnvironmentVariables();
		showVariableOverride();
	}

	private void showLoadedEnvironmentVariables() {
		Composite parent= getFieldEditorParent();
		new Label(parent,SWT.NONE); // Dirty trick to get widget align in FieldEditorPreferencePage
		Label label1 = new Label(parent,SWT.NONE);
		new Label(parent,SWT.NONE);
		label1.setText("Environment variables found at startup for TPD");
		Text labelLoadedTPDEnvVar = new Text(parent, SWT.READ_ONLY | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gridData.heightHint = 8 * labelLoadedTPDEnvVar.getLineHeight();
		gridData.widthHint = (3*gridData.heightHint)/2;
		labelLoadedTPDEnvVar.setLayoutData(gridData);
		new Label(parent,SWT.NONE);
		
		String varEnvList = "";
		Map<String, String> env = System.getenv();
		for (String envName : env.keySet()) {
			if (envName.startsWith(ImportVariableManager.TPD_VAR_PREFIX)) {
				String tpdOverrideVar = env.get(envName);
				String[] varImport = tpdOverrideVar.split("=");
				if (varImport.length != 2) {
					continue;
				}
				varEnvList += envName + ": " + varImport[0] + " = " + varImport[1] + "\n";
			}
		}
		
		labelLoadedTPDEnvVar.setText(varEnvList);
	}
	
	private void showVariableOverride() {
		Composite parent= getFieldEditorParent();
		Label label1 = new Label(parent,SWT.NONE);
		label1.setText("\nVariable &override list (same as in command line without: " + ImportVariableManager.OVERRIDE + ")\n" +
				"example: var1=value1 var2=\"value with space\" var3=\"\"");
		addField(new StringFieldEditor(TPDPreferenceConstants.P_LIST_OVERRIDE, "", getFieldEditorParent()));
		new Label(parent,SWT.NONE);
		labelErr = new Label(parent,SWT.NONE);
		labelErr.setForeground(new Color(parent.getDisplay(), 255, 0, 0));
		labelErr.setText("Invalid variable override list");
		displayOverrideListWarning();
	}
	
	public void propertyChange(PropertyChangeEvent event) {
        super.propertyChange(event);
        
        if (event.getProperty().equals(FieldEditor.VALUE)) {
        	Object source = event.getSource();
        	if (source instanceof RadioGroupFieldEditor) {
        		RadioGroupFieldEditor radioGroup = (RadioGroupFieldEditor) source;
        		if (radioGroup.getPreferenceName().equals(TPDPreferenceConstants.P_CHOICE_DUPLICATED_IU_WARNING)) {
        			duplicatedIUWarnPreference2BeSet = (String) event.getNewValue();
        		}
        	}
        	else if (source instanceof BooleanFieldEditor) {
        		BooleanFieldEditor boolField = (BooleanFieldEditor) source;
        		if (boolField.getPreferenceName().equals(TPDPreferenceConstants.P_CHOICE_USE_ENV)) {
        			useEnvSetting2BeSet = (Boolean) event.getNewValue();
        		}
        	}
        	else if (source instanceof IntegerFieldEditor) {
        		IntegerFieldEditor intField = (IntegerFieldEditor) source;
        		if (intField.getPreferenceName().equals(TPDPreferenceConstants.P_CHOICE_NUM_RETRY)) {
        			maxRetry = Integer.parseInt((String) event.getNewValue());
        		}
        	}
        	else if (source instanceof StringFieldEditor) {
        		StringFieldEditor stringEditor = (StringFieldEditor) source;
        		if (stringEditor.getPreferenceName().equals(TPDPreferenceConstants.P_LIST_OVERRIDE)) {
        			variableOverridList = (String) event.getNewValue();
        			displayOverrideListWarning();
        		}
        	}
        }
	}

	private void displayOverrideListWarning() {
		if (PreferenceSettings.checkOverrideList(variableOverridList)) {
			labelErr.setVisible(false);
		}
		else {
			labelErr.setVisible(true);
		}
	}
	
	private void updateSettings() {
		TargetPlatformBundleActivator instance = TargetPlatformBundleActivator.getInstance();
		PreferenceSettings preferenceSettings = instance.getPreferenceSettings();
		preferenceSettings.setDuplicatedIUWarnPreference(duplicatedIUWarnPreference2BeSet);
		preferenceSettings.setUseEnv(useEnvSetting2BeSet);
		preferenceSettings.setMaxRetry(maxRetry);
		preferenceSettings.setOverrideList(variableOverridList);
	}
	
	@Override
	protected void performApply() {
		super.performApply();
		updateSettings();
	}
	
	@Override
	public boolean performOk() {
		updateSettings();
		return super.performOk();
	}
	
	@Override
	protected void performDefaults() {
		super.performDefaults();
		duplicatedIUWarnPreference2BeSet = PreferenceSettings.DUPLICATED_IU_IMPORT_DEFAULT;
		useEnvSetting2BeSet = PreferenceSettings.USE_ENV_DEFAULT_SETTING;
		maxRetry = PreferenceSettings.MAX_RETRIES;
		variableOverridList = PreferenceSettings.OVERRIDE_LIST_DEFAULT;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		duplicatedIUWarnPreference2BeSet = TargetPlatformActivator.getInstance()
				.getPreferenceStore().getString(TPDPreferenceConstants.P_CHOICE_DUPLICATED_IU_WARNING);
		useEnvSetting2BeSet = TargetPlatformActivator.getInstance()
				.getPreferenceStore().getBoolean(TPDPreferenceConstants.P_CHOICE_USE_ENV);
		maxRetry = TargetPlatformActivator.getInstance()
				.getPreferenceStore().getInt(TPDPreferenceConstants.P_CHOICE_NUM_RETRY);
		variableOverridList = TargetPlatformActivator.getInstance()
				.getPreferenceStore().getString(TPDPreferenceConstants.P_LIST_OVERRIDE);
	}
	
}