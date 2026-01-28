package library.dialogs

class RemoteAddDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.swt.SWT;
	import org.eclipse.swt.layout.GridData;
	import org.eclipse.swt.layout.GridLayout;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class RemoteAddDialog extends DialogUtils {
	
		private Text remoteNameText;
		private Text remoteURLText;
		private String remoteName;
		private String remoteURL;
	
		public RemoteAddDialog(Shell parentShell) {
			super(parentShell,
					"Remote Add is used to add a remote repository to a local repository. It is useful if you want to start tracking remote branches and work collaboratively.",
					"Enter the URL for the remote repository.");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			super.createDialogArea(parent);
			setMessage(message);
			setTitle(title);
			Composite area = (Composite) super.createDialogArea(parent);
	
			// Main container in which text labels can be inserted
			Composite container = new Composite(area, SWT.NONE);
			container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
	
			createLabel(container, "Custom name to assign to this remote repository (i.e. origin): ");
			remoteNameText = createText(container, true, false);
	
			createLabel(container, "URL of the remote repository: ");
			remoteURLText = createText(container, true, false);
	
			return null;
		}
	
		@Override
		protected void saveInput() {
			remoteName = remoteNameText.getText();
			remoteURL = remoteURLText.getText();
		}
	
		public String getRemoteName() {
			return remoteName;
		}
	
		public String getRemoteURL() {
			return remoteURL;
		}
	
	}
	
	'''
}