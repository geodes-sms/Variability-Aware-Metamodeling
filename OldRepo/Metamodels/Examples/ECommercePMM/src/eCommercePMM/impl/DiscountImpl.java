/**
 */
package eCommercePMM.impl;

import eCommercePMM.Discount;
import eCommercePMM.ECommercePMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.impl.DiscountImpl#getDiscountID <em>Discount ID</em>}</li>
 *   <li>{@link eCommercePMM.impl.DiscountImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscountImpl extends EObjectImpl implements Discount {
	/**
	 * The default value of the '{@link #getDiscountID() <em>Discount ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountID()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscountID() <em>Discount ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountID()
	 * @generated
	 * @ordered
	 */
	protected String discountID = DISCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECommercePMMPackage.Literals.DISCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscountID() {
		return discountID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscountID(String newDiscountID) {
		String oldDiscountID = discountID;
		discountID = newDiscountID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.DISCOUNT__DISCOUNT_ID, oldDiscountID, discountID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.DISCOUNT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ECommercePMMPackage.DISCOUNT__DISCOUNT_ID:
				return getDiscountID();
			case ECommercePMMPackage.DISCOUNT__AMOUNT:
				return getAmount();
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
			case ECommercePMMPackage.DISCOUNT__DISCOUNT_ID:
				setDiscountID((String)newValue);
				return;
			case ECommercePMMPackage.DISCOUNT__AMOUNT:
				setAmount((Double)newValue);
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
			case ECommercePMMPackage.DISCOUNT__DISCOUNT_ID:
				setDiscountID(DISCOUNT_ID_EDEFAULT);
				return;
			case ECommercePMMPackage.DISCOUNT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
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
			case ECommercePMMPackage.DISCOUNT__DISCOUNT_ID:
				return DISCOUNT_ID_EDEFAULT == null ? discountID != null : !DISCOUNT_ID_EDEFAULT.equals(discountID);
			case ECommercePMMPackage.DISCOUNT__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
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
		result.append(" (discountID: ");
		result.append(discountID);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //DiscountImpl
