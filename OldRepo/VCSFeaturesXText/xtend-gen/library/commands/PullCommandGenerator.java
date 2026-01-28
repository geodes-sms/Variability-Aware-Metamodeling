package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PullCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class PullCommand implements ICommand {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String username;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String password;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public PullCommand(String username, String password) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.username = username;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.password = password;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void call() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PorcelainController.getInstance().pullCommand(username, password);");
    _builder.newLine();
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
