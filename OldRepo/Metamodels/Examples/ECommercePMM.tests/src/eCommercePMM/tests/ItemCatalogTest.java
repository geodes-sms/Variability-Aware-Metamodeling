/**
 */
package eCommercePMM.tests;

import eCommercePMM.ECommercePMMFactory;
import eCommercePMM.ItemCatalog;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Item Catalog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemCatalogTest extends TestCase {

	/**
	 * The fixture for this Item Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemCatalog fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ItemCatalogTest.class);
	}

	/**
	 * Constructs a new Item Catalog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemCatalogTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Item Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ItemCatalog fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Item Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemCatalog getFixture() {
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
		setFixture(ECommercePMMFactory.eINSTANCE.createItemCatalog());
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

} //ItemCatalogTest
