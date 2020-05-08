package code72.release3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author shuxun
 */
public class OrExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String expressionStr) {
        String[] strExpressions = expressionStr.split("\\|\\|");
        for (String strExp : strExpressions) {
            expressions.add(new AndExpression(strExp));
        }
    }

    @Override
    public boolean interpret(Map<String, Long> stat) {
        for (Expression expression : expressions) {
            if (expression.interpret(stat)) {
                return true;
            }
        }
        return false;
    }
}
