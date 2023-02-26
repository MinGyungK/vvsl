package ast;

import java.util.List;

public class Tab extends Expression{

    private final List<Expression> expressionList;

    public Tab(Position position, List<Expression> expressionList){
        this.expressionList = expressionList;
        this.position = position;
    }

    public List<Expression> getExpressionList() { return expressionList; }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
