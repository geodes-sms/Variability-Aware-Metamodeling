package library.commands

import library.commands.CommandGenerator

class SuperCommandGenerator implements CommandGenerator {
	
	override generate() {
		'''
		package commands;
		
		import java.util.List;
		
		public abstract class SuperCommand implements ICommand {
			List<ICommand> lowCommands;
			String name;
		
			@Override
			public void call() {
				for (ICommand iCommand : lowCommands) {
					iCommand.call();
				}
			}
		}
		
		'''
	}
	
}