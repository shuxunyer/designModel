package code19.p02;

public class Notification {
    private MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String phone, String msg) {
        this.messageSender.send(phone, msg);
    }
}
