package library.commands

class PullCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import controllers.PorcelainController;

public class PullCommand implements ICommand {
	private String username;
	private String password;

	public PullCommand(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public void call() {
		PorcelainController.getInstance().pullCommand(username, password);

	}

}

	'''
}