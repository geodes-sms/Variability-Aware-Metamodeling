package library.commands;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ICommandGenerator implements CommandGenerator {
  @Override
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package commands;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// This interface is used by functions that can be toggled on and off by the code generation. This is so any function can be replaced by any other whenever they are called");
    _builder.newLine();
    _builder.append("// https://refactoring.guru/design-patterns/command");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* A command should be self contained, meaning it should have all the information it requires to function inside the object or be able to go fetch that information.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* */");
    _builder.newLine();
    _builder.append("public interface ICommand {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void call();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
