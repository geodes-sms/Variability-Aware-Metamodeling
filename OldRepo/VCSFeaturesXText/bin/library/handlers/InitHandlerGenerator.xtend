package library.handlers

class InitHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.InitCommand;
import dialogs.InitDialog;

public class InitHandler extends AbstractHandler {

	InitCommand initCommand;
	private InitDialog dialog;

	public InitHandler() {
		super();
		// TODO change the hard code for user input (dialog or SelectUtils from EGit)
		// initCommand = new
		// InitCommand("C:/Users/WickkaWizz/egit-master/ws/Playground2");
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Initialize the window and set the shell
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		dialog = new InitDialog(window.getShell());
		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Simply call the command and execute it.
			// Create the command and set the path
			// Example of a valid path: C:/Users/WickkaWizz/egit-master/ws/Playground2

			System.out.println(dialog.getPathToRepo());

			initCommand = new InitCommand(dialog.getPathToRepo());
			initCommand.call();
		}
		return null;
	}

}

	'''
}