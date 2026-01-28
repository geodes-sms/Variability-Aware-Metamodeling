/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VCS Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.VCSFeatures#getCommands <em>Commands</em>}</li>
 *   <li>{@link vcsFeaturesMM.VCSFeatures#getHistory <em>History</em>}</li>
 *   <li>{@link vcsFeaturesMM.VCSFeatures#getVersionunit <em>Versionunit</em>}</li>
 *   <li>{@link vcsFeaturesMM.VCSFeatures#getCollaborationstyle <em>Collaborationstyle</em>}</li>
 *   <li>{@link vcsFeaturesMM.VCSFeatures#getDatabase <em>Database</em>}</li>
 *   <li>{@link vcsFeaturesMM.VCSFeatures#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVCSFeatures()
 * @model
 * @generated
 */
public interface VCSFeatures extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link vcsFeaturesMM.Commands}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVCSFeatures_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commands> getCommands();

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference list.
	 * The list contents are of type {@link vcsFeaturesMM.History}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' containment reference list.
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVCSFeatures_History()
	 * @model containment="true"
	 * @generated
	 */
	EList<History> getHistory();

	/**
	 * Returns the value of the '<em><b>Versionunit</b></em>' containment reference list.
	 * The list contents are of type {@link vcsFeaturesMM.VersionUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versionunit</em>' containment reference list.
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVCSFeatures_Versionunit()
	 * @model containment="true"
	 * @generated
	 */
	EList<VersionUnit> getVersionunit();

	/**
	 * Returns the value of the '<em><b>Collaborationstyle</b></em>' containment reference list.
	 * The list contents are of type {@link vcsFeaturesMM.CollaborationStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborationstyle</em>' containment reference list.
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVCSFeatures_Collaborationstyle()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollaborationStyle> getCollaborationstyle();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link vcsFeaturesMM.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVCSFeatures_Database()
	 * @model containment="true"
	 * @generated
	 */
	EList<Database> getDatabase();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getVCSFeatures_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.VCSFeatures#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VCSFeatures
