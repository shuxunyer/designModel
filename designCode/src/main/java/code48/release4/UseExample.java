package code48.release4;

import code48.release2.IUserController;
import code48.release2.UserControllerProxy;

public class UseExample {

    public static void main(String[] args) {
        //MetricsCollectorProxy使用举例
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController =
                (IUserController) proxy.createProxy(new UserController());
    }
}
