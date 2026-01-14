package shapes.myconstructor.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import shapes.myconstructor.services.ShapesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShapesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ShapeConstructor'", "'{'", "'}'", "'shape'", "','", "'Circle'", "'radius'", "'Rectangle'", "'length'", "'width'", "'Triangle'", "'a'", "'b'", "'c'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalShapesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShapesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShapesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalShapes.g"; }


    	private ShapesGrammarAccess grammarAccess;

    	public void setGrammarAccess(ShapesGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleShapeConstructor"
    // InternalShapes.g:53:1: entryRuleShapeConstructor : ruleShapeConstructor EOF ;
    public final void entryRuleShapeConstructor() throws RecognitionException {
        try {
            // InternalShapes.g:54:1: ( ruleShapeConstructor EOF )
            // InternalShapes.g:55:1: ruleShapeConstructor EOF
            {
             before(grammarAccess.getShapeConstructorRule()); 
            pushFollow(FOLLOW_1);
            ruleShapeConstructor();

            state._fsp--;

             after(grammarAccess.getShapeConstructorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShapeConstructor"


    // $ANTLR start "ruleShapeConstructor"
    // InternalShapes.g:62:1: ruleShapeConstructor : ( ( rule__ShapeConstructor__Group__0 ) ) ;
    public final void ruleShapeConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:66:2: ( ( ( rule__ShapeConstructor__Group__0 ) ) )
            // InternalShapes.g:67:2: ( ( rule__ShapeConstructor__Group__0 ) )
            {
            // InternalShapes.g:67:2: ( ( rule__ShapeConstructor__Group__0 ) )
            // InternalShapes.g:68:3: ( rule__ShapeConstructor__Group__0 )
            {
             before(grammarAccess.getShapeConstructorAccess().getGroup()); 
            // InternalShapes.g:69:3: ( rule__ShapeConstructor__Group__0 )
            // InternalShapes.g:69:4: rule__ShapeConstructor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShapeConstructor"


    // $ANTLR start "entryRuleShape"
    // InternalShapes.g:78:1: entryRuleShape : ruleShape EOF ;
    public final void entryRuleShape() throws RecognitionException {
        try {
            // InternalShapes.g:79:1: ( ruleShape EOF )
            // InternalShapes.g:80:1: ruleShape EOF
            {
             before(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalShapes.g:87:1: ruleShape : ( ( rule__Shape__Alternatives ) ) ;
    public final void ruleShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:91:2: ( ( ( rule__Shape__Alternatives ) ) )
            // InternalShapes.g:92:2: ( ( rule__Shape__Alternatives ) )
            {
            // InternalShapes.g:92:2: ( ( rule__Shape__Alternatives ) )
            // InternalShapes.g:93:3: ( rule__Shape__Alternatives )
            {
             before(grammarAccess.getShapeAccess().getAlternatives()); 
            // InternalShapes.g:94:3: ( rule__Shape__Alternatives )
            // InternalShapes.g:94:4: rule__Shape__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Shape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleEString"
    // InternalShapes.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalShapes.g:104:1: ( ruleEString EOF )
            // InternalShapes.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalShapes.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalShapes.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalShapes.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalShapes.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalShapes.g:119:3: ( rule__EString__Alternatives )
            // InternalShapes.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCircle"
    // InternalShapes.g:128:1: entryRuleCircle : ruleCircle EOF ;
    public final void entryRuleCircle() throws RecognitionException {
        try {
            // InternalShapes.g:129:1: ( ruleCircle EOF )
            // InternalShapes.g:130:1: ruleCircle EOF
            {
             before(grammarAccess.getCircleRule()); 
            pushFollow(FOLLOW_1);
            ruleCircle();

            state._fsp--;

             after(grammarAccess.getCircleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCircle"


    // $ANTLR start "ruleCircle"
    // InternalShapes.g:137:1: ruleCircle : ( ( rule__Circle__Group__0 ) ) ;
    public final void ruleCircle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:141:2: ( ( ( rule__Circle__Group__0 ) ) )
            // InternalShapes.g:142:2: ( ( rule__Circle__Group__0 ) )
            {
            // InternalShapes.g:142:2: ( ( rule__Circle__Group__0 ) )
            // InternalShapes.g:143:3: ( rule__Circle__Group__0 )
            {
             before(grammarAccess.getCircleAccess().getGroup()); 
            // InternalShapes.g:144:3: ( rule__Circle__Group__0 )
            // InternalShapes.g:144:4: rule__Circle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Circle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCircle"


    // $ANTLR start "entryRuleRectangle"
    // InternalShapes.g:153:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalShapes.g:154:1: ( ruleRectangle EOF )
            // InternalShapes.g:155:1: ruleRectangle EOF
            {
             before(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getRectangleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalShapes.g:162:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:166:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalShapes.g:167:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalShapes.g:167:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalShapes.g:168:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalShapes.g:169:3: ( rule__Rectangle__Group__0 )
            // InternalShapes.g:169:4: rule__Rectangle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleTriangle"
    // InternalShapes.g:178:1: entryRuleTriangle : ruleTriangle EOF ;
    public final void entryRuleTriangle() throws RecognitionException {
        try {
            // InternalShapes.g:179:1: ( ruleTriangle EOF )
            // InternalShapes.g:180:1: ruleTriangle EOF
            {
             before(grammarAccess.getTriangleRule()); 
            pushFollow(FOLLOW_1);
            ruleTriangle();

            state._fsp--;

             after(grammarAccess.getTriangleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTriangle"


    // $ANTLR start "ruleTriangle"
    // InternalShapes.g:187:1: ruleTriangle : ( ( rule__Triangle__Group__0 ) ) ;
    public final void ruleTriangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:191:2: ( ( ( rule__Triangle__Group__0 ) ) )
            // InternalShapes.g:192:2: ( ( rule__Triangle__Group__0 ) )
            {
            // InternalShapes.g:192:2: ( ( rule__Triangle__Group__0 ) )
            // InternalShapes.g:193:3: ( rule__Triangle__Group__0 )
            {
             before(grammarAccess.getTriangleAccess().getGroup()); 
            // InternalShapes.g:194:3: ( rule__Triangle__Group__0 )
            // InternalShapes.g:194:4: rule__Triangle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriangleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriangle"


    // $ANTLR start "entryRuleEInt"
    // InternalShapes.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalShapes.g:204:1: ( ruleEInt EOF )
            // InternalShapes.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalShapes.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalShapes.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalShapes.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalShapes.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalShapes.g:219:3: ( rule__EInt__Group__0 )
            // InternalShapes.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Shape__Alternatives"
    // InternalShapes.g:227:1: rule__Shape__Alternatives : ( ( ruleCircle ) | ( ruleRectangle ) | ( ruleTriangle ) );
    public final void rule__Shape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:231:1: ( ( ruleCircle ) | ( ruleRectangle ) | ( ruleTriangle ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalShapes.g:232:2: ( ruleCircle )
                    {
                    // InternalShapes.g:232:2: ( ruleCircle )
                    // InternalShapes.g:233:3: ruleCircle
                    {
                     before(grammarAccess.getShapeAccess().getCircleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCircle();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getCircleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShapes.g:238:2: ( ruleRectangle )
                    {
                    // InternalShapes.g:238:2: ( ruleRectangle )
                    // InternalShapes.g:239:3: ruleRectangle
                    {
                     before(grammarAccess.getShapeAccess().getRectangleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRectangle();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getRectangleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShapes.g:244:2: ( ruleTriangle )
                    {
                    // InternalShapes.g:244:2: ( ruleTriangle )
                    // InternalShapes.g:245:3: ruleTriangle
                    {
                     before(grammarAccess.getShapeAccess().getTriangleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTriangle();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getTriangleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shape__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalShapes.g:254:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:258:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalShapes.g:259:2: ( RULE_STRING )
                    {
                    // InternalShapes.g:259:2: ( RULE_STRING )
                    // InternalShapes.g:260:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShapes.g:265:2: ( RULE_ID )
                    {
                    // InternalShapes.g:265:2: ( RULE_ID )
                    // InternalShapes.g:266:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ShapeConstructor__Group__0"
    // InternalShapes.g:275:1: rule__ShapeConstructor__Group__0 : rule__ShapeConstructor__Group__0__Impl rule__ShapeConstructor__Group__1 ;
    public final void rule__ShapeConstructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:279:1: ( rule__ShapeConstructor__Group__0__Impl rule__ShapeConstructor__Group__1 )
            // InternalShapes.g:280:2: rule__ShapeConstructor__Group__0__Impl rule__ShapeConstructor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ShapeConstructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__0"


    // $ANTLR start "rule__ShapeConstructor__Group__0__Impl"
    // InternalShapes.g:287:1: rule__ShapeConstructor__Group__0__Impl : ( () ) ;
    public final void rule__ShapeConstructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:291:1: ( ( () ) )
            // InternalShapes.g:292:1: ( () )
            {
            // InternalShapes.g:292:1: ( () )
            // InternalShapes.g:293:2: ()
            {
             before(grammarAccess.getShapeConstructorAccess().getShapeConstructorAction_0()); 
            // InternalShapes.g:294:2: ()
            // InternalShapes.g:294:3: 
            {
            }

             after(grammarAccess.getShapeConstructorAccess().getShapeConstructorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__0__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group__1"
    // InternalShapes.g:302:1: rule__ShapeConstructor__Group__1 : rule__ShapeConstructor__Group__1__Impl rule__ShapeConstructor__Group__2 ;
    public final void rule__ShapeConstructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:306:1: ( rule__ShapeConstructor__Group__1__Impl rule__ShapeConstructor__Group__2 )
            // InternalShapes.g:307:2: rule__ShapeConstructor__Group__1__Impl rule__ShapeConstructor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ShapeConstructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__1"


    // $ANTLR start "rule__ShapeConstructor__Group__1__Impl"
    // InternalShapes.g:314:1: rule__ShapeConstructor__Group__1__Impl : ( 'ShapeConstructor' ) ;
    public final void rule__ShapeConstructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:318:1: ( ( 'ShapeConstructor' ) )
            // InternalShapes.g:319:1: ( 'ShapeConstructor' )
            {
            // InternalShapes.g:319:1: ( 'ShapeConstructor' )
            // InternalShapes.g:320:2: 'ShapeConstructor'
            {
             before(grammarAccess.getShapeConstructorAccess().getShapeConstructorKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getShapeConstructorAccess().getShapeConstructorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__1__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group__2"
    // InternalShapes.g:329:1: rule__ShapeConstructor__Group__2 : rule__ShapeConstructor__Group__2__Impl rule__ShapeConstructor__Group__3 ;
    public final void rule__ShapeConstructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:333:1: ( rule__ShapeConstructor__Group__2__Impl rule__ShapeConstructor__Group__3 )
            // InternalShapes.g:334:2: rule__ShapeConstructor__Group__2__Impl rule__ShapeConstructor__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ShapeConstructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__2"


    // $ANTLR start "rule__ShapeConstructor__Group__2__Impl"
    // InternalShapes.g:341:1: rule__ShapeConstructor__Group__2__Impl : ( ( rule__ShapeConstructor__NameAssignment_2 ) ) ;
    public final void rule__ShapeConstructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:345:1: ( ( ( rule__ShapeConstructor__NameAssignment_2 ) ) )
            // InternalShapes.g:346:1: ( ( rule__ShapeConstructor__NameAssignment_2 ) )
            {
            // InternalShapes.g:346:1: ( ( rule__ShapeConstructor__NameAssignment_2 ) )
            // InternalShapes.g:347:2: ( rule__ShapeConstructor__NameAssignment_2 )
            {
             before(grammarAccess.getShapeConstructorAccess().getNameAssignment_2()); 
            // InternalShapes.g:348:2: ( rule__ShapeConstructor__NameAssignment_2 )
            // InternalShapes.g:348:3: rule__ShapeConstructor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstructorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__2__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group__3"
    // InternalShapes.g:356:1: rule__ShapeConstructor__Group__3 : rule__ShapeConstructor__Group__3__Impl rule__ShapeConstructor__Group__4 ;
    public final void rule__ShapeConstructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:360:1: ( rule__ShapeConstructor__Group__3__Impl rule__ShapeConstructor__Group__4 )
            // InternalShapes.g:361:2: rule__ShapeConstructor__Group__3__Impl rule__ShapeConstructor__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ShapeConstructor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__3"


    // $ANTLR start "rule__ShapeConstructor__Group__3__Impl"
    // InternalShapes.g:368:1: rule__ShapeConstructor__Group__3__Impl : ( '{' ) ;
    public final void rule__ShapeConstructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:372:1: ( ( '{' ) )
            // InternalShapes.g:373:1: ( '{' )
            {
            // InternalShapes.g:373:1: ( '{' )
            // InternalShapes.g:374:2: '{'
            {
             before(grammarAccess.getShapeConstructorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShapeConstructorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__3__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group__4"
    // InternalShapes.g:383:1: rule__ShapeConstructor__Group__4 : rule__ShapeConstructor__Group__4__Impl rule__ShapeConstructor__Group__5 ;
    public final void rule__ShapeConstructor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:387:1: ( rule__ShapeConstructor__Group__4__Impl rule__ShapeConstructor__Group__5 )
            // InternalShapes.g:388:2: rule__ShapeConstructor__Group__4__Impl rule__ShapeConstructor__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ShapeConstructor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__4"


    // $ANTLR start "rule__ShapeConstructor__Group__4__Impl"
    // InternalShapes.g:395:1: rule__ShapeConstructor__Group__4__Impl : ( ( rule__ShapeConstructor__Group_4__0 )? ) ;
    public final void rule__ShapeConstructor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:399:1: ( ( ( rule__ShapeConstructor__Group_4__0 )? ) )
            // InternalShapes.g:400:1: ( ( rule__ShapeConstructor__Group_4__0 )? )
            {
            // InternalShapes.g:400:1: ( ( rule__ShapeConstructor__Group_4__0 )? )
            // InternalShapes.g:401:2: ( rule__ShapeConstructor__Group_4__0 )?
            {
             before(grammarAccess.getShapeConstructorAccess().getGroup_4()); 
            // InternalShapes.g:402:2: ( rule__ShapeConstructor__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalShapes.g:402:3: rule__ShapeConstructor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShapeConstructor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShapeConstructorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__4__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group__5"
    // InternalShapes.g:410:1: rule__ShapeConstructor__Group__5 : rule__ShapeConstructor__Group__5__Impl ;
    public final void rule__ShapeConstructor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:414:1: ( rule__ShapeConstructor__Group__5__Impl )
            // InternalShapes.g:415:2: rule__ShapeConstructor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__5"


    // $ANTLR start "rule__ShapeConstructor__Group__5__Impl"
    // InternalShapes.g:421:1: rule__ShapeConstructor__Group__5__Impl : ( '}' ) ;
    public final void rule__ShapeConstructor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:425:1: ( ( '}' ) )
            // InternalShapes.g:426:1: ( '}' )
            {
            // InternalShapes.g:426:1: ( '}' )
            // InternalShapes.g:427:2: '}'
            {
             before(grammarAccess.getShapeConstructorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getShapeConstructorAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group__5__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group_4__0"
    // InternalShapes.g:437:1: rule__ShapeConstructor__Group_4__0 : rule__ShapeConstructor__Group_4__0__Impl rule__ShapeConstructor__Group_4__1 ;
    public final void rule__ShapeConstructor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:441:1: ( rule__ShapeConstructor__Group_4__0__Impl rule__ShapeConstructor__Group_4__1 )
            // InternalShapes.g:442:2: rule__ShapeConstructor__Group_4__0__Impl rule__ShapeConstructor__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ShapeConstructor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__0"


    // $ANTLR start "rule__ShapeConstructor__Group_4__0__Impl"
    // InternalShapes.g:449:1: rule__ShapeConstructor__Group_4__0__Impl : ( 'shape' ) ;
    public final void rule__ShapeConstructor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:453:1: ( ( 'shape' ) )
            // InternalShapes.g:454:1: ( 'shape' )
            {
            // InternalShapes.g:454:1: ( 'shape' )
            // InternalShapes.g:455:2: 'shape'
            {
             before(grammarAccess.getShapeConstructorAccess().getShapeKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getShapeConstructorAccess().getShapeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__0__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group_4__1"
    // InternalShapes.g:464:1: rule__ShapeConstructor__Group_4__1 : rule__ShapeConstructor__Group_4__1__Impl rule__ShapeConstructor__Group_4__2 ;
    public final void rule__ShapeConstructor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:468:1: ( rule__ShapeConstructor__Group_4__1__Impl rule__ShapeConstructor__Group_4__2 )
            // InternalShapes.g:469:2: rule__ShapeConstructor__Group_4__1__Impl rule__ShapeConstructor__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__ShapeConstructor__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__1"


    // $ANTLR start "rule__ShapeConstructor__Group_4__1__Impl"
    // InternalShapes.g:476:1: rule__ShapeConstructor__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ShapeConstructor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:480:1: ( ( '{' ) )
            // InternalShapes.g:481:1: ( '{' )
            {
            // InternalShapes.g:481:1: ( '{' )
            // InternalShapes.g:482:2: '{'
            {
             before(grammarAccess.getShapeConstructorAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShapeConstructorAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__1__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group_4__2"
    // InternalShapes.g:491:1: rule__ShapeConstructor__Group_4__2 : rule__ShapeConstructor__Group_4__2__Impl rule__ShapeConstructor__Group_4__3 ;
    public final void rule__ShapeConstructor__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:495:1: ( rule__ShapeConstructor__Group_4__2__Impl rule__ShapeConstructor__Group_4__3 )
            // InternalShapes.g:496:2: rule__ShapeConstructor__Group_4__2__Impl rule__ShapeConstructor__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__ShapeConstructor__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__2"


    // $ANTLR start "rule__ShapeConstructor__Group_4__2__Impl"
    // InternalShapes.g:503:1: rule__ShapeConstructor__Group_4__2__Impl : ( ( rule__ShapeConstructor__ShapeAssignment_4_2 ) ) ;
    public final void rule__ShapeConstructor__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:507:1: ( ( ( rule__ShapeConstructor__ShapeAssignment_4_2 ) ) )
            // InternalShapes.g:508:1: ( ( rule__ShapeConstructor__ShapeAssignment_4_2 ) )
            {
            // InternalShapes.g:508:1: ( ( rule__ShapeConstructor__ShapeAssignment_4_2 ) )
            // InternalShapes.g:509:2: ( rule__ShapeConstructor__ShapeAssignment_4_2 )
            {
             before(grammarAccess.getShapeConstructorAccess().getShapeAssignment_4_2()); 
            // InternalShapes.g:510:2: ( rule__ShapeConstructor__ShapeAssignment_4_2 )
            // InternalShapes.g:510:3: rule__ShapeConstructor__ShapeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__ShapeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstructorAccess().getShapeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__2__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group_4__3"
    // InternalShapes.g:518:1: rule__ShapeConstructor__Group_4__3 : rule__ShapeConstructor__Group_4__3__Impl rule__ShapeConstructor__Group_4__4 ;
    public final void rule__ShapeConstructor__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:522:1: ( rule__ShapeConstructor__Group_4__3__Impl rule__ShapeConstructor__Group_4__4 )
            // InternalShapes.g:523:2: rule__ShapeConstructor__Group_4__3__Impl rule__ShapeConstructor__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__ShapeConstructor__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__3"


    // $ANTLR start "rule__ShapeConstructor__Group_4__3__Impl"
    // InternalShapes.g:530:1: rule__ShapeConstructor__Group_4__3__Impl : ( ( rule__ShapeConstructor__Group_4_3__0 )* ) ;
    public final void rule__ShapeConstructor__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:534:1: ( ( ( rule__ShapeConstructor__Group_4_3__0 )* ) )
            // InternalShapes.g:535:1: ( ( rule__ShapeConstructor__Group_4_3__0 )* )
            {
            // InternalShapes.g:535:1: ( ( rule__ShapeConstructor__Group_4_3__0 )* )
            // InternalShapes.g:536:2: ( rule__ShapeConstructor__Group_4_3__0 )*
            {
             before(grammarAccess.getShapeConstructorAccess().getGroup_4_3()); 
            // InternalShapes.g:537:2: ( rule__ShapeConstructor__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalShapes.g:537:3: rule__ShapeConstructor__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ShapeConstructor__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getShapeConstructorAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__3__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group_4__4"
    // InternalShapes.g:545:1: rule__ShapeConstructor__Group_4__4 : rule__ShapeConstructor__Group_4__4__Impl ;
    public final void rule__ShapeConstructor__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:549:1: ( rule__ShapeConstructor__Group_4__4__Impl )
            // InternalShapes.g:550:2: rule__ShapeConstructor__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__4"


    // $ANTLR start "rule__ShapeConstructor__Group_4__4__Impl"
    // InternalShapes.g:556:1: rule__ShapeConstructor__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ShapeConstructor__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:560:1: ( ( '}' ) )
            // InternalShapes.g:561:1: ( '}' )
            {
            // InternalShapes.g:561:1: ( '}' )
            // InternalShapes.g:562:2: '}'
            {
             before(grammarAccess.getShapeConstructorAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getShapeConstructorAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4__4__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group_4_3__0"
    // InternalShapes.g:572:1: rule__ShapeConstructor__Group_4_3__0 : rule__ShapeConstructor__Group_4_3__0__Impl rule__ShapeConstructor__Group_4_3__1 ;
    public final void rule__ShapeConstructor__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:576:1: ( rule__ShapeConstructor__Group_4_3__0__Impl rule__ShapeConstructor__Group_4_3__1 )
            // InternalShapes.g:577:2: rule__ShapeConstructor__Group_4_3__0__Impl rule__ShapeConstructor__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ShapeConstructor__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4_3__0"


    // $ANTLR start "rule__ShapeConstructor__Group_4_3__0__Impl"
    // InternalShapes.g:584:1: rule__ShapeConstructor__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ShapeConstructor__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:588:1: ( ( ',' ) )
            // InternalShapes.g:589:1: ( ',' )
            {
            // InternalShapes.g:589:1: ( ',' )
            // InternalShapes.g:590:2: ','
            {
             before(grammarAccess.getShapeConstructorAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getShapeConstructorAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4_3__0__Impl"


    // $ANTLR start "rule__ShapeConstructor__Group_4_3__1"
    // InternalShapes.g:599:1: rule__ShapeConstructor__Group_4_3__1 : rule__ShapeConstructor__Group_4_3__1__Impl ;
    public final void rule__ShapeConstructor__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:603:1: ( rule__ShapeConstructor__Group_4_3__1__Impl )
            // InternalShapes.g:604:2: rule__ShapeConstructor__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4_3__1"


    // $ANTLR start "rule__ShapeConstructor__Group_4_3__1__Impl"
    // InternalShapes.g:610:1: rule__ShapeConstructor__Group_4_3__1__Impl : ( ( rule__ShapeConstructor__ShapeAssignment_4_3_1 ) ) ;
    public final void rule__ShapeConstructor__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:614:1: ( ( ( rule__ShapeConstructor__ShapeAssignment_4_3_1 ) ) )
            // InternalShapes.g:615:1: ( ( rule__ShapeConstructor__ShapeAssignment_4_3_1 ) )
            {
            // InternalShapes.g:615:1: ( ( rule__ShapeConstructor__ShapeAssignment_4_3_1 ) )
            // InternalShapes.g:616:2: ( rule__ShapeConstructor__ShapeAssignment_4_3_1 )
            {
             before(grammarAccess.getShapeConstructorAccess().getShapeAssignment_4_3_1()); 
            // InternalShapes.g:617:2: ( rule__ShapeConstructor__ShapeAssignment_4_3_1 )
            // InternalShapes.g:617:3: rule__ShapeConstructor__ShapeAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ShapeConstructor__ShapeAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getShapeConstructorAccess().getShapeAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__Group_4_3__1__Impl"


    // $ANTLR start "rule__Circle__Group__0"
    // InternalShapes.g:626:1: rule__Circle__Group__0 : rule__Circle__Group__0__Impl rule__Circle__Group__1 ;
    public final void rule__Circle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:630:1: ( rule__Circle__Group__0__Impl rule__Circle__Group__1 )
            // InternalShapes.g:631:2: rule__Circle__Group__0__Impl rule__Circle__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Circle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__0"


    // $ANTLR start "rule__Circle__Group__0__Impl"
    // InternalShapes.g:638:1: rule__Circle__Group__0__Impl : ( () ) ;
    public final void rule__Circle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:642:1: ( ( () ) )
            // InternalShapes.g:643:1: ( () )
            {
            // InternalShapes.g:643:1: ( () )
            // InternalShapes.g:644:2: ()
            {
             before(grammarAccess.getCircleAccess().getCircleAction_0()); 
            // InternalShapes.g:645:2: ()
            // InternalShapes.g:645:3: 
            {
            }

             after(grammarAccess.getCircleAccess().getCircleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__0__Impl"


    // $ANTLR start "rule__Circle__Group__1"
    // InternalShapes.g:653:1: rule__Circle__Group__1 : rule__Circle__Group__1__Impl rule__Circle__Group__2 ;
    public final void rule__Circle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:657:1: ( rule__Circle__Group__1__Impl rule__Circle__Group__2 )
            // InternalShapes.g:658:2: rule__Circle__Group__1__Impl rule__Circle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Circle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__1"


    // $ANTLR start "rule__Circle__Group__1__Impl"
    // InternalShapes.g:665:1: rule__Circle__Group__1__Impl : ( 'Circle' ) ;
    public final void rule__Circle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:669:1: ( ( 'Circle' ) )
            // InternalShapes.g:670:1: ( 'Circle' )
            {
            // InternalShapes.g:670:1: ( 'Circle' )
            // InternalShapes.g:671:2: 'Circle'
            {
             before(grammarAccess.getCircleAccess().getCircleKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCircleAccess().getCircleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__1__Impl"


    // $ANTLR start "rule__Circle__Group__2"
    // InternalShapes.g:680:1: rule__Circle__Group__2 : rule__Circle__Group__2__Impl rule__Circle__Group__3 ;
    public final void rule__Circle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:684:1: ( rule__Circle__Group__2__Impl rule__Circle__Group__3 )
            // InternalShapes.g:685:2: rule__Circle__Group__2__Impl rule__Circle__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Circle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__2"


    // $ANTLR start "rule__Circle__Group__2__Impl"
    // InternalShapes.g:692:1: rule__Circle__Group__2__Impl : ( ( rule__Circle__NameAssignment_2 ) ) ;
    public final void rule__Circle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:696:1: ( ( ( rule__Circle__NameAssignment_2 ) ) )
            // InternalShapes.g:697:1: ( ( rule__Circle__NameAssignment_2 ) )
            {
            // InternalShapes.g:697:1: ( ( rule__Circle__NameAssignment_2 ) )
            // InternalShapes.g:698:2: ( rule__Circle__NameAssignment_2 )
            {
             before(grammarAccess.getCircleAccess().getNameAssignment_2()); 
            // InternalShapes.g:699:2: ( rule__Circle__NameAssignment_2 )
            // InternalShapes.g:699:3: rule__Circle__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Circle__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__2__Impl"


    // $ANTLR start "rule__Circle__Group__3"
    // InternalShapes.g:707:1: rule__Circle__Group__3 : rule__Circle__Group__3__Impl rule__Circle__Group__4 ;
    public final void rule__Circle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:711:1: ( rule__Circle__Group__3__Impl rule__Circle__Group__4 )
            // InternalShapes.g:712:2: rule__Circle__Group__3__Impl rule__Circle__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Circle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__3"


    // $ANTLR start "rule__Circle__Group__3__Impl"
    // InternalShapes.g:719:1: rule__Circle__Group__3__Impl : ( '{' ) ;
    public final void rule__Circle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:723:1: ( ( '{' ) )
            // InternalShapes.g:724:1: ( '{' )
            {
            // InternalShapes.g:724:1: ( '{' )
            // InternalShapes.g:725:2: '{'
            {
             before(grammarAccess.getCircleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCircleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__3__Impl"


    // $ANTLR start "rule__Circle__Group__4"
    // InternalShapes.g:734:1: rule__Circle__Group__4 : rule__Circle__Group__4__Impl rule__Circle__Group__5 ;
    public final void rule__Circle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:738:1: ( rule__Circle__Group__4__Impl rule__Circle__Group__5 )
            // InternalShapes.g:739:2: rule__Circle__Group__4__Impl rule__Circle__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Circle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__4"


    // $ANTLR start "rule__Circle__Group__4__Impl"
    // InternalShapes.g:746:1: rule__Circle__Group__4__Impl : ( ( rule__Circle__Group_4__0 )? ) ;
    public final void rule__Circle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:750:1: ( ( ( rule__Circle__Group_4__0 )? ) )
            // InternalShapes.g:751:1: ( ( rule__Circle__Group_4__0 )? )
            {
            // InternalShapes.g:751:1: ( ( rule__Circle__Group_4__0 )? )
            // InternalShapes.g:752:2: ( rule__Circle__Group_4__0 )?
            {
             before(grammarAccess.getCircleAccess().getGroup_4()); 
            // InternalShapes.g:753:2: ( rule__Circle__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalShapes.g:753:3: rule__Circle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Circle__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCircleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__4__Impl"


    // $ANTLR start "rule__Circle__Group__5"
    // InternalShapes.g:761:1: rule__Circle__Group__5 : rule__Circle__Group__5__Impl ;
    public final void rule__Circle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:765:1: ( rule__Circle__Group__5__Impl )
            // InternalShapes.g:766:2: rule__Circle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Circle__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__5"


    // $ANTLR start "rule__Circle__Group__5__Impl"
    // InternalShapes.g:772:1: rule__Circle__Group__5__Impl : ( '}' ) ;
    public final void rule__Circle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:776:1: ( ( '}' ) )
            // InternalShapes.g:777:1: ( '}' )
            {
            // InternalShapes.g:777:1: ( '}' )
            // InternalShapes.g:778:2: '}'
            {
             before(grammarAccess.getCircleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCircleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group__5__Impl"


    // $ANTLR start "rule__Circle__Group_4__0"
    // InternalShapes.g:788:1: rule__Circle__Group_4__0 : rule__Circle__Group_4__0__Impl rule__Circle__Group_4__1 ;
    public final void rule__Circle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:792:1: ( rule__Circle__Group_4__0__Impl rule__Circle__Group_4__1 )
            // InternalShapes.g:793:2: rule__Circle__Group_4__0__Impl rule__Circle__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Circle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Circle__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group_4__0"


    // $ANTLR start "rule__Circle__Group_4__0__Impl"
    // InternalShapes.g:800:1: rule__Circle__Group_4__0__Impl : ( 'radius' ) ;
    public final void rule__Circle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:804:1: ( ( 'radius' ) )
            // InternalShapes.g:805:1: ( 'radius' )
            {
            // InternalShapes.g:805:1: ( 'radius' )
            // InternalShapes.g:806:2: 'radius'
            {
             before(grammarAccess.getCircleAccess().getRadiusKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCircleAccess().getRadiusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group_4__0__Impl"


    // $ANTLR start "rule__Circle__Group_4__1"
    // InternalShapes.g:815:1: rule__Circle__Group_4__1 : rule__Circle__Group_4__1__Impl ;
    public final void rule__Circle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:819:1: ( rule__Circle__Group_4__1__Impl )
            // InternalShapes.g:820:2: rule__Circle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Circle__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group_4__1"


    // $ANTLR start "rule__Circle__Group_4__1__Impl"
    // InternalShapes.g:826:1: rule__Circle__Group_4__1__Impl : ( ( rule__Circle__RadiusAssignment_4_1 ) ) ;
    public final void rule__Circle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:830:1: ( ( ( rule__Circle__RadiusAssignment_4_1 ) ) )
            // InternalShapes.g:831:1: ( ( rule__Circle__RadiusAssignment_4_1 ) )
            {
            // InternalShapes.g:831:1: ( ( rule__Circle__RadiusAssignment_4_1 ) )
            // InternalShapes.g:832:2: ( rule__Circle__RadiusAssignment_4_1 )
            {
             before(grammarAccess.getCircleAccess().getRadiusAssignment_4_1()); 
            // InternalShapes.g:833:2: ( rule__Circle__RadiusAssignment_4_1 )
            // InternalShapes.g:833:3: rule__Circle__RadiusAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Circle__RadiusAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCircleAccess().getRadiusAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__Group_4__1__Impl"


    // $ANTLR start "rule__Rectangle__Group__0"
    // InternalShapes.g:842:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:846:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalShapes.g:847:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Rectangle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0"


    // $ANTLR start "rule__Rectangle__Group__0__Impl"
    // InternalShapes.g:854:1: rule__Rectangle__Group__0__Impl : ( () ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:858:1: ( ( () ) )
            // InternalShapes.g:859:1: ( () )
            {
            // InternalShapes.g:859:1: ( () )
            // InternalShapes.g:860:2: ()
            {
             before(grammarAccess.getRectangleAccess().getRectangleAction_0()); 
            // InternalShapes.g:861:2: ()
            // InternalShapes.g:861:3: 
            {
            }

             after(grammarAccess.getRectangleAccess().getRectangleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0__Impl"


    // $ANTLR start "rule__Rectangle__Group__1"
    // InternalShapes.g:869:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:873:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalShapes.g:874:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Rectangle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1"


    // $ANTLR start "rule__Rectangle__Group__1__Impl"
    // InternalShapes.g:881:1: rule__Rectangle__Group__1__Impl : ( 'Rectangle' ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:885:1: ( ( 'Rectangle' ) )
            // InternalShapes.g:886:1: ( 'Rectangle' )
            {
            // InternalShapes.g:886:1: ( 'Rectangle' )
            // InternalShapes.g:887:2: 'Rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getRectangleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1__Impl"


    // $ANTLR start "rule__Rectangle__Group__2"
    // InternalShapes.g:896:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:900:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalShapes.g:901:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Rectangle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2"


    // $ANTLR start "rule__Rectangle__Group__2__Impl"
    // InternalShapes.g:908:1: rule__Rectangle__Group__2__Impl : ( ( rule__Rectangle__NameAssignment_2 ) ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:912:1: ( ( ( rule__Rectangle__NameAssignment_2 ) ) )
            // InternalShapes.g:913:1: ( ( rule__Rectangle__NameAssignment_2 ) )
            {
            // InternalShapes.g:913:1: ( ( rule__Rectangle__NameAssignment_2 ) )
            // InternalShapes.g:914:2: ( rule__Rectangle__NameAssignment_2 )
            {
             before(grammarAccess.getRectangleAccess().getNameAssignment_2()); 
            // InternalShapes.g:915:2: ( rule__Rectangle__NameAssignment_2 )
            // InternalShapes.g:915:3: rule__Rectangle__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2__Impl"


    // $ANTLR start "rule__Rectangle__Group__3"
    // InternalShapes.g:923:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:927:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalShapes.g:928:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Rectangle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__3"


    // $ANTLR start "rule__Rectangle__Group__3__Impl"
    // InternalShapes.g:935:1: rule__Rectangle__Group__3__Impl : ( '{' ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:939:1: ( ( '{' ) )
            // InternalShapes.g:940:1: ( '{' )
            {
            // InternalShapes.g:940:1: ( '{' )
            // InternalShapes.g:941:2: '{'
            {
             before(grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__3__Impl"


    // $ANTLR start "rule__Rectangle__Group__4"
    // InternalShapes.g:950:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:954:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalShapes.g:955:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Rectangle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__4"


    // $ANTLR start "rule__Rectangle__Group__4__Impl"
    // InternalShapes.g:962:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__Group_4__0 )? ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:966:1: ( ( ( rule__Rectangle__Group_4__0 )? ) )
            // InternalShapes.g:967:1: ( ( rule__Rectangle__Group_4__0 )? )
            {
            // InternalShapes.g:967:1: ( ( rule__Rectangle__Group_4__0 )? )
            // InternalShapes.g:968:2: ( rule__Rectangle__Group_4__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_4()); 
            // InternalShapes.g:969:2: ( rule__Rectangle__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalShapes.g:969:3: rule__Rectangle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRectangleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__4__Impl"


    // $ANTLR start "rule__Rectangle__Group__5"
    // InternalShapes.g:977:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:981:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalShapes.g:982:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Rectangle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__5"


    // $ANTLR start "rule__Rectangle__Group__5__Impl"
    // InternalShapes.g:989:1: rule__Rectangle__Group__5__Impl : ( ( rule__Rectangle__Group_5__0 )? ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:993:1: ( ( ( rule__Rectangle__Group_5__0 )? ) )
            // InternalShapes.g:994:1: ( ( rule__Rectangle__Group_5__0 )? )
            {
            // InternalShapes.g:994:1: ( ( rule__Rectangle__Group_5__0 )? )
            // InternalShapes.g:995:2: ( rule__Rectangle__Group_5__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_5()); 
            // InternalShapes.g:996:2: ( rule__Rectangle__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalShapes.g:996:3: rule__Rectangle__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRectangleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__5__Impl"


    // $ANTLR start "rule__Rectangle__Group__6"
    // InternalShapes.g:1004:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1008:1: ( rule__Rectangle__Group__6__Impl )
            // InternalShapes.g:1009:2: rule__Rectangle__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__6"


    // $ANTLR start "rule__Rectangle__Group__6__Impl"
    // InternalShapes.g:1015:1: rule__Rectangle__Group__6__Impl : ( '}' ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1019:1: ( ( '}' ) )
            // InternalShapes.g:1020:1: ( '}' )
            {
            // InternalShapes.g:1020:1: ( '}' )
            // InternalShapes.g:1021:2: '}'
            {
             before(grammarAccess.getRectangleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__6__Impl"


    // $ANTLR start "rule__Rectangle__Group_4__0"
    // InternalShapes.g:1031:1: rule__Rectangle__Group_4__0 : rule__Rectangle__Group_4__0__Impl rule__Rectangle__Group_4__1 ;
    public final void rule__Rectangle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1035:1: ( rule__Rectangle__Group_4__0__Impl rule__Rectangle__Group_4__1 )
            // InternalShapes.g:1036:2: rule__Rectangle__Group_4__0__Impl rule__Rectangle__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Rectangle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_4__0"


    // $ANTLR start "rule__Rectangle__Group_4__0__Impl"
    // InternalShapes.g:1043:1: rule__Rectangle__Group_4__0__Impl : ( 'length' ) ;
    public final void rule__Rectangle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1047:1: ( ( 'length' ) )
            // InternalShapes.g:1048:1: ( 'length' )
            {
            // InternalShapes.g:1048:1: ( 'length' )
            // InternalShapes.g:1049:2: 'length'
            {
             before(grammarAccess.getRectangleAccess().getLengthKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getLengthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_4__0__Impl"


    // $ANTLR start "rule__Rectangle__Group_4__1"
    // InternalShapes.g:1058:1: rule__Rectangle__Group_4__1 : rule__Rectangle__Group_4__1__Impl ;
    public final void rule__Rectangle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1062:1: ( rule__Rectangle__Group_4__1__Impl )
            // InternalShapes.g:1063:2: rule__Rectangle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_4__1"


    // $ANTLR start "rule__Rectangle__Group_4__1__Impl"
    // InternalShapes.g:1069:1: rule__Rectangle__Group_4__1__Impl : ( ( rule__Rectangle__LengthAssignment_4_1 ) ) ;
    public final void rule__Rectangle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1073:1: ( ( ( rule__Rectangle__LengthAssignment_4_1 ) ) )
            // InternalShapes.g:1074:1: ( ( rule__Rectangle__LengthAssignment_4_1 ) )
            {
            // InternalShapes.g:1074:1: ( ( rule__Rectangle__LengthAssignment_4_1 ) )
            // InternalShapes.g:1075:2: ( rule__Rectangle__LengthAssignment_4_1 )
            {
             before(grammarAccess.getRectangleAccess().getLengthAssignment_4_1()); 
            // InternalShapes.g:1076:2: ( rule__Rectangle__LengthAssignment_4_1 )
            // InternalShapes.g:1076:3: rule__Rectangle__LengthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__LengthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_4__1__Impl"


    // $ANTLR start "rule__Rectangle__Group_5__0"
    // InternalShapes.g:1085:1: rule__Rectangle__Group_5__0 : rule__Rectangle__Group_5__0__Impl rule__Rectangle__Group_5__1 ;
    public final void rule__Rectangle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1089:1: ( rule__Rectangle__Group_5__0__Impl rule__Rectangle__Group_5__1 )
            // InternalShapes.g:1090:2: rule__Rectangle__Group_5__0__Impl rule__Rectangle__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Rectangle__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_5__0"


    // $ANTLR start "rule__Rectangle__Group_5__0__Impl"
    // InternalShapes.g:1097:1: rule__Rectangle__Group_5__0__Impl : ( 'width' ) ;
    public final void rule__Rectangle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1101:1: ( ( 'width' ) )
            // InternalShapes.g:1102:1: ( 'width' )
            {
            // InternalShapes.g:1102:1: ( 'width' )
            // InternalShapes.g:1103:2: 'width'
            {
             before(grammarAccess.getRectangleAccess().getWidthKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getWidthKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_5__0__Impl"


    // $ANTLR start "rule__Rectangle__Group_5__1"
    // InternalShapes.g:1112:1: rule__Rectangle__Group_5__1 : rule__Rectangle__Group_5__1__Impl ;
    public final void rule__Rectangle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1116:1: ( rule__Rectangle__Group_5__1__Impl )
            // InternalShapes.g:1117:2: rule__Rectangle__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_5__1"


    // $ANTLR start "rule__Rectangle__Group_5__1__Impl"
    // InternalShapes.g:1123:1: rule__Rectangle__Group_5__1__Impl : ( ( rule__Rectangle__WidthAssignment_5_1 ) ) ;
    public final void rule__Rectangle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1127:1: ( ( ( rule__Rectangle__WidthAssignment_5_1 ) ) )
            // InternalShapes.g:1128:1: ( ( rule__Rectangle__WidthAssignment_5_1 ) )
            {
            // InternalShapes.g:1128:1: ( ( rule__Rectangle__WidthAssignment_5_1 ) )
            // InternalShapes.g:1129:2: ( rule__Rectangle__WidthAssignment_5_1 )
            {
             before(grammarAccess.getRectangleAccess().getWidthAssignment_5_1()); 
            // InternalShapes.g:1130:2: ( rule__Rectangle__WidthAssignment_5_1 )
            // InternalShapes.g:1130:3: rule__Rectangle__WidthAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__WidthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getWidthAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_5__1__Impl"


    // $ANTLR start "rule__Triangle__Group__0"
    // InternalShapes.g:1139:1: rule__Triangle__Group__0 : rule__Triangle__Group__0__Impl rule__Triangle__Group__1 ;
    public final void rule__Triangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1143:1: ( rule__Triangle__Group__0__Impl rule__Triangle__Group__1 )
            // InternalShapes.g:1144:2: rule__Triangle__Group__0__Impl rule__Triangle__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Triangle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__0"


    // $ANTLR start "rule__Triangle__Group__0__Impl"
    // InternalShapes.g:1151:1: rule__Triangle__Group__0__Impl : ( () ) ;
    public final void rule__Triangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1155:1: ( ( () ) )
            // InternalShapes.g:1156:1: ( () )
            {
            // InternalShapes.g:1156:1: ( () )
            // InternalShapes.g:1157:2: ()
            {
             before(grammarAccess.getTriangleAccess().getTriangleAction_0()); 
            // InternalShapes.g:1158:2: ()
            // InternalShapes.g:1158:3: 
            {
            }

             after(grammarAccess.getTriangleAccess().getTriangleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__0__Impl"


    // $ANTLR start "rule__Triangle__Group__1"
    // InternalShapes.g:1166:1: rule__Triangle__Group__1 : rule__Triangle__Group__1__Impl rule__Triangle__Group__2 ;
    public final void rule__Triangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1170:1: ( rule__Triangle__Group__1__Impl rule__Triangle__Group__2 )
            // InternalShapes.g:1171:2: rule__Triangle__Group__1__Impl rule__Triangle__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Triangle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__1"


    // $ANTLR start "rule__Triangle__Group__1__Impl"
    // InternalShapes.g:1178:1: rule__Triangle__Group__1__Impl : ( 'Triangle' ) ;
    public final void rule__Triangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1182:1: ( ( 'Triangle' ) )
            // InternalShapes.g:1183:1: ( 'Triangle' )
            {
            // InternalShapes.g:1183:1: ( 'Triangle' )
            // InternalShapes.g:1184:2: 'Triangle'
            {
             before(grammarAccess.getTriangleAccess().getTriangleKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTriangleAccess().getTriangleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__1__Impl"


    // $ANTLR start "rule__Triangle__Group__2"
    // InternalShapes.g:1193:1: rule__Triangle__Group__2 : rule__Triangle__Group__2__Impl rule__Triangle__Group__3 ;
    public final void rule__Triangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1197:1: ( rule__Triangle__Group__2__Impl rule__Triangle__Group__3 )
            // InternalShapes.g:1198:2: rule__Triangle__Group__2__Impl rule__Triangle__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Triangle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__2"


    // $ANTLR start "rule__Triangle__Group__2__Impl"
    // InternalShapes.g:1205:1: rule__Triangle__Group__2__Impl : ( ( rule__Triangle__NameAssignment_2 ) ) ;
    public final void rule__Triangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1209:1: ( ( ( rule__Triangle__NameAssignment_2 ) ) )
            // InternalShapes.g:1210:1: ( ( rule__Triangle__NameAssignment_2 ) )
            {
            // InternalShapes.g:1210:1: ( ( rule__Triangle__NameAssignment_2 ) )
            // InternalShapes.g:1211:2: ( rule__Triangle__NameAssignment_2 )
            {
             before(grammarAccess.getTriangleAccess().getNameAssignment_2()); 
            // InternalShapes.g:1212:2: ( rule__Triangle__NameAssignment_2 )
            // InternalShapes.g:1212:3: rule__Triangle__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTriangleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__2__Impl"


    // $ANTLR start "rule__Triangle__Group__3"
    // InternalShapes.g:1220:1: rule__Triangle__Group__3 : rule__Triangle__Group__3__Impl rule__Triangle__Group__4 ;
    public final void rule__Triangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1224:1: ( rule__Triangle__Group__3__Impl rule__Triangle__Group__4 )
            // InternalShapes.g:1225:2: rule__Triangle__Group__3__Impl rule__Triangle__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Triangle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__3"


    // $ANTLR start "rule__Triangle__Group__3__Impl"
    // InternalShapes.g:1232:1: rule__Triangle__Group__3__Impl : ( '{' ) ;
    public final void rule__Triangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1236:1: ( ( '{' ) )
            // InternalShapes.g:1237:1: ( '{' )
            {
            // InternalShapes.g:1237:1: ( '{' )
            // InternalShapes.g:1238:2: '{'
            {
             before(grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__3__Impl"


    // $ANTLR start "rule__Triangle__Group__4"
    // InternalShapes.g:1247:1: rule__Triangle__Group__4 : rule__Triangle__Group__4__Impl rule__Triangle__Group__5 ;
    public final void rule__Triangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1251:1: ( rule__Triangle__Group__4__Impl rule__Triangle__Group__5 )
            // InternalShapes.g:1252:2: rule__Triangle__Group__4__Impl rule__Triangle__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Triangle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__4"


    // $ANTLR start "rule__Triangle__Group__4__Impl"
    // InternalShapes.g:1259:1: rule__Triangle__Group__4__Impl : ( ( rule__Triangle__Group_4__0 )? ) ;
    public final void rule__Triangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1263:1: ( ( ( rule__Triangle__Group_4__0 )? ) )
            // InternalShapes.g:1264:1: ( ( rule__Triangle__Group_4__0 )? )
            {
            // InternalShapes.g:1264:1: ( ( rule__Triangle__Group_4__0 )? )
            // InternalShapes.g:1265:2: ( rule__Triangle__Group_4__0 )?
            {
             before(grammarAccess.getTriangleAccess().getGroup_4()); 
            // InternalShapes.g:1266:2: ( rule__Triangle__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShapes.g:1266:3: rule__Triangle__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Triangle__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriangleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__4__Impl"


    // $ANTLR start "rule__Triangle__Group__5"
    // InternalShapes.g:1274:1: rule__Triangle__Group__5 : rule__Triangle__Group__5__Impl rule__Triangle__Group__6 ;
    public final void rule__Triangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1278:1: ( rule__Triangle__Group__5__Impl rule__Triangle__Group__6 )
            // InternalShapes.g:1279:2: rule__Triangle__Group__5__Impl rule__Triangle__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Triangle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__5"


    // $ANTLR start "rule__Triangle__Group__5__Impl"
    // InternalShapes.g:1286:1: rule__Triangle__Group__5__Impl : ( ( rule__Triangle__Group_5__0 )? ) ;
    public final void rule__Triangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1290:1: ( ( ( rule__Triangle__Group_5__0 )? ) )
            // InternalShapes.g:1291:1: ( ( rule__Triangle__Group_5__0 )? )
            {
            // InternalShapes.g:1291:1: ( ( rule__Triangle__Group_5__0 )? )
            // InternalShapes.g:1292:2: ( rule__Triangle__Group_5__0 )?
            {
             before(grammarAccess.getTriangleAccess().getGroup_5()); 
            // InternalShapes.g:1293:2: ( rule__Triangle__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalShapes.g:1293:3: rule__Triangle__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Triangle__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriangleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__5__Impl"


    // $ANTLR start "rule__Triangle__Group__6"
    // InternalShapes.g:1301:1: rule__Triangle__Group__6 : rule__Triangle__Group__6__Impl rule__Triangle__Group__7 ;
    public final void rule__Triangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1305:1: ( rule__Triangle__Group__6__Impl rule__Triangle__Group__7 )
            // InternalShapes.g:1306:2: rule__Triangle__Group__6__Impl rule__Triangle__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Triangle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__6"


    // $ANTLR start "rule__Triangle__Group__6__Impl"
    // InternalShapes.g:1313:1: rule__Triangle__Group__6__Impl : ( ( rule__Triangle__Group_6__0 )? ) ;
    public final void rule__Triangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1317:1: ( ( ( rule__Triangle__Group_6__0 )? ) )
            // InternalShapes.g:1318:1: ( ( rule__Triangle__Group_6__0 )? )
            {
            // InternalShapes.g:1318:1: ( ( rule__Triangle__Group_6__0 )? )
            // InternalShapes.g:1319:2: ( rule__Triangle__Group_6__0 )?
            {
             before(grammarAccess.getTriangleAccess().getGroup_6()); 
            // InternalShapes.g:1320:2: ( rule__Triangle__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalShapes.g:1320:3: rule__Triangle__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Triangle__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriangleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__6__Impl"


    // $ANTLR start "rule__Triangle__Group__7"
    // InternalShapes.g:1328:1: rule__Triangle__Group__7 : rule__Triangle__Group__7__Impl ;
    public final void rule__Triangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1332:1: ( rule__Triangle__Group__7__Impl )
            // InternalShapes.g:1333:2: rule__Triangle__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__7"


    // $ANTLR start "rule__Triangle__Group__7__Impl"
    // InternalShapes.g:1339:1: rule__Triangle__Group__7__Impl : ( '}' ) ;
    public final void rule__Triangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1343:1: ( ( '}' ) )
            // InternalShapes.g:1344:1: ( '}' )
            {
            // InternalShapes.g:1344:1: ( '}' )
            // InternalShapes.g:1345:2: '}'
            {
             before(grammarAccess.getTriangleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTriangleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group__7__Impl"


    // $ANTLR start "rule__Triangle__Group_4__0"
    // InternalShapes.g:1355:1: rule__Triangle__Group_4__0 : rule__Triangle__Group_4__0__Impl rule__Triangle__Group_4__1 ;
    public final void rule__Triangle__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1359:1: ( rule__Triangle__Group_4__0__Impl rule__Triangle__Group_4__1 )
            // InternalShapes.g:1360:2: rule__Triangle__Group_4__0__Impl rule__Triangle__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Triangle__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_4__0"


    // $ANTLR start "rule__Triangle__Group_4__0__Impl"
    // InternalShapes.g:1367:1: rule__Triangle__Group_4__0__Impl : ( 'a' ) ;
    public final void rule__Triangle__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1371:1: ( ( 'a' ) )
            // InternalShapes.g:1372:1: ( 'a' )
            {
            // InternalShapes.g:1372:1: ( 'a' )
            // InternalShapes.g:1373:2: 'a'
            {
             before(grammarAccess.getTriangleAccess().getAKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTriangleAccess().getAKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_4__0__Impl"


    // $ANTLR start "rule__Triangle__Group_4__1"
    // InternalShapes.g:1382:1: rule__Triangle__Group_4__1 : rule__Triangle__Group_4__1__Impl ;
    public final void rule__Triangle__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1386:1: ( rule__Triangle__Group_4__1__Impl )
            // InternalShapes.g:1387:2: rule__Triangle__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_4__1"


    // $ANTLR start "rule__Triangle__Group_4__1__Impl"
    // InternalShapes.g:1393:1: rule__Triangle__Group_4__1__Impl : ( ( rule__Triangle__AAssignment_4_1 ) ) ;
    public final void rule__Triangle__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1397:1: ( ( ( rule__Triangle__AAssignment_4_1 ) ) )
            // InternalShapes.g:1398:1: ( ( rule__Triangle__AAssignment_4_1 ) )
            {
            // InternalShapes.g:1398:1: ( ( rule__Triangle__AAssignment_4_1 ) )
            // InternalShapes.g:1399:2: ( rule__Triangle__AAssignment_4_1 )
            {
             before(grammarAccess.getTriangleAccess().getAAssignment_4_1()); 
            // InternalShapes.g:1400:2: ( rule__Triangle__AAssignment_4_1 )
            // InternalShapes.g:1400:3: rule__Triangle__AAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__AAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTriangleAccess().getAAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_4__1__Impl"


    // $ANTLR start "rule__Triangle__Group_5__0"
    // InternalShapes.g:1409:1: rule__Triangle__Group_5__0 : rule__Triangle__Group_5__0__Impl rule__Triangle__Group_5__1 ;
    public final void rule__Triangle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1413:1: ( rule__Triangle__Group_5__0__Impl rule__Triangle__Group_5__1 )
            // InternalShapes.g:1414:2: rule__Triangle__Group_5__0__Impl rule__Triangle__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Triangle__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_5__0"


    // $ANTLR start "rule__Triangle__Group_5__0__Impl"
    // InternalShapes.g:1421:1: rule__Triangle__Group_5__0__Impl : ( 'b' ) ;
    public final void rule__Triangle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1425:1: ( ( 'b' ) )
            // InternalShapes.g:1426:1: ( 'b' )
            {
            // InternalShapes.g:1426:1: ( 'b' )
            // InternalShapes.g:1427:2: 'b'
            {
             before(grammarAccess.getTriangleAccess().getBKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTriangleAccess().getBKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_5__0__Impl"


    // $ANTLR start "rule__Triangle__Group_5__1"
    // InternalShapes.g:1436:1: rule__Triangle__Group_5__1 : rule__Triangle__Group_5__1__Impl ;
    public final void rule__Triangle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1440:1: ( rule__Triangle__Group_5__1__Impl )
            // InternalShapes.g:1441:2: rule__Triangle__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_5__1"


    // $ANTLR start "rule__Triangle__Group_5__1__Impl"
    // InternalShapes.g:1447:1: rule__Triangle__Group_5__1__Impl : ( ( rule__Triangle__BAssignment_5_1 ) ) ;
    public final void rule__Triangle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1451:1: ( ( ( rule__Triangle__BAssignment_5_1 ) ) )
            // InternalShapes.g:1452:1: ( ( rule__Triangle__BAssignment_5_1 ) )
            {
            // InternalShapes.g:1452:1: ( ( rule__Triangle__BAssignment_5_1 ) )
            // InternalShapes.g:1453:2: ( rule__Triangle__BAssignment_5_1 )
            {
             before(grammarAccess.getTriangleAccess().getBAssignment_5_1()); 
            // InternalShapes.g:1454:2: ( rule__Triangle__BAssignment_5_1 )
            // InternalShapes.g:1454:3: rule__Triangle__BAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__BAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTriangleAccess().getBAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_5__1__Impl"


    // $ANTLR start "rule__Triangle__Group_6__0"
    // InternalShapes.g:1463:1: rule__Triangle__Group_6__0 : rule__Triangle__Group_6__0__Impl rule__Triangle__Group_6__1 ;
    public final void rule__Triangle__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1467:1: ( rule__Triangle__Group_6__0__Impl rule__Triangle__Group_6__1 )
            // InternalShapes.g:1468:2: rule__Triangle__Group_6__0__Impl rule__Triangle__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Triangle__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Triangle__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_6__0"


    // $ANTLR start "rule__Triangle__Group_6__0__Impl"
    // InternalShapes.g:1475:1: rule__Triangle__Group_6__0__Impl : ( 'c' ) ;
    public final void rule__Triangle__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1479:1: ( ( 'c' ) )
            // InternalShapes.g:1480:1: ( 'c' )
            {
            // InternalShapes.g:1480:1: ( 'c' )
            // InternalShapes.g:1481:2: 'c'
            {
             before(grammarAccess.getTriangleAccess().getCKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTriangleAccess().getCKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_6__0__Impl"


    // $ANTLR start "rule__Triangle__Group_6__1"
    // InternalShapes.g:1490:1: rule__Triangle__Group_6__1 : rule__Triangle__Group_6__1__Impl ;
    public final void rule__Triangle__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1494:1: ( rule__Triangle__Group_6__1__Impl )
            // InternalShapes.g:1495:2: rule__Triangle__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_6__1"


    // $ANTLR start "rule__Triangle__Group_6__1__Impl"
    // InternalShapes.g:1501:1: rule__Triangle__Group_6__1__Impl : ( ( rule__Triangle__CAssignment_6_1 ) ) ;
    public final void rule__Triangle__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1505:1: ( ( ( rule__Triangle__CAssignment_6_1 ) ) )
            // InternalShapes.g:1506:1: ( ( rule__Triangle__CAssignment_6_1 ) )
            {
            // InternalShapes.g:1506:1: ( ( rule__Triangle__CAssignment_6_1 ) )
            // InternalShapes.g:1507:2: ( rule__Triangle__CAssignment_6_1 )
            {
             before(grammarAccess.getTriangleAccess().getCAssignment_6_1()); 
            // InternalShapes.g:1508:2: ( rule__Triangle__CAssignment_6_1 )
            // InternalShapes.g:1508:3: rule__Triangle__CAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Triangle__CAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTriangleAccess().getCAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__Group_6__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalShapes.g:1517:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1521:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalShapes.g:1522:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalShapes.g:1529:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1533:1: ( ( ( '-' )? ) )
            // InternalShapes.g:1534:1: ( ( '-' )? )
            {
            // InternalShapes.g:1534:1: ( ( '-' )? )
            // InternalShapes.g:1535:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalShapes.g:1536:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalShapes.g:1536:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalShapes.g:1544:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1548:1: ( rule__EInt__Group__1__Impl )
            // InternalShapes.g:1549:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalShapes.g:1555:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1559:1: ( ( RULE_INT ) )
            // InternalShapes.g:1560:1: ( RULE_INT )
            {
            // InternalShapes.g:1560:1: ( RULE_INT )
            // InternalShapes.g:1561:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ShapeConstructor__NameAssignment_2"
    // InternalShapes.g:1571:1: rule__ShapeConstructor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ShapeConstructor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1575:1: ( ( ruleEString ) )
            // InternalShapes.g:1576:2: ( ruleEString )
            {
            // InternalShapes.g:1576:2: ( ruleEString )
            // InternalShapes.g:1577:3: ruleEString
            {
             before(grammarAccess.getShapeConstructorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShapeConstructorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__NameAssignment_2"


    // $ANTLR start "rule__ShapeConstructor__ShapeAssignment_4_2"
    // InternalShapes.g:1586:1: rule__ShapeConstructor__ShapeAssignment_4_2 : ( ruleShape ) ;
    public final void rule__ShapeConstructor__ShapeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1590:1: ( ( ruleShape ) )
            // InternalShapes.g:1591:2: ( ruleShape )
            {
            // InternalShapes.g:1591:2: ( ruleShape )
            // InternalShapes.g:1592:3: ruleShape
            {
             before(grammarAccess.getShapeConstructorAccess().getShapeShapeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeConstructorAccess().getShapeShapeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__ShapeAssignment_4_2"


    // $ANTLR start "rule__ShapeConstructor__ShapeAssignment_4_3_1"
    // InternalShapes.g:1601:1: rule__ShapeConstructor__ShapeAssignment_4_3_1 : ( ruleShape ) ;
    public final void rule__ShapeConstructor__ShapeAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1605:1: ( ( ruleShape ) )
            // InternalShapes.g:1606:2: ( ruleShape )
            {
            // InternalShapes.g:1606:2: ( ruleShape )
            // InternalShapes.g:1607:3: ruleShape
            {
             before(grammarAccess.getShapeConstructorAccess().getShapeShapeParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeConstructorAccess().getShapeShapeParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShapeConstructor__ShapeAssignment_4_3_1"


    // $ANTLR start "rule__Circle__NameAssignment_2"
    // InternalShapes.g:1616:1: rule__Circle__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Circle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1620:1: ( ( ruleEString ) )
            // InternalShapes.g:1621:2: ( ruleEString )
            {
            // InternalShapes.g:1621:2: ( ruleEString )
            // InternalShapes.g:1622:3: ruleEString
            {
             before(grammarAccess.getCircleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCircleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__NameAssignment_2"


    // $ANTLR start "rule__Circle__RadiusAssignment_4_1"
    // InternalShapes.g:1631:1: rule__Circle__RadiusAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Circle__RadiusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1635:1: ( ( ruleEInt ) )
            // InternalShapes.g:1636:2: ( ruleEInt )
            {
            // InternalShapes.g:1636:2: ( ruleEInt )
            // InternalShapes.g:1637:3: ruleEInt
            {
             before(grammarAccess.getCircleAccess().getRadiusEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCircleAccess().getRadiusEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Circle__RadiusAssignment_4_1"


    // $ANTLR start "rule__Rectangle__NameAssignment_2"
    // InternalShapes.g:1646:1: rule__Rectangle__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Rectangle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1650:1: ( ( ruleEString ) )
            // InternalShapes.g:1651:2: ( ruleEString )
            {
            // InternalShapes.g:1651:2: ( ruleEString )
            // InternalShapes.g:1652:3: ruleEString
            {
             before(grammarAccess.getRectangleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__NameAssignment_2"


    // $ANTLR start "rule__Rectangle__LengthAssignment_4_1"
    // InternalShapes.g:1661:1: rule__Rectangle__LengthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__LengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1665:1: ( ( ruleEInt ) )
            // InternalShapes.g:1666:2: ( ruleEInt )
            {
            // InternalShapes.g:1666:2: ( ruleEInt )
            // InternalShapes.g:1667:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getLengthEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getLengthEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__LengthAssignment_4_1"


    // $ANTLR start "rule__Rectangle__WidthAssignment_5_1"
    // InternalShapes.g:1676:1: rule__Rectangle__WidthAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__WidthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1680:1: ( ( ruleEInt ) )
            // InternalShapes.g:1681:2: ( ruleEInt )
            {
            // InternalShapes.g:1681:2: ( ruleEInt )
            // InternalShapes.g:1682:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getWidthEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getWidthEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__WidthAssignment_5_1"


    // $ANTLR start "rule__Triangle__NameAssignment_2"
    // InternalShapes.g:1691:1: rule__Triangle__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Triangle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1695:1: ( ( ruleEString ) )
            // InternalShapes.g:1696:2: ( ruleEString )
            {
            // InternalShapes.g:1696:2: ( ruleEString )
            // InternalShapes.g:1697:3: ruleEString
            {
             before(grammarAccess.getTriangleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTriangleAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__NameAssignment_2"


    // $ANTLR start "rule__Triangle__AAssignment_4_1"
    // InternalShapes.g:1706:1: rule__Triangle__AAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Triangle__AAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1710:1: ( ( ruleEInt ) )
            // InternalShapes.g:1711:2: ( ruleEInt )
            {
            // InternalShapes.g:1711:2: ( ruleEInt )
            // InternalShapes.g:1712:3: ruleEInt
            {
             before(grammarAccess.getTriangleAccess().getAEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTriangleAccess().getAEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__AAssignment_4_1"


    // $ANTLR start "rule__Triangle__BAssignment_5_1"
    // InternalShapes.g:1721:1: rule__Triangle__BAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Triangle__BAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1725:1: ( ( ruleEInt ) )
            // InternalShapes.g:1726:2: ( ruleEInt )
            {
            // InternalShapes.g:1726:2: ( ruleEInt )
            // InternalShapes.g:1727:3: ruleEInt
            {
             before(grammarAccess.getTriangleAccess().getBEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTriangleAccess().getBEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__BAssignment_5_1"


    // $ANTLR start "rule__Triangle__CAssignment_6_1"
    // InternalShapes.g:1736:1: rule__Triangle__CAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Triangle__CAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShapes.g:1740:1: ( ( ruleEInt ) )
            // InternalShapes.g:1741:2: ( ruleEInt )
            {
            // InternalShapes.g:1741:2: ( ruleEInt )
            // InternalShapes.g:1742:3: ruleEInt
            {
             before(grammarAccess.getTriangleAccess().getCEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTriangleAccess().getCEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Triangle__CAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000250000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C02000L});

}