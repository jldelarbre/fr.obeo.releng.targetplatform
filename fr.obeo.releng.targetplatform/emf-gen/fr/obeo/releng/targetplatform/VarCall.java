/**
 */
package fr.obeo.releng.targetplatform;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.releng.targetplatform.VarCall#getVarName <em>Var Name</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.VarCall#getOriginalVarName <em>Original Var Name</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.VarCall#isVariableDefinitionCycleDetected <em>Variable Definition Cycle Detected</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.VarCall#getVarDefCycle <em>Var Def Cycle</em>}</li>
 * </ul>
 *
 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getVarCall()
 * @model
 * @generated
 */
public interface VarCall extends CompositeStringPart {
	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' reference.
	 * @see #setVarName(VarDefinition)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getVarCall_VarName()
	 * @model
	 * @generated
	 */
	VarDefinition getVarName();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.VarCall#getVarName <em>Var Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' reference.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(VarDefinition value);

	/**
	 * Returns the value of the '<em><b>Original Var Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Var Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Var Name</em>' reference.
	 * @see #setOriginalVarName(VarDefinition)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getVarCall_OriginalVarName()
	 * @model
	 * @generated
	 */
	VarDefinition getOriginalVarName();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.VarCall#getOriginalVarName <em>Original Var Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Var Name</em>' reference.
	 * @see #getOriginalVarName()
	 * @generated
	 */
	void setOriginalVarName(VarDefinition value);

	/**
	 * Returns the value of the '<em><b>Variable Definition Cycle Detected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Definition Cycle Detected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Definition Cycle Detected</em>' attribute.
	 * @see #setVariableDefinitionCycleDetected(boolean)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getVarCall_VariableDefinitionCycleDetected()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isVariableDefinitionCycleDetected();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.VarCall#isVariableDefinitionCycleDetected <em>Variable Definition Cycle Detected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Definition Cycle Detected</em>' attribute.
	 * @see #isVariableDefinitionCycleDetected()
	 * @generated
	 */
	void setVariableDefinitionCycleDetected(boolean value);

	/**
	 * Returns the value of the '<em><b>Var Def Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Def Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Def Cycle</em>' attribute.
	 * @see #setVarDefCycle(List)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getVarCall_VarDefCycle()
	 * @model unique="false" dataType="fr.obeo.releng.targetplatform.VarDefList"
	 * @generated
	 */
	List<VarDefinition> getVarDefCycle();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.VarCall#getVarDefCycle <em>Var Def Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Def Cycle</em>' attribute.
	 * @see #getVarDefCycle()
	 * @generated
	 */
	void setVarDefCycle(List<VarDefinition> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%java.util.ArrayList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;&gt; alreadyCalledVariable = &lt;%org.eclipse.xtext.xbase.lib.CollectionLiterals%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;&gt;newArrayList();\nreturn this.getActualString(alreadyCalledVariable);'"
	 * @generated
	 */
	String getActualString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" alreadyCalledVariableDataType="fr.obeo.releng.targetplatform.VarDefList" alreadyCalledVariableUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt; _varName = this.getVarName();\nboolean _tripleEquals = (null == _varName);\nif (_tripleEquals)\n{\n\t&lt;%java.lang.String%&gt; message = \"Unresolved varCall: \";\n\t&lt;%org.eclipse.emf.ecore.EObject%&gt; superContext = this.eContainer();\n\twhile ((superContext != null))\n\t{\n\t\t{\n\t\t\t&lt;%java.lang.String%&gt; _message = message;\n\t\t\t&lt;%java.lang.String%&gt; _string = superContext.toString();\n\t\t\t&lt;%java.lang.String%&gt; _plus = (_string + \" / \");\n\t\t\tmessage = (_message + _plus);\n\t\t\tsuperContext = superContext.eContainer();\n\t\t}\n\t}\n\t&lt;%org.eclipse.core.runtime.ILog%&gt; _log = &lt;%fr.obeo.releng.targetplatform.TargetPlatformBundleActivator%&gt;.getInstance().getLog();\n\t&lt;%org.eclipse.core.runtime.Status%&gt; _status = new &lt;%org.eclipse.core.runtime.Status%&gt;(&lt;%org.eclipse.core.runtime.IStatus%&gt;.INFO, &lt;%fr.obeo.releng.targetplatform.TargetPlatformBundleActivator%&gt;.PLUGIN_ID, message);\n\t_log.log(_status);\n\treturn \"\";\n}\nthis.setVariableDefinitionCycleDetected(false);\n&lt;%fr.obeo.releng.targetplatform.CompositeString%&gt; _value = this.getVarName().getValue();\nboolean _tripleNotEquals = (_value != null);\nif (_tripleNotEquals)\n{\n\tboolean _contains = alreadyCalledVariable.contains(this.getVarName());\n\tif (_contains)\n\t{\n\t\tthis.setVariableDefinitionCycleDetected(true);\n\t}\n\talreadyCalledVariable.add(this.getVarName());\n\tboolean _isVariableDefinitionCycleDetected = this.isVariableDefinitionCycleDetected();\n\tif (_isVariableDefinitionCycleDetected)\n\t{\n\t\tthis.setVarDefCycle(&lt;%org.eclipse.xtext.xbase.lib.CollectionLiterals%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;&gt;newArrayList(((&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(alreadyCalledVariable, &lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;.class))));\n\t\treturn \"\";\n\t}\n}\nfinal &lt;%java.lang.String%&gt; varNameEffectiveValue = this.getVarName().getEffectiveValue(alreadyCalledVariable);\nthis.setVariableDefinitionCycleDetected(this.getVarName().isVariableDefinitionCycleDetected());\nboolean _isVariableDefinitionCycleDetected_1 = this.isVariableDefinitionCycleDetected();\nif (_isVariableDefinitionCycleDetected_1)\n{\n\tthis.setVarDefCycle(&lt;%org.eclipse.xtext.xbase.lib.CollectionLiterals%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;&gt;newArrayList(((&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(this.getVarName().getVarDefCycle(), &lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;.class))));\n}\nreturn varNameEffectiveValue;'"
	 * @generated
	 */
	String getActualString(List<VarDefinition> alreadyCalledVariable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	VarCall getCopy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt; _varName = this.getVarName();\nboolean _tripleEquals = (_varName == null);\nif (_tripleEquals)\n{\n\treturn false;\n}\nif (((this.getVarName().getName() == null) || (this.getVarName().getValue() == null)))\n{\n\treturn false;\n}\nthis.getActualString();\nboolean _isVariableDefinitionCycleDetected = this.isVariableDefinitionCycleDetected();\nif (_isVariableDefinitionCycleDetected)\n{\n\treturn false;\n}\nreturn this.getVarName().getValue().isResolved();'"
	 * @generated
	 */
	boolean isResolved();

} // VarCall
