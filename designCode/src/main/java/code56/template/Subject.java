package code56.template;

/**
 * @author shuxun
 */
public interface Subject {
    /**
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * @param message
     */
    void notifyObservers(Message message);
}
