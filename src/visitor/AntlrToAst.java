package visitor;

import ast.*;

import gen.vvslBaseVisitor;
import gen.vvslParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class AntlrToAst extends vvslBaseVisitor<Node> {

    private static Position position(ParserRuleContext ctx){
        return new Position(ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public Node visitExp_bool(vvslParser.Exp_boolContext ctx) {
        return new Bool(position(ctx), ctx.BOOL() != null);
    }

    @Override
    public Node visitExp_un_plus(vvslParser.Exp_un_plusContext ctx) {
        return new UnOpMinPlus(position(ctx), (Expression) ctx.exp().accept(this), OpUn.PLUS);
    }

    @Override
    public Node visitExp_un_min(vvslParser.Exp_un_minContext ctx) {
        return  new UnOpMinPlus(position(ctx), (Expression) ctx.exp().accept(this), OpUn.MINUS);
    }

    @Override
    public Node visitExp_un_not(vvslParser.Exp_un_notContext ctx) {
        return new UnOpNot(position(ctx), OpUn.NOT,(Expression) ctx.exp().accept(this));
    }

    private Node visitBinary(Position position, vvslParser.ExpContext left, String operator, vvslParser.ExpContext right) {
        Expression leftExp = (Expression) left.accept(this);
        Expression rightExp = (Expression) right.accept(this);
        OpBin op = switch (operator) {
            case "+" -> OpBin.ADD;
            case "-" -> OpBin.SUB;
            case "*" -> OpBin.MUL;
            case "/" -> OpBin.DIV;
            case "%" -> OpBin.MOD;
            case "^" -> OpBin.POW;
            case "<" -> OpBin.LT;
            case ">" -> OpBin.GT;
            case ">=" -> OpBin.GE;
            case "<=" -> OpBin.LE;
            case "!=" -> OpBin.DIFF;
            case "==" -> OpBin.EQ;
            case "&&" -> OpBin.AND;
            case "||" -> OpBin.OR;
            default -> throw new IllegalStateException("Unexpected value");
        };
        return new BinOp(position, leftExp, op, rightExp);
    }

    @Override
    public Node visitExp_paren(vvslParser.Exp_parenContext ctx) {
        return ctx.exp().accept(this);
    }


    @Override
    public Node visitExp_bin_bool(vvslParser.Exp_bin_boolContext ctx) {
        return visitBinary(position(ctx), ctx.exp(0), ctx.op.getText(), ctx.exp(1));
    }

    @Override
    public Node visitExp_ari(vvslParser.Exp_ariContext ctx) {
        return visitBinary(position(ctx), ctx.exp(0), ctx.op.getText(), ctx.exp(1));
    }

    @Override
    public Node visitExp_andor(vvslParser.Exp_andorContext ctx) {
        return visitBinary(position(ctx), ctx.exp(0), ctx.op.getText(), ctx.exp(1));
    }

    @Override
    public Node visitExp_comp(vvslParser.Exp_compContext ctx) {
        return visitBinary(position(ctx), ctx.exp(0), ctx.op.getText(), ctx.exp(1));
    }

    @Override
    public Node visitExp_int(vvslParser.Exp_intContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        return new Int(position(ctx),value);
    }

    @Override
    public Node visitExp_id(vvslParser.Exp_idContext ctx) {
        return new Id(position(ctx), ctx.ID().getText());
    }

    @Override
    public Node visitPgrm(vvslParser.PgrmContext ctx) {
        return ctx.exp().accept(this);
    }




}
