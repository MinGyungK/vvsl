// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class vvslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, BOOL=4, PRINT=5, UNNOT=6, UNPLUS=7, UNMIN=8, DIV=9, 
		MOD=10, MUL=11, ADD=12, SUB=13, POW=14, LT=15, GT=16, LE=17, GE=18, AND=19, 
		OR=20, ASSIGNMENT=21, COMMA=22, SEMICOLONE=23, LPAREN=24, RPAREN=25, LBRACE=26, 
		RBRACE=27, LBRAKET=28, RBRAKET=29, WS=30, ID=31;
	public static final int
		RULE_p = 0, RULE_exp = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"p", "exp"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vvslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PContext extends ParserRuleContext {
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
	 
		public PContext() { }
		public void copyFrom(PContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PgrmContext extends PContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PgrmContext(PContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterPgrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitPgrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitPgrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p);
		int _la;
		try {
			_localctx = new PgrmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2164260952L) != 0) {
				{
				setState(4);
				exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_tabContext extends ExpContext {
		public TerminalNode ID() { return getToken(vvslParser.ID, 0); }
		public TerminalNode LBRAKET() { return getToken(vvslParser.LBRAKET, 0); }
		public TerminalNode RBRAKET() { return getToken(vvslParser.RBRAKET, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Exp_tabContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_tab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_tab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_tab(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_parenContext extends ExpContext {
		public TerminalNode LPAREN() { return getToken(vvslParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(vvslParser.RPAREN, 0); }
		public Exp_parenContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_bin_boolContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Exp_bin_boolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_bin_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_bin_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_bin_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_idContext extends ExpContext {
		public TerminalNode ID() { return getToken(vvslParser.ID, 0); }
		public Exp_idContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_id(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_andorContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(vvslParser.AND, 0); }
		public TerminalNode OR() { return getToken(vvslParser.OR, 0); }
		public Exp_andorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_andor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_andor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_andor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_boolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(vvslParser.BOOL, 0); }
		public Exp_boolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_ariContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(vvslParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(vvslParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(vvslParser.MOD, 0); }
		public TerminalNode POW() { return getToken(vvslParser.POW, 0); }
		public TerminalNode ADD() { return getToken(vvslParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(vvslParser.SUB, 0); }
		public Exp_ariContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_ari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_ari(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_ari(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_compContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(vvslParser.LT, 0); }
		public TerminalNode GT() { return getToken(vvslParser.GT, 0); }
		public TerminalNode LE() { return getToken(vvslParser.LE, 0); }
		public TerminalNode GE() { return getToken(vvslParser.GE, 0); }
		public Exp_compContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_comp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_un_plusContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode UNPLUS() { return getToken(vvslParser.UNPLUS, 0); }
		public Exp_un_plusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_un_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_un_plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_un_plus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_intContext extends ExpContext {
		public TerminalNode INT() { return getToken(vvslParser.INT, 0); }
		public Exp_intContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_int(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_un_notContext extends ExpContext {
		public TerminalNode UNNOT() { return getToken(vvslParser.UNNOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_un_notContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_un_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_un_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_un_not(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Exp_un_minContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode UNMIN() { return getToken(vvslParser.UNMIN, 0); }
		public Exp_un_minContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).enterExp_un_min(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vvslListener ) ((vvslListener)listener).exitExp_un_min(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vvslVisitor ) return ((vvslVisitor<? extends T>)visitor).visitExp_un_min(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new Exp_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(8);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new Exp_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new Exp_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(10);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new Exp_un_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(11);
				match(UNNOT);
				setState(12);
				exp(9);
				}
				break;
			case 5:
				{
				_localctx = new Exp_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(LPAREN);
				setState(14);
				exp(0);
				setState(15);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new Exp_tabContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(ID);
				setState(18);
				match(LBRAKET);
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2164260952L) != 0) {
					{
					{
					setState(19);
					exp(0);
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(25);
				match(RBRAKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Exp_ariContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(28);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(29);
						((Exp_ariContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0) ) {
							((Exp_ariContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(30);
						exp(7);
						}
						break;
					case 2:
						{
						_localctx = new Exp_bin_boolContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(31);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(32);
						((Exp_bin_boolContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((Exp_bin_boolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(33);
						exp(6);
						}
						break;
					case 3:
						{
						_localctx = new Exp_compContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(34);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(35);
						((Exp_compContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0) ) {
							((Exp_compContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(36);
						exp(5);
						}
						break;
					case 4:
						{
						_localctx = new Exp_andorContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(37);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(38);
						((Exp_andorContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((Exp_andorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(39);
						exp(4);
						}
						break;
					case 5:
						{
						_localctx = new Exp_un_minContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(40);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(41);
						match(UNMIN);
						}
						break;
					case 6:
						{
						_localctx = new Exp_un_plusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(42);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(43);
						match(UNPLUS);
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0003\u0000\u0006\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001\n"+
		"\u0001\f\u0001\u0018\t\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001-\b\u0001\n\u0001"+
		"\f\u00010\t\u0001\u0001\u0001\u0000\u0001\u0002\u0002\u0000\u0002\u0000"+
		"\u0004\u0001\u0000\t\u000e\u0001\u0000\u0001\u0002\u0001\u0000\u000f\u0012"+
		"\u0001\u0000\u0013\u0014<\u0000\u0005\u0001\u0000\u0000\u0000\u0002\u001a"+
		"\u0001\u0000\u0000\u0000\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004"+
		"\u0001\u0000\u0000\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001"+
		"\u0001\u0000\u0000\u0000\u0007\b\u0006\u0001\uffff\uffff\u0000\b\u001b"+
		"\u0005\u0003\u0000\u0000\t\u001b\u0005\u0004\u0000\u0000\n\u001b\u0005"+
		"\u001f\u0000\u0000\u000b\f\u0005\u0006\u0000\u0000\f\u001b\u0003\u0002"+
		"\u0001\t\r\u000e\u0005\u0018\u0000\u0000\u000e\u000f\u0003\u0002\u0001"+
		"\u0000\u000f\u0010\u0005\u0019\u0000\u0000\u0010\u001b\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0005\u001f\u0000\u0000\u0012\u0016\u0005\u001c\u0000"+
		"\u0000\u0013\u0015\u0003\u0002\u0001\u0000\u0014\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000"+
		"\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001b\u0005\u001d\u0000"+
		"\u0000\u001a\u0007\u0001\u0000\u0000\u0000\u001a\t\u0001\u0000\u0000\u0000"+
		"\u001a\n\u0001\u0000\u0000\u0000\u001a\u000b\u0001\u0000\u0000\u0000\u001a"+
		"\r\u0001\u0000\u0000\u0000\u001a\u0011\u0001\u0000\u0000\u0000\u001b."+
		"\u0001\u0000\u0000\u0000\u001c\u001d\n\u0006\u0000\u0000\u001d\u001e\u0007"+
		"\u0000\u0000\u0000\u001e-\u0003\u0002\u0001\u0007\u001f \n\u0005\u0000"+
		"\u0000 !\u0007\u0001\u0000\u0000!-\u0003\u0002\u0001\u0006\"#\n\u0004"+
		"\u0000\u0000#$\u0007\u0002\u0000\u0000$-\u0003\u0002\u0001\u0005%&\n\u0003"+
		"\u0000\u0000&\'\u0007\u0003\u0000\u0000\'-\u0003\u0002\u0001\u0004()\n"+
		"\b\u0000\u0000)-\u0005\b\u0000\u0000*+\n\u0007\u0000\u0000+-\u0005\u0007"+
		"\u0000\u0000,\u001c\u0001\u0000\u0000\u0000,\u001f\u0001\u0000\u0000\u0000"+
		",\"\u0001\u0000\u0000\u0000,%\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u0000\u0005\u0005\u0016\u001a,.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}