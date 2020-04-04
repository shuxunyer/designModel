package code52.t1;

public class ConcreteObserverTwo implements Observer {
    @Override
    public void updateMessage(Message message) {
        System.out.println("ConcreteObserverTwo");
    }
}
