package library.dialogs

class FetchDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import java.util.List;
	
	import org.eclipse.swt.widgets.Combo;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Label;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class FetchDialog extends DialogUtils {
	
		private Combo comboRemotes;
		private Combo comboBranches;
		private List<String> branches;
		private List<String> remotes;
		private Text usernameText;
		private Text passwordText;
		private String username;
		private String password;
		private String branchSelection;
		private String remoteSelection;
	
		/*
		 * TODO Make a list of list for the branches. The list of branches should change
		 * depending on which remote has been chosen. i.e. If "origin" is selected, only
		 * those branches should be shown to the user.
		 */
		public FetchDialog(Shell shell, List<String> remotes, List<String> branches) {
			super(shell, "Fetch command is used to update a specific branch from the remote repository (upstream)",
					"Please select a branch to update");
			this.branches = branches;
			this.remotes = remotes;
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite area = initMainArea(parent);
	
			Composite container = mainContainer(area);
	
			createLabel(container, "Please select from which remote you would like to fetch: ");
			comboRemotes = createComboButtons(container, remotes);
	
			// Create the first label and its combo box
			createLabel(container, "Please select which branch you would like to fetch: ");
			comboBranches = createComboButtons(container, branches);
	
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
			branchSelection = comboBranches.getItem(comboBranches.getSelectionIndex());
			remoteSelection = comboRemotes.getItem(comboRemotes.getSelectionIndex());
	
			username = usernameText.getText();
			password = passwordText.getText();
	
		}
	
		public String getBranchSelection() {
			return branchSelection;
		}
	
		public String getRemoteSelection() {
			return remoteSelection;
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