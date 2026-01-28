package dialogs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import vcsFeaturesMM.LowCommands;
import vcsFeaturesMM.LowLevelCommand;

public class LowCommandsView extends DialogUtils{
	//https://git.eclipse.org/c/platform/eclipse.platform.swt.git/tree/examples/org.eclipse.swt.snippets/src/org/eclipse/swt/snippets/Snippet38.java
	EList<LowLevelCommand> lCommands;
	List<Text> textAreas;

	public LowCommandsView(Shell parentShell, String message, String title, EList<LowLevelCommand> llc ) {
		super(parentShell, "Please enter a new name for the commands or leave it as it is to keep the default names.", "Commands rename");
		setHelpAvailable(false);
		this.lCommands = llc;
		this.textAreas = new ArrayList<>();
	}

	@Override
	public void create() {
		super.create();
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Basic commands");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite area = (Composite) super.initMainArea(parent);

		// Main container in which text labels can be inserted
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(3, false); // Change this value if you want more columns
		container.setLayout(layout);

		//TODO Change this for a table
		// Create a label and text area to edit values
		for (LowLevelCommand lowLevelCommand : lCommands) {
			if (!lowLevelCommand.getName().isEmpty()) {
			createLabel(container, lowLevelCommand.getName()); // i.e. Open as xxx
			createLabel(container, "as");
			Text text = createText(container, true, false);
			text.setText(lowLevelCommand.getName()); // Adding the base name as the default value
			textAreas.add(text);
			}
			
		}
		

		return super.createDialogArea(parent);
	}

	@Override
	protected void saveInput() {
		for (int i = 0; i < lCommands.size(); i++) {
			lCommands.get(i).setName(textAreas.get(i).getText()); // Setting the ID of the command as the value of the user input
		}
	}
	
	public EList<LowLevelCommand> getCommands(){
		return lCommands;
		
	}
	
}
