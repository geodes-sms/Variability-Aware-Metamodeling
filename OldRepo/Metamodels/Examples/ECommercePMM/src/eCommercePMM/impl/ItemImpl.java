/**
 */
package eCommercePMM.impl;

import eCommercePMM.Discount;
import eCommercePMM.ECommercePMMPackage;
import eCommercePMM.Item;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.impl.ItemImpl#getItemID <em>Item ID</em>}</li>
 *   <li>{@link eCommercePMM.impl.ItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link eCommercePMM.impl.ItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eCommercePMM.impl.ItemImpl#getDiscount <em>Discount</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ItemImpl extends EObjectImpl implements Item {
	/**
	 * The default value of the '{@link #getItemID() <em>Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemID()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemID() <em>Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemID()
	 * @generated
	 * @ordered
	 */
	protected String itemID = ITEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected Discount discount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ECommercePMMPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemID() {
		return itemID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemID(String newItemID) {
		String oldItemID = itemID;
		itemID = newItemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.ITEM__ITEM_ID, oldItemID, itemID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discount getDiscount() {
		if (discount != null && discount.eIsProxy()) {
			InternalEObject oldDiscount = (InternalEObject)discount;
			discount = (Discount)eResolveProxy(oldDiscount);
			if (discount != oldDiscount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ECommercePMMPackage.ITEM__DISCOUNT, oldDiscount, discount));
			}
		}
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discount basicGetDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscount(Discount newDiscount) {
		Discount oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ECommercePMMPackage.ITEM__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ECommercePMMPackage.ITEM__ITEM_ID:
				return getItemID();
			case ECommercePMMPackage.ITEM__NAME:
				return getName();
			case ECommercePMMPackage.ITEM__DESCRIPTION:
				return getDescription();
			case ECommercePMMPackage.ITEM__DISCOUNT:
				if (resolve) return getDiscount();
				return basicGetDiscount();
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
			case ECommercePMMPackage.ITEM__ITEM_ID:
				setItemID((String)newValue);
				return;
			case ECommercePMMPackage.ITEM__NAME:
				setName((String)newValue);
				return;
			case ECommercePMMPackage.ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ECommercePMMPackage.ITEM__DISCOUNT:
				setDiscount((Discount)newValue);
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
			case ECommercePMMPackage.ITEM__ITEM_ID:
				setItemID(ITEM_ID_EDEFAULT);
				return;
			case ECommercePMMPackage.ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ECommercePMMPackage.ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ECommercePMMPackage.ITEM__DISCOUNT:
				setDiscount((Discount)null);
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
			case ECommercePMMPackage.ITEM__ITEM_ID:
				return ITEM_ID_EDEFAULT == null ? itemID != null : !ITEM_ID_EDEFAULT.equals(itemID);
			case ECommercePMMPackage.ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ECommercePMMPackage.ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ECommercePMMPackage.ITEM__DISCOUNT:
				return discount != null;
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
		result.append(" (itemID: ");
		result.append(itemID);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
