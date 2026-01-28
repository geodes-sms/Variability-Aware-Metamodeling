package vcsFeaturesMM.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import dialogs.LowCommandsView;
import vcsFeaturesMM.CollaborationStyle;
import vcsFeaturesMM.Commands;
import vcsFeaturesMM.Database;
import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.History;
import vcsFeaturesMM.LowCommands;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.VcsFeaturesMMFactory;
import vcsFeaturesMM.VersionUnit;
import vcsFeaturesMM.impl.CommandsImpl;
import vcsFeaturesMM.impl.LowLevelCommandImpl;
import vcsFeaturesMM.impl.VcsFeaturesMMFactoryImpl;

// https://www.tutorialspoint.com/java_xml/java_sax_parse_document.htm
public class Parser {
	
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {		
		
//		Shell shell = new Shell();
//		// create a dialog with ok and cancel buttons and a question icon
//		MessageBox dialog = 
//		    new MessageBox(shell , SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
//		dialog.setText("My info");
//		dialog.setMessage("Do you really want to do this?");
//
//		// open dialog and await user selection
//		returnCode = dialog.open();
		
		// Get the factory for the MM
		VcsFeaturesMMFactory factoryImpl = VcsFeaturesMMFactoryImpl.init();
		Commands commands = factoryImpl.createCommands();
		// List is empty and we need to populate it with arguments coming from config.xml, after the parse
		EList<LowLevelCommand> llc = commands.getLowlevelcommand();
		EList<HighLevelCommand> hlc = commands.getHighlevelcommand();
		
		History history = factoryImpl.createHistory();
		CollaborationStyle collabStyle = factoryImpl.createCollaborationStyle();
		VersionUnit versionUnit = factoryImpl.createVersionUnit();
		EList<Database> databases = factoryImpl.createVCSFeatures().getDatabase();

		
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		//File xmlFile = new File("config/default.xml");
		//File xmlFile = new File("config/defaultHistoryLabel.xml");
		File xmlFile = new File("config/defaultHistoryUniqueLabel.xml");
		//File xmlFile = new File("config/defaultHistoryNone.xml");
		SAXHandler saxHandler = new SAXHandler(new PartialGenerator());
		saxParser.parse(xmlFile, saxHandler);
		PartialGenerator pg = saxHandler.getPg();
		//Populate the list according to the config.xml (stored in pg)
		llc = configureLowCommands(llc, pg, factoryImpl);
		
		
		Wizard wizard = new Wizard(new Shell(), llc, hlc, history, databases, pg);
		wizard.doMagic(); // Calls all the dialogs and pops them
		
		//Before calling this, I should pop the wizard to collect additional info
		//List<LowLevelCommand> lCommands = new LowCommandsView().getLowCommands();
		
		
		
		//saxHandler.generatePartialDSL();
		}
	
	public static EList<LowLevelCommand> configureLowCommands(EList<LowLevelCommand> llc, PartialGenerator pg, VcsFeaturesMMFactory factoryImpl){
		if (pg.hasAdd()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.ADD);
			lc.setName("Add");
			llc.add(lc);
		}
		if (pg.hasCheckout()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.CHECKOUT);
			lc.setName("Checkout");
			llc.add(lc);
		}
		if (pg.hasCheckoutCreate()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.CHECKOUT_CREATE);
			lc.setName("CheckoutCreate");
			llc.add(lc);
		}
		if (pg.hasCherryPick()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.CHERRY_PICK);
			lc.setName("CherryPick");
			llc.add(lc);
		}
		if (pg.hasClone()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.CLONE);
			lc.setName("Clone");
			llc.add(lc);
		}
		if (pg.hasCommit()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.COMMIT);
			lc.setName("Commit");
			llc.add(lc);
		}
		if (pg.hasCreateBranch()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.CREATE_BRANCH);
			lc.setName("CreateBranch");
			llc.add(lc);
		}
		if (pg.hasFetch()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.FETCH);
			lc.setName("Fetch");
			llc.add(lc);
		}
		if (pg.hasInit()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.INIT);
			lc.setName("Init");
			llc.add(lc);
		}
		if (pg.hasLog()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.LOG);
			lc.setName("Log");
			llc.add(lc);
		}
		if (pg.hasOpen()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.OPEN);
			lc.setName("Open");
			llc.add(lc);
		}
		if (pg.hasPull()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.PULL);
			lc.setName("Pull");
			llc.add(lc);
		}
		if (pg.hasPush()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.PUSH);
			lc.setName("Push");
			llc.add(lc);
		}
		if (pg.hasRemoteAdd()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.REMOTE_ADD);
			lc.setName("RemoteAdd");
			llc.add(lc);
		}
		if (pg.hasRm()) {
			LowLevelCommand lc = factoryImpl.createLowLevelCommand();
			lc.setCommand(LowCommands.RM);
			lc.setName("Rm");
			llc.add(lc);
		}
		return llc;
	}
	
}
