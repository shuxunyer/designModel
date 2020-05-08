package code72.release3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shuxun
 */
public class AlertRuleInterpreter {

    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map stats) {
        return expression.interpret(stats);
    }


    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 100 || key4 == 88";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map stats = new HashMap<>(3);
        stats.put("key1", 101L);
        stats.put("key3", 22L);
        stats.put("key4", 89L);
        boolean alert = interpreter.interpret(stats);
        System.out.println(alert);
    }

}
