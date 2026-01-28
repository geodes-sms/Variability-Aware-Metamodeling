package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RemoteAddCommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import controllers.PorcelainController;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class RemoteAddCommand implements ICommand {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// The URL to the repository (https://...)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String remoteHttpUrl;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String remoteName;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Constructor gathers information to execute the command");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public RemoteAddCommand(String remoteHttpUrl, String remoteName) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.remoteHttpUrl = remoteHttpUrl;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.remoteName = remoteName;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Adds a remote repository to track with the current repository.");
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
    _builder.append("PorcelainController.getInstance().remoteAddCommand(remoteHttpUrl, remoteName);");
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
