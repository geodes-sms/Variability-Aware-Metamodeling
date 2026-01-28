package library.commands

class CheckoutCommandGenerator implements CommandGenerator{
	override generate()
	'''
	package commands;
	
	import org.eclipse.jgit.api.Git;
	
	import controllers.PorcelainController;
	
	public class CheckoutCommand implements ICommand {
		// The repository to execute the command on
		Git git;
		// The branch name to checkout
		String branchName;
		// The API to execute the command
		// JGitRepositoryAPI instance = JGitRepositoryAPI.getInstance();
	
		// Constructor gathers information to execute the command
		public CheckoutCommand(Git git, String branchName) {
			this.git = git;
			this.branchName = branchName;
		}
	
		/**
		 * Checkout the branch with the given name.
		 */
		@Override
		public void call() {
			PorcelainController.getInstance().checkoutCommand(git, branchName);
		}
	
	}

	'''
}