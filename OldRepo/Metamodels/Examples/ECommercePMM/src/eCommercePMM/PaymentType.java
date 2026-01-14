/**
 */
package eCommercePMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eCommercePMM.PaymentType#getBillID <em>Bill ID</em>}</li>
 * </ul>
 *
 * @see eCommercePMM.ECommercePMMPackage#getPaymentType()
 * @model abstract="true"
 * @generated
 */
public interface PaymentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bill ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill ID</em>' attribute.
	 * @see #setBillID(String)
	 * @see eCommercePMM.ECommercePMMPackage#getPaymentType_BillID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getBillID();

	/**
	 * Sets the value of the '{@link eCommercePMM.PaymentType#getBillID <em>Bill ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill ID</em>' attribute.
	 * @see #getBillID()
	 * @generated
	 */
	void setBillID(String value);

} // PaymentType
