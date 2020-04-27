package code56.release4;

import code56.UserService;
import code56.release2.RegObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author shuxun
 */
public class UserController {
    private UserService userService;
    private List<RegObserver> regObserverList = new ArrayList<RegObserver>();
    private Executor executor;

    public UserController(Executor executor) {
        this.executor = executor;
    }

    public void setRegObservers(List<RegObserver> regObserverList) {
        regObserverList.addAll(regObserverList);
    }

    public void register(String telephone, String pwd) {
        final long userId = userService.register(telephone, pwd);
        for (final RegObserver regObserver : regObserverList) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    regObserver.handleRegSuccess(userId);
                }
            });
        }
    }
}
