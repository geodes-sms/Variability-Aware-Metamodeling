package library.commands

class CommitCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import controllers.PorcelainController;

// https://refactoring.guru/design-patterns/command
// All I need is to make a menu button and save a reference to the command I want it to execute
public class CommitCommand implements ICommand {
	String commitMessage;

	public CommitCommand(String commitMessage) {
		this.commitMessage = commitMessage;
	}

	@Override
	public void call() {
		PorcelainController.getInstance().commit(commitMessage);
	}

}

	'''
}