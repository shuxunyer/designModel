package code72.release3;

import java.util.Map;

public class LtExpression implements Expression {
    private String key;
    private long value;

    public LtExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    public LtExpression(String strExp) {
        String[] elements = strExp.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].trim().equals("<")) {
            throw new RuntimeException("Expression is invalid: " + strExp);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }


    @Override
    public boolean interpret(Map<String, Long> stat) {
        if (stat.get(key) == null) {
            return false;
        }
        Long value = stat.get(key);
        return this.value > value;
    }
}
