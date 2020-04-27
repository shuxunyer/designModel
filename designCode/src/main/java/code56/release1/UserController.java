package code56.release1;

import code56.PromotionService;
import code56.UserService;

public class UserController {

    private UserService userService;

    private PromotionService promotionService;

    public long register(String telephone, String password) {
        long userId = userService.register(telephone, password);
        promotionService.issueNewUserExperienceCash(userId);
        return userId;
    }
}
