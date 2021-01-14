package utl;

import java.util.Random;

public class MyRandom {

    public static Random random = new Random();


    public static int nextInt(int i) {
        return random.nextInt(i);
    }
}
