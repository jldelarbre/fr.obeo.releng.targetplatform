/**
 */
package fr.obeo.releng.targetplatform.impl;

import com.google.common.collect.Iterables;

import fr.obeo.releng.targetplatform.Environment;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.Option;
import fr.obeo.releng.targetplatform.Options;
import fr.obeo.releng.targetplatform.TargetContent;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformPackage;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.VarDefinitionContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#isCompositeElementsResolved <em>Composite Elements Resolved</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#isModified <em>Modified</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getPreDefinedVarContainer <em>Pre Defined Var Container</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getVarDef2OverrideInImportedTarget <em>Var Def2 Override In Imported Target</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.TargetPlatformImpl#getVarDefinition <em>Var Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetPlatformImpl extends MinimalEObjectImpl.Container implements TargetPlatform {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isCompositeElementsResolved() <em>Composite Elements Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompositeElementsResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPOSITE_ELEMENTS_RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompositeElementsResolved() <em>Composite Elements Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompositeElementsResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean compositeElementsResolved = COMPOSITE_ELEMENTS_RESOLVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModified()
	 * @generated
	 * @ordered
	 */
	protected boolean modified = MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreDefinedVarContainer() <em>Pre Defined Var Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDefinedVarContainer()
	 * @generated
	 * @ordered
	 */
	protected VarDefinitionContainer preDefinedVarContainer;

	/**
	 * The cached value of the '{@link #getVarDef2OverrideInImportedTarget() <em>Var Def2 Override In Imported Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarDef2OverrideInImportedTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<VarDefinition> varDef2OverrideInImportedTarget;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetContent> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetPlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPlatformPackage.Literals.TARGET_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.TARGET_PLATFORM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompositeElementsResolved() {
		return compositeElementsResolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeElementsResolved(boolean newCompositeElementsResolved) {
		boolean oldCompositeElementsResolved = compositeElementsResolved;
		compositeElementsResolved = newCompositeElementsResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.TARGET_PLATFORM__COMPOSITE_ELEMENTS_RESOLVED, oldCompositeElementsResolved, compositeElementsResolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(boolean newModified) {
		boolean oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.TARGET_PLATFORM__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDefinitionContainer getPreDefinedVarContainer() {
		return preDefinedVarContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreDefinedVarContainer(VarDefinitionContainer newPreDefinedVarContainer, NotificationChain msgs) {
		VarDefinitionContainer oldPreDefinedVarContainer = preDefinedVarContainer;
		preDefinedVarContainer = newPreDefinedVarContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER, oldPreDefinedVarContainer, newPreDefinedVarContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreDefinedVarContainer(VarDefinitionContainer newPreDefinedVarContainer) {
		if (newPreDefinedVarContainer != preDefinedVarContainer) {
			NotificationChain msgs = null;
			if (preDefinedVarContainer != null)
				msgs = ((InternalEObject)preDefinedVarContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER, null, msgs);
			if (newPreDefinedVarContainer != null)
				msgs = ((InternalEObject)newPreDefinedVarContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER, null, msgs);
			msgs = basicSetPreDefinedVarContainer(newPreDefinedVarContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER, newPreDefinedVarContainer, newPreDefinedVarContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarDefinition> getVarDef2OverrideInImportedTarget() {
		if (varDef2OverrideInImportedTarget == null) {
			varDef2OverrideInImportedTarget = new EObjectContainmentEList<VarDefinition>(VarDefinition.class, this, TargetPlatformPackage.TARGET_PLATFORM__VAR_DEF2_OVERRIDE_IN_IMPORTED_TARGET);
		}
		return varDef2OverrideInImportedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentWithInverseEList<TargetContent>(TargetContent.class, this, TargetPlatformPackage.TARGET_PLATFORM__CONTENTS, TargetPlatformPackage.TARGET_CONTENT__TARGET_PLATFORM);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeDeclaration> getIncludes() {
		List<IncludeDeclaration> _list = IterableExtensions.<IncludeDeclaration>toList(Iterables.<IncludeDeclaration>filter(this.getContents(), IncludeDeclaration.class));
		return new UnmodifiableEList<IncludeDeclaration>(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		final Function1<Options, EList<Option>> _function = new Function1<Options, EList<Option>>() {
			public EList<Option> apply(final Options it) {
				return it.getOptions();
			}
		};
		List<Option> _list = IterableExtensions.<Option>toList(Iterables.<Option>concat(IterableExtensions.<Options, EList<Option>>map(Iterables.<Options>filter(this.getContents(), Options.class), _function)));
		return new UnmodifiableEList<Option>(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		List<Location> _list = IterableExtensions.<Location>toList(Iterables.<Location>filter(this.getContents(), Location.class));
		return new UnmodifiableEList<Location>(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		Environment environment = basicGetEnvironment();
		return environment != null && environment.eIsProxy() ? (Environment)eResolveProxy((InternalEObject)environment) : environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnvironment() {
		return IterableExtensions.<Environment>head(Iterables.<Environment>filter(this.getContents(), Environment.class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarDefinition> getVarDefinition() {
		List<VarDefinition> _list = IterableExtensions.<VarDefinition>toList(Iterables.<VarDefinition>filter(this.getContents(), VarDefinition.class));
		return new UnmodifiableEList<VarDefinition>(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPlatformPackage.TARGET_PLATFORM__CONTENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER:
				return basicSetPreDefinedVarContainer(null, msgs);
			case TargetPlatformPackage.TARGET_PLATFORM__VAR_DEF2_OVERRIDE_IN_IMPORTED_TARGET:
				return ((InternalEList<?>)getVarDef2OverrideInImportedTarget()).basicRemove(otherEnd, msgs);
			case TargetPlatformPackage.TARGET_PLATFORM__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetPlatformPackage.TARGET_PLATFORM__NAME:
				return getName();
			case TargetPlatformPackage.TARGET_PLATFORM__COMPOSITE_ELEMENTS_RESOLVED:
				return isCompositeElementsResolved();
			case TargetPlatformPackage.TARGET_PLATFORM__MODIFIED:
				return isModified();
			case TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER:
				return getPreDefinedVarContainer();
			case TargetPlatformPackage.TARGET_PLATFORM__VAR_DEF2_OVERRIDE_IN_IMPORTED_TARGET:
				return getVarDef2OverrideInImportedTarget();
			case TargetPlatformPackage.TARGET_PLATFORM__CONTENTS:
				return getContents();
			case TargetPlatformPackage.TARGET_PLATFORM__INCLUDES:
				return getIncludes();
			case TargetPlatformPackage.TARGET_PLATFORM__OPTIONS:
				return getOptions();
			case TargetPlatformPackage.TARGET_PLATFORM__LOCATIONS:
				return getLocations();
			case TargetPlatformPackage.TARGET_PLATFORM__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case TargetPlatformPackage.TARGET_PLATFORM__VAR_DEFINITION:
				return getVarDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TargetPlatformPackage.TARGET_PLATFORM__NAME:
				setName((String)newValue);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__COMPOSITE_ELEMENTS_RESOLVED:
				setCompositeElementsResolved((Boolean)newValue);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__MODIFIED:
				setModified((Boolean)newValue);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER:
				setPreDefinedVarContainer((VarDefinitionContainer)newValue);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__VAR_DEF2_OVERRIDE_IN_IMPORTED_TARGET:
				getVarDef2OverrideInImportedTarget().clear();
				getVarDef2OverrideInImportedTarget().addAll((Collection<? extends VarDefinition>)newValue);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends TargetContent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TargetPlatformPackage.TARGET_PLATFORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__COMPOSITE_ELEMENTS_RESOLVED:
				setCompositeElementsResolved(COMPOSITE_ELEMENTS_RESOLVED_EDEFAULT);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER:
				setPreDefinedVarContainer((VarDefinitionContainer)null);
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__VAR_DEF2_OVERRIDE_IN_IMPORTED_TARGET:
				getVarDef2OverrideInImportedTarget().clear();
				return;
			case TargetPlatformPackage.TARGET_PLATFORM__CONTENTS:
				getContents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TargetPlatformPackage.TARGET_PLATFORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPlatformPackage.TARGET_PLATFORM__COMPOSITE_ELEMENTS_RESOLVED:
				return compositeElementsResolved != COMPOSITE_ELEMENTS_RESOLVED_EDEFAULT;
			case TargetPlatformPackage.TARGET_PLATFORM__MODIFIED:
				return modified != MODIFIED_EDEFAULT;
			case TargetPlatformPackage.TARGET_PLATFORM__PRE_DEFINED_VAR_CONTAINER:
				return preDefinedVarContainer != null;
			case TargetPlatformPackage.TARGET_PLATFORM__VAR_DEF2_OVERRIDE_IN_IMPORTED_TARGET:
				return varDef2OverrideInImportedTarget != null && !varDef2OverrideInImportedTarget.isEmpty();
			case TargetPlatformPackage.TARGET_PLATFORM__CONTENTS:
				return contents != null && !contents.isEmpty();
			case TargetPlatformPackage.TARGET_PLATFORM__INCLUDES:
				return !getIncludes().isEmpty();
			case TargetPlatformPackage.TARGET_PLATFORM__OPTIONS:
				return !getOptions().isEmpty();
			case TargetPlatformPackage.TARGET_PLATFORM__LOCATIONS:
				return !getLocations().isEmpty();
			case TargetPlatformPackage.TARGET_PLATFORM__ENVIRONMENT:
				return basicGetEnvironment() != null;
			case TargetPlatformPackage.TARGET_PLATFORM__VAR_DEFINITION:
				return !getVarDefinition().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", compositeElementsResolved: ");
		result.append(compositeElementsResolved);
		result.append(", modified: ");
		result.append(modified);
		result.append(')');
		return result.toString();
	}

} //TargetPlatformImpl
