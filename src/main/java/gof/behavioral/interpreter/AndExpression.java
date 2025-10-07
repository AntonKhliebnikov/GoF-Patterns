package gof.behavioral.interpreter;

public class AndExpression implements Expression{
    private final Expression left;
    private final Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Sneakers context) {
        return left.interpret(context) && right.interpret(context);
    }
}