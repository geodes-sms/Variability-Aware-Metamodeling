package library.dialogs

class InitDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class InitDialog extends DialogUtils {
	
		private Text initText;
		private String initPath;
	
		public InitDialog(Shell parentShell) {
			super(parentShell, "To start versioning, you first need a repository where you can save different versions.",
					"Select a folder to initialize your repository");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite area = initMainArea(parent);
	
			Composite container = mainContainer(area);
	
			createLabel(container, "Path: ");
			initText = createText(container, true, false);
	
			return super.createDialogArea(parent);
		}
	
		@Override
		protected void saveInput() {
			initPath = initText.getText();
		}
	
		public String getPathToRepo() {
			return initPath;
		}
	
	}
	
	'''
}