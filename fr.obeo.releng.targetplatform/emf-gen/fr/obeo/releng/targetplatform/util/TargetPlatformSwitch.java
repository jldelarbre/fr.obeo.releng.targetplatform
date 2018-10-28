/**
 */
package fr.obeo.releng.targetplatform.util;

import fr.obeo.releng.targetplatform.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.releng.targetplatform.TargetPlatformPackage
 * @generated
 */
public class TargetPlatformSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetPlatformPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformSwitch() {
		if (modelPackage == null) {
			modelPackage = TargetPlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TargetPlatformPackage.TARGET_PLATFORM_INCLUDE_DECLARATION_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<IncludeDeclaration, TargetPlatform> targetPlatformIncludeDeclarationEntry = (Map.Entry<IncludeDeclaration, TargetPlatform>)theEObject;
				T result = caseTargetPlatformIncludeDeclarationEntry(targetPlatformIncludeDeclarationEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.TARGET_PLATFORM: {
				TargetPlatform targetPlatform = (TargetPlatform)theEObject;
				T result = caseTargetPlatform(targetPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.TARGET_CONTENT: {
				TargetContent targetContent = (TargetContent)theEObject;
				T result = caseTargetContent(targetContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.OPTIONS: {
				Options options = (Options)theEObject;
				T result = caseOptions(options);
				if (result == null) result = caseTargetContent(options);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = caseTargetContent(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.VAR_DEFINITION: {
				VarDefinition varDefinition = (VarDefinition)theEObject;
				T result = caseVarDefinition(varDefinition);
				if (result == null) result = caseTargetContent(varDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.VAR_DEFINITION_CONTAINER: {
				VarDefinitionContainer varDefinitionContainer = (VarDefinitionContainer)theEObject;
				T result = caseVarDefinitionContainer(varDefinitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.COMPOSITE_STRING: {
				CompositeString compositeString = (CompositeString)theEObject;
				T result = caseCompositeString(compositeString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.COMPOSITE_STRING_PART: {
				CompositeStringPart compositeStringPart = (CompositeStringPart)theEObject;
				T result = caseCompositeStringPart(compositeStringPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.VAR_CALL: {
				VarCall varCall = (VarCall)theEObject;
				T result = caseVarCall(varCall);
				if (result == null) result = caseCompositeStringPart(varCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.STATIC_STRING: {
				StaticString staticString = (StaticString)theEObject;
				T result = caseStaticString(staticString);
				if (result == null) result = caseCompositeStringPart(staticString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseTargetContent(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.INCLUDE_DECLARATION: {
				IncludeDeclaration includeDeclaration = (IncludeDeclaration)theEObject;
				T result = caseIncludeDeclaration(includeDeclaration);
				if (result == null) result = caseTargetContent(includeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetPlatformPackage.IU: {
				IU iu = (IU)theEObject;
				T result = caseIU(iu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Declaration Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Declaration Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPlatformIncludeDeclarationEntry(Map.Entry<IncludeDeclaration, TargetPlatform> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPlatform(TargetPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetContent(TargetContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptions(Options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDefinition(VarDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDefinitionContainer(VarDefinitionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeString(CompositeString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite String Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite String Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeStringPart(CompositeStringPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarCall(VarCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticString(StaticString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeDeclaration(IncludeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIU(IU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TargetPlatformSwitch
