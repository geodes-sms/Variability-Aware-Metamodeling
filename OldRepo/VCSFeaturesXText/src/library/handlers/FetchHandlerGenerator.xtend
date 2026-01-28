package library.handlers

class FetchHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.FetchCommand;
import controllers.PorcelainController;
import dialogs.FetchDialog;

public class FetchHandler extends AbstractHandler {
	FetchCommand fetchCommand;
	private FetchDialog dialog;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		// Get the remote branches only and show them to the user.
		dialog = new FetchDialog(window.getShell(), PorcelainController.getInstance().remoteListClean(),
				PorcelainController.getInstance().getRemoteBranchesClean());
		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Simply call the command and execute it.
			// Create the command and set the path

			fetchCommand = new FetchCommand(PorcelainController.getInstance().getWorkspace(),
					dialog.getRemoteSelection(), dialog.getBranchSelection(), dialog.getUsername(),
					dialog.getPassword());
			fetchCommand.call();
		}
		return null;
	}

}

	'''
}