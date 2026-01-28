package dialogs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.LowCommands;
import vcsFeaturesMM.LowLevelCommand;

public class HighCommandsView extends DialogUtils{
	//https://git.eclipse.org/c/platform/eclipse.platform.swt.git/tree/examples/org.eclipse.swt.snippets/src/org/eclipse/swt/snippets/Snippet38.java
	
	// Snippets for TableEditors:
	// https://www.eclipse.org/swt/snippets/
	// https://github.com/eclipse-platform/eclipse.platform.swt/blob/master/examples/org.eclipse.swt.snippets/src/org/eclipse/swt/snippets/Snippet88.java (Mostly this one)
	// https://github.com/eclipse-platform/eclipse.platform.swt/blob/master/examples/org.eclipse.swt.snippets/src/org/eclipse/swt/snippets/Snippet124.java
	// https://github.com/eclipse-platform/eclipse.platform.swt/blob/master/examples/org.eclipse.swt.snippets/src/org/eclipse/swt/snippets/Snippet106.java
	EList<LowLevelCommand> lCommands;
	EList<HighLevelCommand> hCommands;
	List<Text> textAreas;
	Table table;

	public HighCommandsView(Shell parentShell, String message, String title, EList<LowLevelCommand> llc ) {
		super(parentShell, "Choose a custom ordered sequence to call basic commands", "Super commands declaration");
		setHelpAvailable(false);
		this.lCommands = llc;
		this.textAreas = new ArrayList<>();
	}

	@Override
	public void create() {
		super.create();
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Super commands");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite area = (Composite) super.initMainArea(parent);

		// Main container in which text labels can be inserted
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(3, false); // Change this value if you want more columns
		container.setLayout(layout);
		
		table = new Table (container, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		
		// TODO Make sure that only the low level commands that are selected can be input into the table (combo box or something)
		// https://stackoverflow.com/questions/52715567/how-to-display-ccombo-combo-box-inside-swt-table
		String[] titles = {"Command1", "Command2"}; // Always have 1 command more than what is currently filled
		for (String title : titles) {
			TableColumn column = new TableColumn (table, SWT.NONE);
			column.setText (title);
			column.pack();
		}
		// TODO Add 2 rows to start
		
		final TableEditor editor = new TableEditor(table);
		//The editor must have the same size as the cell and must
		//not be any smaller than 50 pixels.
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		editor.minimumWidth = 50;
		// editing the second column
		final int EDITABLECOLUMN = 1; // TODO change this. All columns will be editable
		
		table.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
			// Clean up any previous editor control
			Control oldEditor = editor.getEditor();
			if (oldEditor != null)
				oldEditor.dispose();

			// Identify the selected row
			TableItem item = (TableItem) e.item;
			if (item == null)
				return;

			// The control that will be the editor must be a child of the Table
			Text newEditor = new Text(table, SWT.NONE);
			newEditor.setText(item.getText(EDITABLECOLUMN));
			newEditor.addModifyListener(me -> {
				Text text = (Text) editor.getEditor();
				editor.getItem().setText(EDITABLECOLUMN, text.getText());
			});
			newEditor.selectAll();
			newEditor.setFocus();
			editor.setEditor(newEditor, item, EDITABLECOLUMN);
		}));
		

		//TODO Change this for a table
		// Create a label and text area to edit values
		/*
		 * for (LowLevelCommand lowLevelCommand : lCommands) { if
		 * (!lowLevelCommand.getName().isEmpty()) { createLabel(container,
		 * lowLevelCommand.getName()); // i.e. Open as xxx createLabel(container, "as");
		 * Text text = createText(container, true, false);
		 * text.setText(lowLevelCommand.getName()); // Adding the base name as the
		 * default value textAreas.add(text); }
		 * 
		 * }
		 */
		

		return super.createDialogArea(parent);
	}
	
	@Override
	public int open() {
		return super.open(); // Maybe I can modify this method to control what happens when it opens (i.e. loop to add more table rows)
	}

	@Override
	protected void saveInput() {
		for (int i = 0; i < hCommands.size(); i++) {
			hCommands.get(i).setName(textAreas.get(i).getText()); // Setting the ID of the command as the value of the user input
		}
	}
	
	public EList<HighLevelCommand> getCommands(){
		return hCommands;	
	}
	
	public Table getTable(){
		return table;
	}
	
}
