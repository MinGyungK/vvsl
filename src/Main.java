import ast.Node;
import gen.vvslParser;
import gen.vvslLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.AntlrToAst;

import java.io.IOException;
import java.io.InputStream;

public class Main {


    public static void main(String[] a) throws IOException {

        InputStream is = System.in;
        //récupère l’arbre parsé par Antlr
        ParseTree tree = parse(is);
        //le transfore en ast "Noeud"
        //grâce à notre visiteur
        Node ast = tree.accept(new AntlrToAst());


        LecteurGaucheDroite v = new LecteurGaucheDroite();
        ast.accept(v);
        TreePrinter v_ = new TreePrinter();
        System.out.println(ast.accept(v_));
        VisiteurProfondeur vp = new VisiteurProfondeur();
        System.out.println("\nprof : "+ast.accept(vp));

        //Modifier l’ast :
        RetourneEtMultiplie rem = new RetourneEtMultiplie();
        Node newAst = ast.accept(rem);
        System.out.println(newAst.accept(v_));
    }






    private static ParseTree parse(InputStream is) throws IOException{
        CharStream input = CharStreams.fromStream(is);
        vvslLexer lexer= new vvslLexer(input);
        CommonTokenStream lexemes = new CommonTokenStream(lexer);
        vvslParser parser = new vvslParser(lexemes);
        return parser.p();
    }


}

