/**
 */
package vcsFeaturesMM.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import vcsFeaturesMM.VCSFeatures;
import vcsFeaturesMM.VcsFeaturesMMFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VCS Features</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VCSFeaturesTest extends TestCase {

	/**
	 * The fixture for this VCS Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCSFeatures fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VCSFeaturesTest.class);
	}

	/**
	 * Constructs a new VCS Features test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCSFeaturesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this VCS Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VCSFeatures fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this VCS Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCSFeatures getFixture() {
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
		setFixture(VcsFeaturesMMFactory.eINSTANCE.createVCSFeatures());
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

} //VCSFeaturesTest
