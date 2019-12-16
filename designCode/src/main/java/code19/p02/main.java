package code19.p02;

public class main {
    public static void main(String[] args) {
        MessageSender messageSender =new SmsSender();
        Notification notification =new Notification(messageSender);
        //...
    }

}
