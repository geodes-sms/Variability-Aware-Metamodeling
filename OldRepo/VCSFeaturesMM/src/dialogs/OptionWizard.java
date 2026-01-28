package dialogs;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.Bullet;
import org.eclipse.swt.custom.ST;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.GlyphMetrics;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class OptionWizard extends WizardPage {
	private Label appLabel;
	private Button check5a;
	private Button check6a;
	private Text appText;
	private Composite container;

	
	protected OptionWizard(String pageName) {
		super(pageName);
		setTitle("Advanced transformation options");
		setDescription("Select your transformation rule set:"); //TODO Make more descriptive, abstracted
	}

	// Have to make a list with all the possible options for my transformation rules. I can skip the business logic for now, as this is only a prototype.
	// I could add a label on the right side describing what the rule does.
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 1;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalIndent = 10;
        
        Button check1 = new Button(container, SWT.CHECK);
        check1.setText("Root feature is transformed as the root class");
        check1.setSelection(true);
        check1.setEnabled(false);

//        Label label1 = new Label(container, SWT.NONE);
//        label1.setText("Identical root classes");
//        label1.setLayoutData(gd);
        
//        StyleRange range = new StyleRange();
//        range.metrics = new GlyphMetrics(0, 0, 1);
//        Bullet b = new Bullet(ST.BULLET_TEXT, range);
//        b.text = "Testing";
        
        Button check6 = new Button(container, SWT.CHECK);
        check6.setText("Abstract/concrete features are transformed as abstract/concrete classes");
        check6.setSelection(true);
        check6.setEnabled(false);
        
        Label label6 = new Label(container, SWT.NONE);
        label6.setText("Leaf features are transformed as:");
        //label6.setLayoutData(gd);
        
        check6a = new Button(container, SWT.CHECK);
        check6a.setText("Classes");
        check6a.setSelection(true);
        check6a.setEnabled(true);
        check6a.setLayoutData(gd);
        
        Button check6b = new Button(container, SWT.CHECK);
        check6b.setText("Literals in an enumeration");
        check6b.setSelection(false);
        check6b.setEnabled(true);
        check6b.setLayoutData(gd);
        
//        Label label6a = new Label(container, SWT.NONE);
//        label6a.setText("OPTIONAL: Enumeration for leaf nodes");
//        label6a.setLayoutData(gd);
        
        Button check2 = new Button(container, SWT.CHECK);
        check2.setText("First level subfeatures are transformed as classes contained by the root class with multiplicity 0..*");
        check2.setSelection(true);
        check2.setEnabled(false);
        
//        Label label2 = new Label(container, SWT.NONE);
//        label2.setText("Root class composed of direct children");
//        label2.setLayoutData(gd);
        
        Button check3 = new Button(container, SWT.CHECK);
        check3.setText("Optional features are transformed as classes with multiplicity 0..1");
        check3.setSelection(true);
        check3.setEnabled(false);
        
//        Label label3 = new Label(container, SWT.NONE);
//        label3.setText("Optional cardinality");
//        label3.setLayoutData(gd);
        
        Button check4 = new Button(container, SWT.CHECK);
        check4.setText("Mandatory features are transformed as classes with multiplicity 1");
        check4.setSelection(true);
        check4.setEnabled(false);
        
        Label label4 = new Label(container, SWT.NONE);
        label4.setText("Cases where abstract features should be inherited:");
        //label4.setLayoutData(gd);
        
        Button check5 = new Button(container, SWT.CHECK);
        check5.setText("Force inheritance from all abstract features");
        check5.setSelection(true);
        check5.setEnabled(true);
        check5.setLayoutData(gd);
        
//        Label label5 = new Label(container, SWT.NONE);
//        label5.setText("Children inherit abstract parent");
//        label5.setLayoutData(gd);
        
        check5a = new Button(container, SWT.CHECK);
        check5a.setText("Force inheritance only on concrete children");
        check5a.setSelection(false);
        check5a.setEnabled(true);
        check5a.setLayoutData(gd);
        
//        Label label5a = new Label(container, SWT.NONE);
//        label5a.setText("OPTIONAL - OVERRIDE: Abstract children as concrete");
//        label5a.setLayoutData(gd);
        
        
//        appLabel = new Label(container, SWT.NONE);;
//        appLabel.setText("Name:");
//        appLabel.setLayoutData(gd);
//        
//        appText = new Text(container, SWT.BORDER_SOLID);;
//        appText.setLayoutData(gd);
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(true);
	}
	
	public String getAppName() {
		return appText.getText();
	}
}
