package testsuite;

import utl.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 测试用例的有MAX的值构成
 */
public class TestSuite4Counter implements TestSuite{

    /**
     * 产生包含1个测试用例的测试用例集,每一个测试用例一个MAX的值
     * @return
     */
    public static List<String[]> getTestSuite1(int seed){
        Random random = Constants.getRandomObj(seed);
        String[] tempArray = new String[1];
        tempArray[0] = String.valueOf(random.nextInt(5) + 4);
        List<String[]> returnList = new ArrayList<String[]>();
        returnList.add(tempArray);
        return returnList;
    }

    /**
     * 产生包含5个测试用例的测试用例集,每一个测试用例一个MAX的值
     * @return
     */
    public static List<String[]> getTestSuite5(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> returnList = new ArrayList<String[]>();
        for (int i = 0; i < 5; i++) {
            String[] tempArray = new String[1];
            tempArray[0] = String.valueOf(random.nextInt(5) + 4);
            returnList.add(tempArray);
        }

        return returnList;
    }

    /**
     * 产生包含25个测试用例的测试用例集,每一个测试用例一个MAX的值
     * @return
     */
    public static List<String[]> getTestSuite25(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> returnList = new ArrayList<String[]>();
        for (int i = 0; i < 25; i++) {
            String[] tempArray = new String[1];
            tempArray[0] = String.valueOf(random.nextInt(5) + 4);
            returnList.add(tempArray);
        }

        return returnList;
    }

    /**
     * 产生包含125个测试用例的测试用例集,每一个测试用例一个MAX的值
     * @return
     */
    public static List<String[]> getTestSuite125(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> returnList = new ArrayList<String[]>();
        for (int i = 0; i < 125; i++) {
            String[] tempArray = new String[1];
            tempArray[0] = String.valueOf(random.nextInt(5) + 4);
            returnList.add(tempArray);
        }

        return returnList;
    }




}
