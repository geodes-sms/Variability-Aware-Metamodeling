package library.handlers

class LogHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.LogCommand;
import controllers.PorcelainController;
import dialogs.LogDialog;

public class LogHandler extends AbstractHandler {

	LogCommand logCommand;
	private LogDialog dialog;

	public LogHandler() {
		super();
		// TODO change the hard code for user input (dialog or SelectUtils from EGit)
		// initCommand = new
		// InitCommand("C:/Users/WickkaWizz/egit-master/ws/Playground2");
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Initialize the window and set the shell
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		dialog = new LogDialog(window.getShell(), PorcelainController.getInstance().logCommand());
		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			/*
			 * Here I could give an option to collect a given commit ID and rollback to this
			 * specific commit. I could do multiple other things as well.
			 */
		}
		return null;
	}
}

	'''
}