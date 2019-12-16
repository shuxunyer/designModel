package code19.p01;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.ArrayList;
import java.util.List;

public class JunitApplication {
    private static List<TestCase> testCases = new ArrayList<TestCase>();

    public static void register(TestCase testCase) {
        testCases.add(testCase);
    }

    public static void main(String[] args) {
        for (TestCase testCase : testCases) {
            testCase.run();
        }
    }
}
