package testsuite;

import java.util.Random;

public class TestSuite {
    public Random random;

    public TestSuite(int seed){
        random = new Random(seed);
    }
}
