// Generated from /Users/alex/Developer/Swifty/src/antlr/Swifty.g4 by ANTLR 4.7.2
package com.swifty.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		VARIABLE=39, PRINT=40, EQUALS=41, NUMBER=42, BOOL=43, STRING=44, ID=45, 
		WS=46;
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_className = 2, 
		RULE_classBody = 3, RULE_field = 4, RULE_function = 5, RULE_functionDeclaration = 6, 
		RULE_parametersList = 7, RULE_functionName = 8, RULE_parameter = 9, RULE_parameterWithDefaultValue = 10, 
		RULE_type = 11, RULE_primitiveType = 12, RULE_classType = 13, RULE_block = 14, 
		RULE_statement = 15, RULE_variableDeclaration = 16, RULE_assignment = 17, 
		RULE_printStatement = 18, RULE_returnStatement = 19, RULE_ifStatement = 20, 
		RULE_forStatement = 21, RULE_forConditions = 22, RULE_name = 23, RULE_argumentList = 24, 
		RULE_argument = 25, RULE_namedArgument = 26, RULE_expression = 27, RULE_variableReference = 28, 
		RULE_value = 29, RULE_qualifiedName = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "classDeclaration", "className", "classBody", "field", 
			"function", "functionDeclaration", "parametersList", "functionName", 
			"parameter", "parameterWithDefaultValue", "type", "primitiveType", "classType", 
			"block", "statement", "variableDeclaration", "assignment", "printStatement", 
			"returnStatement", "ifStatement", "forStatement", "forConditions", "name", 
			"argumentList", "argument", "namedArgument", "expression", "variableReference", 
			"value", "qualifiedName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'('", "')'", "','", "'boolean'", "'['", 
			"']'", "'string'", "'char'", "'byte'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'void'", "'return'", "'if'", "'else'", "'for'", 
			"'in'", "'...'", "'->'", "'.'", "'super'", "'new'", "'*'", "'/'", "'+'", 
			"'-'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", null, "'print'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VARIABLE", "PRINT", "EQUALS", "NUMBER", "BOOL", "STRING", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "Swifty.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SwiftyParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			classDeclaration();
			setState(63);
			match(EOF);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(65);
				match(T__0);
				}
			}

			setState(68);
			className();
			setState(69);
			match(T__1);
			setState(70);
			classBody();
			setState(71);
			match(T__2);
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

	public static class ClassNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			qualifiedName();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					field();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(81);
				function();
				}
				}
				setState(86);
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

	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			type();
			setState(88);
			name();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			functionDeclaration();
			setState(91);
			block();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(93);
				type();
				}
				break;
			}
			setState(96);
			functionName();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(97);
				match(T__3);
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(100);
				parametersList();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(103);
				match(T__4);
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

	public static class ParametersListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<ParameterWithDefaultValueContext> parameterWithDefaultValue() {
			return getRuleContexts(ParameterWithDefaultValueContext.class);
		}
		public ParameterWithDefaultValueContext parameterWithDefaultValue(int i) {
			return getRuleContext(ParameterWithDefaultValueContext.class,i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitParametersList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitParametersList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametersList);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				parameter();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(107);
					match(T__5);
					setState(108);
					parameter();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				parameter();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(115);
					match(T__5);
					setState(116);
					parameterWithDefaultValue();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				parameterWithDefaultValue();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(123);
					match(T__5);
					setState(124);
					parameterWithDefaultValue();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SwiftyParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SwiftyParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			match(ID);
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

	public static class ParameterWithDefaultValueContext extends ParserRuleContext {
		public ExpressionContext defaultValue;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SwiftyParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(SwiftyParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterWithDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterWithDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterParameterWithDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitParameterWithDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitParameterWithDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterWithDefaultValueContext parameterWithDefaultValue() throws RecognitionException {
		ParameterWithDefaultValueContext _localctx = new ParameterWithDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterWithDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			type();
			setState(138);
			match(ID);
			setState(139);
			match(EQUALS);
			setState(140);
			((ParameterWithDefaultValueContext)_localctx).defaultValue = expression(0);
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
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				primitiveType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				classType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primitiveType);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__6);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(147);
					match(T__7);
					setState(148);
					match(T__8);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__9);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(155);
					match(T__7);
					setState(156);
					match(T__8);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__10);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(163);
					match(T__7);
					setState(164);
					match(T__8);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(T__11);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(171);
					match(T__7);
					setState(172);
					match(T__8);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(T__12);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(179);
					match(T__7);
					setState(180);
					match(T__8);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(T__13);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(187);
					match(T__7);
					setState(188);
					match(T__8);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				match(T__14);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(195);
					match(T__7);
					setState(196);
					match(T__8);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(202);
				match(T__15);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(203);
					match(T__7);
					setState(204);
					match(T__8);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				match(T__16);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(211);
					match(T__7);
					setState(212);
					match(T__8);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				match(T__17);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(219);
					match(T__7);
					setState(220);
					match(T__8);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ClassTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			qualifiedName();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(229);
				match(T__7);
				setState(230);
				match(T__8);
				}
				}
				setState(235);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__1);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << VARIABLE) | (1L << PRINT) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(237);
				statement();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(T__2);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				expression(0);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SwiftyParser.VARIABLE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(SwiftyParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(VARIABLE);
			setState(256);
			name();
			setState(257);
			match(EQUALS);
			setState(258);
			expression(0);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(SwiftyParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			name();
			setState(261);
			match(EQUALS);
			setState(262);
			expression(0);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SwiftyParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(PRINT);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(265);
				match(T__3);
				}
				break;
			}
			setState(268);
			expression(0);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(269);
				match(T__4);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnVoidContext extends ReturnStatementContext {
		public ReturnVoidContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterReturnVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitReturnVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitReturnVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnWithValueContext extends ReturnStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnWithValueContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterReturnWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitReturnWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitReturnWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__18);
				setState(273);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__18);
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

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext trueStatement;
		public StatementContext falseStatement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__19);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(278);
				match(T__3);
				}
				break;
			}
			setState(281);
			expression(0);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(282);
				match(T__4);
				}
			}

			setState(285);
			((IfStatementContext)_localctx).trueStatement = statement();
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(286);
				match(T__20);
				setState(287);
				((IfStatementContext)_localctx).falseStatement = statement();
				}
				break;
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForConditionsContext forConditions() {
			return getRuleContext(ForConditionsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__21);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(291);
				match(T__3);
				}
			}

			setState(294);
			forConditions();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(295);
				match(T__4);
				}
			}

			setState(298);
			statement();
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

	public static class ForConditionsContext extends ParserRuleContext {
		public VariableReferenceContext iterator;
		public ExpressionContext startExpr;
		public Token range;
		public ExpressionContext endExpr;
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterForConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitForConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitForConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionsContext forConditions() throws RecognitionException {
		ForConditionsContext _localctx = new ForConditionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forConditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			((ForConditionsContext)_localctx).iterator = variableReference();
			setState(301);
			match(T__22);
			setState(302);
			((ForConditionsContext)_localctx).startExpr = expression(0);
			setState(303);
			((ForConditionsContext)_localctx).range = match(T__23);
			setState(304);
			((ForConditionsContext)_localctx).endExpr = expression(0);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SwiftyParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ID);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnnamedArgumentsListContext extends ArgumentListContext {
		public ArgumentContext a;
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public UnnamedArgumentsListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterUnnamedArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitUnnamedArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitUnnamedArgumentsList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentsListContext extends ArgumentListContext {
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public NamedArgumentsListContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterNamedArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitNamedArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitNamedArgumentsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argumentList);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new UnnamedArgumentsListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__26) | (1L << T__27) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(308);
					argument();
					}
				}

				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(311);
					match(T__5);
					setState(312);
					((UnnamedArgumentsListContext)_localctx).a = argument();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new NamedArgumentsListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(318);
					namedArgument();
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(321);
					match(T__5);
					setState(322);
					namedArgument();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			expression(0);
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

	public static class NamedArgumentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			name();
			setState(333);
			match(T__24);
			setState(334);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstractContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubstractContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterSubstract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitSubstract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitSubstract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExprContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarReferenceContext extends ExpressionContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VarReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitVarReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitVarReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token cmp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SupercallContext extends ExpressionContext {
		public Token superCall;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public SupercallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterSupercall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitSupercall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitSupercall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext owner;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstructorCallContext extends ExpressionContext {
		public Token newCall;
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ConstructorCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(337);
				variableReference();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				functionName();
				setState(339);
				match(T__3);
				setState(340);
				argumentList();
				setState(341);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new SupercallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				((SupercallContext)_localctx).superCall = match(T__26);
				setState(344);
				match(T__3);
				setState(345);
				argumentList();
				setState(346);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new ConstructorCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				((ConstructorCallContext)_localctx).newCall = match(T__27);
				setState(349);
				className();
				setState(350);
				match(T__3);
				setState(351);
				argumentList();
				setState(352);
				match(T__4);
				}
				break;
			case 5:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				value();
				}
				break;
			case 6:
				{
				_localctx = new MultiplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				match(T__3);
				setState(356);
				expression(0);
				setState(357);
				match(T__28);
				setState(358);
				expression(0);
				setState(359);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new DivideContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(T__3);
				setState(362);
				expression(0);
				setState(363);
				match(T__29);
				setState(364);
				expression(0);
				setState(365);
				match(T__4);
				}
				break;
			case 8:
				{
				_localctx = new AddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(T__3);
				setState(368);
				expression(0);
				setState(369);
				match(T__30);
				setState(370);
				expression(0);
				setState(371);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new SubstractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(373);
				match(T__3);
				setState(374);
				expression(0);
				setState(375);
				match(T__31);
				setState(376);
				expression(0);
				setState(377);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(381);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(382);
						match(T__28);
						setState(383);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(385);
						match(T__29);
						setState(386);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(388);
						match(T__30);
						setState(389);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new SubstractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(390);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(391);
						match(T__31);
						setState(392);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(393);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(394);
						((ConditionalExpressionContext)_localctx).cmp = match(T__32);
						setState(395);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(396);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(397);
						((ConditionalExpressionContext)_localctx).cmp = match(T__33);
						setState(398);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(399);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(400);
						((ConditionalExpressionContext)_localctx).cmp = match(T__34);
						setState(401);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(402);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(403);
						((ConditionalExpressionContext)_localctx).cmp = match(T__35);
						setState(404);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(405);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(406);
						((ConditionalExpressionContext)_localctx).cmp = match(T__36);
						setState(407);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(408);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(409);
						((ConditionalExpressionContext)_localctx).cmp = match(T__37);
						setState(410);
						expression(2);
						}
						break;
					case 11:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						((FunctionCallContext)_localctx).owner = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(412);
						match(T__25);
						setState(413);
						functionName();
						setState(414);
						match(T__3);
						setState(415);
						argumentList();
						setState(416);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SwiftyParser.ID, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(ID);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SwiftyParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(SwiftyParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(SwiftyParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SwiftyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SwiftyParser.ID, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftyListener ) ((SwiftyListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftyVisitor ) return ((SwiftyVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(ID);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(428);
				match(T__25);
				setState(429);
				match(ID);
				}
				}
				setState(434);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\5\3E\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5O\n\5\f\5\16"+
		"\5R\13\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\5\ba"+
		"\n\b\3\b\3\b\5\be\n\b\3\b\5\bh\n\b\3\b\5\bk\n\b\3\t\3\t\3\t\7\tp\n\t\f"+
		"\t\16\ts\13\t\3\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\t\3\t\3\t\7\t\u0080"+
		"\n\t\f\t\16\t\u0083\13\t\5\t\u0085\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\5\r\u0093\n\r\3\16\3\16\3\16\7\16\u0098\n\16\f\16"+
		"\16\16\u009b\13\16\3\16\3\16\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13"+
		"\16\3\16\3\16\3\16\7\16\u00a8\n\16\f\16\16\16\u00ab\13\16\3\16\3\16\3"+
		"\16\7\16\u00b0\n\16\f\16\16\16\u00b3\13\16\3\16\3\16\3\16\7\16\u00b8\n"+
		"\16\f\16\16\16\u00bb\13\16\3\16\3\16\3\16\7\16\u00c0\n\16\f\16\16\16\u00c3"+
		"\13\16\3\16\3\16\3\16\7\16\u00c8\n\16\f\16\16\16\u00cb\13\16\3\16\3\16"+
		"\3\16\7\16\u00d0\n\16\f\16\16\16\u00d3\13\16\3\16\3\16\3\16\7\16\u00d8"+
		"\n\16\f\16\16\16\u00db\13\16\3\16\3\16\3\16\7\16\u00e0\n\16\f\16\16\16"+
		"\u00e3\13\16\5\16\u00e5\n\16\3\17\3\17\3\17\7\17\u00ea\n\17\f\17\16\17"+
		"\u00ed\13\17\3\20\3\20\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0100\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u010d\n\24\3\24\3\24\5\24"+
		"\u0111\n\24\3\25\3\25\3\25\5\25\u0116\n\25\3\26\3\26\5\26\u011a\n\26\3"+
		"\26\3\26\5\26\u011e\n\26\3\26\3\26\3\26\5\26\u0123\n\26\3\27\3\27\5\27"+
		"\u0127\n\27\3\27\3\27\5\27\u012b\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\5\32\u0138\n\32\3\32\3\32\7\32\u013c\n\32\f\32"+
		"\16\32\u013f\13\32\3\32\5\32\u0142\n\32\3\32\3\32\7\32\u0146\n\32\f\32"+
		"\16\32\u0149\13\32\5\32\u014b\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u017e\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01a5"+
		"\n\35\f\35\16\35\u01a8\13\35\3\36\3\36\3\37\3\37\3 \3 \3 \7 \u01b1\n "+
		"\f \16 \u01b4\13 \3 \2\38!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>\2\3\3\2,.\2\u01e0\2@\3\2\2\2\4D\3\2\2\2\6K\3\2\2"+
		"\2\bP\3\2\2\2\nY\3\2\2\2\f\\\3\2\2\2\16`\3\2\2\2\20\u0084\3\2\2\2\22\u0086"+
		"\3\2\2\2\24\u0088\3\2\2\2\26\u008b\3\2\2\2\30\u0092\3\2\2\2\32\u00e4\3"+
		"\2\2\2\34\u00e6\3\2\2\2\36\u00ee\3\2\2\2 \u00ff\3\2\2\2\"\u0101\3\2\2"+
		"\2$\u0106\3\2\2\2&\u010a\3\2\2\2(\u0115\3\2\2\2*\u0117\3\2\2\2,\u0124"+
		"\3\2\2\2.\u012e\3\2\2\2\60\u0134\3\2\2\2\62\u014a\3\2\2\2\64\u014c\3\2"+
		"\2\2\66\u014e\3\2\2\28\u017d\3\2\2\2:\u01a9\3\2\2\2<\u01ab\3\2\2\2>\u01ad"+
		"\3\2\2\2@A\5\4\3\2AB\7\2\2\3B\3\3\2\2\2CE\7\3\2\2DC\3\2\2\2DE\3\2\2\2"+
		"EF\3\2\2\2FG\5\6\4\2GH\7\4\2\2HI\5\b\5\2IJ\7\5\2\2J\5\3\2\2\2KL\5> \2"+
		"L\7\3\2\2\2MO\5\n\6\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QV\3\2\2"+
		"\2RP\3\2\2\2SU\5\f\7\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2"+
		"\2\2XV\3\2\2\2YZ\5\30\r\2Z[\5\60\31\2[\13\3\2\2\2\\]\5\16\b\2]^\5\36\20"+
		"\2^\r\3\2\2\2_a\5\30\r\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\5\22\n\2ce\7"+
		"\6\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5\20\t\2gf\3\2\2\2gh\3\2\2\2hj"+
		"\3\2\2\2ik\7\7\2\2ji\3\2\2\2jk\3\2\2\2k\17\3\2\2\2lq\5\24\13\2mn\7\b\2"+
		"\2np\5\24\13\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u0085\3\2\2\2"+
		"sq\3\2\2\2ty\5\24\13\2uv\7\b\2\2vx\5\26\f\2wu\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z\u0085\3\2\2\2{y\3\2\2\2|\u0081\5\26\f\2}~\7\b\2\2~\u0080"+
		"\5\26\f\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084l\3\2\2\2\u0084"+
		"t\3\2\2\2\u0084|\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087\7/\2\2\u0087\23"+
		"\3\2\2\2\u0088\u0089\5\30\r\2\u0089\u008a\7/\2\2\u008a\25\3\2\2\2\u008b"+
		"\u008c\5\30\r\2\u008c\u008d\7/\2\2\u008d\u008e\7+\2\2\u008e\u008f\58\35"+
		"\2\u008f\27\3\2\2\2\u0090\u0093\5\32\16\2\u0091\u0093\5\34\17\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\31\3\2\2\2\u0094\u0099\7\t\2"+
		"\2\u0095\u0096\7\n\2\2\u0096\u0098\7\13\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00e5\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\7\f\2\2\u009d\u009e\7\n\2\2\u009e"+
		"\u00a0\7\13\2\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00e5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a9\7\r\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a8\7\13\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00e5\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b1\7\16\2\2\u00ad\u00ae\7"+
		"\n\2\2\u00ae\u00b0\7\13\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00e5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b9\7\17\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b8\7\13\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00e5\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c1\7\20\2\2\u00bd"+
		"\u00be\7\n\2\2\u00be\u00c0\7\13\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00e5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c9\7\21\2\2\u00c5\u00c6\7\n\2\2\u00c6\u00c8\7"+
		"\13\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00e5\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d1\7\22"+
		"\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00d0\7\13\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00e5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d9\7\23\2\2\u00d5\u00d6\7\n\2\2\u00d6"+
		"\u00d8\7\13\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e5\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00e1\7\24\2\2\u00dd\u00de\7\n\2\2\u00de\u00e0\7\13\2\2\u00df\u00dd\3"+
		"\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u0094\3\2\2\2\u00e4\u009c\3\2"+
		"\2\2\u00e4\u00a4\3\2\2\2\u00e4\u00ac\3\2\2\2\u00e4\u00b4\3\2\2\2\u00e4"+
		"\u00bc\3\2\2\2\u00e4\u00c4\3\2\2\2\u00e4\u00cc\3\2\2\2\u00e4\u00d4\3\2"+
		"\2\2\u00e4\u00dc\3\2\2\2\u00e5\33\3\2\2\2\u00e6\u00eb\5> \2\u00e7\u00e8"+
		"\7\n\2\2\u00e8\u00ea\7\13\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\35\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00f2\7\4\2\2\u00ef\u00f1\5 \21\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\5\2\2\u00f6\37\3\2\2\2\u00f7\u0100"+
		"\5\36\20\2\u00f8\u0100\5\"\22\2\u00f9\u0100\5$\23\2\u00fa\u0100\5&\24"+
		"\2\u00fb\u0100\5,\27\2\u00fc\u0100\5(\25\2\u00fd\u0100\5*\26\2\u00fe\u0100"+
		"\58\35\2\u00ff\u00f7\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff"+
		"\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100!\3\2\2\2\u0101\u0102\7)\2\2\u0102\u0103"+
		"\5\60\31\2\u0103\u0104\7+\2\2\u0104\u0105\58\35\2\u0105#\3\2\2\2\u0106"+
		"\u0107\5\60\31\2\u0107\u0108\7+\2\2\u0108\u0109\58\35\2\u0109%\3\2\2\2"+
		"\u010a\u010c\7*\2\2\u010b\u010d\7\6\2\2\u010c\u010b\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\58\35\2\u010f\u0111\7\7\2\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\'\3\2\2\2\u0112\u0113\7\25\2"+
		"\2\u0113\u0116\58\35\2\u0114\u0116\7\25\2\2\u0115\u0112\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116)\3\2\2\2\u0117\u0119\7\26\2\2\u0118\u011a\7\6\2\2"+
		"\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d"+
		"\58\35\2\u011c\u011e\7\7\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0122\5 \21\2\u0120\u0121\7\27\2\2\u0121\u0123\5"+
		" \21\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123+\3\2\2\2\u0124\u0126"+
		"\7\30\2\2\u0125\u0127\7\6\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2"+
		"\u0127\u0128\3\2\2\2\u0128\u012a\5.\30\2\u0129\u012b\7\7\2\2\u012a\u0129"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5 \21\2\u012d"+
		"-\3\2\2\2\u012e\u012f\5:\36\2\u012f\u0130\7\31\2\2\u0130\u0131\58\35\2"+
		"\u0131\u0132\7\32\2\2\u0132\u0133\58\35\2\u0133/\3\2\2\2\u0134\u0135\7"+
		"/\2\2\u0135\61\3\2\2\2\u0136\u0138\5\64\33\2\u0137\u0136\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013d\3\2\2\2\u0139\u013a\7\b\2\2\u013a\u013c\5\64"+
		"\33\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u014b\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\5\66"+
		"\34\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0147\3\2\2\2\u0143"+
		"\u0144\7\b\2\2\u0144\u0146\5\66\34\2\u0145\u0143\3\2\2\2\u0146\u0149\3"+
		"\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u0137\3\2\2\2\u014a\u0141\3\2\2\2\u014b\63\3\2\2"+
		"\2\u014c\u014d\58\35\2\u014d\65\3\2\2\2\u014e\u014f\5\60\31\2\u014f\u0150"+
		"\7\33\2\2\u0150\u0151\58\35\2\u0151\67\3\2\2\2\u0152\u0153\b\35\1\2\u0153"+
		"\u017e\5:\36\2\u0154\u0155\5\22\n\2\u0155\u0156\7\6\2\2\u0156\u0157\5"+
		"\62\32\2\u0157\u0158\7\7\2\2\u0158\u017e\3\2\2\2\u0159\u015a\7\35\2\2"+
		"\u015a\u015b\7\6\2\2\u015b\u015c\5\62\32\2\u015c\u015d\7\7\2\2\u015d\u017e"+
		"\3\2\2\2\u015e\u015f\7\36\2\2\u015f\u0160\5\6\4\2\u0160\u0161\7\6\2\2"+
		"\u0161\u0162\5\62\32\2\u0162\u0163\7\7\2\2\u0163\u017e\3\2\2\2\u0164\u017e"+
		"\5<\37\2\u0165\u0166\7\6\2\2\u0166\u0167\58\35\2\u0167\u0168\7\37\2\2"+
		"\u0168\u0169\58\35\2\u0169\u016a\7\7\2\2\u016a\u017e\3\2\2\2\u016b\u016c"+
		"\7\6\2\2\u016c\u016d\58\35\2\u016d\u016e\7 \2\2\u016e\u016f\58\35\2\u016f"+
		"\u0170\7\7\2\2\u0170\u017e\3\2\2\2\u0171\u0172\7\6\2\2\u0172\u0173\58"+
		"\35\2\u0173\u0174\7!\2\2\u0174\u0175\58\35\2\u0175\u0176\7\7\2\2\u0176"+
		"\u017e\3\2\2\2\u0177\u0178\7\6\2\2\u0178\u0179\58\35\2\u0179\u017a\7\""+
		"\2\2\u017a\u017b\58\35\2\u017b\u017c\7\7\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u0152\3\2\2\2\u017d\u0154\3\2\2\2\u017d\u0159\3\2\2\2\u017d\u015e\3\2"+
		"\2\2\u017d\u0164\3\2\2\2\u017d\u0165\3\2\2\2\u017d\u016b\3\2\2\2\u017d"+
		"\u0171\3\2\2\2\u017d\u0177\3\2\2\2\u017e\u01a6\3\2\2\2\u017f\u0180\f\17"+
		"\2\2\u0180\u0181\7\37\2\2\u0181\u01a5\58\35\20\u0182\u0183\f\r\2\2\u0183"+
		"\u0184\7 \2\2\u0184\u01a5\58\35\16\u0185\u0186\f\13\2\2\u0186\u0187\7"+
		"!\2\2\u0187\u01a5\58\35\f\u0188\u0189\f\t\2\2\u0189\u018a\7\"\2\2\u018a"+
		"\u01a5\58\35\n\u018b\u018c\f\b\2\2\u018c\u018d\7#\2\2\u018d\u01a5\58\35"+
		"\t\u018e\u018f\f\7\2\2\u018f\u0190\7$\2\2\u0190\u01a5\58\35\b\u0191\u0192"+
		"\f\6\2\2\u0192\u0193\7%\2\2\u0193\u01a5\58\35\7\u0194\u0195\f\5\2\2\u0195"+
		"\u0196\7&\2\2\u0196\u01a5\58\35\6\u0197\u0198\f\4\2\2\u0198\u0199\7\'"+
		"\2\2\u0199\u01a5\58\35\5\u019a\u019b\f\3\2\2\u019b\u019c\7(\2\2\u019c"+
		"\u01a5\58\35\4\u019d\u019e\f\25\2\2\u019e\u019f\7\34\2\2\u019f\u01a0\5"+
		"\22\n\2\u01a0\u01a1\7\6\2\2\u01a1\u01a2\5\62\32\2\u01a2\u01a3\7\7\2\2"+
		"\u01a3\u01a5\3\2\2\2\u01a4\u017f\3\2\2\2\u01a4\u0182\3\2\2\2\u01a4\u0185"+
		"\3\2\2\2\u01a4\u0188\3\2\2\2\u01a4\u018b\3\2\2\2\u01a4\u018e\3\2\2\2\u01a4"+
		"\u0191\3\2\2\2\u01a4\u0194\3\2\2\2\u01a4\u0197\3\2\2\2\u01a4\u019a\3\2"+
		"\2\2\u01a4\u019d\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a79\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7/\2\2\u01aa"+
		";\3\2\2\2\u01ab\u01ac\t\2\2\2\u01ac=\3\2\2\2\u01ad\u01b2\7/\2\2\u01ae"+
		"\u01af\7\34\2\2\u01af\u01b1\7/\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3?\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2-DPV`dgjqy\u0081\u0084\u0092\u0099\u00a1\u00a9\u00b1\u00b9\u00c1"+
		"\u00c9\u00d1\u00d9\u00e1\u00e4\u00eb\u00f2\u00ff\u010c\u0110\u0115\u0119"+
		"\u011d\u0122\u0126\u012a\u0137\u013d\u0141\u0147\u014a\u017d\u01a4\u01a6"+
		"\u01b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}