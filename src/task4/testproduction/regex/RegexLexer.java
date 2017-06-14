package task4.testproduction.regex;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.text.ParseException;

public class RegexLexer {
	private PushbackInputStream is;
	private int curChar;
	private int curPos;
	private Token curToken;
	private String curString;

	public RegexLexer(PushbackInputStream is) throws ParseException, IOException {
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
                curToken = Token.OP;
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
                curToken = Token.Q;
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
                curToken = Token.Q;
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
                curToken = Token.Q;
            }
            nextChar();
        }
        if (!match && "|".startsWith(String.valueOf((char) curChar))) {
            while(true) {
                 curString += (char) curChar;
                 if(curString.length() == "|".length()) break;
                 nextChar();
            }
            if(!curString.equals("|")) {
                is.unread(curString.getBytes());
                curString = "";
            } else {
                match = true;
                curToken = Token.OR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CHAR;
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
                curToken = Token.CP;
            }
            nextChar();
        }
          if (!match) {
                throw new ParseException("Unexpected char:" + "\"" + (char)curChar + "\"", curPos);
            }
	}
}
