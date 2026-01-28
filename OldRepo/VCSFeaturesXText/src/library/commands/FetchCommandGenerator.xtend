package library.commands

class FetchCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import org.eclipse.jgit.api.Git;

import controllers.PorcelainController;

public class FetchCommand implements ICommand {
	// The repository to execute the command on
	Git git;
	// The username for credentials
	String username;
	// The password for credentials
	String password;
	// The name of the remote repository i.e. "origin"
	String remoteName;
	// The name of the remote branch to fetch updates from
	String remoteBranchName;

	// Constructor gathers information to execute the command
	public FetchCommand(Git git, String remoteName, String remoteBranchName, String username, String password) {
		this.git = git;
		this.remoteName = remoteName;
		this.remoteBranchName = remoteBranchName;
		this.username = username;
		this.password = password;
	}

	/**
	 * Fetch changes upstream.
	 */
	@Override
	public void call() {
		PorcelainController.getInstance().fetchCommand(git, remoteName, remoteBranchName, username, password);

	}

}

	'''
}