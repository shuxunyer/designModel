package code16.good;

import code16.common.AlertRule;
import code16.common.Notification;

public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
