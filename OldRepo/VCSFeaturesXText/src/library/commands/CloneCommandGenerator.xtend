package library.commands

class CloneCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import controllers.PorcelainController;

public class CloneCommand implements ICommand {
	String remoteRepo;
	String directory;
	String username;
	String password;
	Boolean cloneAllbranches;

	public CloneCommand(String remoteRepoURL, String directory, Boolean cloneAllbranches, String username,
			String password) {
		this.remoteRepo = remoteRepoURL;
		this.directory = directory;
		this.cloneAllbranches = cloneAllbranches;
		this.username = username;
		this.password = password;

	}

	@Override
	public void call() {
		PorcelainController.getInstance().cloneRepository(remoteRepo, directory, username, password, cloneAllbranches);
	}

}

	'''
}