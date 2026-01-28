package library.dialogs

class LogDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.jgit.revwalk.RevCommit;
	import org.eclipse.swt.SWT;
	import org.eclipse.swt.layout.GridData;
	import org.eclipse.swt.layout.GridLayout;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	
	public class LogDialog extends DialogUtils {
		Iterable<RevCommit> commits;
	
		public LogDialog(Shell shell, Iterable<RevCommit> commits) {
			super(shell, "Log is used to get a list of all the commits from the repository",
					"Here is the list of all commits in order");
			this.commits = commits;
		}
	
		@Override
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
			newShell.setText("LogDialog");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			setMessage(message);
			setTitle(title);
			Composite area = (Composite) super.createDialogArea(parent);
	
			// Main container in which text labels can be inserted
			Composite container = new Composite(area, SWT.NONE);
			container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
	
			// Create the first label and its combo box
			for (RevCommit revCommit : commits) {
				createLabel(container, "Commit ID: " + revCommit.getName() + " Commit Time: " + revCommit.getCommitTime()
						+ " Parent Count: " + revCommit.getParentCount());
			}
	
			return super.createDialogArea(parent);
		}
	
		@Override
		protected void saveInput() {
	
		}
	
	}
	
	'''
}