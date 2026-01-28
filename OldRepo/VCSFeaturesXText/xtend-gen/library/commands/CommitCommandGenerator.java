package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CommitCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// https://refactoring.guru/design-patterns/command");
    _builder.newLine();
    _builder.append("// All I need is to make a menu button and save a reference to the command I want it to execute");
    _builder.newLine();
    _builder.append("public class CommitCommand implements ICommand {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String commitMessage;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public CommitCommand(String commitMessage) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.commitMessage = commitMessage;");
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
    _builder.append("PorcelainController.getInstance().commit(commitMessage);");
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
