package configs

import org.eclipse.emf.ecore.resource.Resource
import vcsFeaturesMM.LowLevelCommand
import vcsFeaturesMM.HighLevelCommand
import vcsFeaturesMM.VCSFeatures

class PluginGenerator implements ConfigGenerator{
	
	override generate(Resource resource) {
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<?eclipse version="3.4"?>
		<plugin>
		
		   <extension
		         id="product"
		         point="org.eclipse.core.runtime.products">
		      <product
		            application="org.eclipse.e4.ui.workbench.swt.E4Application"
		            name="«resource.allContents.filter(VCSFeatures).head.name.toLowerCase»">
		         <property
		               name="applicationCSS"
		               value="platform:/plugin/«resource.allContents.filter(VCSFeatures).head.name»/css/default.css">
		         </property>
		      </product>
		   </extension>
		
		<extension
		         point="org.eclipse.ui.commands">
		      <category
		            id="«resource.allContents.filter(VCSFeatures).head.name».commands.category"
		            name="Sample Category">
		      </category>
		      <category
		            id="«resource.allContents.filter(VCSFeatures).head.name».uiCommands"
		            name="UI Commands">
		      </category>
		      <command
		            categoryId="«resource.allContents.filter(VCSFeatures).head.name».commands.category"
		            description="This command is used to rename JGit commands (give aliases)"
		            id="«resource.allContents.filter(VCSFeatures).head.name».commands.renameCommand"
		            name="Rename Command">
		      </command>
		      «FOR llc : resource.allContents.filter(LowLevelCommand).toIterable»
		      <command
		            categoryId="«resource.allContents.filter(VCSFeatures).head.name».uiCommands"
		            id="«resource.allContents.filter(VCSFeatures).head.name».«llc.command.getName»"
		            name="«llc.name»">
		      </command>
		      «ENDFOR»
		      «FOR hlc : resource.allContents.filter(HighLevelCommand).toIterable»
		      <command
		      		categoryId="«resource.allContents.filter(VCSFeatures).head.name».uiCommands"
		      		id="«resource.allContents.filter(VCSFeatures).head.name».«hlc.name + "Command"»"
		      		name="«hlc.name»">
		      </command>
  		      «ENDFOR»
		   </extension>
		   <extension
		         point="org.eclipse.ui.handlers">
		      <handler
		            class="handlers.RenameHandler"
		            commandId="«resource.allContents.filter(VCSFeatures).head.name».commands.renameCommand">
		      </handler>
		      «FOR llc : resource.allContents.filter(LowLevelCommand).toIterable»
			<handler			
					class="handlers.«llc.command.getName.split("Command").get(0) + "Handler"»"
					commandId="«resource.allContents.filter(VCSFeatures).head.name».«llc.command.getName»">
			</handler>
  		      «ENDFOR»
  		      «FOR hlc : resource.allContents.filter(HighLevelCommand).toIterable»
  			<handler			
  					class="handlers.«hlc.getName + "Handler"»"
  					commandId="«resource.allContents.filter(VCSFeatures).head.name».«hlc.name + "Command"»">
  			</handler>
		      «ENDFOR»
		   </extension>
		   <extension
		            point="org.eclipse.ui.menus">
		   		<menuContribution
		               allPopups="false"
		               locationURI="popup:org.eclipse.ui.popup.any?after=additions">
		            <menu
		                  id="org.eclipse.ui.navigator.ProjectExplorer.VCSBuilder"
		                  label="VCSBuilder">
		                  «FOR llc : resource.allContents.filter(LowLevelCommand).toIterable»
		               <command
		                     commandId="«resource.allContents.filter(VCSFeatures).head.name».«llc.command.getName»"
		                     label="«llc.name»"
		                     style="push">
		               </command>
            		      «ENDFOR»
            		      «FOR hlc : resource.allContents.filter(HighLevelCommand).toIterable»
  		               <command
  		                     commandId="«resource.allContents.filter(VCSFeatures).head.name».«hlc.name + "Command"»"
  		                     label="«hlc.name»"
  		                     style="push">
  		               </command>
              		      «ENDFOR»
		            </menu>
		         </menuContribution>
			</extension>
		</plugin>

		'''
	}
	
}