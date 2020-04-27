package code56.template;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuxun
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
