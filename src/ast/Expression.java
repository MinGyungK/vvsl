package ast;

public abstract class Expression extends Node {

   @Override
   abstract public <T> T accept(Visitor<T> visitor);
}
