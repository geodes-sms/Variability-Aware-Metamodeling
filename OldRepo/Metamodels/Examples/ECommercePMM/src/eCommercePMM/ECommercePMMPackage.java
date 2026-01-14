/**
 */
package eCommercePMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eCommercePMM.ECommercePMMFactory
 * @model kind="package"
 * @generated
 */
public interface ECommercePMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eCommercePMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eCommercePMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eCommercePMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ECommercePMMPackage eINSTANCE = eCommercePMM.impl.ECommercePMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.ECommerceImpl <em>ECommerce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.ECommerceImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getECommerce()
	 * @generated
	 */
	int ECOMMERCE = 0;

	/**
	 * The feature id for the '<em><b>Productcatalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE__PRODUCTCATALOG = 0;

	/**
	 * The feature id for the '<em><b>Shoppingcart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE__SHOPPINGCART = 1;

	/**
	 * The feature id for the '<em><b>Paymenttype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE__PAYMENTTYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE__NAME = 3;

	/**
	 * The number of structural features of the '<em>ECommerce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.ItemCatalogImpl <em>Item Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.ItemCatalogImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getItemCatalog()
	 * @generated
	 */
	int ITEM_CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Catalog ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CATALOG__CATALOG_ID = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CATALOG__ITEM = 1;

	/**
	 * The number of structural features of the '<em>Item Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CATALOG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.ShoppingCartImpl <em>Shopping Cart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.ShoppingCartImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getShoppingCart()
	 * @generated
	 */
	int SHOPPING_CART = 2;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__DISCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Paymenttype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__PAYMENTTYPE = 1;

	/**
	 * The feature id for the '<em><b>Cart ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART__CART_ID = 2;

	/**
	 * The number of structural features of the '<em>Shopping Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_CART_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.DiscountImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 3;

	/**
	 * The feature id for the '<em><b>Discount ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__DISCOUNT_ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__AMOUNT = 1;

	/**
	 * The number of structural features of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.PaymentTypeImpl <em>Payment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.PaymentTypeImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getPaymentType()
	 * @generated
	 */
	int PAYMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Bill ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__BILL_ID = 0;

	/**
	 * The number of structural features of the '<em>Payment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.SinglePaymentImpl <em>Single Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.SinglePaymentImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getSinglePayment()
	 * @generated
	 */
	int SINGLE_PAYMENT = 5;

	/**
	 * The feature id for the '<em><b>Bill ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAYMENT__BILL_ID = PAYMENT_TYPE__BILL_ID;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAYMENT__TOTAL_AMOUNT = PAYMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAYMENT__TIMESTAMP = PAYMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAYMENT_FEATURE_COUNT = PAYMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.ItemImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 8;

	/**
	 * The feature id for the '<em><b>Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DISCOUNT = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.ProductImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ITEM_ID = ITEM__ITEM_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DISCOUNT = ITEM__DISCOUNT;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link eCommercePMM.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eCommercePMM.impl.ServiceImpl
	 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ITEM_ID = ITEM__ITEM_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DISCOUNT = ITEM__DISCOUNT;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DURATION = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link eCommercePMM.ECommerce <em>ECommerce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECommerce</em>'.
	 * @see eCommercePMM.ECommerce
	 * @generated
	 */
	EClass getECommerce();

	/**
	 * Returns the meta object for the containment reference list '{@link eCommercePMM.ECommerce#getProductcatalog <em>Productcatalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productcatalog</em>'.
	 * @see eCommercePMM.ECommerce#getProductcatalog()
	 * @see #getECommerce()
	 * @generated
	 */
	EReference getECommerce_Productcatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link eCommercePMM.ECommerce#getShoppingcart <em>Shoppingcart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shoppingcart</em>'.
	 * @see eCommercePMM.ECommerce#getShoppingcart()
	 * @see #getECommerce()
	 * @generated
	 */
	EReference getECommerce_Shoppingcart();

	/**
	 * Returns the meta object for the containment reference list '{@link eCommercePMM.ECommerce#getPaymenttype <em>Paymenttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paymenttype</em>'.
	 * @see eCommercePMM.ECommerce#getPaymenttype()
	 * @see #getECommerce()
	 * @generated
	 */
	EReference getECommerce_Paymenttype();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.ECommerce#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eCommercePMM.ECommerce#getName()
	 * @see #getECommerce()
	 * @generated
	 */
	EAttribute getECommerce_Name();

	/**
	 * Returns the meta object for class '{@link eCommercePMM.ItemCatalog <em>Item Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Catalog</em>'.
	 * @see eCommercePMM.ItemCatalog
	 * @generated
	 */
	EClass getItemCatalog();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.ItemCatalog#getCatalogID <em>Catalog ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog ID</em>'.
	 * @see eCommercePMM.ItemCatalog#getCatalogID()
	 * @see #getItemCatalog()
	 * @generated
	 */
	EAttribute getItemCatalog_CatalogID();

	/**
	 * Returns the meta object for the containment reference list '{@link eCommercePMM.ItemCatalog#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see eCommercePMM.ItemCatalog#getItem()
	 * @see #getItemCatalog()
	 * @generated
	 */
	EReference getItemCatalog_Item();

	/**
	 * Returns the meta object for class '{@link eCommercePMM.ShoppingCart <em>Shopping Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping Cart</em>'.
	 * @see eCommercePMM.ShoppingCart
	 * @generated
	 */
	EClass getShoppingCart();

	/**
	 * Returns the meta object for the reference '{@link eCommercePMM.ShoppingCart#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discount</em>'.
	 * @see eCommercePMM.ShoppingCart#getDiscount()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EReference getShoppingCart_Discount();

	/**
	 * Returns the meta object for the reference '{@link eCommercePMM.ShoppingCart#getPaymenttype <em>Paymenttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymenttype</em>'.
	 * @see eCommercePMM.ShoppingCart#getPaymenttype()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EReference getShoppingCart_Paymenttype();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.ShoppingCart#getCartID <em>Cart ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cart ID</em>'.
	 * @see eCommercePMM.ShoppingCart#getCartID()
	 * @see #getShoppingCart()
	 * @generated
	 */
	EAttribute getShoppingCart_CartID();

	/**
	 * Returns the meta object for class '{@link eCommercePMM.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see eCommercePMM.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.Discount#getDiscountID <em>Discount ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount ID</em>'.
	 * @see eCommercePMM.Discount#getDiscountID()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_DiscountID();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.Discount#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see eCommercePMM.Discount#getAmount()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Amount();

	/**
	 * Returns the meta object for class '{@link eCommercePMM.PaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Type</em>'.
	 * @see eCommercePMM.PaymentType
	 * @generated
	 */
	EClass getPaymentType();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.PaymentType#getBillID <em>Bill ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill ID</em>'.
	 * @see eCommercePMM.PaymentType#getBillID()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_BillID();

	/**
	 * Returns the meta object for class '{@link eCommercePMM.SinglePayment <em>Single Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Payment</em>'.
	 * @see eCommercePMM.SinglePayment
	 * @generated
	 */
	EClass getSinglePayment();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.SinglePayment#getTotalAmount <em>Total Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Amount</em>'.
	 * @see eCommercePMM.SinglePayment#getTotalAmount()
	 * @see #getSinglePayment()
	 * @generated
	 */
	EAttribute getSinglePayment_TotalAmount();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.SinglePayment#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see eCommercePMM.SinglePayment#getTimestamp()
	 * @see #getSinglePayment()
	 * @generated
	 */
	EAttribute getSinglePayment_Timestamp();

	/**
	 * Returns the meta object for class '{@link eCommercePMM.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see eCommercePMM.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for class '{@link eCommercePMM.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see eCommercePMM.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.Service#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see eCommercePMM.Service#getDuration()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Duration();

	/**
	 * Returns the meta object for class '{@link eCommercePMM.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see eCommercePMM.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.Item#getItemID <em>Item ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item ID</em>'.
	 * @see eCommercePMM.Item#getItemID()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ItemID();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eCommercePMM.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link eCommercePMM.Item#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eCommercePMM.Item#getDescription()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Description();

	/**
	 * Returns the meta object for the reference '{@link eCommercePMM.Item#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discount</em>'.
	 * @see eCommercePMM.Item#getDiscount()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Discount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ECommercePMMFactory getECommercePMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.ECommerceImpl <em>ECommerce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.ECommerceImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getECommerce()
		 * @generated
		 */
		EClass ECOMMERCE = eINSTANCE.getECommerce();

		/**
		 * The meta object literal for the '<em><b>Productcatalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE__PRODUCTCATALOG = eINSTANCE.getECommerce_Productcatalog();

		/**
		 * The meta object literal for the '<em><b>Shoppingcart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE__SHOPPINGCART = eINSTANCE.getECommerce_Shoppingcart();

		/**
		 * The meta object literal for the '<em><b>Paymenttype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE__PAYMENTTYPE = eINSTANCE.getECommerce_Paymenttype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMMERCE__NAME = eINSTANCE.getECommerce_Name();

		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.ItemCatalogImpl <em>Item Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.ItemCatalogImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getItemCatalog()
		 * @generated
		 */
		EClass ITEM_CATALOG = eINSTANCE.getItemCatalog();

		/**
		 * The meta object literal for the '<em><b>Catalog ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_CATALOG__CATALOG_ID = eINSTANCE.getItemCatalog_CatalogID();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CATALOG__ITEM = eINSTANCE.getItemCatalog_Item();

		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.ShoppingCartImpl <em>Shopping Cart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.ShoppingCartImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getShoppingCart()
		 * @generated
		 */
		EClass SHOPPING_CART = eINSTANCE.getShoppingCart();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_CART__DISCOUNT = eINSTANCE.getShoppingCart_Discount();

		/**
		 * The meta object literal for the '<em><b>Paymenttype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_CART__PAYMENTTYPE = eINSTANCE.getShoppingCart_Paymenttype();

		/**
		 * The meta object literal for the '<em><b>Cart ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_CART__CART_ID = eINSTANCE.getShoppingCart_CartID();

		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.DiscountImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getDiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getDiscount();

		/**
		 * The meta object literal for the '<em><b>Discount ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__DISCOUNT_ID = eINSTANCE.getDiscount_DiscountID();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__AMOUNT = eINSTANCE.getDiscount_Amount();

		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.PaymentTypeImpl <em>Payment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.PaymentTypeImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getPaymentType()
		 * @generated
		 */
		EClass PAYMENT_TYPE = eINSTANCE.getPaymentType();

		/**
		 * The meta object literal for the '<em><b>Bill ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_TYPE__BILL_ID = eINSTANCE.getPaymentType_BillID();

		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.SinglePaymentImpl <em>Single Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.SinglePaymentImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getSinglePayment()
		 * @generated
		 */
		EClass SINGLE_PAYMENT = eINSTANCE.getSinglePayment();

		/**
		 * The meta object literal for the '<em><b>Total Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_PAYMENT__TOTAL_AMOUNT = eINSTANCE.getSinglePayment_TotalAmount();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_PAYMENT__TIMESTAMP = eINSTANCE.getSinglePayment_Timestamp();

		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.ProductImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.ServiceImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DURATION = eINSTANCE.getService_Duration();

		/**
		 * The meta object literal for the '{@link eCommercePMM.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eCommercePMM.impl.ItemImpl
		 * @see eCommercePMM.impl.ECommercePMMPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Item ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ITEM_ID = eINSTANCE.getItem_ItemID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DESCRIPTION = eINSTANCE.getItem_Description();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__DISCOUNT = eINSTANCE.getItem_Discount();

	}

} //ECommercePMMPackage
