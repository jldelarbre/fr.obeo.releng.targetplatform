/**
 */
package fr.obeo.releng.targetplatform;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#isCompositeElementsResolved <em>Composite Elements Resolved</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getPreDefinedVarContainer <em>Pre Defined Var Container</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#isInvalidateByEmfXtext <em>Invalidate By Emf Xtext</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getVarDef2OverrideInImportedTarget <em>Var Def2 Override In Imported Target</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getContents <em>Contents</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getImportedTargetPlatforms <em>Imported Target Platforms</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getIncludes <em>Includes</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getOptions <em>Options</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getLocations <em>Locations</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.TargetPlatform#getVarDefinition <em>Var Definition</em>}</li>
 * </ul>
 *
 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform()
 * @model
 * @generated
 */
public interface TargetPlatform extends EObject {
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
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.TargetPlatform#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Composite Elements Resolved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Elements Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Elements Resolved</em>' attribute.
	 * @see #setCompositeElementsResolved(boolean)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_CompositeElementsResolved()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isCompositeElementsResolved();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.TargetPlatform#isCompositeElementsResolved <em>Composite Elements Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Elements Resolved</em>' attribute.
	 * @see #isCompositeElementsResolved()
	 * @generated
	 */
	void setCompositeElementsResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Pre Defined Var Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Defined Var Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Defined Var Container</em>' containment reference.
	 * @see #setPreDefinedVarContainer(VarDefinitionContainer)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_PreDefinedVarContainer()
	 * @model containment="true"
	 * @generated
	 */
	VarDefinitionContainer getPreDefinedVarContainer();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.TargetPlatform#getPreDefinedVarContainer <em>Pre Defined Var Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Defined Var Container</em>' containment reference.
	 * @see #getPreDefinedVarContainer()
	 * @generated
	 */
	void setPreDefinedVarContainer(VarDefinitionContainer value);

	/**
	 * Returns the value of the '<em><b>Invalidate By Emf Xtext</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalidate By Emf Xtext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalidate By Emf Xtext</em>' attribute.
	 * @see #setInvalidateByEmfXtext(boolean)
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_InvalidateByEmfXtext()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isInvalidateByEmfXtext();

	/**
	 * Sets the value of the '{@link fr.obeo.releng.targetplatform.TargetPlatform#isInvalidateByEmfXtext <em>Invalidate By Emf Xtext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalidate By Emf Xtext</em>' attribute.
	 * @see #isInvalidateByEmfXtext()
	 * @generated
	 */
	void setInvalidateByEmfXtext(boolean value);

	/**
	 * Returns the value of the '<em><b>Var Def2 Override In Imported Target</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.releng.targetplatform.VarDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Def2 Override In Imported Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Def2 Override In Imported Target</em>' containment reference list.
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_VarDef2OverrideInImportedTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<VarDefinition> getVarDef2OverrideInImportedTarget();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.releng.targetplatform.TargetContent}.
	 * It is bidirectional and its opposite is '{@link fr.obeo.releng.targetplatform.TargetContent#getTargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_Contents()
	 * @see fr.obeo.releng.targetplatform.TargetContent#getTargetPlatform
	 * @model opposite="targetPlatform" containment="true"
	 * @generated
	 */
	EList<TargetContent> getContents();

	/**
	 * Returns the value of the '<em><b>Imported Target Platforms</b></em>' map.
	 * The key is of type {@link fr.obeo.releng.targetplatform.IncludeDeclaration},
	 * and the value is of type {@link fr.obeo.releng.targetplatform.TargetPlatform},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Target Platforms</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Target Platforms</em>' map.
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_ImportedTargetPlatforms()
	 * @model mapType="fr.obeo.releng.targetplatform.TargetPlatformIncludeDeclarationEntry&lt;fr.obeo.releng.targetplatform.IncludeDeclaration, fr.obeo.releng.targetplatform.TargetPlatform&gt;"
	 * @generated
	 */
	EMap<IncludeDeclaration, TargetPlatform> getImportedTargetPlatforms();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.releng.targetplatform.IncludeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_Includes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.util.List%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.IncludeDeclaration%&gt;&gt; _list = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.IncludeDeclaration%&gt;&gt;toList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.IncludeDeclaration%&gt;&gt;filter(this.getContents(), &lt;%fr.obeo.releng.targetplatform.IncludeDeclaration%&gt;.class));\nreturn new &lt;%org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.IncludeDeclaration%&gt;&gt;(_list);'"
	 * @generated
	 */
	EList<IncludeDeclaration> getIncludes();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link fr.obeo.releng.targetplatform.Option}.
	 * The literals are from the enumeration {@link fr.obeo.releng.targetplatform.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see fr.obeo.releng.targetplatform.Option
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_Options()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Options%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Option%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Options%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Option%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Option%&gt;&gt; apply(final &lt;%fr.obeo.releng.targetplatform.Options%&gt; it)\n\t{\n\t\treturn it.getOptions();\n\t}\n};\n&lt;%java.util.List%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Option%&gt;&gt; _list = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.Option%&gt;&gt;toList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.Option%&gt;&gt;concat(&lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.Options%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Option%&gt;&gt;&gt;map(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.Options%&gt;&gt;filter(this.getContents(), &lt;%fr.obeo.releng.targetplatform.Options%&gt;.class), _function)));\nreturn new &lt;%org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Option%&gt;&gt;(_list);'"
	 * @generated
	 */
	EList<Option> getOptions();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.releng.targetplatform.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_Locations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.util.List%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Location%&gt;&gt; _list = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.Location%&gt;&gt;toList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.Location%&gt;&gt;filter(this.getContents(), &lt;%fr.obeo.releng.targetplatform.Location%&gt;.class));\nreturn new &lt;%org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.Location%&gt;&gt;(_list);'"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_Environment()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.Environment%&gt;&gt;head(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.Environment%&gt;&gt;filter(this.getContents(), &lt;%fr.obeo.releng.targetplatform.Environment%&gt;.class));'"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Returns the value of the '<em><b>Var Definition</b></em>' reference list.
	 * The list contents are of type {@link fr.obeo.releng.targetplatform.VarDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Definition</em>' reference list.
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#getTargetPlatform_VarDefinition()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.util.List%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;&gt; _list = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;&gt;toList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;&gt;filter(this.getContents(), &lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;.class));\nreturn new &lt;%org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList%&gt;&lt;&lt;%fr.obeo.releng.targetplatform.VarDefinition%&gt;&gt;(_list);'"
	 * @generated
	 */
	EList<VarDefinition> getVarDefinition();

} // TargetPlatform
