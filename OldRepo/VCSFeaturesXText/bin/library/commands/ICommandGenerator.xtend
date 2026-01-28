package library.commands

class ICommandGenerator implements CommandGenerator{
	override generate()
	'''
package commands;

// This interface is used by functions that can be toggled on and off by the code generation. This is so any function can be replaced by any other whenever they are called
// https://refactoring.guru/design-patterns/command

/*
 * A command should be self contained, meaning it should have all the information it requires to function inside the object or be able to go fetch that information.
 * */
public interface ICommand {

	public void call();
}

	'''
}