package code72.release2;

public class SubstractionExpresion implements Expression {
    private Expression number1;
    private Expression number2;

    public SubstractionExpresion(Expression number1, Expression number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public long interpret() {
        return this.number1.interpret()-this.number2.interpret();
    }
}
