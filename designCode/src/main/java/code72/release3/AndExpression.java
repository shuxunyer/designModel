package code72.release3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AndExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public AndExpression(String expressionStr) {
        String[] strExpressions = expressionStr.split("&&");
        for (String strExp : strExpressions) {
            if (strExp.contains(">")) {
                expressions.add(new GtExpression(strExp));
            } else if (strExp.contains("<")) {
                expressions.add(new LtExpression(strExp));
            } else if (strExp.contains("=")) {
                expressions.add(new EqExpression(strExp));
            } else {
                throw new RuntimeException("Expression is invalid: " + strExp);
            }
        }
    }

    @Override
    public boolean interpret(Map<String, Long> stat) {
        for (Expression expression : expressions) {
            if (!expression.interpret(stat)) {
                return false;
            }
        }
        return true;
    }
}
