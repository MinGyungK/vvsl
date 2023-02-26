package ast;

public interface Visitor <T>{
    T visit(VvslPgrm p);
    T visit(Bool exp);
    T visit(Int exp);
    T visit(Id id);
    T visit(BinOp binOp);
    T visit(UnOpNot unOp);
    T visit(UnOpMinPlus unOpMinPlus);
    T visit(Tab tab);
}
