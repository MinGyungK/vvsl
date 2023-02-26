import ast.AstPrint;
import ast.Node;
import gen.vvslParser;
import gen.vvslLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.AntlrToAst;

import java.io.IOException;

public class Main {


    public static void main(String[] a) throws IOException {
        CharStream input = CharStreams.fromFileName("test.vvsl");
        vvslLexer lexer= new vvslLexer(input);
        CommonTokenStream lexemes = new CommonTokenStream(lexer);
        vvslParser parser = new vvslParser(lexemes);
        Node ast = parser.p().accept(new AntlrToAst());

        System.out.println(ast.accept(new AstPrint()));
    }









}
