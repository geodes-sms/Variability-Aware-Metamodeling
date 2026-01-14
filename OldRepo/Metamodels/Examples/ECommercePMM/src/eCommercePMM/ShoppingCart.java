/**
 */
package eCommercePMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping Cart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.ShoppingCart#getDiscount <em>Discount</em>}</li>
 *   <li>{@link eCommercePMM.ShoppingCart#getPaymenttype <em>Paymenttype</em>}</li>
 *   <li>{@link eCommercePMM.ShoppingCart#getCartID <em>Cart ID</em>}</li>
 * </ul>
 *
 * @see eCommercePMM.ECommercePMMPackage#getShoppingCart()
 * @model
 * @generated
 */
public interface ShoppingCart extends EObject {
	/**
	 * Returns the value of the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' reference.
	 * @see #setDiscount(Discount)
	 * @see eCommercePMM.ECommercePMMPackage#getShoppingCart_Discount()
	 * @model
	 * @generated
	 */
	Discount getDiscount();

	/**
	 * Sets the value of the '{@link eCommercePMM.ShoppingCart#getDiscount <em>Discount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' reference.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(Discount value);

	/**
	 * Returns the value of the '<em><b>Paymenttype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymenttype</em>' reference.
	 * @see #setPaymenttype(PaymentType)
	 * @see eCommercePMM.ECommercePMMPackage#getShoppingCart_Paymenttype()
	 * @model required="true"
	 * @generated
	 */
	PaymentType getPaymenttype();

	/**
	 * Sets the value of the '{@link eCommercePMM.ShoppingCart#getPaymenttype <em>Paymenttype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymenttype</em>' reference.
	 * @see #getPaymenttype()
	 * @generated
	 */
	void setPaymenttype(PaymentType value);

	/**
	 * Returns the value of the '<em><b>Cart ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart ID</em>' attribute.
	 * @see #setCartID(String)
	 * @see eCommercePMM.ECommercePMMPackage#getShoppingCart_CartID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getCartID();

	/**
	 * Sets the value of the '{@link eCommercePMM.ShoppingCart#getCartID <em>Cart ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart ID</em>' attribute.
	 * @see #getCartID()
	 * @generated
	 */
	void setCartID(String value);

} // ShoppingCart
