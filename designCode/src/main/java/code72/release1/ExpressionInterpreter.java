package code72.release1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shuxun
 */
public class ExpressionInterpreter {
    private Deque<Long> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.trim().split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1) / 2; i++) {
            numbers.addLast(Long.parseLong(elements[i]));
        }

        for (int i = (length + 1) / 2; i < length; i++) {
            String operator = elements[i];
            long result = 0;
            long number1 = numbers.pollFirst();
            long number2 = numbers.pollFirst();
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
                default:
                    throw new RuntimeException("Expression is invalid: " + expression);
            }
            numbers.addFirst(result);
        }
        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }
        return numbers.pop();
    }

    public static void main(String[] args) {
        String expression = "8 3 2 4 - + *";
        ExpressionInterpreter expressionInterpreter = new ExpressionInterpreter();
        long result = expressionInterpreter.interpret(expression);
        System.out.println("result=" + result);
    }
}
