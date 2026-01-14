/**
 */
package eCommercePMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.Item#getItemID <em>Item ID</em>}</li>
 *   <li>{@link eCommercePMM.Item#getName <em>Name</em>}</li>
 *   <li>{@link eCommercePMM.Item#getDescription <em>Description</em>}</li>
 *   <li>{@link eCommercePMM.Item#getDiscount <em>Discount</em>}</li>
 * </ul>
 *
 * @see eCommercePMM.ECommercePMMPackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item ID</em>' attribute.
	 * @see #setItemID(String)
	 * @see eCommercePMM.ECommercePMMPackage#getItem_ItemID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getItemID();

	/**
	 * Sets the value of the '{@link eCommercePMM.Item#getItemID <em>Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item ID</em>' attribute.
	 * @see #getItemID()
	 * @generated
	 */
	void setItemID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eCommercePMM.ECommercePMMPackage#getItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eCommercePMM.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eCommercePMM.ECommercePMMPackage#getItem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eCommercePMM.Item#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' reference.
	 * @see #setDiscount(Discount)
	 * @see eCommercePMM.ECommercePMMPackage#getItem_Discount()
	 * @model
	 * @generated
	 */
	Discount getDiscount();

	/**
	 * Sets the value of the '{@link eCommercePMM.Item#getDiscount <em>Discount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' reference.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(Discount value);

} // Item
