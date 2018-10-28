/**
 */
package fr.obeo.releng.targetplatform.impl;

import fr.obeo.releng.targetplatform.*;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.jdt.launching.environments.IExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetPlatformFactoryImpl extends EFactoryImpl implements TargetPlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetPlatformFactory init() {
		try {
			TargetPlatformFactory theTargetPlatformFactory = (TargetPlatformFactory)EPackage.Registry.INSTANCE.getEFactory(TargetPlatformPackage.eNS_URI);
			if (theTargetPlatformFactory != null) {
				return theTargetPlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetPlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TargetPlatformPackage.TARGET_PLATFORM_INCLUDE_DECLARATION_ENTRY: return (EObject)createTargetPlatformIncludeDeclarationEntry();
			case TargetPlatformPackage.TARGET_PLATFORM: return createTargetPlatform();
			case TargetPlatformPackage.OPTIONS: return createOptions();
			case TargetPlatformPackage.ENVIRONMENT: return createEnvironment();
			case TargetPlatformPackage.VAR_DEFINITION: return createVarDefinition();
			case TargetPlatformPackage.VAR_DEFINITION_CONTAINER: return createVarDefinitionContainer();
			case TargetPlatformPackage.COMPOSITE_STRING: return createCompositeString();
			case TargetPlatformPackage.VAR_CALL: return createVarCall();
			case TargetPlatformPackage.STATIC_STRING: return createStaticString();
			case TargetPlatformPackage.LOCATION: return createLocation();
			case TargetPlatformPackage.INCLUDE_DECLARATION: return createIncludeDeclaration();
			case TargetPlatformPackage.IU: return createIU();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TargetPlatformPackage.OPTION:
				return createOptionFromString(eDataType, initialValue);
			case TargetPlatformPackage.UUID:
				return createUUIDFromString(eDataType, initialValue);
			case TargetPlatformPackage.VAR_DEF_LIST:
				return createVarDefListFromString(eDataType, initialValue);
			case TargetPlatformPackage.LOCALE:
				return createLocaleFromString(eDataType, initialValue);
			case TargetPlatformPackage.EXECUTION_ENVIRONMENT:
				return createExecutionEnvironmentFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TargetPlatformPackage.OPTION:
				return convertOptionToString(eDataType, instanceValue);
			case TargetPlatformPackage.UUID:
				return convertUUIDToString(eDataType, instanceValue);
			case TargetPlatformPackage.VAR_DEF_LIST:
				return convertVarDefListToString(eDataType, instanceValue);
			case TargetPlatformPackage.LOCALE:
				return convertLocaleToString(eDataType, instanceValue);
			case TargetPlatformPackage.EXECUTION_ENVIRONMENT:
				return convertExecutionEnvironmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<IncludeDeclaration, TargetPlatform> createTargetPlatformIncludeDeclarationEntry() {
		TargetPlatformIncludeDeclarationEntryImpl targetPlatformIncludeDeclarationEntry = new TargetPlatformIncludeDeclarationEntryImpl();
		return targetPlatformIncludeDeclarationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatform createTargetPlatform() {
		TargetPlatformImpl targetPlatform = new TargetPlatformImpl();
		return targetPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options createOptions() {
		OptionsImpl options = new OptionsImpl();
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDefinition createVarDefinition() {
		VarDefinitionImpl varDefinition = new VarDefinitionImpl();
		return varDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDefinitionContainer createVarDefinitionContainer() {
		VarDefinitionContainerImpl varDefinitionContainer = new VarDefinitionContainerImpl();
		return varDefinitionContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeString createCompositeString() {
		CompositeStringImpl compositeString = new CompositeStringImpl();
		return compositeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarCall createVarCall() {
		VarCallImpl varCall = new VarCallImpl();
		return varCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticString createStaticString() {
		StaticStringImpl staticString = new StaticStringImpl();
		return staticString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeDeclaration createIncludeDeclaration() {
		IncludeDeclarationImpl includeDeclaration = new IncludeDeclarationImpl();
		return includeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IU createIU() {
		IUImpl iu = new IUImpl();
		return iu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOptionFromString(EDataType eDataType, String initialValue) {
		Option result = Option.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UUID createUUIDFromString(EDataType eDataType, String initialValue) {
		return (UUID)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUUIDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<VarDefinition> createVarDefListFromString(EDataType eDataType, String initialValue) {
		return (List<VarDefinition>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVarDefListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale createLocaleFromString(EDataType eDataType, String initialValue) {
		return (Locale)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocaleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExecutionEnvironment createExecutionEnvironmentFromString(EDataType eDataType, String initialValue) {
		return (IExecutionEnvironment)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionEnvironmentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformPackage getTargetPlatformPackage() {
		return (TargetPlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetPlatformPackage getPackage() {
		return TargetPlatformPackage.eINSTANCE;
	}

} //TargetPlatformFactoryImpl
