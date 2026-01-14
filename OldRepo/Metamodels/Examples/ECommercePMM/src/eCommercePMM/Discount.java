/**
 */
package eCommercePMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.Discount#getDiscountID <em>Discount ID</em>}</li>
 *   <li>{@link eCommercePMM.Discount#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see eCommercePMM.ECommercePMMPackage#getDiscount()
 * @model
 * @generated
 */
public interface Discount extends EObject {
	/**
	 * Returns the value of the '<em><b>Discount ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount ID</em>' attribute.
	 * @see #setDiscountID(String)
	 * @see eCommercePMM.ECommercePMMPackage#getDiscount_DiscountID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getDiscountID();

	/**
	 * Sets the value of the '{@link eCommercePMM.Discount#getDiscountID <em>Discount ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount ID</em>' attribute.
	 * @see #getDiscountID()
	 * @generated
	 */
	void setDiscountID(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see eCommercePMM.ECommercePMMPackage#getDiscount_Amount()
	 * @model
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link eCommercePMM.Discount#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

} // Discount
