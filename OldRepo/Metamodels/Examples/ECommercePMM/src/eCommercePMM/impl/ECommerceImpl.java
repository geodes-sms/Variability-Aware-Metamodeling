/**
 */
package eCommercePMM.impl;

import eCommercePMM.ECommerce;
import eCommercePMM.ECommercePMMPackage;
import eCommercePMM.ItemCatalog;
import eCommercePMM.PaymentType;
import eCommercePMM.ShoppingCart;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECommerce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.impl.ECommerceImpl#getProductcatalog <em>Productcatalog</em>}</li>
 *   <li>{@link eCommercePMM.impl.ECommerceImpl#getShoppingcart <em>Shoppingcart</em>}</li>
 *   <li>{@link eCommercePMM.impl.ECommerceImpl#getPaymenttype <em>Paymenttype</em>}</li>
 *   <li>{@link eCommercePMM.impl.ECommerceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECommerceImpl extends EObjectImpl implements ECommerce {
	/**
	 * The cached value of the '{@link #getProductcatalog() <em>Productcatalog</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductcatalog()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemCatalog> productcatalog;

	/**
	 * The cached value of the '{@link #getShoppingcart() <em>Shoppingcart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingcart()
	 * @generated
	 * @ordered
	 */
	protected EList<ShoppingCart> shoppingcart;

	/**
	 * The cached value of the '{@link #getPaymenttype() <em>Paymenttype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymenttype()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentType> paymenttype;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Super web store";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECommerceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECommercePMMPackage.Literals.ECOMMERCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemCatalog> getProductcatalog() {
		if (productcatalog == null) {
			productcatalog = new EObjectContainmentEList<ItemCatalog>(ItemCatalog.class, this, ECommercePMMPackage.ECOMMERCE__PRODUCTCATALOG);
		}
		return productcatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ShoppingCart> getShoppingcart() {
		if (shoppingcart == null) {
			shoppingcart = new EObjectContainmentEList<ShoppingCart>(ShoppingCart.class, this, ECommercePMMPackage.ECOMMERCE__SHOPPINGCART);
		}
		return shoppingcart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PaymentType> getPaymenttype() {
		if (paymenttype == null) {
			paymenttype = new EObjectContainmentEList<PaymentType>(PaymentType.class, this, ECommercePMMPackage.ECOMMERCE__PAYMENTTYPE);
		}
		return paymenttype;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ECommercePMMPackage.ECOMMERCE__PRODUCTCATALOG:
				return ((InternalEList<?>)getProductcatalog()).basicRemove(otherEnd, msgs);
			case ECommercePMMPackage.ECOMMERCE__SHOPPINGCART:
				return ((InternalEList<?>)getShoppingcart()).basicRemove(otherEnd, msgs);
			case ECommercePMMPackage.ECOMMERCE__PAYMENTTYPE:
				return ((InternalEList<?>)getPaymenttype()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ECommercePMMPackage.ECOMMERCE__PRODUCTCATALOG:
				return getProductcatalog();
			case ECommercePMMPackage.ECOMMERCE__SHOPPINGCART:
				return getShoppingcart();
			case ECommercePMMPackage.ECOMMERCE__PAYMENTTYPE:
				return getPaymenttype();
			case ECommercePMMPackage.ECOMMERCE__NAME:
				return getName();
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
			case ECommercePMMPackage.ECOMMERCE__PRODUCTCATALOG:
				getProductcatalog().clear();
				getProductcatalog().addAll((Collection<? extends ItemCatalog>)newValue);
				return;
			case ECommercePMMPackage.ECOMMERCE__SHOPPINGCART:
				getShoppingcart().clear();
				getShoppingcart().addAll((Collection<? extends ShoppingCart>)newValue);
				return;
			case ECommercePMMPackage.ECOMMERCE__PAYMENTTYPE:
				getPaymenttype().clear();
				getPaymenttype().addAll((Collection<? extends PaymentType>)newValue);
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
			case ECommercePMMPackage.ECOMMERCE__PRODUCTCATALOG:
				getProductcatalog().clear();
				return;
			case ECommercePMMPackage.ECOMMERCE__SHOPPINGCART:
				getShoppingcart().clear();
				return;
			case ECommercePMMPackage.ECOMMERCE__PAYMENTTYPE:
				getPaymenttype().clear();
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
			case ECommercePMMPackage.ECOMMERCE__PRODUCTCATALOG:
				return productcatalog != null && !productcatalog.isEmpty();
			case ECommercePMMPackage.ECOMMERCE__SHOPPINGCART:
				return shoppingcart != null && !shoppingcart.isEmpty();
			case ECommercePMMPackage.ECOMMERCE__PAYMENTTYPE:
				return paymenttype != null && !paymenttype.isEmpty();
			case ECommercePMMPackage.ECOMMERCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ECommerceImpl
