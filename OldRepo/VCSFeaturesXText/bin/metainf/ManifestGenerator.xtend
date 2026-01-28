package metainf

import org.eclipse.emf.ecore.resource.Resource
import vcsFeaturesMM.VCSFeatures

class ManifestGenerator {
	def generate(Resource resource)
	'''
	Manifest-Version: 1.0
	Bundle-ManifestVersion: 2
	Bundle-Name: «resource.allContents.filter(VCSFeatures).head.name»
	Bundle-SymbolicName: «resource.allContents.filter(VCSFeatures).head.name»;singleton:=true
	Bundle-Version: 1.0.0.qualifier
	Bundle-Activator: «resource.allContents.filter(VCSFeatures).head.name.toLowerCase».Activator
	Require-Bundle: org.eclipse.swt,
	 org.eclipse.e4.ui.model.workbench,
	 org.eclipse.jface,
	 org.eclipse.e4.ui.services,
	 org.eclipse.e4.ui.workbench,
	 org.eclipse.e4.core.di,
	 org.eclipse.e4.ui.di,
	 org.eclipse.e4.core.contexts,
	 org.eclipse.core.runtime,
	 org.eclipse.ui,
	 org.eclipse.jgit
	Bundle-RequiredExecutionEnvironment: JavaSE-21
	Automatic-Module-Name: «resource.allContents.filter(VCSFeatures).head.name»
	Import-Package: jakarta.annotation;version="[2.1.0,3.0.0)",
	 jakarta.inject;version="[2.0.0,3.0.0)",
	 org.eclipse.core.resources
	Bundle-ActivationPolicy: lazy
	'''
}