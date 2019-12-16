package code19.p01;

public abstract class TestCase {
    public void run() {
        if (doTest()) {
            System.out.println("true...");
        } else {
            System.out.println("false...");
        }
    }

    public abstract boolean doTest();
}
