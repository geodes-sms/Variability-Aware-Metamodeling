package library.commands

class InitCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import controllers.PorcelainController;

public class InitCommand implements ICommand {

	String directory;

	public InitCommand(String dir) {
		directory = dir;
	}

	@Override
	public void call() {
		PorcelainController.getInstance().initLocalDirectory(directory);
	}

}

	'''
}