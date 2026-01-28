/**
 */
package vcsFeaturesMM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import vcsFeaturesMM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see vcsFeaturesMM.VcsFeaturesMMPackage
 * @generated
 */
public class VcsFeaturesMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VcsFeaturesMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcsFeaturesMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VcsFeaturesMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcsFeaturesMMSwitch<Adapter> modelSwitch =
		new VcsFeaturesMMSwitch<Adapter>() {
			@Override
			public Adapter caseVCSFeatures(VCSFeatures object) {
				return createVCSFeaturesAdapter();
			}
			@Override
			public Adapter caseCommands(Commands object) {
				return createCommandsAdapter();
			}
			@Override
			public Adapter caseHistory(History object) {
				return createHistoryAdapter();
			}
			@Override
			public Adapter caseVersionUnit(VersionUnit object) {
				return createVersionUnitAdapter();
			}
			@Override
			public Adapter caseCollaborationStyle(CollaborationStyle object) {
				return createCollaborationStyleAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseLowLevelCommand(LowLevelCommand object) {
				return createLowLevelCommandAdapter();
			}
			@Override
			public Adapter caseHighLevelCommand(HighLevelCommand object) {
				return createHighLevelCommandAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link vcsFeaturesMM.VCSFeatures <em>VCS Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vcsFeaturesMM.VCSFeatures
	 * @generated
	 */
	public Adapter createVCSFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vcsFeaturesMM.Commands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vcsFeaturesMM.Commands
	 * @generated
	 */
	public Adapter createCommandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vcsFeaturesMM.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vcsFeaturesMM.History
	 * @generated
	 */
	public Adapter createHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vcsFeaturesMM.VersionUnit <em>Version Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vcsFeaturesMM.VersionUnit
	 * @generated
	 */
	public Adapter createVersionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vcsFeaturesMM.CollaborationStyle <em>Collaboration Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vcsFeaturesMM.CollaborationStyle
	 * @generated
	 */
	public Adapter createCollaborationStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vcsFeaturesMM.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vcsFeaturesMM.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vcsFeaturesMM.LowLevelCommand <em>Low Level Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vcsFeaturesMM.LowLevelCommand
	 * @generated
	 */
	public Adapter createLowLevelCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link vcsFeaturesMM.HighLevelCommand <em>High Level Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see vcsFeaturesMM.HighLevelCommand
	 * @generated
	 */
	public Adapter createHighLevelCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VcsFeaturesMMAdapterFactory
