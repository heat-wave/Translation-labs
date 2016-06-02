import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by heat_wave on 29/05/16.
 */

class ObfuscatedJavaListener extends JavaBaseListener {
    TokenStreamRewriter rewriter;
    private HashMap<String, String> obfuscatedVarNames;
    private HashSet<String> dummyVarNames;
    private HashSet<String> currentBlockVarNames;
    private Random random;
    private String template;

    ObfuscatedJavaListener(TokenStream tokens, int count) {
        rewriter = new TokenStreamRewriter(tokens);
        obfuscatedVarNames = new HashMap<>();
        currentBlockVarNames = new HashSet<>();
        dummyVarNames = new HashSet<>();
        random = new Random();
        template = makeTemplate(count);
    }

    @Override
    public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        String name = ctx.getText();
        if (!obfuscatedVarNames.containsKey(name)) {
            String newName = makeStringFromBitmask(obfuscatedVarNames.size() + dummyVarNames.size());
            currentBlockVarNames.add(newName);
            obfuscatedVarNames.put(name, newName);
        }
        rewriter.replace(ctx.start, ctx.stop, obfuscatedVarNames.get(name));
    }

    @Override public void enterBlock(JavaParser.BlockContext ctx) {
    }

    @Override public void exitBlock(JavaParser.BlockContext ctx) {
        currentBlockVarNames.clear();
    }

    @Override public void enterBlockStatement(JavaParser.BlockStatementContext ctx) {
        switch (random.nextInt(3)) {
            case 0:
                return;
            case 1:
                if (dummyVarNames.size() + obfuscatedVarNames.size() >= (1 << (template.length() - 1)))
                    return;
                String randomVar = makeStringFromBitmask(obfuscatedVarNames.size() + dummyVarNames.size());
                currentBlockVarNames.add(randomVar);
                dummyVarNames.add(randomVar);
                String value = "";
                switch (random.nextInt(3)) {
                    case 0:
                        value = " int " + randomVar + " = " + Integer.toString(random.nextInt()) + ";";
                        break;
                    case 1:
                        value = " double " + randomVar + " = " + Double.toString(random.nextDouble()) + ";";
                        break;
                    case 2:
                        value = " boolean " + randomVar + " = " + Boolean.toString(random.nextBoolean()) + ";";
                        break;
                }
                rewriter.insertAfter(ctx.stop, value);
                break;
            case 2:
                switch (random.nextInt(2)) {
                    case 0:
                        String retrieved = (String)currentBlockVarNames.toArray()[random.nextInt(currentBlockVarNames.size())];
                        rewriter.insertAfter(ctx.stop, " " + retrieved + " = " + retrieved + ";");
                        break;
                    case 1:
                        retrieved = (String)currentBlockVarNames.toArray()[random.nextInt(currentBlockVarNames.size())];
                        rewriter.insertAfter(ctx.stop,
                                " " + retrieved + " = " + retrieved + " == " + retrieved + " ? " + retrieved + " : " + retrieved + ";");
                        break;
                }
        }
    }

    @Override
    public void enterPrimary(JavaParser.PrimaryContext ctx) {
        if (ctx.Identifier() != null && obfuscatedVarNames.containsKey(ctx.Identifier().getText()))
            rewriter.replace(ctx.start, ctx.stop, obfuscatedVarNames.get(ctx.Identifier().getText()));
    }

    private String makeTemplate(int count) {
        StringBuilder sb = new StringBuilder();
        sb.append(random.nextInt(2) == 1 ? 'I' : 'O');
        for (int i = 0; i < count - 1; i++) {
            sb.append(random.nextInt(2) == 1 ? 'I' : 'O');
        }
        return sb.toString();
    }

    private String makeStringFromBitmask(int bitmask) {
        StringBuilder sb = new StringBuilder();
        sb.append(template.charAt(0));
        for (int i = 1; i < template.length(); i++) {
            switch (template.charAt(i)) {
                case 'O' :
                    sb.append((bitmask & (1 << (i - 1))) > 0 ? 'O' : '0');
                    break;
                case 'I' :
                    sb.append((bitmask & (1 << (i - 1))) > 0 ? 'I' : '1');
                    break;
            }
        }
        return sb.toString();
    }
}
