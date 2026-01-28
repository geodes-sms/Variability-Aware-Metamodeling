/**
 */
package vcsFeaturesMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import vcsFeaturesMM.History;
import vcsFeaturesMM.LabelType;
import vcsFeaturesMM.VcsFeaturesMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.impl.HistoryImpl#getLabelType <em>Label Type</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.HistoryImpl#getCommitHistoryRange <em>Commit History Range</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.HistoryImpl#getNumberOfBranches <em>Number Of Branches</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.HistoryImpl#getUniqueLabelString <em>Unique Label String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryImpl extends EObjectImpl implements History {
	/**
	 * The default value of the '{@link #getLabelType() <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelType()
	 * @generated
	 * @ordered
	 */
	protected static final LabelType LABEL_TYPE_EDEFAULT = LabelType.COMMIT_HASH;

	/**
	 * The cached value of the '{@link #getLabelType() <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelType()
	 * @generated
	 * @ordered
	 */
	protected LabelType labelType = LABEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommitHistoryRange() <em>Commit History Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitHistoryRange()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMIT_HISTORY_RANGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommitHistoryRange() <em>Commit History Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitHistoryRange()
	 * @generated
	 * @ordered
	 */
	protected int commitHistoryRange = COMMIT_HISTORY_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfBranches() <em>Number Of Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBranches()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BRANCHES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfBranches() <em>Number Of Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBranches()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBranches = NUMBER_OF_BRANCHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueLabelString() <em>Unique Label String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueLabelString()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_LABEL_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueLabelString() <em>Unique Label String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueLabelString()
	 * @generated
	 * @ordered
	 */
	protected String uniqueLabelString = UNIQUE_LABEL_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcsFeaturesMMPackage.Literals.HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabelType() {
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelType(LabelType newLabelType) {
		LabelType oldLabelType = labelType;
		labelType = newLabelType == null ? LABEL_TYPE_EDEFAULT : newLabelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.HISTORY__LABEL_TYPE, oldLabelType, labelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCommitHistoryRange() {
		return commitHistoryRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommitHistoryRange(int newCommitHistoryRange) {
		int oldCommitHistoryRange = commitHistoryRange;
		commitHistoryRange = newCommitHistoryRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.HISTORY__COMMIT_HISTORY_RANGE, oldCommitHistoryRange, commitHistoryRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfBranches() {
		return numberOfBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfBranches(int newNumberOfBranches) {
		int oldNumberOfBranches = numberOfBranches;
		numberOfBranches = newNumberOfBranches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.HISTORY__NUMBER_OF_BRANCHES, oldNumberOfBranches, numberOfBranches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniqueLabelString() {
		return uniqueLabelString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueLabelString(String newUniqueLabelString) {
		String oldUniqueLabelString = uniqueLabelString;
		uniqueLabelString = newUniqueLabelString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.HISTORY__UNIQUE_LABEL_STRING, oldUniqueLabelString, uniqueLabelString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcsFeaturesMMPackage.HISTORY__LABEL_TYPE:
				return getLabelType();
			case VcsFeaturesMMPackage.HISTORY__COMMIT_HISTORY_RANGE:
				return getCommitHistoryRange();
			case VcsFeaturesMMPackage.HISTORY__NUMBER_OF_BRANCHES:
				return getNumberOfBranches();
			case VcsFeaturesMMPackage.HISTORY__UNIQUE_LABEL_STRING:
				return getUniqueLabelString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VcsFeaturesMMPackage.HISTORY__LABEL_TYPE:
				setLabelType((LabelType)newValue);
				return;
			case VcsFeaturesMMPackage.HISTORY__COMMIT_HISTORY_RANGE:
				setCommitHistoryRange((Integer)newValue);
				return;
			case VcsFeaturesMMPackage.HISTORY__NUMBER_OF_BRANCHES:
				setNumberOfBranches((Integer)newValue);
				return;
			case VcsFeaturesMMPackage.HISTORY__UNIQUE_LABEL_STRING:
				setUniqueLabelString((String)newValue);
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
			case VcsFeaturesMMPackage.HISTORY__LABEL_TYPE:
				setLabelType(LABEL_TYPE_EDEFAULT);
				return;
			case VcsFeaturesMMPackage.HISTORY__COMMIT_HISTORY_RANGE:
				setCommitHistoryRange(COMMIT_HISTORY_RANGE_EDEFAULT);
				return;
			case VcsFeaturesMMPackage.HISTORY__NUMBER_OF_BRANCHES:
				setNumberOfBranches(NUMBER_OF_BRANCHES_EDEFAULT);
				return;
			case VcsFeaturesMMPackage.HISTORY__UNIQUE_LABEL_STRING:
				setUniqueLabelString(UNIQUE_LABEL_STRING_EDEFAULT);
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
			case VcsFeaturesMMPackage.HISTORY__LABEL_TYPE:
				return labelType != LABEL_TYPE_EDEFAULT;
			case VcsFeaturesMMPackage.HISTORY__COMMIT_HISTORY_RANGE:
				return commitHistoryRange != COMMIT_HISTORY_RANGE_EDEFAULT;
			case VcsFeaturesMMPackage.HISTORY__NUMBER_OF_BRANCHES:
				return numberOfBranches != NUMBER_OF_BRANCHES_EDEFAULT;
			case VcsFeaturesMMPackage.HISTORY__UNIQUE_LABEL_STRING:
				return UNIQUE_LABEL_STRING_EDEFAULT == null ? uniqueLabelString != null : !UNIQUE_LABEL_STRING_EDEFAULT.equals(uniqueLabelString);
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
		result.append(" (labelType: ");
		result.append(labelType);
		result.append(", commitHistoryRange: ");
		result.append(commitHistoryRange);
		result.append(", numberOfBranches: ");
		result.append(numberOfBranches);
		result.append(", UniqueLabelString: ");
		result.append(uniqueLabelString);
		result.append(')');
		return result.toString();
	}

} //HistoryImpl
