/**
 */
package vcsFeaturesMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import vcsFeaturesMM.LowCommands;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.VcsFeaturesMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Low Level Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.impl.LowLevelCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.LowLevelCommandImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LowLevelCommandImpl extends EObjectImpl implements LowLevelCommand {
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
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final LowCommands COMMAND_EDEFAULT = LowCommands.ADD;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected LowCommands command = COMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowLevelCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcsFeaturesMMPackage.Literals.LOW_LEVEL_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowCommands getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(LowCommands newCommand) {
		LowCommands oldCommand = command;
		command = newCommand == null ? COMMAND_EDEFAULT : newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__NAME:
				return getName();
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__COMMAND:
				return getCommand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__NAME:
				setName((String)newValue);
				return;
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__COMMAND:
				setCommand((LowCommands)newValue);
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
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__COMMAND:
				setCommand(COMMAND_EDEFAULT);
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
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND__COMMAND:
				return command != COMMAND_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //LowLevelCommandImpl
