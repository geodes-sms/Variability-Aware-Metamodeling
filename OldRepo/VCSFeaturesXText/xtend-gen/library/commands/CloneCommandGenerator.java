package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CloneCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class CloneCommand implements ICommand {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String remoteRepo;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String directory;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String username;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String password;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Boolean cloneAllbranches;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public CloneCommand(String remoteRepoURL, String directory, Boolean cloneAllbranches, String username,");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("String password) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.remoteRepo = remoteRepoURL;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.directory = directory;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.cloneAllbranches = cloneAllbranches;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.username = username;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.password = password;");
    _builder.newLine();
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
    _builder.append("PorcelainController.getInstance().cloneRepository(remoteRepo, directory, username, password, cloneAllbranches);");
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
