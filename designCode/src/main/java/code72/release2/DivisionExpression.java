package code72.release2;

public class DivisionExpression implements Expression {
    private Expression epr1;
    private Expression epr2;

    public DivisionExpression(Expression epr1, Expression epr2) {
        this.epr1 = epr1;
        this.epr2 = epr2;
    }

    @Override
    public long interpret() {
        return this.epr1.interpret() / this.epr2.interpret();
    }
}
