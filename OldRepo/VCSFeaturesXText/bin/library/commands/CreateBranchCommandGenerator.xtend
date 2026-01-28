package library.commands

class CreateBranchCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import org.eclipse.jgit.api.Git;

import controllers.PorcelainController;

public class CreateBranchCommand implements ICommand {
	// The repository to execute the command on
	Git git;
	// The branch name to create
	String branchName;


	// Constructor gathers information to execute the command
	public CreateBranchCommand(Git git, String branchName) {
		this.git = git;
		this.branchName = branchName;
	}

	/**
	 * Create a new branch with the given name.
	 */
	@Override
	public void call() {
		PorcelainController.getInstance().createBranch(git, branchName);

	}

}

	'''
}