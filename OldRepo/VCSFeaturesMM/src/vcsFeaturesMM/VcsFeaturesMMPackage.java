/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see vcsFeaturesMM.VcsFeaturesMMFactory
 * @model kind="package"
 * @generated
 */
public interface VcsFeaturesMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vcsFeaturesMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/vcsFeaturesMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vcsFeaturesMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VcsFeaturesMMPackage eINSTANCE = vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.impl.VCSFeaturesImpl <em>VCS Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.impl.VCSFeaturesImpl
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getVCSFeatures()
	 * @generated
	 */
	int VCS_FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_FEATURES__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_FEATURES__HISTORY = 1;

	/**
	 * The feature id for the '<em><b>Versionunit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_FEATURES__VERSIONUNIT = 2;

	/**
	 * The feature id for the '<em><b>Collaborationstyle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_FEATURES__COLLABORATIONSTYLE = 3;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_FEATURES__DATABASE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_FEATURES__NAME = 5;

	/**
	 * The number of structural features of the '<em>VCS Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_FEATURES_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.impl.CommandsImpl <em>Commands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.impl.CommandsImpl
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getCommands()
	 * @generated
	 */
	int COMMANDS = 1;

	/**
	 * The feature id for the '<em><b>Merge Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDS__MERGE_STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Highlevelcommand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDS__HIGHLEVELCOMMAND = 1;

	/**
	 * The feature id for the '<em><b>Lowlevelcommand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDS__LOWLEVELCOMMAND = 2;

	/**
	 * The number of structural features of the '<em>Commands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.impl.HistoryImpl
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 2;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__LABEL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Commit History Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__COMMIT_HISTORY_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Number Of Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__NUMBER_OF_BRANCHES = 2;

	/**
	 * The feature id for the '<em><b>Unique Label String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__UNIQUE_LABEL_STRING = 3;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.impl.VersionUnitImpl <em>Version Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.impl.VersionUnitImpl
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getVersionUnit()
	 * @generated
	 */
	int VERSION_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Granularity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_UNIT__GRANULARITY = 0;

	/**
	 * The number of structural features of the '<em>Version Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_UNIT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.impl.CollaborationStyleImpl <em>Collaboration Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.impl.CollaborationStyleImpl
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getCollaborationStyle()
	 * @generated
	 */
	int COLLABORATION_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Collab Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_STYLE__COLLAB_STYLE = 0;

	/**
	 * The number of structural features of the '<em>Collaboration Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_STYLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.impl.DatabaseImpl
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 5;

	/**
	 * The feature id for the '<em><b>Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CONNECTION_STRING = 0;

	/**
	 * The feature id for the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATABASE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.impl.LowLevelCommandImpl <em>Low Level Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.impl.LowLevelCommandImpl
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getLowLevelCommand()
	 * @generated
	 */
	int LOW_LEVEL_COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_COMMAND__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Low Level Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOW_LEVEL_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.impl.HighLevelCommandImpl <em>High Level Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.impl.HighLevelCommandImpl
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getHighLevelCommand()
	 * @generated
	 */
	int HIGH_LEVEL_COMMAND = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lowlevelcommand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_COMMAND__LOWLEVELCOMMAND = 1;

	/**
	 * The number of structural features of the '<em>High Level Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_COMMAND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.LowCommands <em>Low Commands</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.LowCommands
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getLowCommands()
	 * @generated
	 */
	int LOW_COMMANDS = 8;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.MergeStrategy <em>Merge Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.MergeStrategy
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getMergeStrategy()
	 * @generated
	 */
	int MERGE_STRATEGY = 9;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.LabelType <em>Label Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.LabelType
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 10;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.DatabaseType
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 11;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.VersionUnitType <em>Version Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.VersionUnitType
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getVersionUnitType()
	 * @generated
	 */
	int VERSION_UNIT_TYPE = 12;

	/**
	 * The meta object id for the '{@link vcsFeaturesMM.CollaborationStyleType <em>Collaboration Style Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see vcsFeaturesMM.CollaborationStyleType
	 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getCollaborationStyleType()
	 * @generated
	 */
	int COLLABORATION_STYLE_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link vcsFeaturesMM.VCSFeatures <em>VCS Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VCS Features</em>'.
	 * @see vcsFeaturesMM.VCSFeatures
	 * @generated
	 */
	EClass getVCSFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link vcsFeaturesMM.VCSFeatures#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see vcsFeaturesMM.VCSFeatures#getCommands()
	 * @see #getVCSFeatures()
	 * @generated
	 */
	EReference getVCSFeatures_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link vcsFeaturesMM.VCSFeatures#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>History</em>'.
	 * @see vcsFeaturesMM.VCSFeatures#getHistory()
	 * @see #getVCSFeatures()
	 * @generated
	 */
	EReference getVCSFeatures_History();

	/**
	 * Returns the meta object for the containment reference list '{@link vcsFeaturesMM.VCSFeatures#getVersionunit <em>Versionunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versionunit</em>'.
	 * @see vcsFeaturesMM.VCSFeatures#getVersionunit()
	 * @see #getVCSFeatures()
	 * @generated
	 */
	EReference getVCSFeatures_Versionunit();

	/**
	 * Returns the meta object for the containment reference list '{@link vcsFeaturesMM.VCSFeatures#getCollaborationstyle <em>Collaborationstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaborationstyle</em>'.
	 * @see vcsFeaturesMM.VCSFeatures#getCollaborationstyle()
	 * @see #getVCSFeatures()
	 * @generated
	 */
	EReference getVCSFeatures_Collaborationstyle();

	/**
	 * Returns the meta object for the containment reference list '{@link vcsFeaturesMM.VCSFeatures#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see vcsFeaturesMM.VCSFeatures#getDatabase()
	 * @see #getVCSFeatures()
	 * @generated
	 */
	EReference getVCSFeatures_Database();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.VCSFeatures#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vcsFeaturesMM.VCSFeatures#getName()
	 * @see #getVCSFeatures()
	 * @generated
	 */
	EAttribute getVCSFeatures_Name();

	/**
	 * Returns the meta object for class '{@link vcsFeaturesMM.Commands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commands</em>'.
	 * @see vcsFeaturesMM.Commands
	 * @generated
	 */
	EClass getCommands();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.Commands#getMergeStrategy <em>Merge Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Strategy</em>'.
	 * @see vcsFeaturesMM.Commands#getMergeStrategy()
	 * @see #getCommands()
	 * @generated
	 */
	EAttribute getCommands_MergeStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link vcsFeaturesMM.Commands#getHighlevelcommand <em>Highlevelcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Highlevelcommand</em>'.
	 * @see vcsFeaturesMM.Commands#getHighlevelcommand()
	 * @see #getCommands()
	 * @generated
	 */
	EReference getCommands_Highlevelcommand();

	/**
	 * Returns the meta object for the containment reference list '{@link vcsFeaturesMM.Commands#getLowlevelcommand <em>Lowlevelcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lowlevelcommand</em>'.
	 * @see vcsFeaturesMM.Commands#getLowlevelcommand()
	 * @see #getCommands()
	 * @generated
	 */
	EReference getCommands_Lowlevelcommand();

	/**
	 * Returns the meta object for class '{@link vcsFeaturesMM.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see vcsFeaturesMM.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.History#getLabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Type</em>'.
	 * @see vcsFeaturesMM.History#getLabelType()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_LabelType();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.History#getCommitHistoryRange <em>Commit History Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit History Range</em>'.
	 * @see vcsFeaturesMM.History#getCommitHistoryRange()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_CommitHistoryRange();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.History#getNumberOfBranches <em>Number Of Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Branches</em>'.
	 * @see vcsFeaturesMM.History#getNumberOfBranches()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_NumberOfBranches();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.History#getUniqueLabelString <em>Unique Label String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Label String</em>'.
	 * @see vcsFeaturesMM.History#getUniqueLabelString()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_UniqueLabelString();

	/**
	 * Returns the meta object for class '{@link vcsFeaturesMM.VersionUnit <em>Version Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Unit</em>'.
	 * @see vcsFeaturesMM.VersionUnit
	 * @generated
	 */
	EClass getVersionUnit();

	/**
	 * Returns the meta object for the attribute list '{@link vcsFeaturesMM.VersionUnit#getGranularity <em>Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Granularity</em>'.
	 * @see vcsFeaturesMM.VersionUnit#getGranularity()
	 * @see #getVersionUnit()
	 * @generated
	 */
	EAttribute getVersionUnit_Granularity();

	/**
	 * Returns the meta object for class '{@link vcsFeaturesMM.CollaborationStyle <em>Collaboration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration Style</em>'.
	 * @see vcsFeaturesMM.CollaborationStyle
	 * @generated
	 */
	EClass getCollaborationStyle();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.CollaborationStyle#getCollabStyle <em>Collab Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collab Style</em>'.
	 * @see vcsFeaturesMM.CollaborationStyle#getCollabStyle()
	 * @see #getCollaborationStyle()
	 * @generated
	 */
	EAttribute getCollaborationStyle_CollabStyle();

	/**
	 * Returns the meta object for class '{@link vcsFeaturesMM.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see vcsFeaturesMM.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.Database#getConnectionString <em>Connection String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection String</em>'.
	 * @see vcsFeaturesMM.Database#getConnectionString()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_ConnectionString();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.Database#getDatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Type</em>'.
	 * @see vcsFeaturesMM.Database#getDatabaseType()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_DatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vcsFeaturesMM.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for class '{@link vcsFeaturesMM.LowLevelCommand <em>Low Level Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Low Level Command</em>'.
	 * @see vcsFeaturesMM.LowLevelCommand
	 * @generated
	 */
	EClass getLowLevelCommand();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.LowLevelCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vcsFeaturesMM.LowLevelCommand#getName()
	 * @see #getLowLevelCommand()
	 * @generated
	 */
	EAttribute getLowLevelCommand_Name();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.LowLevelCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see vcsFeaturesMM.LowLevelCommand#getCommand()
	 * @see #getLowLevelCommand()
	 * @generated
	 */
	EAttribute getLowLevelCommand_Command();

	/**
	 * Returns the meta object for class '{@link vcsFeaturesMM.HighLevelCommand <em>High Level Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Level Command</em>'.
	 * @see vcsFeaturesMM.HighLevelCommand
	 * @generated
	 */
	EClass getHighLevelCommand();

	/**
	 * Returns the meta object for the attribute '{@link vcsFeaturesMM.HighLevelCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see vcsFeaturesMM.HighLevelCommand#getName()
	 * @see #getHighLevelCommand()
	 * @generated
	 */
	EAttribute getHighLevelCommand_Name();

	/**
	 * Returns the meta object for the reference list '{@link vcsFeaturesMM.HighLevelCommand#getLowlevelcommand <em>Lowlevelcommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lowlevelcommand</em>'.
	 * @see vcsFeaturesMM.HighLevelCommand#getLowlevelcommand()
	 * @see #getHighLevelCommand()
	 * @generated
	 */
	EReference getHighLevelCommand_Lowlevelcommand();

	/**
	 * Returns the meta object for enum '{@link vcsFeaturesMM.LowCommands <em>Low Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Low Commands</em>'.
	 * @see vcsFeaturesMM.LowCommands
	 * @generated
	 */
	EEnum getLowCommands();

	/**
	 * Returns the meta object for enum '{@link vcsFeaturesMM.MergeStrategy <em>Merge Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Strategy</em>'.
	 * @see vcsFeaturesMM.MergeStrategy
	 * @generated
	 */
	EEnum getMergeStrategy();

	/**
	 * Returns the meta object for enum '{@link vcsFeaturesMM.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Type</em>'.
	 * @see vcsFeaturesMM.LabelType
	 * @generated
	 */
	EEnum getLabelType();

	/**
	 * Returns the meta object for enum '{@link vcsFeaturesMM.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see vcsFeaturesMM.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

	/**
	 * Returns the meta object for enum '{@link vcsFeaturesMM.VersionUnitType <em>Version Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Unit Type</em>'.
	 * @see vcsFeaturesMM.VersionUnitType
	 * @generated
	 */
	EEnum getVersionUnitType();

	/**
	 * Returns the meta object for enum '{@link vcsFeaturesMM.CollaborationStyleType <em>Collaboration Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collaboration Style Type</em>'.
	 * @see vcsFeaturesMM.CollaborationStyleType
	 * @generated
	 */
	EEnum getCollaborationStyleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VcsFeaturesMMFactory getVcsFeaturesMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.impl.VCSFeaturesImpl <em>VCS Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.impl.VCSFeaturesImpl
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getVCSFeatures()
		 * @generated
		 */
		EClass VCS_FEATURES = eINSTANCE.getVCSFeatures();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCS_FEATURES__COMMANDS = eINSTANCE.getVCSFeatures_Commands();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCS_FEATURES__HISTORY = eINSTANCE.getVCSFeatures_History();

		/**
		 * The meta object literal for the '<em><b>Versionunit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCS_FEATURES__VERSIONUNIT = eINSTANCE.getVCSFeatures_Versionunit();

		/**
		 * The meta object literal for the '<em><b>Collaborationstyle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCS_FEATURES__COLLABORATIONSTYLE = eINSTANCE.getVCSFeatures_Collaborationstyle();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCS_FEATURES__DATABASE = eINSTANCE.getVCSFeatures_Database();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCS_FEATURES__NAME = eINSTANCE.getVCSFeatures_Name();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.impl.CommandsImpl <em>Commands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.impl.CommandsImpl
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getCommands()
		 * @generated
		 */
		EClass COMMANDS = eINSTANCE.getCommands();

		/**
		 * The meta object literal for the '<em><b>Merge Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMANDS__MERGE_STRATEGY = eINSTANCE.getCommands_MergeStrategy();

		/**
		 * The meta object literal for the '<em><b>Highlevelcommand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDS__HIGHLEVELCOMMAND = eINSTANCE.getCommands_Highlevelcommand();

		/**
		 * The meta object literal for the '<em><b>Lowlevelcommand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDS__LOWLEVELCOMMAND = eINSTANCE.getCommands_Lowlevelcommand();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.impl.HistoryImpl
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '<em><b>Label Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__LABEL_TYPE = eINSTANCE.getHistory_LabelType();

		/**
		 * The meta object literal for the '<em><b>Commit History Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__COMMIT_HISTORY_RANGE = eINSTANCE.getHistory_CommitHistoryRange();

		/**
		 * The meta object literal for the '<em><b>Number Of Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__NUMBER_OF_BRANCHES = eINSTANCE.getHistory_NumberOfBranches();

		/**
		 * The meta object literal for the '<em><b>Unique Label String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__UNIQUE_LABEL_STRING = eINSTANCE.getHistory_UniqueLabelString();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.impl.VersionUnitImpl <em>Version Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.impl.VersionUnitImpl
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getVersionUnit()
		 * @generated
		 */
		EClass VERSION_UNIT = eINSTANCE.getVersionUnit();

		/**
		 * The meta object literal for the '<em><b>Granularity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_UNIT__GRANULARITY = eINSTANCE.getVersionUnit_Granularity();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.impl.CollaborationStyleImpl <em>Collaboration Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.impl.CollaborationStyleImpl
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getCollaborationStyle()
		 * @generated
		 */
		EClass COLLABORATION_STYLE = eINSTANCE.getCollaborationStyle();

		/**
		 * The meta object literal for the '<em><b>Collab Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION_STYLE__COLLAB_STYLE = eINSTANCE.getCollaborationStyle_CollabStyle();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.impl.DatabaseImpl
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Connection String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__CONNECTION_STRING = eINSTANCE.getDatabase_ConnectionString();

		/**
		 * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__DATABASE_TYPE = eINSTANCE.getDatabase_DatabaseType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.impl.LowLevelCommandImpl <em>Low Level Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.impl.LowLevelCommandImpl
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getLowLevelCommand()
		 * @generated
		 */
		EClass LOW_LEVEL_COMMAND = eINSTANCE.getLowLevelCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOW_LEVEL_COMMAND__NAME = eINSTANCE.getLowLevelCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOW_LEVEL_COMMAND__COMMAND = eINSTANCE.getLowLevelCommand_Command();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.impl.HighLevelCommandImpl <em>High Level Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.impl.HighLevelCommandImpl
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getHighLevelCommand()
		 * @generated
		 */
		EClass HIGH_LEVEL_COMMAND = eINSTANCE.getHighLevelCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_LEVEL_COMMAND__NAME = eINSTANCE.getHighLevelCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Lowlevelcommand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_LEVEL_COMMAND__LOWLEVELCOMMAND = eINSTANCE.getHighLevelCommand_Lowlevelcommand();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.LowCommands <em>Low Commands</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.LowCommands
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getLowCommands()
		 * @generated
		 */
		EEnum LOW_COMMANDS = eINSTANCE.getLowCommands();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.MergeStrategy <em>Merge Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.MergeStrategy
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getMergeStrategy()
		 * @generated
		 */
		EEnum MERGE_STRATEGY = eINSTANCE.getMergeStrategy();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.LabelType <em>Label Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.LabelType
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getLabelType()
		 * @generated
		 */
		EEnum LABEL_TYPE = eINSTANCE.getLabelType();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.DatabaseType
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.VersionUnitType <em>Version Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.VersionUnitType
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getVersionUnitType()
		 * @generated
		 */
		EEnum VERSION_UNIT_TYPE = eINSTANCE.getVersionUnitType();

		/**
		 * The meta object literal for the '{@link vcsFeaturesMM.CollaborationStyleType <em>Collaboration Style Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see vcsFeaturesMM.CollaborationStyleType
		 * @see vcsFeaturesMM.impl.VcsFeaturesMMPackageImpl#getCollaborationStyleType()
		 * @generated
		 */
		EEnum COLLABORATION_STYLE_TYPE = eINSTANCE.getCollaborationStyleType();

	}

} //VcsFeaturesMMPackage
