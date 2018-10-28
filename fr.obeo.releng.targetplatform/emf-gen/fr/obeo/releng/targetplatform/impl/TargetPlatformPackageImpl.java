/**
 */
package fr.obeo.releng.targetplatform.impl;

import fr.obeo.releng.targetplatform.CompositeString;
import fr.obeo.releng.targetplatform.CompositeStringPart;
import fr.obeo.releng.targetplatform.Environment;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.Option;
import fr.obeo.releng.targetplatform.Options;
import fr.obeo.releng.targetplatform.StaticString;
import fr.obeo.releng.targetplatform.TargetContent;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformFactory;
import fr.obeo.releng.targetplatform.TargetPlatformPackage;
import fr.obeo.releng.targetplatform.VarCall;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.VarDefinitionContainer;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jdt.launching.environments.IExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetPlatformPackageImpl extends EPackageImpl implements TargetPlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPlatformIncludeDeclarationEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDefinitionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeStringPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType varDefListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executionEnvironmentEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TargetPlatformPackageImpl() {
		super(eNS_URI, TargetPlatformFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TargetPlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TargetPlatformPackage init() {
		if (isInited) return (TargetPlatformPackage)EPackage.Registry.INSTANCE.getEPackage(TargetPlatformPackage.eNS_URI);

		// Obtain or create and register package
		TargetPlatformPackageImpl theTargetPlatformPackage = (TargetPlatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TargetPlatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TargetPlatformPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTargetPlatformPackage.createPackageContents();

		// Initialize created meta-data
		theTargetPlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTargetPlatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TargetPlatformPackage.eNS_URI, theTargetPlatformPackage);
		return theTargetPlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetPlatformIncludeDeclarationEntry() {
		return targetPlatformIncludeDeclarationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatformIncludeDeclarationEntry_Value() {
		return (EReference)targetPlatformIncludeDeclarationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatformIncludeDeclarationEntry_Key() {
		return (EReference)targetPlatformIncludeDeclarationEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetPlatform() {
		return targetPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPlatform_Name() {
		return (EAttribute)targetPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPlatform_CompositeElementsResolved() {
		return (EAttribute)targetPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_PreDefinedVarContainer() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPlatform_InvalidateByEmfXtext() {
		return (EAttribute)targetPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_VarDef2OverrideInImportedTarget() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_Contents() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_ImportedTargetPlatforms() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_Includes() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPlatform_Options() {
		return (EAttribute)targetPlatformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_Locations() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_Environment() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPlatform_VarDefinition() {
		return (EReference)targetPlatformEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetContent() {
		return targetContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetContent_TargetPlatform() {
		return (EReference)targetContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptions() {
		return optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptions_Options() {
		return (EAttribute)optionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Env() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_OperatingSystem() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_WindowingSystem() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Architecture() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_Localization() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironment_ExecutionEnvironment() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDefinition() {
		return varDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition_Name() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarDefinition_Value() {
		return (EReference)varDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition_Constant() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition_OverrideValue() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition_VariableDefinitionCycleDetected() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition_VarDefCycle() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition_Imported() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition_ImportedValues() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition__sourceUUID() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinition_DiamondInherit() {
		return (EAttribute)varDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarDefinition__IsWhollyDefinedByTarget() {
		return varDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarDefinition__IsWhollyDefinedByTargetNoCycleChecked() {
		return varDefinitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarDefinition__CheckVarCycle() {
		return varDefinitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarDefinition__GetEffectiveValue() {
		return varDefinitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarDefinition__GetEffectiveValue__List() {
		return varDefinitionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarDefinition__GetSourceUUID() {
		return varDefinitionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarDefinition__ToString() {
		return varDefinitionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDefinitionContainer() {
		return varDefinitionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinitionContainer_Name() {
		return (EAttribute)varDefinitionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDefinitionContainer_VarDefList() {
		return (EAttribute)varDefinitionContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeString() {
		return compositeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeString_Name() {
		return (EAttribute)compositeStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeString_StringParts() {
		return (EReference)compositeStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeString_VariableDefinitionCycleDetected() {
		return (EAttribute)compositeStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeString_VarDefCycle() {
		return (EAttribute)compositeStringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeString__ComputeActualString() {
		return compositeStringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeString__ComputeActualString__List() {
		return compositeStringEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeString__GetCopy() {
		return compositeStringEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeString__IsResolved() {
		return compositeStringEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeStringPart() {
		return compositeStringPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeStringPart_CompositeString() {
		return (EReference)compositeStringPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeStringPart__GetActualString() {
		return compositeStringPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeStringPart__GetActualString__List() {
		return compositeStringPartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeStringPart__IsVariableDefinitionCycleDetected() {
		return compositeStringPartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeStringPart__GetVarDefCycle() {
		return compositeStringPartEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeStringPart__GetCopy() {
		return compositeStringPartEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeStringPart__IsResolved() {
		return compositeStringPartEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarCall() {
		return varCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarCall_VarName() {
		return (EReference)varCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarCall_OriginalVarName() {
		return (EReference)varCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarCall_VariableDefinitionCycleDetected() {
		return (EAttribute)varCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarCall_VarDefCycle() {
		return (EAttribute)varCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarCall__GetActualString() {
		return varCallEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarCall__GetActualString__List() {
		return varCallEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarCall__GetCopy() {
		return varCallEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVarCall__IsResolved() {
		return varCallEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticString() {
		return staticStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticString_Value() {
		return (EAttribute)staticStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticString_VariableDefinitionCycleDetected() {
		return (EAttribute)staticStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticString_VarDefCycle() {
		return (EAttribute)staticStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaticString__GetActualString() {
		return staticStringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaticString__GetActualString__List() {
		return staticStringEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaticString__GetCopy() {
		return staticStringEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaticString__IsResolved() {
		return staticStringEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_ID() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Uri() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_CompositeUri() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Options() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Ius() {
		return (EReference)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__ResolveUri() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__ResolveIUsVersion() {
		return locationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeDeclaration() {
		return includeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeDeclaration_Name() {
		return (EAttribute)includeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludeDeclaration_CompositeImportURI() {
		return (EReference)includeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeDeclaration_ImportURI() {
		return (EAttribute)includeDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIncludeDeclaration__GenerateImportURI() {
		return includeDeclarationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIncludeDeclaration__IsResolved() {
		return includeDeclarationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIU() {
		return iuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIU_ID() {
		return (EAttribute)iuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIU_Version() {
		return (EAttribute)iuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIU_VarVersion() {
		return (EReference)iuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIU_Location() {
		return (EReference)iuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOption() {
		return optionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUUID() {
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVarDefList() {
		return varDefListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocale() {
		return localeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExecutionEnvironment() {
		return executionEnvironmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformFactory getTargetPlatformFactory() {
		return (TargetPlatformFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		targetPlatformIncludeDeclarationEntryEClass = createEClass(TARGET_PLATFORM_INCLUDE_DECLARATION_ENTRY);
		createEReference(targetPlatformIncludeDeclarationEntryEClass, TARGET_PLATFORM_INCLUDE_DECLARATION_ENTRY__VALUE);
		createEReference(targetPlatformIncludeDeclarationEntryEClass, TARGET_PLATFORM_INCLUDE_DECLARATION_ENTRY__KEY);

		targetPlatformEClass = createEClass(TARGET_PLATFORM);
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__NAME);
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__COMPOSITE_ELEMENTS_RESOLVED);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER);
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__INVALIDATE_BY_EMF_XTEXT);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__VAR_DEF2_OVERRIDE_IN_IMPORTED_TARGET);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__CONTENTS);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__IMPORTED_TARGET_PLATFORMS);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__INCLUDES);
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__OPTIONS);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__LOCATIONS);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__ENVIRONMENT);
		createEReference(targetPlatformEClass, TARGET_PLATFORM__VAR_DEFINITION);

		targetContentEClass = createEClass(TARGET_CONTENT);
		createEReference(targetContentEClass, TARGET_CONTENT__TARGET_PLATFORM);

		optionsEClass = createEClass(OPTIONS);
		createEAttribute(optionsEClass, OPTIONS__OPTIONS);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__ENV);
		createEAttribute(environmentEClass, ENVIRONMENT__OPERATING_SYSTEM);
		createEAttribute(environmentEClass, ENVIRONMENT__WINDOWING_SYSTEM);
		createEAttribute(environmentEClass, ENVIRONMENT__ARCHITECTURE);
		createEAttribute(environmentEClass, ENVIRONMENT__LOCALIZATION);
		createEAttribute(environmentEClass, ENVIRONMENT__EXECUTION_ENVIRONMENT);

		varDefinitionEClass = createEClass(VAR_DEFINITION);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__NAME);
		createEReference(varDefinitionEClass, VAR_DEFINITION__VALUE);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__CONSTANT);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__OVERRIDE_VALUE);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__VARIABLE_DEFINITION_CYCLE_DETECTED);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__VAR_DEF_CYCLE);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__IMPORTED);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__IMPORTED_VALUES);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__SOURCE_UUID);
		createEAttribute(varDefinitionEClass, VAR_DEFINITION__DIAMOND_INHERIT);
		createEOperation(varDefinitionEClass, VAR_DEFINITION___IS_WHOLLY_DEFINED_BY_TARGET);
		createEOperation(varDefinitionEClass, VAR_DEFINITION___IS_WHOLLY_DEFINED_BY_TARGET_NO_CYCLE_CHECKED);
		createEOperation(varDefinitionEClass, VAR_DEFINITION___CHECK_VAR_CYCLE);
		createEOperation(varDefinitionEClass, VAR_DEFINITION___GET_EFFECTIVE_VALUE);
		createEOperation(varDefinitionEClass, VAR_DEFINITION___GET_EFFECTIVE_VALUE__LIST);
		createEOperation(varDefinitionEClass, VAR_DEFINITION___GET_SOURCE_UUID);
		createEOperation(varDefinitionEClass, VAR_DEFINITION___TO_STRING);

		varDefinitionContainerEClass = createEClass(VAR_DEFINITION_CONTAINER);
		createEAttribute(varDefinitionContainerEClass, VAR_DEFINITION_CONTAINER__NAME);
		createEAttribute(varDefinitionContainerEClass, VAR_DEFINITION_CONTAINER__VAR_DEF_LIST);

		compositeStringEClass = createEClass(COMPOSITE_STRING);
		createEAttribute(compositeStringEClass, COMPOSITE_STRING__NAME);
		createEReference(compositeStringEClass, COMPOSITE_STRING__STRING_PARTS);
		createEAttribute(compositeStringEClass, COMPOSITE_STRING__VARIABLE_DEFINITION_CYCLE_DETECTED);
		createEAttribute(compositeStringEClass, COMPOSITE_STRING__VAR_DEF_CYCLE);
		createEOperation(compositeStringEClass, COMPOSITE_STRING___COMPUTE_ACTUAL_STRING);
		createEOperation(compositeStringEClass, COMPOSITE_STRING___COMPUTE_ACTUAL_STRING__LIST);
		createEOperation(compositeStringEClass, COMPOSITE_STRING___GET_COPY);
		createEOperation(compositeStringEClass, COMPOSITE_STRING___IS_RESOLVED);

		compositeStringPartEClass = createEClass(COMPOSITE_STRING_PART);
		createEReference(compositeStringPartEClass, COMPOSITE_STRING_PART__COMPOSITE_STRING);
		createEOperation(compositeStringPartEClass, COMPOSITE_STRING_PART___GET_ACTUAL_STRING);
		createEOperation(compositeStringPartEClass, COMPOSITE_STRING_PART___GET_ACTUAL_STRING__LIST);
		createEOperation(compositeStringPartEClass, COMPOSITE_STRING_PART___IS_VARIABLE_DEFINITION_CYCLE_DETECTED);
		createEOperation(compositeStringPartEClass, COMPOSITE_STRING_PART___GET_VAR_DEF_CYCLE);
		createEOperation(compositeStringPartEClass, COMPOSITE_STRING_PART___GET_COPY);
		createEOperation(compositeStringPartEClass, COMPOSITE_STRING_PART___IS_RESOLVED);

		varCallEClass = createEClass(VAR_CALL);
		createEReference(varCallEClass, VAR_CALL__VAR_NAME);
		createEReference(varCallEClass, VAR_CALL__ORIGINAL_VAR_NAME);
		createEAttribute(varCallEClass, VAR_CALL__VARIABLE_DEFINITION_CYCLE_DETECTED);
		createEAttribute(varCallEClass, VAR_CALL__VAR_DEF_CYCLE);
		createEOperation(varCallEClass, VAR_CALL___GET_ACTUAL_STRING);
		createEOperation(varCallEClass, VAR_CALL___GET_ACTUAL_STRING__LIST);
		createEOperation(varCallEClass, VAR_CALL___GET_COPY);
		createEOperation(varCallEClass, VAR_CALL___IS_RESOLVED);

		staticStringEClass = createEClass(STATIC_STRING);
		createEAttribute(staticStringEClass, STATIC_STRING__VALUE);
		createEAttribute(staticStringEClass, STATIC_STRING__VARIABLE_DEFINITION_CYCLE_DETECTED);
		createEAttribute(staticStringEClass, STATIC_STRING__VAR_DEF_CYCLE);
		createEOperation(staticStringEClass, STATIC_STRING___GET_ACTUAL_STRING);
		createEOperation(staticStringEClass, STATIC_STRING___GET_ACTUAL_STRING__LIST);
		createEOperation(staticStringEClass, STATIC_STRING___GET_COPY);
		createEOperation(staticStringEClass, STATIC_STRING___IS_RESOLVED);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__ID);
		createEAttribute(locationEClass, LOCATION__URI);
		createEReference(locationEClass, LOCATION__COMPOSITE_URI);
		createEAttribute(locationEClass, LOCATION__OPTIONS);
		createEReference(locationEClass, LOCATION__IUS);
		createEOperation(locationEClass, LOCATION___RESOLVE_URI);
		createEOperation(locationEClass, LOCATION___RESOLVE_IUS_VERSION);

		includeDeclarationEClass = createEClass(INCLUDE_DECLARATION);
		createEAttribute(includeDeclarationEClass, INCLUDE_DECLARATION__NAME);
		createEReference(includeDeclarationEClass, INCLUDE_DECLARATION__COMPOSITE_IMPORT_URI);
		createEAttribute(includeDeclarationEClass, INCLUDE_DECLARATION__IMPORT_URI);
		createEOperation(includeDeclarationEClass, INCLUDE_DECLARATION___GENERATE_IMPORT_URI);
		createEOperation(includeDeclarationEClass, INCLUDE_DECLARATION___IS_RESOLVED);

		iuEClass = createEClass(IU);
		createEAttribute(iuEClass, IU__ID);
		createEAttribute(iuEClass, IU__VERSION);
		createEReference(iuEClass, IU__VAR_VERSION);
		createEReference(iuEClass, IU__LOCATION);

		// Create enums
		optionEEnum = createEEnum(OPTION);

		// Create data types
		uuidEDataType = createEDataType(UUID);
		varDefListEDataType = createEDataType(VAR_DEF_LIST);
		localeEDataType = createEDataType(LOCALE);
		executionEnvironmentEDataType = createEDataType(EXECUTION_ENVIRONMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		optionsEClass.getESuperTypes().add(this.getTargetContent());
		environmentEClass.getESuperTypes().add(this.getTargetContent());
		varDefinitionEClass.getESuperTypes().add(this.getTargetContent());
		varCallEClass.getESuperTypes().add(this.getCompositeStringPart());
		staticStringEClass.getESuperTypes().add(this.getCompositeStringPart());
		locationEClass.getESuperTypes().add(this.getTargetContent());
		includeDeclarationEClass.getESuperTypes().add(this.getTargetContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(targetPlatformIncludeDeclarationEntryEClass, Map.Entry.class, "TargetPlatformIncludeDeclarationEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetPlatformIncludeDeclarationEntry_Value(), this.getTargetPlatform(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatformIncludeDeclarationEntry_Key(), this.getIncludeDeclaration(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPlatformEClass, TargetPlatform.class, "TargetPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetPlatform_Name(), theEcorePackage.getEString(), "name", null, 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetPlatform_CompositeElementsResolved(), theEcorePackage.getEBoolean(), "compositeElementsResolved", "false", 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_PreDefinedVarContainer(), this.getVarDefinitionContainer(), null, "preDefinedVarContainer", null, 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetPlatform_InvalidateByEmfXtext(), theEcorePackage.getEBoolean(), "invalidateByEmfXtext", "false", 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_VarDef2OverrideInImportedTarget(), this.getVarDefinition(), null, "varDef2OverrideInImportedTarget", null, 0, -1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_Contents(), this.getTargetContent(), this.getTargetContent_TargetPlatform(), "contents", null, 0, -1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_ImportedTargetPlatforms(), this.getTargetPlatformIncludeDeclarationEntry(), null, "importedTargetPlatforms", null, 0, -1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_Includes(), this.getIncludeDeclaration(), null, "includes", null, 0, -1, TargetPlatform.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetPlatform_Options(), this.getOption(), "options", null, 0, -1, TargetPlatform.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_Locations(), this.getLocation(), null, "locations", null, 0, -1, TargetPlatform.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, TargetPlatform.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatform_VarDefinition(), this.getVarDefinition(), null, "varDefinition", null, 0, -1, TargetPlatform.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(targetContentEClass, TargetContent.class, "TargetContent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetContent_TargetPlatform(), this.getTargetPlatform(), this.getTargetPlatform_Contents(), "targetPlatform", null, 0, 1, TargetContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsEClass, Options.class, "Options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptions_Options(), this.getOption(), "options", null, 0, -1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Env(), theEcorePackage.getEString(), "env", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_OperatingSystem(), theEcorePackage.getEString(), "operatingSystem", null, 0, 1, Environment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_WindowingSystem(), theEcorePackage.getEString(), "windowingSystem", null, 0, 1, Environment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Architecture(), theEcorePackage.getEString(), "architecture", null, 0, 1, Environment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Localization(), this.getLocale(), "localization", null, 0, 1, Environment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_ExecutionEnvironment(), this.getExecutionEnvironment(), "executionEnvironment", null, 0, 1, Environment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(varDefinitionEClass, VarDefinition.class, "VarDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarDefinition_Name(), theEcorePackage.getEString(), "name", null, 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarDefinition_Value(), this.getCompositeString(), null, "value", null, 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinition_Constant(), theEcorePackage.getEBoolean(), "constant", "false", 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinition_OverrideValue(), theEcorePackage.getEString(), "overrideValue", null, 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinition_VariableDefinitionCycleDetected(), theEcorePackage.getEBoolean(), "variableDefinitionCycleDetected", "false", 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinition_VarDefCycle(), this.getVarDefList(), "varDefCycle", null, 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinition_Imported(), theEcorePackage.getEBoolean(), "imported", "false", 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinition_ImportedValues(), theEcorePackage.getEString(), "importedValues", null, 0, -1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinition__sourceUUID(), this.getUUID(), "_sourceUUID", null, 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinition_DiamondInherit(), theEcorePackage.getEBoolean(), "diamondInherit", "false", 0, 1, VarDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVarDefinition__IsWhollyDefinedByTarget(), theEcorePackage.getEBoolean(), "isWhollyDefinedByTarget", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVarDefinition__IsWhollyDefinedByTargetNoCycleChecked(), theEcorePackage.getEBoolean(), "isWhollyDefinedByTargetNoCycleChecked", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVarDefinition__CheckVarCycle(), null, "checkVarCycle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVarDefinition__GetEffectiveValue(), theEcorePackage.getEString(), "getEffectiveValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getVarDefinition__GetEffectiveValue__List(), theEcorePackage.getEString(), "getEffectiveValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVarDefList(), "alreadyCalledVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVarDefinition__GetSourceUUID(), this.getUUID(), "getSourceUUID", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVarDefinition__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(varDefinitionContainerEClass, VarDefinitionContainer.class, "VarDefinitionContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarDefinitionContainer_Name(), theEcorePackage.getEString(), "name", null, 0, 1, VarDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarDefinitionContainer_VarDefList(), this.getVarDefList(), "varDefList", null, 0, 1, VarDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeStringEClass, CompositeString.class, "CompositeString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeString_Name(), theEcorePackage.getEString(), "name", "composite string", 0, 1, CompositeString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeString_StringParts(), this.getCompositeStringPart(), this.getCompositeStringPart_CompositeString(), "stringParts", null, 0, -1, CompositeString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeString_VariableDefinitionCycleDetected(), theEcorePackage.getEBoolean(), "variableDefinitionCycleDetected", "false", 0, 1, CompositeString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeString_VarDefCycle(), this.getVarDefList(), "varDefCycle", null, 0, 1, CompositeString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompositeString__ComputeActualString(), theEcorePackage.getEString(), "computeActualString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompositeString__ComputeActualString__List(), theEcorePackage.getEString(), "computeActualString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVarDefList(), "alreadyCalledVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompositeString__GetCopy(), this.getCompositeString(), "getCopy", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompositeString__IsResolved(), theEcorePackage.getEBoolean(), "isResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(compositeStringPartEClass, CompositeStringPart.class, "CompositeStringPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeStringPart_CompositeString(), this.getCompositeString(), this.getCompositeString_StringParts(), "compositeString", null, 0, 1, CompositeStringPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompositeStringPart__GetActualString(), theEcorePackage.getEString(), "getActualString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompositeStringPart__GetActualString__List(), theEcorePackage.getEString(), "getActualString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVarDefList(), "alreadyCalledVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompositeStringPart__IsVariableDefinitionCycleDetected(), theEcorePackage.getEBoolean(), "isVariableDefinitionCycleDetected", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompositeStringPart__GetVarDefCycle(), this.getVarDefList(), "getVarDefCycle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompositeStringPart__GetCopy(), this.getCompositeStringPart(), "getCopy", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCompositeStringPart__IsResolved(), theEcorePackage.getEBoolean(), "isResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(varCallEClass, VarCall.class, "VarCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarCall_VarName(), this.getVarDefinition(), null, "varName", null, 0, 1, VarCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarCall_OriginalVarName(), this.getVarDefinition(), null, "originalVarName", null, 0, 1, VarCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarCall_VariableDefinitionCycleDetected(), theEcorePackage.getEBoolean(), "variableDefinitionCycleDetected", "false", 0, 1, VarCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarCall_VarDefCycle(), this.getVarDefList(), "varDefCycle", null, 0, 1, VarCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVarCall__GetActualString(), theEcorePackage.getEString(), "getActualString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVarCall__GetActualString__List(), theEcorePackage.getEString(), "getActualString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVarDefList(), "alreadyCalledVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVarCall__GetCopy(), this.getVarCall(), "getCopy", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getVarCall__IsResolved(), theEcorePackage.getEBoolean(), "isResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(staticStringEClass, StaticString.class, "StaticString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticString_Value(), theEcorePackage.getEString(), "value", null, 0, 1, StaticString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticString_VariableDefinitionCycleDetected(), theEcorePackage.getEBoolean(), "variableDefinitionCycleDetected", "false", 0, 1, StaticString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticString_VarDefCycle(), this.getVarDefList(), "varDefCycle", null, 0, 1, StaticString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStaticString__GetActualString(), theEcorePackage.getEString(), "getActualString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStaticString__GetActualString__List(), theEcorePackage.getEString(), "getActualString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVarDefList(), "alreadyCalledVariable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getStaticString__GetCopy(), this.getStaticString(), "getCopy", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getStaticString__IsResolved(), theEcorePackage.getEBoolean(), "isResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_ID(), theEcorePackage.getEString(), "ID", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_CompositeUri(), this.getCompositeString(), null, "compositeUri", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Options(), this.getOption(), "options", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Ius(), this.getIU(), this.getIU_Location(), "ius", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLocation__ResolveUri(), null, "resolveUri", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getLocation__ResolveIUsVersion(), null, "resolveIUsVersion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(includeDeclarationEClass, IncludeDeclaration.class, "IncludeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeDeclaration_Name(), theEcorePackage.getEString(), "name", "include declaration", 0, 1, IncludeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncludeDeclaration_CompositeImportURI(), this.getCompositeString(), null, "compositeImportURI", null, 0, 1, IncludeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeDeclaration_ImportURI(), theEcorePackage.getEString(), "importURI", null, 0, 1, IncludeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIncludeDeclaration__GenerateImportURI(), null, "generateImportURI", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getIncludeDeclaration__IsResolved(), theEcorePackage.getEBoolean(), "isResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(iuEClass, fr.obeo.releng.targetplatform.IU.class, "IU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIU_ID(), theEcorePackage.getEString(), "ID", null, 0, 1, fr.obeo.releng.targetplatform.IU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIU_Version(), theEcorePackage.getEString(), "version", null, 0, 1, fr.obeo.releng.targetplatform.IU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIU_VarVersion(), this.getVarCall(), null, "varVersion", null, 0, 1, fr.obeo.releng.targetplatform.IU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIU_Location(), this.getLocation(), this.getLocation_Ius(), "location", null, 0, 1, fr.obeo.releng.targetplatform.IU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(optionEEnum, Option.class, "Option");
		addEEnumLiteral(optionEEnum, Option.INCLUDE_REQUIRED);
		addEEnumLiteral(optionEEnum, Option.INCLUDE_ALL_ENVIRONMENTS);
		addEEnumLiteral(optionEEnum, Option.INCLUDE_SOURCE);
		addEEnumLiteral(optionEEnum, Option.INCLUDE_CONFIGURE_PHASE);

		// Initialize data types
		initEDataType(uuidEDataType, java.util.UUID.class, "UUID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(varDefListEDataType, List.class, "VarDefList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<fr.obeo.releng.targetplatform.VarDefinition>");
		initEDataType(localeEDataType, Locale.class, "Locale", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(executionEnvironmentEDataType, IExecutionEnvironment.class, "ExecutionEnvironment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TargetPlatformPackageImpl
