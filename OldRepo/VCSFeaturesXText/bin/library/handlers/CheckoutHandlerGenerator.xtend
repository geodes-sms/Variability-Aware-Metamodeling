package library.handlers

class CheckoutHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.CheckoutCommand;
import controllers.PorcelainController;
import dialogs.CheckoutDialog;

public class CheckoutHandler extends AbstractHandler {

	CheckoutCommand checkoutCommand;
	private CheckoutDialog dialog;

	public CheckoutHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		// If the list is empty or size=1, then there's nothing to checkout
		// Otherwise, print the list in a dialog (table?)

		dialog = new CheckoutDialog(window.getShell(), PorcelainController.getInstance().getBranchesClean());
		// Open the dialog
		dialog.create();

		// If OK has been pressed, do something
		if (dialog.open() == Window.OK) {
			// Simply call the command and execute it.
			// Create the command and set the path
			// Example of a valid path: C:/Users/WickkaWizz/egit-master/ws/Playground2
			// TODO Might be NULL, so needs to catch the exception here, just in case.
			checkoutCommand = new CheckoutCommand(PorcelainController.getInstance().getWorkspace(), dialog.getBranchSelection());
			checkoutCommand.call();
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

	'''
}