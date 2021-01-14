package testsuite;

import utl.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 测试用例：{"fileName", "1", "0<=lt<=2", "0<=nt<=2"}
 */
public class TestSuite4LinkedList implements TestSuite{


    public static List<String[]> getTestSuite1(int seed){
        Random random = Constants.getRandomObj(seed);
        String[] tempArray = new String[]{Constants.outPutFilePath,"1",
                String.valueOf(random.nextInt(2)),String.valueOf(random.nextInt(2))};
        List<String[]> tempList = new ArrayList<String[]>();
        tempList.add(tempArray);
        return tempList;

    }

    public static List<String[]> getTestSuite5(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 5; i++) {
            String[] tempArray = new String[]{Constants.outPutFilePath,"1",
                    String.valueOf(random.nextInt(2)),String.valueOf(random.nextInt(2))};
            tempList.add(tempArray);
        }
        return tempList;
    }

    public static List<String[]> getTestSuite25(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 25; i++) {
            String[] tempArray = new String[]{Constants.outPutFilePath,"1",
                    String.valueOf(random.nextInt(2)),String.valueOf(random.nextInt(2))};
            tempList.add(tempArray);
        }
        return tempList;
    }

    public static List<String[]> getTestSuite125(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 125; i++) {
            String[] tempArray = new String[]{Constants.outPutFilePath,"1",
                    String.valueOf(random.nextInt(2)),String.valueOf(random.nextInt(2))};
            tempList.add(tempArray);
        }
        return tempList;
    }

}
