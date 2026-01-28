package library.handlers;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AboutHandlerGenerator implements HandlerGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package handlers;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.e4.core.di.annotations.Execute;");
    _builder.newLine();
    _builder.append("import org.eclipse.jface.dialogs.MessageDialog;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Shell;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class AboutHandler {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Execute");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void execute(Shell shell) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("MessageDialog.openInformation(shell, \"About\", \"Eclipse RCP Application\");");
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
