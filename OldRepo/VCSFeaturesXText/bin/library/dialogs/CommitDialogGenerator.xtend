package library.dialogs

class CommitDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class CommitDialog extends DialogUtils {
	
		private Text commitText;
		private String commitMessage;
	
		public CommitDialog(Shell parentShell) {
			super(parentShell, "Commit is used to persist (save) changes and create a checkpoint with accumulated changes.",
					"Write a message that will be associated with the commit.");
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite area = initMainArea(parent);
	
			Composite container = mainContainer(area);
	
			createLabel(container, "Commit message: ");
			commitText = createText(container, true, true);
	
			return super.createDialogArea(parent);
		}
	
		@Override
		protected void saveInput() {
			commitMessage = commitText.getText();
		}
	
		public String getCommitMessage() {
			return commitMessage;
		}
	
	}
	
	'''
}