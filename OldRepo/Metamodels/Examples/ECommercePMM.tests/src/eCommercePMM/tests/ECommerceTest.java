/**
 */
package eCommercePMM.tests;

import eCommercePMM.ECommerce;
import eCommercePMM.ECommercePMMFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ECommerce</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ECommerceTest extends TestCase {

	/**
	 * The fixture for this ECommerce test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECommerce fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ECommerceTest.class);
	}

	/**
	 * Constructs a new ECommerce test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECommerceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this ECommerce test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ECommerce fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this ECommerce test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECommerce getFixture() {
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
		setFixture(ECommercePMMFactory.eINSTANCE.createECommerce());
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

} //ECommerceTest
