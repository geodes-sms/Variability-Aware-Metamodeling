package dialogs;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ApplicationPage extends WizardPage{
	private Label appLabel;
	private Text appText;
	private Composite container;

	
	protected ApplicationPage(String pageName) {
		super(pageName);
		setTitle("Application name customization");
		setDescription("Lastly, define your application's name. It will be used in many places of the code that will be generated (most that you won't see).");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        
        appLabel = new Label(container, SWT.NONE);;
        appLabel.setText("Name:");
        appLabel.setLayoutData(gd);
        
        appText = new Text(container, SWT.BORDER_SOLID);;
        appText.setLayoutData(gd);
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(true);
	}
	
	public String getAppName() {
		return appText.getText();
	}
}
