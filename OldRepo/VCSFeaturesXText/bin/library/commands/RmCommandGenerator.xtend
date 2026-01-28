package library.commands

class RmCommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

import java.util.List;

import controllers.PorcelainController;

public class RmCommand implements ICommand {
	// List of all the paths (to the files) to remove from the repository tracking
	// TODO Investigate whether I should look only for .xmi files and make a helper
	// class for this
	List<String> paths;

	// Constructor gathers information to execute the command
	public RmCommand(List<String> paths) {
		this.paths = paths;
	}

	/**
	 * Remove a list of paths (files) to the repository tracking.
	 */
	@Override
	public void call() {
		// TODO How to fetch those paths? I need to get the current working dir?
		PorcelainController.getInstance().rmCommand(paths);

	}

}

	'''
}