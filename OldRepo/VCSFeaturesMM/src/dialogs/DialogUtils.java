package dialogs;

import java.util.List;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public abstract class DialogUtils extends TitleAreaDialog {

	protected String message;
	protected String title;

	public DialogUtils(Shell parentShell, String message, String title) {
		super(parentShell);
		this.message = message;
		this.title = title;
	}

	protected Combo createComboButtons(Composite container, List<String> elements) {
		// https://flylib.com/books/en/1.70.1/combos_and_lists.html
		Combo combo = new Combo(container, SWT.NONE);
		for (String element : elements) {
			combo.add(element);
		}
		return combo;
	}

	protected Label createLabel(Composite container, String text) {
		Label label = new Label(container, SWT.NONE);
		label.setText(text);
		// This might cause problems if done in the super class. Might need to separate
		// it into it's own method that can be called by the child.
		GridDataFactory.fillDefaults().grab(false, false).applyTo(label);
		return label;
	}

	protected Text createText(Composite container, Boolean grabHorizontal, Boolean grabVertical) {
		Text textBox = new Text(container, SWT.BORDER);
		GridDataFactory.fillDefaults().grab(grabHorizontal, grabVertical).applyTo(textBox);
		return textBox;
	}

	protected Composite mainContainer(Composite area) {
		// Main container in which text labels can be inserted
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		return container;
	}

	protected Composite initMainArea(Composite parent) {
		setMessage(message);
		setTitle(title);
		Composite area = (Composite) super.createDialogArea(parent);
		return area;
	}

	// Save content of the Text fields because they get disposed
	// as soon as the Dialog closes
	protected abstract void saveInput();

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

}