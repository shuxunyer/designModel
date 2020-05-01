package code57.t1;

import code57.ObserverAction;
import com.google.common.base.Preconditions;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author shuxun
 */
public class ObserverRegister {
    private ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>>
            register = new ConcurrentHashMap<>();

    public ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> getRegister() {
        return register;
    }

    public void register(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> allObserverActions = getAllObserverActions(observer);
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : allObserverActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> observerActions = register.get(eventType);
            if (observerActions == null) {
                register.putIfAbsent(eventType, new CopyOnWriteArraySet<ObserverAction>());
                observerActions = register.get(eventType);
            }
            observerActions.addAll(eventActions);
        }
    }

    public List<ObserverAction> getMatchedActions(Object event) {
        List<ObserverAction> observerActions = new ArrayList<>();
        Class<?> postedEventType = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : register.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            /*
                eventType 是否是postedEventType的子类或子接口
                eventType 与postedEventType类型一致
             */
            if (postedEventType.isAssignableFrom(eventType)) {
                observerActions.addAll(eventActions);
            }
        }
        return observerActions;
    }


    public Map<Class<?>, Collection<ObserverAction>> getAllObserverActions(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = new HashMap<>();
        Class<?> clazz = observer.getClass();
        for (Method method : getAnnotatedMethod(clazz)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> parameterType = parameterTypes[0];
            if (observerActions.get(parameterType) == null) {
                observerActions.put(parameterType, new ArrayList<>());
            }
            observerActions.get(parameterType).add(new ObserverAction(observer, method));
        }
        return observerActions;
    }

    public List<Method> getAnnotatedMethod(Class<?> clazz) {
        List<Method> annotatedMethod = new ArrayList<Method>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Preconditions.checkArgument(parameterTypes.length == 1, "syso");
                annotatedMethod.add(method);
            }
        }
        return annotatedMethod;
    }
}
