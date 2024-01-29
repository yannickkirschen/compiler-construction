// Generated from /Users/yannick/Development/compiler-construction/antlr-exercises/src/main/antlr4/de/dhbw/decaf/Decaf.g4 by ANTLR 4.12.0
package de.dhbw.decaf.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, SUB=17, 
		ADD=18, MUL=19, INT=20, BOOL=21, VOID=22, IDENTIFIER=23, Number=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "SUB", 
			"ADD", "MUL", "INT", "BOOL", "VOID", "IDENTIFIER", "Number", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'def'", "'('", "')'", "','", "'{'", "'}'", "'='", "'if'", 
			"'else'", "'while'", "'return'", "'break'", "'continue'", "'true'", "'false'", 
			"'-'", "'+'", "'*'", "'int'", "'bool'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "SUB", "ADD", "MUL", "INT", "BOOL", "VOID", 
			"IDENTIFIER", "Number", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0004\u0016\u008a\b\u0016\u000b\u0016\f\u0016\u008b\u0001\u0017"+
		"\u0004\u0017\u008f\b\u0017\u000b\u0017\f\u0017\u0090\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0097\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000"+
		"\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000"+
		"\u0007;\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b?\u0001"+
		"\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fC\u0001\u0000\u0000"+
		"\u0000\u0011E\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000\u0000\u0015"+
		"M\u0001\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019Z\u0001"+
		"\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001di\u0001\u0000\u0000"+
		"\u0000\u001fn\u0001\u0000\u0000\u0000!t\u0001\u0000\u0000\u0000#v\u0001"+
		"\u0000\u0000\u0000%x\u0001\u0000\u0000\u0000\'z\u0001\u0000\u0000\u0000"+
		")~\u0001\u0000\u0000\u0000+\u0083\u0001\u0000\u0000\u0000-\u0089\u0001"+
		"\u0000\u0000\u0000/\u008e\u0001\u0000\u0000\u00001\u0092\u0001\u0000\u0000"+
		"\u000034\u0005;\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0005d\u0000"+
		"\u000067\u0005e\u0000\u000078\u0005f\u0000\u00008\u0004\u0001\u0000\u0000"+
		"\u00009:\u0005(\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005)\u0000"+
		"\u0000<\b\u0001\u0000\u0000\u0000=>\u0005,\u0000\u0000>\n\u0001\u0000"+
		"\u0000\u0000?@\u0005{\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005}"+
		"\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005=\u0000\u0000D\u0010"+
		"\u0001\u0000\u0000\u0000EF\u0005i\u0000\u0000FG\u0005f\u0000\u0000G\u0012"+
		"\u0001\u0000\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005"+
		"s\u0000\u0000KL\u0005e\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005"+
		"w\u0000\u0000NO\u0005h\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005l\u0000"+
		"\u0000QR\u0005e\u0000\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0005r\u0000"+
		"\u0000TU\u0005e\u0000\u0000UV\u0005t\u0000\u0000VW\u0005u\u0000\u0000"+
		"WX\u0005r\u0000\u0000XY\u0005n\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000"+
		"Z[\u0005b\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005"+
		"a\u0000\u0000^_\u0005k\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005"+
		"c\u0000\u0000ab\u0005o\u0000\u0000bc\u0005n\u0000\u0000cd\u0005t\u0000"+
		"\u0000de\u0005i\u0000\u0000ef\u0005n\u0000\u0000fg\u0005u\u0000\u0000"+
		"gh\u0005e\u0000\u0000h\u001c\u0001\u0000\u0000\u0000ij\u0005t\u0000\u0000"+
		"jk\u0005r\u0000\u0000kl\u0005u\u0000\u0000lm\u0005e\u0000\u0000m\u001e"+
		"\u0001\u0000\u0000\u0000no\u0005f\u0000\u0000op\u0005a\u0000\u0000pq\u0005"+
		"l\u0000\u0000qr\u0005s\u0000\u0000rs\u0005e\u0000\u0000s \u0001\u0000"+
		"\u0000\u0000tu\u0005-\u0000\u0000u\"\u0001\u0000\u0000\u0000vw\u0005+"+
		"\u0000\u0000w$\u0001\u0000\u0000\u0000xy\u0005*\u0000\u0000y&\u0001\u0000"+
		"\u0000\u0000z{\u0005i\u0000\u0000{|\u0005n\u0000\u0000|}\u0005t\u0000"+
		"\u0000}(\u0001\u0000\u0000\u0000~\u007f\u0005b\u0000\u0000\u007f\u0080"+
		"\u0005o\u0000\u0000\u0080\u0081\u0005o\u0000\u0000\u0081\u0082\u0005l"+
		"\u0000\u0000\u0082*\u0001\u0000\u0000\u0000\u0083\u0084\u0005v\u0000\u0000"+
		"\u0084\u0085\u0005o\u0000\u0000\u0085\u0086\u0005i\u0000\u0000\u0086\u0087"+
		"\u0005d\u0000\u0000\u0087,\u0001\u0000\u0000\u0000\u0088\u008a\u0007\u0000"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c.\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0001\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u00910\u0001\u0000\u0000\u0000\u0092\u0093\u0007\u0002\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0006\u0018\u0000\u0000"+
		"\u00952\u0001\u0000\u0000\u0000\u0003\u0000\u008b\u0090\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}