package dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import vcsFeaturesMM.HighLevelCommand;
import vcsFeaturesMM.LowCommands;
import vcsFeaturesMM.LowLevelCommand;
import vcsFeaturesMM.VcsFeaturesMMFactory;
import vcsFeaturesMM.impl.VcsFeaturesMMFactoryImpl;

public class SuperCommandPage extends WizardPage{

	 private Composite container;
		private EList<LowLevelCommand> lCommands;
		private EList<HighLevelCommand> hCommands;
		//private List<Text> textAreas;
		private Table table;
		private Map<String, CCombo> comboBoxes;
		private Map<String, Text> textAreas;

	    public SuperCommandPage(String pageName, EList<LowLevelCommand> llc, EList<HighLevelCommand> hlc) {
			super(pageName);
	        setTitle("Custom commands declaration");
	        setDescription("In this menu, you can create custom commands based on the basic commands you just defined in the previous menu. This is an ordered sequence, so choose the commands in the order in which you wish them to be executed. Illegal combinations are allowed, so be careful what you choose to do. WARNING: Adding and Deleting commands does it for ALL the commands");
			this.lCommands = llc;
			this.hCommands = hlc;
			comboBoxes = new HashMap<>();
			textAreas = new HashMap<>();
	    }

	    @Override
	    public void createControl(Composite parent) {
	        container = new Composite(parent, SWT.NONE);
	        GridLayout layout = new GridLayout();
	        container.setLayout(layout);
	        layout.numColumns = 1;
	        
	        resetTable();

	        /*final TableColumn right_list_column = new TableColumn(right_group_table, SWT.CENTER);
	        right_list_column.setText("TABLE_LIST");
	        right_list_column.setWidth(140);

	        final TableColumn message_column = new TableColumn(right_group_table, SWT.NONE | SWT.DROP_DOWN);
	        message_column.setText("FACEBOOK_MESSAGE");
	        message_column.setWidth(230);*/

	        /*for (int i = 0; i < 10; i++) {
	            new TableItem(right_group_table, SWT.DROP_DOWN);
	        }*/
	        
	        setColumns();
	        
	        
	        
	        setButtons();
	        
	        

	        setTableComboBoxes(table, table.getItems());
	        setTableNameTextAreas(table, table.getItems());
	        
	        // required to avoid an error in the system
	        setControl(container);
	        setPageComplete(true);
	    }

		private void setButtons() {
			// Buttons section for adding and removing columns/rows
	        final Button addColumnsButton = new Button(container, SWT.PUSH);
	        addColumnsButton.setText("Add Command in sequence");
	        addColumnsButton.addListener(SWT.Selection, new Listener() {
	          @Override
	          public void handleEvent(Event event) {
	            final TableColumn column = new TableColumn(table,  SWT.NONE | SWT.DROP_DOWN);
	            //new TableItem(right_group_table, SWT.DROP_DOWN);
	            column.setText("Command" + (table.getColumnCount()));
	            column.setWidth(115);
	            setTableComboBoxes(table, table.getItems());
	          }
	        });
	        
	        final Button deleteColumnsButton = new Button(container, SWT.PUSH);
	        deleteColumnsButton.setText("Remove last Command in sequence");
	        deleteColumnsButton.addListener(SWT.Selection, new Listener() {
	          @Override
	          public void handleEvent(Event event) {
	        	  // If there is a column left
	        	  if (table.getItemCount()>0 && table.getColumnCount() > 1) {
	        		  // For each combo box in that column
	        		  for (int i = 0; i < table.getItems().length; i++) {
	        			  // Get the combo box and dispose of it
	        			  comboBoxes.get(String.valueOf(i) + String.valueOf(table.getColumnCount() - 1)).dispose();
						 }
	        		  // Then dispose of the column itself
	        		  table.getColumn(table.getColumnCount() - 1).dispose();
				}
	          }
	        });
	        
	        final Button addRowsButton = new Button(container, SWT.PUSH);
	        addRowsButton.setText("Add new Custom Command");
	        addRowsButton.addListener(SWT.Selection, new Listener() {
	          @Override
	          public void handleEvent(Event event) {
	            new TableItem(table, SWT.DROP_DOWN);
	            setTableComboBoxes(table, table.getItems());
	            setTableNameTextAreas(table, table.getItems());
	          }
	        });
	        
	        
	        final Button deleteRowsButton = new Button(container, SWT.PUSH);
	        deleteRowsButton.setText("Remove last Custom Command");
	        deleteRowsButton.addListener(SWT.Selection, new Listener() {
	          @Override
	          public void handleEvent(Event event) {
	        	  // If there is a column left
	        	  if (table.getItemCount()>0) {
	        		  // For each combo box in that column
	        		  for (int i = 1; i < table.getColumns().length; i++) {
	        			  // Get the combo box and dispose of it
	        			  comboBoxes.get(String.valueOf(table.getItemCount() - 1) + String.valueOf(i)).dispose();
						 }
	        		  textAreas.get(String.valueOf(table.getItemCount() - 1)).dispose(); // Get the textArea from the first column and delete it
	        		  // Then dispose of the row itself
	        		  table.getItem(table.getItemCount() - 1).dispose();;
				}
	          }
	        });
		}

		private void setColumns() {
			String[] titles = {"Command Name", "Command" + (table.getColumnCount() + 1), "Command" + (table.getColumnCount() + 2)}; // Always have 1 command more than what is currently filled
			for (String title : titles) {
				TableColumn column = new TableColumn (table, SWT.NONE | SWT.DROP_DOWN);
				new TableItem(table, SWT.DROP_DOWN);
				column.setText (title);
				//column.pack();
				column.setWidth(115);
			}
		}

		private void resetTable() {
			table = new Table(container, SWT.BORDER | SWT.MULTI);
	        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	        table.setLinesVisible(true);
	        table.setHeaderVisible(true);
		}

		private void setTableComboBoxes(final Table right_group_table, final TableItem[] items) {
			for (int j = 1; j < right_group_table.getColumnCount(); j++) {
				for (int i = 0; i < items.length; i++) {
		        	
		        	CCombo templateDropdown = new CCombo(right_group_table, SWT.NONE);
			        templateDropdown.setText("Basic Command");
			        
			        for (int k = 0; k < lCommands.size(); k++) {
        		 		templateDropdown.add(lCommands.get(k).getName());
        		 	}
			        
			        // https://stackoverflow.com/questions/45842307/swt-eclipse-combo-event
			        templateDropdown.addFocusListener(new FocusListener() {

						@Override
						public void focusGained(FocusEvent e) { // When the person clicks on the combo box, it updates itself.
							for (int k = 0; k < lCommands.size(); k++) {
		        		 		templateDropdown.setItem(k, lCommands.get(k).getName());
		        		 	}
							//right_group_table.redraw();
							//right_group_table.update();
							templateDropdown.redraw();
		        		 	templateDropdown.update();
							
						}

						@Override
						public void focusLost(FocusEvent e) {
							// Has to override, but nothing to do here
						}
			        	 });
			        
					 final TableEditor editor = new TableEditor(right_group_table);
					 editor.grabHorizontal = true;
					 editor.setEditor(templateDropdown, items[i], j);
					 if (comboBoxes.containsKey(String.valueOf(i) + String.valueOf(j))) { // The key is the index of the combo box in the table (i.e. CCombo at position i=1 & j=4 -> key=14)
						 if (!comboBoxes.get(String.valueOf(i) + String.valueOf(j)).isDisposed() && !comboBoxes.get(String.valueOf(i) + String.valueOf(j)).getText().equals("Basic Command")) {
							 templateDropdown.select(comboBoxes.get(String.valueOf(i) + String.valueOf(j)).getSelectionIndex()); // transfer the selection index to the new one
						}
						comboBoxes.remove(String.valueOf(i) + String.valueOf(j)).dispose();
					}
					 comboBoxes.put(String.valueOf(i) + String.valueOf(j), templateDropdown);
					}
			}
			setControl(container);
	        setPageComplete(true);
		}
		
		private void setTableNameTextAreas(final Table right_group_table, final TableItem[] items) {
			for (int i = 0; i < items.length; i++) {
	        	
	        	Text templateText = new Text(right_group_table, SWT.NONE);
		        templateText.setText("Custom" + i);
		        
				 final TableEditor editor = new TableEditor(right_group_table);
				 editor.grabHorizontal = true;
				 editor.setEditor(templateText, items[i], 0);
				 if (textAreas.containsKey(String.valueOf(i))) { // The key is the index of the text area in the table (i.e. Text at position i=1 & j=4 -> key=14)
					 if (!textAreas.get(String.valueOf(i)).isDisposed()) {
						 templateText.setText(textAreas.get(String.valueOf(i)).getText());// If it already exists, put the name back into the newly created object
					}
					 textAreas.remove(String.valueOf(i)).dispose();
				}
				 textAreas.put(String.valueOf(i), templateText);
			}
			setControl(container);
	        setPageComplete(true);
		}
		
		public void setLCommands(EList<LowLevelCommand> lCommands) {
			this.lCommands = lCommands;
		}
		
		/**
		 * Only calls this after the page has been completed, otherwise might return null.
		 * 
		 * @return  EList<HighLevelCommand> or <code>null</code>
		 * */
		public EList<HighLevelCommand> getHCommands(){
			VcsFeaturesMMFactory factoryImpl = VcsFeaturesMMFactoryImpl.init();
			// Reset the list so it doesn't compound the commands if the user switches screen often.
			if (!hCommands.isEmpty()) {
				hCommands = factoryImpl.createCommands().getHighlevelcommand();
			}
			
			// Iterate over the table. For each row, we check if the map at this entry is selected or not. 
			// If it is selected, we collect the command and add it to the list of commands for the super commands
			
			//Edge case: If the user declared commands, but has some "Basic Command" mixed in it, what do we do?
			for (int i = 0; i < table.getItems().length; i++) {
				HighLevelCommand hc = factoryImpl.createHighLevelCommand();
				for (int j = 1; j < table.getColumnCount(); j++) {
					CCombo val = comboBoxes.get(String.valueOf(i) + String.valueOf(j));
					if (!val.getText().equals("Basic Command")) {
						hc.getLowlevelcommand().add(lCommands.get(val.getSelectionIndex())); // TODO check if the selection index points at the right place or if it is shifted by one (because of "Basic Command" at the beginning)
					}
				}
				// Making sure there's at least 1 item in the high level command, otherwise it's pointless.
				if (hc.getLowlevelcommand().size()>0) {
					hc.setName(textAreas.get(String.valueOf(i)).getText());
					hCommands.add(hc);
				}
			}
			return hCommands;
			
		}
		
}
