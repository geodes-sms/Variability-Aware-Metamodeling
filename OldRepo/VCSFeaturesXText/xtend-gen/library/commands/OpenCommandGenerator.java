package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class OpenCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class OpenCommand implements ICommand {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String directory;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public OpenCommand(String dir) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("directory = dir;");
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
    _builder.append("PorcelainController.getInstance().openLocalDirectory(directory);");
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
