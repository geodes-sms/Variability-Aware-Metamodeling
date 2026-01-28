package library.commands

class AddCommandGenerator implements CommandGenerator{
	override generate()
	'''
	package commands;
	
	import java.util.List;
	
	import org.eclipse.jgit.api.Git;
	
	import controllers.PorcelainController;
	
	public class AddCommand implements ICommand {
		// The repository to execute the command on
		Git git;
		// List of all the paths (to the files) to add to the repository tracking
		List<String> paths;
	
	
		// Constructor gathers information to execute the command
		public AddCommand(Git git, List<String> paths) {
			this.git = git;
			this.paths = paths;
		}
	
		/**
		 * Add a list of paths (files) to the repository tracking.
		 */
		@Override
		public void call() {
			PorcelainController.getInstance().addCommand(git, paths);
	
		}
	
	}
	
	'''

	
}