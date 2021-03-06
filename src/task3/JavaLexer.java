package task3;// Generated from Java.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ABSTRACT=3, ASSERT=4, BOOLEAN=5, BREAK=6, BYTE=7, CASE=8, 
		CATCH=9, CHAR=10, CLASS=11, CONST=12, CONTINUE=13, DEFAULT=14, DO=15, 
		DOUBLE=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, FLOAT=22, 
		FOR=23, IF=24, GOTO=25, IMPLEMENTS=26, IMPORT=27, INSTANCEOF=28, INT=29, 
		INTERFACE=30, LONG=31, NATIVE=32, NEW=33, PACKAGE=34, PRIVATE=35, PROTECTED=36, 
		PUBLIC=37, RETURN=38, SHORT=39, STATIC=40, STRICTFP=41, SUPER=42, SWITCH=43, 
		SYNCHRONIZED=44, THIS=45, THROW=46, THROWS=47, TRANSIENT=48, TRY=49, VOID=50, 
		VOLATILE=51, WHILE=52, LPAREN=53, RPAREN=54, LBRACE=55, RBRACE=56, LBRACK=57, 
		RBRACK=58, SEMI=59, COMMA=60, DOT=61, ASSIGN=62, GT=63, LT=64, BANG=65, 
		TILDE=66, QUESTION=67, COLON=68, EQUAL=69, LE=70, GE=71, NOTEQUAL=72, 
		AND=73, OR=74, INC=75, DEC=76, ADD=77, SUB=78, MUL=79, DIV=80, BITAND=81, 
		BITOR=82, CARET=83, MOD=84, ADD_ASSIGN=85, SUB_ASSIGN=86, MUL_ASSIGN=87, 
		DIV_ASSIGN=88, AND_ASSIGN=89, OR_ASSIGN=90, XOR_ASSIGN=91, MOD_ASSIGN=92, 
		IntegerLiteral=93, FloatingPointLiteral=94, BooleanLiteral=95, CharacterLiteral=96, 
		StringLiteral=97, Identifier=98, AT=99, ELLIPSIS=100, COMMENT=101, LINE_COMMENT=102;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "WS", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"Identifier", "AT", "ELLIPSIS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'null'", null, "'abstract'", "'assert'", "'boolean'", "'break'", 
		"'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
		"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", 
		"'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
		"'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", 
		"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
		"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", null, null, null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
		"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"Identifier", "AT", "ELLIPSIS", "COMMENT", "LINE_COMMENT"
	};
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "task3/Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2h\u02e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\6\3\u00d6\n\3\r\3\16\3\u00d7\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3"+
		"J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3"+
		"T\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\"+
		"\3\\\3]\3]\3]\3^\3^\3^\7^\u0292\n^\f^\16^\u0295\13^\5^\u0297\n^\3_\7_"+
		"\u029a\n_\f_\16_\u029d\13_\3_\3_\6_\u02a1\n_\r_\16_\u02a2\3_\5_\u02a6"+
		"\n_\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u02b1\n`\3a\3a\3b\3b\7b\u02b7\nb\fb"+
		"\16b\u02ba\13b\3b\3b\3c\6c\u02bf\nc\rc\16c\u02c0\3c\7c\u02c4\nc\fc\16"+
		"c\u02c7\13c\3d\3d\3e\3e\3e\3e\3f\3f\3f\3f\7f\u02d3\nf\ff\16f\u02d6\13"+
		"f\3f\3f\3f\3f\3f\3g\3g\3g\3g\7g\u02e1\ng\fg\16g\u02e4\13g\3g\3g\4\u02b8"+
		"\u02d4\2h\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3"+
		"[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7"+
		"e\u00c9f\u00cbg\u00cdh\3\2\13\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\4\2f"+
		"fhh\4\2))^^\4\2$$^^\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2\f\f\17\17\u02f2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\3\u00cf\3\2\2\2\5\u00d5\3\2\2\2\7\u00db\3\2\2\2\t\u00e4\3\2\2"+
		"\2\13\u00eb\3\2\2\2\r\u00f3\3\2\2\2\17\u00f9\3\2\2\2\21\u00fe\3\2\2\2"+
		"\23\u0103\3\2\2\2\25\u0109\3\2\2\2\27\u010e\3\2\2\2\31\u0114\3\2\2\2\33"+
		"\u011a\3\2\2\2\35\u0123\3\2\2\2\37\u012b\3\2\2\2!\u012e\3\2\2\2#\u0135"+
		"\3\2\2\2%\u013a\3\2\2\2\'\u013f\3\2\2\2)\u0147\3\2\2\2+\u014d\3\2\2\2"+
		"-\u0155\3\2\2\2/\u015b\3\2\2\2\61\u015f\3\2\2\2\63\u0162\3\2\2\2\65\u0167"+
		"\3\2\2\2\67\u0172\3\2\2\29\u0179\3\2\2\2;\u0184\3\2\2\2=\u0188\3\2\2\2"+
		"?\u0192\3\2\2\2A\u0197\3\2\2\2C\u019e\3\2\2\2E\u01a2\3\2\2\2G\u01aa\3"+
		"\2\2\2I\u01b2\3\2\2\2K\u01bc\3\2\2\2M\u01c3\3\2\2\2O\u01ca\3\2\2\2Q\u01d0"+
		"\3\2\2\2S\u01d7\3\2\2\2U\u01e0\3\2\2\2W\u01e6\3\2\2\2Y\u01ed\3\2\2\2["+
		"\u01fa\3\2\2\2]\u01ff\3\2\2\2_\u0205\3\2\2\2a\u020c\3\2\2\2c\u0216\3\2"+
		"\2\2e\u021a\3\2\2\2g\u021f\3\2\2\2i\u0228\3\2\2\2k\u022e\3\2\2\2m\u0230"+
		"\3\2\2\2o\u0232\3\2\2\2q\u0234\3\2\2\2s\u0236\3\2\2\2u\u0238\3\2\2\2w"+
		"\u023a\3\2\2\2y\u023c\3\2\2\2{\u023e\3\2\2\2}\u0240\3\2\2\2\177\u0242"+
		"\3\2\2\2\u0081\u0244\3\2\2\2\u0083\u0246\3\2\2\2\u0085\u0248\3\2\2\2\u0087"+
		"\u024a\3\2\2\2\u0089\u024c\3\2\2\2\u008b\u024e\3\2\2\2\u008d\u0251\3\2"+
		"\2\2\u008f\u0254\3\2\2\2\u0091\u0257\3\2\2\2\u0093\u025a\3\2\2\2\u0095"+
		"\u025d\3\2\2\2\u0097\u0260\3\2\2\2\u0099\u0263\3\2\2\2\u009b\u0266\3\2"+
		"\2\2\u009d\u0268\3\2\2\2\u009f\u026a\3\2\2\2\u00a1\u026c\3\2\2\2\u00a3"+
		"\u026e\3\2\2\2\u00a5\u0270\3\2\2\2\u00a7\u0272\3\2\2\2\u00a9\u0274\3\2"+
		"\2\2\u00ab\u0276\3\2\2\2\u00ad\u0279\3\2\2\2\u00af\u027c\3\2\2\2\u00b1"+
		"\u027f\3\2\2\2\u00b3\u0282\3\2\2\2\u00b5\u0285\3\2\2\2\u00b7\u0288\3\2"+
		"\2\2\u00b9\u028b\3\2\2\2\u00bb\u0296\3\2\2\2\u00bd\u029b\3\2\2\2\u00bf"+
		"\u02b0\3\2\2\2\u00c1\u02b2\3\2\2\2\u00c3\u02b4\3\2\2\2\u00c5\u02be\3\2"+
		"\2\2\u00c7\u02c8\3\2\2\2\u00c9\u02ca\3\2\2\2\u00cb\u02ce\3\2\2\2\u00cd"+
		"\u02dc\3\2\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7n\2"+
		"\2\u00d2\u00d3\7n\2\2\u00d3\4\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\b\3\2\2\u00da\6\3\2\2\2\u00db\u00dc\7c\2\2"+
		"\u00dc\u00dd\7d\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		"\b\3\2\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7v\2\2\u00ea\n\3\2\2\2\u00eb"+
		"\u00ec\7d\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7n\2\2"+
		"\u00ef\u00f0\7g\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7p\2\2\u00f2\f\3\2"+
		"\2\2\u00f3\u00f4\7d\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7"+
		"\7c\2\2\u00f7\u00f8\7m\2\2\u00f8\16\3\2\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb"+
		"\7{\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7g\2\2\u00fd\20\3\2\2\2\u00fe\u00ff"+
		"\7e\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7u\2\2\u0101\u0102\7g\2\2\u0102"+
		"\22\3\2\2\2\u0103\u0104\7e\2\2\u0104\u0105\7c\2\2\u0105\u0106\7v\2\2\u0106"+
		"\u0107\7e\2\2\u0107\u0108\7j\2\2\u0108\24\3\2\2\2\u0109\u010a\7e\2\2\u010a"+
		"\u010b\7j\2\2\u010b\u010c\7c\2\2\u010c\u010d\7t\2\2\u010d\26\3\2\2\2\u010e"+
		"\u010f\7e\2\2\u010f\u0110\7n\2\2\u0110\u0111\7c\2\2\u0111\u0112\7u\2\2"+
		"\u0112\u0113\7u\2\2\u0113\30\3\2\2\2\u0114\u0115\7e\2\2\u0115\u0116\7"+
		"q\2\2\u0116\u0117\7p\2\2\u0117\u0118\7u\2\2\u0118\u0119\7v\2\2\u0119\32"+
		"\3\2\2\2\u011a\u011b\7e\2\2\u011b\u011c\7q\2\2\u011c\u011d\7p\2\2\u011d"+
		"\u011e\7v\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120\u0121\7w\2\2"+
		"\u0121\u0122\7g\2\2\u0122\34\3\2\2\2\u0123\u0124\7f\2\2\u0124\u0125\7"+
		"g\2\2\u0125\u0126\7h\2\2\u0126\u0127\7c\2\2\u0127\u0128\7w\2\2\u0128\u0129"+
		"\7n\2\2\u0129\u012a\7v\2\2\u012a\36\3\2\2\2\u012b\u012c\7f\2\2\u012c\u012d"+
		"\7q\2\2\u012d \3\2\2\2\u012e\u012f\7f\2\2\u012f\u0130\7q\2\2\u0130\u0131"+
		"\7w\2\2\u0131\u0132\7d\2\2\u0132\u0133\7n\2\2\u0133\u0134\7g\2\2\u0134"+
		"\"\3\2\2\2\u0135\u0136\7g\2\2\u0136\u0137\7n\2\2\u0137\u0138\7u\2\2\u0138"+
		"\u0139\7g\2\2\u0139$\3\2\2\2\u013a\u013b\7g\2\2\u013b\u013c\7p\2\2\u013c"+
		"\u013d\7w\2\2\u013d\u013e\7o\2\2\u013e&\3\2\2\2\u013f\u0140\7g\2\2\u0140"+
		"\u0141\7z\2\2\u0141\u0142\7v\2\2\u0142\u0143\7g\2\2\u0143\u0144\7p\2\2"+
		"\u0144\u0145\7f\2\2\u0145\u0146\7u\2\2\u0146(\3\2\2\2\u0147\u0148\7h\2"+
		"\2\u0148\u0149\7k\2\2\u0149\u014a\7p\2\2\u014a\u014b\7c\2\2\u014b\u014c"+
		"\7n\2\2\u014c*\3\2\2\2\u014d\u014e\7h\2\2\u014e\u014f\7k\2\2\u014f\u0150"+
		"\7p\2\2\u0150\u0151\7c\2\2\u0151\u0152\7n\2\2\u0152\u0153\7n\2\2\u0153"+
		"\u0154\7{\2\2\u0154,\3\2\2\2\u0155\u0156\7h\2\2\u0156\u0157\7n\2\2\u0157"+
		"\u0158\7q\2\2\u0158\u0159\7c\2\2\u0159\u015a\7v\2\2\u015a.\3\2\2\2\u015b"+
		"\u015c\7h\2\2\u015c\u015d\7q\2\2\u015d\u015e\7t\2\2\u015e\60\3\2\2\2\u015f"+
		"\u0160\7k\2\2\u0160\u0161\7h\2\2\u0161\62\3\2\2\2\u0162\u0163\7i\2\2\u0163"+
		"\u0164\7q\2\2\u0164\u0165\7v\2\2\u0165\u0166\7q\2\2\u0166\64\3\2\2\2\u0167"+
		"\u0168\7k\2\2\u0168\u0169\7o\2\2\u0169\u016a\7r\2\2\u016a\u016b\7n\2\2"+
		"\u016b\u016c\7g\2\2\u016c\u016d\7o\2\2\u016d\u016e\7g\2\2\u016e\u016f"+
		"\7p\2\2\u016f\u0170\7v\2\2\u0170\u0171\7u\2\2\u0171\66\3\2\2\2\u0172\u0173"+
		"\7k\2\2\u0173\u0174\7o\2\2\u0174\u0175\7r\2\2\u0175\u0176\7q\2\2\u0176"+
		"\u0177\7t\2\2\u0177\u0178\7v\2\2\u01788\3\2\2\2\u0179\u017a\7k\2\2\u017a"+
		"\u017b\7p\2\2\u017b\u017c\7u\2\2\u017c\u017d\7v\2\2\u017d\u017e\7c\2\2"+
		"\u017e\u017f\7p\2\2\u017f\u0180\7e\2\2\u0180\u0181\7g\2\2\u0181\u0182"+
		"\7q\2\2\u0182\u0183\7h\2\2\u0183:\3\2\2\2\u0184\u0185\7k\2\2\u0185\u0186"+
		"\7p\2\2\u0186\u0187\7v\2\2\u0187<\3\2\2\2\u0188\u0189\7k\2\2\u0189\u018a"+
		"\7p\2\2\u018a\u018b\7v\2\2\u018b\u018c\7g\2\2\u018c\u018d\7t\2\2\u018d"+
		"\u018e\7h\2\2\u018e\u018f\7c\2\2\u018f\u0190\7e\2\2\u0190\u0191\7g\2\2"+
		"\u0191>\3\2\2\2\u0192\u0193\7n\2\2\u0193\u0194\7q\2\2\u0194\u0195\7p\2"+
		"\2\u0195\u0196\7i\2\2\u0196@\3\2\2\2\u0197\u0198\7p\2\2\u0198\u0199\7"+
		"c\2\2\u0199\u019a\7v\2\2\u019a\u019b\7k\2\2\u019b\u019c\7x\2\2\u019c\u019d"+
		"\7g\2\2\u019dB\3\2\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1"+
		"\7y\2\2\u01a1D\3\2\2\2\u01a2\u01a3\7r\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5"+
		"\7e\2\2\u01a5\u01a6\7m\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7i\2\2\u01a8"+
		"\u01a9\7g\2\2\u01a9F\3\2\2\2\u01aa\u01ab\7r\2\2\u01ab\u01ac\7t\2\2\u01ac"+
		"\u01ad\7k\2\2\u01ad\u01ae\7x\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7v\2\2"+
		"\u01b0\u01b1\7g\2\2\u01b1H\3\2\2\2\u01b2\u01b3\7r\2\2\u01b3\u01b4\7t\2"+
		"\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8"+
		"\7e\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7f\2\2\u01bb"+
		"J\3\2\2\2\u01bc\u01bd\7r\2\2\u01bd\u01be\7w\2\2\u01be\u01bf\7d\2\2\u01bf"+
		"\u01c0\7n\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7e\2\2\u01c2L\3\2\2\2\u01c3"+
		"\u01c4\7t\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7w\2\2"+
		"\u01c7\u01c8\7t\2\2\u01c8\u01c9\7p\2\2\u01c9N\3\2\2\2\u01ca\u01cb\7u\2"+
		"\2\u01cb\u01cc\7j\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf"+
		"\7v\2\2\u01cfP\3\2\2\2\u01d0\u01d1\7u\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3"+
		"\7c\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7e\2\2\u01d6"+
		"R\3\2\2\2\u01d7\u01d8\7u\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da\7t\2\2\u01da"+
		"\u01db\7k\2\2\u01db\u01dc\7e\2\2\u01dc\u01dd\7v\2\2\u01dd\u01de\7h\2\2"+
		"\u01de\u01df\7r\2\2\u01dfT\3\2\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7w\2"+
		"\2\u01e2\u01e3\7r\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7t\2\2\u01e5V\3\2"+
		"\2\2\u01e6\u01e7\7u\2\2\u01e7\u01e8\7y\2\2\u01e8\u01e9\7k\2\2\u01e9\u01ea"+
		"\7v\2\2\u01ea\u01eb\7e\2\2\u01eb\u01ec\7j\2\2\u01ecX\3\2\2\2\u01ed\u01ee"+
		"\7u\2\2\u01ee\u01ef\7{\2\2\u01ef\u01f0\7p\2\2\u01f0\u01f1\7e\2\2\u01f1"+
		"\u01f2\7j\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7q\2\2\u01f4\u01f5\7p\2\2"+
		"\u01f5\u01f6\7k\2\2\u01f6\u01f7\7|\2\2\u01f7\u01f8\7g\2\2\u01f8\u01f9"+
		"\7f\2\2\u01f9Z\3\2\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7j\2\2\u01fc\u01fd"+
		"\7k\2\2\u01fd\u01fe\7u\2\2\u01fe\\\3\2\2\2\u01ff\u0200\7v\2\2\u0200\u0201"+
		"\7j\2\2\u0201\u0202\7t\2\2\u0202\u0203\7q\2\2\u0203\u0204\7y\2\2\u0204"+
		"^\3\2\2\2\u0205\u0206\7v\2\2\u0206\u0207\7j\2\2\u0207\u0208\7t\2\2\u0208"+
		"\u0209\7q\2\2\u0209\u020a\7y\2\2\u020a\u020b\7u\2\2\u020b`\3\2\2\2\u020c"+
		"\u020d\7v\2\2\u020d\u020e\7t\2\2\u020e\u020f\7c\2\2\u020f\u0210\7p\2\2"+
		"\u0210\u0211\7u\2\2\u0211\u0212\7k\2\2\u0212\u0213\7g\2\2\u0213\u0214"+
		"\7p\2\2\u0214\u0215\7v\2\2\u0215b\3\2\2\2\u0216\u0217\7v\2\2\u0217\u0218"+
		"\7t\2\2\u0218\u0219\7{\2\2\u0219d\3\2\2\2\u021a\u021b\7x\2\2\u021b\u021c"+
		"\7q\2\2\u021c\u021d\7k\2\2\u021d\u021e\7f\2\2\u021ef\3\2\2\2\u021f\u0220"+
		"\7x\2\2\u0220\u0221\7q\2\2\u0221\u0222\7n\2\2\u0222\u0223\7c\2\2\u0223"+
		"\u0224\7v\2\2\u0224\u0225\7k\2\2\u0225\u0226\7n\2\2\u0226\u0227\7g\2\2"+
		"\u0227h\3\2\2\2\u0228\u0229\7y\2\2\u0229\u022a\7j\2\2\u022a\u022b\7k\2"+
		"\2\u022b\u022c\7n\2\2\u022c\u022d\7g\2\2\u022dj\3\2\2\2\u022e\u022f\7"+
		"*\2\2\u022fl\3\2\2\2\u0230\u0231\7+\2\2\u0231n\3\2\2\2\u0232\u0233\7}"+
		"\2\2\u0233p\3\2\2\2\u0234\u0235\7\177\2\2\u0235r\3\2\2\2\u0236\u0237\7"+
		"]\2\2\u0237t\3\2\2\2\u0238\u0239\7_\2\2\u0239v\3\2\2\2\u023a\u023b\7="+
		"\2\2\u023bx\3\2\2\2\u023c\u023d\7.\2\2\u023dz\3\2\2\2\u023e\u023f\7\60"+
		"\2\2\u023f|\3\2\2\2\u0240\u0241\7?\2\2\u0241~\3\2\2\2\u0242\u0243\7@\2"+
		"\2\u0243\u0080\3\2\2\2\u0244\u0245\7>\2\2\u0245\u0082\3\2\2\2\u0246\u0247"+
		"\7#\2\2\u0247\u0084\3\2\2\2\u0248\u0249\7\u0080\2\2\u0249\u0086\3\2\2"+
		"\2\u024a\u024b\7A\2\2\u024b\u0088\3\2\2\2\u024c\u024d\7<\2\2\u024d\u008a"+
		"\3\2\2\2\u024e\u024f\7?\2\2\u024f\u0250\7?\2\2\u0250\u008c\3\2\2\2\u0251"+
		"\u0252\7>\2\2\u0252\u0253\7?\2\2\u0253\u008e\3\2\2\2\u0254\u0255\7@\2"+
		"\2\u0255\u0256\7?\2\2\u0256\u0090\3\2\2\2\u0257\u0258\7#\2\2\u0258\u0259"+
		"\7?\2\2\u0259\u0092\3\2\2\2\u025a\u025b\7(\2\2\u025b\u025c\7(\2\2\u025c"+
		"\u0094\3\2\2\2\u025d\u025e\7~\2\2\u025e\u025f\7~\2\2\u025f\u0096\3\2\2"+
		"\2\u0260\u0261\7-\2\2\u0261\u0262\7-\2\2\u0262\u0098\3\2\2\2\u0263\u0264"+
		"\7/\2\2\u0264\u0265\7/\2\2\u0265\u009a\3\2\2\2\u0266\u0267\7-\2\2\u0267"+
		"\u009c\3\2\2\2\u0268\u0269\7/\2\2\u0269\u009e\3\2\2\2\u026a\u026b\7,\2"+
		"\2\u026b\u00a0\3\2\2\2\u026c\u026d\7\61\2\2\u026d\u00a2\3\2\2\2\u026e"+
		"\u026f\7(\2\2\u026f\u00a4\3\2\2\2\u0270\u0271\7~\2\2\u0271\u00a6\3\2\2"+
		"\2\u0272\u0273\7`\2\2\u0273\u00a8\3\2\2\2\u0274\u0275\7\'\2\2\u0275\u00aa"+
		"\3\2\2\2\u0276\u0277\7-\2\2\u0277\u0278\7?\2\2\u0278\u00ac\3\2\2\2\u0279"+
		"\u027a\7/\2\2\u027a\u027b\7?\2\2\u027b\u00ae\3\2\2\2\u027c\u027d\7,\2"+
		"\2\u027d\u027e\7?\2\2\u027e\u00b0\3\2\2\2\u027f\u0280\7\61\2\2\u0280\u0281"+
		"\7?\2\2\u0281\u00b2\3\2\2\2\u0282\u0283\7(\2\2\u0283\u0284\7?\2\2\u0284"+
		"\u00b4\3\2\2\2\u0285\u0286\7~\2\2\u0286\u0287\7?\2\2\u0287\u00b6\3\2\2"+
		"\2\u0288\u0289\7`\2\2\u0289\u028a\7?\2\2\u028a\u00b8\3\2\2\2\u028b\u028c"+
		"\7\'\2\2\u028c\u028d\7?\2\2\u028d\u00ba\3\2\2\2\u028e\u0297\7\62\2\2\u028f"+
		"\u0293\t\3\2\2\u0290\u0292\t\4\2\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0296\u028e\3\2\2\2\u0296\u028f\3\2\2\2\u0297\u00bc\3\2"+
		"\2\2\u0298\u029a\t\4\2\2\u0299\u0298\3\2\2\2\u029a\u029d\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2"+
		"\2\2\u029e\u02a0\7\60\2\2\u029f\u02a1\t\4\2\2\u02a0\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2"+
		"\2\2\u02a4\u02a6\t\5\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u00be\3\2\2\2\u02a7\u02a8\7v\2\2\u02a8\u02a9\7t\2\2\u02a9\u02aa\7w\2"+
		"\2\u02aa\u02b1\7g\2\2\u02ab\u02ac\7h\2\2\u02ac\u02ad\7c\2\2\u02ad\u02ae"+
		"\7n\2\2\u02ae\u02af\7u\2\2\u02af\u02b1\7g\2\2\u02b0\u02a7\3\2\2\2\u02b0"+
		"\u02ab\3\2\2\2\u02b1\u00c0\3\2\2\2\u02b2\u02b3\n\6\2\2\u02b3\u00c2\3\2"+
		"\2\2\u02b4\u02b8\7$\2\2\u02b5\u02b7\n\7\2\2\u02b6\u02b5\3\2\2\2\u02b7"+
		"\u02ba\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bb\3\2"+
		"\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\7$\2\2\u02bc\u00c4\3\2\2\2\u02bd"+
		"\u02bf\t\b\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c5\3\2\2\2\u02c2\u02c4\t\t\2\2\u02c3"+
		"\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u00c6\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7B\2\2\u02c9"+
		"\u00c8\3\2\2\2\u02ca\u02cb\7\60\2\2\u02cb\u02cc\7\60\2\2\u02cc\u02cd\7"+
		"\60\2\2\u02cd\u00ca\3\2\2\2\u02ce\u02cf\7\61\2\2\u02cf\u02d0\7,\2\2\u02d0"+
		"\u02d4\3\2\2\2\u02d1\u02d3\13\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u02d6\3"+
		"\2\2\2\u02d4\u02d5\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02d4\3\2\2\2\u02d7\u02d8\7,\2\2\u02d8\u02d9\7\61\2\2\u02d9\u02da\3\2"+
		"\2\2\u02da\u02db\bf\3\2\u02db\u00cc\3\2\2\2\u02dc\u02dd\7\61\2\2\u02dd"+
		"\u02de\7\61\2\2\u02de\u02e2\3\2\2\2\u02df\u02e1\n\n\2\2\u02e0\u02df\3"+
		"\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\bg\3\2\u02e6\u00ce\3\2"+
		"\2\2\17\2\u00d7\u0293\u0296\u029b\u02a2\u02a5\u02b0\u02b8\u02c0\u02c5"+
		"\u02d4\u02e2\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}