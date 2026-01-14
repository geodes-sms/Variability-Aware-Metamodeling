/**
 */
package eCommercePMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECommerce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.ECommerce#getProductcatalog <em>Productcatalog</em>}</li>
 *   <li>{@link eCommercePMM.ECommerce#getShoppingcart <em>Shoppingcart</em>}</li>
 *   <li>{@link eCommercePMM.ECommerce#getPaymenttype <em>Paymenttype</em>}</li>
 *   <li>{@link eCommercePMM.ECommerce#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eCommercePMM.ECommercePMMPackage#getECommerce()
 * @model
 * @generated
 */
public interface ECommerce extends EObject {
	/**
	 * Returns the value of the '<em><b>Productcatalog</b></em>' containment reference list.
	 * The list contents are of type {@link eCommercePMM.ItemCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productcatalog</em>' containment reference list.
	 * @see eCommercePMM.ECommercePMMPackage#getECommerce_Productcatalog()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemCatalog> getProductcatalog();

	/**
	 * Returns the value of the '<em><b>Shoppingcart</b></em>' containment reference list.
	 * The list contents are of type {@link eCommercePMM.ShoppingCart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shoppingcart</em>' containment reference list.
	 * @see eCommercePMM.ECommercePMMPackage#getECommerce_Shoppingcart()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShoppingCart> getShoppingcart();

	/**
	 * Returns the value of the '<em><b>Paymenttype</b></em>' containment reference list.
	 * The list contents are of type {@link eCommercePMM.PaymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymenttype</em>' containment reference list.
	 * @see eCommercePMM.ECommercePMMPackage#getECommerce_Paymenttype()
	 * @model containment="true"
	 * @generated
	 */
	EList<PaymentType> getPaymenttype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Super web store"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see eCommercePMM.ECommercePMMPackage#getECommerce_Name()
	 * @model default="Super web store" id="true" required="true" changeable="false"
	 * @generated
	 */
	String getName();

} // ECommerce
