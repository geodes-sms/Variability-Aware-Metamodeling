/**
 */
package vcsFeaturesMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vcsFeaturesMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VcsFeaturesMMFactoryImpl extends EFactoryImpl implements VcsFeaturesMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VcsFeaturesMMFactory init() {
		try {
			VcsFeaturesMMFactory theVcsFeaturesMMFactory = (VcsFeaturesMMFactory)EPackage.Registry.INSTANCE.getEFactory(VcsFeaturesMMPackage.eNS_URI);
			if (theVcsFeaturesMMFactory != null) {
				return theVcsFeaturesMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VcsFeaturesMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcsFeaturesMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VcsFeaturesMMPackage.VCS_FEATURES: return createVCSFeatures();
			case VcsFeaturesMMPackage.COMMANDS: return createCommands();
			case VcsFeaturesMMPackage.HISTORY: return createHistory();
			case VcsFeaturesMMPackage.VERSION_UNIT: return createVersionUnit();
			case VcsFeaturesMMPackage.COLLABORATION_STYLE: return createCollaborationStyle();
			case VcsFeaturesMMPackage.DATABASE: return createDatabase();
			case VcsFeaturesMMPackage.LOW_LEVEL_COMMAND: return createLowLevelCommand();
			case VcsFeaturesMMPackage.HIGH_LEVEL_COMMAND: return createHighLevelCommand();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VcsFeaturesMMPackage.LOW_COMMANDS:
				return createLowCommandsFromString(eDataType, initialValue);
			case VcsFeaturesMMPackage.MERGE_STRATEGY:
				return createMergeStrategyFromString(eDataType, initialValue);
			case VcsFeaturesMMPackage.LABEL_TYPE:
				return createLabelTypeFromString(eDataType, initialValue);
			case VcsFeaturesMMPackage.DATABASE_TYPE:
				return createDatabaseTypeFromString(eDataType, initialValue);
			case VcsFeaturesMMPackage.VERSION_UNIT_TYPE:
				return createVersionUnitTypeFromString(eDataType, initialValue);
			case VcsFeaturesMMPackage.COLLABORATION_STYLE_TYPE:
				return createCollaborationStyleTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VcsFeaturesMMPackage.LOW_COMMANDS:
				return convertLowCommandsToString(eDataType, instanceValue);
			case VcsFeaturesMMPackage.MERGE_STRATEGY:
				return convertMergeStrategyToString(eDataType, instanceValue);
			case VcsFeaturesMMPackage.LABEL_TYPE:
				return convertLabelTypeToString(eDataType, instanceValue);
			case VcsFeaturesMMPackage.DATABASE_TYPE:
				return convertDatabaseTypeToString(eDataType, instanceValue);
			case VcsFeaturesMMPackage.VERSION_UNIT_TYPE:
				return convertVersionUnitTypeToString(eDataType, instanceValue);
			case VcsFeaturesMMPackage.COLLABORATION_STYLE_TYPE:
				return convertCollaborationStyleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VCSFeatures createVCSFeatures() {
		VCSFeaturesImpl vcsFeatures = new VCSFeaturesImpl();
		return vcsFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Commands createCommands() {
		CommandsImpl commands = new CommandsImpl();
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public History createHistory() {
		HistoryImpl history = new HistoryImpl();
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionUnit createVersionUnit() {
		VersionUnitImpl versionUnit = new VersionUnitImpl();
		return versionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborationStyle createCollaborationStyle() {
		CollaborationStyleImpl collaborationStyle = new CollaborationStyleImpl();
		return collaborationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowLevelCommand createLowLevelCommand() {
		LowLevelCommandImpl lowLevelCommand = new LowLevelCommandImpl();
		return lowLevelCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HighLevelCommand createHighLevelCommand() {
		HighLevelCommandImpl highLevelCommand = new HighLevelCommandImpl();
		return highLevelCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowCommands createLowCommandsFromString(EDataType eDataType, String initialValue) {
		LowCommands result = LowCommands.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLowCommandsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeStrategy createMergeStrategyFromString(EDataType eDataType, String initialValue) {
		MergeStrategy result = MergeStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMergeStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType createLabelTypeFromString(EDataType eDataType, String initialValue) {
		LabelType result = LabelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType createDatabaseTypeFromString(EDataType eDataType, String initialValue) {
		DatabaseType result = DatabaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionUnitType createVersionUnitTypeFromString(EDataType eDataType, String initialValue) {
		VersionUnitType result = VersionUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationStyleType createCollaborationStyleTypeFromString(EDataType eDataType, String initialValue) {
		CollaborationStyleType result = CollaborationStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollaborationStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VcsFeaturesMMPackage getVcsFeaturesMMPackage() {
		return (VcsFeaturesMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VcsFeaturesMMPackage getPackage() {
		return VcsFeaturesMMPackage.eINSTANCE;
	}

} //VcsFeaturesMMFactoryImpl
