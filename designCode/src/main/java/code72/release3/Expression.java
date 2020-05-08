package code72.release3;

import java.util.Map;

public interface Expression {

    public boolean interpret(Map<String,Long> stat);
}
