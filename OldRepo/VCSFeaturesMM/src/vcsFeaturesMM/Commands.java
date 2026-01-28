/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.Commands#getMergeStrategy <em>Merge Strategy</em>}</li>
 *   <li>{@link vcsFeaturesMM.Commands#getHighlevelcommand <em>Highlevelcommand</em>}</li>
 *   <li>{@link vcsFeaturesMM.Commands#getLowlevelcommand <em>Lowlevelcommand</em>}</li>
 * </ul>
 *
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getCommands()
 * @model
 * @generated
 */
public interface Commands extends EObject {
	/**
	 * Returns the value of the '<em><b>Merge Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link vcsFeaturesMM.MergeStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Strategy</em>' attribute.
	 * @see vcsFeaturesMM.MergeStrategy
	 * @see #setMergeStrategy(MergeStrategy)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getCommands_MergeStrategy()
	 * @model
	 * @generated
	 */
	MergeStrategy getMergeStrategy();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.Commands#getMergeStrategy <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Strategy</em>' attribute.
	 * @see vcsFeaturesMM.MergeStrategy
	 * @see #getMergeStrategy()
	 * @generated
	 */
	void setMergeStrategy(MergeStrategy value);

	/**
	 * Returns the value of the '<em><b>Highlevelcommand</b></em>' containment reference list.
	 * The list contents are of type {@link vcsFeaturesMM.HighLevelCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlevelcommand</em>' containment reference list.
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getCommands_Highlevelcommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<HighLevelCommand> getHighlevelcommand();

	/**
	 * Returns the value of the '<em><b>Lowlevelcommand</b></em>' containment reference list.
	 * The list contents are of type {@link vcsFeaturesMM.LowLevelCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowlevelcommand</em>' containment reference list.
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getCommands_Lowlevelcommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<LowLevelCommand> getLowlevelcommand();

} // Commands
