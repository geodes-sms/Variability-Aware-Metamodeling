package shapes.myconstructor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import shapes.myconstructor.services.ShapesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShapesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ShapeConstructor'", "'{'", "'shape'", "','", "'}'", "'Circle'", "'radius'", "'Rectangle'", "'length'", "'width'", "'Triangle'", "'a'", "'b'", "'c'", "'-'"
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

        public InternalShapesParser(TokenStream input, ShapesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ShapeConstructor";
       	}

       	@Override
       	protected ShapesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleShapeConstructor"
    // InternalShapes.g:64:1: entryRuleShapeConstructor returns [EObject current=null] : iv_ruleShapeConstructor= ruleShapeConstructor EOF ;
    public final EObject entryRuleShapeConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShapeConstructor = null;


        try {
            // InternalShapes.g:64:57: (iv_ruleShapeConstructor= ruleShapeConstructor EOF )
            // InternalShapes.g:65:2: iv_ruleShapeConstructor= ruleShapeConstructor EOF
            {
             newCompositeNode(grammarAccess.getShapeConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShapeConstructor=ruleShapeConstructor();

            state._fsp--;

             current =iv_ruleShapeConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShapeConstructor"


    // $ANTLR start "ruleShapeConstructor"
    // InternalShapes.g:71:1: ruleShapeConstructor returns [EObject current=null] : ( () otherlv_1= 'ShapeConstructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shape' otherlv_5= '{' ( (lv_shape_6_0= ruleShape ) ) (otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleShapeConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_shape_6_0 = null;

        EObject lv_shape_8_0 = null;



        	enterRule();

        try {
            // InternalShapes.g:77:2: ( ( () otherlv_1= 'ShapeConstructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shape' otherlv_5= '{' ( (lv_shape_6_0= ruleShape ) ) (otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalShapes.g:78:2: ( () otherlv_1= 'ShapeConstructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shape' otherlv_5= '{' ( (lv_shape_6_0= ruleShape ) ) (otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalShapes.g:78:2: ( () otherlv_1= 'ShapeConstructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shape' otherlv_5= '{' ( (lv_shape_6_0= ruleShape ) ) (otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalShapes.g:79:3: () otherlv_1= 'ShapeConstructor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shape' otherlv_5= '{' ( (lv_shape_6_0= ruleShape ) ) (otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalShapes.g:79:3: ()
            // InternalShapes.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShapeConstructorAccess().getShapeConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getShapeConstructorAccess().getShapeConstructorKeyword_1());
            		
            // InternalShapes.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalShapes.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalShapes.g:91:4: (lv_name_2_0= ruleEString )
            // InternalShapes.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShapeConstructorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShapeConstructorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"shapes.myconstructor.Shapes.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getShapeConstructorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalShapes.g:113:3: (otherlv_4= 'shape' otherlv_5= '{' ( (lv_shape_6_0= ruleShape ) ) (otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalShapes.g:114:4: otherlv_4= 'shape' otherlv_5= '{' ( (lv_shape_6_0= ruleShape ) ) (otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getShapeConstructorAccess().getShapeKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getShapeConstructorAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalShapes.g:122:4: ( (lv_shape_6_0= ruleShape ) )
                    // InternalShapes.g:123:5: (lv_shape_6_0= ruleShape )
                    {
                    // InternalShapes.g:123:5: (lv_shape_6_0= ruleShape )
                    // InternalShapes.g:124:6: lv_shape_6_0= ruleShape
                    {

                    						newCompositeNode(grammarAccess.getShapeConstructorAccess().getShapeShapeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_shape_6_0=ruleShape();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShapeConstructorRule());
                    						}
                    						add(
                    							current,
                    							"shape",
                    							lv_shape_6_0,
                    							"shapes.myconstructor.Shapes.Shape");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalShapes.g:141:4: (otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalShapes.g:142:5: otherlv_7= ',' ( (lv_shape_8_0= ruleShape ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getShapeConstructorAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalShapes.g:146:5: ( (lv_shape_8_0= ruleShape ) )
                    	    // InternalShapes.g:147:6: (lv_shape_8_0= ruleShape )
                    	    {
                    	    // InternalShapes.g:147:6: (lv_shape_8_0= ruleShape )
                    	    // InternalShapes.g:148:7: lv_shape_8_0= ruleShape
                    	    {

                    	    							newCompositeNode(grammarAccess.getShapeConstructorAccess().getShapeShapeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_shape_8_0=ruleShape();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShapeConstructorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"shape",
                    	    								lv_shape_8_0,
                    	    								"shapes.myconstructor.Shapes.Shape");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getShapeConstructorAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getShapeConstructorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShapeConstructor"


    // $ANTLR start "entryRuleShape"
    // InternalShapes.g:179:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // InternalShapes.g:179:46: (iv_ruleShape= ruleShape EOF )
            // InternalShapes.g:180:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // InternalShapes.g:186:1: ruleShape returns [EObject current=null] : (this_Circle_0= ruleCircle | this_Rectangle_1= ruleRectangle | this_Triangle_2= ruleTriangle ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        EObject this_Circle_0 = null;

        EObject this_Rectangle_1 = null;

        EObject this_Triangle_2 = null;



        	enterRule();

        try {
            // InternalShapes.g:192:2: ( (this_Circle_0= ruleCircle | this_Rectangle_1= ruleRectangle | this_Triangle_2= ruleTriangle ) )
            // InternalShapes.g:193:2: (this_Circle_0= ruleCircle | this_Rectangle_1= ruleRectangle | this_Triangle_2= ruleTriangle )
            {
            // InternalShapes.g:193:2: (this_Circle_0= ruleCircle | this_Rectangle_1= ruleRectangle | this_Triangle_2= ruleTriangle )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalShapes.g:194:3: this_Circle_0= ruleCircle
                    {

                    			newCompositeNode(grammarAccess.getShapeAccess().getCircleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Circle_0=ruleCircle();

                    state._fsp--;


                    			current = this_Circle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShapes.g:203:3: this_Rectangle_1= ruleRectangle
                    {

                    			newCompositeNode(grammarAccess.getShapeAccess().getRectangleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rectangle_1=ruleRectangle();

                    state._fsp--;


                    			current = this_Rectangle_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShapes.g:212:3: this_Triangle_2= ruleTriangle
                    {

                    			newCompositeNode(grammarAccess.getShapeAccess().getTriangleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Triangle_2=ruleTriangle();

                    state._fsp--;


                    			current = this_Triangle_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleEString"
    // InternalShapes.g:224:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalShapes.g:224:47: (iv_ruleEString= ruleEString EOF )
            // InternalShapes.g:225:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalShapes.g:231:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalShapes.g:237:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalShapes.g:238:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalShapes.g:238:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalShapes.g:239:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalShapes.g:247:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCircle"
    // InternalShapes.g:258:1: entryRuleCircle returns [EObject current=null] : iv_ruleCircle= ruleCircle EOF ;
    public final EObject entryRuleCircle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCircle = null;


        try {
            // InternalShapes.g:258:47: (iv_ruleCircle= ruleCircle EOF )
            // InternalShapes.g:259:2: iv_ruleCircle= ruleCircle EOF
            {
             newCompositeNode(grammarAccess.getCircleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCircle=ruleCircle();

            state._fsp--;

             current =iv_ruleCircle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCircle"


    // $ANTLR start "ruleCircle"
    // InternalShapes.g:265:1: ruleCircle returns [EObject current=null] : ( () otherlv_1= 'Circle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleCircle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_radius_5_0 = null;



        	enterRule();

        try {
            // InternalShapes.g:271:2: ( ( () otherlv_1= 'Circle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalShapes.g:272:2: ( () otherlv_1= 'Circle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalShapes.g:272:2: ( () otherlv_1= 'Circle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalShapes.g:273:3: () otherlv_1= 'Circle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalShapes.g:273:3: ()
            // InternalShapes.g:274:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCircleAccess().getCircleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCircleAccess().getCircleKeyword_1());
            		
            // InternalShapes.g:284:3: ( (lv_name_2_0= ruleEString ) )
            // InternalShapes.g:285:4: (lv_name_2_0= ruleEString )
            {
            // InternalShapes.g:285:4: (lv_name_2_0= ruleEString )
            // InternalShapes.g:286:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCircleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCircleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"shapes.myconstructor.Shapes.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCircleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalShapes.g:307:3: (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalShapes.g:308:4: otherlv_4= 'radius' ( (lv_radius_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getCircleAccess().getRadiusKeyword_4_0());
                    			
                    // InternalShapes.g:312:4: ( (lv_radius_5_0= ruleEInt ) )
                    // InternalShapes.g:313:5: (lv_radius_5_0= ruleEInt )
                    {
                    // InternalShapes.g:313:5: (lv_radius_5_0= ruleEInt )
                    // InternalShapes.g:314:6: lv_radius_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCircleAccess().getRadiusEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_radius_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCircleRule());
                    						}
                    						set(
                    							current,
                    							"radius",
                    							lv_radius_5_0,
                    							"shapes.myconstructor.Shapes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCircleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCircle"


    // $ANTLR start "entryRuleRectangle"
    // InternalShapes.g:340:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalShapes.g:340:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalShapes.g:341:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalShapes.g:347:1: ruleRectangle returns [EObject current=null] : ( () otherlv_1= 'Rectangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'length' ( (lv_length_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEInt ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_length_5_0 = null;

        AntlrDatatypeRuleToken lv_width_7_0 = null;



        	enterRule();

        try {
            // InternalShapes.g:353:2: ( ( () otherlv_1= 'Rectangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'length' ( (lv_length_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEInt ) ) )? otherlv_8= '}' ) )
            // InternalShapes.g:354:2: ( () otherlv_1= 'Rectangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'length' ( (lv_length_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            {
            // InternalShapes.g:354:2: ( () otherlv_1= 'Rectangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'length' ( (lv_length_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            // InternalShapes.g:355:3: () otherlv_1= 'Rectangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'length' ( (lv_length_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEInt ) ) )? otherlv_8= '}'
            {
            // InternalShapes.g:355:3: ()
            // InternalShapes.g:356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRectangleAccess().getRectangleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRectangleAccess().getRectangleKeyword_1());
            		
            // InternalShapes.g:366:3: ( (lv_name_2_0= ruleEString ) )
            // InternalShapes.g:367:4: (lv_name_2_0= ruleEString )
            {
            // InternalShapes.g:367:4: (lv_name_2_0= ruleEString )
            // InternalShapes.g:368:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRectangleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectangleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"shapes.myconstructor.Shapes.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRectangleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalShapes.g:389:3: (otherlv_4= 'length' ( (lv_length_5_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalShapes.g:390:4: otherlv_4= 'length' ( (lv_length_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getRectangleAccess().getLengthKeyword_4_0());
                    			
                    // InternalShapes.g:394:4: ( (lv_length_5_0= ruleEInt ) )
                    // InternalShapes.g:395:5: (lv_length_5_0= ruleEInt )
                    {
                    // InternalShapes.g:395:5: (lv_length_5_0= ruleEInt )
                    // InternalShapes.g:396:6: lv_length_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRectangleAccess().getLengthEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_length_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangleRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_5_0,
                    							"shapes.myconstructor.Shapes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalShapes.g:414:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalShapes.g:415:4: otherlv_6= 'width' ( (lv_width_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getWidthKeyword_5_0());
                    			
                    // InternalShapes.g:419:4: ( (lv_width_7_0= ruleEInt ) )
                    // InternalShapes.g:420:5: (lv_width_7_0= ruleEInt )
                    {
                    // InternalShapes.g:420:5: (lv_width_7_0= ruleEInt )
                    // InternalShapes.g:421:6: lv_width_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRectangleAccess().getWidthEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_width_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangleRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_7_0,
                    							"shapes.myconstructor.Shapes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRectangleAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleTriangle"
    // InternalShapes.g:447:1: entryRuleTriangle returns [EObject current=null] : iv_ruleTriangle= ruleTriangle EOF ;
    public final EObject entryRuleTriangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriangle = null;


        try {
            // InternalShapes.g:447:49: (iv_ruleTriangle= ruleTriangle EOF )
            // InternalShapes.g:448:2: iv_ruleTriangle= ruleTriangle EOF
            {
             newCompositeNode(grammarAccess.getTriangleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriangle=ruleTriangle();

            state._fsp--;

             current =iv_ruleTriangle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriangle"


    // $ANTLR start "ruleTriangle"
    // InternalShapes.g:454:1: ruleTriangle returns [EObject current=null] : ( () otherlv_1= 'Triangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'a' ( (lv_a_5_0= ruleEInt ) ) )? (otherlv_6= 'b' ( (lv_b_7_0= ruleEInt ) ) )? (otherlv_8= 'c' ( (lv_c_9_0= ruleEInt ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleTriangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_a_5_0 = null;

        AntlrDatatypeRuleToken lv_b_7_0 = null;

        AntlrDatatypeRuleToken lv_c_9_0 = null;



        	enterRule();

        try {
            // InternalShapes.g:460:2: ( ( () otherlv_1= 'Triangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'a' ( (lv_a_5_0= ruleEInt ) ) )? (otherlv_6= 'b' ( (lv_b_7_0= ruleEInt ) ) )? (otherlv_8= 'c' ( (lv_c_9_0= ruleEInt ) ) )? otherlv_10= '}' ) )
            // InternalShapes.g:461:2: ( () otherlv_1= 'Triangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'a' ( (lv_a_5_0= ruleEInt ) ) )? (otherlv_6= 'b' ( (lv_b_7_0= ruleEInt ) ) )? (otherlv_8= 'c' ( (lv_c_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            {
            // InternalShapes.g:461:2: ( () otherlv_1= 'Triangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'a' ( (lv_a_5_0= ruleEInt ) ) )? (otherlv_6= 'b' ( (lv_b_7_0= ruleEInt ) ) )? (otherlv_8= 'c' ( (lv_c_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            // InternalShapes.g:462:3: () otherlv_1= 'Triangle' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'a' ( (lv_a_5_0= ruleEInt ) ) )? (otherlv_6= 'b' ( (lv_b_7_0= ruleEInt ) ) )? (otherlv_8= 'c' ( (lv_c_9_0= ruleEInt ) ) )? otherlv_10= '}'
            {
            // InternalShapes.g:462:3: ()
            // InternalShapes.g:463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriangleAccess().getTriangleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTriangleAccess().getTriangleKeyword_1());
            		
            // InternalShapes.g:473:3: ( (lv_name_2_0= ruleEString ) )
            // InternalShapes.g:474:4: (lv_name_2_0= ruleEString )
            {
            // InternalShapes.g:474:4: (lv_name_2_0= ruleEString )
            // InternalShapes.g:475:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTriangleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriangleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"shapes.myconstructor.Shapes.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getTriangleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalShapes.g:496:3: (otherlv_4= 'a' ( (lv_a_5_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalShapes.g:497:4: otherlv_4= 'a' ( (lv_a_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getTriangleAccess().getAKeyword_4_0());
                    			
                    // InternalShapes.g:501:4: ( (lv_a_5_0= ruleEInt ) )
                    // InternalShapes.g:502:5: (lv_a_5_0= ruleEInt )
                    {
                    // InternalShapes.g:502:5: (lv_a_5_0= ruleEInt )
                    // InternalShapes.g:503:6: lv_a_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTriangleAccess().getAEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_a_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriangleRule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_5_0,
                    							"shapes.myconstructor.Shapes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalShapes.g:521:3: (otherlv_6= 'b' ( (lv_b_7_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalShapes.g:522:4: otherlv_6= 'b' ( (lv_b_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getTriangleAccess().getBKeyword_5_0());
                    			
                    // InternalShapes.g:526:4: ( (lv_b_7_0= ruleEInt ) )
                    // InternalShapes.g:527:5: (lv_b_7_0= ruleEInt )
                    {
                    // InternalShapes.g:527:5: (lv_b_7_0= ruleEInt )
                    // InternalShapes.g:528:6: lv_b_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTriangleAccess().getBEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriangleRule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_7_0,
                    							"shapes.myconstructor.Shapes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalShapes.g:546:3: (otherlv_8= 'c' ( (lv_c_9_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalShapes.g:547:4: otherlv_8= 'c' ( (lv_c_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getTriangleAccess().getCKeyword_6_0());
                    			
                    // InternalShapes.g:551:4: ( (lv_c_9_0= ruleEInt ) )
                    // InternalShapes.g:552:5: (lv_c_9_0= ruleEInt )
                    {
                    // InternalShapes.g:552:5: (lv_c_9_0= ruleEInt )
                    // InternalShapes.g:553:6: lv_c_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTriangleAccess().getCEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_c_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTriangleRule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_9_0,
                    							"shapes.myconstructor.Shapes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTriangleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriangle"


    // $ANTLR start "entryRuleEInt"
    // InternalShapes.g:579:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalShapes.g:579:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalShapes.g:580:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalShapes.g:586:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalShapes.g:592:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalShapes.g:593:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalShapes.g:593:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalShapes.g:594:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalShapes.g:594:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalShapes.g:595:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000250000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001C08000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});

}