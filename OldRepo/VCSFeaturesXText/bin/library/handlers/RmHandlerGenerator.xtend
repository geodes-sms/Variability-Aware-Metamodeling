package library.handlers

class RmHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.RmCommand;
import dialogs.RmDialog;

public class RmHandler extends AbstractHandler {
	RmDialog dialog;
	private RmCommand rmCommand;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Initialize the window and set the shell
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		dialog = new RmDialog(window.getShell());

		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Create the command and set the path
			// Example of a valid path: C:/Users/WickkaWizz/egit-master/ws/Playground2
			// TODO change this command creation to something that fits lists better
			rmCommand = new RmCommand(Arrays.asList(dialog.getPathToRepo()));
			rmCommand.call();
		}
		return null;
	}
}

	'''
}