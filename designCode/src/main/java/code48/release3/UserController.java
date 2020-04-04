package code48.release3;

import code48.UserVo;
import code48.release2.IUserController;

public class UserController {
    //...省略其他属性和方法...

    public UserVo login(String telephone, String password) {
        //...省略login逻辑...
        //...返回UserVo数据...
        return new UserVo();
    }

    public UserVo register(String telephone, String password) {
        //...省略register逻辑...
        //...返回UserVo数据...
        return new UserVo();
    }
}
