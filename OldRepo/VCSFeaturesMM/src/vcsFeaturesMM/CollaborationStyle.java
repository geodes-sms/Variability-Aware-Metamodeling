/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.CollaborationStyle#getCollabStyle <em>Collab Style</em>}</li>
 * </ul>
 *
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getCollaborationStyle()
 * @model
 * @generated
 */
public interface CollaborationStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Collab Style</b></em>' attribute.
	 * The literals are from the enumeration {@link vcsFeaturesMM.CollaborationStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collab Style</em>' attribute.
	 * @see vcsFeaturesMM.CollaborationStyleType
	 * @see #setCollabStyle(CollaborationStyleType)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getCollaborationStyle_CollabStyle()
	 * @model
	 * @generated
	 */
	CollaborationStyleType getCollabStyle();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.CollaborationStyle#getCollabStyle <em>Collab Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collab Style</em>' attribute.
	 * @see vcsFeaturesMM.CollaborationStyleType
	 * @see #getCollabStyle()
	 * @generated
	 */
	void setCollabStyle(CollaborationStyleType value);

} // CollaborationStyle
