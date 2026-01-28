package library.handlers

class RemoteAddHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.RemoteAddCommand;
import dialogs.RemoteAddDialog;

public class RemoteAddHandler extends AbstractHandler {
	RemoteAddCommand remoteAddCommand;
	private RemoteAddDialog dialog;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Initialize the window and set the shell
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		RemoteAddDialog dialog = new RemoteAddDialog(window.getShell());

		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Create the command and set the path
			// Example of a valid path: C:/Users/WickkaWizz/egit-master/ws/Playground2
			remoteAddCommand = new RemoteAddCommand(dialog.getRemoteURL(), dialog.getRemoteName());
			remoteAddCommand.call();
		}
		return null;
	}

}

	'''
}