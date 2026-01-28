package library.dialogs

class CreateBranchDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class CreateBranchDialog extends DialogUtils {
	
		private Text branchText;
		private String branch;
	
		public CreateBranchDialog(Shell parentShell) {
			super(parentShell,
					"CreateBranch is used to create a new branch with the current HEAD, without switching (checkout) to it.",
					"Type the name of the new branch.");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite area = initMainArea(parent);
	
			Composite container = mainContainer(area);
	
			// Create another label with a text box
			createLabel(container, "Branch name: ");
			branchText = createText(container, true, false);
	
			return super.createDialogArea(parent);
		}
	
		@Override
		protected void saveInput() {
			branch = branchText.getText();
		}
	
		public String getBranch() {
			return branch;
		}
	
	}
	
	'''
}