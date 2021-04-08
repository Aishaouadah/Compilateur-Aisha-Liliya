package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangageParser extends Parser {
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
	public static final int
		RULE_code = 0, RULE_listId = 1, RULE_declarations = 2, RULE_type = 3, 
		RULE_declaration = 4, RULE_statements = 5, RULE_statement = 6, RULE_assignment = 7, 
		RULE_logic_expression = 8, RULE_arithmitic_expression = 9, RULE_do_while = 10, 
		RULE_if_then_else = 11, RULE_si = 12, RULE_sinon = 13, RULE_print = 14, 
		RULE_scan = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "listId", "declarations", "type", "declaration", "statements", 
			"statement", "assignment", "logic_expression", "arithmitic_expression", 
			"do_while", "if_then_else", "si", "sinon", "print", "scan"
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

	@Override
	public String getGrammarFileName() { return "Langage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	 
		public CodeContext() { }
		public void copyFrom(CodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends CodeContext {
		public TerminalNode Prg_name() { return getToken(LangageParser.Prg_name, 0); }
		public TerminalNode Parenthese_ouv() { return getToken(LangageParser.Parenthese_ouv, 0); }
		public TerminalNode Parenthese_ferm() { return getToken(LangageParser.Parenthese_ferm, 0); }
		public TerminalNode Accolade_ouv() { return getToken(LangageParser.Accolade_ouv, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Accolade_ferm() { return getToken(LangageParser.Accolade_ferm, 0); }
		public ProgramContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			match(Prg_name);
			setState(34);
			match(Parenthese_ouv);
			setState(35);
			match(Parenthese_ferm);
			setState(36);
			match(Accolade_ouv);
			setState(37);
			declarations();
			setState(38);
			match(T__1);
			setState(39);
			statements();
			setState(40);
			match(Accolade_ferm);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIdContext extends ParserRuleContext {
		public ListIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listId; }
	 
		public ListIdContext() { }
		public void copyFrom(ListIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListIdentifiersContext extends ListIdContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public TerminalNode Vergule() { return getToken(LangageParser.Vergule, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public ListIdentifiersContext(ListIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterListIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitListIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitListIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifersContext extends ListIdContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public IdentifersContext(ListIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterIdentifers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitIdentifers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitIdentifers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListIdContext listId() throws RecognitionException {
		ListIdContext _localctx = new ListIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listId);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ListIdentifiersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ID);
				setState(43);
				match(Vergule);
				setState(44);
				listId();
				}
				break;
			case 2:
				_localctx = new IdentifersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Decs2Context extends DeclarationsContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Decs2Context(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterDecs2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitDecs2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitDecs2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Decs1Context extends DeclarationsContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Decs1Context(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterDecs1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitDecs1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitDecs1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Decs1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				declaration();
				setState(49);
				declarations();
				}
				break;
			case 2:
				_localctx = new Decs2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecContext extends DeclarationContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<ListIdContext> listId() {
			return getRuleContexts(ListIdContext.class);
		}
		public ListIdContext listId(int i) {
			return getRuleContext(ListIdContext.class,i);
		}
		public List<TerminalNode> PointVergule() { return getTokens(LangageParser.PointVergule); }
		public TerminalNode PointVergule(int i) {
			return getToken(LangageParser.PointVergule, i);
		}
		public DecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			int _alt;
			_localctx = new DecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					type();
					setState(57);
					listId();
					setState(58);
					match(PointVergule);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PrintCompil) | (1L << Scan) | (1L << Do) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public If_then_elseContext if_then_else() {
			return getRuleContext(If_then_elseContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(69);
				assignment();
				}
				break;
			case Do:
				{
				setState(70);
				do_while();
				}
				break;
			case IF:
				{
				setState(71);
				if_then_else();
				}
				break;
			case PrintCompil:
				{
				setState(72);
				print();
				}
				break;
			case Scan:
				{
				setState(73);
				scan();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assig1Context extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(LangageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangageParser.ID, i);
		}
		public TerminalNode Affect() { return getToken(LangageParser.Affect, 0); }
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public Assig1Context(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAssig1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAssig1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAssig1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assig2Context extends AssignmentContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public TerminalNode Affect() { return getToken(LangageParser.Affect, 0); }
		public TerminalNode STRING() { return getToken(LangageParser.STRING, 0); }
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public Assig2Context(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAssig2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAssig2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAssig2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assig3Context extends AssignmentContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public TerminalNode Affect() { return getToken(LangageParser.Affect, 0); }
		public TerminalNode INT() { return getToken(LangageParser.INT, 0); }
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public Assig3Context(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAssig3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAssig3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAssig3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assig4Context extends AssignmentContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public TerminalNode Affect() { return getToken(LangageParser.Affect, 0); }
		public TerminalNode FLOAT() { return getToken(LangageParser.FLOAT, 0); }
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public Assig4Context(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAssig4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAssig4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAssig4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assig5Context extends AssignmentContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public Arithmitic_expressionContext arithmitic_expression() {
			return getRuleContext(Arithmitic_expressionContext.class,0);
		}
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public Assig5Context(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAssig5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAssig5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAssig5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Assig1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(ID);
				setState(77);
				match(Affect);
				setState(78);
				match(ID);
				setState(79);
				match(PointVergule);
				}
				break;
			case 2:
				_localctx = new Assig2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(ID);
				setState(81);
				match(Affect);
				setState(82);
				match(STRING);
				setState(83);
				match(PointVergule);
				}
				break;
			case 3:
				_localctx = new Assig3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(ID);
				setState(85);
				match(Affect);
				setState(86);
				match(INT);
				setState(87);
				match(PointVergule);
				}
				break;
			case 4:
				_localctx = new Assig4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(ID);
				setState(89);
				match(Affect);
				setState(90);
				match(FLOAT);
				setState(91);
				match(PointVergule);
				}
				break;
			case 5:
				_localctx = new Assig5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(ID);
				setState(93);
				arithmitic_expression(0);
				setState(94);
				match(PointVergule);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_expressionContext extends ParserRuleContext {
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
	 
		public Logic_expressionContext() { }
		public void copyFrom(Logic_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Le9Context extends Logic_expressionContext {
		public List<TerminalNode> INT() { return getTokens(LangageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LangageParser.INT, i);
		}
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public Le9Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe9(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le2Context extends Logic_expressionContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public TerminalNode STRING() { return getToken(LangageParser.STRING, 0); }
		public Le2Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le1Context extends Logic_expressionContext {
		public List<TerminalNode> ID() { return getTokens(LangageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangageParser.ID, i);
		}
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public Le1Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le4Context extends Logic_expressionContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public TerminalNode INT() { return getToken(LangageParser.INT, 0); }
		public Le4Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le10Context extends Logic_expressionContext {
		public List<TerminalNode> STRING() { return getTokens(LangageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LangageParser.STRING, i);
		}
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public Le10Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe10(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le3Context extends Logic_expressionContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public TerminalNode FLOAT() { return getToken(LangageParser.FLOAT, 0); }
		public Le3Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le11Context extends Logic_expressionContext {
		public List<TerminalNode> FLOAT() { return getTokens(LangageParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(LangageParser.FLOAT, i);
		}
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public Le11Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe11(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le6Context extends Logic_expressionContext {
		public TerminalNode STRING() { return getToken(LangageParser.STRING, 0); }
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public Le6Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le8Context extends Logic_expressionContext {
		public TerminalNode INT() { return getToken(LangageParser.INT, 0); }
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public Le8Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Le7Context extends Logic_expressionContext {
		public TerminalNode FLOAT() { return getToken(LangageParser.FLOAT, 0); }
		public TerminalNode LOGIC_OPERATORS() { return getToken(LangageParser.LOGIC_OPERATORS, 0); }
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public Le7Context(Logic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLe7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLe7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLe7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logic_expression);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Le1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(ID);
				setState(99);
				match(LOGIC_OPERATORS);
				setState(100);
				match(ID);
				}
				break;
			case 2:
				_localctx = new Le2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(ID);
				setState(102);
				match(LOGIC_OPERATORS);
				setState(103);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new Le3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(ID);
				setState(105);
				match(LOGIC_OPERATORS);
				setState(106);
				match(FLOAT);
				}
				break;
			case 4:
				_localctx = new Le4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(ID);
				setState(108);
				match(LOGIC_OPERATORS);
				setState(109);
				match(INT);
				}
				break;
			case 5:
				_localctx = new Le6Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(STRING);
				setState(111);
				match(LOGIC_OPERATORS);
				setState(112);
				match(ID);
				}
				break;
			case 6:
				_localctx = new Le7Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				match(FLOAT);
				setState(114);
				match(LOGIC_OPERATORS);
				setState(115);
				match(ID);
				}
				break;
			case 7:
				_localctx = new Le8Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				match(INT);
				setState(117);
				match(LOGIC_OPERATORS);
				setState(118);
				match(ID);
				}
				break;
			case 8:
				_localctx = new Le9Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(119);
				match(INT);
				setState(120);
				match(LOGIC_OPERATORS);
				setState(121);
				match(INT);
				}
				}
				break;
			case 9:
				_localctx = new Le10Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(122);
				match(STRING);
				setState(123);
				match(LOGIC_OPERATORS);
				setState(124);
				match(STRING);
				}
				}
				break;
			case 10:
				_localctx = new Le11Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(125);
				match(FLOAT);
				setState(126);
				match(LOGIC_OPERATORS);
				setState(127);
				match(FLOAT);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmitic_expressionContext extends ParserRuleContext {
		public Arithmitic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmitic_expression; }
	 
		public Arithmitic_expressionContext() { }
		public void copyFrom(Arithmitic_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ae4Context extends Arithmitic_expressionContext {
		public TerminalNode FLOAT() { return getToken(LangageParser.FLOAT, 0); }
		public Ae4Context(Arithmitic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAe4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAe4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAe4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ae1Context extends Arithmitic_expressionContext {
		public List<Arithmitic_expressionContext> arithmitic_expression() {
			return getRuleContexts(Arithmitic_expressionContext.class);
		}
		public Arithmitic_expressionContext arithmitic_expression(int i) {
			return getRuleContext(Arithmitic_expressionContext.class,i);
		}
		public TerminalNode ARITHMITIC_OPERATORS() { return getToken(LangageParser.ARITHMITIC_OPERATORS, 0); }
		public Ae1Context(Arithmitic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAe1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAe1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAe1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ae3Context extends Arithmitic_expressionContext {
		public TerminalNode INT() { return getToken(LangageParser.INT, 0); }
		public Ae3Context(Arithmitic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAe3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAe3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAe3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ae2Context extends Arithmitic_expressionContext {
		public TerminalNode ID() { return getToken(LangageParser.ID, 0); }
		public Ae2Context(Arithmitic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAe2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAe2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAe2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmitic_expressionContext arithmitic_expression() throws RecognitionException {
		return arithmitic_expression(0);
	}

	private Arithmitic_expressionContext arithmitic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmitic_expressionContext _localctx = new Arithmitic_expressionContext(_ctx, _parentState);
		Arithmitic_expressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithmitic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new Ae2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new Ae3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new Ae4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Ae1Context(new Arithmitic_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arithmitic_expression);
					setState(136);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(137);
					match(ARITHMITIC_OPERATORS);
					setState(138);
					arithmitic_expression(5);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(LangageParser.Do, 0); }
		public TerminalNode Accolade_ouv() { return getToken(LangageParser.Accolade_ouv, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Accolade_ferm() { return getToken(LangageParser.Accolade_ferm, 0); }
		public TerminalNode While() { return getToken(LangageParser.While, 0); }
		public TerminalNode Parenthese_ouv() { return getToken(LangageParser.Parenthese_ouv, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public TerminalNode Parenthese_ferm() { return getToken(LangageParser.Parenthese_ferm, 0); }
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Do);
			setState(145);
			match(Accolade_ouv);
			setState(146);
			statements();
			setState(147);
			match(Accolade_ferm);
			setState(148);
			match(While);
			setState(149);
			match(Parenthese_ouv);
			setState(150);
			logic_expression();
			setState(151);
			match(Parenthese_ferm);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_then_elseContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public SinonContext sinon() {
			return getRuleContext(SinonContext.class,0);
		}
		public If_then_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterIf_then_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitIf_then_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitIf_then_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_then_elseContext if_then_else() throws RecognitionException {
		If_then_elseContext _localctx = new If_then_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_then_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			si();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(154);
				sinon();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LangageParser.IF, 0); }
		public TerminalNode Parenthese_ouv() { return getToken(LangageParser.Parenthese_ouv, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public TerminalNode Parenthese_ferm() { return getToken(LangageParser.Parenthese_ferm, 0); }
		public TerminalNode Then() { return getToken(LangageParser.Then, 0); }
		public TerminalNode Accolade_ouv() { return getToken(LangageParser.Accolade_ouv, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Accolade_ferm() { return getToken(LangageParser.Accolade_ferm, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IF);
			setState(158);
			match(Parenthese_ouv);
			setState(159);
			logic_expression();
			setState(160);
			match(Parenthese_ferm);
			setState(161);
			match(Then);
			setState(162);
			match(Accolade_ouv);
			setState(163);
			statements();
			setState(164);
			match(Accolade_ferm);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinonContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LangageParser.ELSE, 0); }
		public TerminalNode Accolade_ouv() { return getToken(LangageParser.Accolade_ouv, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Accolade_ferm() { return getToken(LangageParser.Accolade_ferm, 0); }
		public SinonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterSinon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitSinon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitSinon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinonContext sinon() throws RecognitionException {
		SinonContext _localctx = new SinonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sinon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ELSE);
			setState(167);
			match(Accolade_ouv);
			setState(168);
			statements();
			setState(169);
			match(Accolade_ferm);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PrintCompil() { return getToken(LangageParser.PrintCompil, 0); }
		public TerminalNode Parenthese_ouv() { return getToken(LangageParser.Parenthese_ouv, 0); }
		public TerminalNode Parenthese_ferm() { return getToken(LangageParser.Parenthese_ferm, 0); }
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LangageParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(PrintCompil);
			setState(172);
			match(Parenthese_ouv);
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(173);
				listId();
				}
				break;
			case STRING:
				{
				setState(174);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177);
			match(Parenthese_ferm);
			setState(178);
			match(PointVergule);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanContext extends ParserRuleContext {
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
	 
		public ScanContext() { }
		public void copyFrom(ScanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Scan2Context extends ScanContext {
		public TerminalNode Scan() { return getToken(LangageParser.Scan, 0); }
		public TerminalNode Parenthese_ouv() { return getToken(LangageParser.Parenthese_ouv, 0); }
		public List<TerminalNode> ID() { return getTokens(LangageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangageParser.ID, i);
		}
		public TerminalNode Vergule() { return getToken(LangageParser.Vergule, 0); }
		public TerminalNode Parenthese_ferm() { return getToken(LangageParser.Parenthese_ferm, 0); }
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public Scan2Context(ScanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterScan2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitScan2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitScan2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scan);
		try {
			_localctx = new Scan2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Scan);
			setState(181);
			match(Parenthese_ouv);
			setState(182);
			match(ID);
			setState(183);
			match(Vergule);
			setState(184);
			match(ID);
			setState(185);
			match(Parenthese_ferm);
			setState(186);
			match(PointVergule);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return arithmitic_expression_sempred((Arithmitic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmitic_expression_sempred(Arithmitic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\5\3\5\3\6\3\6\3\6\3\6\6\6?\n\6\r\6\16\6@\3\7\6\7D\n"+
		"\7\r\7\16\7E\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0089\n\13\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u009e\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00b2\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\2\3\24\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\3\3\2\5\7\2\u00c8\2\"\3\2\2\2\4\60\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2"+
		"\n>\3\2\2\2\fC\3\2\2\2\16L\3\2\2\2\20b\3\2\2\2\22\u0082\3\2\2\2\24\u0088"+
		"\3\2\2\2\26\u0092\3\2\2\2\30\u009b\3\2\2\2\32\u009f\3\2\2\2\34\u00a8\3"+
		"\2\2\2\36\u00ad\3\2\2\2 \u00b6\3\2\2\2\"#\7\3\2\2#$\7\n\2\2$%\7\36\2\2"+
		"%&\7\37\2\2&\'\7 \2\2\'(\5\6\4\2()\7\4\2\2)*\5\f\7\2*+\7!\2\2+\3\3\2\2"+
		"\2,-\7\22\2\2-.\7#\2\2.\61\5\4\3\2/\61\7\22\2\2\60,\3\2\2\2\60/\3\2\2"+
		"\2\61\5\3\2\2\2\62\63\5\n\6\2\63\64\5\6\4\2\64\67\3\2\2\2\65\67\5\n\6"+
		"\2\66\62\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\t\2\2\29\t\3\2\2\2:;\5\b"+
		"\5\2;<\5\4\3\2<=\7\"\2\2=?\3\2\2\2>:\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2A\13\3\2\2\2BD\5\16\b\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\r"+
		"\3\2\2\2GM\5\20\t\2HM\5\26\f\2IM\5\30\r\2JM\5\36\20\2KM\5 \21\2LG\3\2"+
		"\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\17\3\2\2\2NO\7\22\2\2OP"+
		"\7\35\2\2PQ\7\22\2\2Qc\7\"\2\2RS\7\22\2\2ST\7\35\2\2TU\7$\2\2Uc\7\"\2"+
		"\2VW\7\22\2\2WX\7\35\2\2XY\7%\2\2Yc\7\"\2\2Z[\7\22\2\2[\\\7\35\2\2\\]"+
		"\7&\2\2]c\7\"\2\2^_\7\22\2\2_`\5\24\13\2`a\7\"\2\2ac\3\2\2\2bN\3\2\2\2"+
		"bR\3\2\2\2bV\3\2\2\2bZ\3\2\2\2b^\3\2\2\2c\21\3\2\2\2de\7\22\2\2ef\7\b"+
		"\2\2f\u0083\7\22\2\2gh\7\22\2\2hi\7\b\2\2i\u0083\7$\2\2jk\7\22\2\2kl\7"+
		"\b\2\2l\u0083\7&\2\2mn\7\22\2\2no\7\b\2\2o\u0083\7%\2\2pq\7$\2\2qr\7\b"+
		"\2\2r\u0083\7\22\2\2st\7&\2\2tu\7\b\2\2u\u0083\7\22\2\2vw\7%\2\2wx\7\b"+
		"\2\2x\u0083\7\22\2\2yz\7%\2\2z{\7\b\2\2{\u0083\7%\2\2|}\7$\2\2}~\7\b\2"+
		"\2~\u0083\7$\2\2\177\u0080\7&\2\2\u0080\u0081\7\b\2\2\u0081\u0083\7&\2"+
		"\2\u0082d\3\2\2\2\u0082g\3\2\2\2\u0082j\3\2\2\2\u0082m\3\2\2\2\u0082p"+
		"\3\2\2\2\u0082s\3\2\2\2\u0082v\3\2\2\2\u0082y\3\2\2\2\u0082|\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0083\23\3\2\2\2\u0084\u0085\b\13\1\2\u0085\u0089\7\22\2"+
		"\2\u0086\u0089\7%\2\2\u0087\u0089\7&\2\2\u0088\u0084\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008f\3\2\2\2\u008a\u008b\f\6\2\2\u008b"+
		"\u008c\7\t\2\2\u008c\u008e\5\24\13\7\u008d\u008a\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7\20\2\2\u0093\u0094\7 \2\2\u0094\u0095\5\f"+
		"\7\2\u0095\u0096\7!\2\2\u0096\u0097\7\21\2\2\u0097\u0098\7\36\2\2\u0098"+
		"\u0099\5\22\n\2\u0099\u009a\7\37\2\2\u009a\27\3\2\2\2\u009b\u009d\5\32"+
		"\16\2\u009c\u009e\5\34\17\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\31\3\2\2\2\u009f\u00a0\7\13\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00a2\5\22"+
		"\n\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\7 \2\2\u00a5"+
		"\u00a6\5\f\7\2\u00a6\u00a7\7!\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\f\2\2"+
		"\u00a9\u00aa\7 \2\2\u00aa\u00ab\5\f\7\2\u00ab\u00ac\7!\2\2\u00ac\35\3"+
		"\2\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00b1\7\36\2\2\u00af\u00b2\5\4\3\2\u00b0"+
		"\u00b2\7$\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\7\37\2\2\u00b4\u00b5\7\"\2\2\u00b5\37\3\2\2\2\u00b6\u00b7"+
		"\7\17\2\2\u00b7\u00b8\7\36\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\7#\2\2"+
		"\u00ba\u00bb\7\22\2\2\u00bb\u00bc\7\37\2\2\u00bc\u00bd\7\"\2\2\u00bd!"+
		"\3\2\2\2\r\60\66@ELb\u0082\u0088\u008f\u009d\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}