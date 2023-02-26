package ast;

public class Id extends Expression{

    private final String value;

    public Id(Position position, String value){
        this.position = position;
        this.value = value;
    }

    public String getValue() { return value; }
    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
