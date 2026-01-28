/**
 */
package vcsFeaturesMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vcsFeaturesMM.Commands;
import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.MergeStrategy;
import vcsFeaturesMM.VcsFeaturesMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commands</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.impl.CommandsImpl#getMergeStrategy <em>Merge Strategy</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.CommandsImpl#getHighlevelcommand <em>Highlevelcommand</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.CommandsImpl#getLowlevelcommand <em>Lowlevelcommand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandsImpl extends EObjectImpl implements Commands {
	/**
	 * The default value of the '{@link #getMergeStrategy() <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final MergeStrategy MERGE_STRATEGY_EDEFAULT = MergeStrategy.DSM_COMPARE;

	/**
	 * The cached value of the '{@link #getMergeStrategy() <em>Merge Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeStrategy()
	 * @generated
	 * @ordered
	 */
	protected MergeStrategy mergeStrategy = MERGE_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHighlevelcommand() <em>Highlevelcommand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighlevelcommand()
	 * @generated
	 * @ordered
	 */
	protected EList<HighLevelCommand> highlevelcommand;

	/**
	 * The cached value of the '{@link #getLowlevelcommand() <em>Lowlevelcommand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowlevelcommand()
	 * @generated
	 * @ordered
	 */
	protected EList<LowLevelCommand> lowlevelcommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcsFeaturesMMPackage.Literals.COMMANDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeStrategy getMergeStrategy() {
		return mergeStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeStrategy(MergeStrategy newMergeStrategy) {
		MergeStrategy oldMergeStrategy = mergeStrategy;
		mergeStrategy = newMergeStrategy == null ? MERGE_STRATEGY_EDEFAULT : newMergeStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.COMMANDS__MERGE_STRATEGY, oldMergeStrategy, mergeStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HighLevelCommand> getHighlevelcommand() {
		if (highlevelcommand == null) {
			highlevelcommand = new EObjectContainmentEList<HighLevelCommand>(HighLevelCommand.class, this, VcsFeaturesMMPackage.COMMANDS__HIGHLEVELCOMMAND);
		}
		return highlevelcommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LowLevelCommand> getLowlevelcommand() {
		if (lowlevelcommand == null) {
			lowlevelcommand = new EObjectContainmentEList<LowLevelCommand>(LowLevelCommand.class, this, VcsFeaturesMMPackage.COMMANDS__LOWLEVELCOMMAND);
		}
		return lowlevelcommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VcsFeaturesMMPackage.COMMANDS__HIGHLEVELCOMMAND:
				return ((InternalEList<?>)getHighlevelcommand()).basicRemove(otherEnd, msgs);
			case VcsFeaturesMMPackage.COMMANDS__LOWLEVELCOMMAND:
				return ((InternalEList<?>)getLowlevelcommand()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcsFeaturesMMPackage.COMMANDS__MERGE_STRATEGY:
				return getMergeStrategy();
			case VcsFeaturesMMPackage.COMMANDS__HIGHLEVELCOMMAND:
				return getHighlevelcommand();
			case VcsFeaturesMMPackage.COMMANDS__LOWLEVELCOMMAND:
				return getLowlevelcommand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VcsFeaturesMMPackage.COMMANDS__MERGE_STRATEGY:
				setMergeStrategy((MergeStrategy)newValue);
				return;
			case VcsFeaturesMMPackage.COMMANDS__HIGHLEVELCOMMAND:
				getHighlevelcommand().clear();
				getHighlevelcommand().addAll((Collection<? extends HighLevelCommand>)newValue);
				return;
			case VcsFeaturesMMPackage.COMMANDS__LOWLEVELCOMMAND:
				getLowlevelcommand().clear();
				getLowlevelcommand().addAll((Collection<? extends LowLevelCommand>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VcsFeaturesMMPackage.COMMANDS__MERGE_STRATEGY:
				setMergeStrategy(MERGE_STRATEGY_EDEFAULT);
				return;
			case VcsFeaturesMMPackage.COMMANDS__HIGHLEVELCOMMAND:
				getHighlevelcommand().clear();
				return;
			case VcsFeaturesMMPackage.COMMANDS__LOWLEVELCOMMAND:
				getLowlevelcommand().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VcsFeaturesMMPackage.COMMANDS__MERGE_STRATEGY:
				return mergeStrategy != MERGE_STRATEGY_EDEFAULT;
			case VcsFeaturesMMPackage.COMMANDS__HIGHLEVELCOMMAND:
				return highlevelcommand != null && !highlevelcommand.isEmpty();
			case VcsFeaturesMMPackage.COMMANDS__LOWLEVELCOMMAND:
				return lowlevelcommand != null && !lowlevelcommand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mergeStrategy: ");
		result.append(mergeStrategy);
		result.append(')');
		return result.toString();
	}

} //CommandsImpl
