package task4.testproduction.java;
import java.util.*;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.text.ParseException;

public class Java2Lexer {
	private PushbackInputStream is;
	private int curChar;
	private int curPos;
	private Token curToken;
	private String curString;

	public Java2Lexer(PushbackInputStream is) throws ParseException, IOException {
		this.is = is;
		curPos = 0;
		nextChar();
	}

	private boolean isBlank(int c) { return c == ' ' || c == '\r' || c == '\n' || c == '\t'; }

	private void nextChar() throws ParseException, IOException {
		curPos++;
		try {
			curChar = is.read();
		} catch (IOException e) {
			throw new ParseException(e.getMessage(), curPos);
		}
	}

	public Token curToken() {
		return curToken;
	}

	public int curPos() {
		return curPos;
	}

	public String curString() {
		return curString;
	}

	public void nextToken() throws ParseException, IOException {
		curString = "";
		boolean match = false;

		if (curChar == -1) {
			curToken = Token.EOF;
			return;
		}
        if (!match && "throw".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "throw".length()) break;
                 nextChar();
            }
            if(!curString.equals("throw")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.THROW;
            }
            nextChar();
        }
        if (!match && "\'".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "\'".length()) break;
                 nextChar();
            }
            if(!curString.equals("\'")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SINGLEQUOTE;
            }
            nextChar();
        }
        if (!match && "static".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "static".length()) break;
                 nextChar();
            }
            if(!curString.equals("static")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.STATIC;
            }
            nextChar();
        }
        if (!match && "interface".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "interface".length()) break;
                 nextChar();
            }
            if(!curString.equals("interface")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.INTERFACE;
            }
            nextChar();
        }
        if (!match && "&=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "&=".length()) break;
                 nextChar();
            }
            if(!curString.equals("&=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.AND_ASSIGN;
            }
            nextChar();
        }
        if (!match && ";".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == ";".length()) break;
                 nextChar();
            }
            if(!curString.equals(";")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SEMICOLON;
            }
            nextChar();
        }
        if (!match && "break".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "break".length()) break;
                 nextChar();
            }
            if(!curString.equals("break")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.BREAK;
            }
            nextChar();
        }
        if (!match && "byte".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "byte".length()) break;
                 nextChar();
            }
            if(!curString.equals("byte")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.BYTE;
            }
            nextChar();
        }
        if (!match && "else".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "else".length()) break;
                 nextChar();
            }
            if(!curString.equals("else")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ELSE;
            }
            nextChar();
        }
        if (!match && "1".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "1".length()) break;
                 nextChar();
            }
            if(!curString.equals("1")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "2".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "2".length()) break;
                 nextChar();
            }
            if(!curString.equals("2")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "3".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "3".length()) break;
                 nextChar();
            }
            if(!curString.equals("3")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "4".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "4".length()) break;
                 nextChar();
            }
            if(!curString.equals("4")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "5".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "5".length()) break;
                 nextChar();
            }
            if(!curString.equals("5")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "6".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "6".length()) break;
                 nextChar();
            }
            if(!curString.equals("6")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "7".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "7".length()) break;
                 nextChar();
            }
            if(!curString.equals("7")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "8".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "8".length()) break;
                 nextChar();
            }
            if(!curString.equals("8")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "9".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "9".length()) break;
                 nextChar();
            }
            if(!curString.equals("9")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONZERODIGIT;
            }
            nextChar();
        }
        if (!match && "if".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "if".length()) break;
                 nextChar();
            }
            if(!curString.equals("if")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.IF;
            }
            nextChar();
        }
        if (!match && "enum".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "enum".length()) break;
                 nextChar();
            }
            if(!curString.equals("enum")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ENUM;
            }
            nextChar();
        }
        if (!match && "-".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "-".length()) break;
                 nextChar();
            }
            if(!curString.equals("-")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SUB;
            }
            nextChar();
        }
        if (!match && "!".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "!".length()) break;
                 nextChar();
            }
            if(!curString.equals("!")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.BANG;
            }
            nextChar();
        }
        if (!match && "(".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "(".length()) break;
                 nextChar();
            }
            if(!curString.equals("(")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.LPAREN;
            }
            nextChar();
        }
        if (!match && ".".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == ".".length()) break;
                 nextChar();
            }
            if(!curString.equals(".")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DOT;
            }
            nextChar();
        }
        if (!match && "case".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "case".length()) break;
                 nextChar();
            }
            if(!curString.equals("case")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.CASE;
            }
            nextChar();
        }
        if (!match && "@".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "@".length()) break;
                 nextChar();
            }
            if(!curString.equals("@")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.AT;
            }
            nextChar();
        }
        if (!match && "...".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "...".length()) break;
                 nextChar();
            }
            if(!curString.equals("...")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ELLIPSIS;
            }
            nextChar();
        }
        if (!match && "[".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "[".length()) break;
                 nextChar();
            }
            if(!curString.equals("[")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.LBRACK;
            }
            nextChar();
        }
        if (!match && "public".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "public".length()) break;
                 nextChar();
            }
            if(!curString.equals("public")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.PUBLIC;
            }
            nextChar();
        }
        if (!match && "throws".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "throws".length()) break;
                 nextChar();
            }
            if(!curString.equals("throws")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.THROWS;
            }
            nextChar();
        }
        if (!match && "{".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "{".length()) break;
                 nextChar();
            }
            if(!curString.equals("{")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.LBRACE;
            }
            nextChar();
        }
        if (!match && "goto".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "goto".length()) break;
                 nextChar();
            }
            if(!curString.equals("goto")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.GOTO;
            }
            nextChar();
        }
        if (!match && "-=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "-=".length()) break;
                 nextChar();
            }
            if(!curString.equals("-=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SUB_ASSIGN;
            }
            nextChar();
        }
        if (!match && ";".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == ";".length()) break;
                 nextChar();
            }
            if(!curString.equals(";")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SEMI;
            }
            nextChar();
        }
        if (!match && "char".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "char".length()) break;
                 nextChar();
            }
            if(!curString.equals("char")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.CHAR;
            }
            nextChar();
        }
        if (!match && "=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "=".length()) break;
                 nextChar();
            }
            if(!curString.equals("=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ASSIGN;
            }
            nextChar();
        }
        if (!match && " ".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == " ".length()) break;
                 nextChar();
            }
            if(!curString.equals(" ")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SPACE;
            }
            nextChar();
        }
        if (!match && "\n".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "\n".length()) break;
                 nextChar();
            }
            if(!curString.equals("\n")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SPACE;
            }
            nextChar();
        }
        if (!match && "\t".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "\t".length()) break;
                 nextChar();
            }
            if(!curString.equals("\t")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SPACE;
            }
            nextChar();
        }
        if (!match && "import".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "import".length()) break;
                 nextChar();
            }
            if(!curString.equals("import")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.IMPORT;
            }
            nextChar();
        }
        if (!match && "catch".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "catch".length()) break;
                 nextChar();
            }
            if(!curString.equals("catch")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.CATCH;
            }
            nextChar();
        }
        if (!match && "*=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "*=".length()) break;
                 nextChar();
            }
            if(!curString.equals("*=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.MUL_ASSIGN;
            }
            nextChar();
        }
        if (!match && "double".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "double".length()) break;
                 nextChar();
            }
            if(!curString.equals("double")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DOUBLE;
            }
            nextChar();
        }
        if (!match && "protected".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "protected".length()) break;
                 nextChar();
            }
            if(!curString.equals("protected")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.PROTECTED;
            }
            nextChar();
        }
        if (!match && "long".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "long".length()) break;
                 nextChar();
            }
            if(!curString.equals("long")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.LONG;
            }
            nextChar();
        }
        if (!match && ",".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == ",".length()) break;
                 nextChar();
            }
            if(!curString.equals(",")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.COMMA;
            }
            nextChar();
        }
        if (!match && "private".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "private".length()) break;
                 nextChar();
            }
            if(!curString.equals("private")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.PRIVATE;
            }
            nextChar();
        }
        if (!match && "continue".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "continue".length()) break;
                 nextChar();
            }
            if(!curString.equals("continue")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.CONTINUE;
            }
            nextChar();
        }
        if (!match && "/".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "/".length()) break;
                 nextChar();
            }
            if(!curString.equals("/")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIV;
            }
            nextChar();
        }
        if (!match && "String".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "String".length()) break;
                 nextChar();
            }
            if(!curString.equals("String")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.STRING;
            }
            nextChar();
        }
        if (!match && "<=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "<=".length()) break;
                 nextChar();
            }
            if(!curString.equals("<=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.LE;
            }
            nextChar();
        }
        if (!match && "volatile".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "volatile".length()) break;
                 nextChar();
            }
            if(!curString.equals("volatile")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.VOLATILE;
            }
            nextChar();
        }
        if (!match && "extends".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "extends".length()) break;
                 nextChar();
            }
            if(!curString.equals("extends")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.EXTENDS;
            }
            nextChar();
        }
        if (!match && "instanceof".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "instanceof".length()) break;
                 nextChar();
            }
            if(!curString.equals("instanceof")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.INSTANCEOF;
            }
            nextChar();
        }
        if (!match && "new".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "new".length()) break;
                 nextChar();
            }
            if(!curString.equals("new")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NEW;
            }
            nextChar();
        }
        if (!match && "+".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "+".length()) break;
                 nextChar();
            }
            if(!curString.equals("+")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ADD;
            }
            nextChar();
        }
        if (!match && "0".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "0".length()) break;
                 nextChar();
            }
            if(!curString.equals("0")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ZERO;
            }
            nextChar();
        }
        if (!match && "<".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "<".length()) break;
                 nextChar();
            }
            if(!curString.equals("<")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.LT;
            }
            nextChar();
        }
        if (!match && "class".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "class".length()) break;
                 nextChar();
            }
            if(!curString.equals("class")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.CLASS;
            }
            nextChar();
        }
        if (!match && "finally".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "finally".length()) break;
                 nextChar();
            }
            if(!curString.equals("finally")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.FINALLY;
            }
            nextChar();
        }
        if (!match && "const".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "const".length()) break;
                 nextChar();
            }
            if(!curString.equals("const")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.CONST;
            }
            nextChar();
        }
        if (!match && "package".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "package".length()) break;
                 nextChar();
            }
            if(!curString.equals("package")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.PACKAGE;
            }
            nextChar();
        }
        if (!match && "|=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "|=".length()) break;
                 nextChar();
            }
            if(!curString.equals("|=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.OR_ASSIGN;
            }
            nextChar();
        }
        if (!match && "try".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "try".length()) break;
                 nextChar();
            }
            if(!curString.equals("try")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.TRY;
            }
            nextChar();
        }
        if (!match && "synchronized".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "synchronized".length()) break;
                 nextChar();
            }
            if(!curString.equals("synchronized")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SYNCHRONIZED;
            }
            nextChar();
        }
        if (!match && "null".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "null".length()) break;
                 nextChar();
            }
            if(!curString.equals("null")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NULL;
            }
            nextChar();
        }
        if (!match && "*".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "*".length()) break;
                 nextChar();
            }
            if(!curString.equals("*")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.MUL;
            }
            nextChar();
        }
        if (!match && "for".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "for".length()) break;
                 nextChar();
            }
            if(!curString.equals("for")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.FOR;
            }
            nextChar();
        }
        if (!match && "true".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "true".length()) break;
                 nextChar();
            }
            if(!curString.equals("true")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.TRUE;
            }
            nextChar();
        }
        if (!match && "final".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "final".length()) break;
                 nextChar();
            }
            if(!curString.equals("final")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.FINAL;
            }
            nextChar();
        }
        if (!match && ")".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == ")".length()) break;
                 nextChar();
            }
            if(!curString.equals(")")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.RPAREN;
            }
            nextChar();
        }
        if (!match && "^".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "^".length()) break;
                 nextChar();
            }
            if(!curString.equals("^")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.CARET;
            }
            nextChar();
        }
        if (!match && "boolean".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "boolean".length()) break;
                 nextChar();
            }
            if(!curString.equals("boolean")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.BOOLEAN;
            }
            nextChar();
        }
        if (!match && "!=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "!=".length()) break;
                 nextChar();
            }
            if(!curString.equals("!=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NOTEQUAL;
            }
            nextChar();
        }
        if (!match && "]".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "]".length()) break;
                 nextChar();
            }
            if(!curString.equals("]")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.RBRACK;
            }
            nextChar();
        }
        if (!match && "}".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "}".length()) break;
                 nextChar();
            }
            if(!curString.equals("}")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.RBRACE;
            }
            nextChar();
        }
        if (!match && "&&".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "&&".length()) break;
                 nextChar();
            }
            if(!curString.equals("&&")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.AND;
            }
            nextChar();
        }
        if (!match && "this".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "this".length()) break;
                 nextChar();
            }
            if(!curString.equals("this")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.THIS;
            }
            nextChar();
        }
        if (!match && "switch".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "switch".length()) break;
                 nextChar();
            }
            if(!curString.equals("switch")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SWITCH;
            }
            nextChar();
        }
        if (!match && "void".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "void".length()) break;
                 nextChar();
            }
            if(!curString.equals("void")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.VOID;
            }
            nextChar();
        }
        if (!match && "transient".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "transient".length()) break;
                 nextChar();
            }
            if(!curString.equals("transient")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.TRANSIENT;
            }
            nextChar();
        }
        if (!match && "float".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "float".length()) break;
                 nextChar();
            }
            if(!curString.equals("float")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.FLOAT;
            }
            nextChar();
        }
        if (!match && "native".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "native".length()) break;
                 nextChar();
            }
            if(!curString.equals("native")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NATIVE;
            }
            nextChar();
        }
        if (!match && "/=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "/=".length()) break;
                 nextChar();
            }
            if(!curString.equals("/=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIV_ASSIGN;
            }
            nextChar();
        }
        if (!match && "abstract".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "abstract".length()) break;
                 nextChar();
            }
            if(!curString.equals("abstract")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ABSTRACT;
            }
            nextChar();
        }
        if (!match && "strictfp".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "strictfp".length()) break;
                 nextChar();
            }
            if(!curString.equals("strictfp")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.STRICTFP;
            }
            nextChar();
        }
        if (!match && "int".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "int".length()) break;
                 nextChar();
            }
            if(!curString.equals("int")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.INT;
            }
            nextChar();
        }
        if (!match && "?".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "?".length()) break;
                 nextChar();
            }
            if(!curString.equals("?")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.QUESTION;
            }
            nextChar();
        }
        if (!match && "\"".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "\"".length()) break;
                 nextChar();
            }
            if(!curString.equals("\"")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DOUBLEQUOTE;
            }
            nextChar();
        }
        if (!match && "return".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "return".length()) break;
                 nextChar();
            }
            if(!curString.equals("return")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.RETURN;
            }
            nextChar();
        }
        if (!match && "+=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "+=".length()) break;
                 nextChar();
            }
            if(!curString.equals("+=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ADD_ASSIGN;
            }
            nextChar();
        }
        if (!match && ">=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == ">=".length()) break;
                 nextChar();
            }
            if(!curString.equals(">=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.GE;
            }
            nextChar();
        }
        if (!match && "super".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "super".length()) break;
                 nextChar();
            }
            if(!curString.equals("super")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SUPER;
            }
            nextChar();
        }
        if (!match && "||".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "||".length()) break;
                 nextChar();
            }
            if(!curString.equals("||")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.OR;
            }
            nextChar();
        }
        if (!match && "%".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "%".length()) break;
                 nextChar();
            }
            if(!curString.equals("%")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.MOD;
            }
            nextChar();
        }
        if (!match && "^=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "^=".length()) break;
                 nextChar();
            }
            if(!curString.equals("^=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.XOR_ASSIGN;
            }
            nextChar();
        }
        if (!match && "assert".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "assert".length()) break;
                 nextChar();
            }
            if(!curString.equals("assert")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.ASSERT;
            }
            nextChar();
        }
        if (!match && "==".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "==".length()) break;
                 nextChar();
            }
            if(!curString.equals("==")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.EQUAL;
            }
            nextChar();
        }
        if (!match && "implements".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "implements".length()) break;
                 nextChar();
            }
            if(!curString.equals("implements")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.IMPLEMENTS;
            }
            nextChar();
        }
        if (!match && ":".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == ":".length()) break;
                 nextChar();
            }
            if(!curString.equals(":")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.COLON;
            }
            nextChar();
        }
        if (!match && ">".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == ">".length()) break;
                 nextChar();
            }
            if(!curString.equals(">")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.GT;
            }
            nextChar();
        }
        if (!match && "0".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "0".length()) break;
                 nextChar();
            }
            if(!curString.equals("0")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "1".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "1".length()) break;
                 nextChar();
            }
            if(!curString.equals("1")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "2".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "2".length()) break;
                 nextChar();
            }
            if(!curString.equals("2")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "3".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "3".length()) break;
                 nextChar();
            }
            if(!curString.equals("3")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "4".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "4".length()) break;
                 nextChar();
            }
            if(!curString.equals("4")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "5".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "5".length()) break;
                 nextChar();
            }
            if(!curString.equals("5")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "6".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "6".length()) break;
                 nextChar();
            }
            if(!curString.equals("6")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "7".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "7".length()) break;
                 nextChar();
            }
            if(!curString.equals("7")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "8".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "8".length()) break;
                 nextChar();
            }
            if(!curString.equals("8")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "9".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "9".length()) break;
                 nextChar();
            }
            if(!curString.equals("9")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DIGIT;
            }
            nextChar();
        }
        if (!match && "short".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "short".length()) break;
                 nextChar();
            }
            if(!curString.equals("short")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.SHORT;
            }
            nextChar();
        }
        if (!match && "%=".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "%=".length()) break;
                 nextChar();
            }
            if(!curString.equals("%=")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.MOD_ASSIGN;
            }
            nextChar();
        }
        if (!match && "while".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "while".length()) break;
                 nextChar();
            }
            if(!curString.equals("while")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.WHILE;
            }
            nextChar();
        }
        if (!match && "~".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "~".length()) break;
                 nextChar();
            }
            if(!curString.equals("~")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.TILDE;
            }
            nextChar();
        }
        if (!match && "false".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "false".length()) break;
                 nextChar();
            }
            if(!curString.equals("false")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.FALSE;
            }
            nextChar();
        }
        if (!match && "default".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "default".length()) break;
                 nextChar();
            }
            if(!curString.equals("default")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.DEFAULT;
            }
            nextChar();
        }
        if (!match && "a".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "a".length()) break;
                 nextChar();
            }
            if(!curString.equals("a")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "b".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "b".length()) break;
                 nextChar();
            }
            if(!curString.equals("b")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "c".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "c".length()) break;
                 nextChar();
            }
            if(!curString.equals("c")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "d".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "d".length()) break;
                 nextChar();
            }
            if(!curString.equals("d")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "e".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "e".length()) break;
                 nextChar();
            }
            if(!curString.equals("e")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "f".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "f".length()) break;
                 nextChar();
            }
            if(!curString.equals("f")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "g".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "g".length()) break;
                 nextChar();
            }
            if(!curString.equals("g")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "h".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "h".length()) break;
                 nextChar();
            }
            if(!curString.equals("h")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "i".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "i".length()) break;
                 nextChar();
            }
            if(!curString.equals("i")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "j".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "j".length()) break;
                 nextChar();
            }
            if(!curString.equals("j")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "k".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "k".length()) break;
                 nextChar();
            }
            if(!curString.equals("k")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "l".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "l".length()) break;
                 nextChar();
            }
            if(!curString.equals("l")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "m".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "m".length()) break;
                 nextChar();
            }
            if(!curString.equals("m")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "n".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "n".length()) break;
                 nextChar();
            }
            if(!curString.equals("n")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "o".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "o".length()) break;
                 nextChar();
            }
            if(!curString.equals("o")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "p".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "p".length()) break;
                 nextChar();
            }
            if(!curString.equals("p")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "q".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "q".length()) break;
                 nextChar();
            }
            if(!curString.equals("q")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "r".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "r".length()) break;
                 nextChar();
            }
            if(!curString.equals("r")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "s".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "s".length()) break;
                 nextChar();
            }
            if(!curString.equals("s")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "t".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "t".length()) break;
                 nextChar();
            }
            if(!curString.equals("t")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "u".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "u".length()) break;
                 nextChar();
            }
            if(!curString.equals("u")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "v".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "v".length()) break;
                 nextChar();
            }
            if(!curString.equals("v")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "w".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "w".length()) break;
                 nextChar();
            }
            if(!curString.equals("w")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "x".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "x".length()) break;
                 nextChar();
            }
            if(!curString.equals("x")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "y".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "y".length()) break;
                 nextChar();
            }
            if(!curString.equals("y")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "z".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "z".length()) break;
                 nextChar();
            }
            if(!curString.equals("z")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "A".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "A".length()) break;
                 nextChar();
            }
            if(!curString.equals("A")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "B".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "B".length()) break;
                 nextChar();
            }
            if(!curString.equals("B")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "C".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "C".length()) break;
                 nextChar();
            }
            if(!curString.equals("C")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "D".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "D".length()) break;
                 nextChar();
            }
            if(!curString.equals("D")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "E".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "E".length()) break;
                 nextChar();
            }
            if(!curString.equals("E")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "F".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "F".length()) break;
                 nextChar();
            }
            if(!curString.equals("F")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "G".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "G".length()) break;
                 nextChar();
            }
            if(!curString.equals("G")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "H".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "H".length()) break;
                 nextChar();
            }
            if(!curString.equals("H")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "I".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "I".length()) break;
                 nextChar();
            }
            if(!curString.equals("I")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "J".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "J".length()) break;
                 nextChar();
            }
            if(!curString.equals("J")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "K".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "K".length()) break;
                 nextChar();
            }
            if(!curString.equals("K")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "L".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "L".length()) break;
                 nextChar();
            }
            if(!curString.equals("L")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "M".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "M".length()) break;
                 nextChar();
            }
            if(!curString.equals("M")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "N".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "N".length()) break;
                 nextChar();
            }
            if(!curString.equals("N")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "O".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "O".length()) break;
                 nextChar();
            }
            if(!curString.equals("O")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "P".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "P".length()) break;
                 nextChar();
            }
            if(!curString.equals("P")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "Q".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "Q".length()) break;
                 nextChar();
            }
            if(!curString.equals("Q")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "R".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "R".length()) break;
                 nextChar();
            }
            if(!curString.equals("R")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "S".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "S".length()) break;
                 nextChar();
            }
            if(!curString.equals("S")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "T".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "T".length()) break;
                 nextChar();
            }
            if(!curString.equals("T")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "U".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "U".length()) break;
                 nextChar();
            }
            if(!curString.equals("U")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "V".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "V".length()) break;
                 nextChar();
            }
            if(!curString.equals("V")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "W".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "W".length()) break;
                 nextChar();
            }
            if(!curString.equals("W")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "X".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "X".length()) break;
                 nextChar();
            }
            if(!curString.equals("X")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "Y".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "Y".length()) break;
                 nextChar();
            }
            if(!curString.equals("Y")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "Z".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "Z".length()) break;
                 nextChar();
            }
            if(!curString.equals("Z")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "$".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "$".length()) break;
                 nextChar();
            }
            if(!curString.equals("$")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
        if (!match && "_".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "_".length()) break;
                 nextChar();
            }
            if(!curString.equals("_")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.NONDIGITIDSYMBOL;
            }
            nextChar();
        }
          if (!match) {
                throw new ParseException("Unexpected char:" + "\"" + (char)curChar + "\"", curPos);
            }
	}
}
