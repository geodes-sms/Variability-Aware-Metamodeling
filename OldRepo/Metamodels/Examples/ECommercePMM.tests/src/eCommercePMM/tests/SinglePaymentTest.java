/**
 */
package eCommercePMM.tests;

import eCommercePMM.ECommercePMMFactory;
import eCommercePMM.SinglePayment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Payment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SinglePaymentTest extends PaymentTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SinglePaymentTest.class);
	}

	/**
	 * Constructs a new Single Payment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePaymentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Payment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SinglePayment getFixture() {
		return (SinglePayment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ECommercePMMFactory.eINSTANCE.createSinglePayment());
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

} //SinglePaymentTest
