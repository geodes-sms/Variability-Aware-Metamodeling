package library.handlers

class AddHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import java.util.Arrays;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.AddCommand;
import controllers.PorcelainController;
import dialogs.AddDialog;

public class AddHandler extends AbstractHandler {

	// TODO Check this for a better way of getting selected files, instead of asking
	// the user for a path.
	// https://www.vogella.com/tutorials/EclipseProjectNatures/article.html
	AddDialog dialog;
	private AddCommand addCommand;

	@Override
	public Object execute(ExecutionEvent event) throws org.eclipse.core.commands.ExecutionException {
		// Initialize the window and set the shell
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		dialog = new AddDialog(window.getShell());

		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Create the command and set the path
			// Example of a valid path: C:/Users/WickkaWizz/egit-master/ws/Playground2
			// TODO change this command creation to something that fits lists better
			addCommand = new AddCommand(PorcelainController.getInstance().getWorkspace(),
					Arrays.asList(dialog.getPathToRepo()));
			addCommand.call();
		}
		return null;
	}

}

	'''
}