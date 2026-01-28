package vcsFeaturesMM.util

import java.io.FileWriter
import vcsFeaturesMM.Database
import org.eclipse.emf.common.util.EList
import vcsFeaturesMM.LowLevelCommand
import vcsFeaturesMM.HighLevelCommand
import vcsFeaturesMM.History

class PartialGenerator {
	EList<LowLevelCommand> llc
	EList<HighLevelCommand> hlc
	EList<Database> databases
	History history
	String appName;
	boolean hasHighLevelCommands = false
	boolean hasLowLevelCommands = false
	boolean hasDSMCompare = false
	boolean hasAdd = false
	boolean hasCheckout = false
	boolean hasCheckoutCreate = false
	boolean hasClone = false
	boolean hasCommit = false
	boolean hasCherryPick = false
	boolean hasCreateBranch = false
	boolean hasFetch = false
	boolean hasInit = false
	boolean hasLog = false
	boolean hasOpen = false
	boolean hasPull = false
	boolean hasPush = false
	boolean hasRemoteAdd = false
	boolean hasRm = false
	boolean hasGitDiff = false
	boolean hasSingleBranch = false
	boolean hasMultiBranch = false
	boolean hasInfiniteBranches = false
	boolean hasLimitBranches = false
	boolean hasSpecificWindowRange = false
	boolean hasLabel = false
	boolean hasUniqueCustomLabel = false
	boolean hasCommitHash = false
	boolean hasFile = false
	boolean hasSemantic = false
	boolean hasElement = false
	boolean hasLine = false
	boolean hasLocalOnly = false
	boolean hasRemote = false
	boolean hasSQL = false
	boolean hasMongoDB = false
	boolean hasNeo4J = false
	boolean hasXMI = false
	
	FileWriter myWriter
	
	String myString
	
	/*'''VCSFeatures TestingV4
	# COMMANDS
		Merge tool: GitDiff
		Basic command declaration:
			- Command use Add as add,
			- Command use Commit as commit,
			- Command use Push as push,
			- Command use Pull as pull,
			- Command use Open as open
		Super command declaration:
			- Super command AddCommitPushPull with add -> commit -> push -> pull,
			- Super command OpenAddCommit with open -> add -> commit
	# HISTORY 
		Identifying label: CommitHash
		Version history backlog: 0
		Maximum number of branches: 0
	# VERSIONNING 
		Detail level: Line, File
	# COLLABORATION STYLE
		Working: LocalOnly
	# DATABASES
		DB SQL @ "127.0.0.1",
		DB MongoDB @ "https://www.google.com:8080",
		DB Neo4J @ "192.168.0.1"
	'''*/
	
	def public void generatePartialDynamicInstance(){
		myWriter = new FileWriter("PartialDynamicInstance.vcs")
		// Commands section
		myString = '''VCSFeatures «appName»
# COMMANDS
			«IF hasGitDiff»
	Merge tool: GitDiff
			«ENDIF»
		'''
		
		if (hasDSMCompare){
			myString = myString + 
			'''
				Merge tool: DSMCompare
			'''
		}
		
		if (hasLowLevelCommands){
			myString = myString + 
			'''
			Basic command declaration:
			«FOR low : llc» 
				- Command use «low.command.literal» as «low.name»
				
			«ENDFOR» 
			'''
			/*for (LowLevelCommand low : llc){
				myString = myString +
				'''		
					- Command use ''' + low.command.literal + ''' as ''' + low.name
			}*/
		} 
		
		
		// Ifs for all the commands goes here
		
		 /*if (hasAdd){ // The ',' might be a problem here. I might have to remove it from the DSL and replace it with '-'
			myString = myString + 
			'''
					- Command use Add as add
			'''
		}
		
		if (hasCheckout){
			myString = myString + 
			'''
					- Command use Checkout as checkout
			'''
		}
		
		if (hasCheckoutCreate){
			myString = myString + 
			'''
					- Command use CheckoutCreate as checkoutCreate
			'''
		}
		
		if (hasClone){
			myString = myString + 
			'''
					- Command use Clone as clone
			'''
		}
		
		if (hasCommit){
			myString = myString + 
			'''
					- Command use Commit as commit
			'''
		}
		
		if (hasCherryPick){
			myString = myString + 
			'''
					- Command use CherryPick as cherryPick
			'''
		}
		
		if (hasCreateBranch){
			myString = myString + 
			'''
					- Command use CreateBranch as createBranch
			'''
		}
		
		if (hasFetch){
			myString = myString + 
			'''
					- Command use Fetch as fetch
			'''
		}
		
		if (hasInit){
			myString = myString + 
			'''
					- Command use Init as init
			'''
		}
		
		if (hasLog){
			myString = myString + 
			'''
					- Command use Log as log
			'''
		}
		
		if (hasOpen){
			myString = myString + 
			'''
					- Command use Open as open
			'''
		}
		
		if (hasPull){
			myString = myString + 
			'''
					- Command use Pull as pull
			'''
		}
		
		if (hasPush){
			myString = myString + 
			'''
					- Command use Push as push
			'''
		}
		
		if (hasRemoteAdd){
			myString = myString + 
			'''
					- Command use RemoteAdd as remoteAdd
			'''
		}
		
		if (hasRm){
			myString = myString + 
			'''
					- Command use Rm as rm
			'''
		}*/
		 
		if (hasHighLevelCommands){
			myString = myString + '''
			Super command declaration:
			'''
			for(high : hlc){
				var i = 0 as int
				myString = myString + '''
				- Super command «high.name» with '''
				for(low : high.lowlevelcommand){
					i = i + 1
					myString = myString + '''«low.name»«IF i<high.lowlevelcommand.size» -> «ENDIF»«IF i>=high.lowlevelcommand.size»
					«ENDIF»'''
				}
				
			}
			
			/*myString = myString + 
			'''
				Super command declaration:
				«FOR high : hlc»«var i = 0 as int»
					- Super command «high.name» with «FOR low : high.lowlevelcommand»«low.name»«i = i + 1»«IF i<high.lowlevelcommand.size» -> «ENDIF»«ENDFOR»
					
				«ENDFOR» 
			'''*/
			
			/*for (HighLevelCommand high : hlc){
				myString = myString +
				'''		
					- Super command ''' + high.name + ''' with '''
					for (LowLevelCommand low : high.lowlevelcommand){
						myString = myString + low.name + ''' -> '''
					}
			}*/
			//myString.substring(0, myString.length) // Cut the last "->", because it's easier that way
		}
		// History section
		myString = myString + 
			'''
		# HISTORY 
			'''
			/*
		# HISTORY 
		Identifying label: CommitHash
		Version history backlog: 0
		Maximum number of branches: 0
		*  */
		
		myString = myString + 
			'''
			Identifying label: «history.labelType.getName»
			'''
		/*if(hasLabel){
			myString = myString + 
			'''
			Identifying label:''' + history.labelType.getName
		}*/
		
		/*if(hasCommitHash){
			myString = myString + 
			'''
			Identifying label: CommitHash
			'''
		}
			
		if(hasUniqueCustomLabel){
			myString = myString + 
			'''
			Identifying label: UniqueCustomLabel
			'''
		}*/
		
		if(hasSpecificWindowRange){
			myString = myString + 
			'''
			Version history backlog: «history.commitHistoryRange»
			'''
		} else {
			myString = myString + 
			'''
			Version history backlog: 0
			'''
		}
		
		if(hasSingleBranch){
			myString = myString + 
			'''
			Maximum number of branches: 1
			'''
		}
		
		if(hasLimitBranches){
			myString = myString + 
			'''
			Maximum number of branches: «history.numberOfBranches»
			'''
		}
		
		if(hasInfiniteBranches){
			myString = myString + 
			'''
			Maximum number of branches: 0
			'''
		}
		/*
		# VERSIONNING 
		Detail level: Line, File
		 * 
		 */
		
		// Section for Versionning unit
		myString = myString + 
			'''
		# VERSIONNING 
		Detail level:
			'''
			
		if(hasFile){
			myString = myString + 
			'''
			File
			'''
		}
		
		if(hasSemantic){
			myString = myString + 
			'''
			Semantic
			'''
		}
		
		if(hasElement){
			myString = myString + 
			'''
			Element
			'''
		}
		
		if(hasLine){
			myString = myString + 
			'''
			Line
			'''
		}
		// Collaboration style section
		/*
		# COLLABORATION STYLE
		Working: LocalOnly
		 * 
		 */
		 myString = myString + 
			'''
		# COLLABORATION STYLE
			'''
		if(hasLocalOnly){
			myString = myString + 
			'''
			Working: LocalOnly
			'''
		}
		
		if(hasRemote){
			myString = myString + 
			'''
			Working: Remote
			'''
		}
		
		// Section for databases
		/*
		# DATABASES
		DB SQL @ "127.0.0.1",
		DB MongoDB @ "https://www.google.com:8080",
		DB Neo4J @ "192.168.0.1"
		 */
		 myString = myString + 
			'''
		# DATABASES
			'''
		
		for (Database db : databases){
			myString = myString + // TODO fix the MM and change this line
			//
			'''DB «db.name» «db.databaseType.getName» @ «db.connectionString»
			'''
		}
			
		/*if(hasSQL){
			myString = myString + 
			'''
			DB SQL @ "127.0.0.1"
			'''
		}
		
		if(hasMongoDB){
			myString = myString + 
			'''
			DB MongoDB @ "https://www.google.com:8080"
			'''
		}
		
		if(hasNeo4J){
			myString = myString + 
			'''
			DB Neo4J @ "192.168.0.1"
			'''
		}
		
		if(hasXMI){
			myString = myString + 
			'''
			DB XMI @ "127.0.0.1"
			'''
		}*/
		
		myWriter.write(myString)
		myWriter.close
	}
	
	def boolean hasHighLevelCommands(){
		return hasHighLevelCommands
	}
	
	def setHighLevelCommands(boolean value){
		hasHighLevelCommands = value
	}
	
	def getLowLevelCommands(boolean value){
		return hasLowLevelCommands
	}
	
	def setLowLevelCommands(boolean value){
		hasLowLevelCommands = value
	}
	
	def boolean hasAdd(){
		return hasAdd
	}
	
	def setAdd(boolean value){
		hasAdd = value
	}
	
	def boolean hasCheckout(){
		return hasCheckout
	}
	
	def setCheckout(boolean value){
		hasCheckout = value
	}
	
	def boolean hasCheckoutCreate(){
		return hasCheckoutCreate
	}
	
	def setCheckoutCreate(boolean value){
		hasCheckoutCreate = value
	}
	
	def boolean hasClone(){
		return hasClone
	}
	
	def setClone(boolean value){
		hasClone = value
	}
	
	def boolean hasCommit(){
		return hasCommit
	}
	
	def setCommit(boolean value){
		hasCommit = value
	}
	
	def boolean hasCherryPick(){
		return hasCherryPick
	}
	
	def setCherryPick(boolean value){
		hasCherryPick = value
	}
	
	def boolean hasCreateBranch(){
		return hasCreateBranch
	}
	
	def setCreateBranch(boolean value){
		hasCreateBranch = value
	}
	
	def boolean hasFetch(){
		return hasFetch
	}
	
	def setFetch(boolean value){
		hasFetch = value
	}
	
	def boolean hasInit(){
		return hasInit
	}
	
	def setInit(boolean value){
		hasInit = value
	}
	
	def boolean hasLog(){
		return hasLog
	}
	
	def setLog(boolean value){
		hasLog = value
	}
	
	def boolean hasOpen(){
		return hasOpen
	}
	
	def setOpen(boolean value){
		hasOpen = value
	}
	
	def boolean hasPull(){
		return hasPull
	}
	
	def setPull(boolean value){
		hasPull = value
	}
	
	def boolean hasPush(){
		return hasPush
	}
	
	def setPush(boolean value){
		hasPush = value
	}
	
	def boolean hasRemoteAdd(){
		return hasRemoteAdd
	}
	
	def setRemoteAdd(boolean value){
		hasRemoteAdd = value
	}
	
	def boolean hasRm(){
		return hasRm
	}
	
	def setRm(boolean value){
		hasRm = value
	}

	def boolean hasDSMCompare(){
		return hasDSMCompare
	}
	
	def setDSMCompare(boolean value){
		hasDSMCompare = value
	}
	
	def boolean hasGitDiff(){
		return hasGitDiff
	}
	
	def setGitDiff(boolean value){
		hasGitDiff = value
	}
	
	def boolean hasSingleBranch(){
		return hasSingleBranch
	}
	
	def setSingleBranch(boolean value){
		hasSingleBranch = value
	}
	
	def boolean hasMultiBranch(){
		return hasMultiBranch
	}
	
	def setMultiBranch(boolean value){
		hasMultiBranch = value
	}
	
	def boolean hasInfiniteBranches(){
		return hasInfiniteBranches
	}
	
	def setInfiniteBranches(boolean value){
		hasInfiniteBranches = value
	}
	
	def boolean hasLimitBranches(){
		return hasLimitBranches
	}
	
	def setLimitBranches(boolean value){
		hasLimitBranches = value
	}
	
	def boolean hasSpecificWindowRange(){
		return hasSpecificWindowRange
	}
	
	def setSpecificWindowRange(boolean value){
		hasSpecificWindowRange = value
	}
	
	def boolean hasLabel(){
		return hasLabel
	}
	
	def setLabel(boolean value){
		hasLabel = value
	}
	
	def boolean hasUniqueCustomLabel(){
		return hasUniqueCustomLabel
	}
	
	def setUniqueCustomLabel(boolean value){
		hasUniqueCustomLabel = value
	}
	
	def boolean hasCommitHash(){
		return hasCommitHash
	}
	
	def setCommitHash(boolean value){
		hasCommitHash = value
	}
	
	def boolean hasFile(){
		return hasFile
	}
	
	def setFile(boolean value){
		hasFile = value
	}
	
	def boolean hasSemantic(){
		return hasSemantic
	}
	
	def setSemantic(boolean value){
		hasSemantic = value
	}
	
	def boolean hasElement(){
		return hasElement
	}
	
	def setElement(boolean value){
		hasElement = value
	}
	
	def boolean hasLine(){
		return hasLine
	}
	
	def setLine(boolean value){
		hasLine = value
	}
	
	def boolean hasLocalOnly(){
		return hasLocalOnly
	}
	
	def setLocalOnly(boolean value){
		hasLocalOnly = value
	}
	
	def boolean hasRemote(){
		return hasRemote
	}
	
	def setRemote(boolean value){
		hasRemote = value
	}
	
	def boolean hasSQL(){
		return hasSQL
	}
	
	def setSQL(boolean value){
		hasSQL = value
	}
	
	def boolean hasMongoDB(){
		return hasMongoDB
	}
	
	def setMongoDB(boolean value){
		hasMongoDB = value
	}
	
	def boolean hasNeo4J(){
		return hasNeo4J
	}
	
	def setNeo4J(boolean value){
		hasNeo4J = value
	}
	
	def boolean hasXMI(){
		return hasXMI
	}
	
	def setXMI(boolean value){
		hasXMI = value
	}
	
	def setHistory(History value){
		history = value
	}
	
	def setDatabase(EList<Database> value){
		databases = value
	}
	
	def setLowLevelCommands(EList<LowLevelCommand> value){
		llc = value
	}
	
	def setHighLevelCommands(EList<HighLevelCommand> value){
		hlc = value
	}
	
	def setAppName(String value){
		appName = value
	}
	
}