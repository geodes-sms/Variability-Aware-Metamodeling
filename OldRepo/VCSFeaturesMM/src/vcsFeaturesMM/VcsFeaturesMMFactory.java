/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see vcsFeaturesMM.VcsFeaturesMMPackage
 * @generated
 */
public interface VcsFeaturesMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VcsFeaturesMMFactory eINSTANCE = vcsFeaturesMM.impl.VcsFeaturesMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>VCS Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VCS Features</em>'.
	 * @generated
	 */
	VCSFeatures createVCSFeatures();

	/**
	 * Returns a new object of class '<em>Commands</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commands</em>'.
	 * @generated
	 */
	Commands createCommands();

	/**
	 * Returns a new object of class '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History</em>'.
	 * @generated
	 */
	History createHistory();

	/**
	 * Returns a new object of class '<em>Version Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Unit</em>'.
	 * @generated
	 */
	VersionUnit createVersionUnit();

	/**
	 * Returns a new object of class '<em>Collaboration Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaboration Style</em>'.
	 * @generated
	 */
	CollaborationStyle createCollaborationStyle();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Low Level Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Low Level Command</em>'.
	 * @generated
	 */
	LowLevelCommand createLowLevelCommand();

	/**
	 * Returns a new object of class '<em>High Level Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>High Level Command</em>'.
	 * @generated
	 */
	HighLevelCommand createHighLevelCommand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VcsFeaturesMMPackage getVcsFeaturesMMPackage();

} //VcsFeaturesMMFactory
