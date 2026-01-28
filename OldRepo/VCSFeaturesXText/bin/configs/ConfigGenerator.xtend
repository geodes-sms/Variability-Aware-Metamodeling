package configs

import org.eclipse.emf.ecore.resource.Resource

interface ConfigGenerator {
	def CharSequence generate(Resource resource)
}