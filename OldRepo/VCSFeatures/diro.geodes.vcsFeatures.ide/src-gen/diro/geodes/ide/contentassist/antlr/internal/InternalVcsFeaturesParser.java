package diro.geodes.ide.contentassist.antlr.internal;

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
import diro.geodes.services.VcsFeaturesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVcsFeaturesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DSMCompare'", "'GitDiff'", "'Add'", "'Checkout'", "'CheckoutCreate'", "'Clone'", "'Commit'", "'CherryPick'", "'CreateBranch'", "'Fetch'", "'Init'", "'Pull'", "'Push'", "'RemoteAdd'", "'Rm'", "'Log'", "'Open'", "'Unique'", "'CommitHash'", "'Label'", "'Line'", "'Semantic'", "'File'", "'Element'", "'LocalOnly'", "'Remote'", "'MongoDB'", "'XMI'", "'Neo4J'", "'SQL'", "'VCSFeatures'", "'#'", "'COMMANDS'", "','", "'HISTORY'", "'VERSIONNING'", "'COLLABORATION'", "'STYLE'", "'DATABASES'", "'Merge'", "'tool:'", "'Basic'", "'command'", "'declaration:'", "'Super'", "'Identifying'", "'label:'", "'Version'", "'history'", "'backlog:'", "'Maximum'", "'number'", "'of'", "'branches:'", "'Detail'", "'level:'", "'Working:'", "'DB'", "'@'", "'-'", "'with'", "'->'", "'Command'", "'use'", "'as'"
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

    	public void setGrammarAccess(VcsFeaturesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleVCSFeatures"
    // InternalVcsFeatures.g:53:1: entryRuleVCSFeatures : ruleVCSFeatures EOF ;
    public final void entryRuleVCSFeatures() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:54:1: ( ruleVCSFeatures EOF )
            // InternalVcsFeatures.g:55:1: ruleVCSFeatures EOF
            {
             before(grammarAccess.getVCSFeaturesRule()); 
            pushFollow(FOLLOW_1);
            ruleVCSFeatures();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesRule()); 
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
    // $ANTLR end "entryRuleVCSFeatures"


    // $ANTLR start "ruleVCSFeatures"
    // InternalVcsFeatures.g:62:1: ruleVCSFeatures : ( ( rule__VCSFeatures__Group__0 ) ) ;
    public final void ruleVCSFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:66:2: ( ( ( rule__VCSFeatures__Group__0 ) ) )
            // InternalVcsFeatures.g:67:2: ( ( rule__VCSFeatures__Group__0 ) )
            {
            // InternalVcsFeatures.g:67:2: ( ( rule__VCSFeatures__Group__0 ) )
            // InternalVcsFeatures.g:68:3: ( rule__VCSFeatures__Group__0 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup()); 
            // InternalVcsFeatures.g:69:3: ( rule__VCSFeatures__Group__0 )
            // InternalVcsFeatures.g:69:4: rule__VCSFeatures__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getGroup()); 

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
    // $ANTLR end "ruleVCSFeatures"


    // $ANTLR start "entryRuleCommands"
    // InternalVcsFeatures.g:78:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:79:1: ( ruleCommands EOF )
            // InternalVcsFeatures.g:80:1: ruleCommands EOF
            {
             before(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getCommandsRule()); 
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
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalVcsFeatures.g:87:1: ruleCommands : ( ( rule__Commands__Group__0 ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:91:2: ( ( ( rule__Commands__Group__0 ) ) )
            // InternalVcsFeatures.g:92:2: ( ( rule__Commands__Group__0 ) )
            {
            // InternalVcsFeatures.g:92:2: ( ( rule__Commands__Group__0 ) )
            // InternalVcsFeatures.g:93:3: ( rule__Commands__Group__0 )
            {
             before(grammarAccess.getCommandsAccess().getGroup()); 
            // InternalVcsFeatures.g:94:3: ( rule__Commands__Group__0 )
            // InternalVcsFeatures.g:94:4: rule__Commands__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Commands__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandsAccess().getGroup()); 

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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleHistory"
    // InternalVcsFeatures.g:103:1: entryRuleHistory : ruleHistory EOF ;
    public final void entryRuleHistory() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:104:1: ( ruleHistory EOF )
            // InternalVcsFeatures.g:105:1: ruleHistory EOF
            {
             before(grammarAccess.getHistoryRule()); 
            pushFollow(FOLLOW_1);
            ruleHistory();

            state._fsp--;

             after(grammarAccess.getHistoryRule()); 
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
    // $ANTLR end "entryRuleHistory"


    // $ANTLR start "ruleHistory"
    // InternalVcsFeatures.g:112:1: ruleHistory : ( ( rule__History__Group__0 ) ) ;
    public final void ruleHistory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:116:2: ( ( ( rule__History__Group__0 ) ) )
            // InternalVcsFeatures.g:117:2: ( ( rule__History__Group__0 ) )
            {
            // InternalVcsFeatures.g:117:2: ( ( rule__History__Group__0 ) )
            // InternalVcsFeatures.g:118:3: ( rule__History__Group__0 )
            {
             before(grammarAccess.getHistoryAccess().getGroup()); 
            // InternalVcsFeatures.g:119:3: ( rule__History__Group__0 )
            // InternalVcsFeatures.g:119:4: rule__History__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__History__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHistoryAccess().getGroup()); 

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
    // $ANTLR end "ruleHistory"


    // $ANTLR start "entryRuleVersionUnit"
    // InternalVcsFeatures.g:128:1: entryRuleVersionUnit : ruleVersionUnit EOF ;
    public final void entryRuleVersionUnit() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:129:1: ( ruleVersionUnit EOF )
            // InternalVcsFeatures.g:130:1: ruleVersionUnit EOF
            {
             before(grammarAccess.getVersionUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleVersionUnit();

            state._fsp--;

             after(grammarAccess.getVersionUnitRule()); 
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
    // $ANTLR end "entryRuleVersionUnit"


    // $ANTLR start "ruleVersionUnit"
    // InternalVcsFeatures.g:137:1: ruleVersionUnit : ( ( rule__VersionUnit__Group__0 ) ) ;
    public final void ruleVersionUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:141:2: ( ( ( rule__VersionUnit__Group__0 ) ) )
            // InternalVcsFeatures.g:142:2: ( ( rule__VersionUnit__Group__0 ) )
            {
            // InternalVcsFeatures.g:142:2: ( ( rule__VersionUnit__Group__0 ) )
            // InternalVcsFeatures.g:143:3: ( rule__VersionUnit__Group__0 )
            {
             before(grammarAccess.getVersionUnitAccess().getGroup()); 
            // InternalVcsFeatures.g:144:3: ( rule__VersionUnit__Group__0 )
            // InternalVcsFeatures.g:144:4: rule__VersionUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VersionUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionUnitAccess().getGroup()); 

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
    // $ANTLR end "ruleVersionUnit"


    // $ANTLR start "entryRuleCollaborationStyle"
    // InternalVcsFeatures.g:153:1: entryRuleCollaborationStyle : ruleCollaborationStyle EOF ;
    public final void entryRuleCollaborationStyle() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:154:1: ( ruleCollaborationStyle EOF )
            // InternalVcsFeatures.g:155:1: ruleCollaborationStyle EOF
            {
             before(grammarAccess.getCollaborationStyleRule()); 
            pushFollow(FOLLOW_1);
            ruleCollaborationStyle();

            state._fsp--;

             after(grammarAccess.getCollaborationStyleRule()); 
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
    // $ANTLR end "entryRuleCollaborationStyle"


    // $ANTLR start "ruleCollaborationStyle"
    // InternalVcsFeatures.g:162:1: ruleCollaborationStyle : ( ( rule__CollaborationStyle__Group__0 ) ) ;
    public final void ruleCollaborationStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:166:2: ( ( ( rule__CollaborationStyle__Group__0 ) ) )
            // InternalVcsFeatures.g:167:2: ( ( rule__CollaborationStyle__Group__0 ) )
            {
            // InternalVcsFeatures.g:167:2: ( ( rule__CollaborationStyle__Group__0 ) )
            // InternalVcsFeatures.g:168:3: ( rule__CollaborationStyle__Group__0 )
            {
             before(grammarAccess.getCollaborationStyleAccess().getGroup()); 
            // InternalVcsFeatures.g:169:3: ( rule__CollaborationStyle__Group__0 )
            // InternalVcsFeatures.g:169:4: rule__CollaborationStyle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollaborationStyle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollaborationStyleAccess().getGroup()); 

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
    // $ANTLR end "ruleCollaborationStyle"


    // $ANTLR start "entryRuleDatabase"
    // InternalVcsFeatures.g:178:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:179:1: ( ruleDatabase EOF )
            // InternalVcsFeatures.g:180:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalVcsFeatures.g:187:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:191:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalVcsFeatures.g:192:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalVcsFeatures.g:192:2: ( ( rule__Database__Group__0 ) )
            // InternalVcsFeatures.g:193:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalVcsFeatures.g:194:3: ( rule__Database__Group__0 )
            // InternalVcsFeatures.g:194:4: rule__Database__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleEString"
    // InternalVcsFeatures.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:204:1: ( ruleEString EOF )
            // InternalVcsFeatures.g:205:1: ruleEString EOF
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
    // InternalVcsFeatures.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalVcsFeatures.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalVcsFeatures.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalVcsFeatures.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalVcsFeatures.g:219:3: ( rule__EString__Alternatives )
            // InternalVcsFeatures.g:219:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleHighLevelCommand"
    // InternalVcsFeatures.g:228:1: entryRuleHighLevelCommand : ruleHighLevelCommand EOF ;
    public final void entryRuleHighLevelCommand() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:229:1: ( ruleHighLevelCommand EOF )
            // InternalVcsFeatures.g:230:1: ruleHighLevelCommand EOF
            {
             before(grammarAccess.getHighLevelCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleHighLevelCommand();

            state._fsp--;

             after(grammarAccess.getHighLevelCommandRule()); 
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
    // $ANTLR end "entryRuleHighLevelCommand"


    // $ANTLR start "ruleHighLevelCommand"
    // InternalVcsFeatures.g:237:1: ruleHighLevelCommand : ( ( rule__HighLevelCommand__Group__0 ) ) ;
    public final void ruleHighLevelCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:241:2: ( ( ( rule__HighLevelCommand__Group__0 ) ) )
            // InternalVcsFeatures.g:242:2: ( ( rule__HighLevelCommand__Group__0 ) )
            {
            // InternalVcsFeatures.g:242:2: ( ( rule__HighLevelCommand__Group__0 ) )
            // InternalVcsFeatures.g:243:3: ( rule__HighLevelCommand__Group__0 )
            {
             before(grammarAccess.getHighLevelCommandAccess().getGroup()); 
            // InternalVcsFeatures.g:244:3: ( rule__HighLevelCommand__Group__0 )
            // InternalVcsFeatures.g:244:4: rule__HighLevelCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHighLevelCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleHighLevelCommand"


    // $ANTLR start "entryRuleLowLevelCommand"
    // InternalVcsFeatures.g:253:1: entryRuleLowLevelCommand : ruleLowLevelCommand EOF ;
    public final void entryRuleLowLevelCommand() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:254:1: ( ruleLowLevelCommand EOF )
            // InternalVcsFeatures.g:255:1: ruleLowLevelCommand EOF
            {
             before(grammarAccess.getLowLevelCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleLowLevelCommand();

            state._fsp--;

             after(grammarAccess.getLowLevelCommandRule()); 
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
    // $ANTLR end "entryRuleLowLevelCommand"


    // $ANTLR start "ruleLowLevelCommand"
    // InternalVcsFeatures.g:262:1: ruleLowLevelCommand : ( ( rule__LowLevelCommand__Group__0 ) ) ;
    public final void ruleLowLevelCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:266:2: ( ( ( rule__LowLevelCommand__Group__0 ) ) )
            // InternalVcsFeatures.g:267:2: ( ( rule__LowLevelCommand__Group__0 ) )
            {
            // InternalVcsFeatures.g:267:2: ( ( rule__LowLevelCommand__Group__0 ) )
            // InternalVcsFeatures.g:268:3: ( rule__LowLevelCommand__Group__0 )
            {
             before(grammarAccess.getLowLevelCommandAccess().getGroup()); 
            // InternalVcsFeatures.g:269:3: ( rule__LowLevelCommand__Group__0 )
            // InternalVcsFeatures.g:269:4: rule__LowLevelCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLowLevelCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleLowLevelCommand"


    // $ANTLR start "entryRuleEInt"
    // InternalVcsFeatures.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalVcsFeatures.g:279:1: ( ruleEInt EOF )
            // InternalVcsFeatures.g:280:1: ruleEInt EOF
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
    // InternalVcsFeatures.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalVcsFeatures.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalVcsFeatures.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalVcsFeatures.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalVcsFeatures.g:294:3: ( rule__EInt__Group__0 )
            // InternalVcsFeatures.g:294:4: rule__EInt__Group__0
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


    // $ANTLR start "ruleMergeStrategy"
    // InternalVcsFeatures.g:303:1: ruleMergeStrategy : ( ( rule__MergeStrategy__Alternatives ) ) ;
    public final void ruleMergeStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:307:1: ( ( ( rule__MergeStrategy__Alternatives ) ) )
            // InternalVcsFeatures.g:308:2: ( ( rule__MergeStrategy__Alternatives ) )
            {
            // InternalVcsFeatures.g:308:2: ( ( rule__MergeStrategy__Alternatives ) )
            // InternalVcsFeatures.g:309:3: ( rule__MergeStrategy__Alternatives )
            {
             before(grammarAccess.getMergeStrategyAccess().getAlternatives()); 
            // InternalVcsFeatures.g:310:3: ( rule__MergeStrategy__Alternatives )
            // InternalVcsFeatures.g:310:4: rule__MergeStrategy__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MergeStrategy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMergeStrategyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMergeStrategy"


    // $ANTLR start "ruleLowCommands"
    // InternalVcsFeatures.g:319:1: ruleLowCommands : ( ( rule__LowCommands__Alternatives ) ) ;
    public final void ruleLowCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:323:1: ( ( ( rule__LowCommands__Alternatives ) ) )
            // InternalVcsFeatures.g:324:2: ( ( rule__LowCommands__Alternatives ) )
            {
            // InternalVcsFeatures.g:324:2: ( ( rule__LowCommands__Alternatives ) )
            // InternalVcsFeatures.g:325:3: ( rule__LowCommands__Alternatives )
            {
             before(grammarAccess.getLowCommandsAccess().getAlternatives()); 
            // InternalVcsFeatures.g:326:3: ( rule__LowCommands__Alternatives )
            // InternalVcsFeatures.g:326:4: rule__LowCommands__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LowCommands__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLowCommandsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLowCommands"


    // $ANTLR start "ruleLabelType"
    // InternalVcsFeatures.g:335:1: ruleLabelType : ( ( rule__LabelType__Alternatives ) ) ;
    public final void ruleLabelType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:339:1: ( ( ( rule__LabelType__Alternatives ) ) )
            // InternalVcsFeatures.g:340:2: ( ( rule__LabelType__Alternatives ) )
            {
            // InternalVcsFeatures.g:340:2: ( ( rule__LabelType__Alternatives ) )
            // InternalVcsFeatures.g:341:3: ( rule__LabelType__Alternatives )
            {
             before(grammarAccess.getLabelTypeAccess().getAlternatives()); 
            // InternalVcsFeatures.g:342:3: ( rule__LabelType__Alternatives )
            // InternalVcsFeatures.g:342:4: rule__LabelType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LabelType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLabelTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLabelType"


    // $ANTLR start "ruleVersionUnitType"
    // InternalVcsFeatures.g:351:1: ruleVersionUnitType : ( ( rule__VersionUnitType__Alternatives ) ) ;
    public final void ruleVersionUnitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:355:1: ( ( ( rule__VersionUnitType__Alternatives ) ) )
            // InternalVcsFeatures.g:356:2: ( ( rule__VersionUnitType__Alternatives ) )
            {
            // InternalVcsFeatures.g:356:2: ( ( rule__VersionUnitType__Alternatives ) )
            // InternalVcsFeatures.g:357:3: ( rule__VersionUnitType__Alternatives )
            {
             before(grammarAccess.getVersionUnitTypeAccess().getAlternatives()); 
            // InternalVcsFeatures.g:358:3: ( rule__VersionUnitType__Alternatives )
            // InternalVcsFeatures.g:358:4: rule__VersionUnitType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VersionUnitType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVersionUnitTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVersionUnitType"


    // $ANTLR start "ruleCollaborationStyleType"
    // InternalVcsFeatures.g:367:1: ruleCollaborationStyleType : ( ( rule__CollaborationStyleType__Alternatives ) ) ;
    public final void ruleCollaborationStyleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:371:1: ( ( ( rule__CollaborationStyleType__Alternatives ) ) )
            // InternalVcsFeatures.g:372:2: ( ( rule__CollaborationStyleType__Alternatives ) )
            {
            // InternalVcsFeatures.g:372:2: ( ( rule__CollaborationStyleType__Alternatives ) )
            // InternalVcsFeatures.g:373:3: ( rule__CollaborationStyleType__Alternatives )
            {
             before(grammarAccess.getCollaborationStyleTypeAccess().getAlternatives()); 
            // InternalVcsFeatures.g:374:3: ( rule__CollaborationStyleType__Alternatives )
            // InternalVcsFeatures.g:374:4: rule__CollaborationStyleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CollaborationStyleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollaborationStyleTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCollaborationStyleType"


    // $ANTLR start "ruleDatabaseType"
    // InternalVcsFeatures.g:383:1: ruleDatabaseType : ( ( rule__DatabaseType__Alternatives ) ) ;
    public final void ruleDatabaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:387:1: ( ( ( rule__DatabaseType__Alternatives ) ) )
            // InternalVcsFeatures.g:388:2: ( ( rule__DatabaseType__Alternatives ) )
            {
            // InternalVcsFeatures.g:388:2: ( ( rule__DatabaseType__Alternatives ) )
            // InternalVcsFeatures.g:389:3: ( rule__DatabaseType__Alternatives )
            {
             before(grammarAccess.getDatabaseTypeAccess().getAlternatives()); 
            // InternalVcsFeatures.g:390:3: ( rule__DatabaseType__Alternatives )
            // InternalVcsFeatures.g:390:4: rule__DatabaseType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDatabaseType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalVcsFeatures.g:398:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:402:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalVcsFeatures.g:403:2: ( RULE_STRING )
                    {
                    // InternalVcsFeatures.g:403:2: ( RULE_STRING )
                    // InternalVcsFeatures.g:404:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:409:2: ( RULE_ID )
                    {
                    // InternalVcsFeatures.g:409:2: ( RULE_ID )
                    // InternalVcsFeatures.g:410:3: RULE_ID
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


    // $ANTLR start "rule__MergeStrategy__Alternatives"
    // InternalVcsFeatures.g:419:1: rule__MergeStrategy__Alternatives : ( ( ( 'DSMCompare' ) ) | ( ( 'GitDiff' ) ) );
    public final void rule__MergeStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:423:1: ( ( ( 'DSMCompare' ) ) | ( ( 'GitDiff' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVcsFeatures.g:424:2: ( ( 'DSMCompare' ) )
                    {
                    // InternalVcsFeatures.g:424:2: ( ( 'DSMCompare' ) )
                    // InternalVcsFeatures.g:425:3: ( 'DSMCompare' )
                    {
                     before(grammarAccess.getMergeStrategyAccess().getDSMCompareEnumLiteralDeclaration_0()); 
                    // InternalVcsFeatures.g:426:3: ( 'DSMCompare' )
                    // InternalVcsFeatures.g:426:4: 'DSMCompare'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMergeStrategyAccess().getDSMCompareEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:430:2: ( ( 'GitDiff' ) )
                    {
                    // InternalVcsFeatures.g:430:2: ( ( 'GitDiff' ) )
                    // InternalVcsFeatures.g:431:3: ( 'GitDiff' )
                    {
                     before(grammarAccess.getMergeStrategyAccess().getGitDiffEnumLiteralDeclaration_1()); 
                    // InternalVcsFeatures.g:432:3: ( 'GitDiff' )
                    // InternalVcsFeatures.g:432:4: 'GitDiff'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMergeStrategyAccess().getGitDiffEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MergeStrategy__Alternatives"


    // $ANTLR start "rule__LowCommands__Alternatives"
    // InternalVcsFeatures.g:440:1: rule__LowCommands__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Checkout' ) ) | ( ( 'CheckoutCreate' ) ) | ( ( 'Clone' ) ) | ( ( 'Commit' ) ) | ( ( 'CherryPick' ) ) | ( ( 'CreateBranch' ) ) | ( ( 'Fetch' ) ) | ( ( 'Init' ) ) | ( ( 'Pull' ) ) | ( ( 'Push' ) ) | ( ( 'RemoteAdd' ) ) | ( ( 'Rm' ) ) | ( ( 'Log' ) ) | ( ( 'Open' ) ) );
    public final void rule__LowCommands__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:444:1: ( ( ( 'Add' ) ) | ( ( 'Checkout' ) ) | ( ( 'CheckoutCreate' ) ) | ( ( 'Clone' ) ) | ( ( 'Commit' ) ) | ( ( 'CherryPick' ) ) | ( ( 'CreateBranch' ) ) | ( ( 'Fetch' ) ) | ( ( 'Init' ) ) | ( ( 'Pull' ) ) | ( ( 'Push' ) ) | ( ( 'RemoteAdd' ) ) | ( ( 'Rm' ) ) | ( ( 'Log' ) ) | ( ( 'Open' ) ) )
            int alt3=15;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            case 21:
                {
                alt3=9;
                }
                break;
            case 22:
                {
                alt3=10;
                }
                break;
            case 23:
                {
                alt3=11;
                }
                break;
            case 24:
                {
                alt3=12;
                }
                break;
            case 25:
                {
                alt3=13;
                }
                break;
            case 26:
                {
                alt3=14;
                }
                break;
            case 27:
                {
                alt3=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVcsFeatures.g:445:2: ( ( 'Add' ) )
                    {
                    // InternalVcsFeatures.g:445:2: ( ( 'Add' ) )
                    // InternalVcsFeatures.g:446:3: ( 'Add' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalVcsFeatures.g:447:3: ( 'Add' )
                    // InternalVcsFeatures.g:447:4: 'Add'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:451:2: ( ( 'Checkout' ) )
                    {
                    // InternalVcsFeatures.g:451:2: ( ( 'Checkout' ) )
                    // InternalVcsFeatures.g:452:3: ( 'Checkout' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getCheckoutEnumLiteralDeclaration_1()); 
                    // InternalVcsFeatures.g:453:3: ( 'Checkout' )
                    // InternalVcsFeatures.g:453:4: 'Checkout'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getCheckoutEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:457:2: ( ( 'CheckoutCreate' ) )
                    {
                    // InternalVcsFeatures.g:457:2: ( ( 'CheckoutCreate' ) )
                    // InternalVcsFeatures.g:458:3: ( 'CheckoutCreate' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getCheckoutCreateEnumLiteralDeclaration_2()); 
                    // InternalVcsFeatures.g:459:3: ( 'CheckoutCreate' )
                    // InternalVcsFeatures.g:459:4: 'CheckoutCreate'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getCheckoutCreateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:463:2: ( ( 'Clone' ) )
                    {
                    // InternalVcsFeatures.g:463:2: ( ( 'Clone' ) )
                    // InternalVcsFeatures.g:464:3: ( 'Clone' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getCloneEnumLiteralDeclaration_3()); 
                    // InternalVcsFeatures.g:465:3: ( 'Clone' )
                    // InternalVcsFeatures.g:465:4: 'Clone'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getCloneEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVcsFeatures.g:469:2: ( ( 'Commit' ) )
                    {
                    // InternalVcsFeatures.g:469:2: ( ( 'Commit' ) )
                    // InternalVcsFeatures.g:470:3: ( 'Commit' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getCommitEnumLiteralDeclaration_4()); 
                    // InternalVcsFeatures.g:471:3: ( 'Commit' )
                    // InternalVcsFeatures.g:471:4: 'Commit'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getCommitEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVcsFeatures.g:475:2: ( ( 'CherryPick' ) )
                    {
                    // InternalVcsFeatures.g:475:2: ( ( 'CherryPick' ) )
                    // InternalVcsFeatures.g:476:3: ( 'CherryPick' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getCherryPickEnumLiteralDeclaration_5()); 
                    // InternalVcsFeatures.g:477:3: ( 'CherryPick' )
                    // InternalVcsFeatures.g:477:4: 'CherryPick'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getCherryPickEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVcsFeatures.g:481:2: ( ( 'CreateBranch' ) )
                    {
                    // InternalVcsFeatures.g:481:2: ( ( 'CreateBranch' ) )
                    // InternalVcsFeatures.g:482:3: ( 'CreateBranch' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getCreateBranchEnumLiteralDeclaration_6()); 
                    // InternalVcsFeatures.g:483:3: ( 'CreateBranch' )
                    // InternalVcsFeatures.g:483:4: 'CreateBranch'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getCreateBranchEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVcsFeatures.g:487:2: ( ( 'Fetch' ) )
                    {
                    // InternalVcsFeatures.g:487:2: ( ( 'Fetch' ) )
                    // InternalVcsFeatures.g:488:3: ( 'Fetch' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getFetchEnumLiteralDeclaration_7()); 
                    // InternalVcsFeatures.g:489:3: ( 'Fetch' )
                    // InternalVcsFeatures.g:489:4: 'Fetch'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getFetchEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVcsFeatures.g:493:2: ( ( 'Init' ) )
                    {
                    // InternalVcsFeatures.g:493:2: ( ( 'Init' ) )
                    // InternalVcsFeatures.g:494:3: ( 'Init' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getInitEnumLiteralDeclaration_8()); 
                    // InternalVcsFeatures.g:495:3: ( 'Init' )
                    // InternalVcsFeatures.g:495:4: 'Init'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getInitEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalVcsFeatures.g:499:2: ( ( 'Pull' ) )
                    {
                    // InternalVcsFeatures.g:499:2: ( ( 'Pull' ) )
                    // InternalVcsFeatures.g:500:3: ( 'Pull' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getPullEnumLiteralDeclaration_9()); 
                    // InternalVcsFeatures.g:501:3: ( 'Pull' )
                    // InternalVcsFeatures.g:501:4: 'Pull'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getPullEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalVcsFeatures.g:505:2: ( ( 'Push' ) )
                    {
                    // InternalVcsFeatures.g:505:2: ( ( 'Push' ) )
                    // InternalVcsFeatures.g:506:3: ( 'Push' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getPushEnumLiteralDeclaration_10()); 
                    // InternalVcsFeatures.g:507:3: ( 'Push' )
                    // InternalVcsFeatures.g:507:4: 'Push'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getPushEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalVcsFeatures.g:511:2: ( ( 'RemoteAdd' ) )
                    {
                    // InternalVcsFeatures.g:511:2: ( ( 'RemoteAdd' ) )
                    // InternalVcsFeatures.g:512:3: ( 'RemoteAdd' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getRemoteAddEnumLiteralDeclaration_11()); 
                    // InternalVcsFeatures.g:513:3: ( 'RemoteAdd' )
                    // InternalVcsFeatures.g:513:4: 'RemoteAdd'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getRemoteAddEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalVcsFeatures.g:517:2: ( ( 'Rm' ) )
                    {
                    // InternalVcsFeatures.g:517:2: ( ( 'Rm' ) )
                    // InternalVcsFeatures.g:518:3: ( 'Rm' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getRmEnumLiteralDeclaration_12()); 
                    // InternalVcsFeatures.g:519:3: ( 'Rm' )
                    // InternalVcsFeatures.g:519:4: 'Rm'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getRmEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalVcsFeatures.g:523:2: ( ( 'Log' ) )
                    {
                    // InternalVcsFeatures.g:523:2: ( ( 'Log' ) )
                    // InternalVcsFeatures.g:524:3: ( 'Log' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getLogEnumLiteralDeclaration_13()); 
                    // InternalVcsFeatures.g:525:3: ( 'Log' )
                    // InternalVcsFeatures.g:525:4: 'Log'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getLogEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalVcsFeatures.g:529:2: ( ( 'Open' ) )
                    {
                    // InternalVcsFeatures.g:529:2: ( ( 'Open' ) )
                    // InternalVcsFeatures.g:530:3: ( 'Open' )
                    {
                     before(grammarAccess.getLowCommandsAccess().getOpenEnumLiteralDeclaration_14()); 
                    // InternalVcsFeatures.g:531:3: ( 'Open' )
                    // InternalVcsFeatures.g:531:4: 'Open'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowCommandsAccess().getOpenEnumLiteralDeclaration_14()); 

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
    // $ANTLR end "rule__LowCommands__Alternatives"


    // $ANTLR start "rule__LabelType__Alternatives"
    // InternalVcsFeatures.g:539:1: rule__LabelType__Alternatives : ( ( ( 'Unique' ) ) | ( ( 'CommitHash' ) ) | ( ( 'Label' ) ) );
    public final void rule__LabelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:543:1: ( ( ( 'Unique' ) ) | ( ( 'CommitHash' ) ) | ( ( 'Label' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVcsFeatures.g:544:2: ( ( 'Unique' ) )
                    {
                    // InternalVcsFeatures.g:544:2: ( ( 'Unique' ) )
                    // InternalVcsFeatures.g:545:3: ( 'Unique' )
                    {
                     before(grammarAccess.getLabelTypeAccess().getUniqueEnumLiteralDeclaration_0()); 
                    // InternalVcsFeatures.g:546:3: ( 'Unique' )
                    // InternalVcsFeatures.g:546:4: 'Unique'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelTypeAccess().getUniqueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:550:2: ( ( 'CommitHash' ) )
                    {
                    // InternalVcsFeatures.g:550:2: ( ( 'CommitHash' ) )
                    // InternalVcsFeatures.g:551:3: ( 'CommitHash' )
                    {
                     before(grammarAccess.getLabelTypeAccess().getCommitHashEnumLiteralDeclaration_1()); 
                    // InternalVcsFeatures.g:552:3: ( 'CommitHash' )
                    // InternalVcsFeatures.g:552:4: 'CommitHash'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelTypeAccess().getCommitHashEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:556:2: ( ( 'Label' ) )
                    {
                    // InternalVcsFeatures.g:556:2: ( ( 'Label' ) )
                    // InternalVcsFeatures.g:557:3: ( 'Label' )
                    {
                     before(grammarAccess.getLabelTypeAccess().getLabelEnumLiteralDeclaration_2()); 
                    // InternalVcsFeatures.g:558:3: ( 'Label' )
                    // InternalVcsFeatures.g:558:4: 'Label'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelTypeAccess().getLabelEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__LabelType__Alternatives"


    // $ANTLR start "rule__VersionUnitType__Alternatives"
    // InternalVcsFeatures.g:566:1: rule__VersionUnitType__Alternatives : ( ( ( 'Line' ) ) | ( ( 'Semantic' ) ) | ( ( 'File' ) ) | ( ( 'Element' ) ) );
    public final void rule__VersionUnitType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:570:1: ( ( ( 'Line' ) ) | ( ( 'Semantic' ) ) | ( ( 'File' ) ) | ( ( 'Element' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVcsFeatures.g:571:2: ( ( 'Line' ) )
                    {
                    // InternalVcsFeatures.g:571:2: ( ( 'Line' ) )
                    // InternalVcsFeatures.g:572:3: ( 'Line' )
                    {
                     before(grammarAccess.getVersionUnitTypeAccess().getLineEnumLiteralDeclaration_0()); 
                    // InternalVcsFeatures.g:573:3: ( 'Line' )
                    // InternalVcsFeatures.g:573:4: 'Line'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getVersionUnitTypeAccess().getLineEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:577:2: ( ( 'Semantic' ) )
                    {
                    // InternalVcsFeatures.g:577:2: ( ( 'Semantic' ) )
                    // InternalVcsFeatures.g:578:3: ( 'Semantic' )
                    {
                     before(grammarAccess.getVersionUnitTypeAccess().getSemanticEnumLiteralDeclaration_1()); 
                    // InternalVcsFeatures.g:579:3: ( 'Semantic' )
                    // InternalVcsFeatures.g:579:4: 'Semantic'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getVersionUnitTypeAccess().getSemanticEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:583:2: ( ( 'File' ) )
                    {
                    // InternalVcsFeatures.g:583:2: ( ( 'File' ) )
                    // InternalVcsFeatures.g:584:3: ( 'File' )
                    {
                     before(grammarAccess.getVersionUnitTypeAccess().getFileEnumLiteralDeclaration_2()); 
                    // InternalVcsFeatures.g:585:3: ( 'File' )
                    // InternalVcsFeatures.g:585:4: 'File'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getVersionUnitTypeAccess().getFileEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:589:2: ( ( 'Element' ) )
                    {
                    // InternalVcsFeatures.g:589:2: ( ( 'Element' ) )
                    // InternalVcsFeatures.g:590:3: ( 'Element' )
                    {
                     before(grammarAccess.getVersionUnitTypeAccess().getElementEnumLiteralDeclaration_3()); 
                    // InternalVcsFeatures.g:591:3: ( 'Element' )
                    // InternalVcsFeatures.g:591:4: 'Element'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getVersionUnitTypeAccess().getElementEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__VersionUnitType__Alternatives"


    // $ANTLR start "rule__CollaborationStyleType__Alternatives"
    // InternalVcsFeatures.g:599:1: rule__CollaborationStyleType__Alternatives : ( ( ( 'LocalOnly' ) ) | ( ( 'Remote' ) ) );
    public final void rule__CollaborationStyleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:603:1: ( ( ( 'LocalOnly' ) ) | ( ( 'Remote' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVcsFeatures.g:604:2: ( ( 'LocalOnly' ) )
                    {
                    // InternalVcsFeatures.g:604:2: ( ( 'LocalOnly' ) )
                    // InternalVcsFeatures.g:605:3: ( 'LocalOnly' )
                    {
                     before(grammarAccess.getCollaborationStyleTypeAccess().getLocalOnlyEnumLiteralDeclaration_0()); 
                    // InternalVcsFeatures.g:606:3: ( 'LocalOnly' )
                    // InternalVcsFeatures.g:606:4: 'LocalOnly'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getCollaborationStyleTypeAccess().getLocalOnlyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:610:2: ( ( 'Remote' ) )
                    {
                    // InternalVcsFeatures.g:610:2: ( ( 'Remote' ) )
                    // InternalVcsFeatures.g:611:3: ( 'Remote' )
                    {
                     before(grammarAccess.getCollaborationStyleTypeAccess().getRemoteEnumLiteralDeclaration_1()); 
                    // InternalVcsFeatures.g:612:3: ( 'Remote' )
                    // InternalVcsFeatures.g:612:4: 'Remote'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getCollaborationStyleTypeAccess().getRemoteEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CollaborationStyleType__Alternatives"


    // $ANTLR start "rule__DatabaseType__Alternatives"
    // InternalVcsFeatures.g:620:1: rule__DatabaseType__Alternatives : ( ( ( 'MongoDB' ) ) | ( ( 'XMI' ) ) | ( ( 'Neo4J' ) ) | ( ( 'SQL' ) ) );
    public final void rule__DatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:624:1: ( ( ( 'MongoDB' ) ) | ( ( 'XMI' ) ) | ( ( 'Neo4J' ) ) | ( ( 'SQL' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt7=1;
                }
                break;
            case 38:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            case 40:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVcsFeatures.g:625:2: ( ( 'MongoDB' ) )
                    {
                    // InternalVcsFeatures.g:625:2: ( ( 'MongoDB' ) )
                    // InternalVcsFeatures.g:626:3: ( 'MongoDB' )
                    {
                     before(grammarAccess.getDatabaseTypeAccess().getMongoDBEnumLiteralDeclaration_0()); 
                    // InternalVcsFeatures.g:627:3: ( 'MongoDB' )
                    // InternalVcsFeatures.g:627:4: 'MongoDB'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseTypeAccess().getMongoDBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVcsFeatures.g:631:2: ( ( 'XMI' ) )
                    {
                    // InternalVcsFeatures.g:631:2: ( ( 'XMI' ) )
                    // InternalVcsFeatures.g:632:3: ( 'XMI' )
                    {
                     before(grammarAccess.getDatabaseTypeAccess().getXMIEnumLiteralDeclaration_1()); 
                    // InternalVcsFeatures.g:633:3: ( 'XMI' )
                    // InternalVcsFeatures.g:633:4: 'XMI'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseTypeAccess().getXMIEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVcsFeatures.g:637:2: ( ( 'Neo4J' ) )
                    {
                    // InternalVcsFeatures.g:637:2: ( ( 'Neo4J' ) )
                    // InternalVcsFeatures.g:638:3: ( 'Neo4J' )
                    {
                     before(grammarAccess.getDatabaseTypeAccess().getNeo4JEnumLiteralDeclaration_2()); 
                    // InternalVcsFeatures.g:639:3: ( 'Neo4J' )
                    // InternalVcsFeatures.g:639:4: 'Neo4J'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseTypeAccess().getNeo4JEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVcsFeatures.g:643:2: ( ( 'SQL' ) )
                    {
                    // InternalVcsFeatures.g:643:2: ( ( 'SQL' ) )
                    // InternalVcsFeatures.g:644:3: ( 'SQL' )
                    {
                     before(grammarAccess.getDatabaseTypeAccess().getSQLEnumLiteralDeclaration_3()); 
                    // InternalVcsFeatures.g:645:3: ( 'SQL' )
                    // InternalVcsFeatures.g:645:4: 'SQL'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseTypeAccess().getSQLEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__DatabaseType__Alternatives"


    // $ANTLR start "rule__VCSFeatures__Group__0"
    // InternalVcsFeatures.g:653:1: rule__VCSFeatures__Group__0 : rule__VCSFeatures__Group__0__Impl rule__VCSFeatures__Group__1 ;
    public final void rule__VCSFeatures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:657:1: ( rule__VCSFeatures__Group__0__Impl rule__VCSFeatures__Group__1 )
            // InternalVcsFeatures.g:658:2: rule__VCSFeatures__Group__0__Impl rule__VCSFeatures__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VCSFeatures__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__1();

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
    // $ANTLR end "rule__VCSFeatures__Group__0"


    // $ANTLR start "rule__VCSFeatures__Group__0__Impl"
    // InternalVcsFeatures.g:665:1: rule__VCSFeatures__Group__0__Impl : ( () ) ;
    public final void rule__VCSFeatures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:669:1: ( ( () ) )
            // InternalVcsFeatures.g:670:1: ( () )
            {
            // InternalVcsFeatures.g:670:1: ( () )
            // InternalVcsFeatures.g:671:2: ()
            {
             before(grammarAccess.getVCSFeaturesAccess().getVCSFeaturesAction_0()); 
            // InternalVcsFeatures.g:672:2: ()
            // InternalVcsFeatures.g:672:3: 
            {
            }

             after(grammarAccess.getVCSFeaturesAccess().getVCSFeaturesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VCSFeatures__Group__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__1"
    // InternalVcsFeatures.g:680:1: rule__VCSFeatures__Group__1 : rule__VCSFeatures__Group__1__Impl rule__VCSFeatures__Group__2 ;
    public final void rule__VCSFeatures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:684:1: ( rule__VCSFeatures__Group__1__Impl rule__VCSFeatures__Group__2 )
            // InternalVcsFeatures.g:685:2: rule__VCSFeatures__Group__1__Impl rule__VCSFeatures__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VCSFeatures__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__2();

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
    // $ANTLR end "rule__VCSFeatures__Group__1"


    // $ANTLR start "rule__VCSFeatures__Group__1__Impl"
    // InternalVcsFeatures.g:692:1: rule__VCSFeatures__Group__1__Impl : ( 'VCSFeatures' ) ;
    public final void rule__VCSFeatures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:696:1: ( ( 'VCSFeatures' ) )
            // InternalVcsFeatures.g:697:1: ( 'VCSFeatures' )
            {
            // InternalVcsFeatures.g:697:1: ( 'VCSFeatures' )
            // InternalVcsFeatures.g:698:2: 'VCSFeatures'
            {
             before(grammarAccess.getVCSFeaturesAccess().getVCSFeaturesKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getVCSFeaturesKeyword_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__2"
    // InternalVcsFeatures.g:707:1: rule__VCSFeatures__Group__2 : rule__VCSFeatures__Group__2__Impl rule__VCSFeatures__Group__3 ;
    public final void rule__VCSFeatures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:711:1: ( rule__VCSFeatures__Group__2__Impl rule__VCSFeatures__Group__3 )
            // InternalVcsFeatures.g:712:2: rule__VCSFeatures__Group__2__Impl rule__VCSFeatures__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VCSFeatures__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__3();

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
    // $ANTLR end "rule__VCSFeatures__Group__2"


    // $ANTLR start "rule__VCSFeatures__Group__2__Impl"
    // InternalVcsFeatures.g:719:1: rule__VCSFeatures__Group__2__Impl : ( ( rule__VCSFeatures__NameAssignment_2 ) ) ;
    public final void rule__VCSFeatures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:723:1: ( ( ( rule__VCSFeatures__NameAssignment_2 ) ) )
            // InternalVcsFeatures.g:724:1: ( ( rule__VCSFeatures__NameAssignment_2 ) )
            {
            // InternalVcsFeatures.g:724:1: ( ( rule__VCSFeatures__NameAssignment_2 ) )
            // InternalVcsFeatures.g:725:2: ( rule__VCSFeatures__NameAssignment_2 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getNameAssignment_2()); 
            // InternalVcsFeatures.g:726:2: ( rule__VCSFeatures__NameAssignment_2 )
            // InternalVcsFeatures.g:726:3: rule__VCSFeatures__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__2__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__3"
    // InternalVcsFeatures.g:734:1: rule__VCSFeatures__Group__3 : rule__VCSFeatures__Group__3__Impl rule__VCSFeatures__Group__4 ;
    public final void rule__VCSFeatures__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:738:1: ( rule__VCSFeatures__Group__3__Impl rule__VCSFeatures__Group__4 )
            // InternalVcsFeatures.g:739:2: rule__VCSFeatures__Group__3__Impl rule__VCSFeatures__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VCSFeatures__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__4();

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
    // $ANTLR end "rule__VCSFeatures__Group__3"


    // $ANTLR start "rule__VCSFeatures__Group__3__Impl"
    // InternalVcsFeatures.g:746:1: rule__VCSFeatures__Group__3__Impl : ( '#' ) ;
    public final void rule__VCSFeatures__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:750:1: ( ( '#' ) )
            // InternalVcsFeatures.g:751:1: ( '#' )
            {
            // InternalVcsFeatures.g:751:1: ( '#' )
            // InternalVcsFeatures.g:752:2: '#'
            {
             before(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_3()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__3__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__4"
    // InternalVcsFeatures.g:761:1: rule__VCSFeatures__Group__4 : rule__VCSFeatures__Group__4__Impl rule__VCSFeatures__Group__5 ;
    public final void rule__VCSFeatures__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:765:1: ( rule__VCSFeatures__Group__4__Impl rule__VCSFeatures__Group__5 )
            // InternalVcsFeatures.g:766:2: rule__VCSFeatures__Group__4__Impl rule__VCSFeatures__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__VCSFeatures__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__5();

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
    // $ANTLR end "rule__VCSFeatures__Group__4"


    // $ANTLR start "rule__VCSFeatures__Group__4__Impl"
    // InternalVcsFeatures.g:773:1: rule__VCSFeatures__Group__4__Impl : ( ( rule__VCSFeatures__Group_4__0 )? ) ;
    public final void rule__VCSFeatures__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:777:1: ( ( ( rule__VCSFeatures__Group_4__0 )? ) )
            // InternalVcsFeatures.g:778:1: ( ( rule__VCSFeatures__Group_4__0 )? )
            {
            // InternalVcsFeatures.g:778:1: ( ( rule__VCSFeatures__Group_4__0 )? )
            // InternalVcsFeatures.g:779:2: ( rule__VCSFeatures__Group_4__0 )?
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_4()); 
            // InternalVcsFeatures.g:780:2: ( rule__VCSFeatures__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==43) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVcsFeatures.g:780:3: rule__VCSFeatures__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VCSFeatures__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVCSFeaturesAccess().getGroup_4()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__4__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__5"
    // InternalVcsFeatures.g:788:1: rule__VCSFeatures__Group__5 : rule__VCSFeatures__Group__5__Impl rule__VCSFeatures__Group__6 ;
    public final void rule__VCSFeatures__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:792:1: ( rule__VCSFeatures__Group__5__Impl rule__VCSFeatures__Group__6 )
            // InternalVcsFeatures.g:793:2: rule__VCSFeatures__Group__5__Impl rule__VCSFeatures__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__VCSFeatures__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__6();

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
    // $ANTLR end "rule__VCSFeatures__Group__5"


    // $ANTLR start "rule__VCSFeatures__Group__5__Impl"
    // InternalVcsFeatures.g:800:1: rule__VCSFeatures__Group__5__Impl : ( '#' ) ;
    public final void rule__VCSFeatures__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:804:1: ( ( '#' ) )
            // InternalVcsFeatures.g:805:1: ( '#' )
            {
            // InternalVcsFeatures.g:805:1: ( '#' )
            // InternalVcsFeatures.g:806:2: '#'
            {
             before(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_5()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__5__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__6"
    // InternalVcsFeatures.g:815:1: rule__VCSFeatures__Group__6 : rule__VCSFeatures__Group__6__Impl rule__VCSFeatures__Group__7 ;
    public final void rule__VCSFeatures__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:819:1: ( rule__VCSFeatures__Group__6__Impl rule__VCSFeatures__Group__7 )
            // InternalVcsFeatures.g:820:2: rule__VCSFeatures__Group__6__Impl rule__VCSFeatures__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__VCSFeatures__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__7();

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
    // $ANTLR end "rule__VCSFeatures__Group__6"


    // $ANTLR start "rule__VCSFeatures__Group__6__Impl"
    // InternalVcsFeatures.g:827:1: rule__VCSFeatures__Group__6__Impl : ( ( rule__VCSFeatures__Group_6__0 )? ) ;
    public final void rule__VCSFeatures__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:831:1: ( ( ( rule__VCSFeatures__Group_6__0 )? ) )
            // InternalVcsFeatures.g:832:1: ( ( rule__VCSFeatures__Group_6__0 )? )
            {
            // InternalVcsFeatures.g:832:1: ( ( rule__VCSFeatures__Group_6__0 )? )
            // InternalVcsFeatures.g:833:2: ( rule__VCSFeatures__Group_6__0 )?
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_6()); 
            // InternalVcsFeatures.g:834:2: ( rule__VCSFeatures__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==45) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVcsFeatures.g:834:3: rule__VCSFeatures__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VCSFeatures__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVCSFeaturesAccess().getGroup_6()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__6__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__7"
    // InternalVcsFeatures.g:842:1: rule__VCSFeatures__Group__7 : rule__VCSFeatures__Group__7__Impl rule__VCSFeatures__Group__8 ;
    public final void rule__VCSFeatures__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:846:1: ( rule__VCSFeatures__Group__7__Impl rule__VCSFeatures__Group__8 )
            // InternalVcsFeatures.g:847:2: rule__VCSFeatures__Group__7__Impl rule__VCSFeatures__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__VCSFeatures__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__8();

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
    // $ANTLR end "rule__VCSFeatures__Group__7"


    // $ANTLR start "rule__VCSFeatures__Group__7__Impl"
    // InternalVcsFeatures.g:854:1: rule__VCSFeatures__Group__7__Impl : ( '#' ) ;
    public final void rule__VCSFeatures__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:858:1: ( ( '#' ) )
            // InternalVcsFeatures.g:859:1: ( '#' )
            {
            // InternalVcsFeatures.g:859:1: ( '#' )
            // InternalVcsFeatures.g:860:2: '#'
            {
             before(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_7()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_7()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__7__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__8"
    // InternalVcsFeatures.g:869:1: rule__VCSFeatures__Group__8 : rule__VCSFeatures__Group__8__Impl rule__VCSFeatures__Group__9 ;
    public final void rule__VCSFeatures__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:873:1: ( rule__VCSFeatures__Group__8__Impl rule__VCSFeatures__Group__9 )
            // InternalVcsFeatures.g:874:2: rule__VCSFeatures__Group__8__Impl rule__VCSFeatures__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__VCSFeatures__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__9();

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
    // $ANTLR end "rule__VCSFeatures__Group__8"


    // $ANTLR start "rule__VCSFeatures__Group__8__Impl"
    // InternalVcsFeatures.g:881:1: rule__VCSFeatures__Group__8__Impl : ( ( rule__VCSFeatures__Group_8__0 )? ) ;
    public final void rule__VCSFeatures__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:885:1: ( ( ( rule__VCSFeatures__Group_8__0 )? ) )
            // InternalVcsFeatures.g:886:1: ( ( rule__VCSFeatures__Group_8__0 )? )
            {
            // InternalVcsFeatures.g:886:1: ( ( rule__VCSFeatures__Group_8__0 )? )
            // InternalVcsFeatures.g:887:2: ( rule__VCSFeatures__Group_8__0 )?
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_8()); 
            // InternalVcsFeatures.g:888:2: ( rule__VCSFeatures__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVcsFeatures.g:888:3: rule__VCSFeatures__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VCSFeatures__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVCSFeaturesAccess().getGroup_8()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__8__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__9"
    // InternalVcsFeatures.g:896:1: rule__VCSFeatures__Group__9 : rule__VCSFeatures__Group__9__Impl rule__VCSFeatures__Group__10 ;
    public final void rule__VCSFeatures__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:900:1: ( rule__VCSFeatures__Group__9__Impl rule__VCSFeatures__Group__10 )
            // InternalVcsFeatures.g:901:2: rule__VCSFeatures__Group__9__Impl rule__VCSFeatures__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__VCSFeatures__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__10();

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
    // $ANTLR end "rule__VCSFeatures__Group__9"


    // $ANTLR start "rule__VCSFeatures__Group__9__Impl"
    // InternalVcsFeatures.g:908:1: rule__VCSFeatures__Group__9__Impl : ( '#' ) ;
    public final void rule__VCSFeatures__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:912:1: ( ( '#' ) )
            // InternalVcsFeatures.g:913:1: ( '#' )
            {
            // InternalVcsFeatures.g:913:1: ( '#' )
            // InternalVcsFeatures.g:914:2: '#'
            {
             before(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_9()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_9()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__9__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__10"
    // InternalVcsFeatures.g:923:1: rule__VCSFeatures__Group__10 : rule__VCSFeatures__Group__10__Impl rule__VCSFeatures__Group__11 ;
    public final void rule__VCSFeatures__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:927:1: ( rule__VCSFeatures__Group__10__Impl rule__VCSFeatures__Group__11 )
            // InternalVcsFeatures.g:928:2: rule__VCSFeatures__Group__10__Impl rule__VCSFeatures__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__VCSFeatures__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__11();

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
    // $ANTLR end "rule__VCSFeatures__Group__10"


    // $ANTLR start "rule__VCSFeatures__Group__10__Impl"
    // InternalVcsFeatures.g:935:1: rule__VCSFeatures__Group__10__Impl : ( ( rule__VCSFeatures__Group_10__0 )? ) ;
    public final void rule__VCSFeatures__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:939:1: ( ( ( rule__VCSFeatures__Group_10__0 )? ) )
            // InternalVcsFeatures.g:940:1: ( ( rule__VCSFeatures__Group_10__0 )? )
            {
            // InternalVcsFeatures.g:940:1: ( ( rule__VCSFeatures__Group_10__0 )? )
            // InternalVcsFeatures.g:941:2: ( rule__VCSFeatures__Group_10__0 )?
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_10()); 
            // InternalVcsFeatures.g:942:2: ( rule__VCSFeatures__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==47) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVcsFeatures.g:942:3: rule__VCSFeatures__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VCSFeatures__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVCSFeaturesAccess().getGroup_10()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__10__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__11"
    // InternalVcsFeatures.g:950:1: rule__VCSFeatures__Group__11 : rule__VCSFeatures__Group__11__Impl rule__VCSFeatures__Group__12 ;
    public final void rule__VCSFeatures__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:954:1: ( rule__VCSFeatures__Group__11__Impl rule__VCSFeatures__Group__12 )
            // InternalVcsFeatures.g:955:2: rule__VCSFeatures__Group__11__Impl rule__VCSFeatures__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__VCSFeatures__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__12();

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
    // $ANTLR end "rule__VCSFeatures__Group__11"


    // $ANTLR start "rule__VCSFeatures__Group__11__Impl"
    // InternalVcsFeatures.g:962:1: rule__VCSFeatures__Group__11__Impl : ( '#' ) ;
    public final void rule__VCSFeatures__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:966:1: ( ( '#' ) )
            // InternalVcsFeatures.g:967:1: ( '#' )
            {
            // InternalVcsFeatures.g:967:1: ( '#' )
            // InternalVcsFeatures.g:968:2: '#'
            {
             before(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_11()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getNumberSignKeyword_11()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__11__Impl"


    // $ANTLR start "rule__VCSFeatures__Group__12"
    // InternalVcsFeatures.g:977:1: rule__VCSFeatures__Group__12 : rule__VCSFeatures__Group__12__Impl ;
    public final void rule__VCSFeatures__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:981:1: ( rule__VCSFeatures__Group__12__Impl )
            // InternalVcsFeatures.g:982:2: rule__VCSFeatures__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group__12__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group__12"


    // $ANTLR start "rule__VCSFeatures__Group__12__Impl"
    // InternalVcsFeatures.g:988:1: rule__VCSFeatures__Group__12__Impl : ( ( rule__VCSFeatures__Group_12__0 )? ) ;
    public final void rule__VCSFeatures__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:992:1: ( ( ( rule__VCSFeatures__Group_12__0 )? ) )
            // InternalVcsFeatures.g:993:1: ( ( rule__VCSFeatures__Group_12__0 )? )
            {
            // InternalVcsFeatures.g:993:1: ( ( rule__VCSFeatures__Group_12__0 )? )
            // InternalVcsFeatures.g:994:2: ( rule__VCSFeatures__Group_12__0 )?
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_12()); 
            // InternalVcsFeatures.g:995:2: ( rule__VCSFeatures__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVcsFeatures.g:995:3: rule__VCSFeatures__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VCSFeatures__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVCSFeaturesAccess().getGroup_12()); 

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
    // $ANTLR end "rule__VCSFeatures__Group__12__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_4__0"
    // InternalVcsFeatures.g:1004:1: rule__VCSFeatures__Group_4__0 : rule__VCSFeatures__Group_4__0__Impl rule__VCSFeatures__Group_4__1 ;
    public final void rule__VCSFeatures__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1008:1: ( rule__VCSFeatures__Group_4__0__Impl rule__VCSFeatures__Group_4__1 )
            // InternalVcsFeatures.g:1009:2: rule__VCSFeatures__Group_4__0__Impl rule__VCSFeatures__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__VCSFeatures__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_4__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_4__0"


    // $ANTLR start "rule__VCSFeatures__Group_4__0__Impl"
    // InternalVcsFeatures.g:1016:1: rule__VCSFeatures__Group_4__0__Impl : ( 'COMMANDS' ) ;
    public final void rule__VCSFeatures__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1020:1: ( ( 'COMMANDS' ) )
            // InternalVcsFeatures.g:1021:1: ( 'COMMANDS' )
            {
            // InternalVcsFeatures.g:1021:1: ( 'COMMANDS' )
            // InternalVcsFeatures.g:1022:2: 'COMMANDS'
            {
             before(grammarAccess.getVCSFeaturesAccess().getCOMMANDSKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getCOMMANDSKeyword_4_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_4__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_4__1"
    // InternalVcsFeatures.g:1031:1: rule__VCSFeatures__Group_4__1 : rule__VCSFeatures__Group_4__1__Impl rule__VCSFeatures__Group_4__2 ;
    public final void rule__VCSFeatures__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1035:1: ( rule__VCSFeatures__Group_4__1__Impl rule__VCSFeatures__Group_4__2 )
            // InternalVcsFeatures.g:1036:2: rule__VCSFeatures__Group_4__1__Impl rule__VCSFeatures__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__VCSFeatures__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_4__2();

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
    // $ANTLR end "rule__VCSFeatures__Group_4__1"


    // $ANTLR start "rule__VCSFeatures__Group_4__1__Impl"
    // InternalVcsFeatures.g:1043:1: rule__VCSFeatures__Group_4__1__Impl : ( ( rule__VCSFeatures__CommandsAssignment_4_1 ) ) ;
    public final void rule__VCSFeatures__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1047:1: ( ( ( rule__VCSFeatures__CommandsAssignment_4_1 ) ) )
            // InternalVcsFeatures.g:1048:1: ( ( rule__VCSFeatures__CommandsAssignment_4_1 ) )
            {
            // InternalVcsFeatures.g:1048:1: ( ( rule__VCSFeatures__CommandsAssignment_4_1 ) )
            // InternalVcsFeatures.g:1049:2: ( rule__VCSFeatures__CommandsAssignment_4_1 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getCommandsAssignment_4_1()); 
            // InternalVcsFeatures.g:1050:2: ( rule__VCSFeatures__CommandsAssignment_4_1 )
            // InternalVcsFeatures.g:1050:3: rule__VCSFeatures__CommandsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__CommandsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getCommandsAssignment_4_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_4__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_4__2"
    // InternalVcsFeatures.g:1058:1: rule__VCSFeatures__Group_4__2 : rule__VCSFeatures__Group_4__2__Impl ;
    public final void rule__VCSFeatures__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1062:1: ( rule__VCSFeatures__Group_4__2__Impl )
            // InternalVcsFeatures.g:1063:2: rule__VCSFeatures__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_4__2__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_4__2"


    // $ANTLR start "rule__VCSFeatures__Group_4__2__Impl"
    // InternalVcsFeatures.g:1069:1: rule__VCSFeatures__Group_4__2__Impl : ( ( rule__VCSFeatures__Group_4_2__0 )* ) ;
    public final void rule__VCSFeatures__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1073:1: ( ( ( rule__VCSFeatures__Group_4_2__0 )* ) )
            // InternalVcsFeatures.g:1074:1: ( ( rule__VCSFeatures__Group_4_2__0 )* )
            {
            // InternalVcsFeatures.g:1074:1: ( ( rule__VCSFeatures__Group_4_2__0 )* )
            // InternalVcsFeatures.g:1075:2: ( rule__VCSFeatures__Group_4_2__0 )*
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_4_2()); 
            // InternalVcsFeatures.g:1076:2: ( rule__VCSFeatures__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVcsFeatures.g:1076:3: rule__VCSFeatures__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VCSFeatures__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getVCSFeaturesAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_4__2__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_4_2__0"
    // InternalVcsFeatures.g:1085:1: rule__VCSFeatures__Group_4_2__0 : rule__VCSFeatures__Group_4_2__0__Impl rule__VCSFeatures__Group_4_2__1 ;
    public final void rule__VCSFeatures__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1089:1: ( rule__VCSFeatures__Group_4_2__0__Impl rule__VCSFeatures__Group_4_2__1 )
            // InternalVcsFeatures.g:1090:2: rule__VCSFeatures__Group_4_2__0__Impl rule__VCSFeatures__Group_4_2__1
            {
            pushFollow(FOLLOW_11);
            rule__VCSFeatures__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_4_2__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_4_2__0"


    // $ANTLR start "rule__VCSFeatures__Group_4_2__0__Impl"
    // InternalVcsFeatures.g:1097:1: rule__VCSFeatures__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__VCSFeatures__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1101:1: ( ( ',' ) )
            // InternalVcsFeatures.g:1102:1: ( ',' )
            {
            // InternalVcsFeatures.g:1102:1: ( ',' )
            // InternalVcsFeatures.g:1103:2: ','
            {
             before(grammarAccess.getVCSFeaturesAccess().getCommaKeyword_4_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_4_2__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_4_2__1"
    // InternalVcsFeatures.g:1112:1: rule__VCSFeatures__Group_4_2__1 : rule__VCSFeatures__Group_4_2__1__Impl ;
    public final void rule__VCSFeatures__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1116:1: ( rule__VCSFeatures__Group_4_2__1__Impl )
            // InternalVcsFeatures.g:1117:2: rule__VCSFeatures__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_4_2__1"


    // $ANTLR start "rule__VCSFeatures__Group_4_2__1__Impl"
    // InternalVcsFeatures.g:1123:1: rule__VCSFeatures__Group_4_2__1__Impl : ( ( rule__VCSFeatures__CommandsAssignment_4_2_1 ) ) ;
    public final void rule__VCSFeatures__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1127:1: ( ( ( rule__VCSFeatures__CommandsAssignment_4_2_1 ) ) )
            // InternalVcsFeatures.g:1128:1: ( ( rule__VCSFeatures__CommandsAssignment_4_2_1 ) )
            {
            // InternalVcsFeatures.g:1128:1: ( ( rule__VCSFeatures__CommandsAssignment_4_2_1 ) )
            // InternalVcsFeatures.g:1129:2: ( rule__VCSFeatures__CommandsAssignment_4_2_1 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getCommandsAssignment_4_2_1()); 
            // InternalVcsFeatures.g:1130:2: ( rule__VCSFeatures__CommandsAssignment_4_2_1 )
            // InternalVcsFeatures.g:1130:3: rule__VCSFeatures__CommandsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__CommandsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getCommandsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_4_2__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_6__0"
    // InternalVcsFeatures.g:1139:1: rule__VCSFeatures__Group_6__0 : rule__VCSFeatures__Group_6__0__Impl rule__VCSFeatures__Group_6__1 ;
    public final void rule__VCSFeatures__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1143:1: ( rule__VCSFeatures__Group_6__0__Impl rule__VCSFeatures__Group_6__1 )
            // InternalVcsFeatures.g:1144:2: rule__VCSFeatures__Group_6__0__Impl rule__VCSFeatures__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__VCSFeatures__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_6__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_6__0"


    // $ANTLR start "rule__VCSFeatures__Group_6__0__Impl"
    // InternalVcsFeatures.g:1151:1: rule__VCSFeatures__Group_6__0__Impl : ( 'HISTORY' ) ;
    public final void rule__VCSFeatures__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1155:1: ( ( 'HISTORY' ) )
            // InternalVcsFeatures.g:1156:1: ( 'HISTORY' )
            {
            // InternalVcsFeatures.g:1156:1: ( 'HISTORY' )
            // InternalVcsFeatures.g:1157:2: 'HISTORY'
            {
             before(grammarAccess.getVCSFeaturesAccess().getHISTORYKeyword_6_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getHISTORYKeyword_6_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_6__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_6__1"
    // InternalVcsFeatures.g:1166:1: rule__VCSFeatures__Group_6__1 : rule__VCSFeatures__Group_6__1__Impl rule__VCSFeatures__Group_6__2 ;
    public final void rule__VCSFeatures__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1170:1: ( rule__VCSFeatures__Group_6__1__Impl rule__VCSFeatures__Group_6__2 )
            // InternalVcsFeatures.g:1171:2: rule__VCSFeatures__Group_6__1__Impl rule__VCSFeatures__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__VCSFeatures__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_6__2();

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
    // $ANTLR end "rule__VCSFeatures__Group_6__1"


    // $ANTLR start "rule__VCSFeatures__Group_6__1__Impl"
    // InternalVcsFeatures.g:1178:1: rule__VCSFeatures__Group_6__1__Impl : ( ( rule__VCSFeatures__HistoryAssignment_6_1 ) ) ;
    public final void rule__VCSFeatures__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1182:1: ( ( ( rule__VCSFeatures__HistoryAssignment_6_1 ) ) )
            // InternalVcsFeatures.g:1183:1: ( ( rule__VCSFeatures__HistoryAssignment_6_1 ) )
            {
            // InternalVcsFeatures.g:1183:1: ( ( rule__VCSFeatures__HistoryAssignment_6_1 ) )
            // InternalVcsFeatures.g:1184:2: ( rule__VCSFeatures__HistoryAssignment_6_1 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getHistoryAssignment_6_1()); 
            // InternalVcsFeatures.g:1185:2: ( rule__VCSFeatures__HistoryAssignment_6_1 )
            // InternalVcsFeatures.g:1185:3: rule__VCSFeatures__HistoryAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__HistoryAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getHistoryAssignment_6_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_6__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_6__2"
    // InternalVcsFeatures.g:1193:1: rule__VCSFeatures__Group_6__2 : rule__VCSFeatures__Group_6__2__Impl ;
    public final void rule__VCSFeatures__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1197:1: ( rule__VCSFeatures__Group_6__2__Impl )
            // InternalVcsFeatures.g:1198:2: rule__VCSFeatures__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_6__2__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_6__2"


    // $ANTLR start "rule__VCSFeatures__Group_6__2__Impl"
    // InternalVcsFeatures.g:1204:1: rule__VCSFeatures__Group_6__2__Impl : ( ( rule__VCSFeatures__Group_6_2__0 )* ) ;
    public final void rule__VCSFeatures__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1208:1: ( ( ( rule__VCSFeatures__Group_6_2__0 )* ) )
            // InternalVcsFeatures.g:1209:1: ( ( rule__VCSFeatures__Group_6_2__0 )* )
            {
            // InternalVcsFeatures.g:1209:1: ( ( rule__VCSFeatures__Group_6_2__0 )* )
            // InternalVcsFeatures.g:1210:2: ( rule__VCSFeatures__Group_6_2__0 )*
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_6_2()); 
            // InternalVcsFeatures.g:1211:2: ( rule__VCSFeatures__Group_6_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==44) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVcsFeatures.g:1211:3: rule__VCSFeatures__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VCSFeatures__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getVCSFeaturesAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_6__2__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_6_2__0"
    // InternalVcsFeatures.g:1220:1: rule__VCSFeatures__Group_6_2__0 : rule__VCSFeatures__Group_6_2__0__Impl rule__VCSFeatures__Group_6_2__1 ;
    public final void rule__VCSFeatures__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1224:1: ( rule__VCSFeatures__Group_6_2__0__Impl rule__VCSFeatures__Group_6_2__1 )
            // InternalVcsFeatures.g:1225:2: rule__VCSFeatures__Group_6_2__0__Impl rule__VCSFeatures__Group_6_2__1
            {
            pushFollow(FOLLOW_14);
            rule__VCSFeatures__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_6_2__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_6_2__0"


    // $ANTLR start "rule__VCSFeatures__Group_6_2__0__Impl"
    // InternalVcsFeatures.g:1232:1: rule__VCSFeatures__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__VCSFeatures__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1236:1: ( ( ',' ) )
            // InternalVcsFeatures.g:1237:1: ( ',' )
            {
            // InternalVcsFeatures.g:1237:1: ( ',' )
            // InternalVcsFeatures.g:1238:2: ','
            {
             before(grammarAccess.getVCSFeaturesAccess().getCommaKeyword_6_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_6_2__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_6_2__1"
    // InternalVcsFeatures.g:1247:1: rule__VCSFeatures__Group_6_2__1 : rule__VCSFeatures__Group_6_2__1__Impl ;
    public final void rule__VCSFeatures__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1251:1: ( rule__VCSFeatures__Group_6_2__1__Impl )
            // InternalVcsFeatures.g:1252:2: rule__VCSFeatures__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_6_2__1"


    // $ANTLR start "rule__VCSFeatures__Group_6_2__1__Impl"
    // InternalVcsFeatures.g:1258:1: rule__VCSFeatures__Group_6_2__1__Impl : ( ( rule__VCSFeatures__HistoryAssignment_6_2_1 ) ) ;
    public final void rule__VCSFeatures__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1262:1: ( ( ( rule__VCSFeatures__HistoryAssignment_6_2_1 ) ) )
            // InternalVcsFeatures.g:1263:1: ( ( rule__VCSFeatures__HistoryAssignment_6_2_1 ) )
            {
            // InternalVcsFeatures.g:1263:1: ( ( rule__VCSFeatures__HistoryAssignment_6_2_1 ) )
            // InternalVcsFeatures.g:1264:2: ( rule__VCSFeatures__HistoryAssignment_6_2_1 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getHistoryAssignment_6_2_1()); 
            // InternalVcsFeatures.g:1265:2: ( rule__VCSFeatures__HistoryAssignment_6_2_1 )
            // InternalVcsFeatures.g:1265:3: rule__VCSFeatures__HistoryAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__HistoryAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getHistoryAssignment_6_2_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_6_2__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_8__0"
    // InternalVcsFeatures.g:1274:1: rule__VCSFeatures__Group_8__0 : rule__VCSFeatures__Group_8__0__Impl rule__VCSFeatures__Group_8__1 ;
    public final void rule__VCSFeatures__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1278:1: ( rule__VCSFeatures__Group_8__0__Impl rule__VCSFeatures__Group_8__1 )
            // InternalVcsFeatures.g:1279:2: rule__VCSFeatures__Group_8__0__Impl rule__VCSFeatures__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__VCSFeatures__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_8__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_8__0"


    // $ANTLR start "rule__VCSFeatures__Group_8__0__Impl"
    // InternalVcsFeatures.g:1286:1: rule__VCSFeatures__Group_8__0__Impl : ( 'VERSIONNING' ) ;
    public final void rule__VCSFeatures__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1290:1: ( ( 'VERSIONNING' ) )
            // InternalVcsFeatures.g:1291:1: ( 'VERSIONNING' )
            {
            // InternalVcsFeatures.g:1291:1: ( 'VERSIONNING' )
            // InternalVcsFeatures.g:1292:2: 'VERSIONNING'
            {
             before(grammarAccess.getVCSFeaturesAccess().getVERSIONNINGKeyword_8_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getVERSIONNINGKeyword_8_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_8__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_8__1"
    // InternalVcsFeatures.g:1301:1: rule__VCSFeatures__Group_8__1 : rule__VCSFeatures__Group_8__1__Impl rule__VCSFeatures__Group_8__2 ;
    public final void rule__VCSFeatures__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1305:1: ( rule__VCSFeatures__Group_8__1__Impl rule__VCSFeatures__Group_8__2 )
            // InternalVcsFeatures.g:1306:2: rule__VCSFeatures__Group_8__1__Impl rule__VCSFeatures__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__VCSFeatures__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_8__2();

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
    // $ANTLR end "rule__VCSFeatures__Group_8__1"


    // $ANTLR start "rule__VCSFeatures__Group_8__1__Impl"
    // InternalVcsFeatures.g:1313:1: rule__VCSFeatures__Group_8__1__Impl : ( ( rule__VCSFeatures__VersionunitAssignment_8_1 ) ) ;
    public final void rule__VCSFeatures__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1317:1: ( ( ( rule__VCSFeatures__VersionunitAssignment_8_1 ) ) )
            // InternalVcsFeatures.g:1318:1: ( ( rule__VCSFeatures__VersionunitAssignment_8_1 ) )
            {
            // InternalVcsFeatures.g:1318:1: ( ( rule__VCSFeatures__VersionunitAssignment_8_1 ) )
            // InternalVcsFeatures.g:1319:2: ( rule__VCSFeatures__VersionunitAssignment_8_1 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getVersionunitAssignment_8_1()); 
            // InternalVcsFeatures.g:1320:2: ( rule__VCSFeatures__VersionunitAssignment_8_1 )
            // InternalVcsFeatures.g:1320:3: rule__VCSFeatures__VersionunitAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__VersionunitAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getVersionunitAssignment_8_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_8__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_8__2"
    // InternalVcsFeatures.g:1328:1: rule__VCSFeatures__Group_8__2 : rule__VCSFeatures__Group_8__2__Impl ;
    public final void rule__VCSFeatures__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1332:1: ( rule__VCSFeatures__Group_8__2__Impl )
            // InternalVcsFeatures.g:1333:2: rule__VCSFeatures__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_8__2__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_8__2"


    // $ANTLR start "rule__VCSFeatures__Group_8__2__Impl"
    // InternalVcsFeatures.g:1339:1: rule__VCSFeatures__Group_8__2__Impl : ( ( rule__VCSFeatures__Group_8_2__0 )* ) ;
    public final void rule__VCSFeatures__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1343:1: ( ( ( rule__VCSFeatures__Group_8_2__0 )* ) )
            // InternalVcsFeatures.g:1344:1: ( ( rule__VCSFeatures__Group_8_2__0 )* )
            {
            // InternalVcsFeatures.g:1344:1: ( ( rule__VCSFeatures__Group_8_2__0 )* )
            // InternalVcsFeatures.g:1345:2: ( rule__VCSFeatures__Group_8_2__0 )*
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_8_2()); 
            // InternalVcsFeatures.g:1346:2: ( rule__VCSFeatures__Group_8_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVcsFeatures.g:1346:3: rule__VCSFeatures__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VCSFeatures__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getVCSFeaturesAccess().getGroup_8_2()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_8__2__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_8_2__0"
    // InternalVcsFeatures.g:1355:1: rule__VCSFeatures__Group_8_2__0 : rule__VCSFeatures__Group_8_2__0__Impl rule__VCSFeatures__Group_8_2__1 ;
    public final void rule__VCSFeatures__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1359:1: ( rule__VCSFeatures__Group_8_2__0__Impl rule__VCSFeatures__Group_8_2__1 )
            // InternalVcsFeatures.g:1360:2: rule__VCSFeatures__Group_8_2__0__Impl rule__VCSFeatures__Group_8_2__1
            {
            pushFollow(FOLLOW_15);
            rule__VCSFeatures__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_8_2__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_8_2__0"


    // $ANTLR start "rule__VCSFeatures__Group_8_2__0__Impl"
    // InternalVcsFeatures.g:1367:1: rule__VCSFeatures__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__VCSFeatures__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1371:1: ( ( ',' ) )
            // InternalVcsFeatures.g:1372:1: ( ',' )
            {
            // InternalVcsFeatures.g:1372:1: ( ',' )
            // InternalVcsFeatures.g:1373:2: ','
            {
             before(grammarAccess.getVCSFeaturesAccess().getCommaKeyword_8_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getCommaKeyword_8_2_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_8_2__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_8_2__1"
    // InternalVcsFeatures.g:1382:1: rule__VCSFeatures__Group_8_2__1 : rule__VCSFeatures__Group_8_2__1__Impl ;
    public final void rule__VCSFeatures__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1386:1: ( rule__VCSFeatures__Group_8_2__1__Impl )
            // InternalVcsFeatures.g:1387:2: rule__VCSFeatures__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_8_2__1__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_8_2__1"


    // $ANTLR start "rule__VCSFeatures__Group_8_2__1__Impl"
    // InternalVcsFeatures.g:1393:1: rule__VCSFeatures__Group_8_2__1__Impl : ( ( rule__VCSFeatures__VersionunitAssignment_8_2_1 ) ) ;
    public final void rule__VCSFeatures__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1397:1: ( ( ( rule__VCSFeatures__VersionunitAssignment_8_2_1 ) ) )
            // InternalVcsFeatures.g:1398:1: ( ( rule__VCSFeatures__VersionunitAssignment_8_2_1 ) )
            {
            // InternalVcsFeatures.g:1398:1: ( ( rule__VCSFeatures__VersionunitAssignment_8_2_1 ) )
            // InternalVcsFeatures.g:1399:2: ( rule__VCSFeatures__VersionunitAssignment_8_2_1 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getVersionunitAssignment_8_2_1()); 
            // InternalVcsFeatures.g:1400:2: ( rule__VCSFeatures__VersionunitAssignment_8_2_1 )
            // InternalVcsFeatures.g:1400:3: rule__VCSFeatures__VersionunitAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__VersionunitAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getVersionunitAssignment_8_2_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_8_2__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_10__0"
    // InternalVcsFeatures.g:1409:1: rule__VCSFeatures__Group_10__0 : rule__VCSFeatures__Group_10__0__Impl rule__VCSFeatures__Group_10__1 ;
    public final void rule__VCSFeatures__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1413:1: ( rule__VCSFeatures__Group_10__0__Impl rule__VCSFeatures__Group_10__1 )
            // InternalVcsFeatures.g:1414:2: rule__VCSFeatures__Group_10__0__Impl rule__VCSFeatures__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__VCSFeatures__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_10__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_10__0"


    // $ANTLR start "rule__VCSFeatures__Group_10__0__Impl"
    // InternalVcsFeatures.g:1421:1: rule__VCSFeatures__Group_10__0__Impl : ( 'COLLABORATION' ) ;
    public final void rule__VCSFeatures__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1425:1: ( ( 'COLLABORATION' ) )
            // InternalVcsFeatures.g:1426:1: ( 'COLLABORATION' )
            {
            // InternalVcsFeatures.g:1426:1: ( 'COLLABORATION' )
            // InternalVcsFeatures.g:1427:2: 'COLLABORATION'
            {
             before(grammarAccess.getVCSFeaturesAccess().getCOLLABORATIONKeyword_10_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getCOLLABORATIONKeyword_10_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_10__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_10__1"
    // InternalVcsFeatures.g:1436:1: rule__VCSFeatures__Group_10__1 : rule__VCSFeatures__Group_10__1__Impl rule__VCSFeatures__Group_10__2 ;
    public final void rule__VCSFeatures__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1440:1: ( rule__VCSFeatures__Group_10__1__Impl rule__VCSFeatures__Group_10__2 )
            // InternalVcsFeatures.g:1441:2: rule__VCSFeatures__Group_10__1__Impl rule__VCSFeatures__Group_10__2
            {
            pushFollow(FOLLOW_17);
            rule__VCSFeatures__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_10__2();

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
    // $ANTLR end "rule__VCSFeatures__Group_10__1"


    // $ANTLR start "rule__VCSFeatures__Group_10__1__Impl"
    // InternalVcsFeatures.g:1448:1: rule__VCSFeatures__Group_10__1__Impl : ( 'STYLE' ) ;
    public final void rule__VCSFeatures__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1452:1: ( ( 'STYLE' ) )
            // InternalVcsFeatures.g:1453:1: ( 'STYLE' )
            {
            // InternalVcsFeatures.g:1453:1: ( 'STYLE' )
            // InternalVcsFeatures.g:1454:2: 'STYLE'
            {
             before(grammarAccess.getVCSFeaturesAccess().getSTYLEKeyword_10_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getSTYLEKeyword_10_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_10__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_10__2"
    // InternalVcsFeatures.g:1463:1: rule__VCSFeatures__Group_10__2 : rule__VCSFeatures__Group_10__2__Impl rule__VCSFeatures__Group_10__3 ;
    public final void rule__VCSFeatures__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1467:1: ( rule__VCSFeatures__Group_10__2__Impl rule__VCSFeatures__Group_10__3 )
            // InternalVcsFeatures.g:1468:2: rule__VCSFeatures__Group_10__2__Impl rule__VCSFeatures__Group_10__3
            {
            pushFollow(FOLLOW_12);
            rule__VCSFeatures__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_10__3();

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
    // $ANTLR end "rule__VCSFeatures__Group_10__2"


    // $ANTLR start "rule__VCSFeatures__Group_10__2__Impl"
    // InternalVcsFeatures.g:1475:1: rule__VCSFeatures__Group_10__2__Impl : ( ( rule__VCSFeatures__CollaborationstyleAssignment_10_2 ) ) ;
    public final void rule__VCSFeatures__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1479:1: ( ( ( rule__VCSFeatures__CollaborationstyleAssignment_10_2 ) ) )
            // InternalVcsFeatures.g:1480:1: ( ( rule__VCSFeatures__CollaborationstyleAssignment_10_2 ) )
            {
            // InternalVcsFeatures.g:1480:1: ( ( rule__VCSFeatures__CollaborationstyleAssignment_10_2 ) )
            // InternalVcsFeatures.g:1481:2: ( rule__VCSFeatures__CollaborationstyleAssignment_10_2 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleAssignment_10_2()); 
            // InternalVcsFeatures.g:1482:2: ( rule__VCSFeatures__CollaborationstyleAssignment_10_2 )
            // InternalVcsFeatures.g:1482:3: rule__VCSFeatures__CollaborationstyleAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__CollaborationstyleAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleAssignment_10_2()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_10__2__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_10__3"
    // InternalVcsFeatures.g:1490:1: rule__VCSFeatures__Group_10__3 : rule__VCSFeatures__Group_10__3__Impl ;
    public final void rule__VCSFeatures__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1494:1: ( rule__VCSFeatures__Group_10__3__Impl )
            // InternalVcsFeatures.g:1495:2: rule__VCSFeatures__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_10__3__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_10__3"


    // $ANTLR start "rule__VCSFeatures__Group_10__3__Impl"
    // InternalVcsFeatures.g:1501:1: rule__VCSFeatures__Group_10__3__Impl : ( ( rule__VCSFeatures__Group_10_3__0 )* ) ;
    public final void rule__VCSFeatures__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1505:1: ( ( ( rule__VCSFeatures__Group_10_3__0 )* ) )
            // InternalVcsFeatures.g:1506:1: ( ( rule__VCSFeatures__Group_10_3__0 )* )
            {
            // InternalVcsFeatures.g:1506:1: ( ( rule__VCSFeatures__Group_10_3__0 )* )
            // InternalVcsFeatures.g:1507:2: ( rule__VCSFeatures__Group_10_3__0 )*
            {
             before(grammarAccess.getVCSFeaturesAccess().getGroup_10_3()); 
            // InternalVcsFeatures.g:1508:2: ( rule__VCSFeatures__Group_10_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalVcsFeatures.g:1508:3: rule__VCSFeatures__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VCSFeatures__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getVCSFeaturesAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_10__3__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_10_3__0"
    // InternalVcsFeatures.g:1517:1: rule__VCSFeatures__Group_10_3__0 : rule__VCSFeatures__Group_10_3__0__Impl rule__VCSFeatures__Group_10_3__1 ;
    public final void rule__VCSFeatures__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1521:1: ( rule__VCSFeatures__Group_10_3__0__Impl rule__VCSFeatures__Group_10_3__1 )
            // InternalVcsFeatures.g:1522:2: rule__VCSFeatures__Group_10_3__0__Impl rule__VCSFeatures__Group_10_3__1
            {
            pushFollow(FOLLOW_17);
            rule__VCSFeatures__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_10_3__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_10_3__0"


    // $ANTLR start "rule__VCSFeatures__Group_10_3__0__Impl"
    // InternalVcsFeatures.g:1529:1: rule__VCSFeatures__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__VCSFeatures__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1533:1: ( ( ',' ) )
            // InternalVcsFeatures.g:1534:1: ( ',' )
            {
            // InternalVcsFeatures.g:1534:1: ( ',' )
            // InternalVcsFeatures.g:1535:2: ','
            {
             before(grammarAccess.getVCSFeaturesAccess().getCommaKeyword_10_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_10_3__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_10_3__1"
    // InternalVcsFeatures.g:1544:1: rule__VCSFeatures__Group_10_3__1 : rule__VCSFeatures__Group_10_3__1__Impl ;
    public final void rule__VCSFeatures__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1548:1: ( rule__VCSFeatures__Group_10_3__1__Impl )
            // InternalVcsFeatures.g:1549:2: rule__VCSFeatures__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_10_3__1"


    // $ANTLR start "rule__VCSFeatures__Group_10_3__1__Impl"
    // InternalVcsFeatures.g:1555:1: rule__VCSFeatures__Group_10_3__1__Impl : ( ( rule__VCSFeatures__CollaborationstyleAssignment_10_3_1 ) ) ;
    public final void rule__VCSFeatures__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1559:1: ( ( ( rule__VCSFeatures__CollaborationstyleAssignment_10_3_1 ) ) )
            // InternalVcsFeatures.g:1560:1: ( ( rule__VCSFeatures__CollaborationstyleAssignment_10_3_1 ) )
            {
            // InternalVcsFeatures.g:1560:1: ( ( rule__VCSFeatures__CollaborationstyleAssignment_10_3_1 ) )
            // InternalVcsFeatures.g:1561:2: ( rule__VCSFeatures__CollaborationstyleAssignment_10_3_1 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleAssignment_10_3_1()); 
            // InternalVcsFeatures.g:1562:2: ( rule__VCSFeatures__CollaborationstyleAssignment_10_3_1 )
            // InternalVcsFeatures.g:1562:3: rule__VCSFeatures__CollaborationstyleAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__CollaborationstyleAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleAssignment_10_3_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_10_3__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_12__0"
    // InternalVcsFeatures.g:1571:1: rule__VCSFeatures__Group_12__0 : rule__VCSFeatures__Group_12__0__Impl rule__VCSFeatures__Group_12__1 ;
    public final void rule__VCSFeatures__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1575:1: ( rule__VCSFeatures__Group_12__0__Impl rule__VCSFeatures__Group_12__1 )
            // InternalVcsFeatures.g:1576:2: rule__VCSFeatures__Group_12__0__Impl rule__VCSFeatures__Group_12__1
            {
            pushFollow(FOLLOW_18);
            rule__VCSFeatures__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_12__1();

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
    // $ANTLR end "rule__VCSFeatures__Group_12__0"


    // $ANTLR start "rule__VCSFeatures__Group_12__0__Impl"
    // InternalVcsFeatures.g:1583:1: rule__VCSFeatures__Group_12__0__Impl : ( 'DATABASES' ) ;
    public final void rule__VCSFeatures__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1587:1: ( ( 'DATABASES' ) )
            // InternalVcsFeatures.g:1588:1: ( 'DATABASES' )
            {
            // InternalVcsFeatures.g:1588:1: ( 'DATABASES' )
            // InternalVcsFeatures.g:1589:2: 'DATABASES'
            {
             before(grammarAccess.getVCSFeaturesAccess().getDATABASESKeyword_12_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getVCSFeaturesAccess().getDATABASESKeyword_12_0()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_12__0__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_12__1"
    // InternalVcsFeatures.g:1598:1: rule__VCSFeatures__Group_12__1 : rule__VCSFeatures__Group_12__1__Impl rule__VCSFeatures__Group_12__2 ;
    public final void rule__VCSFeatures__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1602:1: ( rule__VCSFeatures__Group_12__1__Impl rule__VCSFeatures__Group_12__2 )
            // InternalVcsFeatures.g:1603:2: rule__VCSFeatures__Group_12__1__Impl rule__VCSFeatures__Group_12__2
            {
            pushFollow(FOLLOW_18);
            rule__VCSFeatures__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_12__2();

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
    // $ANTLR end "rule__VCSFeatures__Group_12__1"


    // $ANTLR start "rule__VCSFeatures__Group_12__1__Impl"
    // InternalVcsFeatures.g:1610:1: rule__VCSFeatures__Group_12__1__Impl : ( ( rule__VCSFeatures__DatabaseAssignment_12_1 ) ) ;
    public final void rule__VCSFeatures__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1614:1: ( ( ( rule__VCSFeatures__DatabaseAssignment_12_1 ) ) )
            // InternalVcsFeatures.g:1615:1: ( ( rule__VCSFeatures__DatabaseAssignment_12_1 ) )
            {
            // InternalVcsFeatures.g:1615:1: ( ( rule__VCSFeatures__DatabaseAssignment_12_1 ) )
            // InternalVcsFeatures.g:1616:2: ( rule__VCSFeatures__DatabaseAssignment_12_1 )
            {
             before(grammarAccess.getVCSFeaturesAccess().getDatabaseAssignment_12_1()); 
            // InternalVcsFeatures.g:1617:2: ( rule__VCSFeatures__DatabaseAssignment_12_1 )
            // InternalVcsFeatures.g:1617:3: rule__VCSFeatures__DatabaseAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__DatabaseAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getVCSFeaturesAccess().getDatabaseAssignment_12_1()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_12__1__Impl"


    // $ANTLR start "rule__VCSFeatures__Group_12__2"
    // InternalVcsFeatures.g:1625:1: rule__VCSFeatures__Group_12__2 : rule__VCSFeatures__Group_12__2__Impl ;
    public final void rule__VCSFeatures__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1629:1: ( rule__VCSFeatures__Group_12__2__Impl )
            // InternalVcsFeatures.g:1630:2: rule__VCSFeatures__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VCSFeatures__Group_12__2__Impl();

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
    // $ANTLR end "rule__VCSFeatures__Group_12__2"


    // $ANTLR start "rule__VCSFeatures__Group_12__2__Impl"
    // InternalVcsFeatures.g:1636:1: rule__VCSFeatures__Group_12__2__Impl : ( ( rule__VCSFeatures__DatabaseAssignment_12_2 )* ) ;
    public final void rule__VCSFeatures__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1640:1: ( ( ( rule__VCSFeatures__DatabaseAssignment_12_2 )* ) )
            // InternalVcsFeatures.g:1641:1: ( ( rule__VCSFeatures__DatabaseAssignment_12_2 )* )
            {
            // InternalVcsFeatures.g:1641:1: ( ( rule__VCSFeatures__DatabaseAssignment_12_2 )* )
            // InternalVcsFeatures.g:1642:2: ( rule__VCSFeatures__DatabaseAssignment_12_2 )*
            {
             before(grammarAccess.getVCSFeaturesAccess().getDatabaseAssignment_12_2()); 
            // InternalVcsFeatures.g:1643:2: ( rule__VCSFeatures__DatabaseAssignment_12_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==68) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVcsFeatures.g:1643:3: rule__VCSFeatures__DatabaseAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__VCSFeatures__DatabaseAssignment_12_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getVCSFeaturesAccess().getDatabaseAssignment_12_2()); 

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
    // $ANTLR end "rule__VCSFeatures__Group_12__2__Impl"


    // $ANTLR start "rule__Commands__Group__0"
    // InternalVcsFeatures.g:1652:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1656:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // InternalVcsFeatures.g:1657:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Commands__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group__1();

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
    // $ANTLR end "rule__Commands__Group__0"


    // $ANTLR start "rule__Commands__Group__0__Impl"
    // InternalVcsFeatures.g:1664:1: rule__Commands__Group__0__Impl : ( () ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1668:1: ( ( () ) )
            // InternalVcsFeatures.g:1669:1: ( () )
            {
            // InternalVcsFeatures.g:1669:1: ( () )
            // InternalVcsFeatures.g:1670:2: ()
            {
             before(grammarAccess.getCommandsAccess().getCommandsAction_0()); 
            // InternalVcsFeatures.g:1671:2: ()
            // InternalVcsFeatures.g:1671:3: 
            {
            }

             after(grammarAccess.getCommandsAccess().getCommandsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0__Impl"


    // $ANTLR start "rule__Commands__Group__1"
    // InternalVcsFeatures.g:1679:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl rule__Commands__Group__2 ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1683:1: ( rule__Commands__Group__1__Impl rule__Commands__Group__2 )
            // InternalVcsFeatures.g:1684:2: rule__Commands__Group__1__Impl rule__Commands__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Commands__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group__2();

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
    // $ANTLR end "rule__Commands__Group__1"


    // $ANTLR start "rule__Commands__Group__1__Impl"
    // InternalVcsFeatures.g:1691:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )? ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1695:1: ( ( ( rule__Commands__Group_1__0 )? ) )
            // InternalVcsFeatures.g:1696:1: ( ( rule__Commands__Group_1__0 )? )
            {
            // InternalVcsFeatures.g:1696:1: ( ( rule__Commands__Group_1__0 )? )
            // InternalVcsFeatures.g:1697:2: ( rule__Commands__Group_1__0 )?
            {
             before(grammarAccess.getCommandsAccess().getGroup_1()); 
            // InternalVcsFeatures.g:1698:2: ( rule__Commands__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==50) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVcsFeatures.g:1698:3: rule__Commands__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Commands__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Commands__Group__1__Impl"


    // $ANTLR start "rule__Commands__Group__2"
    // InternalVcsFeatures.g:1706:1: rule__Commands__Group__2 : rule__Commands__Group__2__Impl rule__Commands__Group__3 ;
    public final void rule__Commands__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1710:1: ( rule__Commands__Group__2__Impl rule__Commands__Group__3 )
            // InternalVcsFeatures.g:1711:2: rule__Commands__Group__2__Impl rule__Commands__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Commands__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group__3();

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
    // $ANTLR end "rule__Commands__Group__2"


    // $ANTLR start "rule__Commands__Group__2__Impl"
    // InternalVcsFeatures.g:1718:1: rule__Commands__Group__2__Impl : ( ( rule__Commands__Group_2__0 )? ) ;
    public final void rule__Commands__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1722:1: ( ( ( rule__Commands__Group_2__0 )? ) )
            // InternalVcsFeatures.g:1723:1: ( ( rule__Commands__Group_2__0 )? )
            {
            // InternalVcsFeatures.g:1723:1: ( ( rule__Commands__Group_2__0 )? )
            // InternalVcsFeatures.g:1724:2: ( rule__Commands__Group_2__0 )?
            {
             before(grammarAccess.getCommandsAccess().getGroup_2()); 
            // InternalVcsFeatures.g:1725:2: ( rule__Commands__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVcsFeatures.g:1725:3: rule__Commands__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Commands__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Commands__Group__2__Impl"


    // $ANTLR start "rule__Commands__Group__3"
    // InternalVcsFeatures.g:1733:1: rule__Commands__Group__3 : rule__Commands__Group__3__Impl ;
    public final void rule__Commands__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1737:1: ( rule__Commands__Group__3__Impl )
            // InternalVcsFeatures.g:1738:2: rule__Commands__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commands__Group__3__Impl();

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
    // $ANTLR end "rule__Commands__Group__3"


    // $ANTLR start "rule__Commands__Group__3__Impl"
    // InternalVcsFeatures.g:1744:1: rule__Commands__Group__3__Impl : ( ( rule__Commands__Group_3__0 )? ) ;
    public final void rule__Commands__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1748:1: ( ( ( rule__Commands__Group_3__0 )? ) )
            // InternalVcsFeatures.g:1749:1: ( ( rule__Commands__Group_3__0 )? )
            {
            // InternalVcsFeatures.g:1749:1: ( ( rule__Commands__Group_3__0 )? )
            // InternalVcsFeatures.g:1750:2: ( rule__Commands__Group_3__0 )?
            {
             before(grammarAccess.getCommandsAccess().getGroup_3()); 
            // InternalVcsFeatures.g:1751:2: ( rule__Commands__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVcsFeatures.g:1751:3: rule__Commands__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Commands__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Commands__Group__3__Impl"


    // $ANTLR start "rule__Commands__Group_1__0"
    // InternalVcsFeatures.g:1760:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1764:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // InternalVcsFeatures.g:1765:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_1__1();

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
    // $ANTLR end "rule__Commands__Group_1__0"


    // $ANTLR start "rule__Commands__Group_1__0__Impl"
    // InternalVcsFeatures.g:1772:1: rule__Commands__Group_1__0__Impl : ( 'Merge' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1776:1: ( ( 'Merge' ) )
            // InternalVcsFeatures.g:1777:1: ( 'Merge' )
            {
            // InternalVcsFeatures.g:1777:1: ( 'Merge' )
            // InternalVcsFeatures.g:1778:2: 'Merge'
            {
             before(grammarAccess.getCommandsAccess().getMergeKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getMergeKeyword_1_0()); 

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
    // $ANTLR end "rule__Commands__Group_1__0__Impl"


    // $ANTLR start "rule__Commands__Group_1__1"
    // InternalVcsFeatures.g:1787:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1791:1: ( rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 )
            // InternalVcsFeatures.g:1792:2: rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_1__2();

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
    // $ANTLR end "rule__Commands__Group_1__1"


    // $ANTLR start "rule__Commands__Group_1__1__Impl"
    // InternalVcsFeatures.g:1799:1: rule__Commands__Group_1__1__Impl : ( 'tool:' ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1803:1: ( ( 'tool:' ) )
            // InternalVcsFeatures.g:1804:1: ( 'tool:' )
            {
            // InternalVcsFeatures.g:1804:1: ( 'tool:' )
            // InternalVcsFeatures.g:1805:2: 'tool:'
            {
             before(grammarAccess.getCommandsAccess().getToolKeyword_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getToolKeyword_1_1()); 

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
    // $ANTLR end "rule__Commands__Group_1__1__Impl"


    // $ANTLR start "rule__Commands__Group_1__2"
    // InternalVcsFeatures.g:1814:1: rule__Commands__Group_1__2 : rule__Commands__Group_1__2__Impl ;
    public final void rule__Commands__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1818:1: ( rule__Commands__Group_1__2__Impl )
            // InternalVcsFeatures.g:1819:2: rule__Commands__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commands__Group_1__2__Impl();

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
    // $ANTLR end "rule__Commands__Group_1__2"


    // $ANTLR start "rule__Commands__Group_1__2__Impl"
    // InternalVcsFeatures.g:1825:1: rule__Commands__Group_1__2__Impl : ( ( rule__Commands__MergeStrategyAssignment_1_2 ) ) ;
    public final void rule__Commands__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1829:1: ( ( ( rule__Commands__MergeStrategyAssignment_1_2 ) ) )
            // InternalVcsFeatures.g:1830:1: ( ( rule__Commands__MergeStrategyAssignment_1_2 ) )
            {
            // InternalVcsFeatures.g:1830:1: ( ( rule__Commands__MergeStrategyAssignment_1_2 ) )
            // InternalVcsFeatures.g:1831:2: ( rule__Commands__MergeStrategyAssignment_1_2 )
            {
             before(grammarAccess.getCommandsAccess().getMergeStrategyAssignment_1_2()); 
            // InternalVcsFeatures.g:1832:2: ( rule__Commands__MergeStrategyAssignment_1_2 )
            // InternalVcsFeatures.g:1832:3: rule__Commands__MergeStrategyAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Commands__MergeStrategyAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCommandsAccess().getMergeStrategyAssignment_1_2()); 

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
    // $ANTLR end "rule__Commands__Group_1__2__Impl"


    // $ANTLR start "rule__Commands__Group_2__0"
    // InternalVcsFeatures.g:1841:1: rule__Commands__Group_2__0 : rule__Commands__Group_2__0__Impl rule__Commands__Group_2__1 ;
    public final void rule__Commands__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1845:1: ( rule__Commands__Group_2__0__Impl rule__Commands__Group_2__1 )
            // InternalVcsFeatures.g:1846:2: rule__Commands__Group_2__0__Impl rule__Commands__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Commands__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_2__1();

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
    // $ANTLR end "rule__Commands__Group_2__0"


    // $ANTLR start "rule__Commands__Group_2__0__Impl"
    // InternalVcsFeatures.g:1853:1: rule__Commands__Group_2__0__Impl : ( 'Basic' ) ;
    public final void rule__Commands__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1857:1: ( ( 'Basic' ) )
            // InternalVcsFeatures.g:1858:1: ( 'Basic' )
            {
            // InternalVcsFeatures.g:1858:1: ( 'Basic' )
            // InternalVcsFeatures.g:1859:2: 'Basic'
            {
             before(grammarAccess.getCommandsAccess().getBasicKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getBasicKeyword_2_0()); 

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
    // $ANTLR end "rule__Commands__Group_2__0__Impl"


    // $ANTLR start "rule__Commands__Group_2__1"
    // InternalVcsFeatures.g:1868:1: rule__Commands__Group_2__1 : rule__Commands__Group_2__1__Impl rule__Commands__Group_2__2 ;
    public final void rule__Commands__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1872:1: ( rule__Commands__Group_2__1__Impl rule__Commands__Group_2__2 )
            // InternalVcsFeatures.g:1873:2: rule__Commands__Group_2__1__Impl rule__Commands__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Commands__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_2__2();

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
    // $ANTLR end "rule__Commands__Group_2__1"


    // $ANTLR start "rule__Commands__Group_2__1__Impl"
    // InternalVcsFeatures.g:1880:1: rule__Commands__Group_2__1__Impl : ( 'command' ) ;
    public final void rule__Commands__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1884:1: ( ( 'command' ) )
            // InternalVcsFeatures.g:1885:1: ( 'command' )
            {
            // InternalVcsFeatures.g:1885:1: ( 'command' )
            // InternalVcsFeatures.g:1886:2: 'command'
            {
             before(grammarAccess.getCommandsAccess().getCommandKeyword_2_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getCommandKeyword_2_1()); 

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
    // $ANTLR end "rule__Commands__Group_2__1__Impl"


    // $ANTLR start "rule__Commands__Group_2__2"
    // InternalVcsFeatures.g:1895:1: rule__Commands__Group_2__2 : rule__Commands__Group_2__2__Impl rule__Commands__Group_2__3 ;
    public final void rule__Commands__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1899:1: ( rule__Commands__Group_2__2__Impl rule__Commands__Group_2__3 )
            // InternalVcsFeatures.g:1900:2: rule__Commands__Group_2__2__Impl rule__Commands__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__Commands__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_2__3();

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
    // $ANTLR end "rule__Commands__Group_2__2"


    // $ANTLR start "rule__Commands__Group_2__2__Impl"
    // InternalVcsFeatures.g:1907:1: rule__Commands__Group_2__2__Impl : ( 'declaration:' ) ;
    public final void rule__Commands__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1911:1: ( ( 'declaration:' ) )
            // InternalVcsFeatures.g:1912:1: ( 'declaration:' )
            {
            // InternalVcsFeatures.g:1912:1: ( 'declaration:' )
            // InternalVcsFeatures.g:1913:2: 'declaration:'
            {
             before(grammarAccess.getCommandsAccess().getDeclarationKeyword_2_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getDeclarationKeyword_2_2()); 

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
    // $ANTLR end "rule__Commands__Group_2__2__Impl"


    // $ANTLR start "rule__Commands__Group_2__3"
    // InternalVcsFeatures.g:1922:1: rule__Commands__Group_2__3 : rule__Commands__Group_2__3__Impl rule__Commands__Group_2__4 ;
    public final void rule__Commands__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1926:1: ( rule__Commands__Group_2__3__Impl rule__Commands__Group_2__4 )
            // InternalVcsFeatures.g:1927:2: rule__Commands__Group_2__3__Impl rule__Commands__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__Commands__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_2__4();

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
    // $ANTLR end "rule__Commands__Group_2__3"


    // $ANTLR start "rule__Commands__Group_2__3__Impl"
    // InternalVcsFeatures.g:1934:1: rule__Commands__Group_2__3__Impl : ( ( rule__Commands__LowlevelcommandAssignment_2_3 ) ) ;
    public final void rule__Commands__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1938:1: ( ( ( rule__Commands__LowlevelcommandAssignment_2_3 ) ) )
            // InternalVcsFeatures.g:1939:1: ( ( rule__Commands__LowlevelcommandAssignment_2_3 ) )
            {
            // InternalVcsFeatures.g:1939:1: ( ( rule__Commands__LowlevelcommandAssignment_2_3 ) )
            // InternalVcsFeatures.g:1940:2: ( rule__Commands__LowlevelcommandAssignment_2_3 )
            {
             before(grammarAccess.getCommandsAccess().getLowlevelcommandAssignment_2_3()); 
            // InternalVcsFeatures.g:1941:2: ( rule__Commands__LowlevelcommandAssignment_2_3 )
            // InternalVcsFeatures.g:1941:3: rule__Commands__LowlevelcommandAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Commands__LowlevelcommandAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getCommandsAccess().getLowlevelcommandAssignment_2_3()); 

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
    // $ANTLR end "rule__Commands__Group_2__3__Impl"


    // $ANTLR start "rule__Commands__Group_2__4"
    // InternalVcsFeatures.g:1949:1: rule__Commands__Group_2__4 : rule__Commands__Group_2__4__Impl ;
    public final void rule__Commands__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1953:1: ( rule__Commands__Group_2__4__Impl )
            // InternalVcsFeatures.g:1954:2: rule__Commands__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commands__Group_2__4__Impl();

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
    // $ANTLR end "rule__Commands__Group_2__4"


    // $ANTLR start "rule__Commands__Group_2__4__Impl"
    // InternalVcsFeatures.g:1960:1: rule__Commands__Group_2__4__Impl : ( ( rule__Commands__LowlevelcommandAssignment_2_4 )* ) ;
    public final void rule__Commands__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1964:1: ( ( ( rule__Commands__LowlevelcommandAssignment_2_4 )* ) )
            // InternalVcsFeatures.g:1965:1: ( ( rule__Commands__LowlevelcommandAssignment_2_4 )* )
            {
            // InternalVcsFeatures.g:1965:1: ( ( rule__Commands__LowlevelcommandAssignment_2_4 )* )
            // InternalVcsFeatures.g:1966:2: ( rule__Commands__LowlevelcommandAssignment_2_4 )*
            {
             before(grammarAccess.getCommandsAccess().getLowlevelcommandAssignment_2_4()); 
            // InternalVcsFeatures.g:1967:2: ( rule__Commands__LowlevelcommandAssignment_2_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==70) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalVcsFeatures.g:1967:3: rule__Commands__LowlevelcommandAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Commands__LowlevelcommandAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCommandsAccess().getLowlevelcommandAssignment_2_4()); 

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
    // $ANTLR end "rule__Commands__Group_2__4__Impl"


    // $ANTLR start "rule__Commands__Group_3__0"
    // InternalVcsFeatures.g:1976:1: rule__Commands__Group_3__0 : rule__Commands__Group_3__0__Impl rule__Commands__Group_3__1 ;
    public final void rule__Commands__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1980:1: ( rule__Commands__Group_3__0__Impl rule__Commands__Group_3__1 )
            // InternalVcsFeatures.g:1981:2: rule__Commands__Group_3__0__Impl rule__Commands__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Commands__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_3__1();

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
    // $ANTLR end "rule__Commands__Group_3__0"


    // $ANTLR start "rule__Commands__Group_3__0__Impl"
    // InternalVcsFeatures.g:1988:1: rule__Commands__Group_3__0__Impl : ( 'Super' ) ;
    public final void rule__Commands__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:1992:1: ( ( 'Super' ) )
            // InternalVcsFeatures.g:1993:1: ( 'Super' )
            {
            // InternalVcsFeatures.g:1993:1: ( 'Super' )
            // InternalVcsFeatures.g:1994:2: 'Super'
            {
             before(grammarAccess.getCommandsAccess().getSuperKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getSuperKeyword_3_0()); 

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
    // $ANTLR end "rule__Commands__Group_3__0__Impl"


    // $ANTLR start "rule__Commands__Group_3__1"
    // InternalVcsFeatures.g:2003:1: rule__Commands__Group_3__1 : rule__Commands__Group_3__1__Impl rule__Commands__Group_3__2 ;
    public final void rule__Commands__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2007:1: ( rule__Commands__Group_3__1__Impl rule__Commands__Group_3__2 )
            // InternalVcsFeatures.g:2008:2: rule__Commands__Group_3__1__Impl rule__Commands__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__Commands__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_3__2();

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
    // $ANTLR end "rule__Commands__Group_3__1"


    // $ANTLR start "rule__Commands__Group_3__1__Impl"
    // InternalVcsFeatures.g:2015:1: rule__Commands__Group_3__1__Impl : ( 'command' ) ;
    public final void rule__Commands__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2019:1: ( ( 'command' ) )
            // InternalVcsFeatures.g:2020:1: ( 'command' )
            {
            // InternalVcsFeatures.g:2020:1: ( 'command' )
            // InternalVcsFeatures.g:2021:2: 'command'
            {
             before(grammarAccess.getCommandsAccess().getCommandKeyword_3_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getCommandKeyword_3_1()); 

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
    // $ANTLR end "rule__Commands__Group_3__1__Impl"


    // $ANTLR start "rule__Commands__Group_3__2"
    // InternalVcsFeatures.g:2030:1: rule__Commands__Group_3__2 : rule__Commands__Group_3__2__Impl rule__Commands__Group_3__3 ;
    public final void rule__Commands__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2034:1: ( rule__Commands__Group_3__2__Impl rule__Commands__Group_3__3 )
            // InternalVcsFeatures.g:2035:2: rule__Commands__Group_3__2__Impl rule__Commands__Group_3__3
            {
            pushFollow(FOLLOW_24);
            rule__Commands__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_3__3();

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
    // $ANTLR end "rule__Commands__Group_3__2"


    // $ANTLR start "rule__Commands__Group_3__2__Impl"
    // InternalVcsFeatures.g:2042:1: rule__Commands__Group_3__2__Impl : ( 'declaration:' ) ;
    public final void rule__Commands__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2046:1: ( ( 'declaration:' ) )
            // InternalVcsFeatures.g:2047:1: ( 'declaration:' )
            {
            // InternalVcsFeatures.g:2047:1: ( 'declaration:' )
            // InternalVcsFeatures.g:2048:2: 'declaration:'
            {
             before(grammarAccess.getCommandsAccess().getDeclarationKeyword_3_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getDeclarationKeyword_3_2()); 

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
    // $ANTLR end "rule__Commands__Group_3__2__Impl"


    // $ANTLR start "rule__Commands__Group_3__3"
    // InternalVcsFeatures.g:2057:1: rule__Commands__Group_3__3 : rule__Commands__Group_3__3__Impl rule__Commands__Group_3__4 ;
    public final void rule__Commands__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2061:1: ( rule__Commands__Group_3__3__Impl rule__Commands__Group_3__4 )
            // InternalVcsFeatures.g:2062:2: rule__Commands__Group_3__3__Impl rule__Commands__Group_3__4
            {
            pushFollow(FOLLOW_24);
            rule__Commands__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_3__4();

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
    // $ANTLR end "rule__Commands__Group_3__3"


    // $ANTLR start "rule__Commands__Group_3__3__Impl"
    // InternalVcsFeatures.g:2069:1: rule__Commands__Group_3__3__Impl : ( ( rule__Commands__HighlevelcommandAssignment_3_3 ) ) ;
    public final void rule__Commands__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2073:1: ( ( ( rule__Commands__HighlevelcommandAssignment_3_3 ) ) )
            // InternalVcsFeatures.g:2074:1: ( ( rule__Commands__HighlevelcommandAssignment_3_3 ) )
            {
            // InternalVcsFeatures.g:2074:1: ( ( rule__Commands__HighlevelcommandAssignment_3_3 ) )
            // InternalVcsFeatures.g:2075:2: ( rule__Commands__HighlevelcommandAssignment_3_3 )
            {
             before(grammarAccess.getCommandsAccess().getHighlevelcommandAssignment_3_3()); 
            // InternalVcsFeatures.g:2076:2: ( rule__Commands__HighlevelcommandAssignment_3_3 )
            // InternalVcsFeatures.g:2076:3: rule__Commands__HighlevelcommandAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Commands__HighlevelcommandAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getCommandsAccess().getHighlevelcommandAssignment_3_3()); 

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
    // $ANTLR end "rule__Commands__Group_3__3__Impl"


    // $ANTLR start "rule__Commands__Group_3__4"
    // InternalVcsFeatures.g:2084:1: rule__Commands__Group_3__4 : rule__Commands__Group_3__4__Impl ;
    public final void rule__Commands__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2088:1: ( rule__Commands__Group_3__4__Impl )
            // InternalVcsFeatures.g:2089:2: rule__Commands__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commands__Group_3__4__Impl();

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
    // $ANTLR end "rule__Commands__Group_3__4"


    // $ANTLR start "rule__Commands__Group_3__4__Impl"
    // InternalVcsFeatures.g:2095:1: rule__Commands__Group_3__4__Impl : ( ( rule__Commands__HighlevelcommandAssignment_3_4 )* ) ;
    public final void rule__Commands__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2099:1: ( ( ( rule__Commands__HighlevelcommandAssignment_3_4 )* ) )
            // InternalVcsFeatures.g:2100:1: ( ( rule__Commands__HighlevelcommandAssignment_3_4 )* )
            {
            // InternalVcsFeatures.g:2100:1: ( ( rule__Commands__HighlevelcommandAssignment_3_4 )* )
            // InternalVcsFeatures.g:2101:2: ( rule__Commands__HighlevelcommandAssignment_3_4 )*
            {
             before(grammarAccess.getCommandsAccess().getHighlevelcommandAssignment_3_4()); 
            // InternalVcsFeatures.g:2102:2: ( rule__Commands__HighlevelcommandAssignment_3_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==70) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVcsFeatures.g:2102:3: rule__Commands__HighlevelcommandAssignment_3_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Commands__HighlevelcommandAssignment_3_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCommandsAccess().getHighlevelcommandAssignment_3_4()); 

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
    // $ANTLR end "rule__Commands__Group_3__4__Impl"


    // $ANTLR start "rule__History__Group__0"
    // InternalVcsFeatures.g:2111:1: rule__History__Group__0 : rule__History__Group__0__Impl rule__History__Group__1 ;
    public final void rule__History__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2115:1: ( rule__History__Group__0__Impl rule__History__Group__1 )
            // InternalVcsFeatures.g:2116:2: rule__History__Group__0__Impl rule__History__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__History__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group__1();

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
    // $ANTLR end "rule__History__Group__0"


    // $ANTLR start "rule__History__Group__0__Impl"
    // InternalVcsFeatures.g:2123:1: rule__History__Group__0__Impl : ( () ) ;
    public final void rule__History__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2127:1: ( ( () ) )
            // InternalVcsFeatures.g:2128:1: ( () )
            {
            // InternalVcsFeatures.g:2128:1: ( () )
            // InternalVcsFeatures.g:2129:2: ()
            {
             before(grammarAccess.getHistoryAccess().getHistoryAction_0()); 
            // InternalVcsFeatures.g:2130:2: ()
            // InternalVcsFeatures.g:2130:3: 
            {
            }

             after(grammarAccess.getHistoryAccess().getHistoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__History__Group__0__Impl"


    // $ANTLR start "rule__History__Group__1"
    // InternalVcsFeatures.g:2138:1: rule__History__Group__1 : rule__History__Group__1__Impl rule__History__Group__2 ;
    public final void rule__History__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2142:1: ( rule__History__Group__1__Impl rule__History__Group__2 )
            // InternalVcsFeatures.g:2143:2: rule__History__Group__1__Impl rule__History__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__History__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group__2();

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
    // $ANTLR end "rule__History__Group__1"


    // $ANTLR start "rule__History__Group__1__Impl"
    // InternalVcsFeatures.g:2150:1: rule__History__Group__1__Impl : ( ( rule__History__Group_1__0 )? ) ;
    public final void rule__History__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2154:1: ( ( ( rule__History__Group_1__0 )? ) )
            // InternalVcsFeatures.g:2155:1: ( ( rule__History__Group_1__0 )? )
            {
            // InternalVcsFeatures.g:2155:1: ( ( rule__History__Group_1__0 )? )
            // InternalVcsFeatures.g:2156:2: ( rule__History__Group_1__0 )?
            {
             before(grammarAccess.getHistoryAccess().getGroup_1()); 
            // InternalVcsFeatures.g:2157:2: ( rule__History__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVcsFeatures.g:2157:3: rule__History__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__History__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHistoryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__History__Group__1__Impl"


    // $ANTLR start "rule__History__Group__2"
    // InternalVcsFeatures.g:2165:1: rule__History__Group__2 : rule__History__Group__2__Impl rule__History__Group__3 ;
    public final void rule__History__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2169:1: ( rule__History__Group__2__Impl rule__History__Group__3 )
            // InternalVcsFeatures.g:2170:2: rule__History__Group__2__Impl rule__History__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__History__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group__3();

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
    // $ANTLR end "rule__History__Group__2"


    // $ANTLR start "rule__History__Group__2__Impl"
    // InternalVcsFeatures.g:2177:1: rule__History__Group__2__Impl : ( ( rule__History__Group_2__0 )? ) ;
    public final void rule__History__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2181:1: ( ( ( rule__History__Group_2__0 )? ) )
            // InternalVcsFeatures.g:2182:1: ( ( rule__History__Group_2__0 )? )
            {
            // InternalVcsFeatures.g:2182:1: ( ( rule__History__Group_2__0 )? )
            // InternalVcsFeatures.g:2183:2: ( rule__History__Group_2__0 )?
            {
             before(grammarAccess.getHistoryAccess().getGroup_2()); 
            // InternalVcsFeatures.g:2184:2: ( rule__History__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==58) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVcsFeatures.g:2184:3: rule__History__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__History__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHistoryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__History__Group__2__Impl"


    // $ANTLR start "rule__History__Group__3"
    // InternalVcsFeatures.g:2192:1: rule__History__Group__3 : rule__History__Group__3__Impl ;
    public final void rule__History__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2196:1: ( rule__History__Group__3__Impl )
            // InternalVcsFeatures.g:2197:2: rule__History__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__History__Group__3__Impl();

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
    // $ANTLR end "rule__History__Group__3"


    // $ANTLR start "rule__History__Group__3__Impl"
    // InternalVcsFeatures.g:2203:1: rule__History__Group__3__Impl : ( ( rule__History__Group_3__0 )? ) ;
    public final void rule__History__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2207:1: ( ( ( rule__History__Group_3__0 )? ) )
            // InternalVcsFeatures.g:2208:1: ( ( rule__History__Group_3__0 )? )
            {
            // InternalVcsFeatures.g:2208:1: ( ( rule__History__Group_3__0 )? )
            // InternalVcsFeatures.g:2209:2: ( rule__History__Group_3__0 )?
            {
             before(grammarAccess.getHistoryAccess().getGroup_3()); 
            // InternalVcsFeatures.g:2210:2: ( rule__History__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==61) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVcsFeatures.g:2210:3: rule__History__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__History__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHistoryAccess().getGroup_3()); 

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
    // $ANTLR end "rule__History__Group__3__Impl"


    // $ANTLR start "rule__History__Group_1__0"
    // InternalVcsFeatures.g:2219:1: rule__History__Group_1__0 : rule__History__Group_1__0__Impl rule__History__Group_1__1 ;
    public final void rule__History__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2223:1: ( rule__History__Group_1__0__Impl rule__History__Group_1__1 )
            // InternalVcsFeatures.g:2224:2: rule__History__Group_1__0__Impl rule__History__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__History__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_1__1();

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
    // $ANTLR end "rule__History__Group_1__0"


    // $ANTLR start "rule__History__Group_1__0__Impl"
    // InternalVcsFeatures.g:2231:1: rule__History__Group_1__0__Impl : ( 'Identifying' ) ;
    public final void rule__History__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2235:1: ( ( 'Identifying' ) )
            // InternalVcsFeatures.g:2236:1: ( 'Identifying' )
            {
            // InternalVcsFeatures.g:2236:1: ( 'Identifying' )
            // InternalVcsFeatures.g:2237:2: 'Identifying'
            {
             before(grammarAccess.getHistoryAccess().getIdentifyingKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getIdentifyingKeyword_1_0()); 

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
    // $ANTLR end "rule__History__Group_1__0__Impl"


    // $ANTLR start "rule__History__Group_1__1"
    // InternalVcsFeatures.g:2246:1: rule__History__Group_1__1 : rule__History__Group_1__1__Impl rule__History__Group_1__2 ;
    public final void rule__History__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2250:1: ( rule__History__Group_1__1__Impl rule__History__Group_1__2 )
            // InternalVcsFeatures.g:2251:2: rule__History__Group_1__1__Impl rule__History__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__History__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_1__2();

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
    // $ANTLR end "rule__History__Group_1__1"


    // $ANTLR start "rule__History__Group_1__1__Impl"
    // InternalVcsFeatures.g:2258:1: rule__History__Group_1__1__Impl : ( 'label:' ) ;
    public final void rule__History__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2262:1: ( ( 'label:' ) )
            // InternalVcsFeatures.g:2263:1: ( 'label:' )
            {
            // InternalVcsFeatures.g:2263:1: ( 'label:' )
            // InternalVcsFeatures.g:2264:2: 'label:'
            {
             before(grammarAccess.getHistoryAccess().getLabelKeyword_1_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getLabelKeyword_1_1()); 

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
    // $ANTLR end "rule__History__Group_1__1__Impl"


    // $ANTLR start "rule__History__Group_1__2"
    // InternalVcsFeatures.g:2273:1: rule__History__Group_1__2 : rule__History__Group_1__2__Impl ;
    public final void rule__History__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2277:1: ( rule__History__Group_1__2__Impl )
            // InternalVcsFeatures.g:2278:2: rule__History__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__History__Group_1__2__Impl();

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
    // $ANTLR end "rule__History__Group_1__2"


    // $ANTLR start "rule__History__Group_1__2__Impl"
    // InternalVcsFeatures.g:2284:1: rule__History__Group_1__2__Impl : ( ( rule__History__LabelTypeAssignment_1_2 ) ) ;
    public final void rule__History__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2288:1: ( ( ( rule__History__LabelTypeAssignment_1_2 ) ) )
            // InternalVcsFeatures.g:2289:1: ( ( rule__History__LabelTypeAssignment_1_2 ) )
            {
            // InternalVcsFeatures.g:2289:1: ( ( rule__History__LabelTypeAssignment_1_2 ) )
            // InternalVcsFeatures.g:2290:2: ( rule__History__LabelTypeAssignment_1_2 )
            {
             before(grammarAccess.getHistoryAccess().getLabelTypeAssignment_1_2()); 
            // InternalVcsFeatures.g:2291:2: ( rule__History__LabelTypeAssignment_1_2 )
            // InternalVcsFeatures.g:2291:3: rule__History__LabelTypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__History__LabelTypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHistoryAccess().getLabelTypeAssignment_1_2()); 

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
    // $ANTLR end "rule__History__Group_1__2__Impl"


    // $ANTLR start "rule__History__Group_2__0"
    // InternalVcsFeatures.g:2300:1: rule__History__Group_2__0 : rule__History__Group_2__0__Impl rule__History__Group_2__1 ;
    public final void rule__History__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2304:1: ( rule__History__Group_2__0__Impl rule__History__Group_2__1 )
            // InternalVcsFeatures.g:2305:2: rule__History__Group_2__0__Impl rule__History__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__History__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_2__1();

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
    // $ANTLR end "rule__History__Group_2__0"


    // $ANTLR start "rule__History__Group_2__0__Impl"
    // InternalVcsFeatures.g:2312:1: rule__History__Group_2__0__Impl : ( 'Version' ) ;
    public final void rule__History__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2316:1: ( ( 'Version' ) )
            // InternalVcsFeatures.g:2317:1: ( 'Version' )
            {
            // InternalVcsFeatures.g:2317:1: ( 'Version' )
            // InternalVcsFeatures.g:2318:2: 'Version'
            {
             before(grammarAccess.getHistoryAccess().getVersionKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getVersionKeyword_2_0()); 

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
    // $ANTLR end "rule__History__Group_2__0__Impl"


    // $ANTLR start "rule__History__Group_2__1"
    // InternalVcsFeatures.g:2327:1: rule__History__Group_2__1 : rule__History__Group_2__1__Impl rule__History__Group_2__2 ;
    public final void rule__History__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2331:1: ( rule__History__Group_2__1__Impl rule__History__Group_2__2 )
            // InternalVcsFeatures.g:2332:2: rule__History__Group_2__1__Impl rule__History__Group_2__2
            {
            pushFollow(FOLLOW_29);
            rule__History__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_2__2();

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
    // $ANTLR end "rule__History__Group_2__1"


    // $ANTLR start "rule__History__Group_2__1__Impl"
    // InternalVcsFeatures.g:2339:1: rule__History__Group_2__1__Impl : ( 'history' ) ;
    public final void rule__History__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2343:1: ( ( 'history' ) )
            // InternalVcsFeatures.g:2344:1: ( 'history' )
            {
            // InternalVcsFeatures.g:2344:1: ( 'history' )
            // InternalVcsFeatures.g:2345:2: 'history'
            {
             before(grammarAccess.getHistoryAccess().getHistoryKeyword_2_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getHistoryKeyword_2_1()); 

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
    // $ANTLR end "rule__History__Group_2__1__Impl"


    // $ANTLR start "rule__History__Group_2__2"
    // InternalVcsFeatures.g:2354:1: rule__History__Group_2__2 : rule__History__Group_2__2__Impl rule__History__Group_2__3 ;
    public final void rule__History__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2358:1: ( rule__History__Group_2__2__Impl rule__History__Group_2__3 )
            // InternalVcsFeatures.g:2359:2: rule__History__Group_2__2__Impl rule__History__Group_2__3
            {
            pushFollow(FOLLOW_30);
            rule__History__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_2__3();

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
    // $ANTLR end "rule__History__Group_2__2"


    // $ANTLR start "rule__History__Group_2__2__Impl"
    // InternalVcsFeatures.g:2366:1: rule__History__Group_2__2__Impl : ( 'backlog:' ) ;
    public final void rule__History__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2370:1: ( ( 'backlog:' ) )
            // InternalVcsFeatures.g:2371:1: ( 'backlog:' )
            {
            // InternalVcsFeatures.g:2371:1: ( 'backlog:' )
            // InternalVcsFeatures.g:2372:2: 'backlog:'
            {
             before(grammarAccess.getHistoryAccess().getBacklogKeyword_2_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getBacklogKeyword_2_2()); 

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
    // $ANTLR end "rule__History__Group_2__2__Impl"


    // $ANTLR start "rule__History__Group_2__3"
    // InternalVcsFeatures.g:2381:1: rule__History__Group_2__3 : rule__History__Group_2__3__Impl ;
    public final void rule__History__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2385:1: ( rule__History__Group_2__3__Impl )
            // InternalVcsFeatures.g:2386:2: rule__History__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__History__Group_2__3__Impl();

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
    // $ANTLR end "rule__History__Group_2__3"


    // $ANTLR start "rule__History__Group_2__3__Impl"
    // InternalVcsFeatures.g:2392:1: rule__History__Group_2__3__Impl : ( ( rule__History__CommitHistoryRangeAssignment_2_3 ) ) ;
    public final void rule__History__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2396:1: ( ( ( rule__History__CommitHistoryRangeAssignment_2_3 ) ) )
            // InternalVcsFeatures.g:2397:1: ( ( rule__History__CommitHistoryRangeAssignment_2_3 ) )
            {
            // InternalVcsFeatures.g:2397:1: ( ( rule__History__CommitHistoryRangeAssignment_2_3 ) )
            // InternalVcsFeatures.g:2398:2: ( rule__History__CommitHistoryRangeAssignment_2_3 )
            {
             before(grammarAccess.getHistoryAccess().getCommitHistoryRangeAssignment_2_3()); 
            // InternalVcsFeatures.g:2399:2: ( rule__History__CommitHistoryRangeAssignment_2_3 )
            // InternalVcsFeatures.g:2399:3: rule__History__CommitHistoryRangeAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__History__CommitHistoryRangeAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getHistoryAccess().getCommitHistoryRangeAssignment_2_3()); 

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
    // $ANTLR end "rule__History__Group_2__3__Impl"


    // $ANTLR start "rule__History__Group_3__0"
    // InternalVcsFeatures.g:2408:1: rule__History__Group_3__0 : rule__History__Group_3__0__Impl rule__History__Group_3__1 ;
    public final void rule__History__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2412:1: ( rule__History__Group_3__0__Impl rule__History__Group_3__1 )
            // InternalVcsFeatures.g:2413:2: rule__History__Group_3__0__Impl rule__History__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__History__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_3__1();

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
    // $ANTLR end "rule__History__Group_3__0"


    // $ANTLR start "rule__History__Group_3__0__Impl"
    // InternalVcsFeatures.g:2420:1: rule__History__Group_3__0__Impl : ( 'Maximum' ) ;
    public final void rule__History__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2424:1: ( ( 'Maximum' ) )
            // InternalVcsFeatures.g:2425:1: ( 'Maximum' )
            {
            // InternalVcsFeatures.g:2425:1: ( 'Maximum' )
            // InternalVcsFeatures.g:2426:2: 'Maximum'
            {
             before(grammarAccess.getHistoryAccess().getMaximumKeyword_3_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getMaximumKeyword_3_0()); 

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
    // $ANTLR end "rule__History__Group_3__0__Impl"


    // $ANTLR start "rule__History__Group_3__1"
    // InternalVcsFeatures.g:2435:1: rule__History__Group_3__1 : rule__History__Group_3__1__Impl rule__History__Group_3__2 ;
    public final void rule__History__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2439:1: ( rule__History__Group_3__1__Impl rule__History__Group_3__2 )
            // InternalVcsFeatures.g:2440:2: rule__History__Group_3__1__Impl rule__History__Group_3__2
            {
            pushFollow(FOLLOW_32);
            rule__History__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_3__2();

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
    // $ANTLR end "rule__History__Group_3__1"


    // $ANTLR start "rule__History__Group_3__1__Impl"
    // InternalVcsFeatures.g:2447:1: rule__History__Group_3__1__Impl : ( 'number' ) ;
    public final void rule__History__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2451:1: ( ( 'number' ) )
            // InternalVcsFeatures.g:2452:1: ( 'number' )
            {
            // InternalVcsFeatures.g:2452:1: ( 'number' )
            // InternalVcsFeatures.g:2453:2: 'number'
            {
             before(grammarAccess.getHistoryAccess().getNumberKeyword_3_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getNumberKeyword_3_1()); 

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
    // $ANTLR end "rule__History__Group_3__1__Impl"


    // $ANTLR start "rule__History__Group_3__2"
    // InternalVcsFeatures.g:2462:1: rule__History__Group_3__2 : rule__History__Group_3__2__Impl rule__History__Group_3__3 ;
    public final void rule__History__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2466:1: ( rule__History__Group_3__2__Impl rule__History__Group_3__3 )
            // InternalVcsFeatures.g:2467:2: rule__History__Group_3__2__Impl rule__History__Group_3__3
            {
            pushFollow(FOLLOW_33);
            rule__History__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_3__3();

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
    // $ANTLR end "rule__History__Group_3__2"


    // $ANTLR start "rule__History__Group_3__2__Impl"
    // InternalVcsFeatures.g:2474:1: rule__History__Group_3__2__Impl : ( 'of' ) ;
    public final void rule__History__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2478:1: ( ( 'of' ) )
            // InternalVcsFeatures.g:2479:1: ( 'of' )
            {
            // InternalVcsFeatures.g:2479:1: ( 'of' )
            // InternalVcsFeatures.g:2480:2: 'of'
            {
             before(grammarAccess.getHistoryAccess().getOfKeyword_3_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getOfKeyword_3_2()); 

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
    // $ANTLR end "rule__History__Group_3__2__Impl"


    // $ANTLR start "rule__History__Group_3__3"
    // InternalVcsFeatures.g:2489:1: rule__History__Group_3__3 : rule__History__Group_3__3__Impl rule__History__Group_3__4 ;
    public final void rule__History__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2493:1: ( rule__History__Group_3__3__Impl rule__History__Group_3__4 )
            // InternalVcsFeatures.g:2494:2: rule__History__Group_3__3__Impl rule__History__Group_3__4
            {
            pushFollow(FOLLOW_30);
            rule__History__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__History__Group_3__4();

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
    // $ANTLR end "rule__History__Group_3__3"


    // $ANTLR start "rule__History__Group_3__3__Impl"
    // InternalVcsFeatures.g:2501:1: rule__History__Group_3__3__Impl : ( 'branches:' ) ;
    public final void rule__History__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2505:1: ( ( 'branches:' ) )
            // InternalVcsFeatures.g:2506:1: ( 'branches:' )
            {
            // InternalVcsFeatures.g:2506:1: ( 'branches:' )
            // InternalVcsFeatures.g:2507:2: 'branches:'
            {
             before(grammarAccess.getHistoryAccess().getBranchesKeyword_3_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getHistoryAccess().getBranchesKeyword_3_3()); 

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
    // $ANTLR end "rule__History__Group_3__3__Impl"


    // $ANTLR start "rule__History__Group_3__4"
    // InternalVcsFeatures.g:2516:1: rule__History__Group_3__4 : rule__History__Group_3__4__Impl ;
    public final void rule__History__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2520:1: ( rule__History__Group_3__4__Impl )
            // InternalVcsFeatures.g:2521:2: rule__History__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__History__Group_3__4__Impl();

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
    // $ANTLR end "rule__History__Group_3__4"


    // $ANTLR start "rule__History__Group_3__4__Impl"
    // InternalVcsFeatures.g:2527:1: rule__History__Group_3__4__Impl : ( ( rule__History__NumberOfBranchesAssignment_3_4 ) ) ;
    public final void rule__History__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2531:1: ( ( ( rule__History__NumberOfBranchesAssignment_3_4 ) ) )
            // InternalVcsFeatures.g:2532:1: ( ( rule__History__NumberOfBranchesAssignment_3_4 ) )
            {
            // InternalVcsFeatures.g:2532:1: ( ( rule__History__NumberOfBranchesAssignment_3_4 ) )
            // InternalVcsFeatures.g:2533:2: ( rule__History__NumberOfBranchesAssignment_3_4 )
            {
             before(grammarAccess.getHistoryAccess().getNumberOfBranchesAssignment_3_4()); 
            // InternalVcsFeatures.g:2534:2: ( rule__History__NumberOfBranchesAssignment_3_4 )
            // InternalVcsFeatures.g:2534:3: rule__History__NumberOfBranchesAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__History__NumberOfBranchesAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getHistoryAccess().getNumberOfBranchesAssignment_3_4()); 

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
    // $ANTLR end "rule__History__Group_3__4__Impl"


    // $ANTLR start "rule__VersionUnit__Group__0"
    // InternalVcsFeatures.g:2543:1: rule__VersionUnit__Group__0 : rule__VersionUnit__Group__0__Impl rule__VersionUnit__Group__1 ;
    public final void rule__VersionUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2547:1: ( rule__VersionUnit__Group__0__Impl rule__VersionUnit__Group__1 )
            // InternalVcsFeatures.g:2548:2: rule__VersionUnit__Group__0__Impl rule__VersionUnit__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__VersionUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionUnit__Group__1();

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
    // $ANTLR end "rule__VersionUnit__Group__0"


    // $ANTLR start "rule__VersionUnit__Group__0__Impl"
    // InternalVcsFeatures.g:2555:1: rule__VersionUnit__Group__0__Impl : ( () ) ;
    public final void rule__VersionUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2559:1: ( ( () ) )
            // InternalVcsFeatures.g:2560:1: ( () )
            {
            // InternalVcsFeatures.g:2560:1: ( () )
            // InternalVcsFeatures.g:2561:2: ()
            {
             before(grammarAccess.getVersionUnitAccess().getVersionUnitAction_0()); 
            // InternalVcsFeatures.g:2562:2: ()
            // InternalVcsFeatures.g:2562:3: 
            {
            }

             after(grammarAccess.getVersionUnitAccess().getVersionUnitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionUnit__Group__0__Impl"


    // $ANTLR start "rule__VersionUnit__Group__1"
    // InternalVcsFeatures.g:2570:1: rule__VersionUnit__Group__1 : rule__VersionUnit__Group__1__Impl rule__VersionUnit__Group__2 ;
    public final void rule__VersionUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2574:1: ( rule__VersionUnit__Group__1__Impl rule__VersionUnit__Group__2 )
            // InternalVcsFeatures.g:2575:2: rule__VersionUnit__Group__1__Impl rule__VersionUnit__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__VersionUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionUnit__Group__2();

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
    // $ANTLR end "rule__VersionUnit__Group__1"


    // $ANTLR start "rule__VersionUnit__Group__1__Impl"
    // InternalVcsFeatures.g:2582:1: rule__VersionUnit__Group__1__Impl : ( 'Detail' ) ;
    public final void rule__VersionUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2586:1: ( ( 'Detail' ) )
            // InternalVcsFeatures.g:2587:1: ( 'Detail' )
            {
            // InternalVcsFeatures.g:2587:1: ( 'Detail' )
            // InternalVcsFeatures.g:2588:2: 'Detail'
            {
             before(grammarAccess.getVersionUnitAccess().getDetailKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getVersionUnitAccess().getDetailKeyword_1()); 

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
    // $ANTLR end "rule__VersionUnit__Group__1__Impl"


    // $ANTLR start "rule__VersionUnit__Group__2"
    // InternalVcsFeatures.g:2597:1: rule__VersionUnit__Group__2 : rule__VersionUnit__Group__2__Impl rule__VersionUnit__Group__3 ;
    public final void rule__VersionUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2601:1: ( rule__VersionUnit__Group__2__Impl rule__VersionUnit__Group__3 )
            // InternalVcsFeatures.g:2602:2: rule__VersionUnit__Group__2__Impl rule__VersionUnit__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__VersionUnit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionUnit__Group__3();

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
    // $ANTLR end "rule__VersionUnit__Group__2"


    // $ANTLR start "rule__VersionUnit__Group__2__Impl"
    // InternalVcsFeatures.g:2609:1: rule__VersionUnit__Group__2__Impl : ( 'level:' ) ;
    public final void rule__VersionUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2613:1: ( ( 'level:' ) )
            // InternalVcsFeatures.g:2614:1: ( 'level:' )
            {
            // InternalVcsFeatures.g:2614:1: ( 'level:' )
            // InternalVcsFeatures.g:2615:2: 'level:'
            {
             before(grammarAccess.getVersionUnitAccess().getLevelKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getVersionUnitAccess().getLevelKeyword_2()); 

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
    // $ANTLR end "rule__VersionUnit__Group__2__Impl"


    // $ANTLR start "rule__VersionUnit__Group__3"
    // InternalVcsFeatures.g:2624:1: rule__VersionUnit__Group__3 : rule__VersionUnit__Group__3__Impl ;
    public final void rule__VersionUnit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2628:1: ( rule__VersionUnit__Group__3__Impl )
            // InternalVcsFeatures.g:2629:2: rule__VersionUnit__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VersionUnit__Group__3__Impl();

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
    // $ANTLR end "rule__VersionUnit__Group__3"


    // $ANTLR start "rule__VersionUnit__Group__3__Impl"
    // InternalVcsFeatures.g:2635:1: rule__VersionUnit__Group__3__Impl : ( ( rule__VersionUnit__Group_3__0 )? ) ;
    public final void rule__VersionUnit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2639:1: ( ( ( rule__VersionUnit__Group_3__0 )? ) )
            // InternalVcsFeatures.g:2640:1: ( ( rule__VersionUnit__Group_3__0 )? )
            {
            // InternalVcsFeatures.g:2640:1: ( ( rule__VersionUnit__Group_3__0 )? )
            // InternalVcsFeatures.g:2641:2: ( rule__VersionUnit__Group_3__0 )?
            {
             before(grammarAccess.getVersionUnitAccess().getGroup_3()); 
            // InternalVcsFeatures.g:2642:2: ( rule__VersionUnit__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=31 && LA26_0<=34)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVcsFeatures.g:2642:3: rule__VersionUnit__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VersionUnit__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionUnitAccess().getGroup_3()); 

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
    // $ANTLR end "rule__VersionUnit__Group__3__Impl"


    // $ANTLR start "rule__VersionUnit__Group_3__0"
    // InternalVcsFeatures.g:2651:1: rule__VersionUnit__Group_3__0 : rule__VersionUnit__Group_3__0__Impl rule__VersionUnit__Group_3__1 ;
    public final void rule__VersionUnit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2655:1: ( rule__VersionUnit__Group_3__0__Impl rule__VersionUnit__Group_3__1 )
            // InternalVcsFeatures.g:2656:2: rule__VersionUnit__Group_3__0__Impl rule__VersionUnit__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__VersionUnit__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionUnit__Group_3__1();

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
    // $ANTLR end "rule__VersionUnit__Group_3__0"


    // $ANTLR start "rule__VersionUnit__Group_3__0__Impl"
    // InternalVcsFeatures.g:2663:1: rule__VersionUnit__Group_3__0__Impl : ( ( rule__VersionUnit__GranularityAssignment_3_0 ) ) ;
    public final void rule__VersionUnit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2667:1: ( ( ( rule__VersionUnit__GranularityAssignment_3_0 ) ) )
            // InternalVcsFeatures.g:2668:1: ( ( rule__VersionUnit__GranularityAssignment_3_0 ) )
            {
            // InternalVcsFeatures.g:2668:1: ( ( rule__VersionUnit__GranularityAssignment_3_0 ) )
            // InternalVcsFeatures.g:2669:2: ( rule__VersionUnit__GranularityAssignment_3_0 )
            {
             before(grammarAccess.getVersionUnitAccess().getGranularityAssignment_3_0()); 
            // InternalVcsFeatures.g:2670:2: ( rule__VersionUnit__GranularityAssignment_3_0 )
            // InternalVcsFeatures.g:2670:3: rule__VersionUnit__GranularityAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__VersionUnit__GranularityAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getVersionUnitAccess().getGranularityAssignment_3_0()); 

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
    // $ANTLR end "rule__VersionUnit__Group_3__0__Impl"


    // $ANTLR start "rule__VersionUnit__Group_3__1"
    // InternalVcsFeatures.g:2678:1: rule__VersionUnit__Group_3__1 : rule__VersionUnit__Group_3__1__Impl ;
    public final void rule__VersionUnit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2682:1: ( rule__VersionUnit__Group_3__1__Impl )
            // InternalVcsFeatures.g:2683:2: rule__VersionUnit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VersionUnit__Group_3__1__Impl();

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
    // $ANTLR end "rule__VersionUnit__Group_3__1"


    // $ANTLR start "rule__VersionUnit__Group_3__1__Impl"
    // InternalVcsFeatures.g:2689:1: rule__VersionUnit__Group_3__1__Impl : ( ( rule__VersionUnit__GranularityAssignment_3_1 )* ) ;
    public final void rule__VersionUnit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2693:1: ( ( ( rule__VersionUnit__GranularityAssignment_3_1 )* ) )
            // InternalVcsFeatures.g:2694:1: ( ( rule__VersionUnit__GranularityAssignment_3_1 )* )
            {
            // InternalVcsFeatures.g:2694:1: ( ( rule__VersionUnit__GranularityAssignment_3_1 )* )
            // InternalVcsFeatures.g:2695:2: ( rule__VersionUnit__GranularityAssignment_3_1 )*
            {
             before(grammarAccess.getVersionUnitAccess().getGranularityAssignment_3_1()); 
            // InternalVcsFeatures.g:2696:2: ( rule__VersionUnit__GranularityAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=31 && LA27_0<=34)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalVcsFeatures.g:2696:3: rule__VersionUnit__GranularityAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__VersionUnit__GranularityAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getVersionUnitAccess().getGranularityAssignment_3_1()); 

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
    // $ANTLR end "rule__VersionUnit__Group_3__1__Impl"


    // $ANTLR start "rule__CollaborationStyle__Group__0"
    // InternalVcsFeatures.g:2705:1: rule__CollaborationStyle__Group__0 : rule__CollaborationStyle__Group__0__Impl rule__CollaborationStyle__Group__1 ;
    public final void rule__CollaborationStyle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2709:1: ( rule__CollaborationStyle__Group__0__Impl rule__CollaborationStyle__Group__1 )
            // InternalVcsFeatures.g:2710:2: rule__CollaborationStyle__Group__0__Impl rule__CollaborationStyle__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__CollaborationStyle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollaborationStyle__Group__1();

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
    // $ANTLR end "rule__CollaborationStyle__Group__0"


    // $ANTLR start "rule__CollaborationStyle__Group__0__Impl"
    // InternalVcsFeatures.g:2717:1: rule__CollaborationStyle__Group__0__Impl : ( () ) ;
    public final void rule__CollaborationStyle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2721:1: ( ( () ) )
            // InternalVcsFeatures.g:2722:1: ( () )
            {
            // InternalVcsFeatures.g:2722:1: ( () )
            // InternalVcsFeatures.g:2723:2: ()
            {
             before(grammarAccess.getCollaborationStyleAccess().getCollaborationStyleAction_0()); 
            // InternalVcsFeatures.g:2724:2: ()
            // InternalVcsFeatures.g:2724:3: 
            {
            }

             after(grammarAccess.getCollaborationStyleAccess().getCollaborationStyleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CollaborationStyle__Group__0__Impl"


    // $ANTLR start "rule__CollaborationStyle__Group__1"
    // InternalVcsFeatures.g:2732:1: rule__CollaborationStyle__Group__1 : rule__CollaborationStyle__Group__1__Impl rule__CollaborationStyle__Group__2 ;
    public final void rule__CollaborationStyle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2736:1: ( rule__CollaborationStyle__Group__1__Impl rule__CollaborationStyle__Group__2 )
            // InternalVcsFeatures.g:2737:2: rule__CollaborationStyle__Group__1__Impl rule__CollaborationStyle__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__CollaborationStyle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollaborationStyle__Group__2();

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
    // $ANTLR end "rule__CollaborationStyle__Group__1"


    // $ANTLR start "rule__CollaborationStyle__Group__1__Impl"
    // InternalVcsFeatures.g:2744:1: rule__CollaborationStyle__Group__1__Impl : ( 'Working:' ) ;
    public final void rule__CollaborationStyle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2748:1: ( ( 'Working:' ) )
            // InternalVcsFeatures.g:2749:1: ( 'Working:' )
            {
            // InternalVcsFeatures.g:2749:1: ( 'Working:' )
            // InternalVcsFeatures.g:2750:2: 'Working:'
            {
             before(grammarAccess.getCollaborationStyleAccess().getWorkingKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getCollaborationStyleAccess().getWorkingKeyword_1()); 

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
    // $ANTLR end "rule__CollaborationStyle__Group__1__Impl"


    // $ANTLR start "rule__CollaborationStyle__Group__2"
    // InternalVcsFeatures.g:2759:1: rule__CollaborationStyle__Group__2 : rule__CollaborationStyle__Group__2__Impl ;
    public final void rule__CollaborationStyle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2763:1: ( rule__CollaborationStyle__Group__2__Impl )
            // InternalVcsFeatures.g:2764:2: rule__CollaborationStyle__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollaborationStyle__Group__2__Impl();

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
    // $ANTLR end "rule__CollaborationStyle__Group__2"


    // $ANTLR start "rule__CollaborationStyle__Group__2__Impl"
    // InternalVcsFeatures.g:2770:1: rule__CollaborationStyle__Group__2__Impl : ( ( rule__CollaborationStyle__CollabStyleAssignment_2 ) ) ;
    public final void rule__CollaborationStyle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2774:1: ( ( ( rule__CollaborationStyle__CollabStyleAssignment_2 ) ) )
            // InternalVcsFeatures.g:2775:1: ( ( rule__CollaborationStyle__CollabStyleAssignment_2 ) )
            {
            // InternalVcsFeatures.g:2775:1: ( ( rule__CollaborationStyle__CollabStyleAssignment_2 ) )
            // InternalVcsFeatures.g:2776:2: ( rule__CollaborationStyle__CollabStyleAssignment_2 )
            {
             before(grammarAccess.getCollaborationStyleAccess().getCollabStyleAssignment_2()); 
            // InternalVcsFeatures.g:2777:2: ( rule__CollaborationStyle__CollabStyleAssignment_2 )
            // InternalVcsFeatures.g:2777:3: rule__CollaborationStyle__CollabStyleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CollaborationStyle__CollabStyleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCollaborationStyleAccess().getCollabStyleAssignment_2()); 

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
    // $ANTLR end "rule__CollaborationStyle__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // InternalVcsFeatures.g:2786:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2790:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalVcsFeatures.g:2791:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__1();

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
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // InternalVcsFeatures.g:2798:1: rule__Database__Group__0__Impl : ( () ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2802:1: ( ( () ) )
            // InternalVcsFeatures.g:2803:1: ( () )
            {
            // InternalVcsFeatures.g:2803:1: ( () )
            // InternalVcsFeatures.g:2804:2: ()
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseAction_0()); 
            // InternalVcsFeatures.g:2805:2: ()
            // InternalVcsFeatures.g:2805:3: 
            {
            }

             after(grammarAccess.getDatabaseAccess().getDatabaseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // InternalVcsFeatures.g:2813:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2817:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalVcsFeatures.g:2818:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__2();

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
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // InternalVcsFeatures.g:2825:1: rule__Database__Group__1__Impl : ( 'DB' ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2829:1: ( ( 'DB' ) )
            // InternalVcsFeatures.g:2830:1: ( 'DB' )
            {
            // InternalVcsFeatures.g:2830:1: ( 'DB' )
            // InternalVcsFeatures.g:2831:2: 'DB'
            {
             before(grammarAccess.getDatabaseAccess().getDBKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getDBKeyword_1()); 

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
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // InternalVcsFeatures.g:2840:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2844:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalVcsFeatures.g:2845:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__3();

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
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // InternalVcsFeatures.g:2852:1: rule__Database__Group__2__Impl : ( ( rule__Database__NameAssignment_2 ) ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2856:1: ( ( ( rule__Database__NameAssignment_2 ) ) )
            // InternalVcsFeatures.g:2857:1: ( ( rule__Database__NameAssignment_2 ) )
            {
            // InternalVcsFeatures.g:2857:1: ( ( rule__Database__NameAssignment_2 ) )
            // InternalVcsFeatures.g:2858:2: ( rule__Database__NameAssignment_2 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_2()); 
            // InternalVcsFeatures.g:2859:2: ( rule__Database__NameAssignment_2 )
            // InternalVcsFeatures.g:2859:3: rule__Database__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Database__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // InternalVcsFeatures.g:2867:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2871:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalVcsFeatures.g:2872:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__4();

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
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // InternalVcsFeatures.g:2879:1: rule__Database__Group__3__Impl : ( ( rule__Database__DatabaseTypeAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2883:1: ( ( ( rule__Database__DatabaseTypeAssignment_3 ) ) )
            // InternalVcsFeatures.g:2884:1: ( ( rule__Database__DatabaseTypeAssignment_3 ) )
            {
            // InternalVcsFeatures.g:2884:1: ( ( rule__Database__DatabaseTypeAssignment_3 ) )
            // InternalVcsFeatures.g:2885:2: ( rule__Database__DatabaseTypeAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseTypeAssignment_3()); 
            // InternalVcsFeatures.g:2886:2: ( rule__Database__DatabaseTypeAssignment_3 )
            // InternalVcsFeatures.g:2886:3: rule__Database__DatabaseTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Database__DatabaseTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getDatabaseTypeAssignment_3()); 

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
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Database__Group__4"
    // InternalVcsFeatures.g:2894:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2898:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalVcsFeatures.g:2899:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Database__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__5();

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
    // $ANTLR end "rule__Database__Group__4"


    // $ANTLR start "rule__Database__Group__4__Impl"
    // InternalVcsFeatures.g:2906:1: rule__Database__Group__4__Impl : ( '@' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2910:1: ( ( '@' ) )
            // InternalVcsFeatures.g:2911:1: ( '@' )
            {
            // InternalVcsFeatures.g:2911:1: ( '@' )
            // InternalVcsFeatures.g:2912:2: '@'
            {
             before(grammarAccess.getDatabaseAccess().getCommercialAtKeyword_4()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getCommercialAtKeyword_4()); 

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
    // $ANTLR end "rule__Database__Group__4__Impl"


    // $ANTLR start "rule__Database__Group__5"
    // InternalVcsFeatures.g:2921:1: rule__Database__Group__5 : rule__Database__Group__5__Impl ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2925:1: ( rule__Database__Group__5__Impl )
            // InternalVcsFeatures.g:2926:2: rule__Database__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__5__Impl();

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
    // $ANTLR end "rule__Database__Group__5"


    // $ANTLR start "rule__Database__Group__5__Impl"
    // InternalVcsFeatures.g:2932:1: rule__Database__Group__5__Impl : ( ( rule__Database__ConnectionStringAssignment_5 ) ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2936:1: ( ( ( rule__Database__ConnectionStringAssignment_5 ) ) )
            // InternalVcsFeatures.g:2937:1: ( ( rule__Database__ConnectionStringAssignment_5 ) )
            {
            // InternalVcsFeatures.g:2937:1: ( ( rule__Database__ConnectionStringAssignment_5 ) )
            // InternalVcsFeatures.g:2938:2: ( rule__Database__ConnectionStringAssignment_5 )
            {
             before(grammarAccess.getDatabaseAccess().getConnectionStringAssignment_5()); 
            // InternalVcsFeatures.g:2939:2: ( rule__Database__ConnectionStringAssignment_5 )
            // InternalVcsFeatures.g:2939:3: rule__Database__ConnectionStringAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Database__ConnectionStringAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getConnectionStringAssignment_5()); 

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
    // $ANTLR end "rule__Database__Group__5__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group__0"
    // InternalVcsFeatures.g:2948:1: rule__HighLevelCommand__Group__0 : rule__HighLevelCommand__Group__0__Impl rule__HighLevelCommand__Group__1 ;
    public final void rule__HighLevelCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2952:1: ( rule__HighLevelCommand__Group__0__Impl rule__HighLevelCommand__Group__1 )
            // InternalVcsFeatures.g:2953:2: rule__HighLevelCommand__Group__0__Impl rule__HighLevelCommand__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__HighLevelCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group__1();

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
    // $ANTLR end "rule__HighLevelCommand__Group__0"


    // $ANTLR start "rule__HighLevelCommand__Group__0__Impl"
    // InternalVcsFeatures.g:2960:1: rule__HighLevelCommand__Group__0__Impl : ( () ) ;
    public final void rule__HighLevelCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2964:1: ( ( () ) )
            // InternalVcsFeatures.g:2965:1: ( () )
            {
            // InternalVcsFeatures.g:2965:1: ( () )
            // InternalVcsFeatures.g:2966:2: ()
            {
             before(grammarAccess.getHighLevelCommandAccess().getHighLevelCommandAction_0()); 
            // InternalVcsFeatures.g:2967:2: ()
            // InternalVcsFeatures.g:2967:3: 
            {
            }

             after(grammarAccess.getHighLevelCommandAccess().getHighLevelCommandAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighLevelCommand__Group__0__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group__1"
    // InternalVcsFeatures.g:2975:1: rule__HighLevelCommand__Group__1 : rule__HighLevelCommand__Group__1__Impl rule__HighLevelCommand__Group__2 ;
    public final void rule__HighLevelCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2979:1: ( rule__HighLevelCommand__Group__1__Impl rule__HighLevelCommand__Group__2 )
            // InternalVcsFeatures.g:2980:2: rule__HighLevelCommand__Group__1__Impl rule__HighLevelCommand__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__HighLevelCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group__2();

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
    // $ANTLR end "rule__HighLevelCommand__Group__1"


    // $ANTLR start "rule__HighLevelCommand__Group__1__Impl"
    // InternalVcsFeatures.g:2987:1: rule__HighLevelCommand__Group__1__Impl : ( '-' ) ;
    public final void rule__HighLevelCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:2991:1: ( ( '-' ) )
            // InternalVcsFeatures.g:2992:1: ( '-' )
            {
            // InternalVcsFeatures.g:2992:1: ( '-' )
            // InternalVcsFeatures.g:2993:2: '-'
            {
             before(grammarAccess.getHighLevelCommandAccess().getHyphenMinusKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getHighLevelCommandAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group__1__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group__2"
    // InternalVcsFeatures.g:3002:1: rule__HighLevelCommand__Group__2 : rule__HighLevelCommand__Group__2__Impl rule__HighLevelCommand__Group__3 ;
    public final void rule__HighLevelCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3006:1: ( rule__HighLevelCommand__Group__2__Impl rule__HighLevelCommand__Group__3 )
            // InternalVcsFeatures.g:3007:2: rule__HighLevelCommand__Group__2__Impl rule__HighLevelCommand__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__HighLevelCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group__3();

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
    // $ANTLR end "rule__HighLevelCommand__Group__2"


    // $ANTLR start "rule__HighLevelCommand__Group__2__Impl"
    // InternalVcsFeatures.g:3014:1: rule__HighLevelCommand__Group__2__Impl : ( 'Super' ) ;
    public final void rule__HighLevelCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3018:1: ( ( 'Super' ) )
            // InternalVcsFeatures.g:3019:1: ( 'Super' )
            {
            // InternalVcsFeatures.g:3019:1: ( 'Super' )
            // InternalVcsFeatures.g:3020:2: 'Super'
            {
             before(grammarAccess.getHighLevelCommandAccess().getSuperKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getHighLevelCommandAccess().getSuperKeyword_2()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group__2__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group__3"
    // InternalVcsFeatures.g:3029:1: rule__HighLevelCommand__Group__3 : rule__HighLevelCommand__Group__3__Impl rule__HighLevelCommand__Group__4 ;
    public final void rule__HighLevelCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3033:1: ( rule__HighLevelCommand__Group__3__Impl rule__HighLevelCommand__Group__4 )
            // InternalVcsFeatures.g:3034:2: rule__HighLevelCommand__Group__3__Impl rule__HighLevelCommand__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__HighLevelCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group__4();

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
    // $ANTLR end "rule__HighLevelCommand__Group__3"


    // $ANTLR start "rule__HighLevelCommand__Group__3__Impl"
    // InternalVcsFeatures.g:3041:1: rule__HighLevelCommand__Group__3__Impl : ( 'command' ) ;
    public final void rule__HighLevelCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3045:1: ( ( 'command' ) )
            // InternalVcsFeatures.g:3046:1: ( 'command' )
            {
            // InternalVcsFeatures.g:3046:1: ( 'command' )
            // InternalVcsFeatures.g:3047:2: 'command'
            {
             before(grammarAccess.getHighLevelCommandAccess().getCommandKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getHighLevelCommandAccess().getCommandKeyword_3()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group__3__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group__4"
    // InternalVcsFeatures.g:3056:1: rule__HighLevelCommand__Group__4 : rule__HighLevelCommand__Group__4__Impl rule__HighLevelCommand__Group__5 ;
    public final void rule__HighLevelCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3060:1: ( rule__HighLevelCommand__Group__4__Impl rule__HighLevelCommand__Group__5 )
            // InternalVcsFeatures.g:3061:2: rule__HighLevelCommand__Group__4__Impl rule__HighLevelCommand__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__HighLevelCommand__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group__5();

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
    // $ANTLR end "rule__HighLevelCommand__Group__4"


    // $ANTLR start "rule__HighLevelCommand__Group__4__Impl"
    // InternalVcsFeatures.g:3068:1: rule__HighLevelCommand__Group__4__Impl : ( ( rule__HighLevelCommand__NameAssignment_4 ) ) ;
    public final void rule__HighLevelCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3072:1: ( ( ( rule__HighLevelCommand__NameAssignment_4 ) ) )
            // InternalVcsFeatures.g:3073:1: ( ( rule__HighLevelCommand__NameAssignment_4 ) )
            {
            // InternalVcsFeatures.g:3073:1: ( ( rule__HighLevelCommand__NameAssignment_4 ) )
            // InternalVcsFeatures.g:3074:2: ( rule__HighLevelCommand__NameAssignment_4 )
            {
             before(grammarAccess.getHighLevelCommandAccess().getNameAssignment_4()); 
            // InternalVcsFeatures.g:3075:2: ( rule__HighLevelCommand__NameAssignment_4 )
            // InternalVcsFeatures.g:3075:3: rule__HighLevelCommand__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHighLevelCommandAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group__4__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group__5"
    // InternalVcsFeatures.g:3083:1: rule__HighLevelCommand__Group__5 : rule__HighLevelCommand__Group__5__Impl ;
    public final void rule__HighLevelCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3087:1: ( rule__HighLevelCommand__Group__5__Impl )
            // InternalVcsFeatures.g:3088:2: rule__HighLevelCommand__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group__5__Impl();

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
    // $ANTLR end "rule__HighLevelCommand__Group__5"


    // $ANTLR start "rule__HighLevelCommand__Group__5__Impl"
    // InternalVcsFeatures.g:3094:1: rule__HighLevelCommand__Group__5__Impl : ( ( rule__HighLevelCommand__Group_5__0 )? ) ;
    public final void rule__HighLevelCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3098:1: ( ( ( rule__HighLevelCommand__Group_5__0 )? ) )
            // InternalVcsFeatures.g:3099:1: ( ( rule__HighLevelCommand__Group_5__0 )? )
            {
            // InternalVcsFeatures.g:3099:1: ( ( rule__HighLevelCommand__Group_5__0 )? )
            // InternalVcsFeatures.g:3100:2: ( rule__HighLevelCommand__Group_5__0 )?
            {
             before(grammarAccess.getHighLevelCommandAccess().getGroup_5()); 
            // InternalVcsFeatures.g:3101:2: ( rule__HighLevelCommand__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==71) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVcsFeatures.g:3101:3: rule__HighLevelCommand__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HighLevelCommand__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHighLevelCommandAccess().getGroup_5()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group__5__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group_5__0"
    // InternalVcsFeatures.g:3110:1: rule__HighLevelCommand__Group_5__0 : rule__HighLevelCommand__Group_5__0__Impl rule__HighLevelCommand__Group_5__1 ;
    public final void rule__HighLevelCommand__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3114:1: ( rule__HighLevelCommand__Group_5__0__Impl rule__HighLevelCommand__Group_5__1 )
            // InternalVcsFeatures.g:3115:2: rule__HighLevelCommand__Group_5__0__Impl rule__HighLevelCommand__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__HighLevelCommand__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group_5__1();

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
    // $ANTLR end "rule__HighLevelCommand__Group_5__0"


    // $ANTLR start "rule__HighLevelCommand__Group_5__0__Impl"
    // InternalVcsFeatures.g:3122:1: rule__HighLevelCommand__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__HighLevelCommand__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3126:1: ( ( 'with' ) )
            // InternalVcsFeatures.g:3127:1: ( 'with' )
            {
            // InternalVcsFeatures.g:3127:1: ( 'with' )
            // InternalVcsFeatures.g:3128:2: 'with'
            {
             before(grammarAccess.getHighLevelCommandAccess().getWithKeyword_5_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getHighLevelCommandAccess().getWithKeyword_5_0()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group_5__0__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group_5__1"
    // InternalVcsFeatures.g:3137:1: rule__HighLevelCommand__Group_5__1 : rule__HighLevelCommand__Group_5__1__Impl rule__HighLevelCommand__Group_5__2 ;
    public final void rule__HighLevelCommand__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3141:1: ( rule__HighLevelCommand__Group_5__1__Impl rule__HighLevelCommand__Group_5__2 )
            // InternalVcsFeatures.g:3142:2: rule__HighLevelCommand__Group_5__1__Impl rule__HighLevelCommand__Group_5__2
            {
            pushFollow(FOLLOW_42);
            rule__HighLevelCommand__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group_5__2();

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
    // $ANTLR end "rule__HighLevelCommand__Group_5__1"


    // $ANTLR start "rule__HighLevelCommand__Group_5__1__Impl"
    // InternalVcsFeatures.g:3149:1: rule__HighLevelCommand__Group_5__1__Impl : ( ( rule__HighLevelCommand__LowlevelcommandAssignment_5_1 ) ) ;
    public final void rule__HighLevelCommand__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3153:1: ( ( ( rule__HighLevelCommand__LowlevelcommandAssignment_5_1 ) ) )
            // InternalVcsFeatures.g:3154:1: ( ( rule__HighLevelCommand__LowlevelcommandAssignment_5_1 ) )
            {
            // InternalVcsFeatures.g:3154:1: ( ( rule__HighLevelCommand__LowlevelcommandAssignment_5_1 ) )
            // InternalVcsFeatures.g:3155:2: ( rule__HighLevelCommand__LowlevelcommandAssignment_5_1 )
            {
             before(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandAssignment_5_1()); 
            // InternalVcsFeatures.g:3156:2: ( rule__HighLevelCommand__LowlevelcommandAssignment_5_1 )
            // InternalVcsFeatures.g:3156:3: rule__HighLevelCommand__LowlevelcommandAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__LowlevelcommandAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandAssignment_5_1()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group_5__1__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group_5__2"
    // InternalVcsFeatures.g:3164:1: rule__HighLevelCommand__Group_5__2 : rule__HighLevelCommand__Group_5__2__Impl ;
    public final void rule__HighLevelCommand__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3168:1: ( rule__HighLevelCommand__Group_5__2__Impl )
            // InternalVcsFeatures.g:3169:2: rule__HighLevelCommand__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group_5__2__Impl();

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
    // $ANTLR end "rule__HighLevelCommand__Group_5__2"


    // $ANTLR start "rule__HighLevelCommand__Group_5__2__Impl"
    // InternalVcsFeatures.g:3175:1: rule__HighLevelCommand__Group_5__2__Impl : ( ( rule__HighLevelCommand__Group_5_2__0 )* ) ;
    public final void rule__HighLevelCommand__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3179:1: ( ( ( rule__HighLevelCommand__Group_5_2__0 )* ) )
            // InternalVcsFeatures.g:3180:1: ( ( rule__HighLevelCommand__Group_5_2__0 )* )
            {
            // InternalVcsFeatures.g:3180:1: ( ( rule__HighLevelCommand__Group_5_2__0 )* )
            // InternalVcsFeatures.g:3181:2: ( rule__HighLevelCommand__Group_5_2__0 )*
            {
             before(grammarAccess.getHighLevelCommandAccess().getGroup_5_2()); 
            // InternalVcsFeatures.g:3182:2: ( rule__HighLevelCommand__Group_5_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==72) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalVcsFeatures.g:3182:3: rule__HighLevelCommand__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__HighLevelCommand__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getHighLevelCommandAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group_5__2__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group_5_2__0"
    // InternalVcsFeatures.g:3191:1: rule__HighLevelCommand__Group_5_2__0 : rule__HighLevelCommand__Group_5_2__0__Impl rule__HighLevelCommand__Group_5_2__1 ;
    public final void rule__HighLevelCommand__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3195:1: ( rule__HighLevelCommand__Group_5_2__0__Impl rule__HighLevelCommand__Group_5_2__1 )
            // InternalVcsFeatures.g:3196:2: rule__HighLevelCommand__Group_5_2__0__Impl rule__HighLevelCommand__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
            rule__HighLevelCommand__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group_5_2__1();

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
    // $ANTLR end "rule__HighLevelCommand__Group_5_2__0"


    // $ANTLR start "rule__HighLevelCommand__Group_5_2__0__Impl"
    // InternalVcsFeatures.g:3203:1: rule__HighLevelCommand__Group_5_2__0__Impl : ( '->' ) ;
    public final void rule__HighLevelCommand__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3207:1: ( ( '->' ) )
            // InternalVcsFeatures.g:3208:1: ( '->' )
            {
            // InternalVcsFeatures.g:3208:1: ( '->' )
            // InternalVcsFeatures.g:3209:2: '->'
            {
             before(grammarAccess.getHighLevelCommandAccess().getHyphenMinusGreaterThanSignKeyword_5_2_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getHighLevelCommandAccess().getHyphenMinusGreaterThanSignKeyword_5_2_0()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group_5_2__0__Impl"


    // $ANTLR start "rule__HighLevelCommand__Group_5_2__1"
    // InternalVcsFeatures.g:3218:1: rule__HighLevelCommand__Group_5_2__1 : rule__HighLevelCommand__Group_5_2__1__Impl ;
    public final void rule__HighLevelCommand__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3222:1: ( rule__HighLevelCommand__Group_5_2__1__Impl )
            // InternalVcsFeatures.g:3223:2: rule__HighLevelCommand__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__HighLevelCommand__Group_5_2__1"


    // $ANTLR start "rule__HighLevelCommand__Group_5_2__1__Impl"
    // InternalVcsFeatures.g:3229:1: rule__HighLevelCommand__Group_5_2__1__Impl : ( ( rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1 ) ) ;
    public final void rule__HighLevelCommand__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3233:1: ( ( ( rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1 ) ) )
            // InternalVcsFeatures.g:3234:1: ( ( rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1 ) )
            {
            // InternalVcsFeatures.g:3234:1: ( ( rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1 ) )
            // InternalVcsFeatures.g:3235:2: ( rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1 )
            {
             before(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandAssignment_5_2_1()); 
            // InternalVcsFeatures.g:3236:2: ( rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1 )
            // InternalVcsFeatures.g:3236:3: rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandAssignment_5_2_1()); 

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
    // $ANTLR end "rule__HighLevelCommand__Group_5_2__1__Impl"


    // $ANTLR start "rule__LowLevelCommand__Group__0"
    // InternalVcsFeatures.g:3245:1: rule__LowLevelCommand__Group__0 : rule__LowLevelCommand__Group__0__Impl rule__LowLevelCommand__Group__1 ;
    public final void rule__LowLevelCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3249:1: ( rule__LowLevelCommand__Group__0__Impl rule__LowLevelCommand__Group__1 )
            // InternalVcsFeatures.g:3250:2: rule__LowLevelCommand__Group__0__Impl rule__LowLevelCommand__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__LowLevelCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__Group__1();

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
    // $ANTLR end "rule__LowLevelCommand__Group__0"


    // $ANTLR start "rule__LowLevelCommand__Group__0__Impl"
    // InternalVcsFeatures.g:3257:1: rule__LowLevelCommand__Group__0__Impl : ( '-' ) ;
    public final void rule__LowLevelCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3261:1: ( ( '-' ) )
            // InternalVcsFeatures.g:3262:1: ( '-' )
            {
            // InternalVcsFeatures.g:3262:1: ( '-' )
            // InternalVcsFeatures.g:3263:2: '-'
            {
             before(grammarAccess.getLowLevelCommandAccess().getHyphenMinusKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getLowLevelCommandAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__LowLevelCommand__Group__0__Impl"


    // $ANTLR start "rule__LowLevelCommand__Group__1"
    // InternalVcsFeatures.g:3272:1: rule__LowLevelCommand__Group__1 : rule__LowLevelCommand__Group__1__Impl rule__LowLevelCommand__Group__2 ;
    public final void rule__LowLevelCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3276:1: ( rule__LowLevelCommand__Group__1__Impl rule__LowLevelCommand__Group__2 )
            // InternalVcsFeatures.g:3277:2: rule__LowLevelCommand__Group__1__Impl rule__LowLevelCommand__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__LowLevelCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__Group__2();

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
    // $ANTLR end "rule__LowLevelCommand__Group__1"


    // $ANTLR start "rule__LowLevelCommand__Group__1__Impl"
    // InternalVcsFeatures.g:3284:1: rule__LowLevelCommand__Group__1__Impl : ( 'Command' ) ;
    public final void rule__LowLevelCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3288:1: ( ( 'Command' ) )
            // InternalVcsFeatures.g:3289:1: ( 'Command' )
            {
            // InternalVcsFeatures.g:3289:1: ( 'Command' )
            // InternalVcsFeatures.g:3290:2: 'Command'
            {
             before(grammarAccess.getLowLevelCommandAccess().getCommandKeyword_1()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getLowLevelCommandAccess().getCommandKeyword_1()); 

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
    // $ANTLR end "rule__LowLevelCommand__Group__1__Impl"


    // $ANTLR start "rule__LowLevelCommand__Group__2"
    // InternalVcsFeatures.g:3299:1: rule__LowLevelCommand__Group__2 : rule__LowLevelCommand__Group__2__Impl rule__LowLevelCommand__Group__3 ;
    public final void rule__LowLevelCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3303:1: ( rule__LowLevelCommand__Group__2__Impl rule__LowLevelCommand__Group__3 )
            // InternalVcsFeatures.g:3304:2: rule__LowLevelCommand__Group__2__Impl rule__LowLevelCommand__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__LowLevelCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__Group__3();

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
    // $ANTLR end "rule__LowLevelCommand__Group__2"


    // $ANTLR start "rule__LowLevelCommand__Group__2__Impl"
    // InternalVcsFeatures.g:3311:1: rule__LowLevelCommand__Group__2__Impl : ( 'use' ) ;
    public final void rule__LowLevelCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3315:1: ( ( 'use' ) )
            // InternalVcsFeatures.g:3316:1: ( 'use' )
            {
            // InternalVcsFeatures.g:3316:1: ( 'use' )
            // InternalVcsFeatures.g:3317:2: 'use'
            {
             before(grammarAccess.getLowLevelCommandAccess().getUseKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getLowLevelCommandAccess().getUseKeyword_2()); 

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
    // $ANTLR end "rule__LowLevelCommand__Group__2__Impl"


    // $ANTLR start "rule__LowLevelCommand__Group__3"
    // InternalVcsFeatures.g:3326:1: rule__LowLevelCommand__Group__3 : rule__LowLevelCommand__Group__3__Impl rule__LowLevelCommand__Group__4 ;
    public final void rule__LowLevelCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3330:1: ( rule__LowLevelCommand__Group__3__Impl rule__LowLevelCommand__Group__4 )
            // InternalVcsFeatures.g:3331:2: rule__LowLevelCommand__Group__3__Impl rule__LowLevelCommand__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__LowLevelCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__Group__4();

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
    // $ANTLR end "rule__LowLevelCommand__Group__3"


    // $ANTLR start "rule__LowLevelCommand__Group__3__Impl"
    // InternalVcsFeatures.g:3338:1: rule__LowLevelCommand__Group__3__Impl : ( ( rule__LowLevelCommand__CommandAssignment_3 ) ) ;
    public final void rule__LowLevelCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3342:1: ( ( ( rule__LowLevelCommand__CommandAssignment_3 ) ) )
            // InternalVcsFeatures.g:3343:1: ( ( rule__LowLevelCommand__CommandAssignment_3 ) )
            {
            // InternalVcsFeatures.g:3343:1: ( ( rule__LowLevelCommand__CommandAssignment_3 ) )
            // InternalVcsFeatures.g:3344:2: ( rule__LowLevelCommand__CommandAssignment_3 )
            {
             before(grammarAccess.getLowLevelCommandAccess().getCommandAssignment_3()); 
            // InternalVcsFeatures.g:3345:2: ( rule__LowLevelCommand__CommandAssignment_3 )
            // InternalVcsFeatures.g:3345:3: rule__LowLevelCommand__CommandAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__CommandAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLowLevelCommandAccess().getCommandAssignment_3()); 

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
    // $ANTLR end "rule__LowLevelCommand__Group__3__Impl"


    // $ANTLR start "rule__LowLevelCommand__Group__4"
    // InternalVcsFeatures.g:3353:1: rule__LowLevelCommand__Group__4 : rule__LowLevelCommand__Group__4__Impl rule__LowLevelCommand__Group__5 ;
    public final void rule__LowLevelCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3357:1: ( rule__LowLevelCommand__Group__4__Impl rule__LowLevelCommand__Group__5 )
            // InternalVcsFeatures.g:3358:2: rule__LowLevelCommand__Group__4__Impl rule__LowLevelCommand__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__LowLevelCommand__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__Group__5();

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
    // $ANTLR end "rule__LowLevelCommand__Group__4"


    // $ANTLR start "rule__LowLevelCommand__Group__4__Impl"
    // InternalVcsFeatures.g:3365:1: rule__LowLevelCommand__Group__4__Impl : ( 'as' ) ;
    public final void rule__LowLevelCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3369:1: ( ( 'as' ) )
            // InternalVcsFeatures.g:3370:1: ( 'as' )
            {
            // InternalVcsFeatures.g:3370:1: ( 'as' )
            // InternalVcsFeatures.g:3371:2: 'as'
            {
             before(grammarAccess.getLowLevelCommandAccess().getAsKeyword_4()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getLowLevelCommandAccess().getAsKeyword_4()); 

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
    // $ANTLR end "rule__LowLevelCommand__Group__4__Impl"


    // $ANTLR start "rule__LowLevelCommand__Group__5"
    // InternalVcsFeatures.g:3380:1: rule__LowLevelCommand__Group__5 : rule__LowLevelCommand__Group__5__Impl ;
    public final void rule__LowLevelCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3384:1: ( rule__LowLevelCommand__Group__5__Impl )
            // InternalVcsFeatures.g:3385:2: rule__LowLevelCommand__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__Group__5__Impl();

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
    // $ANTLR end "rule__LowLevelCommand__Group__5"


    // $ANTLR start "rule__LowLevelCommand__Group__5__Impl"
    // InternalVcsFeatures.g:3391:1: rule__LowLevelCommand__Group__5__Impl : ( ( rule__LowLevelCommand__NameAssignment_5 ) ) ;
    public final void rule__LowLevelCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3395:1: ( ( ( rule__LowLevelCommand__NameAssignment_5 ) ) )
            // InternalVcsFeatures.g:3396:1: ( ( rule__LowLevelCommand__NameAssignment_5 ) )
            {
            // InternalVcsFeatures.g:3396:1: ( ( rule__LowLevelCommand__NameAssignment_5 ) )
            // InternalVcsFeatures.g:3397:2: ( rule__LowLevelCommand__NameAssignment_5 )
            {
             before(grammarAccess.getLowLevelCommandAccess().getNameAssignment_5()); 
            // InternalVcsFeatures.g:3398:2: ( rule__LowLevelCommand__NameAssignment_5 )
            // InternalVcsFeatures.g:3398:3: rule__LowLevelCommand__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LowLevelCommand__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLowLevelCommandAccess().getNameAssignment_5()); 

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
    // $ANTLR end "rule__LowLevelCommand__Group__5__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalVcsFeatures.g:3407:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3411:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalVcsFeatures.g:3412:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalVcsFeatures.g:3419:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3423:1: ( ( ( '-' )? ) )
            // InternalVcsFeatures.g:3424:1: ( ( '-' )? )
            {
            // InternalVcsFeatures.g:3424:1: ( ( '-' )? )
            // InternalVcsFeatures.g:3425:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalVcsFeatures.g:3426:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==70) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVcsFeatures.g:3426:3: '-'
                    {
                    match(input,70,FOLLOW_2); 

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
    // InternalVcsFeatures.g:3434:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3438:1: ( rule__EInt__Group__1__Impl )
            // InternalVcsFeatures.g:3439:2: rule__EInt__Group__1__Impl
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
    // InternalVcsFeatures.g:3445:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3449:1: ( ( RULE_INT ) )
            // InternalVcsFeatures.g:3450:1: ( RULE_INT )
            {
            // InternalVcsFeatures.g:3450:1: ( RULE_INT )
            // InternalVcsFeatures.g:3451:2: RULE_INT
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


    // $ANTLR start "rule__VCSFeatures__NameAssignment_2"
    // InternalVcsFeatures.g:3461:1: rule__VCSFeatures__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__VCSFeatures__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3465:1: ( ( ruleEString ) )
            // InternalVcsFeatures.g:3466:2: ( ruleEString )
            {
            // InternalVcsFeatures.g:3466:2: ( ruleEString )
            // InternalVcsFeatures.g:3467:3: ruleEString
            {
             before(grammarAccess.getVCSFeaturesAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VCSFeatures__NameAssignment_2"


    // $ANTLR start "rule__VCSFeatures__CommandsAssignment_4_1"
    // InternalVcsFeatures.g:3476:1: rule__VCSFeatures__CommandsAssignment_4_1 : ( ruleCommands ) ;
    public final void rule__VCSFeatures__CommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3480:1: ( ( ruleCommands ) )
            // InternalVcsFeatures.g:3481:2: ( ruleCommands )
            {
            // InternalVcsFeatures.g:3481:2: ( ruleCommands )
            // InternalVcsFeatures.g:3482:3: ruleCommands
            {
             before(grammarAccess.getVCSFeaturesAccess().getCommandsCommandsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getCommandsCommandsParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__VCSFeatures__CommandsAssignment_4_1"


    // $ANTLR start "rule__VCSFeatures__CommandsAssignment_4_2_1"
    // InternalVcsFeatures.g:3491:1: rule__VCSFeatures__CommandsAssignment_4_2_1 : ( ruleCommands ) ;
    public final void rule__VCSFeatures__CommandsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3495:1: ( ( ruleCommands ) )
            // InternalVcsFeatures.g:3496:2: ( ruleCommands )
            {
            // InternalVcsFeatures.g:3496:2: ( ruleCommands )
            // InternalVcsFeatures.g:3497:3: ruleCommands
            {
             before(grammarAccess.getVCSFeaturesAccess().getCommandsCommandsParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getCommandsCommandsParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__VCSFeatures__CommandsAssignment_4_2_1"


    // $ANTLR start "rule__VCSFeatures__HistoryAssignment_6_1"
    // InternalVcsFeatures.g:3506:1: rule__VCSFeatures__HistoryAssignment_6_1 : ( ruleHistory ) ;
    public final void rule__VCSFeatures__HistoryAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3510:1: ( ( ruleHistory ) )
            // InternalVcsFeatures.g:3511:2: ( ruleHistory )
            {
            // InternalVcsFeatures.g:3511:2: ( ruleHistory )
            // InternalVcsFeatures.g:3512:3: ruleHistory
            {
             before(grammarAccess.getVCSFeaturesAccess().getHistoryHistoryParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHistory();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getHistoryHistoryParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__VCSFeatures__HistoryAssignment_6_1"


    // $ANTLR start "rule__VCSFeatures__HistoryAssignment_6_2_1"
    // InternalVcsFeatures.g:3521:1: rule__VCSFeatures__HistoryAssignment_6_2_1 : ( ruleHistory ) ;
    public final void rule__VCSFeatures__HistoryAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3525:1: ( ( ruleHistory ) )
            // InternalVcsFeatures.g:3526:2: ( ruleHistory )
            {
            // InternalVcsFeatures.g:3526:2: ( ruleHistory )
            // InternalVcsFeatures.g:3527:3: ruleHistory
            {
             before(grammarAccess.getVCSFeaturesAccess().getHistoryHistoryParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHistory();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getHistoryHistoryParserRuleCall_6_2_1_0()); 

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
    // $ANTLR end "rule__VCSFeatures__HistoryAssignment_6_2_1"


    // $ANTLR start "rule__VCSFeatures__VersionunitAssignment_8_1"
    // InternalVcsFeatures.g:3536:1: rule__VCSFeatures__VersionunitAssignment_8_1 : ( ruleVersionUnit ) ;
    public final void rule__VCSFeatures__VersionunitAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3540:1: ( ( ruleVersionUnit ) )
            // InternalVcsFeatures.g:3541:2: ( ruleVersionUnit )
            {
            // InternalVcsFeatures.g:3541:2: ( ruleVersionUnit )
            // InternalVcsFeatures.g:3542:3: ruleVersionUnit
            {
             before(grammarAccess.getVCSFeaturesAccess().getVersionunitVersionUnitParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersionUnit();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getVersionunitVersionUnitParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__VCSFeatures__VersionunitAssignment_8_1"


    // $ANTLR start "rule__VCSFeatures__VersionunitAssignment_8_2_1"
    // InternalVcsFeatures.g:3551:1: rule__VCSFeatures__VersionunitAssignment_8_2_1 : ( ruleVersionUnit ) ;
    public final void rule__VCSFeatures__VersionunitAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3555:1: ( ( ruleVersionUnit ) )
            // InternalVcsFeatures.g:3556:2: ( ruleVersionUnit )
            {
            // InternalVcsFeatures.g:3556:2: ( ruleVersionUnit )
            // InternalVcsFeatures.g:3557:3: ruleVersionUnit
            {
             before(grammarAccess.getVCSFeaturesAccess().getVersionunitVersionUnitParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersionUnit();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getVersionunitVersionUnitParserRuleCall_8_2_1_0()); 

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
    // $ANTLR end "rule__VCSFeatures__VersionunitAssignment_8_2_1"


    // $ANTLR start "rule__VCSFeatures__CollaborationstyleAssignment_10_2"
    // InternalVcsFeatures.g:3566:1: rule__VCSFeatures__CollaborationstyleAssignment_10_2 : ( ruleCollaborationStyle ) ;
    public final void rule__VCSFeatures__CollaborationstyleAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3570:1: ( ( ruleCollaborationStyle ) )
            // InternalVcsFeatures.g:3571:2: ( ruleCollaborationStyle )
            {
            // InternalVcsFeatures.g:3571:2: ( ruleCollaborationStyle )
            // InternalVcsFeatures.g:3572:3: ruleCollaborationStyle
            {
             before(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleCollaborationStyleParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollaborationStyle();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleCollaborationStyleParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__VCSFeatures__CollaborationstyleAssignment_10_2"


    // $ANTLR start "rule__VCSFeatures__CollaborationstyleAssignment_10_3_1"
    // InternalVcsFeatures.g:3581:1: rule__VCSFeatures__CollaborationstyleAssignment_10_3_1 : ( ruleCollaborationStyle ) ;
    public final void rule__VCSFeatures__CollaborationstyleAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3585:1: ( ( ruleCollaborationStyle ) )
            // InternalVcsFeatures.g:3586:2: ( ruleCollaborationStyle )
            {
            // InternalVcsFeatures.g:3586:2: ( ruleCollaborationStyle )
            // InternalVcsFeatures.g:3587:3: ruleCollaborationStyle
            {
             before(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleCollaborationStyleParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollaborationStyle();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getCollaborationstyleCollaborationStyleParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__VCSFeatures__CollaborationstyleAssignment_10_3_1"


    // $ANTLR start "rule__VCSFeatures__DatabaseAssignment_12_1"
    // InternalVcsFeatures.g:3596:1: rule__VCSFeatures__DatabaseAssignment_12_1 : ( ruleDatabase ) ;
    public final void rule__VCSFeatures__DatabaseAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3600:1: ( ( ruleDatabase ) )
            // InternalVcsFeatures.g:3601:2: ( ruleDatabase )
            {
            // InternalVcsFeatures.g:3601:2: ( ruleDatabase )
            // InternalVcsFeatures.g:3602:3: ruleDatabase
            {
             before(grammarAccess.getVCSFeaturesAccess().getDatabaseDatabaseParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getDatabaseDatabaseParserRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__VCSFeatures__DatabaseAssignment_12_1"


    // $ANTLR start "rule__VCSFeatures__DatabaseAssignment_12_2"
    // InternalVcsFeatures.g:3611:1: rule__VCSFeatures__DatabaseAssignment_12_2 : ( ruleDatabase ) ;
    public final void rule__VCSFeatures__DatabaseAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3615:1: ( ( ruleDatabase ) )
            // InternalVcsFeatures.g:3616:2: ( ruleDatabase )
            {
            // InternalVcsFeatures.g:3616:2: ( ruleDatabase )
            // InternalVcsFeatures.g:3617:3: ruleDatabase
            {
             before(grammarAccess.getVCSFeaturesAccess().getDatabaseDatabaseParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getVCSFeaturesAccess().getDatabaseDatabaseParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__VCSFeatures__DatabaseAssignment_12_2"


    // $ANTLR start "rule__Commands__MergeStrategyAssignment_1_2"
    // InternalVcsFeatures.g:3626:1: rule__Commands__MergeStrategyAssignment_1_2 : ( ruleMergeStrategy ) ;
    public final void rule__Commands__MergeStrategyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3630:1: ( ( ruleMergeStrategy ) )
            // InternalVcsFeatures.g:3631:2: ( ruleMergeStrategy )
            {
            // InternalVcsFeatures.g:3631:2: ( ruleMergeStrategy )
            // InternalVcsFeatures.g:3632:3: ruleMergeStrategy
            {
             before(grammarAccess.getCommandsAccess().getMergeStrategyMergeStrategyEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMergeStrategy();

            state._fsp--;

             after(grammarAccess.getCommandsAccess().getMergeStrategyMergeStrategyEnumRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Commands__MergeStrategyAssignment_1_2"


    // $ANTLR start "rule__Commands__LowlevelcommandAssignment_2_3"
    // InternalVcsFeatures.g:3641:1: rule__Commands__LowlevelcommandAssignment_2_3 : ( ruleLowLevelCommand ) ;
    public final void rule__Commands__LowlevelcommandAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3645:1: ( ( ruleLowLevelCommand ) )
            // InternalVcsFeatures.g:3646:2: ( ruleLowLevelCommand )
            {
            // InternalVcsFeatures.g:3646:2: ( ruleLowLevelCommand )
            // InternalVcsFeatures.g:3647:3: ruleLowLevelCommand
            {
             before(grammarAccess.getCommandsAccess().getLowlevelcommandLowLevelCommandParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLowLevelCommand();

            state._fsp--;

             after(grammarAccess.getCommandsAccess().getLowlevelcommandLowLevelCommandParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__Commands__LowlevelcommandAssignment_2_3"


    // $ANTLR start "rule__Commands__LowlevelcommandAssignment_2_4"
    // InternalVcsFeatures.g:3656:1: rule__Commands__LowlevelcommandAssignment_2_4 : ( ruleLowLevelCommand ) ;
    public final void rule__Commands__LowlevelcommandAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3660:1: ( ( ruleLowLevelCommand ) )
            // InternalVcsFeatures.g:3661:2: ( ruleLowLevelCommand )
            {
            // InternalVcsFeatures.g:3661:2: ( ruleLowLevelCommand )
            // InternalVcsFeatures.g:3662:3: ruleLowLevelCommand
            {
             before(grammarAccess.getCommandsAccess().getLowlevelcommandLowLevelCommandParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLowLevelCommand();

            state._fsp--;

             after(grammarAccess.getCommandsAccess().getLowlevelcommandLowLevelCommandParserRuleCall_2_4_0()); 

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
    // $ANTLR end "rule__Commands__LowlevelcommandAssignment_2_4"


    // $ANTLR start "rule__Commands__HighlevelcommandAssignment_3_3"
    // InternalVcsFeatures.g:3671:1: rule__Commands__HighlevelcommandAssignment_3_3 : ( ruleHighLevelCommand ) ;
    public final void rule__Commands__HighlevelcommandAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3675:1: ( ( ruleHighLevelCommand ) )
            // InternalVcsFeatures.g:3676:2: ( ruleHighLevelCommand )
            {
            // InternalVcsFeatures.g:3676:2: ( ruleHighLevelCommand )
            // InternalVcsFeatures.g:3677:3: ruleHighLevelCommand
            {
             before(grammarAccess.getCommandsAccess().getHighlevelcommandHighLevelCommandParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLevelCommand();

            state._fsp--;

             after(grammarAccess.getCommandsAccess().getHighlevelcommandHighLevelCommandParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__Commands__HighlevelcommandAssignment_3_3"


    // $ANTLR start "rule__Commands__HighlevelcommandAssignment_3_4"
    // InternalVcsFeatures.g:3686:1: rule__Commands__HighlevelcommandAssignment_3_4 : ( ruleHighLevelCommand ) ;
    public final void rule__Commands__HighlevelcommandAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3690:1: ( ( ruleHighLevelCommand ) )
            // InternalVcsFeatures.g:3691:2: ( ruleHighLevelCommand )
            {
            // InternalVcsFeatures.g:3691:2: ( ruleHighLevelCommand )
            // InternalVcsFeatures.g:3692:3: ruleHighLevelCommand
            {
             before(grammarAccess.getCommandsAccess().getHighlevelcommandHighLevelCommandParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLevelCommand();

            state._fsp--;

             after(grammarAccess.getCommandsAccess().getHighlevelcommandHighLevelCommandParserRuleCall_3_4_0()); 

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
    // $ANTLR end "rule__Commands__HighlevelcommandAssignment_3_4"


    // $ANTLR start "rule__History__LabelTypeAssignment_1_2"
    // InternalVcsFeatures.g:3701:1: rule__History__LabelTypeAssignment_1_2 : ( ruleLabelType ) ;
    public final void rule__History__LabelTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3705:1: ( ( ruleLabelType ) )
            // InternalVcsFeatures.g:3706:2: ( ruleLabelType )
            {
            // InternalVcsFeatures.g:3706:2: ( ruleLabelType )
            // InternalVcsFeatures.g:3707:3: ruleLabelType
            {
             before(grammarAccess.getHistoryAccess().getLabelTypeLabelTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLabelType();

            state._fsp--;

             after(grammarAccess.getHistoryAccess().getLabelTypeLabelTypeEnumRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__History__LabelTypeAssignment_1_2"


    // $ANTLR start "rule__History__CommitHistoryRangeAssignment_2_3"
    // InternalVcsFeatures.g:3716:1: rule__History__CommitHistoryRangeAssignment_2_3 : ( ruleEInt ) ;
    public final void rule__History__CommitHistoryRangeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3720:1: ( ( ruleEInt ) )
            // InternalVcsFeatures.g:3721:2: ( ruleEInt )
            {
            // InternalVcsFeatures.g:3721:2: ( ruleEInt )
            // InternalVcsFeatures.g:3722:3: ruleEInt
            {
             before(grammarAccess.getHistoryAccess().getCommitHistoryRangeEIntParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHistoryAccess().getCommitHistoryRangeEIntParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__History__CommitHistoryRangeAssignment_2_3"


    // $ANTLR start "rule__History__NumberOfBranchesAssignment_3_4"
    // InternalVcsFeatures.g:3731:1: rule__History__NumberOfBranchesAssignment_3_4 : ( ruleEInt ) ;
    public final void rule__History__NumberOfBranchesAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3735:1: ( ( ruleEInt ) )
            // InternalVcsFeatures.g:3736:2: ( ruleEInt )
            {
            // InternalVcsFeatures.g:3736:2: ( ruleEInt )
            // InternalVcsFeatures.g:3737:3: ruleEInt
            {
             before(grammarAccess.getHistoryAccess().getNumberOfBranchesEIntParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHistoryAccess().getNumberOfBranchesEIntParserRuleCall_3_4_0()); 

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
    // $ANTLR end "rule__History__NumberOfBranchesAssignment_3_4"


    // $ANTLR start "rule__VersionUnit__GranularityAssignment_3_0"
    // InternalVcsFeatures.g:3746:1: rule__VersionUnit__GranularityAssignment_3_0 : ( ruleVersionUnitType ) ;
    public final void rule__VersionUnit__GranularityAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3750:1: ( ( ruleVersionUnitType ) )
            // InternalVcsFeatures.g:3751:2: ( ruleVersionUnitType )
            {
            // InternalVcsFeatures.g:3751:2: ( ruleVersionUnitType )
            // InternalVcsFeatures.g:3752:3: ruleVersionUnitType
            {
             before(grammarAccess.getVersionUnitAccess().getGranularityVersionUnitTypeEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVersionUnitType();

            state._fsp--;

             after(grammarAccess.getVersionUnitAccess().getGranularityVersionUnitTypeEnumRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__VersionUnit__GranularityAssignment_3_0"


    // $ANTLR start "rule__VersionUnit__GranularityAssignment_3_1"
    // InternalVcsFeatures.g:3761:1: rule__VersionUnit__GranularityAssignment_3_1 : ( ruleVersionUnitType ) ;
    public final void rule__VersionUnit__GranularityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3765:1: ( ( ruleVersionUnitType ) )
            // InternalVcsFeatures.g:3766:2: ( ruleVersionUnitType )
            {
            // InternalVcsFeatures.g:3766:2: ( ruleVersionUnitType )
            // InternalVcsFeatures.g:3767:3: ruleVersionUnitType
            {
             before(grammarAccess.getVersionUnitAccess().getGranularityVersionUnitTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersionUnitType();

            state._fsp--;

             after(grammarAccess.getVersionUnitAccess().getGranularityVersionUnitTypeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__VersionUnit__GranularityAssignment_3_1"


    // $ANTLR start "rule__CollaborationStyle__CollabStyleAssignment_2"
    // InternalVcsFeatures.g:3776:1: rule__CollaborationStyle__CollabStyleAssignment_2 : ( ruleCollaborationStyleType ) ;
    public final void rule__CollaborationStyle__CollabStyleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3780:1: ( ( ruleCollaborationStyleType ) )
            // InternalVcsFeatures.g:3781:2: ( ruleCollaborationStyleType )
            {
            // InternalVcsFeatures.g:3781:2: ( ruleCollaborationStyleType )
            // InternalVcsFeatures.g:3782:3: ruleCollaborationStyleType
            {
             before(grammarAccess.getCollaborationStyleAccess().getCollabStyleCollaborationStyleTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollaborationStyleType();

            state._fsp--;

             after(grammarAccess.getCollaborationStyleAccess().getCollabStyleCollaborationStyleTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__CollaborationStyle__CollabStyleAssignment_2"


    // $ANTLR start "rule__Database__NameAssignment_2"
    // InternalVcsFeatures.g:3791:1: rule__Database__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Database__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3795:1: ( ( ruleEString ) )
            // InternalVcsFeatures.g:3796:2: ( ruleEString )
            {
            // InternalVcsFeatures.g:3796:2: ( ruleEString )
            // InternalVcsFeatures.g:3797:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Database__NameAssignment_2"


    // $ANTLR start "rule__Database__DatabaseTypeAssignment_3"
    // InternalVcsFeatures.g:3806:1: rule__Database__DatabaseTypeAssignment_3 : ( ruleDatabaseType ) ;
    public final void rule__Database__DatabaseTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3810:1: ( ( ruleDatabaseType ) )
            // InternalVcsFeatures.g:3811:2: ( ruleDatabaseType )
            {
            // InternalVcsFeatures.g:3811:2: ( ruleDatabaseType )
            // InternalVcsFeatures.g:3812:3: ruleDatabaseType
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseTypeDatabaseTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabaseType();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getDatabaseTypeDatabaseTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Database__DatabaseTypeAssignment_3"


    // $ANTLR start "rule__Database__ConnectionStringAssignment_5"
    // InternalVcsFeatures.g:3821:1: rule__Database__ConnectionStringAssignment_5 : ( ruleEString ) ;
    public final void rule__Database__ConnectionStringAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3825:1: ( ( ruleEString ) )
            // InternalVcsFeatures.g:3826:2: ( ruleEString )
            {
            // InternalVcsFeatures.g:3826:2: ( ruleEString )
            // InternalVcsFeatures.g:3827:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getConnectionStringEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getConnectionStringEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Database__ConnectionStringAssignment_5"


    // $ANTLR start "rule__HighLevelCommand__NameAssignment_4"
    // InternalVcsFeatures.g:3836:1: rule__HighLevelCommand__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__HighLevelCommand__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3840:1: ( ( ruleEString ) )
            // InternalVcsFeatures.g:3841:2: ( ruleEString )
            {
            // InternalVcsFeatures.g:3841:2: ( ruleEString )
            // InternalVcsFeatures.g:3842:3: ruleEString
            {
             before(grammarAccess.getHighLevelCommandAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHighLevelCommandAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__HighLevelCommand__NameAssignment_4"


    // $ANTLR start "rule__HighLevelCommand__LowlevelcommandAssignment_5_1"
    // InternalVcsFeatures.g:3851:1: rule__HighLevelCommand__LowlevelcommandAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__HighLevelCommand__LowlevelcommandAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3855:1: ( ( ( ruleEString ) ) )
            // InternalVcsFeatures.g:3856:2: ( ( ruleEString ) )
            {
            // InternalVcsFeatures.g:3856:2: ( ( ruleEString ) )
            // InternalVcsFeatures.g:3857:3: ( ruleEString )
            {
             before(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandCrossReference_5_1_0()); 
            // InternalVcsFeatures.g:3858:3: ( ruleEString )
            // InternalVcsFeatures.g:3859:4: ruleEString
            {
             before(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__HighLevelCommand__LowlevelcommandAssignment_5_1"


    // $ANTLR start "rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1"
    // InternalVcsFeatures.g:3870:1: rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1 : ( ( ruleEString ) ) ;
    public final void rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3874:1: ( ( ( ruleEString ) ) )
            // InternalVcsFeatures.g:3875:2: ( ( ruleEString ) )
            {
            // InternalVcsFeatures.g:3875:2: ( ( ruleEString ) )
            // InternalVcsFeatures.g:3876:3: ( ruleEString )
            {
             before(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandCrossReference_5_2_1_0()); 
            // InternalVcsFeatures.g:3877:3: ( ruleEString )
            // InternalVcsFeatures.g:3878:4: ruleEString
            {
             before(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandEStringParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandEStringParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getHighLevelCommandAccess().getLowlevelcommandLowLevelCommandCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__HighLevelCommand__LowlevelcommandAssignment_5_2_1"


    // $ANTLR start "rule__LowLevelCommand__CommandAssignment_3"
    // InternalVcsFeatures.g:3889:1: rule__LowLevelCommand__CommandAssignment_3 : ( ruleLowCommands ) ;
    public final void rule__LowLevelCommand__CommandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3893:1: ( ( ruleLowCommands ) )
            // InternalVcsFeatures.g:3894:2: ( ruleLowCommands )
            {
            // InternalVcsFeatures.g:3894:2: ( ruleLowCommands )
            // InternalVcsFeatures.g:3895:3: ruleLowCommands
            {
             before(grammarAccess.getLowLevelCommandAccess().getCommandLowCommandsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLowCommands();

            state._fsp--;

             after(grammarAccess.getLowLevelCommandAccess().getCommandLowCommandsEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__LowLevelCommand__CommandAssignment_3"


    // $ANTLR start "rule__LowLevelCommand__NameAssignment_5"
    // InternalVcsFeatures.g:3904:1: rule__LowLevelCommand__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__LowLevelCommand__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVcsFeatures.g:3908:1: ( ( ruleEString ) )
            // InternalVcsFeatures.g:3909:2: ( ruleEString )
            {
            // InternalVcsFeatures.g:3909:2: ( ruleEString )
            // InternalVcsFeatures.g:3910:3: ruleEString
            {
             before(grammarAccess.getLowLevelCommandAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLowLevelCommandAccess().getNameEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__LowLevelCommand__NameAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0094000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x2500000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000000FFFE000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});

}