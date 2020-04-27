package code56.release2;

/**
 * @author shuxun
 */
public class RegNotificationObserver implements RegObserver {
    @Override
    public void handleRegSuccess(long userId) {
        System.out.println("RegNotificationObserver userId=" + userId);
    }
}
