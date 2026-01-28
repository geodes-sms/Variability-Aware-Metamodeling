package library.dialogs

class RenamerDialogGenerator implements DialogGenerator{
	override generate()
	'''
	package dialogs;
	
	import org.eclipse.jface.dialogs.IMessageProvider;
	import org.eclipse.jface.dialogs.TitleAreaDialog;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.jface.dialogs.IMessageProvider;
	import org.eclipse.jface.dialogs.TitleAreaDialog;
	import org.eclipse.swt.SWT;
	import org.eclipse.swt.layout.GridData;
	import org.eclipse.swt.layout.GridLayout;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Control;
	import org.eclipse.swt.widgets.Label;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Text;
	
	public class RenamerDialog extends TitleAreaDialog {
	
	    private Text txtFirstName;
	    private Text lastNameText;
	
	    private String commandName;
	    private String aliasName;
	
		public RenamerDialog(Shell parentShell) {
			super(parentShell);
			// TODO Auto-generated constructor stub
		}
	
		@Override
		public void create() {
			// TODO Auto-generated method stub
			super.create();
			setTitle("Renamer Dialog");
			setMessage("Please write the command for which you wish to change the alias", IMessageProvider.INFORMATION);
		}
	
		@Override
		protected Control createDialogArea(Composite parent) {
	
			 Composite area = (Composite) super.createDialogArea(parent);
		        Composite container = new Composite(area, SWT.NONE);
		        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		        GridLayout layout = new GridLayout(2, false);
		        container.setLayout(layout);
	
		        createCommandName(container);
		        createAliasName(container);
	
			return super.createDialogArea(parent);
		}
	
		 private void createCommandName(Composite container) {
		        Label lbtFirstName = new Label(container, SWT.NONE);
		        lbtFirstName.setText("JGit Command");
	
		        GridData dataFirstName = new GridData();
		        dataFirstName.grabExcessHorizontalSpace = true;
		        dataFirstName.horizontalAlignment = GridData.FILL;
	
		        txtFirstName = new Text(container, SWT.BORDER);
		        txtFirstName.setLayoutData(dataFirstName);
		    }
	
		    private void createAliasName(Composite container) {
		        Label lbtLastName = new Label(container, SWT.NONE);
		        lbtLastName.setText("Alias");
	
		        GridData dataLastName = new GridData();
		        dataLastName.grabExcessHorizontalSpace = true;
		        dataLastName.horizontalAlignment = GridData.FILL;
		        lastNameText = new Text(container, SWT.BORDER);
		        lastNameText.setLayoutData(dataLastName);
		    }
	
	
		    @Override
		    protected boolean isResizable() {
		        return true;
		    }
	
		    // Save content of the Text fields because they get disposed
		    // as soon as the Dialog closes
		    private void saveInput() {
		        commandName = txtFirstName.getText();
		        aliasName = lastNameText.getText();
	
		    }
	
		    @Override
		    protected void okPressed() {
		        saveInput();
		        super.okPressed();
		    }
	
		    public String getCommandName() {
		        return commandName;
		    }
	
		    public String getAliasName() {
		        return aliasName;
		    }
	}
	
	'''
}