package dialogs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import vcsFeaturesMM.Database;
import vcsFeaturesMM.DatabaseType;
import vcsFeaturesMM.VcsFeaturesMMFactory;
import vcsFeaturesMM.impl.VcsFeaturesMMFactoryImpl;

// Reuse the SuperCommandsPage for this one. The table and buttons can be easily reused, just change the text and combo boxes to Text areas.

// Overview: Cannot add columns, they are fixed with this order: Combo box with database type -> @ -> text area where user writes the address
public class DatabasesPage extends WizardPage {
	private final String[] titles = {"XMI", "SQL", "MongoDB", "Neo4J"};
	private boolean hasXMI;
	private boolean hasSQL;
	private boolean hasMongoDB;
	private boolean hasNeo4J;
	private Composite container;
	private Table table;
	private Map<String, CCombo> comboBoxes;
	private Map<String, Label> labels;
	private Map<String, Text> textAreas;

	protected DatabasesPage(String pageName, boolean hasXMI, boolean hasSQL, boolean hasMongoDB, boolean hasNeo4J) {
		super(pageName);
		setTitle("Specify database addresses");
        setDescription("For each database you want to store your data, write the address (i.e. IP or web link)");
        this.hasXMI = hasXMI;
        this.hasSQL = hasSQL;
        this.hasMongoDB = hasMongoDB;
        this.hasNeo4J = hasNeo4J;
        comboBoxes = new HashMap<>();
        labels = new HashMap<>();
        textAreas = new HashMap<>();
	}

    @Override
    public void createControl(Composite parent) {
        container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 1;
        resetTable();
        setColumns();
        setButtons();
        setTableItems(table, table.getItems());
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(true);
    }

	private void setButtons() {
		// Buttons section for adding and removing rows
        final Button addRowsButton = new Button(container, SWT.PUSH);
        addRowsButton.setText("Add new database entry");
        addRowsButton.addListener(SWT.Selection, new Listener() {
          @Override
          public void handleEvent(Event event) {
            new TableItem(table, SWT.DROP_DOWN);
            setTableItems(table, table.getItems());
          }
        });
        
        
        final Button deleteRowsButton = new Button(container, SWT.PUSH);
        deleteRowsButton.setText("Remove last database entry");
        deleteRowsButton.addListener(SWT.Selection, new Listener() {
          @Override
          public void handleEvent(Event event) {
        	  // If there is a row left
        	  if (table.getItemCount()>0) {
        		  System.out.println(comboBoxes.get(String.valueOf(table.getItemCount())));
    			  // Get the combo box and dispose of it (Column is always = 1)
    			  comboBoxes.get(String.valueOf(table.getItemCount() - 1)).dispose();
    			  // Get the label and dispose of it (Column is always = 1)
    			  labels.get(String.valueOf(table.getItemCount() - 1)).dispose();
    			  // Get the textArea for the name and dispose of it (Column is always = 0)
    			  textAreas.get(String.valueOf(table.getItemCount() - 1) + String.valueOf(0)).dispose();
    			  // Get the textArea for the address and dispose of it (Column is always = 3)
    			  textAreas.get(String.valueOf(table.getItemCount() - 1) + String.valueOf(3)).dispose();
        		  // Then dispose of the row itself
        		  table.getItem(table.getItemCount() - 1).dispose();;
			}
          }
        });
	}

	private void setColumns() {
		String[] titles = {"Name", "Type", "@", "Address"}; // 4 fixed columns that never changes
		TableColumn column1 = new TableColumn (table, SWT.NONE | SWT.SINGLE);
		column1.setText (titles[0]);
		column1.setWidth(115);
		
		TableColumn column2 = new TableColumn (table, SWT.NONE | SWT.DROP_DOWN);
		column2.setText (titles[1]);
		column2.setWidth(115);
		
		TableColumn column3 = new TableColumn (table, SWT.NONE | SWT.SINGLE);
		column3.setText (titles[2]);
		column3.setWidth(30);
		
		TableColumn column4 = new TableColumn (table, SWT.NONE | SWT.SINGLE);
		column4.setText (titles[3]);
		column4.setWidth(115);
	}

	private void resetTable() {
		table = new Table(container, SWT.BORDER | SWT.MULTI);
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        table.setLinesVisible(true);
        table.setHeaderVisible(true);
	}

	private void setTableItems(final Table right_group_table, final TableItem[] items) {
		table.setRedraw(false);
		for (int i = 0; i < items.length; i++) {
        	
        	CCombo templateDropdown = new CCombo(right_group_table, SWT.NONE);
	        templateDropdown.setText("Database");
	        
	        // Only add the necessary database
	        if (hasXMI) {
	        	templateDropdown.add(titles[0]);
			}
	        if (hasSQL) {
				templateDropdown.add(titles[1]);
			}
			if (hasMongoDB) {
				templateDropdown.add(titles[2]);	
			}
			if (hasNeo4J) {
				templateDropdown.add(titles[3]);
			}
			
			// Add the text area for the Name
			 Text templateTextName = new Text(right_group_table, SWT.BORDER | SWT.SINGLE);
			 
			 if (textAreas.containsKey(String.valueOf(i) + String.valueOf(0))) { // The key is the index of the combo box in the table (i.e. CCombo at position i=1 & j=4 -> key=14)
				 if (!textAreas.get(String.valueOf(i) + String.valueOf(0)).isDisposed()) {
					 templateTextName.setText(textAreas.get(String.valueOf(i) + String.valueOf(0)).getText());
				}
				 textAreas.remove(String.valueOf(i) + String.valueOf(0)).dispose();
			}
			 textAreas.put(String.valueOf(i) + String.valueOf(0), templateTextName);
			 
			 final TableEditor editor1 = new TableEditor(right_group_table);
			 editor1.grabHorizontal = true;
			 editor1.setEditor(templateTextName, items[i], 0);
	        
			 // Add the combo box for the database type
			 final TableEditor editor2 = new TableEditor(right_group_table);
			 editor2.grabHorizontal = true;
			 editor2.setEditor(templateDropdown, items[i], 1);
			 if (comboBoxes.containsKey(String.valueOf(i))) { // The key is the index of the combo box in the table (i.e. CCombo at position i=1 & j=4 -> key=14)
				 if (!comboBoxes.get(String.valueOf(i)).isDisposed() && !comboBoxes.get(String.valueOf(i)).getText().equals("Database")) {
					 templateDropdown.select(comboBoxes.get(String.valueOf(i)).getSelectionIndex()); // transfer the selection index to the new one
				}
				 comboBoxes.remove(String.valueOf(i)).dispose();
			}
				 comboBoxes.put(String.valueOf(i), templateDropdown);
			 
			 
			 // Add the label after the combo box
			 Label templateLabel = new Label(right_group_table, SWT.NONE);
			 templateLabel.setText("@");
			 if (labels.containsKey(String.valueOf(i))) { // The key is the index of the combo box in the table (i.e. CCombo at position i=1 & j=4 -> key=14)
				 labels.remove(String.valueOf(i)).dispose();
			}
			 labels.put(String.valueOf(i), templateLabel);
			 final TableEditor editor3 = new TableEditor(right_group_table);
			 editor3.grabHorizontal = true;
			 editor3.setEditor(templateLabel, items[i], 2);
			 
			// Add the text area after the label
			 Text templateTextAddress = new Text(right_group_table, SWT.BORDER | SWT.SINGLE);
			 
			 if (textAreas.containsKey(String.valueOf(i) + String.valueOf(3))) { // The key is the index of the combo box in the table (i.e. CCombo at position i=1 & j=4 -> key=14)
				 if (!textAreas.get(String.valueOf(i) + String.valueOf(3)).isDisposed()) {
					 templateTextAddress.setText(textAreas.get(String.valueOf(i) + String.valueOf(3)).getText());
				}
				 textAreas.remove(String.valueOf(i) + String.valueOf(3)).dispose();
			}
			 textAreas.put(String.valueOf(i) + String.valueOf(3), templateTextAddress);
			 
			 final TableEditor editor4 = new TableEditor(right_group_table);
			 editor4.grabHorizontal = true;
			 editor4.setEditor(templateTextAddress, items[i], 3);
			}
		table.setRedraw(true);
		setControl(container);
        setPageComplete(true);
	}

	public Map<String, CCombo> getComboBoxes() {
		return comboBoxes;
	}

	public Map<String, Label> getLabels() {
		return labels;
	}

	public Map<String, Text> getTextAreas() {
		return textAreas;
	}
	
	public EList<Database> getDatabases() {
		VcsFeaturesMMFactory factoryImpl = VcsFeaturesMMFactoryImpl.init();
		EList<Database> databases = factoryImpl.createVCSFeatures().getDatabase();
		for (int i = 0; i < table.getItemCount(); i++) {
			if (comboBoxes.get(String.valueOf(i)) != null && !comboBoxes.get(String.valueOf(i)).getText().equals("Database") || !textAreas.get(String.valueOf(i) + String.valueOf(0)).getText().equals("")) {
				Database db = factoryImpl.createDatabase();
				db.setDatabaseType(DatabaseType.get(comboBoxes.get(String.valueOf(i)).getText()));
				db.setConnectionString(textAreas.get(String.valueOf(i) + String.valueOf(3)).getText());
				db.setName(textAreas.get(String.valueOf(i) + String.valueOf(0)).getText()); 
				databases.add(db);
			}
			
		}
		return databases;
	}

}
