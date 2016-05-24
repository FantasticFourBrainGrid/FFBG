// Generated from MATLAB.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MATLABParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, BREAK=2, CASE=3, CATCH=4, CONTINUE=5, ELSE=6, ELSEIF=7, END=8, FOR=9, 
		FUNCTION=10, GLOBAL=11, IF=12, OTHERWISE=13, PERSISTENT=14, RETURNS=15, 
		SWITCH=16, TRY=17, VARARGIN=18, WHILE=19, CLEAR=20, ENDS=21, DOUBLE_EQ=22, 
		LOG_OR=23, LOG_AND=24, LSTE=25, GRTE=26, NEQ=27, EL_TIMES=28, EL_LEFTDIV=29, 
		EL_RIGHTDIV=30, EL_EXP=31, EL_CCT=32, EQ=33, BIN_OR=34, BIN_AND=35, LST=36, 
		GRT=37, COLON=38, PLUS=39, MINUS=40, NEG=41, TIMES=42, LEFTDIV=43, RIGHTDIV=44, 
		EXP=45, CCT=46, SEMI=47, LPAREN=48, RPAREN=49, LBRACE=50, RBRACE=51, LSBRACE=52, 
		RSBRACE=53, AT=54, DOT=55, COMMA=56, BLOCKCOMMENT=57, COMMENT=58, THREEDOTS=59, 
		ID=60, INT=61, FLOAT=62, STRING=63, WS=64;
	public static final String[] tokenNames = {
		"<INVALID>", "'\n'", "'break'", "'case'", "'catch'", "'continue'", "'else'", 
		"'elseif'", "'end'", "'for'", "'function'", "'global'", "'if'", "'otherwise'", 
		"'persistent'", "'return'", "'switch'", "'try'", "'varargin'", "'while'", 
		"'clear'", "ENDS", "'=='", "'||'", "'&&'", "'<='", "'>='", "'~='", "'.*'", 
		"'./'", "'.\\'", "'.^'", "'.''", "'='", "'|'", "'&'", "'<'", "'>'", "':'", 
		"'+'", "'-'", "'~'", "'*'", "'/'", "'\\'", "'^'", "'''", "';'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'@'", "'.'", "','", "BLOCKCOMMENT", 
		"COMMENT", "THREEDOTS", "ID", "INT", "FLOAT", "STRING", "WS"
	};
	public static final int
		RULE_file = 0, RULE_functionMFile = 1, RULE_f_def_line = 2, RULE_f_input = 3, 
		RULE_f_argument_list = 4, RULE_f_body = 5, RULE_scriptMFile = 6, RULE_statement = 7, 
		RULE_assignment = 8, RULE_entity_reference = 9, RULE_activity_reference = 10, 
		RULE_argument_list = 11, RULE_list_reference = 12, RULE_list = 13, RULE_command_form = 14, 
		RULE_command_args = 15, RULE_for_command = 16, RULE_if_command = 17, RULE_global_command = 18, 
		RULE_while_command = 19, RULE_return_command = 20, RULE_expr = 21;
	public static final String[] ruleNames = {
		"file", "functionMFile", "f_def_line", "f_input", "f_argument_list", "f_body", 
		"scriptMFile", "statement", "assignment", "entity_reference", "activity_reference", 
		"argument_list", "list_reference", "list", "command_form", "command_args", 
		"for_command", "if_command", "global_command", "while_command", "return_command", 
		"expr"
	};

	@Override
	public String getGrammarFileName() { return "MATLAB.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MATLABParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public ScriptMFileContext scriptMFile() {
			return getRuleContext(ScriptMFileContext.class,0);
		}
		public FunctionMFileContext functionMFile() {
			return getRuleContext(FunctionMFileContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case EOF:
			case NL:
			case FOR:
			case GLOBAL:
			case IF:
			case RETURNS:
			case WHILE:
			case PLUS:
			case MINUS:
			case NEG:
			case LPAREN:
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); scriptMFile();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); functionMFile();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionMFileContext extends ParserRuleContext {
		public F_bodyContext f_body() {
			return getRuleContext(F_bodyContext.class,0);
		}
		public F_def_lineContext f_def_line() {
			return getRuleContext(F_def_lineContext.class,0);
		}
		public FunctionMFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterFunctionMFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitFunctionMFile(this);
		}
	}

	public final FunctionMFileContext functionMFile() throws RecognitionException {
		FunctionMFileContext _localctx = new FunctionMFileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionMFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); f_def_line();
			setState(49); f_body();
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

	public static class F_def_lineContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public List_referenceContext list_reference() {
			return getRuleContext(List_referenceContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(MATLABParser.FUNCTION, 0); }
		public F_inputContext f_input() {
			return getRuleContext(F_inputContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public F_def_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_def_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterF_def_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitF_def_line(this);
		}
	}

	public final F_def_lineContext f_def_line() throws RecognitionException {
		F_def_lineContext _localctx = new F_def_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_f_def_line);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); match(FUNCTION);
				setState(52); match(ID);
				setState(53); match(EQ);
				setState(54); match(ID);
				setState(55); f_input();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(FUNCTION);
				setState(57); match(ID);
				setState(58); f_input();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); match(FUNCTION);
				setState(60); list_reference();
				setState(61); match(EQ);
				setState(62); match(ID);
				setState(63); f_input();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65); match(FUNCTION);
				setState(66); list_reference();
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

	public static class F_inputContext extends ParserRuleContext {
		public F_argument_listContext f_argument_list() {
			return getRuleContext(F_argument_listContext.class,0);
		}
		public F_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterF_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitF_input(this);
		}
	}

	public final F_inputContext f_input() throws RecognitionException {
		F_inputContext _localctx = new F_inputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_f_input);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(LPAREN);
				setState(71); match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(LPAREN);
				setState(73); f_argument_list();
				setState(74); match(RPAREN);
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

	public static class F_argument_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public F_argument_listContext f_argument_list() {
			return getRuleContext(F_argument_listContext.class,0);
		}
		public F_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterF_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitF_argument_list(this);
		}
	}

	public final F_argument_listContext f_argument_list() throws RecognitionException {
		F_argument_listContext _localctx = new F_argument_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_f_argument_list);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); match(ID);
				setState(79); match(COMMA);
				setState(80); f_argument_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); match(ID);
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

	public static class F_bodyContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(MATLABParser.NL); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NL(int i) {
			return getToken(MATLABParser.NL, i);
		}
		public F_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterF_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitF_body(this);
		}
	}

	public final F_bodyContext f_body() throws RecognitionException {
		F_bodyContext _localctx = new F_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_f_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << FOR) | (1L << GLOBAL) | (1L << IF) | (1L << RETURNS) | (1L << WHILE) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAREN) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(88);
				switch (_input.LA(1)) {
				case FOR:
				case GLOBAL:
				case IF:
				case RETURNS:
				case WHILE:
				case PLUS:
				case MINUS:
				case NEG:
				case LPAREN:
				case ID:
				case INT:
				case FLOAT:
					{
					setState(84); statement();
					setState(85);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case NL:
					{
					setState(87); match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ScriptMFileContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(MATLABParser.NL); }
		public TerminalNode EOF() { return getToken(MATLABParser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NL(int i) {
			return getToken(MATLABParser.NL, i);
		}
		public ScriptMFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptMFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterScriptMFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitScriptMFile(this);
		}
	}

	public final ScriptMFileContext scriptMFile() throws RecognitionException {
		ScriptMFileContext _localctx = new ScriptMFileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scriptMFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << FOR) | (1L << GLOBAL) | (1L << IF) | (1L << RETURNS) | (1L << WHILE) | (1L << PLUS) | (1L << MINUS) | (1L << NEG) | (1L << LPAREN) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(97);
				switch (_input.LA(1)) {
				case FOR:
				case GLOBAL:
				case IF:
				case RETURNS:
				case WHILE:
				case PLUS:
				case MINUS:
				case NEG:
				case LPAREN:
				case ID:
				case INT:
				case FLOAT:
					{
					setState(93); statement();
					setState(94);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==SEMI) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case NL:
					{
					setState(96); match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(EOF);
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
		public For_commandContext for_command() {
			return getRuleContext(For_commandContext.class,0);
		}
		public Return_commandContext return_command() {
			return getRuleContext(Return_commandContext.class,0);
		}
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Command_formContext command_form() {
			return getRuleContext(Command_formContext.class,0);
		}
		public If_commandContext if_command() {
			return getRuleContext(If_commandContext.class,0);
		}
		public Global_commandContext global_command() {
			return getRuleContext(Global_commandContext.class,0);
		}
		public While_commandContext while_command() {
			return getRuleContext(While_commandContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); command_form();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108); for_command();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109); if_command();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110); global_command();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(111); while_command();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112); return_command();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Activity_referenceContext activity_reference() {
			return getRuleContext(Activity_referenceContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Entity_referenceContext entity_reference() {
			return getRuleContext(Entity_referenceContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); entity_reference();
				setState(116); match(EQ);
				setState(117); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); activity_reference();
				setState(120); match(EQ);
				setState(121); expr(0);
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

	public static class Entity_referenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public Entity_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterEntity_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitEntity_reference(this);
		}
	}

	public final Entity_referenceContext entity_reference() throws RecognitionException {
		Entity_referenceContext _localctx = new Entity_referenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entity_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(ID);
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

	public static class Activity_referenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Activity_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activity_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterActivity_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitActivity_reference(this);
		}
	}

	public final Activity_referenceContext activity_reference() throws RecognitionException {
		Activity_referenceContext _localctx = new Activity_referenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_activity_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(ID);
			setState(128); match(LPAREN);
			setState(129); argument_list();
			setState(130); match(RPAREN);
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

	public static class Argument_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument_list);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(COLON);
				setState(135); match(COMMA);
				setState(136); argument_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137); expr(0);
				setState(138); match(COMMA);
				setState(139); argument_list();
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

	public static class List_referenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterList_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitList_reference(this);
		}
	}

	public final List_referenceContext list_reference() throws RecognitionException {
		List_referenceContext _localctx = new List_referenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list_reference);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); match(LSBRACE);
				setState(144); list();
				setState(145); match(RSBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); match(LSBRACE);
				setState(148); match(ID);
				setState(149); match(RSBRACE);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(ID);
				setState(153); match(COMMA);
				setState(154); list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(ID);
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

	public static class Command_formContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public Command_argsContext command_args() {
			return getRuleContext(Command_argsContext.class,0);
		}
		public Command_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterCommand_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitCommand_form(this);
		}
	}

	public final Command_formContext command_form() throws RecognitionException {
		Command_formContext _localctx = new Command_formContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_command_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(ID);
			setState(159); command_args();
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

	public static class Command_argsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public Command_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterCommand_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitCommand_args(this);
		}
	}

	public final Command_argsContext command_args() throws RecognitionException {
		Command_argsContext _localctx = new Command_argsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_command_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161); match(ID);
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class For_commandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MATLABParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(MATLABParser.FOR, 0); }
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public For_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterFor_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitFor_command(this);
		}
	}

	public final For_commandContext for_command() throws RecognitionException {
		For_commandContext _localctx = new For_commandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(FOR);
			setState(167); match(ID);
			setState(168); match(EQ);
			setState(169); expr(0);
			setState(170); match(END);
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

	public static class If_commandContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MATLABParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public If_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterIf_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitIf_command(this);
		}
	}

	public final If_commandContext if_command() throws RecognitionException {
		If_commandContext _localctx = new If_commandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(IF);
			setState(173); expr(0);
			setState(174); match(END);
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

	public static class Global_commandContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MATLABParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MATLABParser.ID, i);
		}
		public TerminalNode GLOBAL() { return getToken(MATLABParser.GLOBAL, 0); }
		public Global_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterGlobal_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitGlobal_command(this);
		}
	}

	public final Global_commandContext global_command() throws RecognitionException {
		Global_commandContext _localctx = new Global_commandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_global_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(GLOBAL);
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177); match(ID);
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class While_commandContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(MATLABParser.END, 0); }
		public TerminalNode WHILE() { return getToken(MATLABParser.WHILE, 0); }
		public While_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterWhile_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitWhile_command(this);
		}
	}

	public final While_commandContext while_command() throws RecognitionException {
		While_commandContext _localctx = new While_commandContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(WHILE);
			setState(183); expr(0);
			setState(184); match(END);
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

	public static class Return_commandContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(MATLABParser.RETURNS, 0); }
		public Return_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterReturn_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitReturn_command(this);
		}
	}

	public final Return_commandContext return_command() throws RecognitionException {
		Return_commandContext _localctx = new Return_commandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_return_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(RETURNS);
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

	public static class ExprContext extends ParserRuleContext {
		public Activity_referenceContext activity_reference() {
			return getRuleContext(Activity_referenceContext.class,0);
		}
		public TerminalNode RIGHTDIV() { return getToken(MATLABParser.RIGHTDIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(MATLABParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MATLABParser.FLOAT, 0); }
		public Entity_referenceContext entity_reference() {
			return getRuleContext(Entity_referenceContext.class,0);
		}
		public TerminalNode EL_RIGHTDIV() { return getToken(MATLABParser.EL_RIGHTDIV, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATLABListener ) ((MATLABListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(189); match(NEG);
				setState(190); expr(27);
				}
				break;
			case 2:
				{
				setState(191); match(PLUS);
				setState(192); expr(26);
				}
				break;
			case 3:
				{
				setState(193); match(MINUS);
				setState(194); expr(25);
				}
				break;
			case 4:
				{
				setState(195); match(LPAREN);
				setState(196); expr(0);
				setState(197); match(RPAREN);
				}
				break;
			case 5:
				{
				setState(199); entity_reference();
				}
				break;
			case 6:
				{
				setState(200); activity_reference();
				}
				break;
			case 7:
				{
				setState(201); match(INT);
				}
				break;
			case 8:
				{
				setState(202); match(FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(206); match(EL_EXP);
						setState(207); expr(30);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(209); match(EXP);
						setState(210); expr(29);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(212); match(TIMES);
						setState(213); expr(25);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(215); match(RIGHTDIV);
						setState(216); expr(24);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(218); match(LEFTDIV);
						setState(219); expr(23);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(221); match(EL_TIMES);
						setState(222); expr(22);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(224); match(EL_RIGHTDIV);
						setState(225); expr(21);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(227); match(EL_LEFTDIV);
						setState(228); expr(20);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(230); match(PLUS);
						setState(231); expr(19);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(233); match(MINUS);
						setState(234); expr(18);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(236); match(COLON);
						setState(237); expr(17);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(239); match(LST);
						setState(240); expr(16);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(242); match(LSTE);
						setState(243); expr(15);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(245); match(GRT);
						setState(246); expr(14);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(248); match(GRTE);
						setState(249); expr(13);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(251); match(EQ);
						setState(252); expr(12);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(254); match(NEQ);
						setState(255); expr(11);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(257); match(LOG_AND);
						setState(258); expr(10);
						}
						break;
					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(260); match(LOG_OR);
						setState(261); expr(9);
						}
						break;
					case 20:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(263); match(BIN_AND);
						setState(264); expr(8);
						}
						break;
					case 21:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266); match(BIN_OR);
						setState(267); expr(7);
						}
						break;
					case 22:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269); match(DOUBLE_EQ);
						setState(270); expr(6);
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 29);
		case 1: return precpred(_ctx, 28);
		case 2: return precpred(_ctx, 24);
		case 3: return precpred(_ctx, 23);
		case 4: return precpred(_ctx, 22);
		case 5: return precpred(_ctx, 21);
		case 6: return precpred(_ctx, 20);
		case 7: return precpred(_ctx, 19);
		case 8: return precpred(_ctx, 18);
		case 9: return precpred(_ctx, 17);
		case 10: return precpred(_ctx, 16);
		case 11: return precpred(_ctx, 15);
		case 12: return precpred(_ctx, 14);
		case 13: return precpred(_ctx, 13);
		case 14: return precpred(_ctx, 12);
		case 15: return precpred(_ctx, 11);
		case 16: return precpred(_ctx, 10);
		case 17: return precpred(_ctx, 9);
		case 18: return precpred(_ctx, 8);
		case 19: return precpred(_ctx, 7);
		case 20: return precpred(_ctx, 6);
		case 21: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6\5"+
		"\6U\n\6\3\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\b\3\b\3\b\3\b\7\bd\n"+
		"\b\f\b\16\bg\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0099\n\16\3\17\3\17\3\17\3\17\5\17\u009f\n\17"+
		"\3\20\3\20\3\20\3\21\6\21\u00a5\n\21\r\21\16\21\u00a6\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\6\24\u00b5\n\24\r\24\16\24"+
		"\u00b6\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ce\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0112\n\27\f\27\16\27\u0115\13"+
		"\27\3\27\2\3,\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\4"+
		"\2\3\3\61\61\u0138\2\60\3\2\2\2\4\62\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nT"+
		"\3\2\2\2\f\\\3\2\2\2\16e\3\2\2\2\20s\3\2\2\2\22}\3\2\2\2\24\177\3\2\2"+
		"\2\26\u0081\3\2\2\2\30\u008f\3\2\2\2\32\u0098\3\2\2\2\34\u009e\3\2\2\2"+
		"\36\u00a0\3\2\2\2 \u00a4\3\2\2\2\"\u00a8\3\2\2\2$\u00ae\3\2\2\2&\u00b2"+
		"\3\2\2\2(\u00b8\3\2\2\2*\u00bc\3\2\2\2,\u00cd\3\2\2\2.\61\5\16\b\2/\61"+
		"\5\4\3\2\60.\3\2\2\2\60/\3\2\2\2\61\3\3\2\2\2\62\63\5\6\4\2\63\64\5\f"+
		"\7\2\64\5\3\2\2\2\65\66\7\f\2\2\66\67\7>\2\2\678\7#\2\289\7>\2\29F\5\b"+
		"\5\2:;\7\f\2\2;<\7>\2\2<F\5\b\5\2=>\7\f\2\2>?\5\32\16\2?@\7#\2\2@A\7>"+
		"\2\2AB\5\b\5\2BF\3\2\2\2CD\7\f\2\2DF\5\32\16\2E\65\3\2\2\2E:\3\2\2\2E"+
		"=\3\2\2\2EC\3\2\2\2F\7\3\2\2\2GO\3\2\2\2HI\7\62\2\2IO\7\63\2\2JK\7\62"+
		"\2\2KL\5\n\6\2LM\7\63\2\2MO\3\2\2\2NG\3\2\2\2NH\3\2\2\2NJ\3\2\2\2O\t\3"+
		"\2\2\2PQ\7>\2\2QR\7:\2\2RU\5\n\6\2SU\7>\2\2TP\3\2\2\2TS\3\2\2\2U\13\3"+
		"\2\2\2VW\5\20\t\2WX\t\2\2\2X[\3\2\2\2Y[\7\3\2\2ZV\3\2\2\2ZY\3\2\2\2[^"+
		"\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^\\\3\2\2\2_`\5\20\t\2`a\t\2"+
		"\2\2ad\3\2\2\2bd\7\3\2\2c_\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2fh\3\2\2\2ge\3\2\2\2hi\7\2\2\3i\17\3\2\2\2jt\7>\2\2kt\5\22\n\2lt\5"+
		",\27\2mt\5\36\20\2nt\5\"\22\2ot\5$\23\2pt\5&\24\2qt\5(\25\2rt\5*\26\2"+
		"sj\3\2\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2"+
		"sq\3\2\2\2sr\3\2\2\2t\21\3\2\2\2uv\5\24\13\2vw\7#\2\2wx\5,\27\2x~\3\2"+
		"\2\2yz\5\26\f\2z{\7#\2\2{|\5,\27\2|~\3\2\2\2}u\3\2\2\2}y\3\2\2\2~\23\3"+
		"\2\2\2\177\u0080\7>\2\2\u0080\25\3\2\2\2\u0081\u0082\7>\2\2\u0082\u0083"+
		"\7\62\2\2\u0083\u0084\5\30\r\2\u0084\u0085\7\63\2\2\u0085\27\3\2\2\2\u0086"+
		"\u0090\7(\2\2\u0087\u0090\5,\27\2\u0088\u0089\7(\2\2\u0089\u008a\7:\2"+
		"\2\u008a\u0090\5\30\r\2\u008b\u008c\5,\27\2\u008c\u008d\7:\2\2\u008d\u008e"+
		"\5\30\r\2\u008e\u0090\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0087\3\2\2\2"+
		"\u008f\u0088\3\2\2\2\u008f\u008b\3\2\2\2\u0090\31\3\2\2\2\u0091\u0092"+
		"\7\66\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7\67\2\2\u0094\u0099\3\2\2"+
		"\2\u0095\u0096\7\66\2\2\u0096\u0097\7>\2\2\u0097\u0099\7\67\2\2\u0098"+
		"\u0091\3\2\2\2\u0098\u0095\3\2\2\2\u0099\33\3\2\2\2\u009a\u009b\7>\2\2"+
		"\u009b\u009c\7:\2\2\u009c\u009f\5\34\17\2\u009d\u009f\7>\2\2\u009e\u009a"+
		"\3\2\2\2\u009e\u009d\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1"+
		"\u00a2\5 \21\2\u00a2\37\3\2\2\2\u00a3\u00a5\7>\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7!\3"+
		"\2\2\2\u00a8\u00a9\7\13\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7#\2\2\u00ab"+
		"\u00ac\5,\27\2\u00ac\u00ad\7\n\2\2\u00ad#\3\2\2\2\u00ae\u00af\7\16\2\2"+
		"\u00af\u00b0\5,\27\2\u00b0\u00b1\7\n\2\2\u00b1%\3\2\2\2\u00b2\u00b4\7"+
		"\r\2\2\u00b3\u00b5\7>\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\'\3\2\2\2\u00b8\u00b9\7\25\2"+
		"\2\u00b9\u00ba\5,\27\2\u00ba\u00bb\7\n\2\2\u00bb)\3\2\2\2\u00bc\u00bd"+
		"\7\21\2\2\u00bd+\3\2\2\2\u00be\u00bf\b\27\1\2\u00bf\u00c0\7+\2\2\u00c0"+
		"\u00ce\5,\27\35\u00c1\u00c2\7)\2\2\u00c2\u00ce\5,\27\34\u00c3\u00c4\7"+
		"*\2\2\u00c4\u00ce\5,\27\33\u00c5\u00c6\7\62\2\2\u00c6\u00c7\5,\27\2\u00c7"+
		"\u00c8\7\63\2\2\u00c8\u00ce\3\2\2\2\u00c9\u00ce\5\24\13\2\u00ca\u00ce"+
		"\5\26\f\2\u00cb\u00ce\7?\2\2\u00cc\u00ce\7@\2\2\u00cd\u00be\3\2\2\2\u00cd"+
		"\u00c1\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c9\3\2"+
		"\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u0113\3\2\2\2\u00cf\u00d0\f\37\2\2\u00d0\u00d1\7!\2\2\u00d1\u0112\5,"+
		"\27 \u00d2\u00d3\f\36\2\2\u00d3\u00d4\7/\2\2\u00d4\u0112\5,\27\37\u00d5"+
		"\u00d6\f\32\2\2\u00d6\u00d7\7,\2\2\u00d7\u0112\5,\27\33\u00d8\u00d9\f"+
		"\31\2\2\u00d9\u00da\7.\2\2\u00da\u0112\5,\27\32\u00db\u00dc\f\30\2\2\u00dc"+
		"\u00dd\7-\2\2\u00dd\u0112\5,\27\31\u00de\u00df\f\27\2\2\u00df\u00e0\7"+
		"\36\2\2\u00e0\u0112\5,\27\30\u00e1\u00e2\f\26\2\2\u00e2\u00e3\7 \2\2\u00e3"+
		"\u0112\5,\27\27\u00e4\u00e5\f\25\2\2\u00e5\u00e6\7\37\2\2\u00e6\u0112"+
		"\5,\27\26\u00e7\u00e8\f\24\2\2\u00e8\u00e9\7)\2\2\u00e9\u0112\5,\27\25"+
		"\u00ea\u00eb\f\23\2\2\u00eb\u00ec\7*\2\2\u00ec\u0112\5,\27\24\u00ed\u00ee"+
		"\f\22\2\2\u00ee\u00ef\7(\2\2\u00ef\u0112\5,\27\23\u00f0\u00f1\f\21\2\2"+
		"\u00f1\u00f2\7&\2\2\u00f2\u0112\5,\27\22\u00f3\u00f4\f\20\2\2\u00f4\u00f5"+
		"\7\33\2\2\u00f5\u0112\5,\27\21\u00f6\u00f7\f\17\2\2\u00f7\u00f8\7\'\2"+
		"\2\u00f8\u0112\5,\27\20\u00f9\u00fa\f\16\2\2\u00fa\u00fb\7\34\2\2\u00fb"+
		"\u0112\5,\27\17\u00fc\u00fd\f\r\2\2\u00fd\u00fe\7#\2\2\u00fe\u0112\5,"+
		"\27\16\u00ff\u0100\f\f\2\2\u0100\u0101\7\35\2\2\u0101\u0112\5,\27\r\u0102"+
		"\u0103\f\13\2\2\u0103\u0104\7\32\2\2\u0104\u0112\5,\27\f\u0105\u0106\f"+
		"\n\2\2\u0106\u0107\7\31\2\2\u0107\u0112\5,\27\13\u0108\u0109\f\t\2\2\u0109"+
		"\u010a\7%\2\2\u010a\u0112\5,\27\n\u010b\u010c\f\b\2\2\u010c\u010d\7$\2"+
		"\2\u010d\u0112\5,\27\t\u010e\u010f\f\7\2\2\u010f\u0110\7\30\2\2\u0110"+
		"\u0112\5,\27\b\u0111\u00cf\3\2\2\2\u0111\u00d2\3\2\2\2\u0111\u00d5\3\2"+
		"\2\2\u0111\u00d8\3\2\2\2\u0111\u00db\3\2\2\2\u0111\u00de\3\2\2\2\u0111"+
		"\u00e1\3\2\2\2\u0111\u00e4\3\2\2\2\u0111\u00e7\3\2\2\2\u0111\u00ea\3\2"+
		"\2\2\u0111\u00ed\3\2\2\2\u0111\u00f0\3\2\2\2\u0111\u00f3\3\2\2\2\u0111"+
		"\u00f6\3\2\2\2\u0111\u00f9\3\2\2\2\u0111\u00fc\3\2\2\2\u0111\u00ff\3\2"+
		"\2\2\u0111\u0102\3\2\2\2\u0111\u0105\3\2\2\2\u0111\u0108\3\2\2\2\u0111"+
		"\u010b\3\2\2\2\u0111\u010e\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114-\3\2\2\2\u0115\u0113\3\2\2\2\24\60ENTZ"+
		"\\ces}\u008f\u0098\u009e\u00a6\u00b6\u00cd\u0111\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}