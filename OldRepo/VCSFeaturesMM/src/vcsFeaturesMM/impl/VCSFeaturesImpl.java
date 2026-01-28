/**
 */
package vcsFeaturesMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vcsFeaturesMM.CollaborationStyle;
import vcsFeaturesMM.Commands;
import vcsFeaturesMM.Database;
import vcsFeaturesMM.History;
import vcsFeaturesMM.VCSFeatures;
import vcsFeaturesMM.VcsFeaturesMMPackage;
import vcsFeaturesMM.VersionUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VCS Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vcsFeaturesMM.impl.VCSFeaturesImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.VCSFeaturesImpl#getHistory <em>History</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.VCSFeaturesImpl#getVersionunit <em>Versionunit</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.VCSFeaturesImpl#getCollaborationstyle <em>Collaborationstyle</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.VCSFeaturesImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link vcsFeaturesMM.impl.VCSFeaturesImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VCSFeaturesImpl extends EObjectImpl implements VCSFeatures {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Commands> commands;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<History> history;

	/**
	 * The cached value of the '{@link #getVersionunit() <em>Versionunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionunit()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionUnit> versionunit;

	/**
	 * The cached value of the '{@link #getCollaborationstyle() <em>Collaborationstyle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationstyle()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationStyle> collaborationstyle;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> database;

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
	protected VCSFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcsFeaturesMMPackage.Literals.VCS_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Commands> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Commands>(Commands.class, this, VcsFeaturesMMPackage.VCS_FEATURES__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<History> getHistory() {
		if (history == null) {
			history = new EObjectContainmentEList<History>(History.class, this, VcsFeaturesMMPackage.VCS_FEATURES__HISTORY);
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VersionUnit> getVersionunit() {
		if (versionunit == null) {
			versionunit = new EObjectContainmentEList<VersionUnit>(VersionUnit.class, this, VcsFeaturesMMPackage.VCS_FEATURES__VERSIONUNIT);
		}
		return versionunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CollaborationStyle> getCollaborationstyle() {
		if (collaborationstyle == null) {
			collaborationstyle = new EObjectContainmentEList<CollaborationStyle>(CollaborationStyle.class, this, VcsFeaturesMMPackage.VCS_FEATURES__COLLABORATIONSTYLE);
		}
		return collaborationstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Database> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<Database>(Database.class, this, VcsFeaturesMMPackage.VCS_FEATURES__DATABASE);
		}
		return database;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VcsFeaturesMMPackage.VCS_FEATURES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VcsFeaturesMMPackage.VCS_FEATURES__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case VcsFeaturesMMPackage.VCS_FEATURES__HISTORY:
				return ((InternalEList<?>)getHistory()).basicRemove(otherEnd, msgs);
			case VcsFeaturesMMPackage.VCS_FEATURES__VERSIONUNIT:
				return ((InternalEList<?>)getVersionunit()).basicRemove(otherEnd, msgs);
			case VcsFeaturesMMPackage.VCS_FEATURES__COLLABORATIONSTYLE:
				return ((InternalEList<?>)getCollaborationstyle()).basicRemove(otherEnd, msgs);
			case VcsFeaturesMMPackage.VCS_FEATURES__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcsFeaturesMMPackage.VCS_FEATURES__COMMANDS:
				return getCommands();
			case VcsFeaturesMMPackage.VCS_FEATURES__HISTORY:
				return getHistory();
			case VcsFeaturesMMPackage.VCS_FEATURES__VERSIONUNIT:
				return getVersionunit();
			case VcsFeaturesMMPackage.VCS_FEATURES__COLLABORATIONSTYLE:
				return getCollaborationstyle();
			case VcsFeaturesMMPackage.VCS_FEATURES__DATABASE:
				return getDatabase();
			case VcsFeaturesMMPackage.VCS_FEATURES__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VcsFeaturesMMPackage.VCS_FEATURES__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Commands>)newValue);
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends History>)newValue);
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__VERSIONUNIT:
				getVersionunit().clear();
				getVersionunit().addAll((Collection<? extends VersionUnit>)newValue);
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__COLLABORATIONSTYLE:
				getCollaborationstyle().clear();
				getCollaborationstyle().addAll((Collection<? extends CollaborationStyle>)newValue);
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends Database>)newValue);
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__NAME:
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
			case VcsFeaturesMMPackage.VCS_FEATURES__COMMANDS:
				getCommands().clear();
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__HISTORY:
				getHistory().clear();
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__VERSIONUNIT:
				getVersionunit().clear();
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__COLLABORATIONSTYLE:
				getCollaborationstyle().clear();
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__DATABASE:
				getDatabase().clear();
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__NAME:
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
			case VcsFeaturesMMPackage.VCS_FEATURES__COMMANDS:
				return commands != null && !commands.isEmpty();
			case VcsFeaturesMMPackage.VCS_FEATURES__HISTORY:
				return history != null && !history.isEmpty();
			case VcsFeaturesMMPackage.VCS_FEATURES__VERSIONUNIT:
				return versionunit != null && !versionunit.isEmpty();
			case VcsFeaturesMMPackage.VCS_FEATURES__COLLABORATIONSTYLE:
				return collaborationstyle != null && !collaborationstyle.isEmpty();
			case VcsFeaturesMMPackage.VCS_FEATURES__DATABASE:
				return database != null && !database.isEmpty();
			case VcsFeaturesMMPackage.VCS_FEATURES__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VCSFeaturesImpl
