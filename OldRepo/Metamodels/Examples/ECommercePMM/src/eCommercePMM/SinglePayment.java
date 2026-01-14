/**
 */
package eCommercePMM;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.SinglePayment#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link eCommercePMM.SinglePayment#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see eCommercePMM.ECommercePMMPackage#getSinglePayment()
 * @model
 * @generated
 */
public interface SinglePayment extends PaymentType {
	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(double)
	 * @see eCommercePMM.ECommercePMMPackage#getSinglePayment_TotalAmount()
	 * @model
	 * @generated
	 */
	double getTotalAmount();

	/**
	 * Sets the value of the '{@link eCommercePMM.SinglePayment#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(double value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see eCommercePMM.ECommercePMMPackage#getSinglePayment_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link eCommercePMM.SinglePayment#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // SinglePayment
