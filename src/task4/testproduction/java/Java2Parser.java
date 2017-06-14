package task4.testproduction.java;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class Java2Parser {


private Java2Lexer lex;

	HashMap<String, String> obfuscatedVarNames = new HashMap<>();

	public String parse(PushbackInputStream is) throws ParseException, IOException {
		lex = new Java2Lexer(is);
		lex.nextToken();
		return compilationUnit();
	}

	private String memberDeclaration() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
			case BYTE: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
			case CHAR: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
			case STRING: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
			case DOUBLE: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
			case VOID: {
				List<String> VOID = new ArrayList<>();
				List<String> methodDeclaration = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("VOID")) {
					VOID.add(lex.curString());
				} else {
					throw new AssertionError("VOID expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				methodDeclaration.add(methodDeclaration());
				return "void " + methodDeclaration.get(0);
            }
			case BOOLEAN: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
			case INT: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
			case SHORT: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
			case LONG: {
				List<String> type = new ArrayList<>();
				List<String> memberDeclarationTypeTrail = new ArrayList<>();
				type.add(type());
				memberDeclarationTypeTrail.add(memberDeclarationTypeTrail());
				return type.get(0) + " " + memberDeclarationTypeTrail.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String formalParametersT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case COMMA: {
				List<String> COMMA = new ArrayList<>();
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return ", " + formalParameter.get(0) + " " + formalParametersT.get(0);
            }
			case RPAREN: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String type() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> primitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				primitiveType.add(primitiveType());
				arraysT.add(arraysT());
				return primitiveType.get(0) + arraysT.get(0);
            }
			case BYTE: {
				List<String> primitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				primitiveType.add(primitiveType());
				arraysT.add(arraysT());
				return primitiveType.get(0) + arraysT.get(0);
            }
			case CHAR: {
				List<String> primitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				primitiveType.add(primitiveType());
				arraysT.add(arraysT());
				return primitiveType.get(0) + arraysT.get(0);
            }
			case STRING: {
				List<String> nonPrimitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				nonPrimitiveType.add(nonPrimitiveType());
				arraysT.add(arraysT());
				return nonPrimitiveType.get(0) + arraysT.get(0);
            }
			case DOUBLE: {
				List<String> primitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				primitiveType.add(primitiveType());
				arraysT.add(arraysT());
				return primitiveType.get(0) + arraysT.get(0);
            }
			case BOOLEAN: {
				List<String> primitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				primitiveType.add(primitiveType());
				arraysT.add(arraysT());
				return primitiveType.get(0) + arraysT.get(0);
            }
			case INT: {
				List<String> primitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				primitiveType.add(primitiveType());
				arraysT.add(arraysT());
				return primitiveType.get(0) + arraysT.get(0);
            }
			case SHORT: {
				List<String> primitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				primitiveType.add(primitiveType());
				arraysT.add(arraysT());
				return primitiveType.get(0) + arraysT.get(0);
            }
			case LONG: {
				List<String> primitiveType = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				primitiveType.add(primitiveType());
				arraysT.add(arraysT());
				return primitiveType.get(0) + arraysT.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String nonzeroNumericTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> ZERO = new ArrayList<>();
				List<String> nonzeroNumericTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ZERO")) {
					ZERO.add(lex.curString());
				} else {
					throw new AssertionError("ZERO expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				nonzeroNumericTrail.add(nonzeroNumericTrail());
				return "0" + nonzeroNumericTrail.get(0);
            }
			case INSTANCEOF: {
                return "";
            }
			case ADD: {
                return "";
            }
			case LT: {
                return "";
            }
			case ASSIGN: {
                return "";
            }
			case QUESTION: {
                return "";
            }
			case SEMICOLON: {
                return "";
            }
			case NONZERODIGIT: {
				List<String> NONZERODIGIT = new ArrayList<>();
				List<String> nonzeroNumericTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONZERODIGIT")) {
					NONZERODIGIT.add(lex.curString());
				} else {
					throw new AssertionError("NONZERODIGIT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				nonzeroNumericTrail.add(nonzeroNumericTrail());
				return NONZERODIGIT.get(0) + nonzeroNumericTrail.get(0);
            }
			case GE: {
                return "";
            }
			case COMMA: {
                return "";
            }
			case SUB: {
                return "";
            }
			case MOD: {
                return "";
            }
			case OR: {
                return "";
            }
			case MUL: {
                return "";
            }
			case EQUAL: {
                return "";
            }
			case DOT: {
				List<String> zeroNumericTrail = new ArrayList<>();
				zeroNumericTrail.add(zeroNumericTrail());
				return zeroNumericTrail.get(0);
            }
			case LPAREN: {
                return "";
            }
			case COLON: {
                return "";
            }
			case RPAREN: {
                return "";
            }
			case GT: {
                return "";
            }
			case CARET: {
                return "";
            }
			case DIV: {
                return "";
            }
			case NOTEQUAL: {
                return "";
            }
			case RBRACK: {
                return "";
            }
			case LBRACK: {
                return "";
            }
			case AND: {
                return "";
            }
			case LE: {
                return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String division() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case DIV: {
				List<String> DIV = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DIV")) {
					DIV.add(lex.curString());
				} else {
					throw new AssertionError("DIV expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " /";
            }
			case MOD: {
				List<String> MOD = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("MOD")) {
					MOD.add(lex.curString());
				} else {
					throw new AssertionError("MOD expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " %%";
            }
			case MUL: {
				List<String> MUL = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("MUL")) {
					MUL.add(lex.curString());
				} else {
					throw new AssertionError("MUL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " *";
            }
            default:
                throw new AssertionError();
        }
    }

	private String characterLiteral() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case SINGLEQUOTE: {
				List<String> SINGLEQUOTE = new ArrayList<>();
				List<String> anyIdSymbol = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SINGLEQUOTE")) {
					SINGLEQUOTE.add(lex.curString());
				} else {
					throw new AssertionError("SINGLEQUOTE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				anyIdSymbol.add(anyIdSymbol());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SINGLEQUOTE")) {
					SINGLEQUOTE.add(lex.curString());
				} else {
					throw new AssertionError("SINGLEQUOTE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "\'" + anyIdSymbol.get(0) + "\'";
            }
            default:
                throw new AssertionError();
        }
    }

	private String identifiersRec() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NONDIGITIDSYMBOL: {
				List<String> identifier = new ArrayList<>();
				List<String> identifiersRec = new ArrayList<>();
				identifier.add(identifier());
				identifiersRec.add(identifiersRec());
				return identifier.get(0) + identifiersRec.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String localVariableInitT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case SEMICOLON: {
				return "";
            }
			case ASSIGN: {
				List<String> ASSIGN = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ASSIGN")) {
					ASSIGN.add(lex.curString());
				} else {
					throw new AssertionError("ASSIGN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				return " = " + expression.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String staticTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
                return "";
            }
			case CHAR: {
                return "";
            }
			case FINAL: {
				List<String> abstractTrail = new ArrayList<>();
				abstractTrail.add(abstractTrail());
				return abstractTrail.get(0);
            }
			case CLASS: {
                return "";
            }
			case ABSTRACT: {
				List<String> ABSTRACT = new ArrayList<>();
				List<String> abstractTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ABSTRACT")) {
					ABSTRACT.add(lex.curString());
				} else {
					throw new AssertionError("ABSTRACT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				abstractTrail.add(abstractTrail());
				return "abstract " + abstractTrail.get(0);
            }
			case BOOLEAN: {
                return "";
            }
			case INT: {
                return "";
            }
			case SHORT: {
                return "";
            }
			case SEMICOLON: {
                return "";
            }
			case BYTE: {
                return "";
            }
			case STRING: {
                return "";
            }
			case DOUBLE: {
                return "";
            }
			case VOID: {
                return "";
            }
			case LONG: {
                return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String classBodyDeclaration() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case CHAR: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case FINAL: {
				List<String> modifiers = new ArrayList<>();
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				modifiers.add(modifiers());
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return modifiers.get(0) + memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case ABSTRACT: {
				List<String> modifiers = new ArrayList<>();
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				modifiers.add(modifiers());
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return modifiers.get(0) + memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case STATIC: {
				List<String> modifiers = new ArrayList<>();
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				modifiers.add(modifiers());
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return modifiers.get(0) + memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case BOOLEAN: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case INT: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case PRIVATE: {
				List<String> modifiers = new ArrayList<>();
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				modifiers.add(modifiers());
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return modifiers.get(0) + memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case SHORT: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case RBRACE: {
                return "";
            }
			case SEMICOLON: {
				List<String> SEMICOLON = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return ";\n" + classBodyDeclarationTrail.get(0);
            }
			case BYTE: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case PUBLIC: {
				List<String> modifiers = new ArrayList<>();
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				modifiers.add(modifiers());
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return modifiers.get(0) + memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case STRING: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case DOUBLE: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case VOID: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case PROTECTED: {
				List<String> modifiers = new ArrayList<>();
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				modifiers.add(modifiers());
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return modifiers.get(0) + memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case LBRACE: {
				List<String> block = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				block.add(block());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return block.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
			case LONG: {
				List<String> memberDeclaration = new ArrayList<>();
				List<String> classBodyDeclarationTrail = new ArrayList<>();
				memberDeclaration.add(memberDeclaration());
				classBodyDeclarationTrail.add(classBodyDeclarationTrail());
				return memberDeclaration.get(0) + "\n" + classBodyDeclarationTrail.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String block() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case LBRACE: {
				List<String> LBRACE = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				List<String> RBRACE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LBRACE")) {
					LBRACE.add(lex.curString());
				} else {
					throw new AssertionError("LBRACE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				blockStatementsRec.add(blockStatementsRec());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RBRACE")) {
					RBRACE.add(lex.curString());
				} else {
					throw new AssertionError("RBRACE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "{\n" + blockStatementsRec.get(0) + "}";
            }
            default:
                throw new AssertionError();
        }
    }

	private String numericLiteral() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> ZERO = new ArrayList<>();
				List<String> zeroNumericTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ZERO")) {
					ZERO.add(lex.curString());
				} else {
					throw new AssertionError("ZERO expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				zeroNumericTrail.add(zeroNumericTrail());
				return "0" + zeroNumericTrail.get(0);
            }
			case NONZERODIGIT: {
				List<String> NONZERODIGIT = new ArrayList<>();
				List<String> nonzeroNumericTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONZERODIGIT")) {
					NONZERODIGIT.add(lex.curString());
				} else {
					throw new AssertionError("NONZERODIGIT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				nonzeroNumericTrail.add(nonzeroNumericTrail());
				return NONZERODIGIT.get(0) + nonzeroNumericTrail.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String booleanLiteral() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case TRUE: {
				List<String> TRUE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("TRUE")) {
					TRUE.add(lex.curString());
				} else {
					throw new AssertionError("TRUE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "true";
            }
			case FALSE: {
				List<String> FALSE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("FALSE")) {
					FALSE.add(lex.curString());
				} else {
					throw new AssertionError("FALSE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "false";
            }
            default:
                throw new AssertionError();
        }
    }

	private String publicTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
                return "";
            }
			case CHAR: {
                return "";
            }
			case FINAL: {
				List<String> staticTrail = new ArrayList<>();
				staticTrail.add(staticTrail());
				return staticTrail.get(0);
            }
			case CLASS: {
                return "";
            }
			case ABSTRACT: {
				List<String> staticTrail = new ArrayList<>();
				staticTrail.add(staticTrail());
				return staticTrail.get(0);
            }
			case STATIC: {
				List<String> STATIC = new ArrayList<>();
				List<String> staticTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("STATIC")) {
					STATIC.add(lex.curString());
				} else {
					throw new AssertionError("STATIC expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				staticTrail.add(staticTrail());
				return "static " + staticTrail.get(0);
            }
			case BOOLEAN: {
                return "";
            }
			case INT: {
                return "";
            }
			case SHORT: {
                return "";
            }
			case SEMICOLON: {
                return "";
            }
			case BYTE: {
                return "";
            }
			case STRING: {
                return "";
            }
			case DOUBLE: {
                return "";
            }
			case VOID: {
                return "";
            }
			case LONG: {
                return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String comp() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NOTEQUAL: {
				List<String> NOTEQUAL = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NOTEQUAL")) {
					NOTEQUAL.add(lex.curString());
				} else {
					throw new AssertionError("NOTEQUAL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " !=";
            }
			case EQUAL: {
				List<String> EQUAL = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("EQUAL")) {
					EQUAL.add(lex.curString());
				} else {
					throw new AssertionError("EQUAL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " =";
            }
			case LT: {
				List<String> LT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LT")) {
					LT.add(lex.curString());
				} else {
					throw new AssertionError("LT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " <";
            }
			case LE: {
				List<String> LE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LE")) {
					LE.add(lex.curString());
				} else {
					throw new AssertionError("LE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " <=";
            }
			case GT: {
				List<String> GT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("GT")) {
					GT.add(lex.curString());
				} else {
					throw new AssertionError("GT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " >";
            }
			case GE: {
				List<String> GE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("GE")) {
					GE.add(lex.curString());
				} else {
					throw new AssertionError("GE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " >=";
            }
            default:
                throw new AssertionError();
        }
    }

	private String identifier() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NONDIGITIDSYMBOL: {
				List<String> NONDIGITIDSYMBOL = new ArrayList<>();
				List<String> anyIdSymbols = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONDIGITIDSYMBOL")) {
					NONDIGITIDSYMBOL.add(lex.curString());
				} else {
					throw new AssertionError("NONDIGITIDSYMBOL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				anyIdSymbols.add(anyIdSymbols());
				return NONDIGITIDSYMBOL.get(0) + anyIdSymbols.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String anyIdSymbols() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> anyIdSymbol = new ArrayList<>();
				List<String> anyIdSymbols = new ArrayList<>();
				anyIdSymbol.add(anyIdSymbol());
				anyIdSymbols.add(anyIdSymbols());
				return anyIdSymbol.get(0) + anyIdSymbols.get(0);
            }
			case INSTANCEOF: {
				return "";
            }
			case ADD: {
				return "";
            }
			case EXTENDS: {
				return "";
            }
			case LT: {
				return "";
            }
			case ASSIGN: {
				return "";
            }
			case DOUBLEQUOTE: {
				return "";
            }
			case QUESTION: {
				return "";
            }
			case SEMICOLON: {
				return "";
            }
			case NONZERODIGIT: {
				List<String> anyIdSymbol = new ArrayList<>();
				List<String> anyIdSymbols = new ArrayList<>();
				anyIdSymbol.add(anyIdSymbol());
				anyIdSymbols.add(anyIdSymbols());
				return anyIdSymbol.get(0) + anyIdSymbols.get(0);
            }
			case GE: {
				return "";
            }
			case COMMA: {
				return "";
            }
			case SUB: {
				return "";
            }
			case MOD: {
				return "";
            }
			case OR: {
				return "";
            }
			case MUL: {
				return "";
            }
			case EQUAL: {
				return "";
            }
			case DOT: {
				return "";
            }
			case LPAREN: {
				return "";
            }
			case IMPLEMENTS: {
				return "";
            }
			case COLON: {
				return "";
            }
			case RPAREN: {
				return "";
            }
			case GT: {
				return "";
            }
			case CARET: {
				return "";
            }
			case DIV: {
				return "";
            }
			case NOTEQUAL: {
				return "";
            }
			case RBRACK: {
				return "";
            }
			case LBRACK: {
				return "";
            }
			case AND: {
				return "";
            }
			case LE: {
				return "";
            }
			case NONDIGITIDSYMBOL: {
				List<String> anyIdSymbol = new ArrayList<>();
				List<String> anyIdSymbols = new ArrayList<>();
				anyIdSymbol.add(anyIdSymbol());
				anyIdSymbols.add(anyIdSymbols());
				return anyIdSymbol.get(0) + anyIdSymbols.get(0);
            }
			case LBRACE: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String qualifiedName() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case MUL: {
				List<String> MUL = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("MUL")) {
					MUL.add(lex.curString());
				} else {
					throw new AssertionError("MUL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return MUL.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> identifier = new ArrayList<>();
				List<String> qualifiedNameTrail = new ArrayList<>();
				identifier.add(identifier());
				qualifiedNameTrail.add(qualifiedNameTrail());
				return identifier.get(0) + qualifiedNameTrail.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String expressionPrime() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case INSTANCEOF: {
				List<String> INSTANCEOF = new ArrayList<>();
				List<String> type = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("INSTANCEOF")) {
					INSTANCEOF.add(lex.curString());
				} else {
					throw new AssertionError("INSTANCEOF expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				type.add(type());
				expressionPrime.add(expressionPrime());
				return "instanceof " + type.get(0) + expressionPrime.get(0);
            }
			case ADD: {
				List<String> mathop = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				mathop.add(mathop());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return mathop.get(0) + " " + expression.get(0) + expressionPrime.get(0);
            }
			case LT: {
				List<String> comp = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				comp.add(comp());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return comp.get(0) + expression.get(0) + expressionPrime.get(0);
            }
			case ASSIGN: {
				List<String> ASSIGN = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ASSIGN")) {
					ASSIGN.add(lex.curString());
				} else {
					throw new AssertionError("ASSIGN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return ASSIGN.get(0) + " " + expression.get(0) + expressionPrime.get(0);
            }
			case QUESTION: {
				List<String> QUESTION = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> COLON = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("QUESTION")) {
					QUESTION.add(lex.curString());
				} else {
					throw new AssertionError("QUESTION expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COLON")) {
					COLON.add(lex.curString());
				} else {
					throw new AssertionError("COLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return "?" + expression.get(0) + ": " + expression.get(1) + expressionPrime.get(0);
            }
			case SEMICOLON: {
				return "";
            }
			case GE: {
				List<String> comp = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				comp.add(comp());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return comp.get(0) + expression.get(0) + expressionPrime.get(0);
            }
			case COMMA: {
				return "";
            }
			case SUB: {
				List<String> mathop = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				mathop.add(mathop());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return mathop.get(0) + " " + expression.get(0) + expressionPrime.get(0);
            }
			case MOD: {
				List<String> division = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				division.add(division());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return division.get(0) + " " + expression.get(0) + expressionPrime.get(0);
            }
			case OR: {
				List<String> OR = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("OR")) {
					OR.add(lex.curString());
				} else {
					throw new AssertionError("OR expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return OR.get(0) + expression.get(0) + expressionPrime.get(0);
            }
			case MUL: {
				List<String> division = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				division.add(division());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return division.get(0) + " " + expression.get(0) + expressionPrime.get(0);
            }
			case EQUAL: {
				List<String> comp = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				comp.add(comp());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return comp.get(0) + expression.get(0) + expressionPrime.get(0);
            }
			case DOT: {
				List<String> DOT = new ArrayList<>();
				List<String> identifier = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DOT")) {
					DOT.add(lex.curString());
				} else {
					throw new AssertionError("DOT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				identifier.add(identifier());
				expressionPrime.add(expressionPrime());
				return "." + identifier.get(0) + expressionPrime.get(0);
            }
			case LPAREN: {
				List<String> LPAREN = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				List<String> RPAREN = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LPAREN")) {
					LPAREN.add(lex.curString());
				} else {
					throw new AssertionError("LPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RPAREN")) {
					RPAREN.add(lex.curString());
				} else {
					throw new AssertionError("RPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionPrime.add(expressionPrime());
				return "(" + expressionList.get(0) + ")" + expressionPrime.get(0);
            }
			case COLON: {
				return "";
            }
			case RPAREN: {
				return "";
            }
			case GT: {
				List<String> comp = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				comp.add(comp());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return comp.get(0) + expression.get(0) + expressionPrime.get(0);
            }
			case CARET: {
				List<String> CARET = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("CARET")) {
					CARET.add(lex.curString());
				} else {
					throw new AssertionError("CARET expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return CARET.get(0) + expression.get(0) + expressionPrime.get(0);
            }
			case DIV: {
				List<String> division = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				division.add(division());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return division.get(0) + " " + expression.get(0) + expressionPrime.get(0);
            }
			case NOTEQUAL: {
				List<String> comp = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				comp.add(comp());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return comp.get(0) + expression.get(0) + expressionPrime.get(0);
            }
			case RBRACK: {
				return "";
            }
			case LBRACK: {
				List<String> LBRACK = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> RBRACK = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LBRACK")) {
					LBRACK.add(lex.curString());
				} else {
					throw new AssertionError("LBRACK expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RBRACK")) {
					RBRACK.add(lex.curString());
				} else {
					throw new AssertionError("RBRACK expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionPrime.add(expressionPrime());
				return "[" + expression.get(0) + "] " + expressionPrime.get(0);
            }
			case AND: {
				List<String> AND = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("AND")) {
					AND.add(lex.curString());
				} else {
					throw new AssertionError("AND expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return AND.get(0) + expression.get(0) + expressionPrime.get(0);
            }
			case LE: {
				List<String> comp = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				comp.add(comp());
				expression.add(expression());
				expressionPrime.add(expressionPrime());
				return comp.get(0) + expression.get(0) + expressionPrime.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String extendsT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case EXTENDS: {
				List<String> EXTENDS = new ArrayList<>();
				List<String> type = new ArrayList<>();
				List<String> extendsTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("EXTENDS")) {
					EXTENDS.add(lex.curString());
				} else {
					throw new AssertionError("EXTENDS expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				type.add(type());
				extendsTrail.add(extendsTrail());
				return "extends " + type.get(0) + " " + extendsTrail.get(0);
            }
			case IMPLEMENTS: {
				List<String> extendsTrail = new ArrayList<>();
				extendsTrail.add(extendsTrail());
				return extendsTrail.get(0);
            }
			case LBRACE: {
				List<String> extendsTrail = new ArrayList<>();
				extendsTrail.add(extendsTrail());
				return extendsTrail.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String nonPrimitiveType() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case STRING: {
				List<String> STRING = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("STRING")) {
					STRING.add(lex.curString());
				} else {
					throw new AssertionError("STRING expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return STRING.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String anyIdSymbol() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> ZERO = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ZERO")) {
					ZERO.add(lex.curString());
				} else {
					throw new AssertionError("ZERO expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "0";
            }
			case NONZERODIGIT: {
				List<String> NONZERODIGIT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONZERODIGIT")) {
					NONZERODIGIT.add(lex.curString());
				} else {
					throw new AssertionError("NONZERODIGIT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return NONZERODIGIT.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> NONDIGITIDSYMBOL = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONDIGITIDSYMBOL")) {
					NONDIGITIDSYMBOL.add(lex.curString());
				} else {
					throw new AssertionError("NONDIGITIDSYMBOL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return NONDIGITIDSYMBOL.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String formalParameterList() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
			case BYTE: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
			case CHAR: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
			case STRING: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
			case DOUBLE: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
			case RPAREN: {
				return "";
            }
			case BOOLEAN: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
			case INT: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
			case SHORT: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
			case LONG: {
				List<String> formalParameter = new ArrayList<>();
				List<String> formalParametersT = new ArrayList<>();
				formalParameter.add(formalParameter());
				formalParametersT.add(formalParametersT());
				return formalParameter.get(0) + formalParametersT.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String expressionList() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NEW: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case ZERO: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case SUPER: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case NULL: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case LPAREN: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case TRUE: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case RPAREN: {
				return "";
            }
			case SINGLEQUOTE: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case DOUBLEQUOTE: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case THIS: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case NONZERODIGIT: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case FALSE: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> expression = new ArrayList<>();
				List<String> COMMA = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				return expression.get(0) + ", " + expressionList.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String compilationUnit() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case PACKAGE: {
				List<String> packageDeclaration = new ArrayList<>();
				List<String> importDeclaration = new ArrayList<>();
				List<String> modifiers = new ArrayList<>();
				List<String> typeDeclaration = new ArrayList<>();
				packageDeclaration.add(packageDeclaration());
				importDeclaration.add(importDeclaration());
				modifiers.add(modifiers());
				typeDeclaration.add(typeDeclaration());
				String res = packageDeclaration.get(0) + importDeclaration.get(0) + modifiers.get(0) + typeDeclaration.get(0);				        int count = obfuscatedVarNames.size();				        String[] names = new String[count];				        Random random = new Random();				        StringBuilder sb = new StringBuilder();				        sb.append(random.nextInt(2) == 1 ? 'I' : 'O');				        for (int i = 0; i < count; i++) {				            sb.append(random.nextInt(2) == 1 ? 'I' : 'O');				        }				        String template = sb.toString();				        for (int i = 0; i < obfuscatedVarNames.size(); i++) {				            sb = new StringBuilder();				            sb.append(template.charAt(0));				            for (int j = 1; j < template.length(); j++) {				                switch (template.charAt(j)) {				                    case 'O' :				                        sb.append((i & (1 << (j - 1))) > 0 ? 'O' : '0');				                        break;				                    case 'I' :				                        sb.append((i & (1 << (j - 1))) > 0 ? 'I' : '1');				                        break;				                }				            }				            names[i] = sb.toString();				        }				        return String.format(res, names);
            }
            default:
                throw new AssertionError();
        }
    }

	private String methodBodyT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case SEMICOLON: {
				List<String> SEMICOLON = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return ";";
            }
			case LBRACE: {
				List<String> block = new ArrayList<>();
				block.add(block());
				return block.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String stringLiteral() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case DOUBLEQUOTE: {
				List<String> DOUBLEQUOTE = new ArrayList<>();
				List<String> anyIdSymbols = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DOUBLEQUOTE")) {
					DOUBLEQUOTE.add(lex.curString());
				} else {
					throw new AssertionError("DOUBLEQUOTE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				anyIdSymbols.add(anyIdSymbols());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DOUBLEQUOTE")) {
					DOUBLEQUOTE.add(lex.curString());
				} else {
					throw new AssertionError("DOUBLEQUOTE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "\"" + anyIdSymbols.get(0) + "\"";
            }
            default:
                throw new AssertionError();
        }
    }

	private String extendsTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case IMPLEMENTS: {
				List<String> IMPLEMENTS = new ArrayList<>();
				List<String> typeList = new ArrayList<>();
				List<String> classBody = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("IMPLEMENTS")) {
					IMPLEMENTS.add(lex.curString());
				} else {
					throw new AssertionError("IMPLEMENTS expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				typeList.add(typeList());
				classBody.add(classBody());
				return "implements " + typeList.get(0) + " " + classBody.get(0);
            }
			case LBRACE: {
				List<String> classBody = new ArrayList<>();
				classBody.add(classBody());
				return classBody.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String variableDeclaratorId() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NONDIGITIDSYMBOL: {
				List<String> identifier = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				identifier.add(identifier());
				arraysT.add(arraysT());
				obfuscatedVarNames.putIfAbsent(identifier.get(0), Integer.toString(obfuscatedVarNames.size() + 1));				        return "%" + obfuscatedVarNames.get(identifier.get(0)) + "$s" + arraysT.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String classCreatorRest() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case INSTANCEOF: {
                return "";
            }
			case ADD: {
                return "";
            }
			case LT: {
                return "";
            }
			case ASSIGN: {
                return "";
            }
			case QUESTION: {
                return "";
            }
			case SEMICOLON: {
                return "";
            }
			case GE: {
                return "";
            }
			case COMMA: {
                return "";
            }
			case SUB: {
                return "";
            }
			case MOD: {
                return "";
            }
			case OR: {
                return "";
            }
			case MUL: {
                return "";
            }
			case EQUAL: {
                return "";
            }
			case LPAREN: {
				List<String> arguments = new ArrayList<>();
				List<String> classBodyT = new ArrayList<>();
				arguments.add(arguments());
				classBodyT.add(classBodyT());
				return arguments.get(0) + classBodyT.get(0);
            }
			case DOT: {
                return "";
            }
			case COLON: {
                return "";
            }
			case RPAREN: {
                return "";
            }
			case GT: {
                return "";
            }
			case CARET: {
                return "";
            }
			case DIV: {
                return "";
            }
			case NOTEQUAL: {
                return "";
            }
			case RBRACK: {
                return "";
            }
			case LBRACK: {
                return "";
            }
			case AND: {
                return "";
            }
			case LE: {
                return "";
            }
			case LBRACE: {
                return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String primary() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> literal = new ArrayList<>();
				literal.add(literal());
				return literal.get(0);
            }
			case SUPER: {
				List<String> SUPER = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SUPER")) {
					SUPER.add(lex.curString());
				} else {
					throw new AssertionError("SUPER expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "super";
            }
			case NULL: {
				List<String> literal = new ArrayList<>();
				literal.add(literal());
				return literal.get(0);
            }
			case THIS: {
				List<String> THIS = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("THIS")) {
					THIS.add(lex.curString());
				} else {
					throw new AssertionError("THIS expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "this";
            }
			case TRUE: {
				List<String> literal = new ArrayList<>();
				literal.add(literal());
				return literal.get(0);
            }
			case NONZERODIGIT: {
				List<String> literal = new ArrayList<>();
				literal.add(literal());
				return literal.get(0);
            }
			case FALSE: {
				List<String> literal = new ArrayList<>();
				literal.add(literal());
				return literal.get(0);
            }
			case SINGLEQUOTE: {
				List<String> literal = new ArrayList<>();
				literal.add(literal());
				return literal.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> identifier = new ArrayList<>();
				identifier.add(identifier());
				obfuscatedVarNames.putIfAbsent(identifier.get(0), Integer.toString(obfuscatedVarNames.size() + 1));				           return "%" + obfuscatedVarNames.get(identifier.get(0)) + "$s";
            }
			case DOUBLEQUOTE: {
				List<String> literal = new ArrayList<>();
				literal.add(literal());
				return literal.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String nonDigitIdSymbols() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NONDIGITIDSYMBOL: {
				List<String> NONDIGITIDSYMBOL = new ArrayList<>();
				List<String> nonDigitIdSymbolsTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONDIGITIDSYMBOL")) {
					NONDIGITIDSYMBOL.add(lex.curString());
				} else {
					throw new AssertionError("NONDIGITIDSYMBOL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				nonDigitIdSymbolsTrail.add(nonDigitIdSymbolsTrail());
				return NONDIGITIDSYMBOL.get(0) + nonDigitIdSymbolsTrail.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String abstractTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				return "";
            }
			case CHAR: {
				return "";
            }
			case FINAL: {
				List<String> FINAL = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("FINAL")) {
					FINAL.add(lex.curString());
				} else {
					throw new AssertionError("FINAL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "final ";
            }
			case CLASS: {
				return "";
            }
			case BOOLEAN: {
				return "";
            }
			case INT: {
				return "";
            }
			case SHORT: {
				return "";
            }
			case SEMICOLON: {
				return "";
            }
			case BYTE: {
				return "";
            }
			case STRING: {
				return "";
            }
			case DOUBLE: {
				return "";
            }
			case VOID: {
				return "";
            }
			case LONG: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String methodDeclaration() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NONDIGITIDSYMBOL: {
				List<String> identifier = new ArrayList<>();
				List<String> LPAREN = new ArrayList<>();
				List<String> formalParameterList = new ArrayList<>();
				List<String> RPAREN = new ArrayList<>();
				List<String> methodBodyT = new ArrayList<>();
				identifier.add(identifier());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LPAREN")) {
					LPAREN.add(lex.curString());
				} else {
					throw new AssertionError("LPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				formalParameterList.add(formalParameterList());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RPAREN")) {
					RPAREN.add(lex.curString());
				} else {
					throw new AssertionError("RPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				methodBodyT.add(methodBodyT());
				return identifier.get(0) + "(" + formalParameterList.get(0) + ")" + methodBodyT.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String blockStatementsRec() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NEW: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case ZERO: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case FLOAT: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case THROW: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case CHAR: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case SINGLEQUOTE: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case INT: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case DOUBLEQUOTE: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case RETURN: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case SEMICOLON: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case BREAK: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case BYTE: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case NONZERODIGIT: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case DOUBLE: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case IF: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case LONG: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case SUPER: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case NULL: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case LPAREN: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case TRUE: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case BOOLEAN: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case SHORT: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case RBRACE: {
				return "";
            }
			case STRING: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case THIS: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case FALSE: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
			case LBRACE: {
				List<String> blockStatement = new ArrayList<>();
				List<String> blockStatementsRec = new ArrayList<>();
				blockStatement.add(blockStatement());
				blockStatementsRec.add(blockStatementsRec());
				return blockStatement.get(0) + "\n" + blockStatementsRec.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String nonDigitIdSymbolsTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NONDIGITIDSYMBOL: {
				List<String> NONDIGITIDSYMBOL = new ArrayList<>();
				List<String> nonDigitIdSymbolsTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONDIGITIDSYMBOL")) {
					NONDIGITIDSYMBOL.add(lex.curString());
				} else {
					throw new AssertionError("NONDIGITIDSYMBOL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				nonDigitIdSymbolsTrail.add(nonDigitIdSymbolsTrail());
				return NONDIGITIDSYMBOL.get(0) + nonDigitIdSymbolsTrail.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String typeDeclaration() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case SEMICOLON: {
				List<String> SEMICOLON = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return ";";
            }
			case CLASS: {
				List<String> classDeclaration = new ArrayList<>();
				classDeclaration.add(classDeclaration());
				return classDeclaration.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String expressionT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NEW: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case ZERO: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case SUPER: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case NULL: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case LPAREN: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case TRUE: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case SINGLEQUOTE: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case DOUBLEQUOTE: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case SEMICOLON: {
				return "";
            }
			case THIS: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case NONZERODIGIT: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case FALSE: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String modifiers() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				return "";
            }
			case CHAR: {
				return "";
            }
			case FINAL: {
				List<String> publicTrail = new ArrayList<>();
				publicTrail.add(publicTrail());
				return publicTrail.get(0);
            }
			case CLASS: {
				return "";
            }
			case ABSTRACT: {
				List<String> publicTrail = new ArrayList<>();
				publicTrail.add(publicTrail());
				return publicTrail.get(0);
            }
			case STATIC: {
				List<String> publicTrail = new ArrayList<>();
				publicTrail.add(publicTrail());
				return publicTrail.get(0);
            }
			case BOOLEAN: {
				return "";
            }
			case INT: {
				return "";
            }
			case PRIVATE: {
				List<String> publicT = new ArrayList<>();
				List<String> publicTrail = new ArrayList<>();
				publicT.add(publicT());
				publicTrail.add(publicTrail());
				return publicT.get(0) + publicTrail.get(0);
            }
			case SHORT: {
				return "";
            }
			case SEMICOLON: {
				return "";
            }
			case BYTE: {
				return "";
            }
			case PUBLIC: {
				List<String> publicT = new ArrayList<>();
				List<String> publicTrail = new ArrayList<>();
				publicT.add(publicT());
				publicTrail.add(publicTrail());
				return publicT.get(0) + publicTrail.get(0);
            }
			case STRING: {
				return "";
            }
			case DOUBLE: {
				return "";
            }
			case PROTECTED: {
				List<String> publicT = new ArrayList<>();
				List<String> publicTrail = new ArrayList<>();
				publicT.add(publicT());
				publicTrail.add(publicTrail());
				return publicT.get(0) + publicTrail.get(0);
            }
			case VOID: {
				return "";
            }
			case LONG: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String qualifiedNameTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case SEMICOLON: {
				return "";
            }
			case DOT: {
				List<String> DOT = new ArrayList<>();
				List<String> qualifiedName = new ArrayList<>();
				List<String> qualifiedNameTrail = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DOT")) {
					DOT.add(lex.curString());
				} else {
					throw new AssertionError("DOT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				qualifiedName.add(qualifiedName());
				qualifiedNameTrail.add(qualifiedNameTrail());
				return "." + qualifiedName.get(0) + qualifiedNameTrail.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String classBodyT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case INSTANCEOF: {
				return "";
            }
			case ADD: {
				return "";
            }
			case LT: {
				return "";
            }
			case ASSIGN: {
				return "";
            }
			case QUESTION: {
				return "";
            }
			case SEMICOLON: {
				return "";
            }
			case GE: {
				return "";
            }
			case COMMA: {
				return "";
            }
			case SUB: {
				return "";
            }
			case MOD: {
				return "";
            }
			case OR: {
				return "";
            }
			case MUL: {
				return "";
            }
			case EQUAL: {
				return "";
            }
			case DOT: {
				return "";
            }
			case LPAREN: {
				return "";
            }
			case COLON: {
				return "";
            }
			case RPAREN: {
				return "";
            }
			case GT: {
				return "";
            }
			case CARET: {
				return "";
            }
			case DIV: {
				return "";
            }
			case NOTEQUAL: {
				return "";
            }
			case RBRACK: {
				return "";
            }
			case LBRACK: {
				return "";
            }
			case AND: {
				return "";
            }
			case LE: {
				return "";
            }
			case LBRACE: {
				List<String> classBody = new ArrayList<>();
				classBody.add(classBody());
				return classBody.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String zeroNumericTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case INSTANCEOF: {
				return "";
            }
			case ADD: {
				return "";
            }
			case LT: {
				return "";
            }
			case ASSIGN: {
				return "";
            }
			case QUESTION: {
				return "";
            }
			case SEMICOLON: {
				return "";
            }
			case GE: {
				return "";
            }
			case COMMA: {
				return "";
            }
			case SUB: {
				return "";
            }
			case MOD: {
				return "";
            }
			case OR: {
				return "";
            }
			case MUL: {
				return "";
            }
			case EQUAL: {
				return "";
            }
			case DOT: {
				List<String> DOT = new ArrayList<>();
				List<String> oneOrMoreDigits = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DOT")) {
					DOT.add(lex.curString());
				} else {
					throw new AssertionError("DOT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				oneOrMoreDigits.add(oneOrMoreDigits());
				return "." + oneOrMoreDigits.get(0);
            }
			case LPAREN: {
				return "";
            }
			case COLON: {
				return "";
            }
			case RPAREN: {
				return "";
            }
			case GT: {
				return "";
            }
			case CARET: {
				return "";
            }
			case DIV: {
				return "";
            }
			case NOTEQUAL: {
				return "";
            }
			case RBRACK: {
				return "";
            }
			case LBRACK: {
				return "";
            }
			case AND: {
				return "";
            }
			case LE: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String floatingPointLiteral() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> digits = new ArrayList<>();
				List<String> DOT = new ArrayList<>();
				List<String> oneOrMoreDigits = new ArrayList<>();
				digits.add(digits());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DOT")) {
					DOT.add(lex.curString());
				} else {
					throw new AssertionError("DOT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				oneOrMoreDigits.add(oneOrMoreDigits());
				return digits.get(0) + "." + oneOrMoreDigits.get(0);
            }
			case DOT: {
                return "";
            }
			case NONZERODIGIT: {
				List<String> digits = new ArrayList<>();
				List<String> DOT = new ArrayList<>();
				List<String> oneOrMoreDigits = new ArrayList<>();
				digits.add(digits());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DOT")) {
					DOT.add(lex.curString());
				} else {
					throw new AssertionError("DOT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				oneOrMoreDigits.add(oneOrMoreDigits());
				return digits.get(0) + "." + oneOrMoreDigits.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String classDeclaration() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case CLASS: {
				List<String> CLASS = new ArrayList<>();
				List<String> identifier = new ArrayList<>();
				List<String> extendsT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("CLASS")) {
					CLASS.add(lex.curString());
				} else {
					throw new AssertionError("CLASS expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				identifier.add(identifier());
				extendsT.add(extendsT());
				return "class " + identifier.get(0) + " " + extendsT.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String literal() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> numericLiteral = new ArrayList<>();
				numericLiteral.add(numericLiteral());
				return numericLiteral.get(0);
            }
			case NULL: {
				List<String> NULL = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NULL")) {
					NULL.add(lex.curString());
				} else {
					throw new AssertionError("NULL expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "null";
            }
			case TRUE: {
				List<String> booleanLiteral = new ArrayList<>();
				booleanLiteral.add(booleanLiteral());
				return booleanLiteral.get(0);
            }
			case NONZERODIGIT: {
				List<String> numericLiteral = new ArrayList<>();
				numericLiteral.add(numericLiteral());
				return numericLiteral.get(0);
            }
			case FALSE: {
				List<String> booleanLiteral = new ArrayList<>();
				booleanLiteral.add(booleanLiteral());
				return booleanLiteral.get(0);
            }
			case SINGLEQUOTE: {
				List<String> characterLiteral = new ArrayList<>();
				characterLiteral.add(characterLiteral());
				return characterLiteral.get(0);
            }
			case DOUBLEQUOTE: {
				List<String> stringLiteral = new ArrayList<>();
				stringLiteral.add(stringLiteral());
				return stringLiteral.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String oneOrMoreDigits() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> ZERO = new ArrayList<>();
				List<String> digits = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ZERO")) {
					ZERO.add(lex.curString());
				} else {
					throw new AssertionError("ZERO expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				digits.add(digits());
				return "0" + digits.get(0);
            }
			case NONZERODIGIT: {
				List<String> NONZERODIGIT = new ArrayList<>();
				List<String> digits = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONZERODIGIT")) {
					NONZERODIGIT.add(lex.curString());
				} else {
					throw new AssertionError("NONZERODIGIT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				digits.add(digits());
				return NONZERODIGIT.get(0) + digits.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String typeList() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case COMMA: {
				List<String> COMMA = new ArrayList<>();
				List<String> typeList = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("COMMA")) {
					COMMA.add(lex.curString());
				} else {
					throw new AssertionError("COMMA expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				typeList.add(typeList());
				return COMMA.get(0) + typeList.get(0);
            }
			case FLOAT: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
			case BYTE: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
			case CHAR: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
			case STRING: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
			case DOUBLE: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
			case BOOLEAN: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
			case INT: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
			case SHORT: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
			case LONG: {
				List<String> type = new ArrayList<>();
				type.add(type());
				return type.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String statement() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NEW: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case ZERO: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case SUPER: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case NULL: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case THROW: {
				List<String> THROW = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("THROW")) {
					THROW.add(lex.curString());
				} else {
					throw new AssertionError("THROW expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "throw" + expression.get(0) + ";";
            }
			case LPAREN: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case TRUE: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case SINGLEQUOTE: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case DOUBLEQUOTE: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case RETURN: {
				List<String> RETURN = new ArrayList<>();
				List<String> expressionT = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RETURN")) {
					RETURN.add(lex.curString());
				} else {
					throw new AssertionError("RETURN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionT.add(expressionT());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "return" + expressionT.get(0) + ";";
            }
			case SEMICOLON: {
				List<String> SEMICOLON = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return ";";
            }
			case BREAK: {
				List<String> BREAK = new ArrayList<>();
				List<String> identifier = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("BREAK")) {
					BREAK.add(lex.curString());
				} else {
					throw new AssertionError("BREAK expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				identifier.add(identifier());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "break" + identifier.get(0) + ";";
            }
			case THIS: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case NONZERODIGIT: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case FALSE: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case IF: {
				List<String> IF = new ArrayList<>();
				List<String> parExpression = new ArrayList<>();
				List<String> statement = new ArrayList<>();
				List<String> elseT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("IF")) {
					IF.add(lex.curString());
				} else {
					throw new AssertionError("IF expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				parExpression.add(parExpression());
				statement.add(statement());
				elseT.add(elseT());
				return "if" + parExpression.get(0) + " " + statement.get(0) + elseT.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> statementExpression = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				statementExpression.add(statementExpression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return statementExpression.get(0) + ";";
            }
			case LBRACE: {
				List<String> block = new ArrayList<>();
				block.add(block());
				return block.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String classBody() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case LBRACE: {
				List<String> LBRACE = new ArrayList<>();
				List<String> classBodyDeclaration = new ArrayList<>();
				List<String> RBRACE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LBRACE")) {
					LBRACE.add(lex.curString());
				} else {
					throw new AssertionError("LBRACE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				classBodyDeclaration.add(classBodyDeclaration());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RBRACE")) {
					RBRACE.add(lex.curString());
				} else {
					throw new AssertionError("RBRACE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "{\n" + classBodyDeclaration.get(0) + "}";
            }
            default:
                throw new AssertionError();
        }
    }

	private String classBodyDeclarationTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case CHAR: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case FINAL: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case ABSTRACT: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case STATIC: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case BOOLEAN: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case INT: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case PRIVATE: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case SHORT: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case RBRACE: {
				return "";
            }
			case SEMICOLON: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case BYTE: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case PUBLIC: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case STRING: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case DOUBLE: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case VOID: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case PROTECTED: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case LBRACE: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
			case LONG: {
				List<String> classBodyDeclaration = new ArrayList<>();
				classBodyDeclaration.add(classBodyDeclaration());
				return classBodyDeclaration.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String createdName() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> primitiveType = new ArrayList<>();
				primitiveType.add(primitiveType());
				return primitiveType.get(0);
            }
			case BYTE: {
				List<String> primitiveType = new ArrayList<>();
				primitiveType.add(primitiveType());
				return primitiveType.get(0);
            }
			case CHAR: {
				List<String> primitiveType = new ArrayList<>();
				primitiveType.add(primitiveType());
				return primitiveType.get(0);
            }
			case DOUBLE: {
				List<String> primitiveType = new ArrayList<>();
				primitiveType.add(primitiveType());
				return primitiveType.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> identifier = new ArrayList<>();
				identifier.add(identifier());
				return identifier.get(0);
            }
			case BOOLEAN: {
				List<String> primitiveType = new ArrayList<>();
				primitiveType.add(primitiveType());
				return primitiveType.get(0);
            }
			case INT: {
				List<String> primitiveType = new ArrayList<>();
				primitiveType.add(primitiveType());
				return primitiveType.get(0);
            }
			case SHORT: {
				List<String> primitiveType = new ArrayList<>();
				primitiveType.add(primitiveType());
				return primitiveType.get(0);
            }
			case LONG: {
				List<String> primitiveType = new ArrayList<>();
				primitiveType.add(primitiveType());
				return primitiveType.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String importDeclaration() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case IMPORT: {
				List<String> IMPORT = new ArrayList<>();
				List<String> qualifiedName = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("IMPORT")) {
					IMPORT.add(lex.curString());
				} else {
					throw new AssertionError("IMPORT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				qualifiedName.add(qualifiedName());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "import " + qualifiedName.get(0) + ";\n";
            }
			case PUBLIC: {
				return "";
            }
			case FINAL: {
				return "";
            }
			case PROTECTED: {
				return "";
            }
			case ABSTRACT: {
				return "";
            }
			case STATIC: {
				return "";
            }
			case PRIVATE: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String primitiveType() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> FLOAT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("FLOAT")) {
					FLOAT.add(lex.curString());
				} else {
					throw new AssertionError("FLOAT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return FLOAT.get(0);
            }
			case BYTE: {
				List<String> BYTE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("BYTE")) {
					BYTE.add(lex.curString());
				} else {
					throw new AssertionError("BYTE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return BYTE.get(0);
            }
			case CHAR: {
				List<String> CHAR = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("CHAR")) {
					CHAR.add(lex.curString());
				} else {
					throw new AssertionError("CHAR expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return CHAR.get(0);
            }
			case DOUBLE: {
				List<String> DOUBLE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("DOUBLE")) {
					DOUBLE.add(lex.curString());
				} else {
					throw new AssertionError("DOUBLE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return DOUBLE.get(0);
            }
			case BOOLEAN: {
				List<String> BOOLEAN = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("BOOLEAN")) {
					BOOLEAN.add(lex.curString());
				} else {
					throw new AssertionError("BOOLEAN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return BOOLEAN.get(0);
            }
			case INT: {
				List<String> INT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("INT")) {
					INT.add(lex.curString());
				} else {
					throw new AssertionError("INT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return INT.get(0);
            }
			case SHORT: {
				List<String> SHORT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SHORT")) {
					SHORT.add(lex.curString());
				} else {
					throw new AssertionError("SHORT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return SHORT.get(0);
            }
			case LONG: {
				List<String> LONG = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LONG")) {
					LONG.add(lex.curString());
				} else {
					throw new AssertionError("LONG expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return LONG.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String formalParameter() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
			case BYTE: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
			case CHAR: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
			case STRING: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
			case DOUBLE: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
			case BOOLEAN: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
			case INT: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
			case SHORT: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
			case LONG: {
				List<String> type = new ArrayList<>();
				List<String> variableDeclaratorId = new ArrayList<>();
				type.add(type());
				variableDeclaratorId.add(variableDeclaratorId());
				return type.get(0) + " " + variableDeclaratorId.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String parExpression() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case LPAREN: {
				List<String> LPAREN = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> RPAREN = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LPAREN")) {
					LPAREN.add(lex.curString());
				} else {
					throw new AssertionError("LPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RPAREN")) {
					RPAREN.add(lex.curString());
				} else {
					throw new AssertionError("RPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "(" + expression.get(0) + ")";
            }
            default:
                throw new AssertionError();
        }
    }

	private String creator() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case FLOAT: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
			case BYTE: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
			case CHAR: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
			case DOUBLE: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
			case BOOLEAN: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
			case INT: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
			case SHORT: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
			case LONG: {
				List<String> createdName = new ArrayList<>();
				List<String> classCreatorRest = new ArrayList<>();
				createdName.add(createdName());
				classCreatorRest.add(classCreatorRest());
				return createdName.get(0) + classCreatorRest.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String arraysT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case INSTANCEOF: {
				return "";
            }
			case ADD: {
				return "";
            }
			case LT: {
				return "";
            }
			case ASSIGN: {
				return "";
            }
			case QUESTION: {
				return "";
            }
			case SEMICOLON: {
				return "";
            }
			case GE: {
				return "";
            }
			case COMMA: {
				return "";
            }
			case SUB: {
				return "";
            }
			case MOD: {
				return "";
            }
			case OR: {
				return "";
            }
			case MUL: {
				return "";
            }
			case EQUAL: {
				return "";
            }
			case DOT: {
				return "";
            }
			case LPAREN: {
				return "";
            }
			case IMPLEMENTS: {
				return "";
            }
			case COLON: {
				return "";
            }
			case RPAREN: {
				return "";
            }
			case GT: {
				return "";
            }
			case CARET: {
				return "";
            }
			case DIV: {
				return "";
            }
			case NOTEQUAL: {
				return "";
            }
			case RBRACK: {
				return "";
            }
			case LBRACK: {
				List<String> LBRACK = new ArrayList<>();
				List<String> RBRACK = new ArrayList<>();
				List<String> arraysT = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LBRACK")) {
					LBRACK.add(lex.curString());
				} else {
					throw new AssertionError("LBRACK expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RBRACK")) {
					RBRACK.add(lex.curString());
				} else {
					throw new AssertionError("RBRACK expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				arraysT.add(arraysT());
				return "[]" + arraysT.get(0);
            }
			case AND: {
				return "";
            }
			case LE: {
				return "";
            }
			case NONDIGITIDSYMBOL: {
				return "";
            }
			case LBRACE: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String blockStatement() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NEW: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case ZERO: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case FLOAT: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case THROW: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case CHAR: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case SINGLEQUOTE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case INT: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case DOUBLEQUOTE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case RETURN: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case SEMICOLON: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case BREAK: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case BYTE: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case NONZERODIGIT: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case DOUBLE: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case IF: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case LONG: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case SUPER: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case NULL: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case LPAREN: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case TRUE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case BOOLEAN: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case SHORT: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case STRING: {
				List<String> type = new ArrayList<>();
				List<String> localVariableDeclaration = new ArrayList<>();
				type.add(type());
				localVariableDeclaration.add(localVariableDeclaration());
				return type.get(0) + " " + localVariableDeclaration.get(0);
            }
			case THIS: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case FALSE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case LBRACE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String expression() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NEW: {
				List<String> NEW = new ArrayList<>();
				List<String> creator = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NEW")) {
					NEW.add(lex.curString());
				} else {
					throw new AssertionError("NEW expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				creator.add(creator());
				expressionPrime.add(expressionPrime());
				return "new " + creator.get(0) + expressionPrime.get(0);
            }
			case ZERO: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case SUPER: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case NULL: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case LPAREN: {
				List<String> LPAREN = new ArrayList<>();
				List<String> expression = new ArrayList<>();
				List<String> RPAREN = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LPAREN")) {
					LPAREN.add(lex.curString());
				} else {
					throw new AssertionError("LPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expression.add(expression());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RPAREN")) {
					RPAREN.add(lex.curString());
				} else {
					throw new AssertionError("RPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionPrime.add(expressionPrime());
				return "(" + expression.get(0) + ")" + expressionPrime.get(0);
            }
			case TRUE: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case SINGLEQUOTE: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case DOUBLEQUOTE: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case THIS: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case NONZERODIGIT: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case FALSE: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> primary = new ArrayList<>();
				List<String> expressionPrime = new ArrayList<>();
				primary.add(primary());
				expressionPrime.add(expressionPrime());
				return primary.get(0) + expressionPrime.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String mathop() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ADD: {
				List<String> ADD = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ADD")) {
					ADD.add(lex.curString());
				} else {
					throw new AssertionError("ADD expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " +";
            }
			case SUB: {
				List<String> SUB = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SUB")) {
					SUB.add(lex.curString());
				} else {
					throw new AssertionError("SUB expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return " -";
            }
            default:
                throw new AssertionError();
        }
    }

	private String memberDeclarationTypeTrail() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NONDIGITIDSYMBOL: {
				List<String> localVariableDeclaration = new ArrayList<>();
				localVariableDeclaration.add(localVariableDeclaration());
				return localVariableDeclaration.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String statementExpression() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NEW: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case ZERO: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case SUPER: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case NULL: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case LPAREN: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case TRUE: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case SINGLEQUOTE: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case DOUBLEQUOTE: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case THIS: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case NONZERODIGIT: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case FALSE: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> expression = new ArrayList<>();
				expression.add(expression());
				return expression.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String packageDeclaration() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case PACKAGE: {
				List<String> PACKAGE = new ArrayList<>();
				List<String> qualifiedName = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("PACKAGE")) {
					PACKAGE.add(lex.curString());
				} else {
					throw new AssertionError("PACKAGE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				qualifiedName.add(qualifiedName());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "package " + qualifiedName.get(0) + ";\n" ;
            }
            default:
                throw new AssertionError();
        }
    }

	private String localVariableDeclaration() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NONDIGITIDSYMBOL: {
				List<String> variableDeclaratorId = new ArrayList<>();
				List<String> localVariableInitT = new ArrayList<>();
				List<String> SEMICOLON = new ArrayList<>();
				variableDeclaratorId.add(variableDeclaratorId());
				localVariableInitT.add(localVariableInitT());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("SEMICOLON")) {
					SEMICOLON.add(lex.curString());
				} else {
					throw new AssertionError("SEMICOLON expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return variableDeclaratorId.get(0) + localVariableInitT.get(0) + ";";
            }
            default:
                throw new AssertionError();
        }
    }

	private String publicT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case PUBLIC: {
				List<String> PUBLIC = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("PUBLIC")) {
					PUBLIC.add(lex.curString());
				} else {
					throw new AssertionError("PUBLIC expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "public ";
            }
			case PROTECTED: {
				List<String> PROTECTED = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("PROTECTED")) {
					PROTECTED.add(lex.curString());
				} else {
					throw new AssertionError("PROTECTED expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "protected ";
            }
			case PRIVATE: {
				List<String> PRIVATE = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("PRIVATE")) {
					PRIVATE.add(lex.curString());
				} else {
					throw new AssertionError("PRIVATE expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "private ";
            }
            default:
                throw new AssertionError();
        }
    }

	private String elseT() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case NEW: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case ZERO: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case FLOAT: {
				return "";
            }
			case THROW: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case CHAR: {
				return "";
            }
			case SINGLEQUOTE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case DOUBLEQUOTE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case INT: {
				return "";
            }
			case RETURN: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case SEMICOLON: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case BREAK: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case BYTE: {
				return "";
            }
			case NONZERODIGIT: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case DOUBLE: {
				return "";
            }
			case IF: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case LONG: {
				return "";
            }
			case SUPER: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case NULL: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case LPAREN: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case TRUE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case BOOLEAN: {
				return "";
            }
			case SHORT: {
				return "";
            }
			case RBRACE: {
				return "";
            }
			case THIS: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case STRING: {
				return "";
            }
			case FALSE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case NONDIGITIDSYMBOL: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
			case LBRACE: {
				List<String> statement = new ArrayList<>();
				statement.add(statement());
				return statement.get(0);
            }
            default:
                throw new AssertionError();
        }
    }

	private String arguments() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case INSTANCEOF: {
				return "";
            }
			case ADD: {
				return "";
            }
			case LT: {
				return "";
            }
			case ASSIGN: {
				return "";
            }
			case QUESTION: {
				return "";
            }
			case SEMICOLON: {
				return "";
            }
			case GE: {
				return "";
            }
			case COMMA: {
				return "";
            }
			case SUB: {
				return "";
            }
			case MOD: {
				return "";
            }
			case OR: {
				return "";
            }
			case MUL: {
				return "";
            }
			case EQUAL: {
				return "";
            }
			case LPAREN: {
				List<String> LPAREN = new ArrayList<>();
				List<String> expressionList = new ArrayList<>();
				List<String> RPAREN = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("LPAREN")) {
					LPAREN.add(lex.curString());
				} else {
					throw new AssertionError("LPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				expressionList.add(expressionList());
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("RPAREN")) {
					RPAREN.add(lex.curString());
				} else {
					throw new AssertionError("RPAREN expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				return "(" + expressionList.get(0) + ")";
            }
			case DOT: {
				return "";
            }
			case COLON: {
				return "";
            }
			case RPAREN: {
				return "";
            }
			case GT: {
				return "";
            }
			case CARET: {
				return "";
            }
			case DIV: {
				return "";
            }
			case NOTEQUAL: {
				return "";
            }
			case RBRACK: {
				return "";
            }
			case LBRACK: {
				return "";
            }
			case AND: {
				return "";
            }
			case LE: {
				return "";
            }
			case LBRACE: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

	private String digits() throws ParseException, IOException {
		while (lex.curToken() == Token.SPACE) {
			lex.nextToken();
		}

		switch (lex.curToken()) {
			case ZERO: {
				List<String> ZERO = new ArrayList<>();
				List<String> digits = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("ZERO")) {
					ZERO.add(lex.curString());
				} else {
					throw new AssertionError("ZERO expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				digits.add(digits());
				return "0" + digits.get(0);
            }
			case INSTANCEOF: {
				return "";
            }
			case ADD: {
				return "";
            }
			case LT: {
				return "";
            }
			case ASSIGN: {
				return "";
            }
			case QUESTION: {
				return "";
            }
			case SEMICOLON: {
				return "";
            }
			case NONZERODIGIT: {
				List<String> NONZERODIGIT = new ArrayList<>();
				List<String> digits = new ArrayList<>();
				while (lex.curToken() == Token.SPACE) {
					lex.nextToken();
				}
				if (lex.curToken().toString().equals("NONZERODIGIT")) {
					NONZERODIGIT.add(lex.curString());
				} else {
					throw new AssertionError("NONZERODIGIT expected, instead of " + lex.curToken().toString());
				}
				lex.nextToken();
				digits.add(digits());
				return NONZERODIGIT.get(0) + digits.get(0);
            }
			case GE: {
				return "";
            }
			case COMMA: {
				return "";
            }
			case SUB: {
				return "";
            }
			case MOD: {
				return "";
            }
			case OR: {
				return "";
            }
			case MUL: {
				return "";
            }
			case EQUAL: {
				return "";
            }
			case DOT: {
				return "";
            }
			case LPAREN: {
				return "";
            }
			case COLON: {
				return "";
            }
			case RPAREN: {
				return "";
            }
			case GT: {
				return "";
            }
			case CARET: {
				return "";
            }
			case DIV: {
				return "";
            }
			case NOTEQUAL: {
				return "";
            }
			case RBRACK: {
				return "";
            }
			case LBRACK: {
				return "";
            }
			case AND: {
				return "";
            }
			case LE: {
				return "";
            }
            default:
                throw new AssertionError();
        }
    }

}
