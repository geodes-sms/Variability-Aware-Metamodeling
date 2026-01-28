package library.dialogs

class OpenDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class OpenDialog extends DialogUtils {
	
		private Text openText;
		private String openPath;
	
		public OpenDialog(Shell parentShell) {
			super(parentShell, "To start versioning, you first need a repository where you can save different versions.",
					"Choose a folder with a pre-existing .git file.");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite area = initMainArea(parent);
	
			Composite container = mainContainer(area);
	
			createLabel(container, "Path: ");
			openText = createText(container, true, false);
	
			return super.createDialogArea(parent);
		}
	
		@Override
		protected void saveInput() {
			openPath = openText.getText();
		}
	
		public String getPathToRepo() {
			return openPath;
		}
	
	}
	
	'''
}