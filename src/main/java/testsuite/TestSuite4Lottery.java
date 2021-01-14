package testsuite;

import utl.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestSuite4Lottery implements TestSuite{

    public static List<String[]> getTestSuite1(int seed){
        Random random = Constants.getRandomObj(seed);
        String[] tempArray = new String[]{Constants.outPutFilePath, "little"};
        List<String[]> tempList = new ArrayList<String[]>();
        tempList.add(tempArray);
        return tempList;

    }

    public static List<String[]> getTestSuite5(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 5; i++) {
            String[] tempArray = new String[]{Constants.outPutFilePath,"little"};
            tempList.add(tempArray);
        }
        return tempList;
    }

    public static List<String[]> getTestSuite25(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 25; i++) {
            String[] tempArray = new String[]{Constants.outPutFilePath,"little"};
            tempList.add(tempArray);
        }
        return tempList;
    }

    public static List<String[]> getTestSuite125(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 125; i++) {
            String[] tempArray = new String[]{Constants.outPutFilePath,"little"};
            tempList.add(tempArray);
        }
        return tempList;
    }
}
