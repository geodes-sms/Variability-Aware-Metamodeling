/**
 */
package vcsFeaturesMM.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import vcsFeaturesMM.History;
import vcsFeaturesMM.VcsFeaturesMMFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HistoryTest extends TestCase {

	/**
	 * The fixture for this History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected History fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HistoryTest.class);
	}

	/**
	 * Constructs a new History test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(History fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected History getFixture() {
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
		setFixture(VcsFeaturesMMFactory.eINSTANCE.createHistory());
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

} //HistoryTest
