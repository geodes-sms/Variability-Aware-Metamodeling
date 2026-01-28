package vcsFeaturesMM.util;

import java.lang.reflect.InvocationTargetException;

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
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.VCSFeatures;
import vcsFeaturesMM.impl.VcsFeaturesMMFactoryImpl;

// This class is used to redefine default behaviors and add testing 
public class SAXHandler extends DefaultHandler {
	VCSFeatures vcsFeatures;
	// Where we store the true/false values
	PartialGenerator pg;
	
	public SAXHandler(PartialGenerator pg) {
		vcsFeatures = new VcsFeaturesMMFactoryImpl().createVCSFeatures();
		this.pg = pg;
	}
	
	   
	public void startElement( String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		 if(qName.equals("feature")) {
			 // Check if the attribute automatic or manual exists on the entry
			 // Check if a feature is selected, be it automatic or manual
			 // Program crashes right here with a null pointer exception. It only happens when HighLevelCommands is being checked/read
			if (attributes.getValue("automatic") != null && attributes.getValue("automatic").equals("selected") || attributes.getValue("manual") != null&& attributes.getValue("manual").equals("selected")) {
				String name = attributes.getValue("name");
			 
			 switch (name) {
			case "HighLevelCommands":
				this.pg.setHighLevelCommands(true);
				break;
			case "LowLevelCommands":
				this.pg.setLowLevelCommands(true);
				break;
			case "Add":
				this.pg.setAdd(true);
				break;
			case "Checkout":
				this.pg.setCheckout(true);
				break;
			case "CheckoutCreate":
				this.pg.setCheckoutCreate(true);
				break;
			case "Clone":
				this.pg.setClone(true);
				break;
			case "Commit":
				this.pg.setCommit(true);
				break;
			case "CherryPick":
				this.pg.setCherryPick(true);
				break;
			case "CreateBranch":
				this.pg.setCreateBranch(true);
				break;
			case "Fetch":
				this.pg.setFetch(true);
				break;
			case "Init":
				this.pg.setInit(true);
				break;
			case "Log":
				this.pg.setLog(true);
				break;
			case "DSMCompare":
				this.pg.setDSMCompare(true);
				break;
			case "GitDiff":
				this.pg.setGitDiff(true);
				break;
			case "Open":
				this.pg.setOpen(true);
				break;
			case "Pull":
				this.pg.setPull(true);
				break;
			case "Push":
				this.pg.setPush(true);
				break;
			case "RemoteAdd":
				this.pg.setRemoteAdd(true);
				break;
			case "Rm":
				this.pg.setRm(true);
				break;
			case "SingleBranch":
				this.pg.setSingleBranch(true);
				break;
			case "MultiBranch":
				this.pg.setMultiBranch(true);
				break;
			case "InfiniteBranches":
				this.pg.setInfiniteBranches(true);
				break;
			case "LimitBranches":
				this.pg.setLimitBranches(true);
				break;
			case "SpecificWindowRange":
				this.pg.setSpecificWindowRange(true);
				break;
			case "Label":
				this.pg.setLabel(true);
				break;
			case "UniqueCustomLabel":
				this.pg.setUniqueCustomLabel(true);
				break;
			case "CommitHash":
				this.pg.setCommitHash(true);
				break;
			case "File":
				this.pg.setFile(true);
				break;
			case "Semantic":
				this.pg.setSemantic(true);
				break;
			case "Element":
				this.pg.setElement(true);
				break;
			case "Line":
				this.pg.setLine(true);
				break;
			case "LocalOnly":
				this.pg.setLocalOnly(true);
				break;
			case "Remote":
				this.pg.setRemote(true);
				break;
			case "SQL":
				this.pg.setSQL(true);
				break;
			case "MongoDB":
				this.pg.setMongoDB(true);
				break;
			case "Neo4J":
				this.pg.setNeo4J(true);
				break;
			case "XMI":
				this.pg.setXMI(true);
				break;

			default:
				break;
			}
		}
			 
		  }
		System.out.println("Start Element : " + qName + ", Name : " + attributes.getValue("name"));
		}	
			   
	public void endElement(String uri, String localName, String qName) {
		//System.out.println("End Element : " + qName);		   
		}
			 
	// Collect the text in between 2 XML nodes
	public void characters(char[] ch, int start, int length) throws SAXException{
		//System.out.println("Text Content : " + new String(ch, start, length));
		}	
	
	public PartialGenerator getPg() {
		return pg;
	}


	public void generatePartialDSL() {
		this.pg.generatePartialDynamicInstance();
	}
}
