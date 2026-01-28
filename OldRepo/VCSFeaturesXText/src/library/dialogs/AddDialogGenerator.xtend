package library.dialogs

class AddDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Label;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	/* TODO Change this dialog to something that can accept multiple paths (List)
	 *
	 * I could fetch the path to the registered repositories and then print that into a combo box.
	 * Depending on the selection, I could show a list of all the files the user can choose. From there, combine the strings together and pass it along to the AddCommand.
	 * */
	public class AddDialog extends PathDialog {
		private Text pathToRepo;
		private String path;
		private Label pathToLabel;
	
		public AddDialog(Shell shell) {
			super(shell, "Give a path to a file that you wish to start versioning, within a repository.",
					"Select a file to version");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);
	
			pathToLabel = createLabel(container, "Path to the file to add: ");
			pathToRepo = createText(container, true, false);
			return super.createDialogArea(parent);
		}
	
		// Save content of the Text fields because they get disposed
		// as soon as the Dialog closes
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