/**
 */
package vcsFeaturesMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.Database#getConnectionString <em>Connection String</em>}</li>
 *   <li>{@link vcsFeaturesMM.Database#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link vcsFeaturesMM.Database#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection String</em>' attribute.
	 * @see #setConnectionString(String)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getDatabase_ConnectionString()
	 * @model
	 * @generated
	 */
	String getConnectionString();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.Database#getConnectionString <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection String</em>' attribute.
	 * @see #getConnectionString()
	 * @generated
	 */
	void setConnectionString(String value);

	/**
	 * Returns the value of the '<em><b>Database Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vcsFeaturesMM.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Type</em>' attribute.
	 * @see vcsFeaturesMM.DatabaseType
	 * @see #setDatabaseType(DatabaseType)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getDatabase_DatabaseType()
	 * @model
	 * @generated
	 */
	DatabaseType getDatabaseType();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.Database#getDatabaseType <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Type</em>' attribute.
	 * @see vcsFeaturesMM.DatabaseType
	 * @see #getDatabaseType()
	 * @generated
	 */
	void setDatabaseType(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getDatabase_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vcsFeaturesMM.Database#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Database
