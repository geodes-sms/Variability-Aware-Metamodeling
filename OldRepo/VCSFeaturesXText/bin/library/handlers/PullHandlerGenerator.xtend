package library.handlers

class PullHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.PullCommand;
import dialogs.PullDialog;

public class PullHandler extends AbstractHandler {
	PullCommand pullCommand;
	private PullDialog dialog;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		// Get the remote branches only and show them to the user.
		dialog = new PullDialog(window.getShell());
		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Simply call the command and execute it.
			// Create the command and set the path
			pullCommand = new PullCommand(dialog.getUsername(), dialog.getPassword());
			pullCommand.call();
		}
		return null;
	}

}

	'''
}