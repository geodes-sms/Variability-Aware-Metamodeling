package library.handlers

class CommitHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.CommitCommand;
import dialogs.CommitDialog;

public class CommitHandler extends AbstractHandler {
	CommitCommand commitCommand;
	private CommitDialog dialog;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		// If the list is empty or size=1, then there's nothing to checkout
		// Otherwise, print the list in a dialog (table?)

		dialog = new CommitDialog(window.getShell());
		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Simply call the command and execute it.
			// Create the command and set the path
			// Example of a valid path: C:/Users/WickkaWizz/egit-master/ws/Playground2
			// TODO Might be NULL, so needs to catch the exception here, just in case.
			commitCommand = new CommitCommand(dialog.getCommitMessage());
			commitCommand.call();
		}
		return null;
	}

}

	'''
}