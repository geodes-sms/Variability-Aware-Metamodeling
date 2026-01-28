package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AddCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.jgit.api.Git;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class AddCommand implements ICommand {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// The repository to execute the command on");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Git git;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// List of all the paths (to the files) to add to the repository tracking");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<String> paths;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Constructor gathers information to execute the command");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public AddCommand(Git git, List<String> paths) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.git = git;");
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
    _builder.append("* Add a list of paths (files) to the repository tracking.");
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
    _builder.append("PorcelainController.getInstance().addCommand(git, paths);");
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
