package code56.release2;

import code56.PromotionService;

/**
 * @author shuxun
 */
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        System.out.println("RegPromotionObserver,userId=" + userId);
        promotionService.issueNewUserExperienceCash(userId);
    }
}
