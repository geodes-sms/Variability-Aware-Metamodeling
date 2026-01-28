package library.dialogs

class CheckoutDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import java.util.List;
	
	import org.eclipse.swt.SWT;
	import org.eclipse.swt.layout.GridData;
	import org.eclipse.swt.layout.GridLayout;
	import org.eclipse.swt.widgets.Combo;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	
	public class CheckoutDialog extends DialogUtils {
		List<String> branches;
		Combo combo;
		private String selection;
	
		public CheckoutDialog(Shell parentShell, List<String> branches) {
			super(parentShell, "Checkout is used to change between branches and work in a separate environment.",
					"Select a pre-existing branch to switch to.");
			setHelpAvailable(false);
			this.branches = branches;
		}
	
		@Override
		public void create() {
			// TODO Auto-generated method stub
			super.create();
		}
	
		@Override
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
			newShell.setText("CheckoutDialog");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			setMessage(message);
			setTitle(title);
			Composite area = (Composite) super.createDialogArea(parent);
	
			// Main container in which text labels can be inserted
			Composite container = new Composite(area, SWT.NONE);
			container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
	
			// Create the first label and its combo box
			createLabel(container, "Please select which branch you would like to checkout: ");
			combo = createComboButtons(container, branches);
	
			return super.createDialogArea(parent);
		}
	
		// Save content of the Text fields because they get disposed
		// as soon as the Dialog closes
		@Override
		protected void saveInput() {
			selection = combo.getItem(combo.getSelectionIndex());
		}
	
		public String getBranchSelection() {
			return selection;
		}
	
	}
	
	'''
}