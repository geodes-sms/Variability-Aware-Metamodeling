package dialogs;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class RefinementWizard extends WizardPage {
	private Label appLabel;
	private Text appText;
	private Composite container;

	// TODO Think of how this wizard is going to look based on my description in the memoir.
	// The wizard could be basically a list of the elements to be potentially customized and then a page would be automatically generated based on the type of the element (0..* list, or a single valued attribute)
	protected RefinementWizard(String pageName) {
		super(pageName);
		setTitle("Single valued attributes");
		setDescription("Assign values:");
	}

	// Have to make a list with all the possible options for my transformation rules. I can skip the business logic for now, as this is only a prototype.
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        
        appLabel = new Label(container, SWT.NONE);;
        appLabel.setText("ECommerce - name (EString) :");
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
