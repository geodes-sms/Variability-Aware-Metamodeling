/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.History#getLabelType <em>Label Type</em>}</li>
 *   <li>{@link vcsFeaturesMM.History#getCommitHistoryRange <em>Commit History Range</em>}</li>
 *   <li>{@link vcsFeaturesMM.History#getNumberOfBranches <em>Number Of Branches</em>}</li>
 *   <li>{@link vcsFeaturesMM.History#getUniqueLabelString <em>Unique Label String</em>}</li>
 * </ul>
 *
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Type</b></em>' attribute.
	 * The default value is <code>"CommitHash"</code>.
	 * The literals are from the enumeration {@link vcsFeaturesMM.LabelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Type</em>' attribute.
	 * @see vcsFeaturesMM.LabelType
	 * @see #setLabelType(LabelType)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getHistory_LabelType()
	 * @model default="CommitHash"
	 * @generated
	 */
	LabelType getLabelType();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.History#getLabelType <em>Label Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Type</em>' attribute.
	 * @see vcsFeaturesMM.LabelType
	 * @see #getLabelType()
	 * @generated
	 */
	void setLabelType(LabelType value);

	/**
	 * Returns the value of the '<em><b>Commit History Range</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit History Range</em>' attribute.
	 * @see #setCommitHistoryRange(int)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getHistory_CommitHistoryRange()
	 * @model default="0"
	 * @generated
	 */
	int getCommitHistoryRange();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.History#getCommitHistoryRange <em>Commit History Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit History Range</em>' attribute.
	 * @see #getCommitHistoryRange()
	 * @generated
	 */
	void setCommitHistoryRange(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Branches</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Branches</em>' attribute.
	 * @see #setNumberOfBranches(int)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getHistory_NumberOfBranches()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfBranches();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.History#getNumberOfBranches <em>Number Of Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Branches</em>' attribute.
	 * @see #getNumberOfBranches()
	 * @generated
	 */
	void setNumberOfBranches(int value);

	/**
	 * Returns the value of the '<em><b>Unique Label String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Label String</em>' attribute.
	 * @see #setUniqueLabelString(String)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getHistory_UniqueLabelString()
	 * @model
	 * @generated
	 */
	String getUniqueLabelString();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.History#getUniqueLabelString <em>Unique Label String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Label String</em>' attribute.
	 * @see #getUniqueLabelString()
	 * @generated
	 */
	void setUniqueLabelString(String value);

} // History
