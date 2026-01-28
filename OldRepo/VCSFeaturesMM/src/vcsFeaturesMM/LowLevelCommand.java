/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Low Level Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.LowLevelCommand#getName <em>Name</em>}</li>
 *   <li>{@link vcsFeaturesMM.LowLevelCommand#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getLowLevelCommand()
 * @model
 * @generated
 */
public interface LowLevelCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getLowLevelCommand_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.LowLevelCommand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * The literals are from the enumeration {@link vcsFeaturesMM.LowCommands}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see vcsFeaturesMM.LowCommands
	 * @see #setCommand(LowCommands)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getLowLevelCommand_Command()
	 * @model required="true"
	 * @generated
	 */
	LowCommands getCommand();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.LowLevelCommand#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see vcsFeaturesMM.LowCommands
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(LowCommands value);

} // LowLevelCommand
