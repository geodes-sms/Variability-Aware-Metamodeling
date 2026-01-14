/**
 */
package shapes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shapes.Circle#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see shapes.ShapesPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Shape {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see shapes.ShapesPackage#getCircle_Radius()
	 * @model
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link shapes.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

} // Circle
