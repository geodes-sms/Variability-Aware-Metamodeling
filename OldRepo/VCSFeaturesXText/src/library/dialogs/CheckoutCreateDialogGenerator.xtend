package library.dialogs

class CheckoutCreateDialogGenerator implements DialogGenerator{
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
	import org.eclipse.swt.widgets.Text;
	
	public class CheckoutCreateDialog extends DialogUtils {
		private List<String> branches;
		private Combo combo;
		private String selection;
		private Text text;
	
		public CheckoutCreateDialog(Shell parentShell, List<String> branches) {
			super(parentShell,
					"CheckoutCreate is used to change between branches and create a new branch if it doesn't exist.",
					"Select a pre-existing branch to switch to or type the name of your new branch. This will use the current HEAD as the basis of the new branch.");
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
			newShell.setText("CheckoutCreateDialog");
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
	
			// Create another label with a text box
			createLabel(container, "Or write the name of your new branch: ");
			text = createText(container, true, false);
	
			return super.createDialogArea(parent);
		}
	
		@Override
		protected void okPressed() {
			saveInput();
			super.okPressed();
		}
	
		// Save the combo selection if nothing is written in the text box, otherwise
		// take the text box
		@Override
		protected void saveInput() {
			if (text.getText() == null) {
				selection = combo.getItem(combo.getSelectionIndex());
			} else {
				selection = text.getText();
			}
		}
	
		public String getBranchSelection() {
			return selection;
		}
	
	}
	
	'''
}