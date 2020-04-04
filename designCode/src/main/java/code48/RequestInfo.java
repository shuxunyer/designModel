package code48;

public class RequestInfo {

    public String action;

    public long responseTime;

    public long startTimestamp;

    public RequestInfo(String action, long responseTime, long startTimestamp) {
        this.action = action;
        this.responseTime = responseTime;
        this.startTimestamp = startTimestamp;
    }
}
