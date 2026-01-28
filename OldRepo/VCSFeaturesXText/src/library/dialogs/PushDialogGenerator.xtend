package library.dialogs

class PushDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Label;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class PushDialog extends DialogUtils {
	
		private Text usernameText;
		private Text passwordText;
		private String username;
		private String password;
	
		public PushDialog(Shell parentShell) {
			super(parentShell,
					"Push is the follow-up command used after Commit. It is used to propagate committed changes to the remote repository.",
					"Enter your credentials to the repository to push changes.");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
	
			Composite area = initMainArea(parent);
			Composite container = mainContainer(area);
	
			// TODO Change this with a proper credential manager support
			// Username to connect to the remote repository
			Label usernameLabel = createLabel(container, "Username: ");
			usernameText = createText(container, true, false);
	
			// Password to connect to the remote repository
			Label passwordLabel = createLabel(container, "Password: ");
			passwordText = createText(container, true, false);
			return super.createDialogArea(parent);
		}
	
		@Override
		protected void saveInput() {
			username = usernameText.getText();
			password = passwordText.getText();
	
		}
	
		public String getUsername() {
			return username;
		}
	
		public String getPassword() {
			return password;
		}
	
	}
	
	'''
}