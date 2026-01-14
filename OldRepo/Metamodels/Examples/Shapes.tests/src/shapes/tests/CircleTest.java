/**
 */
package shapes.tests;

import junit.textui.TestRunner;

import shapes.Circle;
import shapes.ShapesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircleTest extends ShapeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CircleTest.class);
	}

	/**
	 * Constructs a new Circle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Circle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Circle getFixture() {
		return (Circle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShapesFactory.eINSTANCE.createCircle());
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

} //CircleTest
