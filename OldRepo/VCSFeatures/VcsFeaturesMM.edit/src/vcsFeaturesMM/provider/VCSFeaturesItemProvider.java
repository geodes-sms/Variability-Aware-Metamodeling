/**
 */
package vcsFeaturesMM.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import vcsFeaturesMM.VCSFeatures;
import vcsFeaturesMM.VcsFeaturesMMFactory;
import vcsFeaturesMM.VcsFeaturesMMPackage;

/**
 * This is the item provider adapter for a {@link vcsFeaturesMM.VCSFeatures} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VCSFeaturesItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCSFeaturesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VCSFeatures_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VCSFeatures_name_feature", "_UI_VCSFeatures_type"),
				 VcsFeaturesMMPackage.Literals.VCS_FEATURES__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(VcsFeaturesMMPackage.Literals.VCS_FEATURES__COMMANDS);
			childrenFeatures.add(VcsFeaturesMMPackage.Literals.VCS_FEATURES__HISTORY);
			childrenFeatures.add(VcsFeaturesMMPackage.Literals.VCS_FEATURES__VERSIONUNIT);
			childrenFeatures.add(VcsFeaturesMMPackage.Literals.VCS_FEATURES__COLLABORATIONSTYLE);
			childrenFeatures.add(VcsFeaturesMMPackage.Literals.VCS_FEATURES__DATABASE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns VCSFeatures.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VCSFeatures"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VCSFeatures)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VCSFeatures_type") :
			getString("_UI_VCSFeatures_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VCSFeatures.class)) {
			case VcsFeaturesMMPackage.VCS_FEATURES__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VcsFeaturesMMPackage.VCS_FEATURES__COMMANDS:
			case VcsFeaturesMMPackage.VCS_FEATURES__HISTORY:
			case VcsFeaturesMMPackage.VCS_FEATURES__VERSIONUNIT:
			case VcsFeaturesMMPackage.VCS_FEATURES__COLLABORATIONSTYLE:
			case VcsFeaturesMMPackage.VCS_FEATURES__DATABASE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(VcsFeaturesMMPackage.Literals.VCS_FEATURES__COMMANDS,
				 VcsFeaturesMMFactory.eINSTANCE.createCommands()));

		newChildDescriptors.add
			(createChildParameter
				(VcsFeaturesMMPackage.Literals.VCS_FEATURES__HISTORY,
				 VcsFeaturesMMFactory.eINSTANCE.createHistory()));

		newChildDescriptors.add
			(createChildParameter
				(VcsFeaturesMMPackage.Literals.VCS_FEATURES__VERSIONUNIT,
				 VcsFeaturesMMFactory.eINSTANCE.createVersionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(VcsFeaturesMMPackage.Literals.VCS_FEATURES__COLLABORATIONSTYLE,
				 VcsFeaturesMMFactory.eINSTANCE.createCollaborationStyle()));

		newChildDescriptors.add
			(createChildParameter
				(VcsFeaturesMMPackage.Literals.VCS_FEATURES__DATABASE,
				 VcsFeaturesMMFactory.eINSTANCE.createDatabase()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VcsFeaturesMMEditPlugin.INSTANCE;
	}

}
