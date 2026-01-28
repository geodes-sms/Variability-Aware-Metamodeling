/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.VersionUnit#getGranularity <em>Granularity</em>}</li>
 * </ul>
 *
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVersionUnit()
 * @model
 * @generated
 */
public interface VersionUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Granularity</b></em>' attribute list.
	 * The list contents are of type {@link vcsFeaturesMM.VersionUnitType}.
	 * The literals are from the enumeration {@link vcsFeaturesMM.VersionUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granularity</em>' attribute list.
	 * @see vcsFeaturesMM.VersionUnitType
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVersionUnit_Granularity()
	 * @model
	 * @generated
	 */
	EList<VersionUnitType> getGranularity();

} // VersionUnit
