package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class LogCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @hidden This class is not used for now.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @see PorcelainController.logCommand() for the actual use of this method.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class LogCommand implements ICommand {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void call() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PorcelainController.getInstance().logCommand();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
