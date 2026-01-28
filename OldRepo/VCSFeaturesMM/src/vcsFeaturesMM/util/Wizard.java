package vcsFeaturesMM.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import dialogs.LowCommandsView;
import dialogs.MyWizard;
import vcsFeaturesMM.CollaborationStyle;
import vcsFeaturesMM.Database;
import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.History;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.VersionUnit;
import dialogs.HighCommandsView;

/**
 * This class contains all the views that will be prompted to the user. 
 * Each method calls a certain view and collects additional data about variables that could be gathered through the DSL,
 * but for the ease of use of the User, we give dialogs, as they are more user friendly and don't require any knowledge of the DSL.
 * The saved data will be used by the partial generator to "save" this info into the DSL afterwards.
 * */
public class Wizard {
	// View and parameters for the LowCommandsView
	Shell shell;
	LowCommandsView lcv; 
	HighCommandsView hcv; 
	EList<LowLevelCommand> llc;
	EList<HighLevelCommand> hlc;
	WizardDialog harry;
	private History history;
	private EList<Database> databases;
	private PartialGenerator pg;
	
	
	public Wizard(Shell shell, EList<LowLevelCommand> llc, EList<HighLevelCommand> hlc, History history, EList<Database> databases, PartialGenerator pg) {
		this.shell = shell;
		this.llc = llc;
		this.hlc = hlc;
		this.history = history;
		this.databases = databases;
		this.pg = pg;
	}
	
	/**
	 * Main method that does all the "magic". Creates a new wizard and sends all the necessary items, then the wizard takes over.
	 * */
	public void doMagic() {
		//Call the MyWizard and opens it
		this.harry = new WizardDialog(shell, new MyWizard(llc, hlc, history, databases, pg));
		harry.open();
		
		// Each call is a dialog that collects information that the config.xml cannot capture
		/*this.lcv = new LowCommandsView(shell, null, null, this.llc);
		getLowCommands();
		
		this.hcv = new HighCommandsView(shell, null, null, this.llc); // llc should be updated if getLowCommands executes properly
		getHighCommands();*/
		
	}

	private void getHighCommands() {
		// Open the dialog
		hcv.create();

		// If OK has been pressed, do something
		if (hcv.open() == Window.OK) {
			// Get the modified list with the new names (ID)
			this.hlc = hcv.getCommands(); // Get the list of low level commands and saves the user input (works, tested)
		}
		
	}

	public void getLowCommands(){
		// Open the dialog
		lcv.create();

		// If OK has been pressed, do something
		if (lcv.open() == Window.OK) {
			// Get the modified list with the new names (ID)
			this.llc = lcv.getCommands(); // Get the list of low level commands and saves the user input (works, tested)
		}
	}
}
