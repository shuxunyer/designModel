package code56.template;

/**
 * @author shuxun
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserver2 update msg");
    }
}
