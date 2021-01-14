package testsuite;

import utl.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * 测试用例是numOfTickets
 */
public class TestSuite4Airline implements TestSuite{


    /**
     * 生成一个测试用例
     * @return
     */
    public static List<String[]> getTestSuite1(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        String[] tempArray = new String[1];
        tempArray[0] = String.valueOf(random.nextInt(9) + 2);
        tempList.add(tempArray);
        return tempList;
    }

    /**
     * 生成5个测试用例
     * @return
     */
    public static List<String[]> getTestSuite5(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 5; i++) {
            String[] tempArray = new String[1];
            tempArray[0] = String.valueOf(random.nextInt(9) + 2);
            tempList.add(tempArray);
        }
        return tempList;
    }

    /**
     * 生成25个测试用例
     * @return
     */
    public static List<String[]> getTestSuite25(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 25; i++) {
            String[] tempArray = new String[1];
            tempArray[0] = String.valueOf(random.nextInt(9) + 2);
            tempList.add(tempArray);
        }
        return tempList;
    }

    /**
     * 生成125个测试用例
     * @return
     */
    public static List<String[]> getTestSuite125(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 125; i++) {
            String[] tempArray = new String[1];
            tempArray[0] = String.valueOf(random.nextInt(3) + 2);
            tempList.add(tempArray);
        }
        return tempList;
    }
}
