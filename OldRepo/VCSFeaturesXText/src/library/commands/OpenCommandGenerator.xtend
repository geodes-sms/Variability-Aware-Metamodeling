package library.commands

class OpenCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import controllers.PorcelainController;

public class OpenCommand implements ICommand {

	String directory;

	public OpenCommand(String dir) {
		directory = dir;
	}

	@Override
	public void call() {
		PorcelainController.getInstance().openLocalDirectory(directory);
	}

}

	'''
}