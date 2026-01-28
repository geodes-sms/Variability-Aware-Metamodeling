/**
 */
package vcsFeaturesMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import vcsFeaturesMM.Database;
import vcsFeaturesMM.DatabaseType;
import vcsFeaturesMM.VcsFeaturesMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.impl.DatabaseImpl#getConnectionString <em>Connection String</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.DatabaseImpl#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.DatabaseImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends EObjectImpl implements Database {
	/**
	 * The default value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionString()
	 * @generated
	 * @ordered
	 */
	protected String connectionString = CONNECTION_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseType DATABASE_TYPE_EDEFAULT = DatabaseType.MONGO_DB;

	/**
	 * The cached value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected DatabaseType databaseType = DATABASE_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcsFeaturesMMPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectionString() {
		return connectionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionString(String newConnectionString) {
		String oldConnectionString = connectionString;
		connectionString = newConnectionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.DATABASE__CONNECTION_STRING, oldConnectionString, connectionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType getDatabaseType() {
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseType(DatabaseType newDatabaseType) {
		DatabaseType oldDatabaseType = databaseType;
		databaseType = newDatabaseType == null ? DATABASE_TYPE_EDEFAULT : newDatabaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.DATABASE__DATABASE_TYPE, oldDatabaseType, databaseType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.DATABASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcsFeaturesMMPackage.DATABASE__CONNECTION_STRING:
				return getConnectionString();
			case VcsFeaturesMMPackage.DATABASE__DATABASE_TYPE:
				return getDatabaseType();
			case VcsFeaturesMMPackage.DATABASE__NAME:
				return getName();
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
			case VcsFeaturesMMPackage.DATABASE__CONNECTION_STRING:
				setConnectionString((String)newValue);
				return;
			case VcsFeaturesMMPackage.DATABASE__DATABASE_TYPE:
				setDatabaseType((DatabaseType)newValue);
				return;
			case VcsFeaturesMMPackage.DATABASE__NAME:
				setName((String)newValue);
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
			case VcsFeaturesMMPackage.DATABASE__CONNECTION_STRING:
				setConnectionString(CONNECTION_STRING_EDEFAULT);
				return;
			case VcsFeaturesMMPackage.DATABASE__DATABASE_TYPE:
				setDatabaseType(DATABASE_TYPE_EDEFAULT);
				return;
			case VcsFeaturesMMPackage.DATABASE__NAME:
				setName(NAME_EDEFAULT);
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
			case VcsFeaturesMMPackage.DATABASE__CONNECTION_STRING:
				return CONNECTION_STRING_EDEFAULT == null ? connectionString != null : !CONNECTION_STRING_EDEFAULT.equals(connectionString);
			case VcsFeaturesMMPackage.DATABASE__DATABASE_TYPE:
				return databaseType != DATABASE_TYPE_EDEFAULT;
			case VcsFeaturesMMPackage.DATABASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (connectionString: ");
		result.append(connectionString);
		result.append(", DatabaseType: ");
		result.append(databaseType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
