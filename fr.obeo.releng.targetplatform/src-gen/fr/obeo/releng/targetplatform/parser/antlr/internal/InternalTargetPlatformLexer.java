package fr.obeo.releng.targetplatform.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetPlatformLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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
    public static final int RULE_ID=5;
    public static final int RULE_QUALIFIER=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

    public InternalTargetPlatformLexer() {;} 
    public InternalTargetPlatformLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTargetPlatformLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:11:7: ( 'target' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:11:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:12:7: ( 'with' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:12:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:13:7: ( ',' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:14:7: ( 'environment' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:14:9: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:15:7: ( 'define' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:15:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:16:7: ( 'const' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:16:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:17:7: ( '=' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:18:7: ( '+' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:18:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:19:7: ( '${' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:19:9: '${'
            {
            match("${"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:20:7: ( '}' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:21:7: ( 'include' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:21:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:22:7: ( 'location' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:22:9: 'location'
            {
            match("location"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:23:7: ( 'discard' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:23:9: 'discard'
            {
            match("discard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:24:7: ( '{' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:25:7: ( ';' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:26:7: ( 'version' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:26:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:27:7: ( '.' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:28:7: ( '(' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:29:7: ( '[' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:29:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:30:7: ( ')' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:31:7: ( ']' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:32:7: ( 'lazy' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:32:9: 'lazy'
            {
            match("lazy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:33:7: ( 'requirements' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:33:9: 'requirements'
            {
            match("requirements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:34:7: ( 'allEnvironments' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:34:9: 'allEnvironments'
            {
            match("allEnvironments"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:35:7: ( 'source' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:35:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:36:7: ( 'configurePhase' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:36:9: 'configurePhase'
            {
            match("configurePhase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1190:10: ( ( '0' .. '9' )+ )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1190:12: ( '0' .. '9' )+
            {
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1190:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1190:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1192:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )* )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1192:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )*
            {
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1192:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1192:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1192:40: ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1192:41: ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' )
            	    {
            	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1192:41: ( '.' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='.') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1192:41: '.'
            	            {
            	            match('.'); 

            	            }
            	            break;

            	    }

            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_QUALIFIER"
    public final void mRULE_QUALIFIER() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1194:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1194:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1194:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1196:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1198:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1198:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1198:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1198:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1200:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1200:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1200:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1200:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1200:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1200:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1200:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1200:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1202:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1202:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1202:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1204:16: ( . )
            // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1204:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_INT | RULE_ID | RULE_QUALIFIER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=34;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:175: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:183: RULE_QUALIFIER
                {
                mRULE_QUALIFIER(); 

                }
                break;
            case 30 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:198: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:210: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:226: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:242: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../fr.obeo.releng.targetplatform/src-gen/fr/obeo/releng/targetplatform/parser/antlr/internal/InternalTargetPlatform.g:1:250: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\34\2\43\1\uffff\3\43\2\uffff\1\41\1\uffff\2\43\2\uffff\1\43\5\uffff\3\43\1\75\1\41\1\43\2\uffff\3\41\2\uffff\1\43\1\uffff\2\43\1\uffff\4\43\4\uffff\3\43\2\uffff\1\43\5\uffff\3\43\1\uffff\1\75\4\uffff\16\43\1\137\7\43\1\147\5\43\1\uffff\3\43\1\160\3\43\1\uffff\4\43\1\170\1\43\1\172\1\43\1\uffff\6\43\1\u0082\1\uffff\1\43\1\uffff\1\u0084\1\43\1\u0086\1\43\1\u0088\2\43\1\uffff\1\43\1\uffff\1\43\1\uffff\1\u008d\1\uffff\4\43\1\uffff\6\43\1\u0098\3\43\1\uffff\1\43\1\u009d\2\43\1\uffff\1\43\1\u00a1\1\43\1\uffff\1\u00a3\1\uffff";
    static final String DFA14_eofS =
        "\u00a4\uffff";
    static final String DFA14_minS =
        "\1\0\2\55\1\uffff\3\55\2\uffff\1\173\1\uffff\2\55\2\uffff\1\55\5\uffff\4\55\1\101\1\55\2\uffff\2\0\1\52\2\uffff\1\55\1\uffff\2\55\1\uffff\4\55\4\uffff\3\55\2\uffff\1\55\5\uffff\3\55\1\uffff\1\55\4\uffff\34\55\1\uffff\7\55\1\uffff\10\55\1\uffff\7\55\1\uffff\1\55\1\uffff\7\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\4\55\1\uffff\12\55\1\uffff\4\55\1\uffff\3\55\1\uffff\1\55\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\172\1\uffff\3\172\2\uffff\1\173\1\uffff\2\172\2\uffff\1\172\5\uffff\6\172\2\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\2\172\1\uffff\4\172\4\uffff\3\172\2\uffff\1\172\5\uffff\3\172\1\uffff\1\172\4\uffff\34\172\1\uffff\7\172\1\uffff\10\172\1\uffff\7\172\1\uffff\1\172\1\uffff\7\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\4\172\1\uffff\12\172\1\uffff\4\172\1\uffff\3\172\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\3\uffff\1\7\1\10\1\uffff\1\12\2\uffff\1\16\1\17\1\uffff\1\21\1\22\1\23\1\24\1\25\6\uffff\2\35\3\uffff\1\41\1\42\1\uffff\1\34\2\uffff\1\3\4\uffff\1\7\1\10\1\11\1\12\3\uffff\1\16\1\17\1\uffff\1\21\1\22\1\23\1\24\1\25\3\uffff\1\33\1\uffff\1\36\1\37\1\40\1\41\34\uffff\1\2\7\uffff\1\26\10\uffff\1\6\7\uffff\1\1\1\uffff\1\5\7\uffff\1\31\1\uffff\1\15\1\uffff\1\13\1\uffff\1\20\4\uffff\1\14\12\uffff\1\4\4\uffff\1\27\3\uffff\1\32\1\uffff\1\30";
    static final String DFA14_specialS =
        "\1\1\34\uffff\1\0\1\2\u0085\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\1\41\1\11\2\41\1\36\1\21\1\23\1\41\1\10\1\3\1\33\1\20\1\37\12\30\1\41\1\16\1\41\1\7\3\41\32\32\1\22\1\41\1\24\1\31\1\32\1\41\1\26\1\32\1\6\1\5\1\4\3\32\1\13\2\32\1\14\5\32\1\25\1\27\1\1\1\32\1\17\1\2\3\32\1\15\1\41\1\12\uff82\41",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\42\31\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\45\21\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\47\14\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\50\3\44\1\51\21\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\52\13\44",
            "",
            "",
            "\1\55",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\57\14\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\61\15\44\1\60\13\44",
            "",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\64\25\44",
            "",
            "",
            "",
            "",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\72\25\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\73\16\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\74\13\44",
            "\1\34\2\uffff\12\76\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\77",
            "\0\77",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\103\10\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\104\6\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\25\44\1\105\4\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\5\44\1\106\24\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\107\7\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\110\14\44",
            "",
            "",
            "",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\2\44\1\111\27\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\2\44\1\112\27\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\31\44\1\113",
            "",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\114\10\44",
            "",
            "",
            "",
            "",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\20\44\1\115\11\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\116\16\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\24\44\1\117\5\44",
            "",
            "\1\34\2\uffff\12\76\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\6\44\1\120\23\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\7\44\1\121\22\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\122\21\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\123\21\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\2\44\1\124\27\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\5\44\1\126\14\44\1\125\7\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\127\16\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\130\31\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\30\44\1\131\1\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\132\7\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\24\44\1\133\5\44",
            "\1\44\2\uffff\12\44\7\uffff\4\44\1\134\25\44\4\uffff\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\135\10\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\136\25\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\140\10\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\141\14\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\142\31\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\143\6\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\144\21\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\24\44\1\145\5\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\146\6\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\150\21\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\151\21\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\152\14\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\2\44\1\153\27\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\154\6\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\155\13\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\156\25\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\157\10\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\6\44\1\161\23\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\162\26\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\163\21\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\164\13\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\165\10\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\25\44\1\166\4\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\167\25\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\171\14\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\173\26\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\24\44\1\174\5\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\175\25\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\176\13\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\177\14\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\u0080\25\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\u0081\21\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\14\44\1\u0083\15\44",
            "",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\u0085\10\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\u0087\14\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\14\44\1\u0089\15\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\u008a\10\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\u008b\25\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\u008c\25\44",
            "",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\u008e\25\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\u008f\13\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\u0090\14\44",
            "\1\44\2\uffff\12\44\7\uffff\17\44\1\u0091\12\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\u0092\14\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\u0093\14\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\u0094\6\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\7\44\1\u0095\22\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\u0096\6\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\14\44\1\u0097\15\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\u0099\31\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\u009a\7\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\u009b\25\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\u009c\7\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\u009e\14\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\u009f\25\44",
            "",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\u00a0\6\44",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            "\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\u00a2\7\44",
            "",
            "\1\44\1\43\1\uffff\12\44\7\uffff\32\44\3\uffff\1\43\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_INT | RULE_ID | RULE_QUALIFIER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( ((LA14_29>='\u0000' && LA14_29<='\uFFFF')) ) {s = 63;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='t') ) {s = 1;}

                        else if ( (LA14_0=='w') ) {s = 2;}

                        else if ( (LA14_0==',') ) {s = 3;}

                        else if ( (LA14_0=='e') ) {s = 4;}

                        else if ( (LA14_0=='d') ) {s = 5;}

                        else if ( (LA14_0=='c') ) {s = 6;}

                        else if ( (LA14_0=='=') ) {s = 7;}

                        else if ( (LA14_0=='+') ) {s = 8;}

                        else if ( (LA14_0=='$') ) {s = 9;}

                        else if ( (LA14_0=='}') ) {s = 10;}

                        else if ( (LA14_0=='i') ) {s = 11;}

                        else if ( (LA14_0=='l') ) {s = 12;}

                        else if ( (LA14_0=='{') ) {s = 13;}

                        else if ( (LA14_0==';') ) {s = 14;}

                        else if ( (LA14_0=='v') ) {s = 15;}

                        else if ( (LA14_0=='.') ) {s = 16;}

                        else if ( (LA14_0=='(') ) {s = 17;}

                        else if ( (LA14_0=='[') ) {s = 18;}

                        else if ( (LA14_0==')') ) {s = 19;}

                        else if ( (LA14_0==']') ) {s = 20;}

                        else if ( (LA14_0=='r') ) {s = 21;}

                        else if ( (LA14_0=='a') ) {s = 22;}

                        else if ( (LA14_0=='s') ) {s = 23;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 24;}

                        else if ( (LA14_0=='^') ) {s = 25;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='f' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='q')||LA14_0=='u'||(LA14_0>='x' && LA14_0<='z')) ) {s = 26;}

                        else if ( (LA14_0=='-') ) {s = 27;}

                        else if ( (LA14_0=='\"') ) {s = 29;}

                        else if ( (LA14_0=='\'') ) {s = 30;}

                        else if ( (LA14_0=='/') ) {s = 31;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 32;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='#'||(LA14_0>='%' && LA14_0<='&')||LA14_0=='*'||LA14_0==':'||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 33;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( ((LA14_30>='\u0000' && LA14_30<='\uFFFF')) ) {s = 63;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}