package library.commands

class PushCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import controllers.PorcelainController;

public class PushCommand implements ICommand {

	private String username;
	private String password;

	public PushCommand(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public void call() {
		PorcelainController.getInstance().pushCommand(username, password);
	}

}

	'''
}