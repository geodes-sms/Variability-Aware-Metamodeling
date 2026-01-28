package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CheckoutCreateCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.jgit.api.Git;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class CheckoutCreateCommand implements ICommand {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// The repository to execute the command on");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Git git;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// The branch name to checkout");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String branchName;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// The API to execute the command");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// JGitRepositoryAPI instance = JGitRepositoryAPI.getInstance();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public CheckoutCreateCommand(Git workspace, String branchSelection) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.git = workspace;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.branchName = branchSelection;");
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
    _builder.append("PorcelainController.getInstance().checkoutCreateCommand(git, branchName);");
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
