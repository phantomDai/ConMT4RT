package testsuite;

import utl.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static utl.Constants.condicate4Account;

/**
 * 生成Account的测试用例，包括5、25、125个测试用例集
 * Account的测试用例的输入是账户名字
 */
public class TestSuite4Account implements TestSuite{


    /**
     * 产生包含1个测试用例的测试用例集,每一个测试用例包含两个账户名称
     * @return
     */
    public static List<String[]> getTestSuite1(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        while(true){
            String[] tempArray = new String[2];
            if (tempList.size() == 1){
                break;
            }else {
                tempArray[0] = condicate4Account[random.nextInt(26)];
                boolean flag = false;
                while(!flag){
                    String tempStr = condicate4Account[random.nextInt(26)];
                    if (!tempArray[0].equals(tempStr)){
                        tempArray[1] = tempStr;
                        break;
                    }else {
                        continue;
                    }
                }
                tempList.add(tempArray);
            }
        }
        return tempList;
    }

    /**
     * 产生包含5个测试用例的测试用例集,每一个测试用例包含两个账户名称
     * @return
     */
    public static List<String[]> getTestSuite5(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        while(true){
            String[] tempArray = new String[2];
            if (tempList.size() == 5){
                break;
            }else {
                tempArray[0] = condicate4Account[random.nextInt(26)];
                boolean flag = false;
                while(!flag){
                    String tempStr = condicate4Account[random.nextInt(26)];
                    if (!tempArray[0].equals(tempStr)){
                        tempArray[1] = tempStr;
                        break;
                    }else {
                        continue;
                    }
                }
                tempList.add(tempArray);
            }
        }
        return tempList;
    }

    /**
     * 产生包含25个测试用例的测试用例集
     * @return
     */
    public static List<String[]> getTestSuite25(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        while(true){
            String[] tempArray = new String[2];
            if (tempList.size() == 25){
                break;
            }else {
                tempArray[0] = condicate4Account[random.nextInt(26)];
                boolean flag = false;
                while(!flag){
                    String tempStr = condicate4Account[random.nextInt(26)];
                    if (!tempArray[0].equals(tempStr)){
                        tempArray[1] = tempStr;
                        break;
                    }else {
                        continue;
                    }
                }
                tempList.add(tempArray);
            }
        }
        return tempList;
    }

    /**
     * 产生包含125个测试用例的测试用例集
     * @return
     */
    public static List<String[]> getTestSuite125(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        while(true){
            String[] tempArray = new String[2];
            if (tempList.size() == 125){
                break;
            }else {
                tempArray[0] = condicate4Account[random.nextInt(26)];
                boolean flag = false;
                while(!flag){
                    String tempStr = condicate4Account[random.nextInt(26)];
                    if (!tempArray[0].equals(tempStr)){
                        tempArray[1] = tempStr;
                        break;
                    }else {
                        continue;
                    }
                }
                tempList.add(tempArray);
            }
        }
        return tempList;
    }
}
