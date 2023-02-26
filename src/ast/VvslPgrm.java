package ast;
import java.util.List;

public class VvslPgrm extends Node{
    private final Expression expressions;

    public Expression getExpressions() { return expressions; }

    public VvslPgrm(Expression expressions){
        this.expressions = expressions;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
