/**
 */
package eCommercePMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.ItemCatalog#getCatalogID <em>Catalog ID</em>}</li>
 *   <li>{@link eCommercePMM.ItemCatalog#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see eCommercePMM.ECommercePMMPackage#getItemCatalog()
 * @model
 * @generated
 */
public interface ItemCatalog extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog ID</em>' attribute.
	 * @see #setCatalogID(String)
	 * @see eCommercePMM.ECommercePMMPackage#getItemCatalog_CatalogID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getCatalogID();

	/**
	 * Sets the value of the '{@link eCommercePMM.ItemCatalog#getCatalogID <em>Catalog ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog ID</em>' attribute.
	 * @see #getCatalogID()
	 * @generated
	 */
	void setCatalogID(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link eCommercePMM.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see eCommercePMM.ECommercePMMPackage#getItemCatalog_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItem();

} // ItemCatalog
