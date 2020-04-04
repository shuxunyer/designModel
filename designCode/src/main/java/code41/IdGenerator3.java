package code41;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator3 {
    private AtomicLong id = new AtomicLong(0);

    private static IdGenerator3 instance;

    private IdGenerator3() {
    }

    public static IdGenerator3 getInstance() {
        if (instance == null) {
            synchronized (IdGenerator3.class) {//类级别的锁
                if (instance == null) {
                    instance = new IdGenerator3();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
