// Generated from Langage.g4 by ANTLR 4.9.2

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
		public TerminalNode Affect() { return getToken(LangageParser.Affect, 0); }
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
			setState(97);
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
				match(Affect);
				setState(94);
				arithmitic_expression(0);
				setState(95);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Le1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(ID);
				setState(100);
				match(LOGIC_OPERATORS);
				setState(101);
				match(ID);
				}
				break;
			case 2:
				_localctx = new Le2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(ID);
				setState(103);
				match(LOGIC_OPERATORS);
				setState(104);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new Le3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(ID);
				setState(106);
				match(LOGIC_OPERATORS);
				setState(107);
				match(FLOAT);
				}
				break;
			case 4:
				_localctx = new Le4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(ID);
				setState(109);
				match(LOGIC_OPERATORS);
				setState(110);
				match(INT);
				}
				break;
			case 5:
				_localctx = new Le6Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(STRING);
				setState(112);
				match(LOGIC_OPERATORS);
				setState(113);
				match(ID);
				}
				break;
			case 6:
				_localctx = new Le7Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(FLOAT);
				setState(115);
				match(LOGIC_OPERATORS);
				setState(116);
				match(ID);
				}
				break;
			case 7:
				_localctx = new Le8Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				match(INT);
				setState(118);
				match(LOGIC_OPERATORS);
				setState(119);
				match(ID);
				}
				break;
			case 8:
				_localctx = new Le9Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
				match(INT);
				setState(121);
				match(LOGIC_OPERATORS);
				setState(122);
				match(INT);
				}
				break;
			case 9:
				_localctx = new Le10Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				match(STRING);
				setState(124);
				match(LOGIC_OPERATORS);
				setState(125);
				match(STRING);
				}
				break;
			case 10:
				_localctx = new Le11Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(126);
				match(FLOAT);
				setState(127);
				match(LOGIC_OPERATORS);
				setState(128);
				match(FLOAT);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new Ae2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new Ae3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new Ae4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
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
					setState(137);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(138);
					match(ARITHMITIC_OPERATORS);
					setState(139);
					arithmitic_expression(5);
					}
					} 
				}
				setState(144);
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
			setState(145);
			match(Do);
			setState(146);
			match(Accolade_ouv);
			setState(147);
			statements();
			setState(148);
			match(Accolade_ferm);
			setState(149);
			match(While);
			setState(150);
			match(Parenthese_ouv);
			setState(151);
			logic_expression();
			setState(152);
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
			setState(154);
			si();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(155);
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
			setState(158);
			match(IF);
			setState(159);
			match(Parenthese_ouv);
			setState(160);
			logic_expression();
			setState(161);
			match(Parenthese_ferm);
			setState(162);
			match(Then);
			setState(163);
			match(Accolade_ouv);
			setState(164);
			statements();
			setState(165);
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
			setState(167);
			match(ELSE);
			setState(168);
			match(Accolade_ouv);
			setState(169);
			statements();
			setState(170);
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
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Printcheck1Context extends PrintContext {
		public TerminalNode PrintCompil() { return getToken(LangageParser.PrintCompil, 0); }
		public TerminalNode Parenthese_ouv() { return getToken(LangageParser.Parenthese_ouv, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode Parenthese_ferm() { return getToken(LangageParser.Parenthese_ferm, 0); }
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public Printcheck1Context(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterPrintcheck1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitPrintcheck1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitPrintcheck1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Printcheck2Context extends PrintContext {
		public TerminalNode PrintCompil() { return getToken(LangageParser.PrintCompil, 0); }
		public TerminalNode Parenthese_ouv() { return getToken(LangageParser.Parenthese_ouv, 0); }
		public TerminalNode STRING() { return getToken(LangageParser.STRING, 0); }
		public TerminalNode Parenthese_ferm() { return getToken(LangageParser.Parenthese_ferm, 0); }
		public TerminalNode PointVergule() { return getToken(LangageParser.PointVergule, 0); }
		public Printcheck2Context(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterPrintcheck2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitPrintcheck2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitPrintcheck2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Printcheck1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(PrintCompil);
				setState(173);
				match(Parenthese_ouv);
				setState(174);
				listId();
				setState(175);
				match(Parenthese_ferm);
				setState(176);
				match(PointVergule);
				}
				break;
			case 2:
				_localctx = new Printcheck2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(PrintCompil);
				setState(179);
				match(Parenthese_ouv);
				setState(180);
				match(STRING);
				setState(181);
				match(Parenthese_ferm);
				setState(182);
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
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
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
			setState(185);
			match(Scan);
			setState(186);
			match(Parenthese_ouv);
			setState(187);
			listId();
			setState(188);
			match(Parenthese_ferm);
			setState(189);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\5\3\5\3\6\3\6\3\6\3\6\6\6?\n\6\r\6\16\6@\3\7\6\7D\n"+
		"\7\r\7\16\7E\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0084\n\n\3\13\3\13"+
		"\3\13\3\13\5\13\u008a\n\13\3\13\3\13\3\13\7\13\u008f\n\13\f\13\16\13\u0092"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u009f\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ba\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\2\3\24\22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\3\3\2\5\7\2\u00cb\2\"\3\2\2\2\4\60\3\2\2\2\6\66\3\2\2\2\b"+
		"8\3\2\2\2\n>\3\2\2\2\fC\3\2\2\2\16L\3\2\2\2\20c\3\2\2\2\22\u0083\3\2\2"+
		"\2\24\u0089\3\2\2\2\26\u0093\3\2\2\2\30\u009c\3\2\2\2\32\u00a0\3\2\2\2"+
		"\34\u00a9\3\2\2\2\36\u00b9\3\2\2\2 \u00bb\3\2\2\2\"#\7\3\2\2#$\7\n\2\2"+
		"$%\7\36\2\2%&\7\37\2\2&\'\7 \2\2\'(\5\6\4\2()\7\4\2\2)*\5\f\7\2*+\7!\2"+
		"\2+\3\3\2\2\2,-\7\22\2\2-.\7#\2\2.\61\5\4\3\2/\61\7\22\2\2\60,\3\2\2\2"+
		"\60/\3\2\2\2\61\5\3\2\2\2\62\63\5\n\6\2\63\64\5\6\4\2\64\67\3\2\2\2\65"+
		"\67\5\n\6\2\66\62\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\t\2\2\29\t\3\2"+
		"\2\2:;\5\b\5\2;<\5\4\3\2<=\7\"\2\2=?\3\2\2\2>:\3\2\2\2?@\3\2\2\2@>\3\2"+
		"\2\2@A\3\2\2\2A\13\3\2\2\2BD\5\16\b\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF"+
		"\3\2\2\2F\r\3\2\2\2GM\5\20\t\2HM\5\26\f\2IM\5\30\r\2JM\5\36\20\2KM\5 "+
		"\21\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\17\3\2\2\2NO"+
		"\7\22\2\2OP\7\35\2\2PQ\7\22\2\2Qd\7\"\2\2RS\7\22\2\2ST\7\35\2\2TU\7$\2"+
		"\2Ud\7\"\2\2VW\7\22\2\2WX\7\35\2\2XY\7%\2\2Yd\7\"\2\2Z[\7\22\2\2[\\\7"+
		"\35\2\2\\]\7&\2\2]d\7\"\2\2^_\7\22\2\2_`\7\35\2\2`a\5\24\13\2ab\7\"\2"+
		"\2bd\3\2\2\2cN\3\2\2\2cR\3\2\2\2cV\3\2\2\2cZ\3\2\2\2c^\3\2\2\2d\21\3\2"+
		"\2\2ef\7\22\2\2fg\7\b\2\2g\u0084\7\22\2\2hi\7\22\2\2ij\7\b\2\2j\u0084"+
		"\7$\2\2kl\7\22\2\2lm\7\b\2\2m\u0084\7&\2\2no\7\22\2\2op\7\b\2\2p\u0084"+
		"\7%\2\2qr\7$\2\2rs\7\b\2\2s\u0084\7\22\2\2tu\7&\2\2uv\7\b\2\2v\u0084\7"+
		"\22\2\2wx\7%\2\2xy\7\b\2\2y\u0084\7\22\2\2z{\7%\2\2{|\7\b\2\2|\u0084\7"+
		"%\2\2}~\7$\2\2~\177\7\b\2\2\177\u0084\7$\2\2\u0080\u0081\7&\2\2\u0081"+
		"\u0082\7\b\2\2\u0082\u0084\7&\2\2\u0083e\3\2\2\2\u0083h\3\2\2\2\u0083"+
		"k\3\2\2\2\u0083n\3\2\2\2\u0083q\3\2\2\2\u0083t\3\2\2\2\u0083w\3\2\2\2"+
		"\u0083z\3\2\2\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\23\3\2\2\2\u0085"+
		"\u0086\b\13\1\2\u0086\u008a\7\22\2\2\u0087\u008a\7%\2\2\u0088\u008a\7"+
		"&\2\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u0090\3\2\2\2\u008b\u008c\f\6\2\2\u008c\u008d\7\t\2\2\u008d\u008f\5\24"+
		"\13\7\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\25\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\20\2"+
		"\2\u0094\u0095\7 \2\2\u0095\u0096\5\f\7\2\u0096\u0097\7!\2\2\u0097\u0098"+
		"\7\21\2\2\u0098\u0099\7\36\2\2\u0099\u009a\5\22\n\2\u009a\u009b\7\37\2"+
		"\2\u009b\27\3\2\2\2\u009c\u009e\5\32\16\2\u009d\u009f\5\34\17\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\13\2"+
		"\2\u00a1\u00a2\7\36\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7\37\2\2\u00a4"+
		"\u00a5\7\r\2\2\u00a5\u00a6\7 \2\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\7!\2"+
		"\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\7 \2\2\u00ab\u00ac"+
		"\5\f\7\2\u00ac\u00ad\7!\2\2\u00ad\35\3\2\2\2\u00ae\u00af\7\16\2\2\u00af"+
		"\u00b0\7\36\2\2\u00b0\u00b1\5\4\3\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\7"+
		"\"\2\2\u00b3\u00ba\3\2\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\7\36\2\2\u00b6"+
		"\u00b7\7$\2\2\u00b7\u00b8\7\37\2\2\u00b8\u00ba\7\"\2\2\u00b9\u00ae\3\2"+
		"\2\2\u00b9\u00b4\3\2\2\2\u00ba\37\3\2\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd"+
		"\7\36\2\2\u00bd\u00be\5\4\3\2\u00be\u00bf\7\37\2\2\u00bf\u00c0\7\"\2\2"+
		"\u00c0!\3\2\2\2\r\60\66@ELc\u0083\u0089\u0090\u009e\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}