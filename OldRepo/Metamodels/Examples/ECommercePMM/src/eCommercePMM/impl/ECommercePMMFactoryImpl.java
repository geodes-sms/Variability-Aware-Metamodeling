/**
 */
package eCommercePMM.impl;

import eCommercePMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ECommercePMMFactoryImpl extends EFactoryImpl implements ECommercePMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECommercePMMFactory init() {
		try {
			ECommercePMMFactory theECommercePMMFactory = (ECommercePMMFactory)EPackage.Registry.INSTANCE.getEFactory(ECommercePMMPackage.eNS_URI);
			if (theECommercePMMFactory != null) {
				return theECommercePMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ECommercePMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECommercePMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ECommercePMMPackage.ECOMMERCE: return createECommerce();
			case ECommercePMMPackage.ITEM_CATALOG: return createItemCatalog();
			case ECommercePMMPackage.SHOPPING_CART: return createShoppingCart();
			case ECommercePMMPackage.DISCOUNT: return createDiscount();
			case ECommercePMMPackage.SINGLE_PAYMENT: return createSinglePayment();
			case ECommercePMMPackage.PRODUCT: return createProduct();
			case ECommercePMMPackage.SERVICE: return createService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECommerce createECommerce() {
		ECommerceImpl eCommerce = new ECommerceImpl();
		return eCommerce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemCatalog createItemCatalog() {
		ItemCatalogImpl itemCatalog = new ItemCatalogImpl();
		return itemCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingCart createShoppingCart() {
		ShoppingCartImpl shoppingCart = new ShoppingCartImpl();
		return shoppingCart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discount createDiscount() {
		DiscountImpl discount = new DiscountImpl();
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SinglePayment createSinglePayment() {
		SinglePaymentImpl singlePayment = new SinglePaymentImpl();
		return singlePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECommercePMMPackage getECommercePMMPackage() {
		return (ECommercePMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ECommercePMMPackage getPackage() {
		return ECommercePMMPackage.eINSTANCE;
	}

} //ECommercePMMFactoryImpl
