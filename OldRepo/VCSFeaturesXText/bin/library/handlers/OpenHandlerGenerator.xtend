package library.handlers

class OpenHandlerGenerator implements HandlerGenerator{
	override generate()
	'''
package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import commands.OpenCommand;

public class OpenHandler extends AbstractHandler {
	OpenCommand openCommand;
	private DirectoryDialog dialog;

	public OpenHandler() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		dialog = new DirectoryDialog(window.getShell());

		String directory = dialog.open();
		openCommand = new OpenCommand(directory);
		openCommand.call();

		return null;
	}
}

	'''
}