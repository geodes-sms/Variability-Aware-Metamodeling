package dialogs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;

import vcsFeaturesMM.CollaborationStyle;
import vcsFeaturesMM.Database;
import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.History;
import vcsFeaturesMM.LabelType;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.VcsFeaturesMMFactory;
import vcsFeaturesMM.VersionUnit;
import vcsFeaturesMM.impl.VcsFeaturesMMFactoryImpl;
import vcsFeaturesMM.util.PartialGenerator;

//Tutorial: https://www.vogella.com/tutorials/EclipseWizards/article.html
public class MyWizard extends Wizard{
	// Customize the basic commands
	protected LowCommandPage one;
	// Customize the high commands, based on the basic commands
    protected SuperCommandPage two;
    // (Branching Style) Customize the LimitBranches attribute if selected
    // (Version Window) Customize the SpecificWindowRange if selected
    // (Time stamping) Customize the Label or UniqueCustomLabel if selected
	protected HistoryPage three;
	// Customize the connection string for each database selected
	protected DatabasesPage four;
	protected ApplicationPage five;

	private EList<LowLevelCommand> llc;
	private EList<HighLevelCommand> hlc;
	private History history;
	private VersionUnit versionUnit;
	private EList<Database> databases;
	private String appName;
	private PartialGenerator pg;

	public MyWizard(EList<LowLevelCommand> llc, EList<HighLevelCommand> hlc, History history, EList<Database> databases, PartialGenerator pg) {
		setNeedsProgressMonitor(true);
		this.llc = llc;
		this.hlc = hlc;
		this.history = history;
		this.databases = databases;
		this.pg = pg;
	}
	
	@Override
	public boolean performFinish() {
		this.databases = four.getDatabases();
		this.appName = five.getAppName();
		
        // Set the collected information into the partial generator
		pg.setHistory(history);
		pg.setDatabase(databases);
		pg.setLowLevelCommands(llc);
		pg.setHighLevelCommands(hlc);
		pg.setAppName(appName);
		
		// Generate the .vcs file 
		pg.generatePartialDynamicInstance();
        return true;
	}

	@Override
	public String getWindowTitle() {
		return "VCSFeatures";
	}
	
	@Override
	public void addPages() {
		//Mock up pages, do not include in actual program for VCSFeatures, only for memoir tests.
        //addPage(new OptionWizard("OptionWizard"));
        //addPage(new RefinementWizard("RefinementWizard"));
        //addPage(new ItemListPage("RefinementWizard"));
        
        one = new LowCommandPage("Basic commands", llc);
        addPage(one);
        two = new SuperCommandPage("Super commands", llc, hlc);
        addPage(two);
        if ( pg.hasSpecificWindowRange() || pg.hasLimitBranches() || pg.hasLabel() || pg.hasUniqueCustomLabel()) { // Only show this page if there is at least one of these that is true
        	three = new HistoryPage("Timeline customization", pg.hasSpecificWindowRange(), pg.hasLimitBranches(), pg.hasLabel(), pg.hasUniqueCustomLabel());
        	addPage(three);
		}
        if ( pg.hasXMI() || pg.hasSQL() || pg.hasMongoDB() || pg.hasNeo4J()) { // Only show this page if there is at least one of these that is true
        	four = new DatabasesPage("Storage customization", pg.hasXMI(), pg.hasSQL(), pg.hasMongoDB(), pg.hasNeo4J());
        	addPage(four);
		}
        five = new ApplicationPage("Application name");
        addPage(five);
        
	}
	
	// This allows you to change the order of the pages depending on the data in the wizard and pages.
	// Depending on what information is chosen, we might show certain pages or not.
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page.getPreviousPage() == one) {
			two.setLCommands(one.getCommands()); // get the updated list from the first page
			
			// Alternate way of doing it.
			//two.dispose();
			//two = new MyPageTwo("Super commands", one.getCommands()); // get the updated list from the first page
		}
		
		if(page.getPreviousPage() == two) {
			this.hlc = two.getHCommands();
			for (HighLevelCommand highLevelCommand : hlc) {
				for (LowLevelCommand lowLevelCommand : highLevelCommand.getLowlevelcommand()) {
					System.out.println(lowLevelCommand.toString());
				}
			}
			System.out.println(hlc);
		}
		
		if(page.getPreviousPage() == three) {
			if (pg.hasSpecificWindowRange()) {
				try {
					history.setCommitHistoryRange(Integer.valueOf(three.getSpecificWindowRangeText()));
				} catch (NumberFormatException e) {
					history.setCommitHistoryRange(0);
				}
				
			}
			if (pg.hasLimitBranches()) {
				try {
					history.setNumberOfBranches(Integer.valueOf(three.getLimitBranchesText()));
				} catch (NumberFormatException e) {
					history.setNumberOfBranches(0);
				}
				
			}
			//One of these is going to be null, so a condition check will be necessary when I use them in the future
			if (pg.hasLabel()) {
				history.setLabelType(LabelType.get(three.getLabelCCombo())); // TODO Check if this works, cause I'm not sure
			}
			if (pg.hasUniqueCustomLabel()) {
				history.setUniqueLabelString(three.getUniqueCustomLabelText());
			}
		}
		
		return super.getNextPage(page);
	}
}
