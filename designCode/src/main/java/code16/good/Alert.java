package code16.good;

import java.util.ArrayList;
import java.util.List;

public class Alert {

    public List<AlertHandler> handlers = new ArrayList<AlertHandler>();

    public void addHandler(AlertHandler handler) {
        this.handlers.add(handler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : handlers) {
            handler.check(apiStatInfo);
        }
    }
}
