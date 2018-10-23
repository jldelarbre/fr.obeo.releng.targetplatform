/**
 */
package fr.obeo.releng.targetplatform;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.releng.targetplatform.VarDefinitionContainer#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.VarDefinitionContainer#getVarDefList <em>Var Def List</em>}</li>
 * </ul>
 *
 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getVarDefinitionContainer()
 * @model
 * @generated
 */
public interface VarDefinitionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getVarDefinitionContainer_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.VarDefinitionContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Var Def List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Def List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Def List</em>' attribute.
	 * @see #setVarDefList(List)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getVarDefinitionContainer_VarDefList()
	 * @model unique="false" dataType="fr.obeo.releng.targetplatform.VarDefList"
	 * @generated
	 */
	List<VarDefinition> getVarDefList();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.VarDefinitionContainer#getVarDefList <em>Var Def List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Def List</em>' attribute.
	 * @see #getVarDefList()
	 * @generated
	 */
	void setVarDefList(List<VarDefinition> value);

} // VarDefinitionContainer
