/**
 */
package vcsFeaturesMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.VcsFeaturesMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>High Level Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.impl.HighLevelCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.HighLevelCommandImpl#getLowlevelcommand <em>Lowlevelcommand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HighLevelCommandImpl extends EObjectImpl implements HighLevelCommand {
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
	 * The cached value of the '{@link #getLowlevelcommand() <em>Lowlevelcommand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowlevelcommand()
	 * @generated
	 * @ordered
	 */
	protected EList<LowLevelCommand> lowlevelcommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighLevelCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcsFeaturesMMPackage.Literals.HIGH_LEVEL_COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LowLevelCommand> getLowlevelcommand() {
		if (lowlevelcommand == null) {
			lowlevelcommand = new EObjectResolvingEList<LowLevelCommand>(LowLevelCommand.class, this, VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__LOWLEVELCOMMAND);
		}
		return lowlevelcommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__NAME:
				return getName();
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__LOWLEVELCOMMAND:
				return getLowlevelcommand();
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
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__NAME:
				setName((String)newValue);
				return;
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__LOWLEVELCOMMAND:
				getLowlevelcommand().clear();
				getLowlevelcommand().addAll((Collection<? extends LowLevelCommand>)newValue);
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
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__LOWLEVELCOMMAND:
				getLowlevelcommand().clear();
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
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND__LOWLEVELCOMMAND:
				return lowlevelcommand != null && !lowlevelcommand.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //HighLevelCommandImpl
