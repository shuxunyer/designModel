package code52.t1;

public class ConcreteObserverOne implements Observer {
    @Override
    public void updateMessage(Message message) {
        System.out.println("ConcreteObserverOne");
    }
}
