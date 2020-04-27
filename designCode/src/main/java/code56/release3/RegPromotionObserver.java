package code56.release3;

import code56.PromotionService;
import code56.release2.RegObserver;

/**
 * @author shuxun
 */
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService;


    @Override
    public void handleRegSuccess(long userId) {
        final long newUserId = userId;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                promotionService.issueNewUserExperienceCash(newUserId);
            }
        });
        thread.start();
    }
}
