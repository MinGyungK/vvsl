package ast;

public class BinOp extends Expression{

    private final Expression left;
    private final Expression right;
    private final OpBin op;

    public BinOp(Position position, Expression left, OpBin op, Expression right) {
        this.position = position;
        this.left = left;
        this.right = right;
        this.op = op;
    }

    public Expression getLeftexp() { return left; }
    public Expression getRightexp() { return right; }
    public OpBin getOperator() { return op; }


    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
