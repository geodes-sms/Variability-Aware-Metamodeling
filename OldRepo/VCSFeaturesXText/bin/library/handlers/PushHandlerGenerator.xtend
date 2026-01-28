package library.handlers

class PushHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.PushCommand;
import dialogs.PushDialog;

public class PushHandler extends AbstractHandler {
	PushCommand pushCommand;
	private PushDialog dialog;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		// Get the remote branches only and show them to the user.
		dialog = new PushDialog(window.getShell());
		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Simply call the command and execute it.
			// Create the command and set the path
			pushCommand = new PushCommand(dialog.getUsername(), dialog.getPassword());
			pushCommand.call();
		}
		return null;
	}
}

	'''
}