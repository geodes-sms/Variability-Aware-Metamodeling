package library.dialogs

class CloneDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import java.util.Arrays;
	
	import org.eclipse.swt.SWT;
	import org.eclipse.swt.layout.GridData;
	import org.eclipse.swt.layout.GridLayout;
	import org.eclipse.swt.widgets.Combo;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Label;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class CloneDialog extends PathDialog {
		private Label remoteURLLabel;
		private Text remoteURLText;
		private Label cloneBranchesLabel;
		private Combo cloneBranchesCombo;
		private Label usernameLabel;
		private Text usernameText;
		private Label passwordLabel;
		private Text passwordText;
	
		private String remoteURL;
		private Boolean cloneBranches;
		private String username;
		private String password;
		private Label localURLLabel;
		private Text localURLText;
		private String localURL;
	
		public CloneDialog(Shell parentShell) {
			super(parentShell, "Give a path to a file that you wish to start versioning, within a repository.",
					"Select a file to version");
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
	
			// Create the first label and its text box
			localURLLabel = createLabel(container, "Local directory where to initialize the repository: ");
			localURLText = createText(container, true, false);
	
			// URL for remote repository
			remoteURLLabel = createLabel(container, "URL of the remote repository: ");
			remoteURLText = createText(container, true, false);
	
			// Whether the user wants to fetch all the branches at the start or not
			cloneBranchesLabel = createLabel(container, "Do you want to clone all the branches? ");
			cloneBranchesCombo = createComboButtons(container, Arrays.asList("True", "False"));
	
			// TODO Change this with a proper credential manager support
			// Username to connect to the remote repository
			usernameLabel = createLabel(container, "Username: ");
			usernameText = createText(container, true, false);
	
			// Password to connect to the remote repository
			passwordLabel = createLabel(container, "Password: ");
			passwordText = createText(container, true, false);
	
			return null;
		}
	
		// Save content of the Text fields because they get disposed
		// as soon as the Dialog closes
		@Override
		protected void saveInput() {
			localURL = localURLText.getText();
			remoteURL = remoteURLText.getText();
			if (cloneBranchesCombo.getItem(cloneBranchesCombo.getSelectionIndex()) == "True") {
				cloneBranches = true;
			} else {
				cloneBranches = false;
			}
			username = usernameText.getText();
			password = passwordText.getText();
		}
	
		public String getRemoteURL() {
			return remoteURL;
		}
	
		public Boolean getCloneBranches() {
			return cloneBranches;
		}
	
		public String getUsername() {
			return username;
		}
	
		public String getPassword() {
			return password;
		}
	
		public String getLocalURL() {
			return localURL;
		}
	
	}
	
	'''
}