/**
 */
package vcsFeaturesMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Low Commands</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getLowCommands()
 * @model
 * @generated
 */
public enum LowCommands implements Enumerator {
	/**
	 * The '<em><b>Add</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(0, "Add", "Add"),

	/**
	 * The '<em><b>Checkout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKOUT_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKOUT(1, "Checkout", "Checkout"),

	/**
	 * The '<em><b>Checkout Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKOUT_CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKOUT_CREATE(2, "CheckoutCreate", "CheckoutCreate"),

	/**
	 * The '<em><b>Clone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLONE_VALUE
	 * @generated
	 * @ordered
	 */
	CLONE(3, "Clone", "Clone"),

	/**
	 * The '<em><b>Commit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMIT_VALUE
	 * @generated
	 * @ordered
	 */
	COMMIT(4, "Commit", "Commit"),

	/**
	 * The '<em><b>Cherry Pick</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHERRY_PICK_VALUE
	 * @generated
	 * @ordered
	 */
	CHERRY_PICK(5, "CherryPick", "CherryPick"),

	/**
	 * The '<em><b>Create Branch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_BRANCH_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_BRANCH(6, "CreateBranch", "CreateBranch"),

	/**
	 * The '<em><b>Fetch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FETCH_VALUE
	 * @generated
	 * @ordered
	 */
	FETCH(7, "Fetch", "Fetch"),

	/**
	 * The '<em><b>Init</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INIT_VALUE
	 * @generated
	 * @ordered
	 */
	INIT(8, "Init", "Init"),

	/**
	 * The '<em><b>Pull</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL_VALUE
	 * @generated
	 * @ordered
	 */
	PULL(9, "Pull", "Pull"),

	/**
	 * The '<em><b>Push</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH(10, "Push", "Push"),

	/**
	 * The '<em><b>Remote Add</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_ADD(11, "RemoteAdd", "RemoteAdd"),

	/**
	 * The '<em><b>Rm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RM_VALUE
	 * @generated
	 * @ordered
	 */
	RM(12, "Rm", "Rm"),

	/**
	 * The '<em><b>Log</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_VALUE
	 * @generated
	 * @ordered
	 */
	LOG(13, "Log", "Log"),

	/**
	 * The '<em><b>Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(14, "Open", "Open");

	/**
	 * The '<em><b>Add</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model name="Add"
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 0;

	/**
	 * The '<em><b>Checkout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKOUT
	 * @model name="Checkout"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKOUT_VALUE = 1;

	/**
	 * The '<em><b>Checkout Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKOUT_CREATE
	 * @model name="CheckoutCreate"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKOUT_CREATE_VALUE = 2;

	/**
	 * The '<em><b>Clone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLONE
	 * @model name="Clone"
	 * @generated
	 * @ordered
	 */
	public static final int CLONE_VALUE = 3;

	/**
	 * The '<em><b>Commit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMIT
	 * @model name="Commit"
	 * @generated
	 * @ordered
	 */
	public static final int COMMIT_VALUE = 4;

	/**
	 * The '<em><b>Cherry Pick</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHERRY_PICK
	 * @model name="CherryPick"
	 * @generated
	 * @ordered
	 */
	public static final int CHERRY_PICK_VALUE = 5;

	/**
	 * The '<em><b>Create Branch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_BRANCH
	 * @model name="CreateBranch"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_BRANCH_VALUE = 6;

	/**
	 * The '<em><b>Fetch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FETCH
	 * @model name="Fetch"
	 * @generated
	 * @ordered
	 */
	public static final int FETCH_VALUE = 7;

	/**
	 * The '<em><b>Init</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INIT
	 * @model name="Init"
	 * @generated
	 * @ordered
	 */
	public static final int INIT_VALUE = 8;

	/**
	 * The '<em><b>Pull</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULL
	 * @model name="Pull"
	 * @generated
	 * @ordered
	 */
	public static final int PULL_VALUE = 9;

	/**
	 * The '<em><b>Push</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH
	 * @model name="Push"
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_VALUE = 10;

	/**
	 * The '<em><b>Remote Add</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_ADD
	 * @model name="RemoteAdd"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_ADD_VALUE = 11;

	/**
	 * The '<em><b>Rm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RM
	 * @model name="Rm"
	 * @generated
	 * @ordered
	 */
	public static final int RM_VALUE = 12;

	/**
	 * The '<em><b>Log</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG
	 * @model name="Log"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_VALUE = 13;

	/**
	 * The '<em><b>Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model name="Open"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 14;

	/**
	 * An array of all the '<em><b>Low Commands</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LowCommands[] VALUES_ARRAY =
		new LowCommands[] {
			ADD,
			CHECKOUT,
			CHECKOUT_CREATE,
			CLONE,
			COMMIT,
			CHERRY_PICK,
			CREATE_BRANCH,
			FETCH,
			INIT,
			PULL,
			PUSH,
			REMOTE_ADD,
			RM,
			LOG,
			OPEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Low Commands</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LowCommands> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Low Commands</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LowCommands get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LowCommands result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Low Commands</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LowCommands getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LowCommands result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Low Commands</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LowCommands get(int value) {
		switch (value) {
			case ADD_VALUE: return ADD;
			case CHECKOUT_VALUE: return CHECKOUT;
			case CHECKOUT_CREATE_VALUE: return CHECKOUT_CREATE;
			case CLONE_VALUE: return CLONE;
			case COMMIT_VALUE: return COMMIT;
			case CHERRY_PICK_VALUE: return CHERRY_PICK;
			case CREATE_BRANCH_VALUE: return CREATE_BRANCH;
			case FETCH_VALUE: return FETCH;
			case INIT_VALUE: return INIT;
			case PULL_VALUE: return PULL;
			case PUSH_VALUE: return PUSH;
			case REMOTE_ADD_VALUE: return REMOTE_ADD;
			case RM_VALUE: return RM;
			case LOG_VALUE: return LOG;
			case OPEN_VALUE: return OPEN;
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
	private LowCommands(int value, String name, String literal) {
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
	
} //LowCommands
