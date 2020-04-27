package code56.template;

/**
 * @author shuxun
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserver1 update msg");
    }
}
