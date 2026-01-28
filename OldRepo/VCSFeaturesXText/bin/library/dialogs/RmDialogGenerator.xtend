package library.dialogs

class RmDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class RmDialog extends DialogUtils {
		private Text pathToRepo;
		private String path;
	
		public RmDialog(Shell shell) {
			super(shell,
					"Rm is the counterpart command to Add. It removes files from versioning and deletes them from the tracking branch.",
					"Please enter a valid path to a file you want to remove from versioning.");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);
	
			createLabel(container, "Path to the file to remove: ");
			pathToRepo = createText(container, true, false);
	
			return super.createDialogArea(parent);
		}
	
		@Override
		protected void saveInput() {
			path = pathToRepo.getText();
		}
	
		public String getPathToRepo() {
			return path;
		}
	
	}
	
	'''
}