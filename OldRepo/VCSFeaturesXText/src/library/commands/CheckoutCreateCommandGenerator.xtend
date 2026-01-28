package library.commands

class CheckoutCreateCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import org.eclipse.jgit.api.Git;

import controllers.PorcelainController;

public class CheckoutCreateCommand implements ICommand {
	// The repository to execute the command on
	Git git;
	// The branch name to checkout
	String branchName;

	// The API to execute the command
	// JGitRepositoryAPI instance = JGitRepositoryAPI.getInstance();
	public CheckoutCreateCommand(Git workspace, String branchSelection) {
		this.git = workspace;
		this.branchName = branchSelection;
	}

	@Override
	public void call() {
		PorcelainController.getInstance().checkoutCreateCommand(git, branchName);

	}

}

	'''
}