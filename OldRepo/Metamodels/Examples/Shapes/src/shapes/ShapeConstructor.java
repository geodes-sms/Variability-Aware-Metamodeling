/**
 */
package shapes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shapes.ShapeConstructor#getShape <em>Shape</em>}</li>
 *   <li>{@link shapes.ShapeConstructor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see shapes.ShapesPackage#getShapeConstructor()
 * @model
 * @generated
 */
public interface ShapeConstructor extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference list.
	 * The list contents are of type {@link shapes.Shape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference list.
	 * @see shapes.ShapesPackage#getShapeConstructor_Shape()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shape> getShape();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see shapes.ShapesPackage#getShapeConstructor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link shapes.ShapeConstructor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ShapeConstructor
