package utl;

import java.io.File;
import java.util.Random;

/**
 * 记录该框架中涉及到的常量
 */
public class Constants {
    public static String[] condicate4Account = new String[]{"A", "B", "C", "D", "E", "F", "G",
            "H", "i", "G", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};

    public static String outPutFilePath = System.getProperty("user.dir") + File.separator +
            "output" + File.separator + "out.txt";

    public static String[] TestSuiteNames = new String[]{"TestSuite4Account", "TestSuite4Airline",
            "TestSuite4BufWriter", "TestSuite4Counter", "TestSuite4HierarchyExample",
            "TestSuite4LinkedList", "TestSuite4Lottery"};

    public static String PoolPath = System.getProperty("user.dir") + File.separator +
            "pool" + File.separator + "testSuites.txt";

    public static int repetitionTimes = 30;

    public static String resultsPath = System.getProperty("user.dir") + File.separator +
            "results";

    //持续运行的小时数
    public static long timeThreshold = 3600000 * 3;

    public static String NUMOFTESTCASE1 = "1";

    public static String NUMOFTESTCASE5 = "5";

    public static String NUMOFTESTCASE25 = "25";

    public static String NUMOFTESTCASE125 = "125";

    public static Random getRandomObj(int seed){
        Random random = null;
        switch (seed){
            case 1:
                random = new Random(1);
                break;
            case 2:
                random = new Random(2);
                break;
            case 3:
                random = new Random(3);
                break;
            case 4:
                random = new Random(4);
                break;
            case 5:
                random = new Random(5);
                break;
            case 6:
                random = new Random(6);
                break;
            case 7:
                random = new Random(7);
                break;
            case 8:
                random = new Random(8);
                break;
            case 9:
                random = new Random(9);
                break;
            case 10:
                random = new Random(10);
                break;
            case 11:
                random = new Random(11);
                break;
            case 12:
                random = new Random(12);
                break;
            case 13:
                random = new Random(13);
                break;
            case 14:
                random = new Random(14);
                break;
            case 15:
                random = new Random(15);
                break;
            case 16:
                random = new Random(16);
                break;
            case 17:
                random = new Random(17);
                break;
            case 18:
                random = new Random(18);
                break;
            case 19:
                random = new Random(19);
                break;
            case 20:
                random = new Random(20);
                break;
            case 21:
                random = new Random(21);
                break;
            case 22:
                random = new Random(22);
                break;
            case 23:
                random = new Random(23);
                break;
            case 24:
                random = new Random(24);
                break;
            case 25:
                random = new Random(25);
                break;
            case 26:
                random = new Random(26);
                break;
            case 27:
                random = new Random(27);
                break;
            case 28:
                random = new Random(28);
                break;
            case 29:
                random = new Random(29);
                break;
            case 30:
                random = new Random(30);
                break;
            default:
                System.out.println("种子范围出错，请检查！");
        }
        return random;
    }

}
