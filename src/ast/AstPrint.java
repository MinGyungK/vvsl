package ast;

public class AstPrint implements Visitor<String> {
    @Override
    public String visit(VvslPgrm p) {
        return p.getExpressions().accept(this);
    }

    @Override
    public String visit(Bool exp) {
        return exp.getValue()? "true":"false";
    }

    @Override
    public String visit(Int anInt) {
        return anInt.getValue()+"";
    }

    @Override
    public String visit(Id id) {
        return id.getValue();
    }

    @Override
    public String visit(BinOp binOp) {
        String left = binOp.getLeftexp().accept(this);
        String right = binOp.getRightexp().accept(this);
        String op = binOp.getOperator().toString();
        return left + op + right;

    }

    @Override
    public String visit(UnOpNot unOp) {
        String exp = unOp.getExpression().accept(this);
        String op = unOp.getOperation().toString();
        return exp + op;
    }

    @Override
    public String visit(UnOpMinPlus unOpMinPlus) {
        String exp = unOpMinPlus.getExpression().accept(this);
        String op = unOpMinPlus.getOperation().toString();
        return exp + op;
    }


}
