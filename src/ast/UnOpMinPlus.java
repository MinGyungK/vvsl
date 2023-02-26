package ast;

public class UnOpMinPlus extends Expression{

    private final Expression exp;
    private final OpUn op;

    public Expression getExpression() { return exp; }
    public OpUn getOperation() { return op; }

    public UnOpMinPlus(Position position, Expression exp, OpUn op) {
        this.position = position;
        this.exp = exp;
        this.op = op;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }

}
