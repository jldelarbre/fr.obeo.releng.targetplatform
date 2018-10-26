/**
 */
package fr.obeo.releng.targetplatform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.releng.targetplatform.IncludeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.IncludeDeclaration#getCompositeImportURI <em>Composite Import URI</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.IncludeDeclaration#getImportURI <em>Import URI</em>}</li>
 * </ul>
 *
 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getIncludeDeclaration()
 * @model
 * @generated
 */
public interface IncludeDeclaration extends TargetContent {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"include declaration"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getIncludeDeclaration_Name()
	 * @model default="include declaration" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.IncludeDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Composite Import URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Import URI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Import URI</em>' containment reference.
	 * @see #setCompositeImportURI(CompositeString)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getIncludeDeclaration_CompositeImportURI()
	 * @model containment="true"
	 * @generated
	 */
	CompositeString getCompositeImportURI();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.IncludeDeclaration#getCompositeImportURI <em>Composite Import URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Import URI</em>' containment reference.
	 * @see #getCompositeImportURI()
	 * @generated
	 */
	void setCompositeImportURI(CompositeString value);

	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute.
	 * @see #setImportURI(String)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getIncludeDeclaration_ImportURI()
	 * @model unique="false"
	 * @generated
	 */
	String getImportURI();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.IncludeDeclaration#getImportURI <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import URI</em>' attribute.
	 * @see #getImportURI()
	 * @generated
	 */
	void setImportURI(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateImportURI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getCompositeImportURI().isResolved();'"
	 * @generated
	 */
	boolean isResolved();

} // IncludeDeclaration
