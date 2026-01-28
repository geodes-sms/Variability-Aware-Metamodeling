package library.dialogs

class PathDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.jface.layout.GridDataFactory;
	import org.eclipse.swt.SWT;
	import org.eclipse.swt.layout.GridData;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Label;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public abstract class PathDialog extends DialogUtils {
		protected String message;
		protected String title;
	
		public PathDialog(Shell parentShell, String message, String title) {
			super(parentShell, message, title);
			setHelpAvailable(false);
		}
	
		@Override
		public void create() {
			super.create();
		}
	
		@Override
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
			newShell.setText("PathDialog");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite area = initMainArea(parent);
	
			Composite container = mainContainer(area);
	
			return super.createDialogArea(parent);
		}
	
		protected void createPathToRepo(Composite container, String pathText) {
			Label pathToRepoLabel = new Label(container, SWT.NONE);
			GridData gd_pathToRepoLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
			gd_pathToRepoLabel.widthHint = 52;
			pathToRepoLabel.setLayoutData(gd_pathToRepoLabel);
			pathToRepoLabel.setText(pathText);
			GridDataFactory.fillDefaults().grab(false, false).applyTo(pathToRepoLabel);
	
			Text pathToRepo = new Text(container, SWT.BORDER);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(pathToRepo);
		}
	
		@Override
		protected void okPressed() {
			saveInput();
			super.okPressed();
		}
	
		// Save content of the Text fields because they get disposed
		// as soon as the Dialog closes
		protected abstract void saveInput();
	
	}
	
	'''
}