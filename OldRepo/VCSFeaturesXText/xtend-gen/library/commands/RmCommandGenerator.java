package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RmCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RmCommand implements ICommand {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// List of all the paths (to the files) to remove from the repository tracking");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO Investigate whether I should look only for .xmi files and make a helper");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// class for this");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<String> paths;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Constructor gathers information to execute the command");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public RmCommand(List<String> paths) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.paths = paths;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Remove a list of paths (files) to the repository tracking.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void call() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO How to fetch those paths? I need to get the current working dir?");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PorcelainController.getInstance().rmCommand(paths);");
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
