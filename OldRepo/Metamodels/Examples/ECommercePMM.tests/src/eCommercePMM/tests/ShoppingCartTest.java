/**
 */
package eCommercePMM.tests;

import eCommercePMM.ECommercePMMFactory;
import eCommercePMM.ShoppingCart;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shopping Cart</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShoppingCartTest extends TestCase {

	/**
	 * The fixture for this Shopping Cart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingCart fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShoppingCartTest.class);
	}

	/**
	 * Constructs a new Shopping Cart test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShoppingCartTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shopping Cart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ShoppingCart fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shopping Cart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingCart getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ECommercePMMFactory.eINSTANCE.createShoppingCart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ShoppingCartTest
