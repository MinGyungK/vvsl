package ast;

public class Bool extends Expression{

    private final boolean value;

    public Bool(Position position, boolean value) {
        this.position = position;
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
