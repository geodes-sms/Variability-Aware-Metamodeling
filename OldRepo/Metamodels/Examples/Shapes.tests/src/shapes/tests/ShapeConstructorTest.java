/**
 */
package shapes.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import shapes.ShapeConstructor;
import shapes.ShapesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shape Constructor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeConstructorTest extends TestCase {

	/**
	 * The fixture for this Shape Constructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeConstructor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShapeConstructorTest.class);
	}

	/**
	 * Constructs a new Shape Constructor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeConstructorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shape Constructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ShapeConstructor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shape Constructor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeConstructor getFixture() {
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
		setFixture(ShapesFactory.eINSTANCE.createShapeConstructor());
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

} //ShapeConstructorTest
