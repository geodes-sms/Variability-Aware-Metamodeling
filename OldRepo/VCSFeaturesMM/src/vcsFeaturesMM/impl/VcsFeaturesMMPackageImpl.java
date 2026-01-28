/**
 */
package vcsFeaturesMM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import vcsFeaturesMM.CollaborationStyle;
import vcsFeaturesMM.CollaborationStyleType;
import vcsFeaturesMM.Commands;
import vcsFeaturesMM.Database;
import vcsFeaturesMM.DatabaseType;
import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.History;
import vcsFeaturesMM.LabelType;
import vcsFeaturesMM.LowCommands;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.MergeStrategy;
import vcsFeaturesMM.VCSFeatures;
import vcsFeaturesMM.VcsFeaturesMMFactory;
import vcsFeaturesMM.VcsFeaturesMMPackage;
import vcsFeaturesMM.VersionUnit;
import vcsFeaturesMM.VersionUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VcsFeaturesMMPackageImpl extends EPackageImpl implements VcsFeaturesMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcsFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowLevelCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highLevelCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lowCommandsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mergeStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collaborationStyleTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VcsFeaturesMMPackageImpl() {
		super(eNS_URI, VcsFeaturesMMFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VcsFeaturesMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VcsFeaturesMMPackage init() {
		if (isInited) return (VcsFeaturesMMPackage)EPackage.Registry.INSTANCE.getEPackage(VcsFeaturesMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVcsFeaturesMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VcsFeaturesMMPackageImpl theVcsFeaturesMMPackage = registeredVcsFeaturesMMPackage instanceof VcsFeaturesMMPackageImpl ? (VcsFeaturesMMPackageImpl)registeredVcsFeaturesMMPackage : new VcsFeaturesMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVcsFeaturesMMPackage.createPackageContents();

		// Initialize created meta-data
		theVcsFeaturesMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVcsFeaturesMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VcsFeaturesMMPackage.eNS_URI, theVcsFeaturesMMPackage);
		return theVcsFeaturesMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVCSFeatures() {
		return vcsFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVCSFeatures_Commands() {
		return (EReference)vcsFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVCSFeatures_History() {
		return (EReference)vcsFeaturesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVCSFeatures_Versionunit() {
		return (EReference)vcsFeaturesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVCSFeatures_Collaborationstyle() {
		return (EReference)vcsFeaturesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVCSFeatures_Database() {
		return (EReference)vcsFeaturesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVCSFeatures_Name() {
		return (EAttribute)vcsFeaturesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommands() {
		return commandsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommands_MergeStrategy() {
		return (EAttribute)commandsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommands_Highlevelcommand() {
		return (EReference)commandsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommands_Lowlevelcommand() {
		return (EReference)commandsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistory() {
		return historyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistory_LabelType() {
		return (EAttribute)historyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistory_CommitHistoryRange() {
		return (EAttribute)historyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistory_NumberOfBranches() {
		return (EAttribute)historyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHistory_UniqueLabelString() {
		return (EAttribute)historyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionUnit() {
		return versionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionUnit_Granularity() {
		return (EAttribute)versionUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborationStyle() {
		return collaborationStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborationStyle_CollabStyle() {
		return (EAttribute)collaborationStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabase_ConnectionString() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabase_DatabaseType() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabase_Name() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLowLevelCommand() {
		return lowLevelCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLowLevelCommand_Name() {
		return (EAttribute)lowLevelCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLowLevelCommand_Command() {
		return (EAttribute)lowLevelCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHighLevelCommand() {
		return highLevelCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHighLevelCommand_Name() {
		return (EAttribute)highLevelCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHighLevelCommand_Lowlevelcommand() {
		return (EReference)highLevelCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLowCommands() {
		return lowCommandsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMergeStrategy() {
		return mergeStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLabelType() {
		return labelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatabaseType() {
		return databaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVersionUnitType() {
		return versionUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCollaborationStyleType() {
		return collaborationStyleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VcsFeaturesMMFactory getVcsFeaturesMMFactory() {
		return (VcsFeaturesMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vcsFeaturesEClass = createEClass(VCS_FEATURES);
		createEReference(vcsFeaturesEClass, VCS_FEATURES__COMMANDS);
		createEReference(vcsFeaturesEClass, VCS_FEATURES__HISTORY);
		createEReference(vcsFeaturesEClass, VCS_FEATURES__VERSIONUNIT);
		createEReference(vcsFeaturesEClass, VCS_FEATURES__COLLABORATIONSTYLE);
		createEReference(vcsFeaturesEClass, VCS_FEATURES__DATABASE);
		createEAttribute(vcsFeaturesEClass, VCS_FEATURES__NAME);

		commandsEClass = createEClass(COMMANDS);
		createEAttribute(commandsEClass, COMMANDS__MERGE_STRATEGY);
		createEReference(commandsEClass, COMMANDS__HIGHLEVELCOMMAND);
		createEReference(commandsEClass, COMMANDS__LOWLEVELCOMMAND);

		historyEClass = createEClass(HISTORY);
		createEAttribute(historyEClass, HISTORY__LABEL_TYPE);
		createEAttribute(historyEClass, HISTORY__COMMIT_HISTORY_RANGE);
		createEAttribute(historyEClass, HISTORY__NUMBER_OF_BRANCHES);
		createEAttribute(historyEClass, HISTORY__UNIQUE_LABEL_STRING);

		versionUnitEClass = createEClass(VERSION_UNIT);
		createEAttribute(versionUnitEClass, VERSION_UNIT__GRANULARITY);

		collaborationStyleEClass = createEClass(COLLABORATION_STYLE);
		createEAttribute(collaborationStyleEClass, COLLABORATION_STYLE__COLLAB_STYLE);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__CONNECTION_STRING);
		createEAttribute(databaseEClass, DATABASE__DATABASE_TYPE);
		createEAttribute(databaseEClass, DATABASE__NAME);

		lowLevelCommandEClass = createEClass(LOW_LEVEL_COMMAND);
		createEAttribute(lowLevelCommandEClass, LOW_LEVEL_COMMAND__NAME);
		createEAttribute(lowLevelCommandEClass, LOW_LEVEL_COMMAND__COMMAND);

		highLevelCommandEClass = createEClass(HIGH_LEVEL_COMMAND);
		createEAttribute(highLevelCommandEClass, HIGH_LEVEL_COMMAND__NAME);
		createEReference(highLevelCommandEClass, HIGH_LEVEL_COMMAND__LOWLEVELCOMMAND);

		// Create enums
		lowCommandsEEnum = createEEnum(LOW_COMMANDS);
		mergeStrategyEEnum = createEEnum(MERGE_STRATEGY);
		labelTypeEEnum = createEEnum(LABEL_TYPE);
		databaseTypeEEnum = createEEnum(DATABASE_TYPE);
		versionUnitTypeEEnum = createEEnum(VERSION_UNIT_TYPE);
		collaborationStyleTypeEEnum = createEEnum(COLLABORATION_STYLE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(vcsFeaturesEClass, VCSFeatures.class, "VCSFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCSFeatures_Commands(), this.getCommands(), null, "commands", null, 0, -1, VCSFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCSFeatures_History(), this.getHistory(), null, "history", null, 0, -1, VCSFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCSFeatures_Versionunit(), this.getVersionUnit(), null, "versionunit", null, 0, -1, VCSFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCSFeatures_Collaborationstyle(), this.getCollaborationStyle(), null, "collaborationstyle", null, 0, -1, VCSFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCSFeatures_Database(), this.getDatabase(), null, "database", null, 0, -1, VCSFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCSFeatures_Name(), ecorePackage.getEString(), "name", null, 0, 1, VCSFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandsEClass, Commands.class, "Commands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommands_MergeStrategy(), this.getMergeStrategy(), "mergeStrategy", null, 0, 1, Commands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommands_Highlevelcommand(), this.getHighLevelCommand(), null, "highlevelcommand", null, 0, -1, Commands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommands_Lowlevelcommand(), this.getLowLevelCommand(), null, "lowlevelcommand", null, 0, -1, Commands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historyEClass, History.class, "History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistory_LabelType(), this.getLabelType(), "labelType", "CommitHash", 0, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistory_CommitHistoryRange(), ecorePackage.getEInt(), "commitHistoryRange", "0", 0, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistory_NumberOfBranches(), ecorePackage.getEInt(), "numberOfBranches", "0", 0, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistory_UniqueLabelString(), ecorePackage.getEString(), "UniqueLabelString", null, 0, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionUnitEClass, VersionUnit.class, "VersionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionUnit_Granularity(), this.getVersionUnitType(), "granularity", null, 0, -1, VersionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationStyleEClass, CollaborationStyle.class, "CollaborationStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollaborationStyle_CollabStyle(), this.getCollaborationStyleType(), "collabStyle", null, 0, 1, CollaborationStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_ConnectionString(), ecorePackage.getEString(), "connectionString", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_DatabaseType(), this.getDatabaseType(), "DatabaseType", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowLevelCommandEClass, LowLevelCommand.class, "LowLevelCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLowLevelCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, LowLevelCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLowLevelCommand_Command(), this.getLowCommands(), "command", null, 1, 1, LowLevelCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(highLevelCommandEClass, HighLevelCommand.class, "HighLevelCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHighLevelCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, HighLevelCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighLevelCommand_Lowlevelcommand(), this.getLowLevelCommand(), null, "lowlevelcommand", null, 0, -1, HighLevelCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lowCommandsEEnum, LowCommands.class, "LowCommands");
		addEEnumLiteral(lowCommandsEEnum, LowCommands.ADD);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.CHECKOUT);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.CHECKOUT_CREATE);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.CLONE);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.COMMIT);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.CHERRY_PICK);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.CREATE_BRANCH);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.FETCH);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.INIT);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.PULL);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.PUSH);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.REMOTE_ADD);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.RM);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.LOG);
		addEEnumLiteral(lowCommandsEEnum, LowCommands.OPEN);

		initEEnum(mergeStrategyEEnum, MergeStrategy.class, "MergeStrategy");
		addEEnumLiteral(mergeStrategyEEnum, MergeStrategy.DSM_COMPARE);
		addEEnumLiteral(mergeStrategyEEnum, MergeStrategy.GIT_DIFF);

		initEEnum(labelTypeEEnum, LabelType.class, "LabelType");
		addEEnumLiteral(labelTypeEEnum, LabelType.UNIQUE);
		addEEnumLiteral(labelTypeEEnum, LabelType.COMMIT_HASH);
		addEEnumLiteral(labelTypeEEnum, LabelType.LABEL);

		initEEnum(databaseTypeEEnum, DatabaseType.class, "DatabaseType");
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.MONGO_DB);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.XMI);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.NEO4_J);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.SQL);

		initEEnum(versionUnitTypeEEnum, VersionUnitType.class, "VersionUnitType");
		addEEnumLiteral(versionUnitTypeEEnum, VersionUnitType.LINE);
		addEEnumLiteral(versionUnitTypeEEnum, VersionUnitType.SEMANTIC);
		addEEnumLiteral(versionUnitTypeEEnum, VersionUnitType.FILE);
		addEEnumLiteral(versionUnitTypeEEnum, VersionUnitType.ELEMENT);

		initEEnum(collaborationStyleTypeEEnum, CollaborationStyleType.class, "CollaborationStyleType");
		addEEnumLiteral(collaborationStyleTypeEEnum, CollaborationStyleType.LOCAL_ONLY);
		addEEnumLiteral(collaborationStyleTypeEEnum, CollaborationStyleType.REMOTE);

		// Create resource
		createResource(eNS_URI);
	}

} //VcsFeaturesMMPackageImpl
