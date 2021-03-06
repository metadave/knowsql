// Generated from ./src/main/java/com/metadave/knowsql/parser/KnowSQL.g4 by ANTLR 4.0
package com.metadave.knowsql.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnowSQLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, BETWEEN=4, AND=5, AT=6, SPLAT=7, COMMA=8, LPAREN=9, 
		RPAREN=10, EQUALS=11, SEMI=12, TRUE=13, FALSE=14, ID=15, INT=16, STRING=17, 
		LINE_COMMENT=18, COMMENT=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'select'", "'from'", "'where'", "'between'", "'and'", "'@'", "'*'", "','", 
		"'('", "')'", "'='", "';'", "'true'", "'false'", "ID", "INT", "STRING", 
		"LINE_COMMENT", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "BETWEEN", "AND", "AT", "SPLAT", "COMMA", "LPAREN", 
		"RPAREN", "EQUALS", "SEMI", "TRUE", "FALSE", "ID", "INT", "STRING", "ESC", 
		"LINE_COMMENT", "COMMENT", "WS"
	};


	public KnowSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KnowSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 18: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 19: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\26\u00a3\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\6\20f\n\20\r\20\16\20g\3\21\6\21k\n\21\r\21"+
		"\16\21l\3\22\3\22\3\22\7\22r\n\22\f\22\16\22u\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23}\n\23\3\24\3\24\3\24\3\24\7\24\u0083\n\24\f\24\16\24\u0086"+
		"\13\24\3\24\5\24\u0089\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7"+
		"\25\u0093\n\25\f\25\16\25\u0096\13\25\3\25\3\25\3\25\3\25\3\25\3\26\6"+
		"\26\u009e\n\26\r\26\16\26\u009f\3\26\3\26\5s\u0084\u0094\27\3\3\1\5\4"+
		"\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\2\1\'\24\2)\25\3+\26\4\3\2\5\5"+
		"C\\aac|\3\62;\5\13\f\17\17\"\"\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\3-\3\2\2\2\5\64\3\2\2\2\79\3\2\2\2\t?\3\2\2\2\13G\3\2\2\2\rK\3\2"+
		"\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3"+
		"\2\2\2\33Y\3\2\2\2\35^\3\2\2\2\37e\3\2\2\2!j\3\2\2\2#n\3\2\2\2%|\3\2\2"+
		"\2\'~\3\2\2\2)\u008e\3\2\2\2+\u009d\3\2\2\2-.\7u\2\2./\7g\2\2/\60\7n\2"+
		"\2\60\61\7g\2\2\61\62\7e\2\2\62\63\7v\2\2\63\4\3\2\2\2\64\65\7h\2\2\65"+
		"\66\7t\2\2\66\67\7q\2\2\678\7o\2\28\6\3\2\2\29:\7y\2\2:;\7j\2\2;<\7g\2"+
		"\2<=\7t\2\2=>\7g\2\2>\b\3\2\2\2?@\7d\2\2@A\7g\2\2AB\7v\2\2BC\7y\2\2CD"+
		"\7g\2\2DE\7g\2\2EF\7p\2\2F\n\3\2\2\2GH\7c\2\2HI\7p\2\2IJ\7f\2\2J\f\3\2"+
		"\2\2KL\7B\2\2L\16\3\2\2\2MN\7,\2\2N\20\3\2\2\2OP\7.\2\2P\22\3\2\2\2QR"+
		"\7*\2\2R\24\3\2\2\2ST\7+\2\2T\26\3\2\2\2UV\7?\2\2V\30\3\2\2\2WX\7=\2\2"+
		"X\32\3\2\2\2YZ\7v\2\2Z[\7t\2\2[\\\7w\2\2\\]\7g\2\2]\34\3\2\2\2^_\7h\2"+
		"\2_`\7c\2\2`a\7n\2\2ab\7u\2\2bc\7g\2\2c\36\3\2\2\2df\t\2\2\2ed\3\2\2\2"+
		"fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h \3\2\2\2ik\t\3\2\2ji\3\2\2\2kl\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2m\"\3\2\2\2ns\7$\2\2or\5%\23\2pr\13\2\2\2qo\3\2\2"+
		"\2qp\3\2\2\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7$\2"+
		"\2w$\3\2\2\2xy\7^\2\2y}\7$\2\2z{\7^\2\2{}\7^\2\2|x\3\2\2\2|z\3\2\2\2}"+
		"&\3\2\2\2~\177\7\61\2\2\177\u0080\7\61\2\2\u0080\u0084\3\2\2\2\u0081\u0083"+
		"\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089"+
		"\7\17\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008b\7\f\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\24\2\2\u008d(\3"+
		"\2\2\2\u008e\u008f\7\61\2\2\u008f\u0090\7,\2\2\u0090\u0094\3\2\2\2\u0091"+
		"\u0093\13\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7,\2\2\u0098\u0099\7\61\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\25"+
		"\3\2\u009b*\3\2\2\2\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\b\26\4\2\u00a2,\3\2\2\2\f\2glqs|\u0084\u0088\u0094\u009f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}