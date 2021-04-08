// Generated from Langage.g4 by ANTLR 4.9.2

package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LOGIC_OPERATORS=6, ARITHMITIC_OPERATORS=7, 
		Prg_name=8, IF=9, ELSE=10, Then=11, PrintCompil=12, Scan=13, Do=14, While=15, 
		ID=16, Plus=17, Minus=18, Multiply=19, Division=20, Sup=21, SupE=22, Inf=23, 
		InfE=24, Equal=25, NEqual=26, Affect=27, Parenthese_ouv=28, Parenthese_ferm=29, 
		Accolade_ouv=30, Accolade_ferm=31, PointVergule=32, Vergule=33, STRING=34, 
		INT=35, FLOAT=36, Number=37, LOWERCASE=38, UPPERCASE=39, Comment=40, Line_comment=41, 
		Ws=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "LOGIC_OPERATORS", "ARITHMITIC_OPERATORS", 
			"Prg_name", "IF", "ELSE", "Then", "PrintCompil", "Scan", "Do", "While", 
			"ID", "Plus", "Minus", "Multiply", "Division", "Sup", "SupE", "Inf", 
			"InfE", "Equal", "NEqual", "Affect", "Parenthese_ouv", "Parenthese_ferm", 
			"Accolade_ouv", "Accolade_ferm", "PointVergule", "Vergule", "STRING", 
			"INT", "FLOAT", "Number", "LOWERCASE", "UPPERCASE", "Comment", "Line_comment", 
			"Ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'compil'", "'start'", "'intCompil'", "'floatCompil'", "'stringCompil'", 
			null, null, null, "'if'", "'else'", "'then'", "'printCompil'", "'scanCompil'", 
			"'do'", "'while'", null, "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", 
			"'<='", "'=='", "'!='", "'='", "'('", "')'", "'{'", "'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "LOGIC_OPERATORS", "ARITHMITIC_OPERATORS", 
			"Prg_name", "IF", "ELSE", "Then", "PrintCompil", "Scan", "Do", "While", 
			"ID", "Plus", "Minus", "Multiply", "Division", "Sup", "SupE", "Inf", 
			"InfE", "Equal", "NEqual", "Affect", "Parenthese_ouv", "Parenthese_ferm", 
			"Accolade_ouv", "Accolade_ferm", "PointVergule", "Vergule", "STRING", 
			"INT", "FLOAT", "Number", "LOWERCASE", "UPPERCASE", "Comment", "Line_comment", 
			"Ws"
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


	public LangageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Langage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0146\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u008e\n\7\3\b\3\b\3\b\3\b\5\b\u0094\n\b\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u009b\n\t\f\t\16\t\u009e\13\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00cf\n\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00d5\n\21\f\21\16\21\u00d8\13\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\7#\u0102\n#\f#\16#\u0105\13#\3#\3#\3$\3$\5$\u010b"+
		"\n$\3$\6$\u010e\n$\r$\16$\u010f\3%\3%\5%\u0114\n%\3%\6%\u0117\n%\r%\16"+
		"%\u0118\3%\3%\6%\u011d\n%\r%\16%\u011e\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3"+
		")\7)\u012b\n)\f)\16)\u012e\13)\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u0139\n*"+
		"\f*\16*\u013c\13*\3*\3*\3+\6+\u0141\n+\r+\16+\u0142\3+\3+\3\u012c\2,\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\b\5\2\f\f\17\17$$\3\2\62;\3\2c|\3\2C\\"+
		"\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0161\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5^\3\2"+
		"\2\2\7d\3\2\2\2\tn\3\2\2\2\13z\3\2\2\2\r\u008d\3\2\2\2\17\u0093\3\2\2"+
		"\2\21\u0095\3\2\2\2\23\u009f\3\2\2\2\25\u00a2\3\2\2\2\27\u00a7\3\2\2\2"+
		"\31\u00ac\3\2\2\2\33\u00b8\3\2\2\2\35\u00c3\3\2\2\2\37\u00c6\3\2\2\2!"+
		"\u00ce\3\2\2\2#\u00d9\3\2\2\2%\u00db\3\2\2\2\'\u00dd\3\2\2\2)\u00df\3"+
		"\2\2\2+\u00e1\3\2\2\2-\u00e3\3\2\2\2/\u00e6\3\2\2\2\61\u00e8\3\2\2\2\63"+
		"\u00eb\3\2\2\2\65\u00ee\3\2\2\2\67\u00f1\3\2\2\29\u00f3\3\2\2\2;\u00f5"+
		"\3\2\2\2=\u00f7\3\2\2\2?\u00f9\3\2\2\2A\u00fb\3\2\2\2C\u00fd\3\2\2\2E"+
		"\u00ff\3\2\2\2G\u010a\3\2\2\2I\u0113\3\2\2\2K\u0120\3\2\2\2M\u0122\3\2"+
		"\2\2O\u0124\3\2\2\2Q\u0126\3\2\2\2S\u0134\3\2\2\2U\u0140\3\2\2\2WX\7e"+
		"\2\2XY\7q\2\2YZ\7o\2\2Z[\7r\2\2[\\\7k\2\2\\]\7n\2\2]\4\3\2\2\2^_\7u\2"+
		"\2_`\7v\2\2`a\7c\2\2ab\7t\2\2bc\7v\2\2c\6\3\2\2\2de\7k\2\2ef\7p\2\2fg"+
		"\7v\2\2gh\7E\2\2hi\7q\2\2ij\7o\2\2jk\7r\2\2kl\7k\2\2lm\7n\2\2m\b\3\2\2"+
		"\2no\7h\2\2op\7n\2\2pq\7q\2\2qr\7c\2\2rs\7v\2\2st\7E\2\2tu\7q\2\2uv\7"+
		"o\2\2vw\7r\2\2wx\7k\2\2xy\7n\2\2y\n\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7t\2\2"+
		"}~\7k\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080\u0081\7E\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0083\7o\2\2\u0083\u0084\7r\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7n\2\2\u0086\f\3\2\2\2\u0087\u008e\5+\26\2\u0088\u008e\5-\27\2"+
		"\u0089\u008e\5/\30\2\u008a\u008e\5\61\31\2\u008b\u008e\5\63\32\2\u008c"+
		"\u008e\5\65\33\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3"+
		"\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\16\3\2\2\2\u008f\u0094\5#\22\2\u0090\u0094\5%\23\2\u0091\u0094\5\'\24"+
		"\2\u0092\u0094\5)\25\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0094\20\3\2\2\2\u0095\u009c\5O(\2\u0096"+
		"\u009b\5O(\2\u0097\u009b\5M\'\2\u0098\u009b\5K&\2\u0099\u009b\7a\2\2\u009a"+
		"\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\22\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2"+
		"\u00a1\24\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7"+
		"u\2\2\u00a5\u00a6\7g\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9"+
		"\7j\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab\30\3\2\2\2\u00ac\u00ad"+
		"\7r\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7o\2\2"+
		"\u00b4\u00b5\7r\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\32\3\2"+
		"\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\u00bd\7E\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7o\2\2\u00bf"+
		"\u00c0\7r\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7n\2\2\u00c2\34\3\2\2\2\u00c3"+
		"\u00c4\7f\2\2\u00c4\u00c5\7q\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7y\2\2\u00c7"+
		"\u00c8\7j\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb \3\2\2\2\u00cc\u00cf\5O(\2\u00cd\u00cf\5M\'\2\u00ce\u00cc\3\2\2"+
		"\2\u00ce\u00cd\3\2\2\2\u00cf\u00d6\3\2\2\2\u00d0\u00d5\5O(\2\u00d1\u00d5"+
		"\5M\'\2\u00d2\u00d5\5K&\2\u00d3\u00d5\7a\2\2\u00d4\u00d0\3\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\"\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00da\7-\2\2\u00da$\3\2\2\2\u00db\u00dc\7/\2\2\u00dc&\3"+
		"\2\2\2\u00dd\u00de\7,\2\2\u00de(\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0*\3"+
		"\2\2\2\u00e1\u00e2\7@\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e5"+
		"\7?\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\60\3\2\2\2\u00e8\u00e9"+
		"\7>\2\2\u00e9\u00ea\7?\2\2\u00ea\62\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec\u00ed"+
		"\7?\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\7?\2\2\u00f0\66"+
		"\3\2\2\2\u00f1\u00f2\7?\2\2\u00f28\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4:\3"+
		"\2\2\2\u00f5\u00f6\7+\2\2\u00f6<\3\2\2\2\u00f7\u00f8\7}\2\2\u00f8>\3\2"+
		"\2\2\u00f9\u00fa\7\177\2\2\u00fa@\3\2\2\2\u00fb\u00fc\7=\2\2\u00fcB\3"+
		"\2\2\2\u00fd\u00fe\7.\2\2\u00feD\3\2\2\2\u00ff\u0103\7$\2\2\u0100\u0102"+
		"\n\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7$"+
		"\2\2\u0107F\3\2\2\2\u0108\u010b\5#\22\2\u0109\u010b\5%\23\2\u010a\u0108"+
		"\3\2\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010e\5K&\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110H\3\2\2\2\u0111\u0114\5#\22\2\u0112\u0114"+
		"\5%\23\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0117\5K&\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c"+
		"\7\60\2\2\u011b\u011d\5K&\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fJ\3\2\2\2\u0120\u0121\t\3\2\2"+
		"\u0121L\3\2\2\2\u0122\u0123\t\4\2\2\u0123N\3\2\2\2\u0124\u0125\t\5\2\2"+
		"\u0125P\3\2\2\2\u0126\u0127\7\61\2\2\u0127\u0128\7,\2\2\u0128\u012c\3"+
		"\2\2\2\u0129\u012b\13\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0130\7,\2\2\u0130\u0131\7\61\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\b)\2\2\u0133R\3\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136\7\61\2\2"+
		"\u0136\u013a\3\2\2\2\u0137\u0139\n\6\2\2\u0138\u0137\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\b*\2\2\u013eT\3\2\2\2\u013f\u0141\t\7\2\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b+\2\2\u0145V\3\2\2\2\23\2\u008d"+
		"\u0093\u009a\u009c\u00ce\u00d4\u00d6\u0103\u010a\u010f\u0113\u0118\u011e"+
		"\u012c\u013a\u0142\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}