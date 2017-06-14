package task4.testproduction.regex;

import java.io.PushbackInputStream;
import java.text.ParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import task4.utils.Tree;


public class RegexParser {


private RegexLexer lex;

	

	public Tree parse(PushbackInputStream is, String name) throws ParseException, IOException {
		lex = new RegexLexer(is);
		lex.nextToken();
		return regexp(name);
	}

	private Tree regexp(String name) throws ParseException, IOException {
		switch (lex.curToken()) {
			case OP: {
				List<Tree> r = new ArrayList<>();
				r.add(r());
				return new Tree("RegExp \"" + name + "\"", r.get(0));
            }
			case CHAR: {
				List<Tree> r = new ArrayList<>();
				r.add(r());
				return new Tree("RegExp \"" + name + "\"", r.get(0));
            }
            default:
                throw new AssertionError();
        }
    }

	private Tree r() throws ParseException, IOException {
		switch (lex.curToken()) {
			case OP: {
				List<String> OP = new ArrayList<>();
				List<Tree> r = new ArrayList<>();
				List<String> CP = new ArrayList<>();
				List<Tree> rPrime = new ArrayList<>();
				if (lex.curToken().toString().equals("OP")) {
					OP.add(lex.curString());
				} else {
					throw new AssertionError("OP expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				r.add(r());
				if (lex.curToken().toString().equals("CP")) {
					CP.add(lex.curString());
				} else {
					throw new AssertionError("CP expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				rPrime.add(rPrime());
				return new Tree("R", new Tree(OP.get(0)), r.get(0), new Tree(CP.get(0)), rPrime.get(0));
            }
			case CHAR: {
				List<String> CHAR = new ArrayList<>();
				List<Tree> rPrime = new ArrayList<>();
				if (lex.curToken().toString().equals("CHAR")) {
					CHAR.add(lex.curString());
				} else {
					throw new AssertionError("CHAR expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				rPrime.add(rPrime());
				return new Tree("R", new Tree(String.valueOf(CHAR.get(0))), rPrime.get(0));
            }
            default:
                throw new AssertionError();
        }
    }

	private Tree rPrime() throws ParseException, IOException {
		switch (lex.curToken()) {
			case OP: {
				List<Tree> r = new ArrayList<>();
				List<Tree> rPrime = new ArrayList<>();
				r.add(r());
				rPrime.add(rPrime());
				return new Tree("R'", r.get(0), rPrime.get(0));
            }
			case Q: {
				List<String> Q = new ArrayList<>();
				List<Tree> rPrime = new ArrayList<>();
				if (lex.curToken().toString().equals("Q")) {
					Q.add(lex.curString());
				} else {
					throw new AssertionError("Q expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				rPrime.add(rPrime());
				return new Tree("R'", new Tree("Q", new Tree(Q.get(0))), rPrime.get(0));
            }
			case OR: {
				List<String> OR = new ArrayList<>();
				List<Tree> r = new ArrayList<>();
				List<Tree> rPrime = new ArrayList<>();
				if (lex.curToken().toString().equals("OR")) {
					OR.add(lex.curString());
				} else {
					throw new AssertionError("OR expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				r.add(r());
				rPrime.add(rPrime());
				return new Tree("R'", new Tree(OR.get(0)), r.get(0), rPrime.get(0));
            }
			case CHAR: {
				List<Tree> r = new ArrayList<>();
				List<Tree> rPrime = new ArrayList<>();
				r.add(r());
				rPrime.add(rPrime());
				return new Tree("R'", r.get(0), rPrime.get(0));
            }
			case EOF: {
				return new Tree("R'");
            }
			case CP: {
				return new Tree("R'");
            }
            default:
                throw new AssertionError();
        }
    }

}
