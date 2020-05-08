package code72.release2;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shuxun
 */
public class ExpressionInterpreter {
    private Deque<NumberExpression> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.trim().split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1) / 2; i++) {
            numbers.addLast(new NumberExpression(elements[i]));
        }
        long result = 0;
        Expression exp = null;
        for (int i = (length + 1) / 2; i < length; i++) {
            String operator = elements[i];
            NumberExpression number1 = numbers.pollFirst();
            NumberExpression number2 = numbers.pollFirst();
            switch (operator) {
                case "+":
                    exp = new AddExpresion(number1, number2);
                    break;
                case "-":
                    exp = new SubstractionExpresion(number1, number2);
                    break;
                case "*":
                    exp = new MultiplicationExpression(number1, number2);
                    break;
                case "/":
                    exp = new DivisionExpression(number1, number2);
                    break;
                default:
                    throw new RuntimeException("Expression is invalid: " + expression);
            }
            result = exp.interpret();
            numbers.addFirst(new NumberExpression(result));
        }
        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }
        return numbers.pop().interpret();
    }

    public static void main(String[] args) {
        String expression = "8 3 2 4 - + *";
        ExpressionInterpreter expressionInterpreter = new ExpressionInterpreter();
        long result = expressionInterpreter.interpret(expression);
        System.out.println("result=" + result);
    }
}
