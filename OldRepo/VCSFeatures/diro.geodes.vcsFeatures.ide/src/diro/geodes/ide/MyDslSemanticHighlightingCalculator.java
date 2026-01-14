package diro.geodes.ide;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

public class MyDslSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	
	public static class MyDslHighlightingStyles implements HighlightingStyles {
		public static String KEYWORD_RED_ID = KEYWORD_ID + "Red";
	}

	//@Inject //Might not be the right Inject
	//MyDslGrammarAccess ga;

	/*@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (object instanceof Model) {
			Keyword keyword = ga.getGreetingAccess().getHelloKeyword_0();
			for (ILeafNode n : NodeModelUtils.findActualNodeFor(object).getLeafNodes()) {
				if (keyword == n.getGrammarElement()) {
					acceptor.addPosition(n.getOffset(), n.getLength(), MyDslHighlightingStyles.KEYWORD_RED_ID);
				}
			}
		}
		return super.highlightElement(object, acceptor, cancelIndicator);
	}*/
}
