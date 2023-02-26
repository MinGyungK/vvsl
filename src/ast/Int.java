package ast;

public class Int extends Expression{

    private final int value;

    public Int(Position position, int value){
            this.position = position;
            this.value = value;
    }

    public int getValue() { return value; }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
