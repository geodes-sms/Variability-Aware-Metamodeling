/**
 */
package vcsFeaturesMM.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.VcsFeaturesMMFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Low Level Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowLevelCommandTest extends TestCase {

	/**
	 * The fixture for this Low Level Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowLevelCommand fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LowLevelCommandTest.class);
	}

	/**
	 * Constructs a new Low Level Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowLevelCommandTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Low Level Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LowLevelCommand fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Low Level Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowLevelCommand getFixture() {
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
		setFixture(VcsFeaturesMMFactory.eINSTANCE.createLowLevelCommand());
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

} //LowLevelCommandTest
