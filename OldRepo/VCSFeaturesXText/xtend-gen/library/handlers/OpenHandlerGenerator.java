package library.handlers;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class OpenHandlerGenerator implements HandlerGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package handlers;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.core.commands.AbstractHandler;");
    _builder.newLine();
    _builder.append("import org.eclipse.core.commands.ExecutionEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.core.commands.ExecutionException;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.DirectoryDialog;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.IWorkbenchWindow;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.handlers.HandlerUtil;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import commands.OpenCommand;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class OpenHandler extends AbstractHandler {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("OpenCommand openCommand;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private DirectoryDialog dialog;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public OpenHandler() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Object execute(ExecutionEvent event) throws ExecutionException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("dialog = new DirectoryDialog(window.getShell());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String directory = dialog.open();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("openCommand = new OpenCommand(directory);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("openCommand.call();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
