package dialogs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import vcsFeaturesMM.LowLevelCommand;

public class LowCommandPage extends WizardPage{
    private Composite container;
    EList<LowLevelCommand> lCommands;
	List<Text> textAreas;

	protected LowCommandPage(String pageName, EList<LowLevelCommand> llc) {
		super(pageName);
        setTitle("Commands rename");
        setDescription("Please enter a new name for the commands or leave it as it is to keep the default names. Use a camel notation (i.e. helloWorld).");
		this.lCommands = llc;
		this.textAreas = new ArrayList<>();
	}

	@Override
	public void createControl(Composite parent) {
		 container = new Composite(parent, SWT.NONE);
	        GridLayout layout = new GridLayout();
	        container.setLayout(layout);
	        layout.numColumns = 3;
			/*
			 * Label label1 = new Label(container, SWT.NONE);
			 * label1.setText("Put a value here.");
			 * 
			 * text1 = new Text(container, SWT.BORDER | SWT.SINGLE); text1.setText("");
			 * text1.addKeyListener(new KeyListener() {
			 * 
			 * @Override public void keyPressed(KeyEvent e) { }
			 * 
			 * @Override public void keyReleased(KeyEvent e) { if
			 * (!text1.getText().isEmpty()) { setPageComplete(true);
			 * 
			 * } }
			 * 
			 * });
			 */
	        for (LowLevelCommand lowLevelCommand : lCommands) {
				if (!lowLevelCommand.getName().isEmpty()) {
					Label label2 = new Label(container, SWT.NONE);
			        label2.setText(lowLevelCommand.getName()); // i.e. Open as xxx
			        Label labelAs = new Label(container, SWT.NONE);
			        labelAs.setText("as");
			        Text text = new Text(container, SWT.BORDER | SWT.SINGLE);
			        text.setText("");
			        text.setText(lowLevelCommand.getName().toLowerCase()); // Adding the base name as the default value
			        textAreas.add(text);
				}
	        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	        for (Text areas : textAreas) {
				areas.setLayoutData(gd);
			}
	        //text1.setLayoutData(gd);
	        // required to avoid an error in the system
	        setControl(container);
	        setPageComplete(true);
		
	        }
        }
	
	public EList<LowLevelCommand> getCommands(){
		// This used to be in saveInput, but since it doesn't exist here, I'm doing when we get the commands.
		for (int i = 0; i < lCommands.size(); i++) {
			lCommands.get(i).setName(textAreas.get(i).getText()); // Setting the ID of the command as the value of the user input
		}
		return lCommands;
		
	}
	
}
