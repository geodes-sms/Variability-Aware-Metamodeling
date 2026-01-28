package dialogs;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import vcsFeaturesMM.LowLevelCommand;

// 2 text areas for editing the LimitBranches and SpecificWindowRange if they are selected (multiple constructors?)
// + a text area for UniqueCustomLabel if selected or a CCombo (premade labels) if the user selected Label
public class HistoryPage extends WizardPage {
	private Composite container;
	private boolean specificWindowRange;
	private Text specificWindowRangeText;
	private boolean limitBranches;
	private Text limitBranchesText;
	private boolean label;
	private CCombo labelCCombo;
	private boolean uniqueCustomLabel;
	private Text uniqueCustomLabelText;
	private final String[] titles = {"Commit", "Message", "Save", "Share"}; // List of pre-made labels for the user to choose from
	
	protected HistoryPage(String pageName, boolean specificWindowRange, boolean limitBranches, boolean label, boolean uniqueCustomLabel) {
		super(pageName);
		setTitle("Commit history customization");
        setDescription("Please enter the specified values to customize your viewing experience for the VCS.");
		this.specificWindowRange = specificWindowRange;
		this.limitBranches = limitBranches;
		this.label = label;
		this.uniqueCustomLabel = uniqueCustomLabel;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.verticalSpacing = 75;
        container.setLayout(layout);
        layout.numColumns = 2;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        if (specificWindowRange) {
        	new Label(container,  SWT.NONE).setText("Specify the window of accessible commits (0 = infinite, 2 = two commits behind): ");
        	specificWindowRangeText = new Text(container, SWT.BORDER | SWT.SINGLE);
        	specificWindowRangeText.setLayoutData(gd);
		}
        if (limitBranches) {
        	new Label(container,  SWT.NONE).setText("Specify how many branches should the VCS be limited to (0 = infinite, 1 = only a main/master branch, etc.): ");
        	limitBranchesText = new Text(container, SWT.BORDER | SWT.SINGLE);
        	limitBranchesText.setLayoutData(gd);
		}
        if (label) {
        	new Label(container,  SWT.NONE).setText("Specify which of the presets you would like for the commit names (i.e. CommitXXX): ");
        	labelCCombo = new CCombo(container, SWT.BORDER | SWT.SINGLE);
        	labelCCombo.setText("Custom");
			for (String title : titles) {
				labelCCombo.add(title);
			}
		}
        if (uniqueCustomLabel) {
        	new Label(container,  SWT.NONE).setText("Specify your custom commit name: ");
        	uniqueCustomLabelText = new Text(container, SWT.BORDER | SWT.SINGLE);
        	uniqueCustomLabelText.setLayoutData(gd);
		}
        
       

        // required to avoid an error in the system
        setControl(container);
        setPageComplete(true);
	
        }

	public String getSpecificWindowRangeText() {
		return specificWindowRangeText.getText();
	}

	public String getLimitBranchesText() {
		return limitBranchesText.getText();
	}

	public String getLabelCCombo() {
		return labelCCombo.getItem(labelCCombo.getSelectionIndex());
	}

	public String getUniqueCustomLabelText() {
		return uniqueCustomLabelText.getText();
	}
	
	
}
