/**
 */
package vcsFeaturesMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Database Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getDatabaseType()
 * @model
 * @generated
 */
public enum DatabaseType implements Enumerator {
	/**
	 * The '<em><b>Mongo DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGO_DB_VALUE
	 * @generated
	 * @ordered
	 */
	MONGO_DB(0, "MongoDB", "MongoDB"),

	/**
	 * The '<em><b>XMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMI_VALUE
	 * @generated
	 * @ordered
	 */
	XMI(1, "XMI", "XMI"),

	/**
	 * The '<em><b>Neo4 J</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEO4_J_VALUE
	 * @generated
	 * @ordered
	 */
	NEO4_J(2, "Neo4J", "Neo4J"),

	/**
	 * The '<em><b>SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL_VALUE
	 * @generated
	 * @ordered
	 */
	SQL(3, "SQL", "SQL");

	/**
	 * The '<em><b>Mongo DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGO_DB
	 * @model name="MongoDB"
	 * @generated
	 * @ordered
	 */
	public static final int MONGO_DB_VALUE = 0;

	/**
	 * The '<em><b>XMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XMI_VALUE = 1;

	/**
	 * The '<em><b>Neo4 J</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEO4_J
	 * @model name="Neo4J"
	 * @generated
	 * @ordered
	 */
	public static final int NEO4_J_VALUE = 2;

	/**
	 * The '<em><b>SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Database Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatabaseType[] VALUES_ARRAY =
		new DatabaseType[] {
			MONGO_DB,
			XMI,
			NEO4_J,
			SQL,
		};

	/**
	 * A public read-only list of all the '<em><b>Database Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatabaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatabaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatabaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseType get(int value) {
		switch (value) {
			case MONGO_DB_VALUE: return MONGO_DB;
			case XMI_VALUE: return XMI;
			case NEO4_J_VALUE: return NEO4_J;
			case SQL_VALUE: return SQL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DatabaseType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DatabaseType
