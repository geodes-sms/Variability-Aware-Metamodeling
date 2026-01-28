/**
 */
package vcsFeaturesMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import vcsFeaturesMM.VcsFeaturesMMPackage;
import vcsFeaturesMM.VersionUnit;
import vcsFeaturesMM.VersionUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.impl.VersionUnitImpl#getGranularity <em>Granularity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionUnitImpl extends EObjectImpl implements VersionUnit {
	/**
	 * The cached value of the '{@link #getGranularity() <em>Granularity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularity()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionUnitType> granularity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcsFeaturesMMPackage.Literals.VERSION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VersionUnitType> getGranularity() {
		if (granularity == null) {
			granularity = new EDataTypeUniqueEList<VersionUnitType>(VersionUnitType.class, this, VcsFeaturesMMPackage.VERSION_UNIT__GRANULARITY);
		}
		return granularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcsFeaturesMMPackage.VERSION_UNIT__GRANULARITY:
				return getGranularity();
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
			case VcsFeaturesMMPackage.VERSION_UNIT__GRANULARITY:
				getGranularity().clear();
				getGranularity().addAll((Collection<? extends VersionUnitType>)newValue);
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
			case VcsFeaturesMMPackage.VERSION_UNIT__GRANULARITY:
				getGranularity().clear();
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
			case VcsFeaturesMMPackage.VERSION_UNIT__GRANULARITY:
				return granularity != null && !granularity.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (granularity: ");
		result.append(granularity);
		result.append(')');
		return result.toString();
	}

} //VersionUnitImpl
