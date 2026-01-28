package library.handlers

class RenameHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import dialogs.RenamerDialog;
import functions.Renamer;

public class RenameHandler extends AbstractHandler{

	Renamer renamer;

	public RenameHandler() {
		renamer = Renamer.getRenamer();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// I use TitleAreaDialog because it lets me collect multiple information from the user, which is what we need. The Command name and the Alias
		// Example here: https://www.vogella.com/tutorials/EclipseDialogs/article.html
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		RenamerDialog dialog = new RenamerDialog(window.getShell());
		// just to demonstrate also how to set the title background color
		dialog.setTitleAreaColor(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY).getRGB());

		// now open the dialog
		dialog.create();
		if (dialog.open() == Window.OK) {
			// Collect the command and the alias names from the class
			// TODO change the logic here to set the new alias
			Map<String, String> commands = renamer.setAlias(dialog.getCommandName(), dialog.getAliasName());
			System.out.println("The command: " + dialog.getCommandName() + " is now associated with the Alias: " + commands.get(dialog.getCommandName()));

		    //System.out.println(dialog.getCommandName());
		    //System.out.println(dialog.getAliasName());
		    }
		return null;

		// Old version with only 1 input
		/*InputDialog dlg = new InputDialog(
		          HandlerUtil.getActiveShellChecked(event), "Title",
		          "Enter text", "Initial value", null);
		      if (dlg.open() == Window.OK) {
		        // User clicked OK; run perl
		        String input = dlg.getValue();
		        System.out.println(renamer.getAlias(input));
		      }
		      return null;*/


	}

}

	'''
}