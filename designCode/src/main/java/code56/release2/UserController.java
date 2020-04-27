package code56.release2;

import code56.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuxun
 */
public class UserController {
    private UserService userService;
    private List<RegObserver> regObserverList = new ArrayList<RegObserver>();

    public void setRegObservers(List<RegObserver> regObserverList) {
        regObserverList.addAll(regObserverList);
    }

    public void register(String telephone, String pwd) {
        long userId = userService.register(telephone, pwd);
        for (RegObserver regObserver : regObserverList) {
            regObserver.handleRegSuccess(userId);
        }
    }
}
