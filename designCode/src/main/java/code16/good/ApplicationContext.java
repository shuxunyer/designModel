package code16.good;

import code16.common.AlertRule;
import code16.common.Notification;

/**
 * ApplicationContext是一个单例类，
 * 负责alert的创建，组装(AlertRule,Notification)
 * 和初始化(Alert的handlers添加各种扩展的Alerthandler)
 * <p>
 * 基于重构之后的代码，如果再添加之前说的功能：每秒钟接口超时请求个数超过某个最大阈值就告警，
 * 该如何改动代码
 * <p>
 * 1 在ApiStatInfo类中添加新的属性 timeoutCount
 * 2 添加新的扩展类 TimeOutAlertHandler
 * 3 在applicationContext的initializeBeans方法中添加TimeOutAlertHandler的初始化
 * 4 在使用Alert类的check()函数时，需要给入参ApiStatInfo设置timeoutCount属性值
 */
public class ApplicationContext {
    private Alert alert;
    private AlertRule rule;
    private Notification notification;

    public Alert getAlert() {
        return alert;
    }

    private void initializeBeans() {
        alert = new Alert();
        rule = new AlertRule();
        notification = new Notification();

        TpsAlertHandler tpsAlertHandler = new TpsAlertHandler(rule, notification);
        alert.addHandler(tpsAlertHandler);
        ErrorAlertHandler errorAlertHandler = new ErrorAlertHandler(rule, notification);
        alert.addHandler(errorAlertHandler);
    }

    //构造函数私有化
    private ApplicationContext() {
        initializeBeans();
    }

    //饿汉式
    private static final ApplicationContext context = new ApplicationContext();

    //供外部调用的
    public static ApplicationContext getInstance() {
        return context;
    }


}
