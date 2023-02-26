package ast;

public class AstPrint implements Visitor<String> {
    @Override
    public String visit(VvslPgrm p) {
        return null;
    }

    @Override
    public String visit(Bool exp) {
        return null;
    }

    @Override
    public String visit(Int exp) {
        return null;
    }

    @Override
    public String visit(Id id) {
        return null;
    }

    @Override
    public String visit(BinOp binOp) {
        return null;
    }

    @Override
    public String visit(UnOpNot unOp) {
        return null;
    }

    @Override
    public String visit(UnOpMinPlus unOpMinPlus) {
        return null;
    }

    @Override
    public String visit(Tab tab) {
        return null;
    }
}
