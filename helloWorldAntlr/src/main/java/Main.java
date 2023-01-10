import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String source = "src/test.txt";
            CharStream cs = fromFileName(source);
            helloLexer lexer = new helloLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            helloParser parser = new helloParser(token);
            ParseTree tree = parser.r();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
