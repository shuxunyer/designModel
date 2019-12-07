package code13and14;

import java.sql.Time;

/**
 * 把 URL、AppID、密码、时间戳拼接为一个字符串；
 * 对字符串通过加密算法加密生成 token；
 * 根据时间戳判断 token 是否过期失效；
 * 验证两个 token 是否匹配；
 */
public class AuthToken {
    private static final long Default_expired_time_interval = 1 * 60 * 1000;

    private String token;
    private long createTime;
    private long expiredTimeInteval = Default_expired_time_interval;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInteval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInteval = expiredTimeInteval;
    }

    public static AuthToken generate(String url, String appid, String pwd,
                           long createTime) {
        String assemblyed =  url.concat(appid).concat(pwd).concat(String.valueOf(createTime));;
        String generateToken =Crypto.getMD5String(assemblyed);
        return new AuthToken(generateToken,createTime);
    }

    public boolean isExpired() {
        long distance = createTime - System.currentTimeMillis();
        if (distance < expiredTimeInteval) {
            return true;
        }
        return false;
    }

    public String getToken() {
        return this.token;
    }

    public boolean match(AuthToken authToken) {
        if (token.equals(authToken.token)) {
            return true;
        }
        return false;
    }
}
