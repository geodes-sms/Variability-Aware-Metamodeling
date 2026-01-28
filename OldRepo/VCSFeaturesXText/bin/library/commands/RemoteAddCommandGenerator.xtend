package library.commands

class RemoteAddCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import controllers.PorcelainController;

public class RemoteAddCommand implements ICommand {
	// The URL to the repository (https://...)
	String remoteHttpUrl;
	String remoteName;

	// Constructor gathers information to execute the command
	public RemoteAddCommand(String remoteHttpUrl, String remoteName) {
		this.remoteHttpUrl = remoteHttpUrl;
		this.remoteName = remoteName;
	}

	/**
	 * Adds a remote repository to track with the current repository.
	 */
	@Override
	public void call() {
		PorcelainController.getInstance().remoteAddCommand(remoteHttpUrl, remoteName);
	}

}

	'''
}