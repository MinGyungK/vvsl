// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class vvslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, BOOL=4, PRINT=5, UNNOT=6, UNPLUS=7, UNMIN=8, DIV=9, 
		MOD=10, MUL=11, ADD=12, SUB=13, POW=14, LT=15, GT=16, LE=17, GE=18, AND=19, 
		OR=20, ASSIGNMENT=21, COMMA=22, SEMICOLONE=23, LPAREN=24, RPAREN=25, LBRACE=26, 
		RBRACE=27, LBRAKET=28, RBRAKET=29, WS=30, ID=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "INT", "BOOL", "PRINT", "UNNOT", "UNPLUS", "UNMIN", "DIV", 
			"MOD", "MUL", "ADD", "SUB", "POW", "LT", "GT", "LE", "GE", "AND", "OR", 
			"ASSIGNMENT", "COMMA", "SEMICOLONE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRAKET", "RBRAKET", "WS", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'!='", null, null, "'print'", "'!'", "'++'", "'--'", "'/'", 
			"'%'", "'*'", "'+'", "'-'", "'^'", "'<'", "'>'", "'<='", "'>='", "'&&'", 
			"'||'", "'='", "','", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "INT", "BOOL", "PRINT", "UNNOT", "UNPLUS", "UNMIN", 
			"DIV", "MOD", "MUL", "ADD", "SUB", "POW", "LT", "GT", "LE", "GE", "AND", 
			"OR", "ASSIGNMENT", "COMMA", "SEMICOLONE", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRAKET", "RBRAKET", "WS", "ID"
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


	public vvslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "vvsl.g4"; }

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
		"\u0004\u0000\u001f\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"I\b\u0002\n\u0002\f\u0002L\t\u0002\u0003\u0002N\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0004\u001e"+
		"\u009c\b\u001e\u000b\u001e\f\u001e\u009d\u0001\u001e\u0005\u001e\u00a1"+
		"\b\u001e\n\u001e\f\u001e\u00a4\t\u001e\u0000\u0000\u001f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u0005\u0001\u000019\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0003\u000009AZaz\u00a9"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003B\u0001\u0000"+
		"\u0000\u0000\u0005M\u0001\u0000\u0000\u0000\u0007X\u0001\u0000\u0000\u0000"+
		"\tZ\u0001\u0000\u0000\u0000\u000b`\u0001\u0000\u0000\u0000\rb\u0001\u0000"+
		"\u0000\u0000\u000fe\u0001\u0000\u0000\u0000\u0011h\u0001\u0000\u0000\u0000"+
		"\u0013j\u0001\u0000\u0000\u0000\u0015l\u0001\u0000\u0000\u0000\u0017n"+
		"\u0001\u0000\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001br\u0001\u0000"+
		"\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001fv\u0001\u0000\u0000\u0000"+
		"!x\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000%~\u0001\u0000\u0000"+
		"\u0000\'\u0081\u0001\u0000\u0000\u0000)\u0084\u0001\u0000\u0000\u0000"+
		"+\u0086\u0001\u0000\u0000\u0000-\u0088\u0001\u0000\u0000\u0000/\u008a"+
		"\u0001\u0000\u0000\u00001\u008c\u0001\u0000\u0000\u00003\u008e\u0001\u0000"+
		"\u0000\u00005\u0090\u0001\u0000\u0000\u00007\u0092\u0001\u0000\u0000\u0000"+
		"9\u0094\u0001\u0000\u0000\u0000;\u0096\u0001\u0000\u0000\u0000=\u009b"+
		"\u0001\u0000\u0000\u0000?@\u0005=\u0000\u0000@A\u0005=\u0000\u0000A\u0002"+
		"\u0001\u0000\u0000\u0000BC\u0005!\u0000\u0000CD\u0005=\u0000\u0000D\u0004"+
		"\u0001\u0000\u0000\u0000EN\u00050\u0000\u0000FJ\u0007\u0000\u0000\u0000"+
		"GI\u0007\u0001\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KN\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000MF\u0001"+
		"\u0000\u0000\u0000N\u0006\u0001\u0000\u0000\u0000OP\u0005t\u0000\u0000"+
		"PQ\u0005r\u0000\u0000QR\u0005u\u0000\u0000RY\u0005e\u0000\u0000ST\u0005"+
		"f\u0000\u0000TU\u0005a\u0000\u0000UV\u0005l\u0000\u0000VW\u0005s\u0000"+
		"\u0000WY\u0005e\u0000\u0000XO\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000"+
		"\u0000Y\b\u0001\u0000\u0000\u0000Z[\u0005p\u0000\u0000[\\\u0005r\u0000"+
		"\u0000\\]\u0005i\u0000\u0000]^\u0005n\u0000\u0000^_\u0005t\u0000\u0000"+
		"_\n\u0001\u0000\u0000\u0000`a\u0005!\u0000\u0000a\f\u0001\u0000\u0000"+
		"\u0000bc\u0005+\u0000\u0000cd\u0005+\u0000\u0000d\u000e\u0001\u0000\u0000"+
		"\u0000ef\u0005-\u0000\u0000fg\u0005-\u0000\u0000g\u0010\u0001\u0000\u0000"+
		"\u0000hi\u0005/\u0000\u0000i\u0012\u0001\u0000\u0000\u0000jk\u0005%\u0000"+
		"\u0000k\u0014\u0001\u0000\u0000\u0000lm\u0005*\u0000\u0000m\u0016\u0001"+
		"\u0000\u0000\u0000no\u0005+\u0000\u0000o\u0018\u0001\u0000\u0000\u0000"+
		"pq\u0005-\u0000\u0000q\u001a\u0001\u0000\u0000\u0000rs\u0005^\u0000\u0000"+
		"s\u001c\u0001\u0000\u0000\u0000tu\u0005<\u0000\u0000u\u001e\u0001\u0000"+
		"\u0000\u0000vw\u0005>\u0000\u0000w \u0001\u0000\u0000\u0000xy\u0005<\u0000"+
		"\u0000yz\u0005=\u0000\u0000z\"\u0001\u0000\u0000\u0000{|\u0005>\u0000"+
		"\u0000|}\u0005=\u0000\u0000}$\u0001\u0000\u0000\u0000~\u007f\u0005&\u0000"+
		"\u0000\u007f\u0080\u0005&\u0000\u0000\u0080&\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005|\u0000\u0000\u0082\u0083\u0005|\u0000\u0000\u0083(\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005=\u0000\u0000\u0085*\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005,\u0000\u0000\u0087,\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005;\u0000\u0000\u0089.\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"(\u0000\u0000\u008b0\u0001\u0000\u0000\u0000\u008c\u008d\u0005)\u0000"+
		"\u0000\u008d2\u0001\u0000\u0000\u0000\u008e\u008f\u0005{\u0000\u0000\u008f"+
		"4\u0001\u0000\u0000\u0000\u0090\u0091\u0005}\u0000\u0000\u00916\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005[\u0000\u0000\u00938\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005]\u0000\u0000\u0095:\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0007\u0002\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0006\u001d\u0000\u0000\u0099<\u0001\u0000\u0000\u0000\u009a\u009c"+
		"\u0007\u0003\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a2\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0007\u0004\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3>\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u0006\u0000JMX\u009d\u00a2\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}