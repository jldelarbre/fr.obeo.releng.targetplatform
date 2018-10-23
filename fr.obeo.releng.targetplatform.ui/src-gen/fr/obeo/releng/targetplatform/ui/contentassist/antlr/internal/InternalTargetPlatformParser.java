package fr.obeo.releng.targetplatform.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.obeo.releng.targetplatform.services.TargetPlatformGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetPlatformParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_QUALIFIER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'lazy'", "'('", "'['", "')'", "']'", "'requirements'", "'allEnvironments'", "'source'", "'configurePhase'", "'target'", "'with'", "','", "'environment'", "'define'", "'='", "'+'", "'${'", "'}'", "'include'", "'location'", "'{'", "';'", "'version'", "'.'", "'const'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_QUALIFIER=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTargetPlatformParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTargetPlatformParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTargetPlatformParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g"; }


     
     	private TargetPlatformGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TargetPlatformGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTargetPlatform"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:60:1: entryRuleTargetPlatform : ruleTargetPlatform EOF ;
    public final void entryRuleTargetPlatform() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:61:1: ( ruleTargetPlatform EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:62:1: ruleTargetPlatform EOF
            {
             before(grammarAccess.getTargetPlatformRule()); 
            pushFollow(FOLLOW_ruleTargetPlatform_in_entryRuleTargetPlatform61);
            ruleTargetPlatform();

            state._fsp--;

             after(grammarAccess.getTargetPlatformRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetPlatform68); 

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
    // $ANTLR end "entryRuleTargetPlatform"


    // $ANTLR start "ruleTargetPlatform"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:69:1: ruleTargetPlatform : ( ( rule__TargetPlatform__Group__0 )? ) ;
    public final void ruleTargetPlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:73:2: ( ( ( rule__TargetPlatform__Group__0 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:74:1: ( ( rule__TargetPlatform__Group__0 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:74:1: ( ( rule__TargetPlatform__Group__0 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:75:1: ( rule__TargetPlatform__Group__0 )?
            {
             before(grammarAccess.getTargetPlatformAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:76:1: ( rule__TargetPlatform__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:76:2: rule__TargetPlatform__Group__0
                    {
                    pushFollow(FOLLOW_rule__TargetPlatform__Group__0_in_ruleTargetPlatform94);
                    rule__TargetPlatform__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetPlatformAccess().getGroup()); 

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
    // $ANTLR end "ruleTargetPlatform"


    // $ANTLR start "entryRuleTargetContent"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:88:1: entryRuleTargetContent : ruleTargetContent EOF ;
    public final void entryRuleTargetContent() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:89:1: ( ruleTargetContent EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:90:1: ruleTargetContent EOF
            {
             before(grammarAccess.getTargetContentRule()); 
            pushFollow(FOLLOW_ruleTargetContent_in_entryRuleTargetContent122);
            ruleTargetContent();

            state._fsp--;

             after(grammarAccess.getTargetContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetContent129); 

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
    // $ANTLR end "entryRuleTargetContent"


    // $ANTLR start "ruleTargetContent"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:97:1: ruleTargetContent : ( ( rule__TargetContent__Alternatives ) ) ;
    public final void ruleTargetContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:101:2: ( ( ( rule__TargetContent__Alternatives ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:102:1: ( ( rule__TargetContent__Alternatives ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:102:1: ( ( rule__TargetContent__Alternatives ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:103:1: ( rule__TargetContent__Alternatives )
            {
             before(grammarAccess.getTargetContentAccess().getAlternatives()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:104:1: ( rule__TargetContent__Alternatives )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:104:2: rule__TargetContent__Alternatives
            {
            pushFollow(FOLLOW_rule__TargetContent__Alternatives_in_ruleTargetContent155);
            rule__TargetContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTargetContent"


    // $ANTLR start "entryRuleOptions"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:116:1: entryRuleOptions : ruleOptions EOF ;
    public final void entryRuleOptions() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:117:1: ( ruleOptions EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:118:1: ruleOptions EOF
            {
             before(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_ruleOptions_in_entryRuleOptions182);
            ruleOptions();

            state._fsp--;

             after(grammarAccess.getOptionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptions189); 

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
    // $ANTLR end "entryRuleOptions"


    // $ANTLR start "ruleOptions"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:125:1: ruleOptions : ( ( rule__Options__Group__0 ) ) ;
    public final void ruleOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:129:2: ( ( ( rule__Options__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:130:1: ( ( rule__Options__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:130:1: ( ( rule__Options__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:131:1: ( rule__Options__Group__0 )
            {
             before(grammarAccess.getOptionsAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:132:1: ( rule__Options__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:132:2: rule__Options__Group__0
            {
            pushFollow(FOLLOW_rule__Options__Group__0_in_ruleOptions215);
            rule__Options__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getGroup()); 

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
    // $ANTLR end "ruleOptions"


    // $ANTLR start "entryRuleEnvironment"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:144:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:145:1: ( ruleEnvironment EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:146:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_ruleEnvironment_in_entryRuleEnvironment242);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironment249); 

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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:153:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:157:2: ( ( ( rule__Environment__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:158:1: ( ( rule__Environment__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:158:1: ( ( rule__Environment__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:159:1: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:160:1: ( rule__Environment__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:160:2: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_rule__Environment__Group__0_in_ruleEnvironment275);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleVarDefinition"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:172:1: entryRuleVarDefinition : ruleVarDefinition EOF ;
    public final void entryRuleVarDefinition() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:173:1: ( ruleVarDefinition EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:174:1: ruleVarDefinition EOF
            {
             before(grammarAccess.getVarDefinitionRule()); 
            pushFollow(FOLLOW_ruleVarDefinition_in_entryRuleVarDefinition302);
            ruleVarDefinition();

            state._fsp--;

             after(grammarAccess.getVarDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDefinition309); 

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
    // $ANTLR end "entryRuleVarDefinition"


    // $ANTLR start "ruleVarDefinition"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:181:1: ruleVarDefinition : ( ( rule__VarDefinition__Group__0 ) ) ;
    public final void ruleVarDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:185:2: ( ( ( rule__VarDefinition__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:186:1: ( ( rule__VarDefinition__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:186:1: ( ( rule__VarDefinition__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:187:1: ( rule__VarDefinition__Group__0 )
            {
             before(grammarAccess.getVarDefinitionAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:188:1: ( rule__VarDefinition__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:188:2: rule__VarDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__VarDefinition__Group__0_in_ruleVarDefinition335);
            rule__VarDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleVarDefinition"


    // $ANTLR start "entryRuleCompositeString"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:200:1: entryRuleCompositeString : ruleCompositeString EOF ;
    public final void entryRuleCompositeString() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:201:1: ( ruleCompositeString EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:202:1: ruleCompositeString EOF
            {
             before(grammarAccess.getCompositeStringRule()); 
            pushFollow(FOLLOW_ruleCompositeString_in_entryRuleCompositeString362);
            ruleCompositeString();

            state._fsp--;

             after(grammarAccess.getCompositeStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeString369); 

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
    // $ANTLR end "entryRuleCompositeString"


    // $ANTLR start "ruleCompositeString"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:209:1: ruleCompositeString : ( ( rule__CompositeString__Group__0 ) ) ;
    public final void ruleCompositeString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:213:2: ( ( ( rule__CompositeString__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:214:1: ( ( rule__CompositeString__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:214:1: ( ( rule__CompositeString__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:215:1: ( rule__CompositeString__Group__0 )
            {
             before(grammarAccess.getCompositeStringAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:216:1: ( rule__CompositeString__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:216:2: rule__CompositeString__Group__0
            {
            pushFollow(FOLLOW_rule__CompositeString__Group__0_in_ruleCompositeString395);
            rule__CompositeString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeStringAccess().getGroup()); 

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
    // $ANTLR end "ruleCompositeString"


    // $ANTLR start "entryRuleCompositeStringPart"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:228:1: entryRuleCompositeStringPart : ruleCompositeStringPart EOF ;
    public final void entryRuleCompositeStringPart() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:229:1: ( ruleCompositeStringPart EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:230:1: ruleCompositeStringPart EOF
            {
             before(grammarAccess.getCompositeStringPartRule()); 
            pushFollow(FOLLOW_ruleCompositeStringPart_in_entryRuleCompositeStringPart422);
            ruleCompositeStringPart();

            state._fsp--;

             after(grammarAccess.getCompositeStringPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeStringPart429); 

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
    // $ANTLR end "entryRuleCompositeStringPart"


    // $ANTLR start "ruleCompositeStringPart"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:237:1: ruleCompositeStringPart : ( ( rule__CompositeStringPart__Alternatives ) ) ;
    public final void ruleCompositeStringPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:241:2: ( ( ( rule__CompositeStringPart__Alternatives ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:242:1: ( ( rule__CompositeStringPart__Alternatives ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:242:1: ( ( rule__CompositeStringPart__Alternatives ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:243:1: ( rule__CompositeStringPart__Alternatives )
            {
             before(grammarAccess.getCompositeStringPartAccess().getAlternatives()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:244:1: ( rule__CompositeStringPart__Alternatives )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:244:2: rule__CompositeStringPart__Alternatives
            {
            pushFollow(FOLLOW_rule__CompositeStringPart__Alternatives_in_ruleCompositeStringPart455);
            rule__CompositeStringPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompositeStringPartAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCompositeStringPart"


    // $ANTLR start "entryRuleVarCall"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:256:1: entryRuleVarCall : ruleVarCall EOF ;
    public final void entryRuleVarCall() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:257:1: ( ruleVarCall EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:258:1: ruleVarCall EOF
            {
             before(grammarAccess.getVarCallRule()); 
            pushFollow(FOLLOW_ruleVarCall_in_entryRuleVarCall482);
            ruleVarCall();

            state._fsp--;

             after(grammarAccess.getVarCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarCall489); 

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
    // $ANTLR end "entryRuleVarCall"


    // $ANTLR start "ruleVarCall"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:265:1: ruleVarCall : ( ( rule__VarCall__Group__0 ) ) ;
    public final void ruleVarCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:269:2: ( ( ( rule__VarCall__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:270:1: ( ( rule__VarCall__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:270:1: ( ( rule__VarCall__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:271:1: ( rule__VarCall__Group__0 )
            {
             before(grammarAccess.getVarCallAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:272:1: ( rule__VarCall__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:272:2: rule__VarCall__Group__0
            {
            pushFollow(FOLLOW_rule__VarCall__Group__0_in_ruleVarCall515);
            rule__VarCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarCallAccess().getGroup()); 

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
    // $ANTLR end "ruleVarCall"


    // $ANTLR start "entryRuleStaticString"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:284:1: entryRuleStaticString : ruleStaticString EOF ;
    public final void entryRuleStaticString() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:285:1: ( ruleStaticString EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:286:1: ruleStaticString EOF
            {
             before(grammarAccess.getStaticStringRule()); 
            pushFollow(FOLLOW_ruleStaticString_in_entryRuleStaticString542);
            ruleStaticString();

            state._fsp--;

             after(grammarAccess.getStaticStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticString549); 

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
    // $ANTLR end "entryRuleStaticString"


    // $ANTLR start "ruleStaticString"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:293:1: ruleStaticString : ( ( rule__StaticString__ValueAssignment ) ) ;
    public final void ruleStaticString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:297:2: ( ( ( rule__StaticString__ValueAssignment ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:298:1: ( ( rule__StaticString__ValueAssignment ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:298:1: ( ( rule__StaticString__ValueAssignment ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:299:1: ( rule__StaticString__ValueAssignment )
            {
             before(grammarAccess.getStaticStringAccess().getValueAssignment()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:300:1: ( rule__StaticString__ValueAssignment )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:300:2: rule__StaticString__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StaticString__ValueAssignment_in_ruleStaticString575);
            rule__StaticString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStaticStringAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStaticString"


    // $ANTLR start "entryRuleIncludeDeclaration"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:312:1: entryRuleIncludeDeclaration : ruleIncludeDeclaration EOF ;
    public final void entryRuleIncludeDeclaration() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:313:1: ( ruleIncludeDeclaration EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:314:1: ruleIncludeDeclaration EOF
            {
             before(grammarAccess.getIncludeDeclarationRule()); 
            pushFollow(FOLLOW_ruleIncludeDeclaration_in_entryRuleIncludeDeclaration602);
            ruleIncludeDeclaration();

            state._fsp--;

             after(grammarAccess.getIncludeDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDeclaration609); 

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
    // $ANTLR end "entryRuleIncludeDeclaration"


    // $ANTLR start "ruleIncludeDeclaration"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:321:1: ruleIncludeDeclaration : ( ( rule__IncludeDeclaration__Group__0 ) ) ;
    public final void ruleIncludeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:325:2: ( ( ( rule__IncludeDeclaration__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:326:1: ( ( rule__IncludeDeclaration__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:326:1: ( ( rule__IncludeDeclaration__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:327:1: ( rule__IncludeDeclaration__Group__0 )
            {
             before(grammarAccess.getIncludeDeclarationAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:328:1: ( rule__IncludeDeclaration__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:328:2: rule__IncludeDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeDeclaration__Group__0_in_ruleIncludeDeclaration635);
            rule__IncludeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleIncludeDeclaration"


    // $ANTLR start "entryRuleLocation"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:340:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:341:1: ( ruleLocation EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:342:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation662);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation669); 

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:349:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:353:2: ( ( ( rule__Location__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:354:1: ( ( rule__Location__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:354:1: ( ( rule__Location__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:355:1: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:356:1: ( rule__Location__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:356:2: rule__Location__Group__0
            {
            pushFollow(FOLLOW_rule__Location__Group__0_in_ruleLocation695);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleIU"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:368:1: entryRuleIU : ruleIU EOF ;
    public final void entryRuleIU() throws RecognitionException {
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:369:1: ( ruleIU EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:370:1: ruleIU EOF
            {
             before(grammarAccess.getIURule()); 
            pushFollow(FOLLOW_ruleIU_in_entryRuleIU722);
            ruleIU();

            state._fsp--;

             after(grammarAccess.getIURule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIU729); 

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
    // $ANTLR end "entryRuleIU"


    // $ANTLR start "ruleIU"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:377:1: ruleIU : ( ( rule__IU__Group__0 ) ) ;
    public final void ruleIU() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:381:2: ( ( ( rule__IU__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:382:1: ( ( rule__IU__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:382:1: ( ( rule__IU__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:383:1: ( rule__IU__Group__0 )
            {
             before(grammarAccess.getIUAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:384:1: ( rule__IU__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:384:2: rule__IU__Group__0
            {
            pushFollow(FOLLOW_rule__IU__Group__0_in_ruleIU755);
            rule__IU__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIUAccess().getGroup()); 

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
    // $ANTLR end "ruleIU"


    // $ANTLR start "entryRuleVersion"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:396:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:400:1: ( ruleVersion EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:401:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion787);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion794); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:411:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:416:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:417:1: ( ( rule__Version__Group__0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:417:1: ( ( rule__Version__Group__0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:418:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:419:1: ( rule__Version__Group__0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:419:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion824);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleVersionRange"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:432:1: entryRuleVersionRange : ruleVersionRange EOF ;
    public final void entryRuleVersionRange() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:436:1: ( ruleVersionRange EOF )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:437:1: ruleVersionRange EOF
            {
             before(grammarAccess.getVersionRangeRule()); 
            pushFollow(FOLLOW_ruleVersionRange_in_entryRuleVersionRange856);
            ruleVersionRange();

            state._fsp--;

             after(grammarAccess.getVersionRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionRange863); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleVersionRange"


    // $ANTLR start "ruleVersionRange"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:447:1: ruleVersionRange : ( ( rule__VersionRange__Alternatives ) ) ;
    public final void ruleVersionRange() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:452:2: ( ( ( rule__VersionRange__Alternatives ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:453:1: ( ( rule__VersionRange__Alternatives ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:453:1: ( ( rule__VersionRange__Alternatives ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:454:1: ( rule__VersionRange__Alternatives )
            {
             before(grammarAccess.getVersionRangeAccess().getAlternatives()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:455:1: ( rule__VersionRange__Alternatives )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:455:2: rule__VersionRange__Alternatives
            {
            pushFollow(FOLLOW_rule__VersionRange__Alternatives_in_ruleVersionRange893);
            rule__VersionRange__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVersionRangeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleVersionRange"


    // $ANTLR start "ruleOption"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:469:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:473:1: ( ( ( rule__Option__Alternatives ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:474:1: ( ( rule__Option__Alternatives ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:474:1: ( ( rule__Option__Alternatives ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:475:1: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:476:1: ( rule__Option__Alternatives )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:476:2: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_rule__Option__Alternatives_in_ruleOption930);
            rule__Option__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "rule__TargetContent__Alternatives"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:487:1: rule__TargetContent__Alternatives : ( ( ruleOptions ) | ( ruleEnvironment ) | ( ruleIncludeDeclaration ) | ( ruleLocation ) | ( ruleVarDefinition ) );
    public final void rule__TargetContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:491:1: ( ( ruleOptions ) | ( ruleEnvironment ) | ( ruleIncludeDeclaration ) | ( ruleLocation ) | ( ruleVarDefinition ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:492:1: ( ruleOptions )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:492:1: ( ruleOptions )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:493:1: ruleOptions
                    {
                     before(grammarAccess.getTargetContentAccess().getOptionsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOptions_in_rule__TargetContent__Alternatives965);
                    ruleOptions();

                    state._fsp--;

                     after(grammarAccess.getTargetContentAccess().getOptionsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:498:6: ( ruleEnvironment )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:498:6: ( ruleEnvironment )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:499:1: ruleEnvironment
                    {
                     before(grammarAccess.getTargetContentAccess().getEnvironmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnvironment_in_rule__TargetContent__Alternatives982);
                    ruleEnvironment();

                    state._fsp--;

                     after(grammarAccess.getTargetContentAccess().getEnvironmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:504:6: ( ruleIncludeDeclaration )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:504:6: ( ruleIncludeDeclaration )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:505:1: ruleIncludeDeclaration
                    {
                     before(grammarAccess.getTargetContentAccess().getIncludeDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIncludeDeclaration_in_rule__TargetContent__Alternatives999);
                    ruleIncludeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTargetContentAccess().getIncludeDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:510:6: ( ruleLocation )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:510:6: ( ruleLocation )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:511:1: ruleLocation
                    {
                     before(grammarAccess.getTargetContentAccess().getLocationParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLocation_in_rule__TargetContent__Alternatives1016);
                    ruleLocation();

                    state._fsp--;

                     after(grammarAccess.getTargetContentAccess().getLocationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:516:6: ( ruleVarDefinition )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:516:6: ( ruleVarDefinition )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:517:1: ruleVarDefinition
                    {
                     before(grammarAccess.getTargetContentAccess().getVarDefinitionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleVarDefinition_in_rule__TargetContent__Alternatives1033);
                    ruleVarDefinition();

                    state._fsp--;

                     after(grammarAccess.getTargetContentAccess().getVarDefinitionParserRuleCall_4()); 

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
    // $ANTLR end "rule__TargetContent__Alternatives"


    // $ANTLR start "rule__CompositeStringPart__Alternatives"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:527:1: rule__CompositeStringPart__Alternatives : ( ( ruleVarCall ) | ( ruleStaticString ) );
    public final void rule__CompositeStringPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:531:1: ( ( ruleVarCall ) | ( ruleStaticString ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:532:1: ( ruleVarCall )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:532:1: ( ruleVarCall )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:533:1: ruleVarCall
                    {
                     before(grammarAccess.getCompositeStringPartAccess().getVarCallParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVarCall_in_rule__CompositeStringPart__Alternatives1065);
                    ruleVarCall();

                    state._fsp--;

                     after(grammarAccess.getCompositeStringPartAccess().getVarCallParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:538:6: ( ruleStaticString )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:538:6: ( ruleStaticString )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:539:1: ruleStaticString
                    {
                     before(grammarAccess.getCompositeStringPartAccess().getStaticStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStaticString_in_rule__CompositeStringPart__Alternatives1082);
                    ruleStaticString();

                    state._fsp--;

                     after(grammarAccess.getCompositeStringPartAccess().getStaticStringParserRuleCall_1()); 

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
    // $ANTLR end "rule__CompositeStringPart__Alternatives"


    // $ANTLR start "rule__IU__Alternatives_1_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:549:1: rule__IU__Alternatives_1_1 : ( ( ( rule__IU__Alternatives_1_1_0 ) ) | ( ( rule__IU__VarVersionAssignment_1_1_1 ) ) );
    public final void rule__IU__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:553:1: ( ( ( rule__IU__Alternatives_1_1_0 ) ) | ( ( rule__IU__VarVersionAssignment_1_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==RULE_STRING||(LA4_0>=12 && LA4_0<=14)) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:554:1: ( ( rule__IU__Alternatives_1_1_0 ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:554:1: ( ( rule__IU__Alternatives_1_1_0 ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:555:1: ( rule__IU__Alternatives_1_1_0 )
                    {
                     before(grammarAccess.getIUAccess().getAlternatives_1_1_0()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:556:1: ( rule__IU__Alternatives_1_1_0 )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:556:2: rule__IU__Alternatives_1_1_0
                    {
                    pushFollow(FOLLOW_rule__IU__Alternatives_1_1_0_in_rule__IU__Alternatives_1_11114);
                    rule__IU__Alternatives_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIUAccess().getAlternatives_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:560:6: ( ( rule__IU__VarVersionAssignment_1_1_1 ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:560:6: ( ( rule__IU__VarVersionAssignment_1_1_1 ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:561:1: ( rule__IU__VarVersionAssignment_1_1_1 )
                    {
                     before(grammarAccess.getIUAccess().getVarVersionAssignment_1_1_1()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:562:1: ( rule__IU__VarVersionAssignment_1_1_1 )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:562:2: rule__IU__VarVersionAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__IU__VarVersionAssignment_1_1_1_in_rule__IU__Alternatives_1_11132);
                    rule__IU__VarVersionAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIUAccess().getVarVersionAssignment_1_1_1()); 

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
    // $ANTLR end "rule__IU__Alternatives_1_1"


    // $ANTLR start "rule__IU__Alternatives_1_1_0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:571:1: rule__IU__Alternatives_1_1_0 : ( ( ( rule__IU__VersionAssignment_1_1_0_0 ) ) | ( ( rule__IU__VersionAssignment_1_1_0_1 ) ) );
    public final void rule__IU__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:575:1: ( ( ( rule__IU__VersionAssignment_1_1_0_0 ) ) | ( ( rule__IU__VersionAssignment_1_1_0_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||(LA5_0>=12 && LA5_0<=14)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:576:1: ( ( rule__IU__VersionAssignment_1_1_0_0 ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:576:1: ( ( rule__IU__VersionAssignment_1_1_0_0 ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:577:1: ( rule__IU__VersionAssignment_1_1_0_0 )
                    {
                     before(grammarAccess.getIUAccess().getVersionAssignment_1_1_0_0()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:578:1: ( rule__IU__VersionAssignment_1_1_0_0 )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:578:2: rule__IU__VersionAssignment_1_1_0_0
                    {
                    pushFollow(FOLLOW_rule__IU__VersionAssignment_1_1_0_0_in_rule__IU__Alternatives_1_1_01165);
                    rule__IU__VersionAssignment_1_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIUAccess().getVersionAssignment_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:582:6: ( ( rule__IU__VersionAssignment_1_1_0_1 ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:582:6: ( ( rule__IU__VersionAssignment_1_1_0_1 ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:583:1: ( rule__IU__VersionAssignment_1_1_0_1 )
                    {
                     before(grammarAccess.getIUAccess().getVersionAssignment_1_1_0_1()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:584:1: ( rule__IU__VersionAssignment_1_1_0_1 )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:584:2: rule__IU__VersionAssignment_1_1_0_1
                    {
                    pushFollow(FOLLOW_rule__IU__VersionAssignment_1_1_0_1_in_rule__IU__Alternatives_1_1_01183);
                    rule__IU__VersionAssignment_1_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIUAccess().getVersionAssignment_1_1_0_1()); 

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
    // $ANTLR end "rule__IU__Alternatives_1_1_0"


    // $ANTLR start "rule__Version__Alternatives_1_2_2_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:593:1: rule__Version__Alternatives_1_2_2_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_QUALIFIER ) );
    public final void rule__Version__Alternatives_1_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:597:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_QUALIFIER ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_QUALIFIER:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:598:1: ( RULE_ID )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:598:1: ( RULE_ID )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:599:1: RULE_ID
                    {
                     before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_2_2_1_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Version__Alternatives_1_2_2_11216); 
                     after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_2_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:604:6: ( RULE_INT )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:604:6: ( RULE_INT )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:605:1: RULE_INT
                    {
                     before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_2_2_1_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_2_2_11233); 
                     after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_2_2_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:610:6: ( RULE_QUALIFIER )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:610:6: ( RULE_QUALIFIER )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:611:1: RULE_QUALIFIER
                    {
                     before(grammarAccess.getVersionAccess().getQUALIFIERTerminalRuleCall_1_2_2_1_2()); 
                    match(input,RULE_QUALIFIER,FOLLOW_RULE_QUALIFIER_in_rule__Version__Alternatives_1_2_2_11250); 
                     after(grammarAccess.getVersionAccess().getQUALIFIERTerminalRuleCall_1_2_2_1_2()); 

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
    // $ANTLR end "rule__Version__Alternatives_1_2_2_1"


    // $ANTLR start "rule__VersionRange__Alternatives"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:621:1: rule__VersionRange__Alternatives : ( ( ( rule__VersionRange__Group_0__0 ) ) | ( ruleVersion ) | ( 'lazy' ) );
    public final void rule__VersionRange__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:625:1: ( ( ( rule__VersionRange__Group_0__0 ) ) | ( ruleVersion ) | ( 'lazy' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case 12:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:626:1: ( ( rule__VersionRange__Group_0__0 ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:626:1: ( ( rule__VersionRange__Group_0__0 ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:627:1: ( rule__VersionRange__Group_0__0 )
                    {
                     before(grammarAccess.getVersionRangeAccess().getGroup_0()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:628:1: ( rule__VersionRange__Group_0__0 )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:628:2: rule__VersionRange__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__VersionRange__Group_0__0_in_rule__VersionRange__Alternatives1282);
                    rule__VersionRange__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVersionRangeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:632:6: ( ruleVersion )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:632:6: ( ruleVersion )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:633:1: ruleVersion
                    {
                     before(grammarAccess.getVersionRangeAccess().getVersionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVersion_in_rule__VersionRange__Alternatives1300);
                    ruleVersion();

                    state._fsp--;

                     after(grammarAccess.getVersionRangeAccess().getVersionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:638:6: ( 'lazy' )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:638:6: ( 'lazy' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:639:1: 'lazy'
                    {
                     before(grammarAccess.getVersionRangeAccess().getLazyKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__VersionRange__Alternatives1318); 
                     after(grammarAccess.getVersionRangeAccess().getLazyKeyword_2()); 

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
    // $ANTLR end "rule__VersionRange__Alternatives"


    // $ANTLR start "rule__VersionRange__Alternatives_0_0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:651:1: rule__VersionRange__Alternatives_0_0 : ( ( '(' ) | ( '[' ) );
    public final void rule__VersionRange__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:655:1: ( ( '(' ) | ( '[' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:656:1: ( '(' )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:656:1: ( '(' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:657:1: '('
                    {
                     before(grammarAccess.getVersionRangeAccess().getLeftParenthesisKeyword_0_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__VersionRange__Alternatives_0_01353); 
                     after(grammarAccess.getVersionRangeAccess().getLeftParenthesisKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:664:6: ( '[' )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:664:6: ( '[' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:665:1: '['
                    {
                     before(grammarAccess.getVersionRangeAccess().getLeftSquareBracketKeyword_0_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__VersionRange__Alternatives_0_01373); 
                     after(grammarAccess.getVersionRangeAccess().getLeftSquareBracketKeyword_0_0_1()); 

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
    // $ANTLR end "rule__VersionRange__Alternatives_0_0"


    // $ANTLR start "rule__VersionRange__Alternatives_0_4"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:677:1: rule__VersionRange__Alternatives_0_4 : ( ( ')' ) | ( ']' ) );
    public final void rule__VersionRange__Alternatives_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:681:1: ( ( ')' ) | ( ']' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:682:1: ( ')' )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:682:1: ( ')' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:683:1: ')'
                    {
                     before(grammarAccess.getVersionRangeAccess().getRightParenthesisKeyword_0_4_0()); 
                    match(input,15,FOLLOW_15_in_rule__VersionRange__Alternatives_0_41408); 
                     after(grammarAccess.getVersionRangeAccess().getRightParenthesisKeyword_0_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:690:6: ( ']' )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:690:6: ( ']' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:691:1: ']'
                    {
                     before(grammarAccess.getVersionRangeAccess().getRightSquareBracketKeyword_0_4_1()); 
                    match(input,16,FOLLOW_16_in_rule__VersionRange__Alternatives_0_41428); 
                     after(grammarAccess.getVersionRangeAccess().getRightSquareBracketKeyword_0_4_1()); 

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
    // $ANTLR end "rule__VersionRange__Alternatives_0_4"


    // $ANTLR start "rule__Option__Alternatives"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:703:1: rule__Option__Alternatives : ( ( ( 'requirements' ) ) | ( ( 'allEnvironments' ) ) | ( ( 'source' ) ) | ( ( 'configurePhase' ) ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:707:1: ( ( ( 'requirements' ) ) | ( ( 'allEnvironments' ) ) | ( ( 'source' ) ) | ( ( 'configurePhase' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 20:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:708:1: ( ( 'requirements' ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:708:1: ( ( 'requirements' ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:709:1: ( 'requirements' )
                    {
                     before(grammarAccess.getOptionAccess().getINCLUDE_REQUIREDEnumLiteralDeclaration_0()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:710:1: ( 'requirements' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:710:3: 'requirements'
                    {
                    match(input,17,FOLLOW_17_in_rule__Option__Alternatives1463); 

                    }

                     after(grammarAccess.getOptionAccess().getINCLUDE_REQUIREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:715:6: ( ( 'allEnvironments' ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:715:6: ( ( 'allEnvironments' ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:716:1: ( 'allEnvironments' )
                    {
                     before(grammarAccess.getOptionAccess().getINCLUDE_ALL_ENVIRONMENTSEnumLiteralDeclaration_1()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:717:1: ( 'allEnvironments' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:717:3: 'allEnvironments'
                    {
                    match(input,18,FOLLOW_18_in_rule__Option__Alternatives1484); 

                    }

                     after(grammarAccess.getOptionAccess().getINCLUDE_ALL_ENVIRONMENTSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:722:6: ( ( 'source' ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:722:6: ( ( 'source' ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:723:1: ( 'source' )
                    {
                     before(grammarAccess.getOptionAccess().getINCLUDE_SOURCEEnumLiteralDeclaration_2()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:724:1: ( 'source' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:724:3: 'source'
                    {
                    match(input,19,FOLLOW_19_in_rule__Option__Alternatives1505); 

                    }

                     after(grammarAccess.getOptionAccess().getINCLUDE_SOURCEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:729:6: ( ( 'configurePhase' ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:729:6: ( ( 'configurePhase' ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:730:1: ( 'configurePhase' )
                    {
                     before(grammarAccess.getOptionAccess().getINCLUDE_CONFIGURE_PHASEEnumLiteralDeclaration_3()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:731:1: ( 'configurePhase' )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:731:3: 'configurePhase'
                    {
                    match(input,20,FOLLOW_20_in_rule__Option__Alternatives1526); 

                    }

                     after(grammarAccess.getOptionAccess().getINCLUDE_CONFIGURE_PHASEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Option__Alternatives"


    // $ANTLR start "rule__TargetPlatform__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:743:1: rule__TargetPlatform__Group__0 : rule__TargetPlatform__Group__0__Impl rule__TargetPlatform__Group__1 ;
    public final void rule__TargetPlatform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:747:1: ( rule__TargetPlatform__Group__0__Impl rule__TargetPlatform__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:748:2: rule__TargetPlatform__Group__0__Impl rule__TargetPlatform__Group__1
            {
            pushFollow(FOLLOW_rule__TargetPlatform__Group__0__Impl_in_rule__TargetPlatform__Group__01559);
            rule__TargetPlatform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetPlatform__Group__1_in_rule__TargetPlatform__Group__01562);
            rule__TargetPlatform__Group__1();

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
    // $ANTLR end "rule__TargetPlatform__Group__0"


    // $ANTLR start "rule__TargetPlatform__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:755:1: rule__TargetPlatform__Group__0__Impl : ( 'target' ) ;
    public final void rule__TargetPlatform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:759:1: ( ( 'target' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:760:1: ( 'target' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:760:1: ( 'target' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:761:1: 'target'
            {
             before(grammarAccess.getTargetPlatformAccess().getTargetKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__TargetPlatform__Group__0__Impl1590); 
             after(grammarAccess.getTargetPlatformAccess().getTargetKeyword_0()); 

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
    // $ANTLR end "rule__TargetPlatform__Group__0__Impl"


    // $ANTLR start "rule__TargetPlatform__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:774:1: rule__TargetPlatform__Group__1 : rule__TargetPlatform__Group__1__Impl rule__TargetPlatform__Group__2 ;
    public final void rule__TargetPlatform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:778:1: ( rule__TargetPlatform__Group__1__Impl rule__TargetPlatform__Group__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:779:2: rule__TargetPlatform__Group__1__Impl rule__TargetPlatform__Group__2
            {
            pushFollow(FOLLOW_rule__TargetPlatform__Group__1__Impl_in_rule__TargetPlatform__Group__11621);
            rule__TargetPlatform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetPlatform__Group__2_in_rule__TargetPlatform__Group__11624);
            rule__TargetPlatform__Group__2();

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
    // $ANTLR end "rule__TargetPlatform__Group__1"


    // $ANTLR start "rule__TargetPlatform__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:786:1: rule__TargetPlatform__Group__1__Impl : ( ( rule__TargetPlatform__NameAssignment_1 ) ) ;
    public final void rule__TargetPlatform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:790:1: ( ( ( rule__TargetPlatform__NameAssignment_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:791:1: ( ( rule__TargetPlatform__NameAssignment_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:791:1: ( ( rule__TargetPlatform__NameAssignment_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:792:1: ( rule__TargetPlatform__NameAssignment_1 )
            {
             before(grammarAccess.getTargetPlatformAccess().getNameAssignment_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:793:1: ( rule__TargetPlatform__NameAssignment_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:793:2: rule__TargetPlatform__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TargetPlatform__NameAssignment_1_in_rule__TargetPlatform__Group__1__Impl1651);
            rule__TargetPlatform__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetPlatformAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TargetPlatform__Group__1__Impl"


    // $ANTLR start "rule__TargetPlatform__Group__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:803:1: rule__TargetPlatform__Group__2 : rule__TargetPlatform__Group__2__Impl ;
    public final void rule__TargetPlatform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:807:1: ( rule__TargetPlatform__Group__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:808:2: rule__TargetPlatform__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TargetPlatform__Group__2__Impl_in_rule__TargetPlatform__Group__21681);
            rule__TargetPlatform__Group__2__Impl();

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
    // $ANTLR end "rule__TargetPlatform__Group__2"


    // $ANTLR start "rule__TargetPlatform__Group__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:814:1: rule__TargetPlatform__Group__2__Impl : ( ( rule__TargetPlatform__ContentsAssignment_2 )* ) ;
    public final void rule__TargetPlatform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:818:1: ( ( ( rule__TargetPlatform__ContentsAssignment_2 )* ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:819:1: ( ( rule__TargetPlatform__ContentsAssignment_2 )* )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:819:1: ( ( rule__TargetPlatform__ContentsAssignment_2 )* )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:820:1: ( rule__TargetPlatform__ContentsAssignment_2 )*
            {
             before(grammarAccess.getTargetPlatformAccess().getContentsAssignment_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:821:1: ( rule__TargetPlatform__ContentsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22||(LA11_0>=24 && LA11_0<=25)||(LA11_0>=30 && LA11_0<=31)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:821:2: rule__TargetPlatform__ContentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TargetPlatform__ContentsAssignment_2_in_rule__TargetPlatform__Group__2__Impl1708);
            	    rule__TargetPlatform__ContentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTargetPlatformAccess().getContentsAssignment_2()); 

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
    // $ANTLR end "rule__TargetPlatform__Group__2__Impl"


    // $ANTLR start "rule__Options__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:837:1: rule__Options__Group__0 : rule__Options__Group__0__Impl rule__Options__Group__1 ;
    public final void rule__Options__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:841:1: ( rule__Options__Group__0__Impl rule__Options__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:842:2: rule__Options__Group__0__Impl rule__Options__Group__1
            {
            pushFollow(FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__01745);
            rule__Options__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group__1_in_rule__Options__Group__01748);
            rule__Options__Group__1();

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
    // $ANTLR end "rule__Options__Group__0"


    // $ANTLR start "rule__Options__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:849:1: rule__Options__Group__0__Impl : ( 'with' ) ;
    public final void rule__Options__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:853:1: ( ( 'with' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:854:1: ( 'with' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:854:1: ( 'with' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:855:1: 'with'
            {
             before(grammarAccess.getOptionsAccess().getWithKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Options__Group__0__Impl1776); 
             after(grammarAccess.getOptionsAccess().getWithKeyword_0()); 

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
    // $ANTLR end "rule__Options__Group__0__Impl"


    // $ANTLR start "rule__Options__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:868:1: rule__Options__Group__1 : rule__Options__Group__1__Impl rule__Options__Group__2 ;
    public final void rule__Options__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:872:1: ( rule__Options__Group__1__Impl rule__Options__Group__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:873:2: rule__Options__Group__1__Impl rule__Options__Group__2
            {
            pushFollow(FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__11807);
            rule__Options__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group__2_in_rule__Options__Group__11810);
            rule__Options__Group__2();

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
    // $ANTLR end "rule__Options__Group__1"


    // $ANTLR start "rule__Options__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:880:1: rule__Options__Group__1__Impl : ( ( rule__Options__OptionsAssignment_1 ) ) ;
    public final void rule__Options__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:884:1: ( ( ( rule__Options__OptionsAssignment_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:885:1: ( ( rule__Options__OptionsAssignment_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:885:1: ( ( rule__Options__OptionsAssignment_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:886:1: ( rule__Options__OptionsAssignment_1 )
            {
             before(grammarAccess.getOptionsAccess().getOptionsAssignment_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:887:1: ( rule__Options__OptionsAssignment_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:887:2: rule__Options__OptionsAssignment_1
            {
            pushFollow(FOLLOW_rule__Options__OptionsAssignment_1_in_rule__Options__Group__1__Impl1837);
            rule__Options__OptionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getOptionsAssignment_1()); 

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
    // $ANTLR end "rule__Options__Group__1__Impl"


    // $ANTLR start "rule__Options__Group__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:897:1: rule__Options__Group__2 : rule__Options__Group__2__Impl ;
    public final void rule__Options__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:901:1: ( rule__Options__Group__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:902:2: rule__Options__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group__2__Impl_in_rule__Options__Group__21867);
            rule__Options__Group__2__Impl();

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
    // $ANTLR end "rule__Options__Group__2"


    // $ANTLR start "rule__Options__Group__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:908:1: rule__Options__Group__2__Impl : ( ( rule__Options__Group_2__0 )* ) ;
    public final void rule__Options__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:912:1: ( ( ( rule__Options__Group_2__0 )* ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:913:1: ( ( rule__Options__Group_2__0 )* )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:913:1: ( ( rule__Options__Group_2__0 )* )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:914:1: ( rule__Options__Group_2__0 )*
            {
             before(grammarAccess.getOptionsAccess().getGroup_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:915:1: ( rule__Options__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=17 && LA12_0<=20)||LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:915:2: rule__Options__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Options__Group_2__0_in_rule__Options__Group__2__Impl1894);
            	    rule__Options__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOptionsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Options__Group__2__Impl"


    // $ANTLR start "rule__Options__Group_2__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:931:1: rule__Options__Group_2__0 : rule__Options__Group_2__0__Impl rule__Options__Group_2__1 ;
    public final void rule__Options__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:935:1: ( rule__Options__Group_2__0__Impl rule__Options__Group_2__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:936:2: rule__Options__Group_2__0__Impl rule__Options__Group_2__1
            {
            pushFollow(FOLLOW_rule__Options__Group_2__0__Impl_in_rule__Options__Group_2__01931);
            rule__Options__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Options__Group_2__1_in_rule__Options__Group_2__01934);
            rule__Options__Group_2__1();

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
    // $ANTLR end "rule__Options__Group_2__0"


    // $ANTLR start "rule__Options__Group_2__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:943:1: rule__Options__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Options__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:947:1: ( ( ( ',' )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:948:1: ( ( ',' )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:948:1: ( ( ',' )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:949:1: ( ',' )?
            {
             before(grammarAccess.getOptionsAccess().getCommaKeyword_2_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:950:1: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:951:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Options__Group_2__0__Impl1963); 

                    }
                    break;

            }

             after(grammarAccess.getOptionsAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Options__Group_2__0__Impl"


    // $ANTLR start "rule__Options__Group_2__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:962:1: rule__Options__Group_2__1 : rule__Options__Group_2__1__Impl ;
    public final void rule__Options__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:966:1: ( rule__Options__Group_2__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:967:2: rule__Options__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Options__Group_2__1__Impl_in_rule__Options__Group_2__11996);
            rule__Options__Group_2__1__Impl();

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
    // $ANTLR end "rule__Options__Group_2__1"


    // $ANTLR start "rule__Options__Group_2__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:973:1: rule__Options__Group_2__1__Impl : ( ( rule__Options__OptionsAssignment_2_1 ) ) ;
    public final void rule__Options__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:977:1: ( ( ( rule__Options__OptionsAssignment_2_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:978:1: ( ( rule__Options__OptionsAssignment_2_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:978:1: ( ( rule__Options__OptionsAssignment_2_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:979:1: ( rule__Options__OptionsAssignment_2_1 )
            {
             before(grammarAccess.getOptionsAccess().getOptionsAssignment_2_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:980:1: ( rule__Options__OptionsAssignment_2_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:980:2: rule__Options__OptionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Options__OptionsAssignment_2_1_in_rule__Options__Group_2__1__Impl2023);
            rule__Options__OptionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getOptionsAssignment_2_1()); 

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
    // $ANTLR end "rule__Options__Group_2__1__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:994:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:998:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:999:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__02057);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__02060);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1006:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1010:1: ( ( () ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1011:1: ( () )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1011:1: ( () )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1012:1: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1013:1: ()
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1015:1: 
            {
            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1025:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1029:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1030:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__12118);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__12121);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1037:1: rule__Environment__Group__1__Impl : ( 'environment' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1041:1: ( ( 'environment' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1042:1: ( 'environment' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1042:1: ( 'environment' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1043:1: 'environment'
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Environment__Group__1__Impl2149); 
             after(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 

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
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1056:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1060:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1061:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__22180);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__22183);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1068:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__EnvAssignment_2 ) ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1072:1: ( ( ( rule__Environment__EnvAssignment_2 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1073:1: ( ( rule__Environment__EnvAssignment_2 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1073:1: ( ( rule__Environment__EnvAssignment_2 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1074:1: ( rule__Environment__EnvAssignment_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getEnvAssignment_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1075:1: ( rule__Environment__EnvAssignment_2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1075:2: rule__Environment__EnvAssignment_2
            {
            pushFollow(FOLLOW_rule__Environment__EnvAssignment_2_in_rule__Environment__Group__2__Impl2210);
            rule__Environment__EnvAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getEnvAssignment_2()); 

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
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1085:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1089:1: ( rule__Environment__Group__3__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1090:2: rule__Environment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__32240);
            rule__Environment__Group__3__Impl();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1096:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__Group_3__0 )* ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1100:1: ( ( ( rule__Environment__Group_3__0 )* ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1101:1: ( ( rule__Environment__Group_3__0 )* )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1101:1: ( ( rule__Environment__Group_3__0 )* )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1102:1: ( rule__Environment__Group_3__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_3()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1103:1: ( rule__Environment__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1103:2: rule__Environment__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Environment__Group_3__0_in_rule__Environment__Group__3__Impl2267);
            	    rule__Environment__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group_3__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1121:1: rule__Environment__Group_3__0 : rule__Environment__Group_3__0__Impl rule__Environment__Group_3__1 ;
    public final void rule__Environment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1125:1: ( rule__Environment__Group_3__0__Impl rule__Environment__Group_3__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1126:2: rule__Environment__Group_3__0__Impl rule__Environment__Group_3__1
            {
            pushFollow(FOLLOW_rule__Environment__Group_3__0__Impl_in_rule__Environment__Group_3__02306);
            rule__Environment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Environment__Group_3__1_in_rule__Environment__Group_3__02309);
            rule__Environment__Group_3__1();

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
    // $ANTLR end "rule__Environment__Group_3__0"


    // $ANTLR start "rule__Environment__Group_3__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1133:1: rule__Environment__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Environment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1137:1: ( ( ( ',' )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1138:1: ( ( ',' )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1138:1: ( ( ',' )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1139:1: ( ',' )?
            {
             before(grammarAccess.getEnvironmentAccess().getCommaKeyword_3_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1140:1: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1141:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Environment__Group_3__0__Impl2338); 

                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Environment__Group_3__0__Impl"


    // $ANTLR start "rule__Environment__Group_3__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1152:1: rule__Environment__Group_3__1 : rule__Environment__Group_3__1__Impl ;
    public final void rule__Environment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1156:1: ( rule__Environment__Group_3__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1157:2: rule__Environment__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Environment__Group_3__1__Impl_in_rule__Environment__Group_3__12371);
            rule__Environment__Group_3__1__Impl();

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
    // $ANTLR end "rule__Environment__Group_3__1"


    // $ANTLR start "rule__Environment__Group_3__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1163:1: rule__Environment__Group_3__1__Impl : ( ( rule__Environment__EnvAssignment_3_1 ) ) ;
    public final void rule__Environment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1167:1: ( ( ( rule__Environment__EnvAssignment_3_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1168:1: ( ( rule__Environment__EnvAssignment_3_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1168:1: ( ( rule__Environment__EnvAssignment_3_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1169:1: ( rule__Environment__EnvAssignment_3_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getEnvAssignment_3_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1170:1: ( rule__Environment__EnvAssignment_3_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1170:2: rule__Environment__EnvAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Environment__EnvAssignment_3_1_in_rule__Environment__Group_3__1__Impl2398);
            rule__Environment__EnvAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getEnvAssignment_3_1()); 

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
    // $ANTLR end "rule__Environment__Group_3__1__Impl"


    // $ANTLR start "rule__VarDefinition__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1184:1: rule__VarDefinition__Group__0 : rule__VarDefinition__Group__0__Impl rule__VarDefinition__Group__1 ;
    public final void rule__VarDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1188:1: ( rule__VarDefinition__Group__0__Impl rule__VarDefinition__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1189:2: rule__VarDefinition__Group__0__Impl rule__VarDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__VarDefinition__Group__0__Impl_in_rule__VarDefinition__Group__02432);
            rule__VarDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDefinition__Group__1_in_rule__VarDefinition__Group__02435);
            rule__VarDefinition__Group__1();

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
    // $ANTLR end "rule__VarDefinition__Group__0"


    // $ANTLR start "rule__VarDefinition__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1196:1: rule__VarDefinition__Group__0__Impl : ( 'define' ) ;
    public final void rule__VarDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1200:1: ( ( 'define' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1201:1: ( 'define' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1201:1: ( 'define' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1202:1: 'define'
            {
             before(grammarAccess.getVarDefinitionAccess().getDefineKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__VarDefinition__Group__0__Impl2463); 
             after(grammarAccess.getVarDefinitionAccess().getDefineKeyword_0()); 

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
    // $ANTLR end "rule__VarDefinition__Group__0__Impl"


    // $ANTLR start "rule__VarDefinition__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1215:1: rule__VarDefinition__Group__1 : rule__VarDefinition__Group__1__Impl rule__VarDefinition__Group__2 ;
    public final void rule__VarDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1219:1: ( rule__VarDefinition__Group__1__Impl rule__VarDefinition__Group__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1220:2: rule__VarDefinition__Group__1__Impl rule__VarDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__VarDefinition__Group__1__Impl_in_rule__VarDefinition__Group__12494);
            rule__VarDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDefinition__Group__2_in_rule__VarDefinition__Group__12497);
            rule__VarDefinition__Group__2();

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
    // $ANTLR end "rule__VarDefinition__Group__1"


    // $ANTLR start "rule__VarDefinition__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1227:1: rule__VarDefinition__Group__1__Impl : ( ( rule__VarDefinition__ConstantAssignment_1 )? ) ;
    public final void rule__VarDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1231:1: ( ( ( rule__VarDefinition__ConstantAssignment_1 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1232:1: ( ( rule__VarDefinition__ConstantAssignment_1 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1232:1: ( ( rule__VarDefinition__ConstantAssignment_1 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1233:1: ( rule__VarDefinition__ConstantAssignment_1 )?
            {
             before(grammarAccess.getVarDefinitionAccess().getConstantAssignment_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1234:1: ( rule__VarDefinition__ConstantAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1234:2: rule__VarDefinition__ConstantAssignment_1
                    {
                    pushFollow(FOLLOW_rule__VarDefinition__ConstantAssignment_1_in_rule__VarDefinition__Group__1__Impl2524);
                    rule__VarDefinition__ConstantAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarDefinitionAccess().getConstantAssignment_1()); 

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
    // $ANTLR end "rule__VarDefinition__Group__1__Impl"


    // $ANTLR start "rule__VarDefinition__Group__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1244:1: rule__VarDefinition__Group__2 : rule__VarDefinition__Group__2__Impl rule__VarDefinition__Group__3 ;
    public final void rule__VarDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1248:1: ( rule__VarDefinition__Group__2__Impl rule__VarDefinition__Group__3 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1249:2: rule__VarDefinition__Group__2__Impl rule__VarDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__VarDefinition__Group__2__Impl_in_rule__VarDefinition__Group__22555);
            rule__VarDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDefinition__Group__3_in_rule__VarDefinition__Group__22558);
            rule__VarDefinition__Group__3();

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
    // $ANTLR end "rule__VarDefinition__Group__2"


    // $ANTLR start "rule__VarDefinition__Group__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1256:1: rule__VarDefinition__Group__2__Impl : ( ( rule__VarDefinition__NameAssignment_2 ) ) ;
    public final void rule__VarDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1260:1: ( ( ( rule__VarDefinition__NameAssignment_2 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1261:1: ( ( rule__VarDefinition__NameAssignment_2 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1261:1: ( ( rule__VarDefinition__NameAssignment_2 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1262:1: ( rule__VarDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getVarDefinitionAccess().getNameAssignment_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1263:1: ( rule__VarDefinition__NameAssignment_2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1263:2: rule__VarDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__VarDefinition__NameAssignment_2_in_rule__VarDefinition__Group__2__Impl2585);
            rule__VarDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDefinitionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__VarDefinition__Group__2__Impl"


    // $ANTLR start "rule__VarDefinition__Group__3"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1273:1: rule__VarDefinition__Group__3 : rule__VarDefinition__Group__3__Impl rule__VarDefinition__Group__4 ;
    public final void rule__VarDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1277:1: ( rule__VarDefinition__Group__3__Impl rule__VarDefinition__Group__4 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1278:2: rule__VarDefinition__Group__3__Impl rule__VarDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__VarDefinition__Group__3__Impl_in_rule__VarDefinition__Group__32615);
            rule__VarDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDefinition__Group__4_in_rule__VarDefinition__Group__32618);
            rule__VarDefinition__Group__4();

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
    // $ANTLR end "rule__VarDefinition__Group__3"


    // $ANTLR start "rule__VarDefinition__Group__3__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1285:1: rule__VarDefinition__Group__3__Impl : ( '=' ) ;
    public final void rule__VarDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1289:1: ( ( '=' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1290:1: ( '=' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1290:1: ( '=' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1291:1: '='
            {
             before(grammarAccess.getVarDefinitionAccess().getEqualsSignKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__VarDefinition__Group__3__Impl2646); 
             after(grammarAccess.getVarDefinitionAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__VarDefinition__Group__3__Impl"


    // $ANTLR start "rule__VarDefinition__Group__4"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1304:1: rule__VarDefinition__Group__4 : rule__VarDefinition__Group__4__Impl ;
    public final void rule__VarDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1308:1: ( rule__VarDefinition__Group__4__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1309:2: rule__VarDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VarDefinition__Group__4__Impl_in_rule__VarDefinition__Group__42677);
            rule__VarDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__VarDefinition__Group__4"


    // $ANTLR start "rule__VarDefinition__Group__4__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1315:1: rule__VarDefinition__Group__4__Impl : ( ( rule__VarDefinition__ValueAssignment_4 ) ) ;
    public final void rule__VarDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1319:1: ( ( ( rule__VarDefinition__ValueAssignment_4 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1320:1: ( ( rule__VarDefinition__ValueAssignment_4 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1320:1: ( ( rule__VarDefinition__ValueAssignment_4 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1321:1: ( rule__VarDefinition__ValueAssignment_4 )
            {
             before(grammarAccess.getVarDefinitionAccess().getValueAssignment_4()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1322:1: ( rule__VarDefinition__ValueAssignment_4 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1322:2: rule__VarDefinition__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__VarDefinition__ValueAssignment_4_in_rule__VarDefinition__Group__4__Impl2704);
            rule__VarDefinition__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVarDefinitionAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__VarDefinition__Group__4__Impl"


    // $ANTLR start "rule__CompositeString__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1342:1: rule__CompositeString__Group__0 : rule__CompositeString__Group__0__Impl rule__CompositeString__Group__1 ;
    public final void rule__CompositeString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1346:1: ( rule__CompositeString__Group__0__Impl rule__CompositeString__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1347:2: rule__CompositeString__Group__0__Impl rule__CompositeString__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeString__Group__0__Impl_in_rule__CompositeString__Group__02744);
            rule__CompositeString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeString__Group__1_in_rule__CompositeString__Group__02747);
            rule__CompositeString__Group__1();

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
    // $ANTLR end "rule__CompositeString__Group__0"


    // $ANTLR start "rule__CompositeString__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1354:1: rule__CompositeString__Group__0__Impl : ( () ) ;
    public final void rule__CompositeString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1358:1: ( ( () ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1359:1: ( () )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1359:1: ( () )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1360:1: ()
            {
             before(grammarAccess.getCompositeStringAccess().getCompositeStringAction_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1361:1: ()
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1363:1: 
            {
            }

             after(grammarAccess.getCompositeStringAccess().getCompositeStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeString__Group__0__Impl"


    // $ANTLR start "rule__CompositeString__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1373:1: rule__CompositeString__Group__1 : rule__CompositeString__Group__1__Impl rule__CompositeString__Group__2 ;
    public final void rule__CompositeString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1377:1: ( rule__CompositeString__Group__1__Impl rule__CompositeString__Group__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1378:2: rule__CompositeString__Group__1__Impl rule__CompositeString__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeString__Group__1__Impl_in_rule__CompositeString__Group__12805);
            rule__CompositeString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeString__Group__2_in_rule__CompositeString__Group__12808);
            rule__CompositeString__Group__2();

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
    // $ANTLR end "rule__CompositeString__Group__1"


    // $ANTLR start "rule__CompositeString__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1385:1: rule__CompositeString__Group__1__Impl : ( ( rule__CompositeString__StringPartsAssignment_1 ) ) ;
    public final void rule__CompositeString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1389:1: ( ( ( rule__CompositeString__StringPartsAssignment_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1390:1: ( ( rule__CompositeString__StringPartsAssignment_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1390:1: ( ( rule__CompositeString__StringPartsAssignment_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1391:1: ( rule__CompositeString__StringPartsAssignment_1 )
            {
             before(grammarAccess.getCompositeStringAccess().getStringPartsAssignment_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1392:1: ( rule__CompositeString__StringPartsAssignment_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1392:2: rule__CompositeString__StringPartsAssignment_1
            {
            pushFollow(FOLLOW_rule__CompositeString__StringPartsAssignment_1_in_rule__CompositeString__Group__1__Impl2835);
            rule__CompositeString__StringPartsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeStringAccess().getStringPartsAssignment_1()); 

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
    // $ANTLR end "rule__CompositeString__Group__1__Impl"


    // $ANTLR start "rule__CompositeString__Group__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1402:1: rule__CompositeString__Group__2 : rule__CompositeString__Group__2__Impl ;
    public final void rule__CompositeString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1406:1: ( rule__CompositeString__Group__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1407:2: rule__CompositeString__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompositeString__Group__2__Impl_in_rule__CompositeString__Group__22865);
            rule__CompositeString__Group__2__Impl();

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
    // $ANTLR end "rule__CompositeString__Group__2"


    // $ANTLR start "rule__CompositeString__Group__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1413:1: rule__CompositeString__Group__2__Impl : ( ( rule__CompositeString__Group_2__0 )* ) ;
    public final void rule__CompositeString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1417:1: ( ( ( rule__CompositeString__Group_2__0 )* ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1418:1: ( ( rule__CompositeString__Group_2__0 )* )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1418:1: ( ( rule__CompositeString__Group_2__0 )* )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1419:1: ( rule__CompositeString__Group_2__0 )*
            {
             before(grammarAccess.getCompositeStringAccess().getGroup_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1420:1: ( rule__CompositeString__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1420:2: rule__CompositeString__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompositeString__Group_2__0_in_rule__CompositeString__Group__2__Impl2892);
            	    rule__CompositeString__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCompositeStringAccess().getGroup_2()); 

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
    // $ANTLR end "rule__CompositeString__Group__2__Impl"


    // $ANTLR start "rule__CompositeString__Group_2__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1436:1: rule__CompositeString__Group_2__0 : rule__CompositeString__Group_2__0__Impl rule__CompositeString__Group_2__1 ;
    public final void rule__CompositeString__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1440:1: ( rule__CompositeString__Group_2__0__Impl rule__CompositeString__Group_2__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1441:2: rule__CompositeString__Group_2__0__Impl rule__CompositeString__Group_2__1
            {
            pushFollow(FOLLOW_rule__CompositeString__Group_2__0__Impl_in_rule__CompositeString__Group_2__02929);
            rule__CompositeString__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeString__Group_2__1_in_rule__CompositeString__Group_2__02932);
            rule__CompositeString__Group_2__1();

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
    // $ANTLR end "rule__CompositeString__Group_2__0"


    // $ANTLR start "rule__CompositeString__Group_2__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1448:1: rule__CompositeString__Group_2__0__Impl : ( '+' ) ;
    public final void rule__CompositeString__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1452:1: ( ( '+' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1453:1: ( '+' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1453:1: ( '+' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1454:1: '+'
            {
             before(grammarAccess.getCompositeStringAccess().getPlusSignKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__CompositeString__Group_2__0__Impl2960); 
             after(grammarAccess.getCompositeStringAccess().getPlusSignKeyword_2_0()); 

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
    // $ANTLR end "rule__CompositeString__Group_2__0__Impl"


    // $ANTLR start "rule__CompositeString__Group_2__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1467:1: rule__CompositeString__Group_2__1 : rule__CompositeString__Group_2__1__Impl ;
    public final void rule__CompositeString__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1471:1: ( rule__CompositeString__Group_2__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1472:2: rule__CompositeString__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CompositeString__Group_2__1__Impl_in_rule__CompositeString__Group_2__12991);
            rule__CompositeString__Group_2__1__Impl();

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
    // $ANTLR end "rule__CompositeString__Group_2__1"


    // $ANTLR start "rule__CompositeString__Group_2__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1478:1: rule__CompositeString__Group_2__1__Impl : ( ( rule__CompositeString__StringPartsAssignment_2_1 ) ) ;
    public final void rule__CompositeString__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1482:1: ( ( ( rule__CompositeString__StringPartsAssignment_2_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1483:1: ( ( rule__CompositeString__StringPartsAssignment_2_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1483:1: ( ( rule__CompositeString__StringPartsAssignment_2_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1484:1: ( rule__CompositeString__StringPartsAssignment_2_1 )
            {
             before(grammarAccess.getCompositeStringAccess().getStringPartsAssignment_2_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1485:1: ( rule__CompositeString__StringPartsAssignment_2_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1485:2: rule__CompositeString__StringPartsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CompositeString__StringPartsAssignment_2_1_in_rule__CompositeString__Group_2__1__Impl3018);
            rule__CompositeString__StringPartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeStringAccess().getStringPartsAssignment_2_1()); 

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
    // $ANTLR end "rule__CompositeString__Group_2__1__Impl"


    // $ANTLR start "rule__VarCall__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1499:1: rule__VarCall__Group__0 : rule__VarCall__Group__0__Impl rule__VarCall__Group__1 ;
    public final void rule__VarCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1503:1: ( rule__VarCall__Group__0__Impl rule__VarCall__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1504:2: rule__VarCall__Group__0__Impl rule__VarCall__Group__1
            {
            pushFollow(FOLLOW_rule__VarCall__Group__0__Impl_in_rule__VarCall__Group__03052);
            rule__VarCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarCall__Group__1_in_rule__VarCall__Group__03055);
            rule__VarCall__Group__1();

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
    // $ANTLR end "rule__VarCall__Group__0"


    // $ANTLR start "rule__VarCall__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1511:1: rule__VarCall__Group__0__Impl : ( '${' ) ;
    public final void rule__VarCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1515:1: ( ( '${' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1516:1: ( '${' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1516:1: ( '${' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1517:1: '${'
            {
             before(grammarAccess.getVarCallAccess().getDollarSignLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__VarCall__Group__0__Impl3083); 
             after(grammarAccess.getVarCallAccess().getDollarSignLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__VarCall__Group__0__Impl"


    // $ANTLR start "rule__VarCall__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1530:1: rule__VarCall__Group__1 : rule__VarCall__Group__1__Impl rule__VarCall__Group__2 ;
    public final void rule__VarCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1534:1: ( rule__VarCall__Group__1__Impl rule__VarCall__Group__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1535:2: rule__VarCall__Group__1__Impl rule__VarCall__Group__2
            {
            pushFollow(FOLLOW_rule__VarCall__Group__1__Impl_in_rule__VarCall__Group__13114);
            rule__VarCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarCall__Group__2_in_rule__VarCall__Group__13117);
            rule__VarCall__Group__2();

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
    // $ANTLR end "rule__VarCall__Group__1"


    // $ANTLR start "rule__VarCall__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1542:1: rule__VarCall__Group__1__Impl : ( ( rule__VarCall__VarNameAssignment_1 ) ) ;
    public final void rule__VarCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1546:1: ( ( ( rule__VarCall__VarNameAssignment_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1547:1: ( ( rule__VarCall__VarNameAssignment_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1547:1: ( ( rule__VarCall__VarNameAssignment_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1548:1: ( rule__VarCall__VarNameAssignment_1 )
            {
             before(grammarAccess.getVarCallAccess().getVarNameAssignment_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1549:1: ( rule__VarCall__VarNameAssignment_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1549:2: rule__VarCall__VarNameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarCall__VarNameAssignment_1_in_rule__VarCall__Group__1__Impl3144);
            rule__VarCall__VarNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarCallAccess().getVarNameAssignment_1()); 

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
    // $ANTLR end "rule__VarCall__Group__1__Impl"


    // $ANTLR start "rule__VarCall__Group__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1559:1: rule__VarCall__Group__2 : rule__VarCall__Group__2__Impl ;
    public final void rule__VarCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1563:1: ( rule__VarCall__Group__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1564:2: rule__VarCall__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VarCall__Group__2__Impl_in_rule__VarCall__Group__23174);
            rule__VarCall__Group__2__Impl();

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
    // $ANTLR end "rule__VarCall__Group__2"


    // $ANTLR start "rule__VarCall__Group__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1570:1: rule__VarCall__Group__2__Impl : ( '}' ) ;
    public final void rule__VarCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1574:1: ( ( '}' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1575:1: ( '}' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1575:1: ( '}' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1576:1: '}'
            {
             before(grammarAccess.getVarCallAccess().getRightCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__VarCall__Group__2__Impl3202); 
             after(grammarAccess.getVarCallAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__VarCall__Group__2__Impl"


    // $ANTLR start "rule__IncludeDeclaration__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1595:1: rule__IncludeDeclaration__Group__0 : rule__IncludeDeclaration__Group__0__Impl rule__IncludeDeclaration__Group__1 ;
    public final void rule__IncludeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1599:1: ( rule__IncludeDeclaration__Group__0__Impl rule__IncludeDeclaration__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1600:2: rule__IncludeDeclaration__Group__0__Impl rule__IncludeDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeDeclaration__Group__0__Impl_in_rule__IncludeDeclaration__Group__03239);
            rule__IncludeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeDeclaration__Group__1_in_rule__IncludeDeclaration__Group__03242);
            rule__IncludeDeclaration__Group__1();

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
    // $ANTLR end "rule__IncludeDeclaration__Group__0"


    // $ANTLR start "rule__IncludeDeclaration__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1607:1: rule__IncludeDeclaration__Group__0__Impl : ( 'include' ) ;
    public final void rule__IncludeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1611:1: ( ( 'include' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1612:1: ( 'include' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1612:1: ( 'include' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1613:1: 'include'
            {
             before(grammarAccess.getIncludeDeclarationAccess().getIncludeKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__IncludeDeclaration__Group__0__Impl3270); 
             after(grammarAccess.getIncludeDeclarationAccess().getIncludeKeyword_0()); 

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
    // $ANTLR end "rule__IncludeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__IncludeDeclaration__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1626:1: rule__IncludeDeclaration__Group__1 : rule__IncludeDeclaration__Group__1__Impl ;
    public final void rule__IncludeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1630:1: ( rule__IncludeDeclaration__Group__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1631:2: rule__IncludeDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IncludeDeclaration__Group__1__Impl_in_rule__IncludeDeclaration__Group__13301);
            rule__IncludeDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__IncludeDeclaration__Group__1"


    // $ANTLR start "rule__IncludeDeclaration__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1637:1: rule__IncludeDeclaration__Group__1__Impl : ( ( rule__IncludeDeclaration__CompositeImportURIAssignment_1 ) ) ;
    public final void rule__IncludeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1641:1: ( ( ( rule__IncludeDeclaration__CompositeImportURIAssignment_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1642:1: ( ( rule__IncludeDeclaration__CompositeImportURIAssignment_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1642:1: ( ( rule__IncludeDeclaration__CompositeImportURIAssignment_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1643:1: ( rule__IncludeDeclaration__CompositeImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeDeclarationAccess().getCompositeImportURIAssignment_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1644:1: ( rule__IncludeDeclaration__CompositeImportURIAssignment_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1644:2: rule__IncludeDeclaration__CompositeImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__IncludeDeclaration__CompositeImportURIAssignment_1_in_rule__IncludeDeclaration__Group__1__Impl3328);
            rule__IncludeDeclaration__CompositeImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeDeclarationAccess().getCompositeImportURIAssignment_1()); 

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
    // $ANTLR end "rule__IncludeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1658:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1662:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1663:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_rule__Location__Group__0__Impl_in_rule__Location__Group__03362);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group__1_in_rule__Location__Group__03365);
            rule__Location__Group__1();

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
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1670:1: rule__Location__Group__0__Impl : ( 'location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1674:1: ( ( 'location' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1675:1: ( 'location' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1675:1: ( 'location' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1676:1: 'location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Location__Group__0__Impl3393); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_0()); 

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
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1689:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1693:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1694:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_rule__Location__Group__1__Impl_in_rule__Location__Group__13424);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group__2_in_rule__Location__Group__13427);
            rule__Location__Group__2();

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
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1701:1: rule__Location__Group__1__Impl : ( ( rule__Location__UnorderedGroup_1 ) ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1705:1: ( ( ( rule__Location__UnorderedGroup_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1706:1: ( ( rule__Location__UnorderedGroup_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1706:1: ( ( rule__Location__UnorderedGroup_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1707:1: ( rule__Location__UnorderedGroup_1 )
            {
             before(grammarAccess.getLocationAccess().getUnorderedGroup_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1708:1: ( rule__Location__UnorderedGroup_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1708:2: rule__Location__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__Location__UnorderedGroup_1_in_rule__Location__Group__1__Impl3454);
            rule__Location__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getUnorderedGroup_1()); 

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
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1718:1: rule__Location__Group__2 : rule__Location__Group__2__Impl ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1722:1: ( rule__Location__Group__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1723:2: rule__Location__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Location__Group__2__Impl_in_rule__Location__Group__23484);
            rule__Location__Group__2__Impl();

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
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1729:1: rule__Location__Group__2__Impl : ( ( rule__Location__Group_2__0 )? ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1733:1: ( ( ( rule__Location__Group_2__0 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1734:1: ( ( rule__Location__Group_2__0 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1734:1: ( ( rule__Location__Group_2__0 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1735:1: ( rule__Location__Group_2__0 )?
            {
             before(grammarAccess.getLocationAccess().getGroup_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1736:1: ( rule__Location__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1736:2: rule__Location__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Location__Group_2__0_in_rule__Location__Group__2__Impl3511);
                    rule__Location__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group_2__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1752:1: rule__Location__Group_2__0 : rule__Location__Group_2__0__Impl rule__Location__Group_2__1 ;
    public final void rule__Location__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1756:1: ( rule__Location__Group_2__0__Impl rule__Location__Group_2__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1757:2: rule__Location__Group_2__0__Impl rule__Location__Group_2__1
            {
            pushFollow(FOLLOW_rule__Location__Group_2__0__Impl_in_rule__Location__Group_2__03548);
            rule__Location__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_2__1_in_rule__Location__Group_2__03551);
            rule__Location__Group_2__1();

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
    // $ANTLR end "rule__Location__Group_2__0"


    // $ANTLR start "rule__Location__Group_2__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1764:1: rule__Location__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Location__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1768:1: ( ( '{' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1769:1: ( '{' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1769:1: ( '{' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1770:1: '{'
            {
             before(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Location__Group_2__0__Impl3579); 
             after(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__Location__Group_2__0__Impl"


    // $ANTLR start "rule__Location__Group_2__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1783:1: rule__Location__Group_2__1 : rule__Location__Group_2__1__Impl rule__Location__Group_2__2 ;
    public final void rule__Location__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1787:1: ( rule__Location__Group_2__1__Impl rule__Location__Group_2__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1788:2: rule__Location__Group_2__1__Impl rule__Location__Group_2__2
            {
            pushFollow(FOLLOW_rule__Location__Group_2__1__Impl_in_rule__Location__Group_2__13610);
            rule__Location__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_2__2_in_rule__Location__Group_2__13613);
            rule__Location__Group_2__2();

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
    // $ANTLR end "rule__Location__Group_2__1"


    // $ANTLR start "rule__Location__Group_2__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1795:1: rule__Location__Group_2__1__Impl : ( ( rule__Location__Group_2_1__0 )? ) ;
    public final void rule__Location__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1799:1: ( ( ( rule__Location__Group_2_1__0 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1800:1: ( ( rule__Location__Group_2_1__0 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1800:1: ( ( rule__Location__Group_2_1__0 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1801:1: ( rule__Location__Group_2_1__0 )?
            {
             before(grammarAccess.getLocationAccess().getGroup_2_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1802:1: ( rule__Location__Group_2_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1802:2: rule__Location__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Location__Group_2_1__0_in_rule__Location__Group_2__1__Impl3640);
                    rule__Location__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocationAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Location__Group_2__1__Impl"


    // $ANTLR start "rule__Location__Group_2__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1812:1: rule__Location__Group_2__2 : rule__Location__Group_2__2__Impl rule__Location__Group_2__3 ;
    public final void rule__Location__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1816:1: ( rule__Location__Group_2__2__Impl rule__Location__Group_2__3 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1817:2: rule__Location__Group_2__2__Impl rule__Location__Group_2__3
            {
            pushFollow(FOLLOW_rule__Location__Group_2__2__Impl_in_rule__Location__Group_2__23671);
            rule__Location__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_2__3_in_rule__Location__Group_2__23674);
            rule__Location__Group_2__3();

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
    // $ANTLR end "rule__Location__Group_2__2"


    // $ANTLR start "rule__Location__Group_2__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1824:1: rule__Location__Group_2__2__Impl : ( ( rule__Location__IusAssignment_2_2 )* ) ;
    public final void rule__Location__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1828:1: ( ( ( rule__Location__IusAssignment_2_2 )* ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1829:1: ( ( rule__Location__IusAssignment_2_2 )* )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1829:1: ( ( rule__Location__IusAssignment_2_2 )* )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1830:1: ( rule__Location__IusAssignment_2_2 )*
            {
             before(grammarAccess.getLocationAccess().getIusAssignment_2_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1831:1: ( rule__Location__IusAssignment_2_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1831:2: rule__Location__IusAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Location__IusAssignment_2_2_in_rule__Location__Group_2__2__Impl3701);
            	    rule__Location__IusAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getLocationAccess().getIusAssignment_2_2()); 

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
    // $ANTLR end "rule__Location__Group_2__2__Impl"


    // $ANTLR start "rule__Location__Group_2__3"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1841:1: rule__Location__Group_2__3 : rule__Location__Group_2__3__Impl ;
    public final void rule__Location__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1845:1: ( rule__Location__Group_2__3__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1846:2: rule__Location__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Location__Group_2__3__Impl_in_rule__Location__Group_2__33732);
            rule__Location__Group_2__3__Impl();

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
    // $ANTLR end "rule__Location__Group_2__3"


    // $ANTLR start "rule__Location__Group_2__3__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1852:1: rule__Location__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Location__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1856:1: ( ( '}' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1857:1: ( '}' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1857:1: ( '}' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1858:1: '}'
            {
             before(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,29,FOLLOW_29_in_rule__Location__Group_2__3__Impl3760); 
             after(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__Location__Group_2__3__Impl"


    // $ANTLR start "rule__Location__Group_2_1__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1879:1: rule__Location__Group_2_1__0 : rule__Location__Group_2_1__0__Impl rule__Location__Group_2_1__1 ;
    public final void rule__Location__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1883:1: ( rule__Location__Group_2_1__0__Impl rule__Location__Group_2_1__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1884:2: rule__Location__Group_2_1__0__Impl rule__Location__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Location__Group_2_1__0__Impl_in_rule__Location__Group_2_1__03799);
            rule__Location__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_2_1__1_in_rule__Location__Group_2_1__03802);
            rule__Location__Group_2_1__1();

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
    // $ANTLR end "rule__Location__Group_2_1__0"


    // $ANTLR start "rule__Location__Group_2_1__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1891:1: rule__Location__Group_2_1__0__Impl : ( 'with' ) ;
    public final void rule__Location__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1895:1: ( ( 'with' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1896:1: ( 'with' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1896:1: ( 'with' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1897:1: 'with'
            {
             before(grammarAccess.getLocationAccess().getWithKeyword_2_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Location__Group_2_1__0__Impl3830); 
             after(grammarAccess.getLocationAccess().getWithKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Location__Group_2_1__0__Impl"


    // $ANTLR start "rule__Location__Group_2_1__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1910:1: rule__Location__Group_2_1__1 : rule__Location__Group_2_1__1__Impl rule__Location__Group_2_1__2 ;
    public final void rule__Location__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1914:1: ( rule__Location__Group_2_1__1__Impl rule__Location__Group_2_1__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1915:2: rule__Location__Group_2_1__1__Impl rule__Location__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Location__Group_2_1__1__Impl_in_rule__Location__Group_2_1__13861);
            rule__Location__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_2_1__2_in_rule__Location__Group_2_1__13864);
            rule__Location__Group_2_1__2();

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
    // $ANTLR end "rule__Location__Group_2_1__1"


    // $ANTLR start "rule__Location__Group_2_1__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1922:1: rule__Location__Group_2_1__1__Impl : ( ( rule__Location__OptionsAssignment_2_1_1 ) ) ;
    public final void rule__Location__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1926:1: ( ( ( rule__Location__OptionsAssignment_2_1_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1927:1: ( ( rule__Location__OptionsAssignment_2_1_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1927:1: ( ( rule__Location__OptionsAssignment_2_1_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1928:1: ( rule__Location__OptionsAssignment_2_1_1 )
            {
             before(grammarAccess.getLocationAccess().getOptionsAssignment_2_1_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1929:1: ( rule__Location__OptionsAssignment_2_1_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1929:2: rule__Location__OptionsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Location__OptionsAssignment_2_1_1_in_rule__Location__Group_2_1__1__Impl3891);
            rule__Location__OptionsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getOptionsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Location__Group_2_1__1__Impl"


    // $ANTLR start "rule__Location__Group_2_1__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1939:1: rule__Location__Group_2_1__2 : rule__Location__Group_2_1__2__Impl ;
    public final void rule__Location__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1943:1: ( rule__Location__Group_2_1__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1944:2: rule__Location__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Location__Group_2_1__2__Impl_in_rule__Location__Group_2_1__23921);
            rule__Location__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Location__Group_2_1__2"


    // $ANTLR start "rule__Location__Group_2_1__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1950:1: rule__Location__Group_2_1__2__Impl : ( ( rule__Location__Group_2_1_2__0 )* ) ;
    public final void rule__Location__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1954:1: ( ( ( rule__Location__Group_2_1_2__0 )* ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1955:1: ( ( rule__Location__Group_2_1_2__0 )* )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1955:1: ( ( rule__Location__Group_2_1_2__0 )* )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1956:1: ( rule__Location__Group_2_1_2__0 )*
            {
             before(grammarAccess.getLocationAccess().getGroup_2_1_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1957:1: ( rule__Location__Group_2_1_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=17 && LA21_0<=20)||LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1957:2: rule__Location__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Location__Group_2_1_2__0_in_rule__Location__Group_2_1__2__Impl3948);
            	    rule__Location__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getLocationAccess().getGroup_2_1_2()); 

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
    // $ANTLR end "rule__Location__Group_2_1__2__Impl"


    // $ANTLR start "rule__Location__Group_2_1_2__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1973:1: rule__Location__Group_2_1_2__0 : rule__Location__Group_2_1_2__0__Impl rule__Location__Group_2_1_2__1 ;
    public final void rule__Location__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1977:1: ( rule__Location__Group_2_1_2__0__Impl rule__Location__Group_2_1_2__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1978:2: rule__Location__Group_2_1_2__0__Impl rule__Location__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__Location__Group_2_1_2__0__Impl_in_rule__Location__Group_2_1_2__03985);
            rule__Location__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Location__Group_2_1_2__1_in_rule__Location__Group_2_1_2__03988);
            rule__Location__Group_2_1_2__1();

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
    // $ANTLR end "rule__Location__Group_2_1_2__0"


    // $ANTLR start "rule__Location__Group_2_1_2__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1985:1: rule__Location__Group_2_1_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Location__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1989:1: ( ( ( ',' )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1990:1: ( ( ',' )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1990:1: ( ( ',' )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1991:1: ( ',' )?
            {
             before(grammarAccess.getLocationAccess().getCommaKeyword_2_1_2_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1992:1: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:1993:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Location__Group_2_1_2__0__Impl4017); 

                    }
                    break;

            }

             after(grammarAccess.getLocationAccess().getCommaKeyword_2_1_2_0()); 

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
    // $ANTLR end "rule__Location__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__Location__Group_2_1_2__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2004:1: rule__Location__Group_2_1_2__1 : rule__Location__Group_2_1_2__1__Impl ;
    public final void rule__Location__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2008:1: ( rule__Location__Group_2_1_2__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2009:2: rule__Location__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Location__Group_2_1_2__1__Impl_in_rule__Location__Group_2_1_2__14050);
            rule__Location__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__Location__Group_2_1_2__1"


    // $ANTLR start "rule__Location__Group_2_1_2__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2015:1: rule__Location__Group_2_1_2__1__Impl : ( ( rule__Location__OptionsAssignment_2_1_2_1 ) ) ;
    public final void rule__Location__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2019:1: ( ( ( rule__Location__OptionsAssignment_2_1_2_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2020:1: ( ( rule__Location__OptionsAssignment_2_1_2_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2020:1: ( ( rule__Location__OptionsAssignment_2_1_2_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2021:1: ( rule__Location__OptionsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getLocationAccess().getOptionsAssignment_2_1_2_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2022:1: ( rule__Location__OptionsAssignment_2_1_2_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2022:2: rule__Location__OptionsAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__Location__OptionsAssignment_2_1_2_1_in_rule__Location__Group_2_1_2__1__Impl4077);
            rule__Location__OptionsAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getOptionsAssignment_2_1_2_1()); 

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
    // $ANTLR end "rule__Location__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__IU__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2036:1: rule__IU__Group__0 : rule__IU__Group__0__Impl rule__IU__Group__1 ;
    public final void rule__IU__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2040:1: ( rule__IU__Group__0__Impl rule__IU__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2041:2: rule__IU__Group__0__Impl rule__IU__Group__1
            {
            pushFollow(FOLLOW_rule__IU__Group__0__Impl_in_rule__IU__Group__04111);
            rule__IU__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IU__Group__1_in_rule__IU__Group__04114);
            rule__IU__Group__1();

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
    // $ANTLR end "rule__IU__Group__0"


    // $ANTLR start "rule__IU__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2048:1: rule__IU__Group__0__Impl : ( ( rule__IU__IDAssignment_0 ) ) ;
    public final void rule__IU__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2052:1: ( ( ( rule__IU__IDAssignment_0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2053:1: ( ( rule__IU__IDAssignment_0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2053:1: ( ( rule__IU__IDAssignment_0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2054:1: ( rule__IU__IDAssignment_0 )
            {
             before(grammarAccess.getIUAccess().getIDAssignment_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2055:1: ( rule__IU__IDAssignment_0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2055:2: rule__IU__IDAssignment_0
            {
            pushFollow(FOLLOW_rule__IU__IDAssignment_0_in_rule__IU__Group__0__Impl4141);
            rule__IU__IDAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIUAccess().getIDAssignment_0()); 

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
    // $ANTLR end "rule__IU__Group__0__Impl"


    // $ANTLR start "rule__IU__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2065:1: rule__IU__Group__1 : rule__IU__Group__1__Impl ;
    public final void rule__IU__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2069:1: ( rule__IU__Group__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2070:2: rule__IU__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IU__Group__1__Impl_in_rule__IU__Group__14171);
            rule__IU__Group__1__Impl();

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
    // $ANTLR end "rule__IU__Group__1"


    // $ANTLR start "rule__IU__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2076:1: rule__IU__Group__1__Impl : ( ( rule__IU__Group_1__0 )? ) ;
    public final void rule__IU__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2080:1: ( ( ( rule__IU__Group_1__0 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2081:1: ( ( rule__IU__Group_1__0 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2081:1: ( ( rule__IU__Group_1__0 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2082:1: ( rule__IU__Group_1__0 )?
            {
             before(grammarAccess.getIUAccess().getGroup_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2083:1: ( rule__IU__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==RULE_STRING||(LA23_0>=12 && LA23_0<=14)||LA23_0==28||LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2083:2: rule__IU__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__IU__Group_1__0_in_rule__IU__Group__1__Impl4198);
                    rule__IU__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIUAccess().getGroup_1()); 

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
    // $ANTLR end "rule__IU__Group__1__Impl"


    // $ANTLR start "rule__IU__Group_1__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2097:1: rule__IU__Group_1__0 : rule__IU__Group_1__0__Impl rule__IU__Group_1__1 ;
    public final void rule__IU__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2101:1: ( rule__IU__Group_1__0__Impl rule__IU__Group_1__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2102:2: rule__IU__Group_1__0__Impl rule__IU__Group_1__1
            {
            pushFollow(FOLLOW_rule__IU__Group_1__0__Impl_in_rule__IU__Group_1__04233);
            rule__IU__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IU__Group_1__1_in_rule__IU__Group_1__04236);
            rule__IU__Group_1__1();

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
    // $ANTLR end "rule__IU__Group_1__0"


    // $ANTLR start "rule__IU__Group_1__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2109:1: rule__IU__Group_1__0__Impl : ( ( rule__IU__Group_1_0__0 )? ) ;
    public final void rule__IU__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2113:1: ( ( ( rule__IU__Group_1_0__0 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2114:1: ( ( rule__IU__Group_1_0__0 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2114:1: ( ( rule__IU__Group_1_0__0 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2115:1: ( rule__IU__Group_1_0__0 )?
            {
             before(grammarAccess.getIUAccess().getGroup_1_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2116:1: ( rule__IU__Group_1_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2116:2: rule__IU__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__IU__Group_1_0__0_in_rule__IU__Group_1__0__Impl4263);
                    rule__IU__Group_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIUAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__IU__Group_1__0__Impl"


    // $ANTLR start "rule__IU__Group_1__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2126:1: rule__IU__Group_1__1 : rule__IU__Group_1__1__Impl ;
    public final void rule__IU__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2130:1: ( rule__IU__Group_1__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2131:2: rule__IU__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IU__Group_1__1__Impl_in_rule__IU__Group_1__14294);
            rule__IU__Group_1__1__Impl();

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
    // $ANTLR end "rule__IU__Group_1__1"


    // $ANTLR start "rule__IU__Group_1__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2137:1: rule__IU__Group_1__1__Impl : ( ( rule__IU__Alternatives_1_1 ) ) ;
    public final void rule__IU__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2141:1: ( ( ( rule__IU__Alternatives_1_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2142:1: ( ( rule__IU__Alternatives_1_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2142:1: ( ( rule__IU__Alternatives_1_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2143:1: ( rule__IU__Alternatives_1_1 )
            {
             before(grammarAccess.getIUAccess().getAlternatives_1_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2144:1: ( rule__IU__Alternatives_1_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2144:2: rule__IU__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__IU__Alternatives_1_1_in_rule__IU__Group_1__1__Impl4321);
            rule__IU__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIUAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__IU__Group_1__1__Impl"


    // $ANTLR start "rule__IU__Group_1_0__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2158:1: rule__IU__Group_1_0__0 : rule__IU__Group_1_0__0__Impl rule__IU__Group_1_0__1 ;
    public final void rule__IU__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2162:1: ( rule__IU__Group_1_0__0__Impl rule__IU__Group_1_0__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2163:2: rule__IU__Group_1_0__0__Impl rule__IU__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__IU__Group_1_0__0__Impl_in_rule__IU__Group_1_0__04355);
            rule__IU__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IU__Group_1_0__1_in_rule__IU__Group_1_0__04358);
            rule__IU__Group_1_0__1();

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
    // $ANTLR end "rule__IU__Group_1_0__0"


    // $ANTLR start "rule__IU__Group_1_0__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2170:1: rule__IU__Group_1_0__0__Impl : ( ';' ) ;
    public final void rule__IU__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2174:1: ( ( ';' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2175:1: ( ';' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2175:1: ( ';' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2176:1: ';'
            {
             before(grammarAccess.getIUAccess().getSemicolonKeyword_1_0_0()); 
            match(input,33,FOLLOW_33_in_rule__IU__Group_1_0__0__Impl4386); 
             after(grammarAccess.getIUAccess().getSemicolonKeyword_1_0_0()); 

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
    // $ANTLR end "rule__IU__Group_1_0__0__Impl"


    // $ANTLR start "rule__IU__Group_1_0__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2189:1: rule__IU__Group_1_0__1 : rule__IU__Group_1_0__1__Impl rule__IU__Group_1_0__2 ;
    public final void rule__IU__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2193:1: ( rule__IU__Group_1_0__1__Impl rule__IU__Group_1_0__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2194:2: rule__IU__Group_1_0__1__Impl rule__IU__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__IU__Group_1_0__1__Impl_in_rule__IU__Group_1_0__14417);
            rule__IU__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IU__Group_1_0__2_in_rule__IU__Group_1_0__14420);
            rule__IU__Group_1_0__2();

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
    // $ANTLR end "rule__IU__Group_1_0__1"


    // $ANTLR start "rule__IU__Group_1_0__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2201:1: rule__IU__Group_1_0__1__Impl : ( 'version' ) ;
    public final void rule__IU__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2205:1: ( ( 'version' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2206:1: ( 'version' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2206:1: ( 'version' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2207:1: 'version'
            {
             before(grammarAccess.getIUAccess().getVersionKeyword_1_0_1()); 
            match(input,34,FOLLOW_34_in_rule__IU__Group_1_0__1__Impl4448); 
             after(grammarAccess.getIUAccess().getVersionKeyword_1_0_1()); 

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
    // $ANTLR end "rule__IU__Group_1_0__1__Impl"


    // $ANTLR start "rule__IU__Group_1_0__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2220:1: rule__IU__Group_1_0__2 : rule__IU__Group_1_0__2__Impl ;
    public final void rule__IU__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2224:1: ( rule__IU__Group_1_0__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2225:2: rule__IU__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__IU__Group_1_0__2__Impl_in_rule__IU__Group_1_0__24479);
            rule__IU__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__IU__Group_1_0__2"


    // $ANTLR start "rule__IU__Group_1_0__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2231:1: rule__IU__Group_1_0__2__Impl : ( '=' ) ;
    public final void rule__IU__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2235:1: ( ( '=' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2236:1: ( '=' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2236:1: ( '=' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2237:1: '='
            {
             before(grammarAccess.getIUAccess().getEqualsSignKeyword_1_0_2()); 
            match(input,26,FOLLOW_26_in_rule__IU__Group_1_0__2__Impl4507); 
             after(grammarAccess.getIUAccess().getEqualsSignKeyword_1_0_2()); 

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
    // $ANTLR end "rule__IU__Group_1_0__2__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2256:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2260:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2261:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__04544);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__04547);
            rule__Version__Group__1();

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
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2268:1: rule__Version__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2272:1: ( ( RULE_INT ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2273:1: ( RULE_INT )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2273:1: ( RULE_INT )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2274:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__0__Impl4574); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2285:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2289:1: ( rule__Version__Group__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2290:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__14603);
            rule__Version__Group__1__Impl();

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
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2296:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )? ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2300:1: ( ( ( rule__Version__Group_1__0 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2301:1: ( ( rule__Version__Group_1__0 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2301:1: ( ( rule__Version__Group_1__0 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2302:1: ( rule__Version__Group_1__0 )?
            {
             before(grammarAccess.getVersionAccess().getGroup_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2303:1: ( rule__Version__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2303:2: rule__Version__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl4630);
                    rule__Version__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group_1__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2317:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2321:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2322:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__04665);
            rule__Version__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__04668);
            rule__Version__Group_1__1();

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
    // $ANTLR end "rule__Version__Group_1__0"


    // $ANTLR start "rule__Version__Group_1__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2329:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2333:1: ( ( '.' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2334:1: ( '.' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2334:1: ( '.' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2335:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Version__Group_1__0__Impl4696); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Version__Group_1__0__Impl"


    // $ANTLR start "rule__Version__Group_1__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2348:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl rule__Version__Group_1__2 ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2352:1: ( rule__Version__Group_1__1__Impl rule__Version__Group_1__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2353:2: rule__Version__Group_1__1__Impl rule__Version__Group_1__2
            {
            pushFollow(FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__14727);
            rule__Version__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group_1__2_in_rule__Version__Group_1__14730);
            rule__Version__Group_1__2();

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
    // $ANTLR end "rule__Version__Group_1__1"


    // $ANTLR start "rule__Version__Group_1__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2360:1: rule__Version__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2364:1: ( ( RULE_INT ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2365:1: ( RULE_INT )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2365:1: ( RULE_INT )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2366:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group_1__1__Impl4757); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Version__Group_1__1__Impl"


    // $ANTLR start "rule__Version__Group_1__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2377:1: rule__Version__Group_1__2 : rule__Version__Group_1__2__Impl ;
    public final void rule__Version__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2381:1: ( rule__Version__Group_1__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2382:2: rule__Version__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_1__2__Impl_in_rule__Version__Group_1__24786);
            rule__Version__Group_1__2__Impl();

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
    // $ANTLR end "rule__Version__Group_1__2"


    // $ANTLR start "rule__Version__Group_1__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2388:1: rule__Version__Group_1__2__Impl : ( ( rule__Version__Group_1_2__0 )? ) ;
    public final void rule__Version__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2392:1: ( ( ( rule__Version__Group_1_2__0 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2393:1: ( ( rule__Version__Group_1_2__0 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2393:1: ( ( rule__Version__Group_1_2__0 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2394:1: ( rule__Version__Group_1_2__0 )?
            {
             before(grammarAccess.getVersionAccess().getGroup_1_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2395:1: ( rule__Version__Group_1_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2395:2: rule__Version__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Version__Group_1_2__0_in_rule__Version__Group_1__2__Impl4813);
                    rule__Version__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Version__Group_1__2__Impl"


    // $ANTLR start "rule__Version__Group_1_2__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2411:1: rule__Version__Group_1_2__0 : rule__Version__Group_1_2__0__Impl rule__Version__Group_1_2__1 ;
    public final void rule__Version__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2415:1: ( rule__Version__Group_1_2__0__Impl rule__Version__Group_1_2__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2416:2: rule__Version__Group_1_2__0__Impl rule__Version__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Version__Group_1_2__0__Impl_in_rule__Version__Group_1_2__04850);
            rule__Version__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group_1_2__1_in_rule__Version__Group_1_2__04853);
            rule__Version__Group_1_2__1();

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
    // $ANTLR end "rule__Version__Group_1_2__0"


    // $ANTLR start "rule__Version__Group_1_2__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2423:1: rule__Version__Group_1_2__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2427:1: ( ( '.' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2428:1: ( '.' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2428:1: ( '.' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2429:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Version__Group_1_2__0__Impl4881); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Version__Group_1_2__0__Impl"


    // $ANTLR start "rule__Version__Group_1_2__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2442:1: rule__Version__Group_1_2__1 : rule__Version__Group_1_2__1__Impl rule__Version__Group_1_2__2 ;
    public final void rule__Version__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2446:1: ( rule__Version__Group_1_2__1__Impl rule__Version__Group_1_2__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2447:2: rule__Version__Group_1_2__1__Impl rule__Version__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Version__Group_1_2__1__Impl_in_rule__Version__Group_1_2__14912);
            rule__Version__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group_1_2__2_in_rule__Version__Group_1_2__14915);
            rule__Version__Group_1_2__2();

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
    // $ANTLR end "rule__Version__Group_1_2__1"


    // $ANTLR start "rule__Version__Group_1_2__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2454:1: rule__Version__Group_1_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2458:1: ( ( RULE_INT ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2459:1: ( RULE_INT )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2459:1: ( RULE_INT )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2460:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group_1_2__1__Impl4942); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_2_1()); 

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
    // $ANTLR end "rule__Version__Group_1_2__1__Impl"


    // $ANTLR start "rule__Version__Group_1_2__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2471:1: rule__Version__Group_1_2__2 : rule__Version__Group_1_2__2__Impl ;
    public final void rule__Version__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2475:1: ( rule__Version__Group_1_2__2__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2476:2: rule__Version__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_1_2__2__Impl_in_rule__Version__Group_1_2__24971);
            rule__Version__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Version__Group_1_2__2"


    // $ANTLR start "rule__Version__Group_1_2__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2482:1: rule__Version__Group_1_2__2__Impl : ( ( rule__Version__Group_1_2_2__0 )? ) ;
    public final void rule__Version__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2486:1: ( ( ( rule__Version__Group_1_2_2__0 )? ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2487:1: ( ( rule__Version__Group_1_2_2__0 )? )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2487:1: ( ( rule__Version__Group_1_2_2__0 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2488:1: ( rule__Version__Group_1_2_2__0 )?
            {
             before(grammarAccess.getVersionAccess().getGroup_1_2_2()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2489:1: ( rule__Version__Group_1_2_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2489:2: rule__Version__Group_1_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Version__Group_1_2_2__0_in_rule__Version__Group_1_2__2__Impl4998);
                    rule__Version__Group_1_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionAccess().getGroup_1_2_2()); 

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
    // $ANTLR end "rule__Version__Group_1_2__2__Impl"


    // $ANTLR start "rule__Version__Group_1_2_2__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2505:1: rule__Version__Group_1_2_2__0 : rule__Version__Group_1_2_2__0__Impl rule__Version__Group_1_2_2__1 ;
    public final void rule__Version__Group_1_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2509:1: ( rule__Version__Group_1_2_2__0__Impl rule__Version__Group_1_2_2__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2510:2: rule__Version__Group_1_2_2__0__Impl rule__Version__Group_1_2_2__1
            {
            pushFollow(FOLLOW_rule__Version__Group_1_2_2__0__Impl_in_rule__Version__Group_1_2_2__05035);
            rule__Version__Group_1_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group_1_2_2__1_in_rule__Version__Group_1_2_2__05038);
            rule__Version__Group_1_2_2__1();

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
    // $ANTLR end "rule__Version__Group_1_2_2__0"


    // $ANTLR start "rule__Version__Group_1_2_2__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2517:1: rule__Version__Group_1_2_2__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2521:1: ( ( '.' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2522:1: ( '.' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2522:1: ( '.' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2523:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1_2_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Version__Group_1_2_2__0__Impl5066); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1_2_2_0()); 

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
    // $ANTLR end "rule__Version__Group_1_2_2__0__Impl"


    // $ANTLR start "rule__Version__Group_1_2_2__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2536:1: rule__Version__Group_1_2_2__1 : rule__Version__Group_1_2_2__1__Impl ;
    public final void rule__Version__Group_1_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2540:1: ( rule__Version__Group_1_2_2__1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2541:2: rule__Version__Group_1_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_1_2_2__1__Impl_in_rule__Version__Group_1_2_2__15097);
            rule__Version__Group_1_2_2__1__Impl();

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
    // $ANTLR end "rule__Version__Group_1_2_2__1"


    // $ANTLR start "rule__Version__Group_1_2_2__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2547:1: rule__Version__Group_1_2_2__1__Impl : ( ( rule__Version__Alternatives_1_2_2_1 ) ) ;
    public final void rule__Version__Group_1_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2551:1: ( ( ( rule__Version__Alternatives_1_2_2_1 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2552:1: ( ( rule__Version__Alternatives_1_2_2_1 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2552:1: ( ( rule__Version__Alternatives_1_2_2_1 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2553:1: ( rule__Version__Alternatives_1_2_2_1 )
            {
             before(grammarAccess.getVersionAccess().getAlternatives_1_2_2_1()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2554:1: ( rule__Version__Alternatives_1_2_2_1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2554:2: rule__Version__Alternatives_1_2_2_1
            {
            pushFollow(FOLLOW_rule__Version__Alternatives_1_2_2_1_in_rule__Version__Group_1_2_2__1__Impl5124);
            rule__Version__Alternatives_1_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getAlternatives_1_2_2_1()); 

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
    // $ANTLR end "rule__Version__Group_1_2_2__1__Impl"


    // $ANTLR start "rule__VersionRange__Group_0__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2568:1: rule__VersionRange__Group_0__0 : rule__VersionRange__Group_0__0__Impl rule__VersionRange__Group_0__1 ;
    public final void rule__VersionRange__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2572:1: ( rule__VersionRange__Group_0__0__Impl rule__VersionRange__Group_0__1 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2573:2: rule__VersionRange__Group_0__0__Impl rule__VersionRange__Group_0__1
            {
            pushFollow(FOLLOW_rule__VersionRange__Group_0__0__Impl_in_rule__VersionRange__Group_0__05158);
            rule__VersionRange__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VersionRange__Group_0__1_in_rule__VersionRange__Group_0__05161);
            rule__VersionRange__Group_0__1();

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
    // $ANTLR end "rule__VersionRange__Group_0__0"


    // $ANTLR start "rule__VersionRange__Group_0__0__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2580:1: rule__VersionRange__Group_0__0__Impl : ( ( rule__VersionRange__Alternatives_0_0 ) ) ;
    public final void rule__VersionRange__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2584:1: ( ( ( rule__VersionRange__Alternatives_0_0 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2585:1: ( ( rule__VersionRange__Alternatives_0_0 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2585:1: ( ( rule__VersionRange__Alternatives_0_0 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2586:1: ( rule__VersionRange__Alternatives_0_0 )
            {
             before(grammarAccess.getVersionRangeAccess().getAlternatives_0_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2587:1: ( rule__VersionRange__Alternatives_0_0 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2587:2: rule__VersionRange__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__VersionRange__Alternatives_0_0_in_rule__VersionRange__Group_0__0__Impl5188);
            rule__VersionRange__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVersionRangeAccess().getAlternatives_0_0()); 

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
    // $ANTLR end "rule__VersionRange__Group_0__0__Impl"


    // $ANTLR start "rule__VersionRange__Group_0__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2597:1: rule__VersionRange__Group_0__1 : rule__VersionRange__Group_0__1__Impl rule__VersionRange__Group_0__2 ;
    public final void rule__VersionRange__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2601:1: ( rule__VersionRange__Group_0__1__Impl rule__VersionRange__Group_0__2 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2602:2: rule__VersionRange__Group_0__1__Impl rule__VersionRange__Group_0__2
            {
            pushFollow(FOLLOW_rule__VersionRange__Group_0__1__Impl_in_rule__VersionRange__Group_0__15218);
            rule__VersionRange__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VersionRange__Group_0__2_in_rule__VersionRange__Group_0__15221);
            rule__VersionRange__Group_0__2();

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
    // $ANTLR end "rule__VersionRange__Group_0__1"


    // $ANTLR start "rule__VersionRange__Group_0__1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2609:1: rule__VersionRange__Group_0__1__Impl : ( ruleVersion ) ;
    public final void rule__VersionRange__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2613:1: ( ( ruleVersion ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2614:1: ( ruleVersion )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2614:1: ( ruleVersion )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2615:1: ruleVersion
            {
             before(grammarAccess.getVersionRangeAccess().getVersionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__VersionRange__Group_0__1__Impl5248);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRangeAccess().getVersionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__VersionRange__Group_0__1__Impl"


    // $ANTLR start "rule__VersionRange__Group_0__2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2626:1: rule__VersionRange__Group_0__2 : rule__VersionRange__Group_0__2__Impl rule__VersionRange__Group_0__3 ;
    public final void rule__VersionRange__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2630:1: ( rule__VersionRange__Group_0__2__Impl rule__VersionRange__Group_0__3 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2631:2: rule__VersionRange__Group_0__2__Impl rule__VersionRange__Group_0__3
            {
            pushFollow(FOLLOW_rule__VersionRange__Group_0__2__Impl_in_rule__VersionRange__Group_0__25277);
            rule__VersionRange__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VersionRange__Group_0__3_in_rule__VersionRange__Group_0__25280);
            rule__VersionRange__Group_0__3();

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
    // $ANTLR end "rule__VersionRange__Group_0__2"


    // $ANTLR start "rule__VersionRange__Group_0__2__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2638:1: rule__VersionRange__Group_0__2__Impl : ( ',' ) ;
    public final void rule__VersionRange__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2642:1: ( ( ',' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2643:1: ( ',' )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2643:1: ( ',' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2644:1: ','
            {
             before(grammarAccess.getVersionRangeAccess().getCommaKeyword_0_2()); 
            match(input,23,FOLLOW_23_in_rule__VersionRange__Group_0__2__Impl5308); 
             after(grammarAccess.getVersionRangeAccess().getCommaKeyword_0_2()); 

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
    // $ANTLR end "rule__VersionRange__Group_0__2__Impl"


    // $ANTLR start "rule__VersionRange__Group_0__3"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2657:1: rule__VersionRange__Group_0__3 : rule__VersionRange__Group_0__3__Impl rule__VersionRange__Group_0__4 ;
    public final void rule__VersionRange__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2661:1: ( rule__VersionRange__Group_0__3__Impl rule__VersionRange__Group_0__4 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2662:2: rule__VersionRange__Group_0__3__Impl rule__VersionRange__Group_0__4
            {
            pushFollow(FOLLOW_rule__VersionRange__Group_0__3__Impl_in_rule__VersionRange__Group_0__35339);
            rule__VersionRange__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VersionRange__Group_0__4_in_rule__VersionRange__Group_0__35342);
            rule__VersionRange__Group_0__4();

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
    // $ANTLR end "rule__VersionRange__Group_0__3"


    // $ANTLR start "rule__VersionRange__Group_0__3__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2669:1: rule__VersionRange__Group_0__3__Impl : ( ruleVersion ) ;
    public final void rule__VersionRange__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2673:1: ( ( ruleVersion ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2674:1: ( ruleVersion )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2674:1: ( ruleVersion )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2675:1: ruleVersion
            {
             before(grammarAccess.getVersionRangeAccess().getVersionParserRuleCall_0_3()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__VersionRange__Group_0__3__Impl5369);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRangeAccess().getVersionParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__VersionRange__Group_0__3__Impl"


    // $ANTLR start "rule__VersionRange__Group_0__4"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2686:1: rule__VersionRange__Group_0__4 : rule__VersionRange__Group_0__4__Impl ;
    public final void rule__VersionRange__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2690:1: ( rule__VersionRange__Group_0__4__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2691:2: rule__VersionRange__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__VersionRange__Group_0__4__Impl_in_rule__VersionRange__Group_0__45398);
            rule__VersionRange__Group_0__4__Impl();

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
    // $ANTLR end "rule__VersionRange__Group_0__4"


    // $ANTLR start "rule__VersionRange__Group_0__4__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2697:1: rule__VersionRange__Group_0__4__Impl : ( ( rule__VersionRange__Alternatives_0_4 ) ) ;
    public final void rule__VersionRange__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2701:1: ( ( ( rule__VersionRange__Alternatives_0_4 ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2702:1: ( ( rule__VersionRange__Alternatives_0_4 ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2702:1: ( ( rule__VersionRange__Alternatives_0_4 ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2703:1: ( rule__VersionRange__Alternatives_0_4 )
            {
             before(grammarAccess.getVersionRangeAccess().getAlternatives_0_4()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2704:1: ( rule__VersionRange__Alternatives_0_4 )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2704:2: rule__VersionRange__Alternatives_0_4
            {
            pushFollow(FOLLOW_rule__VersionRange__Alternatives_0_4_in_rule__VersionRange__Group_0__4__Impl5425);
            rule__VersionRange__Alternatives_0_4();

            state._fsp--;


            }

             after(grammarAccess.getVersionRangeAccess().getAlternatives_0_4()); 

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
    // $ANTLR end "rule__VersionRange__Group_0__4__Impl"


    // $ANTLR start "rule__Location__UnorderedGroup_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2725:1: rule__Location__UnorderedGroup_1 : rule__Location__UnorderedGroup_1__0 {...}?;
    public final void rule__Location__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLocationAccess().getUnorderedGroup_1());
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2730:1: ( rule__Location__UnorderedGroup_1__0 {...}?)
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2731:2: rule__Location__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__Location__UnorderedGroup_1__0_in_rule__Location__UnorderedGroup_15466);
            rule__Location__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getLocationAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__Location__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getLocationAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getLocationAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__UnorderedGroup_1"


    // $ANTLR start "rule__Location__UnorderedGroup_1__Impl"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2742:1: rule__Location__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__Location__IDAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Location__CompositeUriAssignment_1_1 ) ) ) ) ) ;
    public final void rule__Location__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2747:1: ( ( ({...}? => ( ( ( rule__Location__IDAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Location__CompositeUriAssignment_1_1 ) ) ) ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2748:3: ( ({...}? => ( ( ( rule__Location__IDAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Location__CompositeUriAssignment_1_1 ) ) ) ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2748:3: ( ({...}? => ( ( ( rule__Location__IDAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Location__CompositeUriAssignment_1_1 ) ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 0) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING||LA28_0==28) && getUnorderedGroupHelper().canSelect(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 1) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2750:4: ({...}? => ( ( ( rule__Location__IDAssignment_1_0 ) ) ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2750:4: ({...}? => ( ( ( rule__Location__IDAssignment_1_0 ) ) ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2751:5: {...}? => ( ( ( rule__Location__IDAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Location__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2751:105: ( ( ( rule__Location__IDAssignment_1_0 ) ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2752:6: ( ( rule__Location__IDAssignment_1_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2758:6: ( ( rule__Location__IDAssignment_1_0 ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2760:7: ( rule__Location__IDAssignment_1_0 )
                    {
                     before(grammarAccess.getLocationAccess().getIDAssignment_1_0()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2761:7: ( rule__Location__IDAssignment_1_0 )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2761:8: rule__Location__IDAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Location__IDAssignment_1_0_in_rule__Location__UnorderedGroup_1__Impl5555);
                    rule__Location__IDAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocationAccess().getIDAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2767:4: ({...}? => ( ( ( rule__Location__CompositeUriAssignment_1_1 ) ) ) )
                    {
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2767:4: ({...}? => ( ( ( rule__Location__CompositeUriAssignment_1_1 ) ) ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2768:5: {...}? => ( ( ( rule__Location__CompositeUriAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Location__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2768:105: ( ( ( rule__Location__CompositeUriAssignment_1_1 ) ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2769:6: ( ( rule__Location__CompositeUriAssignment_1_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2775:6: ( ( rule__Location__CompositeUriAssignment_1_1 ) )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2777:7: ( rule__Location__CompositeUriAssignment_1_1 )
                    {
                     before(grammarAccess.getLocationAccess().getCompositeUriAssignment_1_1()); 
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2778:7: ( rule__Location__CompositeUriAssignment_1_1 )
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2778:8: rule__Location__CompositeUriAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Location__CompositeUriAssignment_1_1_in_rule__Location__UnorderedGroup_1__Impl5646);
                    rule__Location__CompositeUriAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocationAccess().getCompositeUriAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLocationAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Location__UnorderedGroup_1__0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2793:1: rule__Location__UnorderedGroup_1__0 : rule__Location__UnorderedGroup_1__Impl ( rule__Location__UnorderedGroup_1__1 )? ;
    public final void rule__Location__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2797:1: ( rule__Location__UnorderedGroup_1__Impl ( rule__Location__UnorderedGroup_1__1 )? )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2798:2: rule__Location__UnorderedGroup_1__Impl ( rule__Location__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Location__UnorderedGroup_1__Impl_in_rule__Location__UnorderedGroup_1__05705);
            rule__Location__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2799:2: ( rule__Location__UnorderedGroup_1__1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 0) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_STRING||LA29_0==28) && getUnorderedGroupHelper().canSelect(grammarAccess.getLocationAccess().getUnorderedGroup_1(), 1) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2799:2: rule__Location__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Location__UnorderedGroup_1__1_in_rule__Location__UnorderedGroup_1__05708);
                    rule__Location__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Location__UnorderedGroup_1__0"


    // $ANTLR start "rule__Location__UnorderedGroup_1__1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2806:1: rule__Location__UnorderedGroup_1__1 : rule__Location__UnorderedGroup_1__Impl ;
    public final void rule__Location__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2810:1: ( rule__Location__UnorderedGroup_1__Impl )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2811:2: rule__Location__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Location__UnorderedGroup_1__Impl_in_rule__Location__UnorderedGroup_1__15733);
            rule__Location__UnorderedGroup_1__Impl();

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
    // $ANTLR end "rule__Location__UnorderedGroup_1__1"


    // $ANTLR start "rule__TargetPlatform__NameAssignment_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2822:1: rule__TargetPlatform__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TargetPlatform__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2826:1: ( ( RULE_STRING ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2827:1: ( RULE_STRING )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2827:1: ( RULE_STRING )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2828:1: RULE_STRING
            {
             before(grammarAccess.getTargetPlatformAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TargetPlatform__NameAssignment_15765); 
             after(grammarAccess.getTargetPlatformAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TargetPlatform__NameAssignment_1"


    // $ANTLR start "rule__TargetPlatform__ContentsAssignment_2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2837:1: rule__TargetPlatform__ContentsAssignment_2 : ( ruleTargetContent ) ;
    public final void rule__TargetPlatform__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2841:1: ( ( ruleTargetContent ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2842:1: ( ruleTargetContent )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2842:1: ( ruleTargetContent )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2843:1: ruleTargetContent
            {
             before(grammarAccess.getTargetPlatformAccess().getContentsTargetContentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTargetContent_in_rule__TargetPlatform__ContentsAssignment_25796);
            ruleTargetContent();

            state._fsp--;

             after(grammarAccess.getTargetPlatformAccess().getContentsTargetContentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TargetPlatform__ContentsAssignment_2"


    // $ANTLR start "rule__Options__OptionsAssignment_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2852:1: rule__Options__OptionsAssignment_1 : ( ruleOption ) ;
    public final void rule__Options__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2856:1: ( ( ruleOption ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2857:1: ( ruleOption )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2857:1: ( ruleOption )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2858:1: ruleOption
            {
             before(grammarAccess.getOptionsAccess().getOptionsOptionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Options__OptionsAssignment_15827);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getOptionsOptionEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Options__OptionsAssignment_1"


    // $ANTLR start "rule__Options__OptionsAssignment_2_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2867:1: rule__Options__OptionsAssignment_2_1 : ( ruleOption ) ;
    public final void rule__Options__OptionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2871:1: ( ( ruleOption ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2872:1: ( ruleOption )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2872:1: ( ruleOption )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2873:1: ruleOption
            {
             before(grammarAccess.getOptionsAccess().getOptionsOptionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Options__OptionsAssignment_2_15858);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getOptionsOptionEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Options__OptionsAssignment_2_1"


    // $ANTLR start "rule__Environment__EnvAssignment_2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2882:1: rule__Environment__EnvAssignment_2 : ( RULE_ID ) ;
    public final void rule__Environment__EnvAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2886:1: ( ( RULE_ID ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2887:1: ( RULE_ID )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2887:1: ( RULE_ID )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2888:1: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getEnvIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Environment__EnvAssignment_25889); 
             after(grammarAccess.getEnvironmentAccess().getEnvIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Environment__EnvAssignment_2"


    // $ANTLR start "rule__Environment__EnvAssignment_3_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2897:1: rule__Environment__EnvAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Environment__EnvAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2901:1: ( ( RULE_ID ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2902:1: ( RULE_ID )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2902:1: ( RULE_ID )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2903:1: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getEnvIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Environment__EnvAssignment_3_15920); 
             after(grammarAccess.getEnvironmentAccess().getEnvIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Environment__EnvAssignment_3_1"


    // $ANTLR start "rule__VarDefinition__ConstantAssignment_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2912:1: rule__VarDefinition__ConstantAssignment_1 : ( ( 'const' ) ) ;
    public final void rule__VarDefinition__ConstantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2916:1: ( ( ( 'const' ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2917:1: ( ( 'const' ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2917:1: ( ( 'const' ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2918:1: ( 'const' )
            {
             before(grammarAccess.getVarDefinitionAccess().getConstantConstKeyword_1_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2919:1: ( 'const' )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2920:1: 'const'
            {
             before(grammarAccess.getVarDefinitionAccess().getConstantConstKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__VarDefinition__ConstantAssignment_15956); 
             after(grammarAccess.getVarDefinitionAccess().getConstantConstKeyword_1_0()); 

            }

             after(grammarAccess.getVarDefinitionAccess().getConstantConstKeyword_1_0()); 

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
    // $ANTLR end "rule__VarDefinition__ConstantAssignment_1"


    // $ANTLR start "rule__VarDefinition__NameAssignment_2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2935:1: rule__VarDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VarDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2939:1: ( ( RULE_ID ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2940:1: ( RULE_ID )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2940:1: ( RULE_ID )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2941:1: RULE_ID
            {
             before(grammarAccess.getVarDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDefinition__NameAssignment_25995); 
             after(grammarAccess.getVarDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__VarDefinition__NameAssignment_2"


    // $ANTLR start "rule__VarDefinition__ValueAssignment_4"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2950:1: rule__VarDefinition__ValueAssignment_4 : ( ruleCompositeString ) ;
    public final void rule__VarDefinition__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2954:1: ( ( ruleCompositeString ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2955:1: ( ruleCompositeString )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2955:1: ( ruleCompositeString )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2956:1: ruleCompositeString
            {
             before(grammarAccess.getVarDefinitionAccess().getValueCompositeStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCompositeString_in_rule__VarDefinition__ValueAssignment_46026);
            ruleCompositeString();

            state._fsp--;

             after(grammarAccess.getVarDefinitionAccess().getValueCompositeStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__VarDefinition__ValueAssignment_4"


    // $ANTLR start "rule__CompositeString__StringPartsAssignment_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2965:1: rule__CompositeString__StringPartsAssignment_1 : ( ruleCompositeStringPart ) ;
    public final void rule__CompositeString__StringPartsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2969:1: ( ( ruleCompositeStringPart ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2970:1: ( ruleCompositeStringPart )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2970:1: ( ruleCompositeStringPart )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2971:1: ruleCompositeStringPart
            {
             before(grammarAccess.getCompositeStringAccess().getStringPartsCompositeStringPartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCompositeStringPart_in_rule__CompositeString__StringPartsAssignment_16057);
            ruleCompositeStringPart();

            state._fsp--;

             after(grammarAccess.getCompositeStringAccess().getStringPartsCompositeStringPartParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompositeString__StringPartsAssignment_1"


    // $ANTLR start "rule__CompositeString__StringPartsAssignment_2_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2980:1: rule__CompositeString__StringPartsAssignment_2_1 : ( ruleCompositeStringPart ) ;
    public final void rule__CompositeString__StringPartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2984:1: ( ( ruleCompositeStringPart ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2985:1: ( ruleCompositeStringPart )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2985:1: ( ruleCompositeStringPart )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2986:1: ruleCompositeStringPart
            {
             before(grammarAccess.getCompositeStringAccess().getStringPartsCompositeStringPartParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCompositeStringPart_in_rule__CompositeString__StringPartsAssignment_2_16088);
            ruleCompositeStringPart();

            state._fsp--;

             after(grammarAccess.getCompositeStringAccess().getStringPartsCompositeStringPartParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__CompositeString__StringPartsAssignment_2_1"


    // $ANTLR start "rule__VarCall__VarNameAssignment_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2995:1: rule__VarCall__VarNameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarCall__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:2999:1: ( ( ( RULE_ID ) ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3000:1: ( ( RULE_ID ) )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3000:1: ( ( RULE_ID ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3001:1: ( RULE_ID )
            {
             before(grammarAccess.getVarCallAccess().getVarNameVarDefinitionCrossReference_1_0()); 
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3002:1: ( RULE_ID )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3003:1: RULE_ID
            {
             before(grammarAccess.getVarCallAccess().getVarNameVarDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarCall__VarNameAssignment_16123); 
             after(grammarAccess.getVarCallAccess().getVarNameVarDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVarCallAccess().getVarNameVarDefinitionCrossReference_1_0()); 

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
    // $ANTLR end "rule__VarCall__VarNameAssignment_1"


    // $ANTLR start "rule__StaticString__ValueAssignment"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3014:1: rule__StaticString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StaticString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3018:1: ( ( RULE_STRING ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3019:1: ( RULE_STRING )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3019:1: ( RULE_STRING )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3020:1: RULE_STRING
            {
             before(grammarAccess.getStaticStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StaticString__ValueAssignment6158); 
             after(grammarAccess.getStaticStringAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StaticString__ValueAssignment"


    // $ANTLR start "rule__IncludeDeclaration__CompositeImportURIAssignment_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3029:1: rule__IncludeDeclaration__CompositeImportURIAssignment_1 : ( ruleCompositeString ) ;
    public final void rule__IncludeDeclaration__CompositeImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3033:1: ( ( ruleCompositeString ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3034:1: ( ruleCompositeString )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3034:1: ( ruleCompositeString )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3035:1: ruleCompositeString
            {
             before(grammarAccess.getIncludeDeclarationAccess().getCompositeImportURICompositeStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCompositeString_in_rule__IncludeDeclaration__CompositeImportURIAssignment_16189);
            ruleCompositeString();

            state._fsp--;

             after(grammarAccess.getIncludeDeclarationAccess().getCompositeImportURICompositeStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IncludeDeclaration__CompositeImportURIAssignment_1"


    // $ANTLR start "rule__Location__IDAssignment_1_0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3044:1: rule__Location__IDAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Location__IDAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3048:1: ( ( RULE_ID ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3049:1: ( RULE_ID )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3049:1: ( RULE_ID )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3050:1: RULE_ID
            {
             before(grammarAccess.getLocationAccess().getIDIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Location__IDAssignment_1_06220); 
             after(grammarAccess.getLocationAccess().getIDIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Location__IDAssignment_1_0"


    // $ANTLR start "rule__Location__CompositeUriAssignment_1_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3059:1: rule__Location__CompositeUriAssignment_1_1 : ( ruleCompositeString ) ;
    public final void rule__Location__CompositeUriAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3063:1: ( ( ruleCompositeString ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3064:1: ( ruleCompositeString )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3064:1: ( ruleCompositeString )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3065:1: ruleCompositeString
            {
             before(grammarAccess.getLocationAccess().getCompositeUriCompositeStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCompositeString_in_rule__Location__CompositeUriAssignment_1_16251);
            ruleCompositeString();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getCompositeUriCompositeStringParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Location__CompositeUriAssignment_1_1"


    // $ANTLR start "rule__Location__OptionsAssignment_2_1_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3074:1: rule__Location__OptionsAssignment_2_1_1 : ( ruleOption ) ;
    public final void rule__Location__OptionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3078:1: ( ( ruleOption ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3079:1: ( ruleOption )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3079:1: ( ruleOption )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3080:1: ruleOption
            {
             before(grammarAccess.getLocationAccess().getOptionsOptionEnumRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Location__OptionsAssignment_2_1_16282);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getOptionsOptionEnumRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Location__OptionsAssignment_2_1_1"


    // $ANTLR start "rule__Location__OptionsAssignment_2_1_2_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3089:1: rule__Location__OptionsAssignment_2_1_2_1 : ( ruleOption ) ;
    public final void rule__Location__OptionsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3093:1: ( ( ruleOption ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3094:1: ( ruleOption )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3094:1: ( ruleOption )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3095:1: ruleOption
            {
             before(grammarAccess.getLocationAccess().getOptionsOptionEnumRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_ruleOption_in_rule__Location__OptionsAssignment_2_1_2_16313);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getOptionsOptionEnumRuleCall_2_1_2_1_0()); 

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
    // $ANTLR end "rule__Location__OptionsAssignment_2_1_2_1"


    // $ANTLR start "rule__Location__IusAssignment_2_2"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3104:1: rule__Location__IusAssignment_2_2 : ( ruleIU ) ;
    public final void rule__Location__IusAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3108:1: ( ( ruleIU ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3109:1: ( ruleIU )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3109:1: ( ruleIU )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3110:1: ruleIU
            {
             before(grammarAccess.getLocationAccess().getIusIUParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleIU_in_rule__Location__IusAssignment_2_26344);
            ruleIU();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getIusIUParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Location__IusAssignment_2_2"


    // $ANTLR start "rule__IU__IDAssignment_0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3119:1: rule__IU__IDAssignment_0 : ( RULE_ID ) ;
    public final void rule__IU__IDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3123:1: ( ( RULE_ID ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3124:1: ( RULE_ID )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3124:1: ( RULE_ID )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3125:1: RULE_ID
            {
             before(grammarAccess.getIUAccess().getIDIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IU__IDAssignment_06375); 
             after(grammarAccess.getIUAccess().getIDIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__IU__IDAssignment_0"


    // $ANTLR start "rule__IU__VersionAssignment_1_1_0_0"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3134:1: rule__IU__VersionAssignment_1_1_0_0 : ( ruleVersionRange ) ;
    public final void rule__IU__VersionAssignment_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3138:1: ( ( ruleVersionRange ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3139:1: ( ruleVersionRange )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3139:1: ( ruleVersionRange )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3140:1: ruleVersionRange
            {
             before(grammarAccess.getIUAccess().getVersionVersionRangeParserRuleCall_1_1_0_0_0()); 
            pushFollow(FOLLOW_ruleVersionRange_in_rule__IU__VersionAssignment_1_1_0_06406);
            ruleVersionRange();

            state._fsp--;

             after(grammarAccess.getIUAccess().getVersionVersionRangeParserRuleCall_1_1_0_0_0()); 

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
    // $ANTLR end "rule__IU__VersionAssignment_1_1_0_0"


    // $ANTLR start "rule__IU__VersionAssignment_1_1_0_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3149:1: rule__IU__VersionAssignment_1_1_0_1 : ( RULE_STRING ) ;
    public final void rule__IU__VersionAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3153:1: ( ( RULE_STRING ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3154:1: ( RULE_STRING )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3154:1: ( RULE_STRING )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3155:1: RULE_STRING
            {
             before(grammarAccess.getIUAccess().getVersionSTRINGTerminalRuleCall_1_1_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IU__VersionAssignment_1_1_0_16437); 
             after(grammarAccess.getIUAccess().getVersionSTRINGTerminalRuleCall_1_1_0_1_0()); 

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
    // $ANTLR end "rule__IU__VersionAssignment_1_1_0_1"


    // $ANTLR start "rule__IU__VarVersionAssignment_1_1_1"
    // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3164:1: rule__IU__VarVersionAssignment_1_1_1 : ( ruleVarCall ) ;
    public final void rule__IU__VarVersionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3168:1: ( ( ruleVarCall ) )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3169:1: ( ruleVarCall )
            {
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3169:1: ( ruleVarCall )
            // ../fr.obeo.releng.targetplatform.ui/src-gen/fr/obeo/releng/targetplatform/ui/contentassist/antlr/internal/InternalTargetPlatform.g:3170:1: ruleVarCall
            {
             before(grammarAccess.getIUAccess().getVarVersionVarCallParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleVarCall_in_rule__IU__VarVersionAssignment_1_1_16468);
            ruleVarCall();

            state._fsp--;

             after(grammarAccess.getIUAccess().getVarVersionVarCallParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__IU__VarVersionAssignment_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTargetPlatform_in_entryRuleTargetPlatform61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetPlatform68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPlatform__Group__0_in_ruleTargetPlatform94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetContent_in_entryRuleTargetContent122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetContent129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetContent__Alternatives_in_ruleTargetContent155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_entryRuleOptions182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptions189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__0_in_ruleOptions215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_entryRuleEnvironment242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironment249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0_in_ruleEnvironment275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDefinition_in_entryRuleVarDefinition302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDefinition309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__0_in_ruleVarDefinition335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_entryRuleCompositeString362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeString369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Group__0_in_ruleCompositeString395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeStringPart_in_entryRuleCompositeStringPart422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeStringPart429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeStringPart__Alternatives_in_ruleCompositeStringPart455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarCall_in_entryRuleVarCall482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarCall489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarCall__Group__0_in_ruleVarCall515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticString_in_entryRuleStaticString542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticString549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticString__ValueAssignment_in_ruleStaticString575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDeclaration_in_entryRuleIncludeDeclaration602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDeclaration609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDeclaration__Group__0_in_ruleIncludeDeclaration635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__0_in_ruleLocation695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIU_in_entryRuleIU722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIU729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group__0_in_ruleIU755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionRange_in_entryRuleVersionRange856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionRange863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Alternatives_in_ruleVersionRange893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Option__Alternatives_in_ruleOption930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptions_in_rule__TargetContent__Alternatives965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironment_in_rule__TargetContent__Alternatives982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDeclaration_in_rule__TargetContent__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_rule__TargetContent__Alternatives1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDefinition_in_rule__TargetContent__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarCall_in_rule__CompositeStringPart__Alternatives1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticString_in_rule__CompositeStringPart__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Alternatives_1_1_0_in_rule__IU__Alternatives_1_11114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__VarVersionAssignment_1_1_1_in_rule__IU__Alternatives_1_11132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__VersionAssignment_1_1_0_0_in_rule__IU__Alternatives_1_1_01165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__VersionAssignment_1_1_0_1_in_rule__IU__Alternatives_1_1_01183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Alternatives_1_2_2_11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Alternatives_1_2_2_11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUALIFIER_in_rule__Version__Alternatives_1_2_2_11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__0_in_rule__VersionRange__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__VersionRange__Alternatives1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__VersionRange__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VersionRange__Alternatives_0_01353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VersionRange__Alternatives_0_01373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VersionRange__Alternatives_0_41408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VersionRange__Alternatives_0_41428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Option__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Option__Alternatives1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Option__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Option__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPlatform__Group__0__Impl_in_rule__TargetPlatform__Group__01559 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TargetPlatform__Group__1_in_rule__TargetPlatform__Group__01562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TargetPlatform__Group__0__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPlatform__Group__1__Impl_in_rule__TargetPlatform__Group__11621 = new BitSet(new long[]{0x00000000C3400000L});
    public static final BitSet FOLLOW_rule__TargetPlatform__Group__2_in_rule__TargetPlatform__Group__11624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPlatform__NameAssignment_1_in_rule__TargetPlatform__Group__1__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPlatform__Group__2__Impl_in_rule__TargetPlatform__Group__21681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetPlatform__ContentsAssignment_2_in_rule__TargetPlatform__Group__2__Impl1708 = new BitSet(new long[]{0x00000000C3400002L});
    public static final BitSet FOLLOW_rule__Options__Group__0__Impl_in_rule__Options__Group__01745 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Options__Group__1_in_rule__Options__Group__01748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Options__Group__0__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__1__Impl_in_rule__Options__Group__11807 = new BitSet(new long[]{0x00000000009E0000L});
    public static final BitSet FOLLOW_rule__Options__Group__2_in_rule__Options__Group__11810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__OptionsAssignment_1_in_rule__Options__Group__1__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group__2__Impl_in_rule__Options__Group__21867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_2__0_in_rule__Options__Group__2__Impl1894 = new BitSet(new long[]{0x00000000009E0002L});
    public static final BitSet FOLLOW_rule__Options__Group_2__0__Impl_in_rule__Options__Group_2__01931 = new BitSet(new long[]{0x00000000009E0000L});
    public static final BitSet FOLLOW_rule__Options__Group_2__1_in_rule__Options__Group_2__01934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Options__Group_2__0__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__Group_2__1__Impl_in_rule__Options__Group_2__11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Options__OptionsAssignment_2_1_in_rule__Options__Group_2__1__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__0__Impl_in_rule__Environment__Group__02057 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Environment__Group__1_in_rule__Environment__Group__02060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__1__Impl_in_rule__Environment__Group__12118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Environment__Group__2_in_rule__Environment__Group__12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Environment__Group__1__Impl2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__2__Impl_in_rule__Environment__Group__22180 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Environment__Group__3_in_rule__Environment__Group__22183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__EnvAssignment_2_in_rule__Environment__Group__2__Impl2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group__3__Impl_in_rule__Environment__Group__32240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group_3__0_in_rule__Environment__Group__3__Impl2267 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_rule__Environment__Group_3__0__Impl_in_rule__Environment__Group_3__02306 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Environment__Group_3__1_in_rule__Environment__Group_3__02309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Environment__Group_3__0__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__Group_3__1__Impl_in_rule__Environment__Group_3__12371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Environment__EnvAssignment_3_1_in_rule__Environment__Group_3__1__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__0__Impl_in_rule__VarDefinition__Group__02432 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__1_in_rule__VarDefinition__Group__02435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VarDefinition__Group__0__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__1__Impl_in_rule__VarDefinition__Group__12494 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__2_in_rule__VarDefinition__Group__12497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__ConstantAssignment_1_in_rule__VarDefinition__Group__1__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__2__Impl_in_rule__VarDefinition__Group__22555 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__3_in_rule__VarDefinition__Group__22558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__NameAssignment_2_in_rule__VarDefinition__Group__2__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__3__Impl_in_rule__VarDefinition__Group__32615 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__4_in_rule__VarDefinition__Group__32618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__VarDefinition__Group__3__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__Group__4__Impl_in_rule__VarDefinition__Group__42677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDefinition__ValueAssignment_4_in_rule__VarDefinition__Group__4__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Group__0__Impl_in_rule__CompositeString__Group__02744 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_rule__CompositeString__Group__1_in_rule__CompositeString__Group__02747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Group__1__Impl_in_rule__CompositeString__Group__12805 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CompositeString__Group__2_in_rule__CompositeString__Group__12808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__StringPartsAssignment_1_in_rule__CompositeString__Group__1__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Group__2__Impl_in_rule__CompositeString__Group__22865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Group_2__0_in_rule__CompositeString__Group__2__Impl2892 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Group_2__0__Impl_in_rule__CompositeString__Group_2__02929 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_rule__CompositeString__Group_2__1_in_rule__CompositeString__Group_2__02932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompositeString__Group_2__0__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Group_2__1__Impl_in_rule__CompositeString__Group_2__12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__StringPartsAssignment_2_1_in_rule__CompositeString__Group_2__1__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarCall__Group__0__Impl_in_rule__VarCall__Group__03052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarCall__Group__1_in_rule__VarCall__Group__03055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VarCall__Group__0__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarCall__Group__1__Impl_in_rule__VarCall__Group__13114 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__VarCall__Group__2_in_rule__VarCall__Group__13117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarCall__VarNameAssignment_1_in_rule__VarCall__Group__1__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarCall__Group__2__Impl_in_rule__VarCall__Group__23174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VarCall__Group__2__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDeclaration__Group__0__Impl_in_rule__IncludeDeclaration__Group__03239 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_rule__IncludeDeclaration__Group__1_in_rule__IncludeDeclaration__Group__03242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__IncludeDeclaration__Group__0__Impl3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDeclaration__Group__1__Impl_in_rule__IncludeDeclaration__Group__13301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDeclaration__CompositeImportURIAssignment_1_in_rule__IncludeDeclaration__Group__1__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__0__Impl_in_rule__Location__Group__03362 = new BitSet(new long[]{0x0000000010000090L});
    public static final BitSet FOLLOW_rule__Location__Group__1_in_rule__Location__Group__03365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Location__Group__0__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__1__Impl_in_rule__Location__Group__13424 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Location__Group__2_in_rule__Location__Group__13427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__UnorderedGroup_1_in_rule__Location__Group__1__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group__2__Impl_in_rule__Location__Group__23484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2__0_in_rule__Location__Group__2__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2__0__Impl_in_rule__Location__Group_2__03548 = new BitSet(new long[]{0x0000000020400010L});
    public static final BitSet FOLLOW_rule__Location__Group_2__1_in_rule__Location__Group_2__03551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Location__Group_2__0__Impl3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2__1__Impl_in_rule__Location__Group_2__13610 = new BitSet(new long[]{0x0000000020400010L});
    public static final BitSet FOLLOW_rule__Location__Group_2__2_in_rule__Location__Group_2__13613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1__0_in_rule__Location__Group_2__1__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2__2__Impl_in_rule__Location__Group_2__23671 = new BitSet(new long[]{0x0000000020400010L});
    public static final BitSet FOLLOW_rule__Location__Group_2__3_in_rule__Location__Group_2__23674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__IusAssignment_2_2_in_rule__Location__Group_2__2__Impl3701 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Location__Group_2__3__Impl_in_rule__Location__Group_2__33732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Location__Group_2__3__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1__0__Impl_in_rule__Location__Group_2_1__03799 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1__1_in_rule__Location__Group_2_1__03802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Location__Group_2_1__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1__1__Impl_in_rule__Location__Group_2_1__13861 = new BitSet(new long[]{0x00000000009E0000L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1__2_in_rule__Location__Group_2_1__13864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__OptionsAssignment_2_1_1_in_rule__Location__Group_2_1__1__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1__2__Impl_in_rule__Location__Group_2_1__23921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1_2__0_in_rule__Location__Group_2_1__2__Impl3948 = new BitSet(new long[]{0x00000000009E0002L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1_2__0__Impl_in_rule__Location__Group_2_1_2__03985 = new BitSet(new long[]{0x00000000009E0000L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1_2__1_in_rule__Location__Group_2_1_2__03988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Location__Group_2_1_2__0__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__Group_2_1_2__1__Impl_in_rule__Location__Group_2_1_2__14050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__OptionsAssignment_2_1_2_1_in_rule__Location__Group_2_1_2__1__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group__0__Impl_in_rule__IU__Group__04111 = new BitSet(new long[]{0x00000002100070A0L});
    public static final BitSet FOLLOW_rule__IU__Group__1_in_rule__IU__Group__04114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__IDAssignment_0_in_rule__IU__Group__0__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group__1__Impl_in_rule__IU__Group__14171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group_1__0_in_rule__IU__Group__1__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group_1__0__Impl_in_rule__IU__Group_1__04233 = new BitSet(new long[]{0x00000002100070A0L});
    public static final BitSet FOLLOW_rule__IU__Group_1__1_in_rule__IU__Group_1__04236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group_1_0__0_in_rule__IU__Group_1__0__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group_1__1__Impl_in_rule__IU__Group_1__14294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Alternatives_1_1_in_rule__IU__Group_1__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group_1_0__0__Impl_in_rule__IU__Group_1_0__04355 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IU__Group_1_0__1_in_rule__IU__Group_1_0__04358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IU__Group_1_0__0__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group_1_0__1__Impl_in_rule__IU__Group_1_0__14417 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IU__Group_1_0__2_in_rule__IU__Group_1_0__14420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IU__Group_1_0__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IU__Group_1_0__2__Impl_in_rule__IU__Group_1_0__24479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IU__Group_1_0__2__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__04544 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__04547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__0__Impl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__14603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1__0_in_rule__Version__Group__1__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1__0__Impl_in_rule__Version__Group_1__04665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group_1__1_in_rule__Version__Group_1__04668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Version__Group_1__0__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1__1__Impl_in_rule__Version__Group_1__14727 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Version__Group_1__2_in_rule__Version__Group_1__14730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1__1__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1__2__Impl_in_rule__Version__Group_1__24786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2__0_in_rule__Version__Group_1__2__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2__0__Impl_in_rule__Version__Group_1_2__04850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2__1_in_rule__Version__Group_1_2__04853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Version__Group_1_2__0__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2__1__Impl_in_rule__Version__Group_1_2__14912 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2__2_in_rule__Version__Group_1_2__14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group_1_2__1__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2__2__Impl_in_rule__Version__Group_1_2__24971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2_2__0_in_rule__Version__Group_1_2__2__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2_2__0__Impl_in_rule__Version__Group_1_2_2__05035 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2_2__1_in_rule__Version__Group_1_2_2__05038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Version__Group_1_2_2__0__Impl5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_1_2_2__1__Impl_in_rule__Version__Group_1_2_2__15097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Alternatives_1_2_2_1_in_rule__Version__Group_1_2_2__1__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__0__Impl_in_rule__VersionRange__Group_0__05158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__1_in_rule__VersionRange__Group_0__05161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Alternatives_0_0_in_rule__VersionRange__Group_0__0__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__1__Impl_in_rule__VersionRange__Group_0__15218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__2_in_rule__VersionRange__Group_0__15221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__VersionRange__Group_0__1__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__2__Impl_in_rule__VersionRange__Group_0__25277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__3_in_rule__VersionRange__Group_0__25280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VersionRange__Group_0__2__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__3__Impl_in_rule__VersionRange__Group_0__35339 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__4_in_rule__VersionRange__Group_0__35342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__VersionRange__Group_0__3__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Group_0__4__Impl_in_rule__VersionRange__Group_0__45398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VersionRange__Alternatives_0_4_in_rule__VersionRange__Group_0__4__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__UnorderedGroup_1__0_in_rule__Location__UnorderedGroup_15466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__IDAssignment_1_0_in_rule__Location__UnorderedGroup_1__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__CompositeUriAssignment_1_1_in_rule__Location__UnorderedGroup_1__Impl5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__UnorderedGroup_1__Impl_in_rule__Location__UnorderedGroup_1__05705 = new BitSet(new long[]{0x0000000010000092L});
    public static final BitSet FOLLOW_rule__Location__UnorderedGroup_1__1_in_rule__Location__UnorderedGroup_1__05708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Location__UnorderedGroup_1__Impl_in_rule__Location__UnorderedGroup_1__15733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TargetPlatform__NameAssignment_15765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetContent_in_rule__TargetPlatform__ContentsAssignment_25796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Options__OptionsAssignment_15827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Options__OptionsAssignment_2_15858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Environment__EnvAssignment_25889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Environment__EnvAssignment_3_15920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__VarDefinition__ConstantAssignment_15956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDefinition__NameAssignment_25995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_rule__VarDefinition__ValueAssignment_46026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeStringPart_in_rule__CompositeString__StringPartsAssignment_16057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeStringPart_in_rule__CompositeString__StringPartsAssignment_2_16088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarCall__VarNameAssignment_16123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StaticString__ValueAssignment6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_rule__IncludeDeclaration__CompositeImportURIAssignment_16189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Location__IDAssignment_1_06220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_rule__Location__CompositeUriAssignment_1_16251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Location__OptionsAssignment_2_1_16282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_rule__Location__OptionsAssignment_2_1_2_16313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIU_in_rule__Location__IusAssignment_2_26344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IU__IDAssignment_06375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionRange_in_rule__IU__VersionAssignment_1_1_0_06406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IU__VersionAssignment_1_1_0_16437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarCall_in_rule__IU__VarVersionAssignment_1_1_16468 = new BitSet(new long[]{0x0000000000000002L});

}
