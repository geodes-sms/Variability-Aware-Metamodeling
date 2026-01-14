/**
 */
package eCommercePMM.impl;

import eCommercePMM.ECommercePMMPackage;
import eCommercePMM.PaymentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.impl.PaymentTypeImpl#getBillID <em>Bill ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PaymentTypeImpl extends EObjectImpl implements PaymentType {
	/**
	 * The default value of the '{@link #getBillID() <em>Bill ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillID()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillID() <em>Bill ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillID()
	 * @generated
	 * @ordered
	 */
	protected String billID = BILL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECommercePMMPackage.Literals.PAYMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillID() {
		return billID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillID(String newBillID) {
		String oldBillID = billID;
		billID = newBillID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.PAYMENT_TYPE__BILL_ID, oldBillID, billID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ECommercePMMPackage.PAYMENT_TYPE__BILL_ID:
				return getBillID();
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
			case ECommercePMMPackage.PAYMENT_TYPE__BILL_ID:
				setBillID((String)newValue);
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
			case ECommercePMMPackage.PAYMENT_TYPE__BILL_ID:
				setBillID(BILL_ID_EDEFAULT);
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
			case ECommercePMMPackage.PAYMENT_TYPE__BILL_ID:
				return BILL_ID_EDEFAULT == null ? billID != null : !BILL_ID_EDEFAULT.equals(billID);
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
		result.append(" (billID: ");
		result.append(billID);
		result.append(')');
		return result.toString();
	}

} //PaymentTypeImpl
