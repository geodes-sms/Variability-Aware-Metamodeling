/**
 */
package vcsFeaturesMM.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.VcsFeaturesMMFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>High Level Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HighLevelCommandTest extends TestCase {

	/**
	 * The fixture for this High Level Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighLevelCommand fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HighLevelCommandTest.class);
	}

	/**
	 * Constructs a new High Level Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelCommandTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this High Level Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HighLevelCommand fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this High Level Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighLevelCommand getFixture() {
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
		setFixture(VcsFeaturesMMFactory.eINSTANCE.createHighLevelCommand());
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

} //HighLevelCommandTest
