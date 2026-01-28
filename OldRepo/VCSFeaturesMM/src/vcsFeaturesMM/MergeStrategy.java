/**
 */
package vcsFeaturesMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Merge Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vcsFeaturesMM.VcsFeaturesMMPackage#getMergeStrategy()
 * @model
 * @generated
 */
public enum MergeStrategy implements Enumerator {
	/**
	 * The '<em><b>DSM Compare</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSM_COMPARE_VALUE
	 * @generated
	 * @ordered
	 */
	DSM_COMPARE(0, "DSMCompare", "DSMCompare"),

	/**
	 * The '<em><b>Git Diff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIT_DIFF_VALUE
	 * @generated
	 * @ordered
	 */
	GIT_DIFF(1, "GitDiff", "GitDiff");

	/**
	 * The '<em><b>DSM Compare</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSM_COMPARE
	 * @model name="DSMCompare"
	 * @generated
	 * @ordered
	 */
	public static final int DSM_COMPARE_VALUE = 0;

	/**
	 * The '<em><b>Git Diff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIT_DIFF
	 * @model name="GitDiff"
	 * @generated
	 * @ordered
	 */
	public static final int GIT_DIFF_VALUE = 1;

	/**
	 * An array of all the '<em><b>Merge Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MergeStrategy[] VALUES_ARRAY =
		new MergeStrategy[] {
			DSM_COMPARE,
			GIT_DIFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Merge Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MergeStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Merge Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MergeStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MergeStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Merge Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MergeStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MergeStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Merge Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MergeStrategy get(int value) {
		switch (value) {
			case DSM_COMPARE_VALUE: return DSM_COMPARE;
			case GIT_DIFF_VALUE: return GIT_DIFF;
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
	private MergeStrategy(int value, String name, String literal) {
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
	
} //MergeStrategy
