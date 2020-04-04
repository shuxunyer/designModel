package code41;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGenerator5 {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

    //用法
//    IdGenerator5.INSTANCE.getId();
}
