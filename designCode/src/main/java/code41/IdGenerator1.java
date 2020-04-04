package code41;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator1 {
    private AtomicLong id = new AtomicLong(0);

    private static final IdGenerator1 idGenerator1 = new IdGenerator1();

    private IdGenerator1() {
    }

    public static IdGenerator1 getInstatnce() {
        return idGenerator1;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    //IdGenerator1使用举例
//    long id =IdGenerator1.getInstatnce().getId();
}