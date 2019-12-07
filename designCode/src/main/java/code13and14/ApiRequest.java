package code13and14;

/**
 * 将 token、AppID、时间戳拼接到 URL 中，形成新的 URL；
 * 解析 URL，得到 token、AppID、时间戳等信息；
 */
public class ApiRequest {
    private String baseUrl;
    private String token;
    private String appId;
    private long timestamp;

    public ApiRequest(String baseUrl, String token, String appId, long timestamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    /**
     * 解析 URL，得到 token、AppID、时间戳等信息；
     */

    public static ApiRequest buildFromUrl(String url) {
        return null;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
