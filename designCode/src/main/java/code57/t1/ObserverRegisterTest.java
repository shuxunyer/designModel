package code57.t1;

import code57.ObserverAction;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author shuxun
 */
public class ObserverRegisterTest {
    ObserverRegister observerRegister = new ObserverRegister();

    @Test
    public void t3() {
        t2();

        System.out.println("========f3============");
        List<ObserverAction> observerActionList = observerRegister.getMatchedActions(new PMsg());
        for (ObserverAction observerAction :
                observerActionList) {
            System.out.println(observerAction.toString());
        }
    }


    @Test
    public void t2() {
        observerRegister.register(new AObserver());
        observerRegister.register(new BObserver());
        observerRegister.register(new CObserver());

        ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registerMap = observerRegister.getRegister();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registerMap.entrySet()) {
            Class<?> eventType = entry.getKey();
            System.out.println("eventType=" + eventType);
            CopyOnWriteArraySet<ObserverAction> eventActions = entry.getValue();
            for (ObserverAction observerAction : eventActions) {
                System.out.println(observerAction.toString());
            }

        }
    }

    @Test
    public void t1() {
        Class<? extends AObserver> aClass = new AObserver().getClass();
        List<Method> annotatedMethod = observerRegister.getAnnotatedMethod(aClass);
        for (Method method :
                annotatedMethod) {
            System.out.println("method.name=" + method.getName());
        }
    }
}
