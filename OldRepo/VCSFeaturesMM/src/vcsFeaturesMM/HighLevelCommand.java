/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>High Level Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.HighLevelCommand#getName <em>Name</em>}</li>
 *   <li>{@link vcsFeaturesMM.HighLevelCommand#getLowlevelcommand <em>Lowlevelcommand</em>}</li>
 * </ul>
 *
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getHighLevelCommand()
 * @model
 * @generated
 */
public interface HighLevelCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getHighLevelCommand_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.HighLevelCommand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lowlevelcommand</b></em>' reference list.
	 * The list contents are of type {@link vcsFeaturesMM.LowLevelCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowlevelcommand</em>' reference list.
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getHighLevelCommand_Lowlevelcommand()
	 * @model
	 * @generated
	 */
	EList<LowLevelCommand> getLowlevelcommand();

} // HighLevelCommand
