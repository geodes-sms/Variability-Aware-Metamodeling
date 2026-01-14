/**
 */
package eCommercePMM.impl;

import eCommercePMM.ECommercePMMPackage;
import eCommercePMM.Item;
import eCommercePMM.ItemCatalog;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.impl.ItemCatalogImpl#getCatalogID <em>Catalog ID</em>}</li>
 *   <li>{@link eCommercePMM.impl.ItemCatalogImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemCatalogImpl extends EObjectImpl implements ItemCatalog {
	/**
	 * The default value of the '{@link #getCatalogID() <em>Catalog ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogID()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalogID() <em>Catalog ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogID()
	 * @generated
	 * @ordered
	 */
	protected String catalogID = CATALOG_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECommercePMMPackage.Literals.ITEM_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCatalogID() {
		return catalogID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogID(String newCatalogID) {
		String oldCatalogID = catalogID;
		catalogID = newCatalogID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.ITEM_CATALOG__CATALOG_ID, oldCatalogID, catalogID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<Item>(Item.class, this, ECommercePMMPackage.ITEM_CATALOG__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ECommercePMMPackage.ITEM_CATALOG__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case ECommercePMMPackage.ITEM_CATALOG__CATALOG_ID:
				return getCatalogID();
			case ECommercePMMPackage.ITEM_CATALOG__ITEM:
				return getItem();
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
			case ECommercePMMPackage.ITEM_CATALOG__CATALOG_ID:
				setCatalogID((String)newValue);
				return;
			case ECommercePMMPackage.ITEM_CATALOG__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
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
			case ECommercePMMPackage.ITEM_CATALOG__CATALOG_ID:
				setCatalogID(CATALOG_ID_EDEFAULT);
				return;
			case ECommercePMMPackage.ITEM_CATALOG__ITEM:
				getItem().clear();
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
			case ECommercePMMPackage.ITEM_CATALOG__CATALOG_ID:
				return CATALOG_ID_EDEFAULT == null ? catalogID != null : !CATALOG_ID_EDEFAULT.equals(catalogID);
			case ECommercePMMPackage.ITEM_CATALOG__ITEM:
				return item != null && !item.isEmpty();
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
		result.append(" (catalogID: ");
		result.append(catalogID);
		result.append(')');
		return result.toString();
	}

} //ItemCatalogImpl
