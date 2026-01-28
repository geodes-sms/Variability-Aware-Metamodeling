package diro.geodes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import diro.geodes.services.VcsFeaturesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVcsFeaturesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VCSFeatures'", "'#'", "'COMMANDS'", "','", "'HISTORY'", "'VERSIONNING'", "'COLLABORATION'", "'STYLE'", "'DATABASES'", "'Merge'", "'tool:'", "'Basic'", "'command'", "'declaration:'", "'Super'", "'Identifying'", "'label:'", "'Version'", "'history'", "'backlog:'", "'Maximum'", "'number'", "'of'", "'branches:'", "'Detail'", "'level:'", "'Working:'", "'DB'", "'@'", "'-'", "'with'", "'->'", "'Command'", "'use'", "'as'", "'DSMCompare'", "'GitDiff'", "'Add'", "'Checkout'", "'CheckoutCreate'", "'Clone'", "'Commit'", "'CherryPick'", "'CreateBranch'", "'Fetch'", "'Init'", "'Pull'", "'Push'", "'RemoteAdd'", "'Rm'", "'Log'", "'Open'", "'Unique'", "'CommitHash'", "'Label'", "'Line'", "'Semantic'", "'File'", "'Element'", "'LocalOnly'", "'Remote'", "'MongoDB'", "'XMI'", "'Neo4J'", "'SQL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVcsFeaturesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVcsFeaturesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVcsFeaturesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVcsFeatures.g"; }



     	private VcsFeaturesGrammarAccess grammarAccess;

        public InternalVcsFeaturesParser(TokenStream input, VcsFeaturesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VCSFeatures";
       	}

       	@Override
       	protected VcsFeaturesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVCSFeatures"
    // InternalVcsFeatures.g:65:1: entryRuleVCSFeatures returns [EObject current=null] : iv_ruleVCSFeatures= ruleVCSFeatures EOF ;
    public final EObject entryRuleVCSFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVCSFeatures = null;


        try {
            // InternalVcsFeatures.g:65:52: (iv_ruleVCSFeatures= ruleVCSFeatures EOF )
            // InternalVcsFeatures.g:66:2: iv_ruleVCSFeatures= ruleVCSFeatures EOF
            {
             newCompositeNode(grammarAccess.getVCSFeaturesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVCSFeatures=ruleVCSFeatures();

            state._fsp--;

             current =iv_ruleVCSFeatures; 
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
    // $ANTLR end "entryRuleVCSFeatures"


    // $ANTLR start "ruleVCSFeatures"
    // InternalVcsFeatures.g:72:1: ruleVCSFeatures returns [EObject current=null] : ( () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#' (otherlv_4= 'COMMANDS' ( (lv_commands_5_0= ruleCommands ) ) (otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) ) )* )? otherlv_8= '#' (otherlv_9= 'HISTORY' ( (lv_history_10_0= ruleHistory ) ) (otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) ) )* )? otherlv_13= '#' (otherlv_14= 'VERSIONNING' ( (lv_versionunit_15_0= ruleVersionUnit ) ) (otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) ) )* )? otherlv_18= '#' (otherlv_19= 'COLLABORATION' otherlv_20= 'STYLE' ( (lv_collaborationstyle_21_0= ruleCollaborationStyle ) ) (otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) ) )* )? otherlv_24= '#' (otherlv_25= 'DATABASES' ( (lv_database_26_0= ruleDatabase ) ) ( (lv_database_27_0= ruleDatabase ) )* )? ) ;
    public final EObject ruleVCSFeatures() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_commands_5_0 = null;

        EObject lv_commands_7_0 = null;

        EObject lv_history_10_0 = null;

        EObject lv_history_12_0 = null;

        EObject lv_versionunit_15_0 = null;

        EObject lv_versionunit_17_0 = null;

        EObject lv_collaborationstyle_21_0 = null;

        EObject lv_collaborationstyle_23_0 = null;

        EObject lv_database_26_0 = null;

        EObject lv_database_27_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:78:2: ( ( () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#' (otherlv_4= 'COMMANDS' ( (lv_commands_5_0= ruleCommands ) ) (otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) ) )* )? otherlv_8= '#' (otherlv_9= 'HISTORY' ( (lv_history_10_0= ruleHistory ) ) (otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) ) )* )? otherlv_13= '#' (otherlv_14= 'VERSIONNING' ( (lv_versionunit_15_0= ruleVersionUnit ) ) (otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) ) )* )? otherlv_18= '#' (otherlv_19= 'COLLABORATION' otherlv_20= 'STYLE' ( (lv_collaborationstyle_21_0= ruleCollaborationStyle ) ) (otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) ) )* )? otherlv_24= '#' (otherlv_25= 'DATABASES' ( (lv_database_26_0= ruleDatabase ) ) ( (lv_database_27_0= ruleDatabase ) )* )? ) )
            // InternalVcsFeatures.g:79:2: ( () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#' (otherlv_4= 'COMMANDS' ( (lv_commands_5_0= ruleCommands ) ) (otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) ) )* )? otherlv_8= '#' (otherlv_9= 'HISTORY' ( (lv_history_10_0= ruleHistory ) ) (otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) ) )* )? otherlv_13= '#' (otherlv_14= 'VERSIONNING' ( (lv_versionunit_15_0= ruleVersionUnit ) ) (otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) ) )* )? otherlv_18= '#' (otherlv_19= 'COLLABORATION' otherlv_20= 'STYLE' ( (lv_collaborationstyle_21_0= ruleCollaborationStyle ) ) (otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) ) )* )? otherlv_24= '#' (otherlv_25= 'DATABASES' ( (lv_database_26_0= ruleDatabase ) ) ( (lv_database_27_0= ruleDatabase ) )* )? )
            {
            // InternalVcsFeatures.g:79:2: ( () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#' (otherlv_4= 'COMMANDS' ( (lv_commands_5_0= ruleCommands ) ) (otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) ) )* )? otherlv_8= '#' (otherlv_9= 'HISTORY' ( (lv_history_10_0= ruleHistory ) ) (otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) ) )* )? otherlv_13= '#' (otherlv_14= 'VERSIONNING' ( (lv_versionunit_15_0= ruleVersionUnit ) ) (otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) ) )* )? otherlv_18= '#' (otherlv_19= 'COLLABORATION' otherlv_20= 'STYLE' ( (lv_collaborationstyle_21_0= ruleCollaborationStyle ) ) (otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) ) )* )? otherlv_24= '#' (otherlv_25= 'DATABASES' ( (lv_database_26_0= ruleDatabase ) ) ( (lv_database_27_0= ruleDatabase ) )* )? )
            // InternalVcsFeatures.g:80:3: () otherlv_1= 'VCSFeatures' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '#' (otherlv_4= 'COMMANDS' ( (lv_commands_5_0= ruleCommands ) ) (otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) ) )* )? otherlv_8= '#' (otherlv_9= 'HISTORY' ( (lv_history_10_0= ruleHistory ) ) (otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) ) )* )? otherlv_13= '#' (otherlv_14= 'VERSIONNING' ( (lv_versionunit_15_0= ruleVersionUnit ) ) (otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) ) )* )? otherlv_18= '#' (otherlv_19= 'COLLABORATION' otherlv_20= 'STYLE' ( (lv_collaborationstyle_21_0= ruleCollaborationStyle ) ) (otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) ) )* )? otherlv_24= '#' (otherlv_25= 'DATABASES' ( (lv_database_26_0= ruleDatabase ) ) ( (lv_database_27_0= ruleDatabase ) )* )?
            {
            // InternalVcsFeatures.g:80:3: ()
            // InternalVcsFeatures.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVCSFeaturesAccess().getVCSFeaturesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVCSFeaturesAccess().getVCSFeaturesKeyword_1());
            		
            // InternalVcsFeatures.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalVcsFeatures.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalVcsFeatures.g:92:4: (lv_name_2_0= ruleEString )
            // InternalVcsFeatures.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVCSFeaturesAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_3());
            		
            // InternalVcsFeatures.g:114:3: (otherlv_4= 'COMMANDS' ( (lv_commands_5_0= ruleCommands ) ) (otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalVcsFeatures.g:115:4: otherlv_4= 'COMMANDS' ( (lv_commands_5_0= ruleCommands ) ) (otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getVCSFeaturesAccess().getCOMMANDSKeyword_4_0());
                    			
                    // InternalVcsFeatures.g:119:4: ( (lv_commands_5_0= ruleCommands ) )
                    // InternalVcsFeatures.g:120:5: (lv_commands_5_0= ruleCommands )
                    {
                    // InternalVcsFeatures.g:120:5: (lv_commands_5_0= ruleCommands )
                    // InternalVcsFeatures.g:121:6: lv_commands_5_0= ruleCommands
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getCommandsCommandsParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_commands_5_0=ruleCommands();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"commands",
                    							lv_commands_5_0,
                    							"diro.geodes.VcsFeatures.Commands");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:138:4: (otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:139:5: otherlv_6= ',' ( (lv_commands_7_0= ruleCommands ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalVcsFeatures.g:143:5: ( (lv_commands_7_0= ruleCommands ) )
                    	    // InternalVcsFeatures.g:144:6: (lv_commands_7_0= ruleCommands )
                    	    {
                    	    // InternalVcsFeatures.g:144:6: (lv_commands_7_0= ruleCommands )
                    	    // InternalVcsFeatures.g:145:7: lv_commands_7_0= ruleCommands
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getCommandsCommandsParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_commands_7_0=ruleCommands();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"commands",
                    	    								lv_commands_7_0,
                    	    								"diro.geodes.VcsFeatures.Commands");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_5());
            		
            // InternalVcsFeatures.g:168:3: (otherlv_9= 'HISTORY' ( (lv_history_10_0= ruleHistory ) ) (otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVcsFeatures.g:169:4: otherlv_9= 'HISTORY' ( (lv_history_10_0= ruleHistory ) ) (otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) ) )*
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getVCSFeaturesAccess().getHISTORYKeyword_6_0());
                    			
                    // InternalVcsFeatures.g:173:4: ( (lv_history_10_0= ruleHistory ) )
                    // InternalVcsFeatures.g:174:5: (lv_history_10_0= ruleHistory )
                    {
                    // InternalVcsFeatures.g:174:5: (lv_history_10_0= ruleHistory )
                    // InternalVcsFeatures.g:175:6: lv_history_10_0= ruleHistory
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getHistoryHistoryParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_history_10_0=ruleHistory();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"history",
                    							lv_history_10_0,
                    							"diro.geodes.VcsFeatures.History");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:192:4: (otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:193:5: otherlv_11= ',' ( (lv_history_12_0= ruleHistory ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalVcsFeatures.g:197:5: ( (lv_history_12_0= ruleHistory ) )
                    	    // InternalVcsFeatures.g:198:6: (lv_history_12_0= ruleHistory )
                    	    {
                    	    // InternalVcsFeatures.g:198:6: (lv_history_12_0= ruleHistory )
                    	    // InternalVcsFeatures.g:199:7: lv_history_12_0= ruleHistory
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getHistoryHistoryParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_history_12_0=ruleHistory();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"history",
                    	    								lv_history_12_0,
                    	    								"diro.geodes.VcsFeatures.History");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_7());
            		
            // InternalVcsFeatures.g:222:3: (otherlv_14= 'VERSIONNING' ( (lv_versionunit_15_0= ruleVersionUnit ) ) (otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVcsFeatures.g:223:4: otherlv_14= 'VERSIONNING' ( (lv_versionunit_15_0= ruleVersionUnit ) ) (otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) ) )*
                    {
                    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getVCSFeaturesAccess().getVERSIONNINGKeyword_8_0());
                    			
                    // InternalVcsFeatures.g:227:4: ( (lv_versionunit_15_0= ruleVersionUnit ) )
                    // InternalVcsFeatures.g:228:5: (lv_versionunit_15_0= ruleVersionUnit )
                    {
                    // InternalVcsFeatures.g:228:5: (lv_versionunit_15_0= ruleVersionUnit )
                    // InternalVcsFeatures.g:229:6: lv_versionunit_15_0= ruleVersionUnit
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getVersionunitVersionUnitParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_versionunit_15_0=ruleVersionUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"versionunit",
                    							lv_versionunit_15_0,
                    							"diro.geodes.VcsFeatures.VersionUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:246:4: (otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:247:5: otherlv_16= ',' ( (lv_versionunit_17_0= ruleVersionUnit ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalVcsFeatures.g:251:5: ( (lv_versionunit_17_0= ruleVersionUnit ) )
                    	    // InternalVcsFeatures.g:252:6: (lv_versionunit_17_0= ruleVersionUnit )
                    	    {
                    	    // InternalVcsFeatures.g:252:6: (lv_versionunit_17_0= ruleVersionUnit )
                    	    // InternalVcsFeatures.g:253:7: lv_versionunit_17_0= ruleVersionUnit
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getVersionunitVersionUnitParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_versionunit_17_0=ruleVersionUnit();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"versionunit",
                    	    								lv_versionunit_17_0,
                    	    								"diro.geodes.VcsFeatures.VersionUnit");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_18, grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_9());
            		
            // InternalVcsFeatures.g:276:3: (otherlv_19= 'COLLABORATION' otherlv_20= 'STYLE' ( (lv_collaborationstyle_21_0= ruleCollaborationStyle ) ) (otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVcsFeatures.g:277:4: otherlv_19= 'COLLABORATION' otherlv_20= 'STYLE' ( (lv_collaborationstyle_21_0= ruleCollaborationStyle ) ) (otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) ) )*
                    {
                    otherlv_19=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getVCSFeaturesAccess().getCOLLABORATIONKeyword_10_0());
                    			
                    otherlv_20=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getVCSFeaturesAccess().getSTYLEKeyword_10_1());
                    			
                    // InternalVcsFeatures.g:285:4: ( (lv_collaborationstyle_21_0= ruleCollaborationStyle ) )
                    // InternalVcsFeatures.g:286:5: (lv_collaborationstyle_21_0= ruleCollaborationStyle )
                    {
                    // InternalVcsFeatures.g:286:5: (lv_collaborationstyle_21_0= ruleCollaborationStyle )
                    // InternalVcsFeatures.g:287:6: lv_collaborationstyle_21_0= ruleCollaborationStyle
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleCollaborationStyleParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_collaborationstyle_21_0=ruleCollaborationStyle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"collaborationstyle",
                    							lv_collaborationstyle_21_0,
                    							"diro.geodes.VcsFeatures.CollaborationStyle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:304:4: (otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:305:5: otherlv_22= ',' ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getVCSFeaturesAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalVcsFeatures.g:309:5: ( (lv_collaborationstyle_23_0= ruleCollaborationStyle ) )
                    	    // InternalVcsFeatures.g:310:6: (lv_collaborationstyle_23_0= ruleCollaborationStyle )
                    	    {
                    	    // InternalVcsFeatures.g:310:6: (lv_collaborationstyle_23_0= ruleCollaborationStyle )
                    	    // InternalVcsFeatures.g:311:7: lv_collaborationstyle_23_0= ruleCollaborationStyle
                    	    {

                    	    							newCompositeNode(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleCollaborationStyleParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_collaborationstyle_23_0=ruleCollaborationStyle();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"collaborationstyle",
                    	    								lv_collaborationstyle_23_0,
                    	    								"diro.geodes.VcsFeatures.CollaborationStyle");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_24=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_24, grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_11());
            		
            // InternalVcsFeatures.g:334:3: (otherlv_25= 'DATABASES' ( (lv_database_26_0= ruleDatabase ) ) ( (lv_database_27_0= ruleDatabase ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVcsFeatures.g:335:4: otherlv_25= 'DATABASES' ( (lv_database_26_0= ruleDatabase ) ) ( (lv_database_27_0= ruleDatabase ) )*
                    {
                    otherlv_25=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getVCSFeaturesAccess().getDATABASESKeyword_12_0());
                    			
                    // InternalVcsFeatures.g:339:4: ( (lv_database_26_0= ruleDatabase ) )
                    // InternalVcsFeatures.g:340:5: (lv_database_26_0= ruleDatabase )
                    {
                    // InternalVcsFeatures.g:340:5: (lv_database_26_0= ruleDatabase )
                    // InternalVcsFeatures.g:341:6: lv_database_26_0= ruleDatabase
                    {

                    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getDatabaseDatabaseParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_database_26_0=ruleDatabase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    						}
                    						add(
                    							current,
                    							"database",
                    							lv_database_26_0,
                    							"diro.geodes.VcsFeatures.Database");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:358:4: ( (lv_database_27_0= ruleDatabase ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==38) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:359:5: (lv_database_27_0= ruleDatabase )
                    	    {
                    	    // InternalVcsFeatures.g:359:5: (lv_database_27_0= ruleDatabase )
                    	    // InternalVcsFeatures.g:360:6: lv_database_27_0= ruleDatabase
                    	    {

                    	    						newCompositeNode(grammarAccess.getVCSFeaturesAccess().getDatabaseDatabaseParserRuleCall_12_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_database_27_0=ruleDatabase();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVCSFeaturesRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"database",
                    	    							lv_database_27_0,
                    	    							"diro.geodes.VcsFeatures.Database");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleVCSFeatures"


    // $ANTLR start "entryRuleCommands"
    // InternalVcsFeatures.g:382:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalVcsFeatures.g:382:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalVcsFeatures.g:383:2: iv_ruleCommands= ruleCommands EOF
            {
             newCompositeNode(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;

             current =iv_ruleCommands; 
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
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalVcsFeatures.g:389:1: ruleCommands returns [EObject current=null] : ( () (otherlv_1= 'Merge' otherlv_2= 'tool:' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? (otherlv_4= 'Basic' otherlv_5= 'command' otherlv_6= 'declaration:' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) ( (lv_lowlevelcommand_8_0= ruleLowLevelCommand ) )* )? (otherlv_9= 'Super' otherlv_10= 'command' otherlv_11= 'declaration:' ( (lv_highlevelcommand_12_0= ruleHighLevelCommand ) ) ( (lv_highlevelcommand_13_0= ruleHighLevelCommand ) )* )? ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_mergeStrategy_3_0 = null;

        EObject lv_lowlevelcommand_7_0 = null;

        EObject lv_lowlevelcommand_8_0 = null;

        EObject lv_highlevelcommand_12_0 = null;

        EObject lv_highlevelcommand_13_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:395:2: ( ( () (otherlv_1= 'Merge' otherlv_2= 'tool:' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? (otherlv_4= 'Basic' otherlv_5= 'command' otherlv_6= 'declaration:' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) ( (lv_lowlevelcommand_8_0= ruleLowLevelCommand ) )* )? (otherlv_9= 'Super' otherlv_10= 'command' otherlv_11= 'declaration:' ( (lv_highlevelcommand_12_0= ruleHighLevelCommand ) ) ( (lv_highlevelcommand_13_0= ruleHighLevelCommand ) )* )? ) )
            // InternalVcsFeatures.g:396:2: ( () (otherlv_1= 'Merge' otherlv_2= 'tool:' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? (otherlv_4= 'Basic' otherlv_5= 'command' otherlv_6= 'declaration:' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) ( (lv_lowlevelcommand_8_0= ruleLowLevelCommand ) )* )? (otherlv_9= 'Super' otherlv_10= 'command' otherlv_11= 'declaration:' ( (lv_highlevelcommand_12_0= ruleHighLevelCommand ) ) ( (lv_highlevelcommand_13_0= ruleHighLevelCommand ) )* )? )
            {
            // InternalVcsFeatures.g:396:2: ( () (otherlv_1= 'Merge' otherlv_2= 'tool:' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? (otherlv_4= 'Basic' otherlv_5= 'command' otherlv_6= 'declaration:' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) ( (lv_lowlevelcommand_8_0= ruleLowLevelCommand ) )* )? (otherlv_9= 'Super' otherlv_10= 'command' otherlv_11= 'declaration:' ( (lv_highlevelcommand_12_0= ruleHighLevelCommand ) ) ( (lv_highlevelcommand_13_0= ruleHighLevelCommand ) )* )? )
            // InternalVcsFeatures.g:397:3: () (otherlv_1= 'Merge' otherlv_2= 'tool:' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )? (otherlv_4= 'Basic' otherlv_5= 'command' otherlv_6= 'declaration:' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) ( (lv_lowlevelcommand_8_0= ruleLowLevelCommand ) )* )? (otherlv_9= 'Super' otherlv_10= 'command' otherlv_11= 'declaration:' ( (lv_highlevelcommand_12_0= ruleHighLevelCommand ) ) ( (lv_highlevelcommand_13_0= ruleHighLevelCommand ) )* )?
            {
            // InternalVcsFeatures.g:397:3: ()
            // InternalVcsFeatures.g:398:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandsAccess().getCommandsAction_0(),
            					current);
            			

            }

            // InternalVcsFeatures.g:404:3: (otherlv_1= 'Merge' otherlv_2= 'tool:' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVcsFeatures.g:405:4: otherlv_1= 'Merge' otherlv_2= 'tool:' ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getMergeKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getCommandsAccess().getToolKeyword_1_1());
                    			
                    // InternalVcsFeatures.g:413:4: ( (lv_mergeStrategy_3_0= ruleMergeStrategy ) )
                    // InternalVcsFeatures.g:414:5: (lv_mergeStrategy_3_0= ruleMergeStrategy )
                    {
                    // InternalVcsFeatures.g:414:5: (lv_mergeStrategy_3_0= ruleMergeStrategy )
                    // InternalVcsFeatures.g:415:6: lv_mergeStrategy_3_0= ruleMergeStrategy
                    {

                    						newCompositeNode(grammarAccess.getCommandsAccess().getMergeStrategyMergeStrategyEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_mergeStrategy_3_0=ruleMergeStrategy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    						}
                    						set(
                    							current,
                    							"mergeStrategy",
                    							lv_mergeStrategy_3_0,
                    							"diro.geodes.VcsFeatures.MergeStrategy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVcsFeatures.g:433:3: (otherlv_4= 'Basic' otherlv_5= 'command' otherlv_6= 'declaration:' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) ( (lv_lowlevelcommand_8_0= ruleLowLevelCommand ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVcsFeatures.g:434:4: otherlv_4= 'Basic' otherlv_5= 'command' otherlv_6= 'declaration:' ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) ) ( (lv_lowlevelcommand_8_0= ruleLowLevelCommand ) )*
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommandsAccess().getBasicKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommandsAccess().getCommandKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommandsAccess().getDeclarationKeyword_2_2());
                    			
                    // InternalVcsFeatures.g:446:4: ( (lv_lowlevelcommand_7_0= ruleLowLevelCommand ) )
                    // InternalVcsFeatures.g:447:5: (lv_lowlevelcommand_7_0= ruleLowLevelCommand )
                    {
                    // InternalVcsFeatures.g:447:5: (lv_lowlevelcommand_7_0= ruleLowLevelCommand )
                    // InternalVcsFeatures.g:448:6: lv_lowlevelcommand_7_0= ruleLowLevelCommand
                    {

                    						newCompositeNode(grammarAccess.getCommandsAccess().getLowlevelcommandLowLevelCommandParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_lowlevelcommand_7_0=ruleLowLevelCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    						}
                    						add(
                    							current,
                    							"lowlevelcommand",
                    							lv_lowlevelcommand_7_0,
                    							"diro.geodes.VcsFeatures.LowLevelCommand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:465:4: ( (lv_lowlevelcommand_8_0= ruleLowLevelCommand ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==40) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:466:5: (lv_lowlevelcommand_8_0= ruleLowLevelCommand )
                    	    {
                    	    // InternalVcsFeatures.g:466:5: (lv_lowlevelcommand_8_0= ruleLowLevelCommand )
                    	    // InternalVcsFeatures.g:467:6: lv_lowlevelcommand_8_0= ruleLowLevelCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandsAccess().getLowlevelcommandLowLevelCommandParserRuleCall_2_4_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
                    	    lv_lowlevelcommand_8_0=ruleLowLevelCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"lowlevelcommand",
                    	    							lv_lowlevelcommand_8_0,
                    	    							"diro.geodes.VcsFeatures.LowLevelCommand");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVcsFeatures.g:485:3: (otherlv_9= 'Super' otherlv_10= 'command' otherlv_11= 'declaration:' ( (lv_highlevelcommand_12_0= ruleHighLevelCommand ) ) ( (lv_highlevelcommand_13_0= ruleHighLevelCommand ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVcsFeatures.g:486:4: otherlv_9= 'Super' otherlv_10= 'command' otherlv_11= 'declaration:' ( (lv_highlevelcommand_12_0= ruleHighLevelCommand ) ) ( (lv_highlevelcommand_13_0= ruleHighLevelCommand ) )*
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommandsAccess().getSuperKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getCommandsAccess().getCommandKeyword_3_1());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getCommandsAccess().getDeclarationKeyword_3_2());
                    			
                    // InternalVcsFeatures.g:498:4: ( (lv_highlevelcommand_12_0= ruleHighLevelCommand ) )
                    // InternalVcsFeatures.g:499:5: (lv_highlevelcommand_12_0= ruleHighLevelCommand )
                    {
                    // InternalVcsFeatures.g:499:5: (lv_highlevelcommand_12_0= ruleHighLevelCommand )
                    // InternalVcsFeatures.g:500:6: lv_highlevelcommand_12_0= ruleHighLevelCommand
                    {

                    						newCompositeNode(grammarAccess.getCommandsAccess().getHighlevelcommandHighLevelCommandParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_highlevelcommand_12_0=ruleHighLevelCommand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    						}
                    						add(
                    							current,
                    							"highlevelcommand",
                    							lv_highlevelcommand_12_0,
                    							"diro.geodes.VcsFeatures.HighLevelCommand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:517:4: ( (lv_highlevelcommand_13_0= ruleHighLevelCommand ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==40) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:518:5: (lv_highlevelcommand_13_0= ruleHighLevelCommand )
                    	    {
                    	    // InternalVcsFeatures.g:518:5: (lv_highlevelcommand_13_0= ruleHighLevelCommand )
                    	    // InternalVcsFeatures.g:519:6: lv_highlevelcommand_13_0= ruleHighLevelCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getCommandsAccess().getHighlevelcommandHighLevelCommandParserRuleCall_3_4_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_highlevelcommand_13_0=ruleHighLevelCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCommandsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"highlevelcommand",
                    	    							lv_highlevelcommand_13_0,
                    	    							"diro.geodes.VcsFeatures.HighLevelCommand");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleHistory"
    // InternalVcsFeatures.g:541:1: entryRuleHistory returns [EObject current=null] : iv_ruleHistory= ruleHistory EOF ;
    public final EObject entryRuleHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistory = null;


        try {
            // InternalVcsFeatures.g:541:48: (iv_ruleHistory= ruleHistory EOF )
            // InternalVcsFeatures.g:542:2: iv_ruleHistory= ruleHistory EOF
            {
             newCompositeNode(grammarAccess.getHistoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHistory=ruleHistory();

            state._fsp--;

             current =iv_ruleHistory; 
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
    // $ANTLR end "entryRuleHistory"


    // $ANTLR start "ruleHistory"
    // InternalVcsFeatures.g:548:1: ruleHistory returns [EObject current=null] : ( () (otherlv_1= 'Identifying' otherlv_2= 'label:' ( (lv_labelType_3_0= ruleLabelType ) ) )? (otherlv_4= 'Version' otherlv_5= 'history' otherlv_6= 'backlog:' ( (lv_commitHistoryRange_7_0= ruleEInt ) ) )? (otherlv_8= 'Maximum' otherlv_9= 'number' otherlv_10= 'of' otherlv_11= 'branches:' ( (lv_numberOfBranches_12_0= ruleEInt ) ) )? ) ;
    public final EObject ruleHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_labelType_3_0 = null;

        AntlrDatatypeRuleToken lv_commitHistoryRange_7_0 = null;

        AntlrDatatypeRuleToken lv_numberOfBranches_12_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:554:2: ( ( () (otherlv_1= 'Identifying' otherlv_2= 'label:' ( (lv_labelType_3_0= ruleLabelType ) ) )? (otherlv_4= 'Version' otherlv_5= 'history' otherlv_6= 'backlog:' ( (lv_commitHistoryRange_7_0= ruleEInt ) ) )? (otherlv_8= 'Maximum' otherlv_9= 'number' otherlv_10= 'of' otherlv_11= 'branches:' ( (lv_numberOfBranches_12_0= ruleEInt ) ) )? ) )
            // InternalVcsFeatures.g:555:2: ( () (otherlv_1= 'Identifying' otherlv_2= 'label:' ( (lv_labelType_3_0= ruleLabelType ) ) )? (otherlv_4= 'Version' otherlv_5= 'history' otherlv_6= 'backlog:' ( (lv_commitHistoryRange_7_0= ruleEInt ) ) )? (otherlv_8= 'Maximum' otherlv_9= 'number' otherlv_10= 'of' otherlv_11= 'branches:' ( (lv_numberOfBranches_12_0= ruleEInt ) ) )? )
            {
            // InternalVcsFeatures.g:555:2: ( () (otherlv_1= 'Identifying' otherlv_2= 'label:' ( (lv_labelType_3_0= ruleLabelType ) ) )? (otherlv_4= 'Version' otherlv_5= 'history' otherlv_6= 'backlog:' ( (lv_commitHistoryRange_7_0= ruleEInt ) ) )? (otherlv_8= 'Maximum' otherlv_9= 'number' otherlv_10= 'of' otherlv_11= 'branches:' ( (lv_numberOfBranches_12_0= ruleEInt ) ) )? )
            // InternalVcsFeatures.g:556:3: () (otherlv_1= 'Identifying' otherlv_2= 'label:' ( (lv_labelType_3_0= ruleLabelType ) ) )? (otherlv_4= 'Version' otherlv_5= 'history' otherlv_6= 'backlog:' ( (lv_commitHistoryRange_7_0= ruleEInt ) ) )? (otherlv_8= 'Maximum' otherlv_9= 'number' otherlv_10= 'of' otherlv_11= 'branches:' ( (lv_numberOfBranches_12_0= ruleEInt ) ) )?
            {
            // InternalVcsFeatures.g:556:3: ()
            // InternalVcsFeatures.g:557:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHistoryAccess().getHistoryAction_0(),
            					current);
            			

            }

            // InternalVcsFeatures.g:563:3: (otherlv_1= 'Identifying' otherlv_2= 'label:' ( (lv_labelType_3_0= ruleLabelType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVcsFeatures.g:564:4: otherlv_1= 'Identifying' otherlv_2= 'label:' ( (lv_labelType_3_0= ruleLabelType ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getHistoryAccess().getIdentifyingKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getHistoryAccess().getLabelKeyword_1_1());
                    			
                    // InternalVcsFeatures.g:572:4: ( (lv_labelType_3_0= ruleLabelType ) )
                    // InternalVcsFeatures.g:573:5: (lv_labelType_3_0= ruleLabelType )
                    {
                    // InternalVcsFeatures.g:573:5: (lv_labelType_3_0= ruleLabelType )
                    // InternalVcsFeatures.g:574:6: lv_labelType_3_0= ruleLabelType
                    {

                    						newCompositeNode(grammarAccess.getHistoryAccess().getLabelTypeLabelTypeEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_labelType_3_0=ruleLabelType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHistoryRule());
                    						}
                    						set(
                    							current,
                    							"labelType",
                    							lv_labelType_3_0,
                    							"diro.geodes.VcsFeatures.LabelType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVcsFeatures.g:592:3: (otherlv_4= 'Version' otherlv_5= 'history' otherlv_6= 'backlog:' ( (lv_commitHistoryRange_7_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVcsFeatures.g:593:4: otherlv_4= 'Version' otherlv_5= 'history' otherlv_6= 'backlog:' ( (lv_commitHistoryRange_7_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getHistoryAccess().getVersionKeyword_2_0());
                    			
                    otherlv_5=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getHistoryAccess().getHistoryKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getHistoryAccess().getBacklogKeyword_2_2());
                    			
                    // InternalVcsFeatures.g:605:4: ( (lv_commitHistoryRange_7_0= ruleEInt ) )
                    // InternalVcsFeatures.g:606:5: (lv_commitHistoryRange_7_0= ruleEInt )
                    {
                    // InternalVcsFeatures.g:606:5: (lv_commitHistoryRange_7_0= ruleEInt )
                    // InternalVcsFeatures.g:607:6: lv_commitHistoryRange_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getHistoryAccess().getCommitHistoryRangeEIntParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_commitHistoryRange_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHistoryRule());
                    						}
                    						set(
                    							current,
                    							"commitHistoryRange",
                    							lv_commitHistoryRange_7_0,
                    							"diro.geodes.VcsFeatures.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVcsFeatures.g:625:3: (otherlv_8= 'Maximum' otherlv_9= 'number' otherlv_10= 'of' otherlv_11= 'branches:' ( (lv_numberOfBranches_12_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVcsFeatures.g:626:4: otherlv_8= 'Maximum' otherlv_9= 'number' otherlv_10= 'of' otherlv_11= 'branches:' ( (lv_numberOfBranches_12_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getHistoryAccess().getMaximumKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,32,FOLLOW_34); 

                    				newLeafNode(otherlv_9, grammarAccess.getHistoryAccess().getNumberKeyword_3_1());
                    			
                    otherlv_10=(Token)match(input,33,FOLLOW_35); 

                    				newLeafNode(otherlv_10, grammarAccess.getHistoryAccess().getOfKeyword_3_2());
                    			
                    otherlv_11=(Token)match(input,34,FOLLOW_31); 

                    				newLeafNode(otherlv_11, grammarAccess.getHistoryAccess().getBranchesKeyword_3_3());
                    			
                    // InternalVcsFeatures.g:642:4: ( (lv_numberOfBranches_12_0= ruleEInt ) )
                    // InternalVcsFeatures.g:643:5: (lv_numberOfBranches_12_0= ruleEInt )
                    {
                    // InternalVcsFeatures.g:643:5: (lv_numberOfBranches_12_0= ruleEInt )
                    // InternalVcsFeatures.g:644:6: lv_numberOfBranches_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getHistoryAccess().getNumberOfBranchesEIntParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_numberOfBranches_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHistoryRule());
                    						}
                    						set(
                    							current,
                    							"numberOfBranches",
                    							lv_numberOfBranches_12_0,
                    							"diro.geodes.VcsFeatures.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleHistory"


    // $ANTLR start "entryRuleVersionUnit"
    // InternalVcsFeatures.g:666:1: entryRuleVersionUnit returns [EObject current=null] : iv_ruleVersionUnit= ruleVersionUnit EOF ;
    public final EObject entryRuleVersionUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionUnit = null;


        try {
            // InternalVcsFeatures.g:666:52: (iv_ruleVersionUnit= ruleVersionUnit EOF )
            // InternalVcsFeatures.g:667:2: iv_ruleVersionUnit= ruleVersionUnit EOF
            {
             newCompositeNode(grammarAccess.getVersionUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersionUnit=ruleVersionUnit();

            state._fsp--;

             current =iv_ruleVersionUnit; 
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
    // $ANTLR end "entryRuleVersionUnit"


    // $ANTLR start "ruleVersionUnit"
    // InternalVcsFeatures.g:673:1: ruleVersionUnit returns [EObject current=null] : ( () otherlv_1= 'Detail' otherlv_2= 'level:' ( ( (lv_granularity_3_0= ruleVersionUnitType ) ) ( (lv_granularity_4_0= ruleVersionUnitType ) )* )? ) ;
    public final EObject ruleVersionUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_granularity_3_0 = null;

        Enumerator lv_granularity_4_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:679:2: ( ( () otherlv_1= 'Detail' otherlv_2= 'level:' ( ( (lv_granularity_3_0= ruleVersionUnitType ) ) ( (lv_granularity_4_0= ruleVersionUnitType ) )* )? ) )
            // InternalVcsFeatures.g:680:2: ( () otherlv_1= 'Detail' otherlv_2= 'level:' ( ( (lv_granularity_3_0= ruleVersionUnitType ) ) ( (lv_granularity_4_0= ruleVersionUnitType ) )* )? )
            {
            // InternalVcsFeatures.g:680:2: ( () otherlv_1= 'Detail' otherlv_2= 'level:' ( ( (lv_granularity_3_0= ruleVersionUnitType ) ) ( (lv_granularity_4_0= ruleVersionUnitType ) )* )? )
            // InternalVcsFeatures.g:681:3: () otherlv_1= 'Detail' otherlv_2= 'level:' ( ( (lv_granularity_3_0= ruleVersionUnitType ) ) ( (lv_granularity_4_0= ruleVersionUnitType ) )* )?
            {
            // InternalVcsFeatures.g:681:3: ()
            // InternalVcsFeatures.g:682:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersionUnitAccess().getVersionUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionUnitAccess().getDetailKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getVersionUnitAccess().getLevelKeyword_2());
            		
            // InternalVcsFeatures.g:696:3: ( ( (lv_granularity_3_0= ruleVersionUnitType ) ) ( (lv_granularity_4_0= ruleVersionUnitType ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=66 && LA20_0<=69)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVcsFeatures.g:697:4: ( (lv_granularity_3_0= ruleVersionUnitType ) ) ( (lv_granularity_4_0= ruleVersionUnitType ) )*
                    {
                    // InternalVcsFeatures.g:697:4: ( (lv_granularity_3_0= ruleVersionUnitType ) )
                    // InternalVcsFeatures.g:698:5: (lv_granularity_3_0= ruleVersionUnitType )
                    {
                    // InternalVcsFeatures.g:698:5: (lv_granularity_3_0= ruleVersionUnitType )
                    // InternalVcsFeatures.g:699:6: lv_granularity_3_0= ruleVersionUnitType
                    {

                    						newCompositeNode(grammarAccess.getVersionUnitAccess().getGranularityVersionUnitTypeEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_granularity_3_0=ruleVersionUnitType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVersionUnitRule());
                    						}
                    						add(
                    							current,
                    							"granularity",
                    							lv_granularity_3_0,
                    							"diro.geodes.VcsFeatures.VersionUnitType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:716:4: ( (lv_granularity_4_0= ruleVersionUnitType ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=66 && LA19_0<=69)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:717:5: (lv_granularity_4_0= ruleVersionUnitType )
                    	    {
                    	    // InternalVcsFeatures.g:717:5: (lv_granularity_4_0= ruleVersionUnitType )
                    	    // InternalVcsFeatures.g:718:6: lv_granularity_4_0= ruleVersionUnitType
                    	    {

                    	    						newCompositeNode(grammarAccess.getVersionUnitAccess().getGranularityVersionUnitTypeEnumRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
                    	    lv_granularity_4_0=ruleVersionUnitType();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVersionUnitRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"granularity",
                    	    							lv_granularity_4_0,
                    	    							"diro.geodes.VcsFeatures.VersionUnitType");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleVersionUnit"


    // $ANTLR start "entryRuleCollaborationStyle"
    // InternalVcsFeatures.g:740:1: entryRuleCollaborationStyle returns [EObject current=null] : iv_ruleCollaborationStyle= ruleCollaborationStyle EOF ;
    public final EObject entryRuleCollaborationStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollaborationStyle = null;


        try {
            // InternalVcsFeatures.g:740:59: (iv_ruleCollaborationStyle= ruleCollaborationStyle EOF )
            // InternalVcsFeatures.g:741:2: iv_ruleCollaborationStyle= ruleCollaborationStyle EOF
            {
             newCompositeNode(grammarAccess.getCollaborationStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollaborationStyle=ruleCollaborationStyle();

            state._fsp--;

             current =iv_ruleCollaborationStyle; 
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
    // $ANTLR end "entryRuleCollaborationStyle"


    // $ANTLR start "ruleCollaborationStyle"
    // InternalVcsFeatures.g:747:1: ruleCollaborationStyle returns [EObject current=null] : ( () otherlv_1= 'Working:' ( (lv_collabStyle_2_0= ruleCollaborationStyleType ) ) ) ;
    public final EObject ruleCollaborationStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_collabStyle_2_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:753:2: ( ( () otherlv_1= 'Working:' ( (lv_collabStyle_2_0= ruleCollaborationStyleType ) ) ) )
            // InternalVcsFeatures.g:754:2: ( () otherlv_1= 'Working:' ( (lv_collabStyle_2_0= ruleCollaborationStyleType ) ) )
            {
            // InternalVcsFeatures.g:754:2: ( () otherlv_1= 'Working:' ( (lv_collabStyle_2_0= ruleCollaborationStyleType ) ) )
            // InternalVcsFeatures.g:755:3: () otherlv_1= 'Working:' ( (lv_collabStyle_2_0= ruleCollaborationStyleType ) )
            {
            // InternalVcsFeatures.g:755:3: ()
            // InternalVcsFeatures.g:756:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollaborationStyleAccess().getCollaborationStyleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getCollaborationStyleAccess().getWorkingKeyword_1());
            		
            // InternalVcsFeatures.g:766:3: ( (lv_collabStyle_2_0= ruleCollaborationStyleType ) )
            // InternalVcsFeatures.g:767:4: (lv_collabStyle_2_0= ruleCollaborationStyleType )
            {
            // InternalVcsFeatures.g:767:4: (lv_collabStyle_2_0= ruleCollaborationStyleType )
            // InternalVcsFeatures.g:768:5: lv_collabStyle_2_0= ruleCollaborationStyleType
            {

            					newCompositeNode(grammarAccess.getCollaborationStyleAccess().getCollabStyleCollaborationStyleTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_collabStyle_2_0=ruleCollaborationStyleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollaborationStyleRule());
            					}
            					set(
            						current,
            						"collabStyle",
            						lv_collabStyle_2_0,
            						"diro.geodes.VcsFeatures.CollaborationStyleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleCollaborationStyle"


    // $ANTLR start "entryRuleDatabase"
    // InternalVcsFeatures.g:789:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalVcsFeatures.g:789:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalVcsFeatures.g:790:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalVcsFeatures.g:796:1: ruleDatabase returns [EObject current=null] : ( () otherlv_1= 'DB' ( (lv_name_2_0= ruleEString ) ) ( (lv_DatabaseType_3_0= ruleDatabaseType ) ) otherlv_4= '@' ( (lv_connectionString_5_0= ruleEString ) ) ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_DatabaseType_3_0 = null;

        AntlrDatatypeRuleToken lv_connectionString_5_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:802:2: ( ( () otherlv_1= 'DB' ( (lv_name_2_0= ruleEString ) ) ( (lv_DatabaseType_3_0= ruleDatabaseType ) ) otherlv_4= '@' ( (lv_connectionString_5_0= ruleEString ) ) ) )
            // InternalVcsFeatures.g:803:2: ( () otherlv_1= 'DB' ( (lv_name_2_0= ruleEString ) ) ( (lv_DatabaseType_3_0= ruleDatabaseType ) ) otherlv_4= '@' ( (lv_connectionString_5_0= ruleEString ) ) )
            {
            // InternalVcsFeatures.g:803:2: ( () otherlv_1= 'DB' ( (lv_name_2_0= ruleEString ) ) ( (lv_DatabaseType_3_0= ruleDatabaseType ) ) otherlv_4= '@' ( (lv_connectionString_5_0= ruleEString ) ) )
            // InternalVcsFeatures.g:804:3: () otherlv_1= 'DB' ( (lv_name_2_0= ruleEString ) ) ( (lv_DatabaseType_3_0= ruleDatabaseType ) ) otherlv_4= '@' ( (lv_connectionString_5_0= ruleEString ) )
            {
            // InternalVcsFeatures.g:804:3: ()
            // InternalVcsFeatures.g:805:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatabaseAccess().getDatabaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseAccess().getDBKeyword_1());
            		
            // InternalVcsFeatures.g:815:3: ( (lv_name_2_0= ruleEString ) )
            // InternalVcsFeatures.g:816:4: (lv_name_2_0= ruleEString )
            {
            // InternalVcsFeatures.g:816:4: (lv_name_2_0= ruleEString )
            // InternalVcsFeatures.g:817:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVcsFeatures.g:834:3: ( (lv_DatabaseType_3_0= ruleDatabaseType ) )
            // InternalVcsFeatures.g:835:4: (lv_DatabaseType_3_0= ruleDatabaseType )
            {
            // InternalVcsFeatures.g:835:4: (lv_DatabaseType_3_0= ruleDatabaseType )
            // InternalVcsFeatures.g:836:5: lv_DatabaseType_3_0= ruleDatabaseType
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getDatabaseTypeDatabaseTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_DatabaseType_3_0=ruleDatabaseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"DatabaseType",
            						lv_DatabaseType_3_0,
            						"diro.geodes.VcsFeatures.DatabaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getCommercialAtKeyword_4());
            		
            // InternalVcsFeatures.g:857:3: ( (lv_connectionString_5_0= ruleEString ) )
            // InternalVcsFeatures.g:858:4: (lv_connectionString_5_0= ruleEString )
            {
            // InternalVcsFeatures.g:858:4: (lv_connectionString_5_0= ruleEString )
            // InternalVcsFeatures.g:859:5: lv_connectionString_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getConnectionStringEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_connectionString_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"connectionString",
            						lv_connectionString_5_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleEString"
    // InternalVcsFeatures.g:880:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVcsFeatures.g:880:47: (iv_ruleEString= ruleEString EOF )
            // InternalVcsFeatures.g:881:2: iv_ruleEString= ruleEString EOF
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
    // InternalVcsFeatures.g:887:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:893:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVcsFeatures.g:894:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVcsFeatures.g:894:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalVcsFeatures.g:895:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:903:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleHighLevelCommand"
    // InternalVcsFeatures.g:914:1: entryRuleHighLevelCommand returns [EObject current=null] : iv_ruleHighLevelCommand= ruleHighLevelCommand EOF ;
    public final EObject entryRuleHighLevelCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighLevelCommand = null;


        try {
            // InternalVcsFeatures.g:914:57: (iv_ruleHighLevelCommand= ruleHighLevelCommand EOF )
            // InternalVcsFeatures.g:915:2: iv_ruleHighLevelCommand= ruleHighLevelCommand EOF
            {
             newCompositeNode(grammarAccess.getHighLevelCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHighLevelCommand=ruleHighLevelCommand();

            state._fsp--;

             current =iv_ruleHighLevelCommand; 
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
    // $ANTLR end "entryRuleHighLevelCommand"


    // $ANTLR start "ruleHighLevelCommand"
    // InternalVcsFeatures.g:921:1: ruleHighLevelCommand returns [EObject current=null] : ( () otherlv_1= '-' otherlv_2= 'Super' otherlv_3= 'command' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'with' ( ( ruleEString ) ) (otherlv_7= '->' ( ( ruleEString ) ) )* )? ) ;
    public final EObject ruleHighLevelCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:927:2: ( ( () otherlv_1= '-' otherlv_2= 'Super' otherlv_3= 'command' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'with' ( ( ruleEString ) ) (otherlv_7= '->' ( ( ruleEString ) ) )* )? ) )
            // InternalVcsFeatures.g:928:2: ( () otherlv_1= '-' otherlv_2= 'Super' otherlv_3= 'command' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'with' ( ( ruleEString ) ) (otherlv_7= '->' ( ( ruleEString ) ) )* )? )
            {
            // InternalVcsFeatures.g:928:2: ( () otherlv_1= '-' otherlv_2= 'Super' otherlv_3= 'command' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'with' ( ( ruleEString ) ) (otherlv_7= '->' ( ( ruleEString ) ) )* )? )
            // InternalVcsFeatures.g:929:3: () otherlv_1= '-' otherlv_2= 'Super' otherlv_3= 'command' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'with' ( ( ruleEString ) ) (otherlv_7= '->' ( ( ruleEString ) ) )* )?
            {
            // InternalVcsFeatures.g:929:3: ()
            // InternalVcsFeatures.g:930:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHighLevelCommandAccess().getHighLevelCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getHighLevelCommandAccess().getHyphenMinusKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getHighLevelCommandAccess().getSuperKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getHighLevelCommandAccess().getCommandKeyword_3());
            		
            // InternalVcsFeatures.g:948:3: ( (lv_name_4_0= ruleEString ) )
            // InternalVcsFeatures.g:949:4: (lv_name_4_0= ruleEString )
            {
            // InternalVcsFeatures.g:949:4: (lv_name_4_0= ruleEString )
            // InternalVcsFeatures.g:950:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHighLevelCommandAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighLevelCommandRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVcsFeatures.g:967:3: (otherlv_5= 'with' ( ( ruleEString ) ) (otherlv_7= '->' ( ( ruleEString ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVcsFeatures.g:968:4: otherlv_5= 'with' ( ( ruleEString ) ) (otherlv_7= '->' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getHighLevelCommandAccess().getWithKeyword_5_0());
                    			
                    // InternalVcsFeatures.g:972:4: ( ( ruleEString ) )
                    // InternalVcsFeatures.g:973:5: ( ruleEString )
                    {
                    // InternalVcsFeatures.g:973:5: ( ruleEString )
                    // InternalVcsFeatures.g:974:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHighLevelCommandRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVcsFeatures.g:988:4: (otherlv_7= '->' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==42) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalVcsFeatures.g:989:5: otherlv_7= '->' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,42,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getHighLevelCommandAccess().getHyphenMinusGreaterThanSignKeyword_5_2_0());
                    	    				
                    	    // InternalVcsFeatures.g:993:5: ( ( ruleEString ) )
                    	    // InternalVcsFeatures.g:994:6: ( ruleEString )
                    	    {
                    	    // InternalVcsFeatures.g:994:6: ( ruleEString )
                    	    // InternalVcsFeatures.g:995:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getHighLevelCommandRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleHighLevelCommand"


    // $ANTLR start "entryRuleLowLevelCommand"
    // InternalVcsFeatures.g:1015:1: entryRuleLowLevelCommand returns [EObject current=null] : iv_ruleLowLevelCommand= ruleLowLevelCommand EOF ;
    public final EObject entryRuleLowLevelCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowLevelCommand = null;


        try {
            // InternalVcsFeatures.g:1015:56: (iv_ruleLowLevelCommand= ruleLowLevelCommand EOF )
            // InternalVcsFeatures.g:1016:2: iv_ruleLowLevelCommand= ruleLowLevelCommand EOF
            {
             newCompositeNode(grammarAccess.getLowLevelCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowLevelCommand=ruleLowLevelCommand();

            state._fsp--;

             current =iv_ruleLowLevelCommand; 
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
    // $ANTLR end "entryRuleLowLevelCommand"


    // $ANTLR start "ruleLowLevelCommand"
    // InternalVcsFeatures.g:1022:1: ruleLowLevelCommand returns [EObject current=null] : (otherlv_0= '-' otherlv_1= 'Command' otherlv_2= 'use' ( (lv_command_3_0= ruleLowCommands ) ) otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) ) ;
    public final EObject ruleLowLevelCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_command_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalVcsFeatures.g:1028:2: ( (otherlv_0= '-' otherlv_1= 'Command' otherlv_2= 'use' ( (lv_command_3_0= ruleLowCommands ) ) otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) ) )
            // InternalVcsFeatures.g:1029:2: (otherlv_0= '-' otherlv_1= 'Command' otherlv_2= 'use' ( (lv_command_3_0= ruleLowCommands ) ) otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) )
            {
            // InternalVcsFeatures.g:1029:2: (otherlv_0= '-' otherlv_1= 'Command' otherlv_2= 'use' ( (lv_command_3_0= ruleLowCommands ) ) otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) ) )
            // InternalVcsFeatures.g:1030:3: otherlv_0= '-' otherlv_1= 'Command' otherlv_2= 'use' ( (lv_command_3_0= ruleLowCommands ) ) otherlv_4= 'as' ( (lv_name_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getLowLevelCommandAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getLowLevelCommandAccess().getCommandKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getLowLevelCommandAccess().getUseKeyword_2());
            		
            // InternalVcsFeatures.g:1042:3: ( (lv_command_3_0= ruleLowCommands ) )
            // InternalVcsFeatures.g:1043:4: (lv_command_3_0= ruleLowCommands )
            {
            // InternalVcsFeatures.g:1043:4: (lv_command_3_0= ruleLowCommands )
            // InternalVcsFeatures.g:1044:5: lv_command_3_0= ruleLowCommands
            {

            					newCompositeNode(grammarAccess.getLowLevelCommandAccess().getCommandLowCommandsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
            lv_command_3_0=ruleLowCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowLevelCommandRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_3_0,
            						"diro.geodes.VcsFeatures.LowCommands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLowLevelCommandAccess().getAsKeyword_4());
            		
            // InternalVcsFeatures.g:1065:3: ( (lv_name_5_0= ruleEString ) )
            // InternalVcsFeatures.g:1066:4: (lv_name_5_0= ruleEString )
            {
            // InternalVcsFeatures.g:1066:4: (lv_name_5_0= ruleEString )
            // InternalVcsFeatures.g:1067:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLowLevelCommandAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowLevelCommandRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"diro.geodes.VcsFeatures.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleLowLevelCommand"


    // $ANTLR start "entryRuleEInt"
    // InternalVcsFeatures.g:1088:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalVcsFeatures.g:1088:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalVcsFeatures.g:1089:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalVcsFeatures.g:1095:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1101:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalVcsFeatures.g:1102:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalVcsFeatures.g:1102:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalVcsFeatures.g:1103:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalVcsFeatures.g:1103:3: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVcsFeatures.g:1104:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_48); 

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


    // $ANTLR start "ruleMergeStrategy"
    // InternalVcsFeatures.g:1121:1: ruleMergeStrategy returns [Enumerator current=null] : ( (enumLiteral_0= 'DSMCompare' ) | (enumLiteral_1= 'GitDiff' ) ) ;
    public final Enumerator ruleMergeStrategy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1127:2: ( ( (enumLiteral_0= 'DSMCompare' ) | (enumLiteral_1= 'GitDiff' ) ) )
            // InternalVcsFeatures.g:1128:2: ( (enumLiteral_0= 'DSMCompare' ) | (enumLiteral_1= 'GitDiff' ) )
            {
            // InternalVcsFeatures.g:1128:2: ( (enumLiteral_0= 'DSMCompare' ) | (enumLiteral_1= 'GitDiff' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            else if ( (LA25_0==47) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalVcsFeatures.g:1129:3: (enumLiteral_0= 'DSMCompare' )
                    {
                    // InternalVcsFeatures.g:1129:3: (enumLiteral_0= 'DSMCompare' )
                    // InternalVcsFeatures.g:1130:4: enumLiteral_0= 'DSMCompare'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getMergeStrategyAccess().getDSMCompareEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMergeStrategyAccess().getDSMCompareEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1137:3: (enumLiteral_1= 'GitDiff' )
                    {
                    // InternalVcsFeatures.g:1137:3: (enumLiteral_1= 'GitDiff' )
                    // InternalVcsFeatures.g:1138:4: enumLiteral_1= 'GitDiff'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMergeStrategyAccess().getGitDiffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMergeStrategyAccess().getGitDiffEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleMergeStrategy"


    // $ANTLR start "ruleLowCommands"
    // InternalVcsFeatures.g:1148:1: ruleLowCommands returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Checkout' ) | (enumLiteral_2= 'CheckoutCreate' ) | (enumLiteral_3= 'Clone' ) | (enumLiteral_4= 'Commit' ) | (enumLiteral_5= 'CherryPick' ) | (enumLiteral_6= 'CreateBranch' ) | (enumLiteral_7= 'Fetch' ) | (enumLiteral_8= 'Init' ) | (enumLiteral_9= 'Pull' ) | (enumLiteral_10= 'Push' ) | (enumLiteral_11= 'RemoteAdd' ) | (enumLiteral_12= 'Rm' ) | (enumLiteral_13= 'Log' ) | (enumLiteral_14= 'Open' ) ) ;
    public final Enumerator ruleLowCommands() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1154:2: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Checkout' ) | (enumLiteral_2= 'CheckoutCreate' ) | (enumLiteral_3= 'Clone' ) | (enumLiteral_4= 'Commit' ) | (enumLiteral_5= 'CherryPick' ) | (enumLiteral_6= 'CreateBranch' ) | (enumLiteral_7= 'Fetch' ) | (enumLiteral_8= 'Init' ) | (enumLiteral_9= 'Pull' ) | (enumLiteral_10= 'Push' ) | (enumLiteral_11= 'RemoteAdd' ) | (enumLiteral_12= 'Rm' ) | (enumLiteral_13= 'Log' ) | (enumLiteral_14= 'Open' ) ) )
            // InternalVcsFeatures.g:1155:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Checkout' ) | (enumLiteral_2= 'CheckoutCreate' ) | (enumLiteral_3= 'Clone' ) | (enumLiteral_4= 'Commit' ) | (enumLiteral_5= 'CherryPick' ) | (enumLiteral_6= 'CreateBranch' ) | (enumLiteral_7= 'Fetch' ) | (enumLiteral_8= 'Init' ) | (enumLiteral_9= 'Pull' ) | (enumLiteral_10= 'Push' ) | (enumLiteral_11= 'RemoteAdd' ) | (enumLiteral_12= 'Rm' ) | (enumLiteral_13= 'Log' ) | (enumLiteral_14= 'Open' ) )
            {
            // InternalVcsFeatures.g:1155:2: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Checkout' ) | (enumLiteral_2= 'CheckoutCreate' ) | (enumLiteral_3= 'Clone' ) | (enumLiteral_4= 'Commit' ) | (enumLiteral_5= 'CherryPick' ) | (enumLiteral_6= 'CreateBranch' ) | (enumLiteral_7= 'Fetch' ) | (enumLiteral_8= 'Init' ) | (enumLiteral_9= 'Pull' ) | (enumLiteral_10= 'Push' ) | (enumLiteral_11= 'RemoteAdd' ) | (enumLiteral_12= 'Rm' ) | (enumLiteral_13= 'Log' ) | (enumLiteral_14= 'Open' ) )
            int alt26=15;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt26=1;
                }
                break;
            case 49:
                {
                alt26=2;
                }
                break;
            case 50:
                {
                alt26=3;
                }
                break;
            case 51:
                {
                alt26=4;
                }
                break;
            case 52:
                {
                alt26=5;
                }
                break;
            case 53:
                {
                alt26=6;
                }
                break;
            case 54:
                {
                alt26=7;
                }
                break;
            case 55:
                {
                alt26=8;
                }
                break;
            case 56:
                {
                alt26=9;
                }
                break;
            case 57:
                {
                alt26=10;
                }
                break;
            case 58:
                {
                alt26=11;
                }
                break;
            case 59:
                {
                alt26=12;
                }
                break;
            case 60:
                {
                alt26=13;
                }
                break;
            case 61:
                {
                alt26=14;
                }
                break;
            case 62:
                {
                alt26=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalVcsFeatures.g:1156:3: (enumLiteral_0= 'Add' )
                    {
                    // InternalVcsFeatures.g:1156:3: (enumLiteral_0= 'Add' )
                    // InternalVcsFeatures.g:1157:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLowCommandsAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1164:3: (enumLiteral_1= 'Checkout' )
                    {
                    // InternalVcsFeatures.g:1164:3: (enumLiteral_1= 'Checkout' )
                    // InternalVcsFeatures.g:1165:4: enumLiteral_1= 'Checkout'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCheckoutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLowCommandsAccess().getCheckoutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:1172:3: (enumLiteral_2= 'CheckoutCreate' )
                    {
                    // InternalVcsFeatures.g:1172:3: (enumLiteral_2= 'CheckoutCreate' )
                    // InternalVcsFeatures.g:1173:4: enumLiteral_2= 'CheckoutCreate'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCheckoutCreateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLowCommandsAccess().getCheckoutCreateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:1180:3: (enumLiteral_3= 'Clone' )
                    {
                    // InternalVcsFeatures.g:1180:3: (enumLiteral_3= 'Clone' )
                    // InternalVcsFeatures.g:1181:4: enumLiteral_3= 'Clone'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCloneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLowCommandsAccess().getCloneEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVcsFeatures.g:1188:3: (enumLiteral_4= 'Commit' )
                    {
                    // InternalVcsFeatures.g:1188:3: (enumLiteral_4= 'Commit' )
                    // InternalVcsFeatures.g:1189:4: enumLiteral_4= 'Commit'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCommitEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLowCommandsAccess().getCommitEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVcsFeatures.g:1196:3: (enumLiteral_5= 'CherryPick' )
                    {
                    // InternalVcsFeatures.g:1196:3: (enumLiteral_5= 'CherryPick' )
                    // InternalVcsFeatures.g:1197:4: enumLiteral_5= 'CherryPick'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCherryPickEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLowCommandsAccess().getCherryPickEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVcsFeatures.g:1204:3: (enumLiteral_6= 'CreateBranch' )
                    {
                    // InternalVcsFeatures.g:1204:3: (enumLiteral_6= 'CreateBranch' )
                    // InternalVcsFeatures.g:1205:4: enumLiteral_6= 'CreateBranch'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getCreateBranchEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getLowCommandsAccess().getCreateBranchEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVcsFeatures.g:1212:3: (enumLiteral_7= 'Fetch' )
                    {
                    // InternalVcsFeatures.g:1212:3: (enumLiteral_7= 'Fetch' )
                    // InternalVcsFeatures.g:1213:4: enumLiteral_7= 'Fetch'
                    {
                    enumLiteral_7=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getFetchEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getLowCommandsAccess().getFetchEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVcsFeatures.g:1220:3: (enumLiteral_8= 'Init' )
                    {
                    // InternalVcsFeatures.g:1220:3: (enumLiteral_8= 'Init' )
                    // InternalVcsFeatures.g:1221:4: enumLiteral_8= 'Init'
                    {
                    enumLiteral_8=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getInitEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getLowCommandsAccess().getInitEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalVcsFeatures.g:1228:3: (enumLiteral_9= 'Pull' )
                    {
                    // InternalVcsFeatures.g:1228:3: (enumLiteral_9= 'Pull' )
                    // InternalVcsFeatures.g:1229:4: enumLiteral_9= 'Pull'
                    {
                    enumLiteral_9=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getPullEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getLowCommandsAccess().getPullEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalVcsFeatures.g:1236:3: (enumLiteral_10= 'Push' )
                    {
                    // InternalVcsFeatures.g:1236:3: (enumLiteral_10= 'Push' )
                    // InternalVcsFeatures.g:1237:4: enumLiteral_10= 'Push'
                    {
                    enumLiteral_10=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getPushEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getLowCommandsAccess().getPushEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalVcsFeatures.g:1244:3: (enumLiteral_11= 'RemoteAdd' )
                    {
                    // InternalVcsFeatures.g:1244:3: (enumLiteral_11= 'RemoteAdd' )
                    // InternalVcsFeatures.g:1245:4: enumLiteral_11= 'RemoteAdd'
                    {
                    enumLiteral_11=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getRemoteAddEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getLowCommandsAccess().getRemoteAddEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalVcsFeatures.g:1252:3: (enumLiteral_12= 'Rm' )
                    {
                    // InternalVcsFeatures.g:1252:3: (enumLiteral_12= 'Rm' )
                    // InternalVcsFeatures.g:1253:4: enumLiteral_12= 'Rm'
                    {
                    enumLiteral_12=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getRmEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getLowCommandsAccess().getRmEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalVcsFeatures.g:1260:3: (enumLiteral_13= 'Log' )
                    {
                    // InternalVcsFeatures.g:1260:3: (enumLiteral_13= 'Log' )
                    // InternalVcsFeatures.g:1261:4: enumLiteral_13= 'Log'
                    {
                    enumLiteral_13=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getLogEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getLowCommandsAccess().getLogEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalVcsFeatures.g:1268:3: (enumLiteral_14= 'Open' )
                    {
                    // InternalVcsFeatures.g:1268:3: (enumLiteral_14= 'Open' )
                    // InternalVcsFeatures.g:1269:4: enumLiteral_14= 'Open'
                    {
                    enumLiteral_14=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getLowCommandsAccess().getOpenEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getLowCommandsAccess().getOpenEnumLiteralDeclaration_14());
                    			

                    }


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
    // $ANTLR end "ruleLowCommands"


    // $ANTLR start "ruleLabelType"
    // InternalVcsFeatures.g:1279:1: ruleLabelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Unique' ) | (enumLiteral_1= 'CommitHash' ) | (enumLiteral_2= 'Label' ) ) ;
    public final Enumerator ruleLabelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1285:2: ( ( (enumLiteral_0= 'Unique' ) | (enumLiteral_1= 'CommitHash' ) | (enumLiteral_2= 'Label' ) ) )
            // InternalVcsFeatures.g:1286:2: ( (enumLiteral_0= 'Unique' ) | (enumLiteral_1= 'CommitHash' ) | (enumLiteral_2= 'Label' ) )
            {
            // InternalVcsFeatures.g:1286:2: ( (enumLiteral_0= 'Unique' ) | (enumLiteral_1= 'CommitHash' ) | (enumLiteral_2= 'Label' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt27=1;
                }
                break;
            case 64:
                {
                alt27=2;
                }
                break;
            case 65:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalVcsFeatures.g:1287:3: (enumLiteral_0= 'Unique' )
                    {
                    // InternalVcsFeatures.g:1287:3: (enumLiteral_0= 'Unique' )
                    // InternalVcsFeatures.g:1288:4: enumLiteral_0= 'Unique'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLabelTypeAccess().getUniqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLabelTypeAccess().getUniqueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1295:3: (enumLiteral_1= 'CommitHash' )
                    {
                    // InternalVcsFeatures.g:1295:3: (enumLiteral_1= 'CommitHash' )
                    // InternalVcsFeatures.g:1296:4: enumLiteral_1= 'CommitHash'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getLabelTypeAccess().getCommitHashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLabelTypeAccess().getCommitHashEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:1303:3: (enumLiteral_2= 'Label' )
                    {
                    // InternalVcsFeatures.g:1303:3: (enumLiteral_2= 'Label' )
                    // InternalVcsFeatures.g:1304:4: enumLiteral_2= 'Label'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getLabelTypeAccess().getLabelEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLabelTypeAccess().getLabelEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleLabelType"


    // $ANTLR start "ruleVersionUnitType"
    // InternalVcsFeatures.g:1314:1: ruleVersionUnitType returns [Enumerator current=null] : ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'Semantic' ) | (enumLiteral_2= 'File' ) | (enumLiteral_3= 'Element' ) ) ;
    public final Enumerator ruleVersionUnitType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1320:2: ( ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'Semantic' ) | (enumLiteral_2= 'File' ) | (enumLiteral_3= 'Element' ) ) )
            // InternalVcsFeatures.g:1321:2: ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'Semantic' ) | (enumLiteral_2= 'File' ) | (enumLiteral_3= 'Element' ) )
            {
            // InternalVcsFeatures.g:1321:2: ( (enumLiteral_0= 'Line' ) | (enumLiteral_1= 'Semantic' ) | (enumLiteral_2= 'File' ) | (enumLiteral_3= 'Element' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt28=1;
                }
                break;
            case 67:
                {
                alt28=2;
                }
                break;
            case 68:
                {
                alt28=3;
                }
                break;
            case 69:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalVcsFeatures.g:1322:3: (enumLiteral_0= 'Line' )
                    {
                    // InternalVcsFeatures.g:1322:3: (enumLiteral_0= 'Line' )
                    // InternalVcsFeatures.g:1323:4: enumLiteral_0= 'Line'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getVersionUnitTypeAccess().getLineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVersionUnitTypeAccess().getLineEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1330:3: (enumLiteral_1= 'Semantic' )
                    {
                    // InternalVcsFeatures.g:1330:3: (enumLiteral_1= 'Semantic' )
                    // InternalVcsFeatures.g:1331:4: enumLiteral_1= 'Semantic'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getVersionUnitTypeAccess().getSemanticEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVersionUnitTypeAccess().getSemanticEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:1338:3: (enumLiteral_2= 'File' )
                    {
                    // InternalVcsFeatures.g:1338:3: (enumLiteral_2= 'File' )
                    // InternalVcsFeatures.g:1339:4: enumLiteral_2= 'File'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getVersionUnitTypeAccess().getFileEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVersionUnitTypeAccess().getFileEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:1346:3: (enumLiteral_3= 'Element' )
                    {
                    // InternalVcsFeatures.g:1346:3: (enumLiteral_3= 'Element' )
                    // InternalVcsFeatures.g:1347:4: enumLiteral_3= 'Element'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getVersionUnitTypeAccess().getElementEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVersionUnitTypeAccess().getElementEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleVersionUnitType"


    // $ANTLR start "ruleCollaborationStyleType"
    // InternalVcsFeatures.g:1357:1: ruleCollaborationStyleType returns [Enumerator current=null] : ( (enumLiteral_0= 'LocalOnly' ) | (enumLiteral_1= 'Remote' ) ) ;
    public final Enumerator ruleCollaborationStyleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1363:2: ( ( (enumLiteral_0= 'LocalOnly' ) | (enumLiteral_1= 'Remote' ) ) )
            // InternalVcsFeatures.g:1364:2: ( (enumLiteral_0= 'LocalOnly' ) | (enumLiteral_1= 'Remote' ) )
            {
            // InternalVcsFeatures.g:1364:2: ( (enumLiteral_0= 'LocalOnly' ) | (enumLiteral_1= 'Remote' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            else if ( (LA29_0==71) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalVcsFeatures.g:1365:3: (enumLiteral_0= 'LocalOnly' )
                    {
                    // InternalVcsFeatures.g:1365:3: (enumLiteral_0= 'LocalOnly' )
                    // InternalVcsFeatures.g:1366:4: enumLiteral_0= 'LocalOnly'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getCollaborationStyleTypeAccess().getLocalOnlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCollaborationStyleTypeAccess().getLocalOnlyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1373:3: (enumLiteral_1= 'Remote' )
                    {
                    // InternalVcsFeatures.g:1373:3: (enumLiteral_1= 'Remote' )
                    // InternalVcsFeatures.g:1374:4: enumLiteral_1= 'Remote'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getCollaborationStyleTypeAccess().getRemoteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCollaborationStyleTypeAccess().getRemoteEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleCollaborationStyleType"


    // $ANTLR start "ruleDatabaseType"
    // InternalVcsFeatures.g:1384:1: ruleDatabaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'MongoDB' ) | (enumLiteral_1= 'XMI' ) | (enumLiteral_2= 'Neo4J' ) | (enumLiteral_3= 'SQL' ) ) ;
    public final Enumerator ruleDatabaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalVcsFeatures.g:1390:2: ( ( (enumLiteral_0= 'MongoDB' ) | (enumLiteral_1= 'XMI' ) | (enumLiteral_2= 'Neo4J' ) | (enumLiteral_3= 'SQL' ) ) )
            // InternalVcsFeatures.g:1391:2: ( (enumLiteral_0= 'MongoDB' ) | (enumLiteral_1= 'XMI' ) | (enumLiteral_2= 'Neo4J' ) | (enumLiteral_3= 'SQL' ) )
            {
            // InternalVcsFeatures.g:1391:2: ( (enumLiteral_0= 'MongoDB' ) | (enumLiteral_1= 'XMI' ) | (enumLiteral_2= 'Neo4J' ) | (enumLiteral_3= 'SQL' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt30=1;
                }
                break;
            case 73:
                {
                alt30=2;
                }
                break;
            case 74:
                {
                alt30=3;
                }
                break;
            case 75:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalVcsFeatures.g:1392:3: (enumLiteral_0= 'MongoDB' )
                    {
                    // InternalVcsFeatures.g:1392:3: (enumLiteral_0= 'MongoDB' )
                    // InternalVcsFeatures.g:1393:4: enumLiteral_0= 'MongoDB'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getMongoDBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatabaseTypeAccess().getMongoDBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:1400:3: (enumLiteral_1= 'XMI' )
                    {
                    // InternalVcsFeatures.g:1400:3: (enumLiteral_1= 'XMI' )
                    // InternalVcsFeatures.g:1401:4: enumLiteral_1= 'XMI'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getXMIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatabaseTypeAccess().getXMIEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:1408:3: (enumLiteral_2= 'Neo4J' )
                    {
                    // InternalVcsFeatures.g:1408:3: (enumLiteral_2= 'Neo4J' )
                    // InternalVcsFeatures.g:1409:4: enumLiteral_2= 'Neo4J'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getNeo4JEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatabaseTypeAccess().getNeo4JEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:1416:3: (enumLiteral_3= 'SQL' )
                    {
                    // InternalVcsFeatures.g:1416:3: (enumLiteral_3= 'SQL' )
                    // InternalVcsFeatures.g:1417:4: enumLiteral_3= 'SQL'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getSQLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDatabaseTypeAccess().getSQLEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleDatabaseType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002505000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000094005000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003CL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x7FFF000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});

}