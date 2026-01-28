/**
 */
package vcsFeaturesMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import vcsFeaturesMM.CollaborationStyle;
import vcsFeaturesMM.CollaborationStyleType;
import vcsFeaturesMM.VcsFeaturesMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.impl.CollaborationStyleImpl#getCollabStyle <em>Collab Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationStyleImpl extends EObjectImpl implements CollaborationStyle {
	/**
	 * The default value of the '{@link #getCollabStyle() <em>Collab Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollabStyle()
	 * @generated
	 * @ordered
	 */
	protected static final CollaborationStyleType COLLAB_STYLE_EDEFAULT = CollaborationStyleType.LOCAL_ONLY;

	/**
	 * The cached value of the '{@link #getCollabStyle() <em>Collab Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollabStyle()
	 * @generated
	 * @ordered
	 */
	protected CollaborationStyleType collabStyle = COLLAB_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcsFeaturesMMPackage.Literals.COLLABORATION_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborationStyleType getCollabStyle() {
		return collabStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollabStyle(CollaborationStyleType newCollabStyle) {
		CollaborationStyleType oldCollabStyle = collabStyle;
		collabStyle = newCollabStyle == null ? COLLAB_STYLE_EDEFAULT : newCollabStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.COLLABORATION_STYLE__COLLAB_STYLE, oldCollabStyle, collabStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcsFeaturesMMPackage.COLLABORATION_STYLE__COLLAB_STYLE:
				return getCollabStyle();
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
			case VcsFeaturesMMPackage.COLLABORATION_STYLE__COLLAB_STYLE:
				setCollabStyle((CollaborationStyleType)newValue);
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
			case VcsFeaturesMMPackage.COLLABORATION_STYLE__COLLAB_STYLE:
				setCollabStyle(COLLAB_STYLE_EDEFAULT);
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
			case VcsFeaturesMMPackage.COLLABORATION_STYLE__COLLAB_STYLE:
				return collabStyle != COLLAB_STYLE_EDEFAULT;
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
		result.append(" (collabStyle: ");
		result.append(collabStyle);
		result.append(')');
		return result.toString();
	}

} //CollaborationStyleImpl
