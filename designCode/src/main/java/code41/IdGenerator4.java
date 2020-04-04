package code41;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 静态内部类，当外部类IdGenerator4被加载的时候
 * 并不会创建SingletonHolder实例对象
 * 只有当调用getInstance方法时，SingletonHolder实例对象才会被加载,这个时候才会创建instance
 * instance的唯一性、创建过程的线程安全性，都由JVM来保证。
 *
 * 所以这种实现方式既保证了线程安全，又保证了延迟加载
 */
public class IdGenerator4 {
    private AtomicLong id = new AtomicLong(0);

    private IdGenerator4() {
    }

    private static class SingletonHolder {
        private static final IdGenerator4 instance = new IdGenerator4();
    }

    public static IdGenerator4 getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
