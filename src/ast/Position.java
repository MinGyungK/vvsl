package ast;
import org.antlr.v4.runtime.ParserRuleContext;

public class Position {

    private final int line;
    private final int column;

    public Position(int line, int column){
        this.line = line;
        this.column = column;
    }

    public static Position fromContext(ParserRuleContext ctx){
        return  new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }


}
