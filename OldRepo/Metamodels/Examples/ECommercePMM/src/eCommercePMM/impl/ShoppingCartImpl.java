/**
 */
package eCommercePMM.impl;

import eCommercePMM.Discount;
import eCommercePMM.ECommercePMMPackage;
import eCommercePMM.PaymentType;
import eCommercePMM.ShoppingCart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping Cart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.impl.ShoppingCartImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link eCommercePMM.impl.ShoppingCartImpl#getPaymenttype <em>Paymenttype</em>}</li>
 *   <li>{@link eCommercePMM.impl.ShoppingCartImpl#getCartID <em>Cart ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingCartImpl extends EObjectImpl implements ShoppingCart {
	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected Discount discount;

	/**
	 * The cached value of the '{@link #getPaymenttype() <em>Paymenttype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymenttype()
	 * @generated
	 * @ordered
	 */
	protected PaymentType paymenttype;

	/**
	 * The default value of the '{@link #getCartID() <em>Cart ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartID()
	 * @generated
	 * @ordered
	 */
	protected static final String CART_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCartID() <em>Cart ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartID()
	 * @generated
	 * @ordered
	 */
	protected String cartID = CART_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingCartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECommercePMMPackage.Literals.SHOPPING_CART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discount getDiscount() {
		if (discount != null && discount.eIsProxy()) {
			InternalEObject oldDiscount = (InternalEObject)discount;
			discount = (Discount)eResolveProxy(oldDiscount);
			if (discount != oldDiscount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ECommercePMMPackage.SHOPPING_CART__DISCOUNT, oldDiscount, discount));
			}
		}
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discount basicGetDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscount(Discount newDiscount) {
		Discount oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.SHOPPING_CART__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentType getPaymenttype() {
		if (paymenttype != null && paymenttype.eIsProxy()) {
			InternalEObject oldPaymenttype = (InternalEObject)paymenttype;
			paymenttype = (PaymentType)eResolveProxy(oldPaymenttype);
			if (paymenttype != oldPaymenttype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ECommercePMMPackage.SHOPPING_CART__PAYMENTTYPE, oldPaymenttype, paymenttype));
			}
		}
		return paymenttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType basicGetPaymenttype() {
		return paymenttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymenttype(PaymentType newPaymenttype) {
		PaymentType oldPaymenttype = paymenttype;
		paymenttype = newPaymenttype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.SHOPPING_CART__PAYMENTTYPE, oldPaymenttype, paymenttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCartID() {
		return cartID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartID(String newCartID) {
		String oldCartID = cartID;
		cartID = newCartID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.SHOPPING_CART__CART_ID, oldCartID, cartID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ECommercePMMPackage.SHOPPING_CART__DISCOUNT:
				if (resolve) return getDiscount();
				return basicGetDiscount();
			case ECommercePMMPackage.SHOPPING_CART__PAYMENTTYPE:
				if (resolve) return getPaymenttype();
				return basicGetPaymenttype();
			case ECommercePMMPackage.SHOPPING_CART__CART_ID:
				return getCartID();
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
			case ECommercePMMPackage.SHOPPING_CART__DISCOUNT:
				setDiscount((Discount)newValue);
				return;
			case ECommercePMMPackage.SHOPPING_CART__PAYMENTTYPE:
				setPaymenttype((PaymentType)newValue);
				return;
			case ECommercePMMPackage.SHOPPING_CART__CART_ID:
				setCartID((String)newValue);
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
			case ECommercePMMPackage.SHOPPING_CART__DISCOUNT:
				setDiscount((Discount)null);
				return;
			case ECommercePMMPackage.SHOPPING_CART__PAYMENTTYPE:
				setPaymenttype((PaymentType)null);
				return;
			case ECommercePMMPackage.SHOPPING_CART__CART_ID:
				setCartID(CART_ID_EDEFAULT);
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
			case ECommercePMMPackage.SHOPPING_CART__DISCOUNT:
				return discount != null;
			case ECommercePMMPackage.SHOPPING_CART__PAYMENTTYPE:
				return paymenttype != null;
			case ECommercePMMPackage.SHOPPING_CART__CART_ID:
				return CART_ID_EDEFAULT == null ? cartID != null : !CART_ID_EDEFAULT.equals(cartID);
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
		result.append(" (cartID: ");
		result.append(cartID);
		result.append(')');
		return result.toString();
	}

} //ShoppingCartImpl
