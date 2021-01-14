package testsuite;

import utl.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static utl.Constants.condicate4Account;

/**
 * 测试用例的格式是："/Users/phantom/javaDir/CMTJmcr/output/output", "little"，"缓冲的数目"
 */
public class TestSuite4BufWriter implements TestSuite{


    /**
     * 产生包含1个测试用例的测试用例集,每一个测试用例包含两个账户名称
     * @return
     */
    public static List<String[]> getTestSuite1(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        tempList.add(new String[]{"/Users/phantom/javaDir/CMTJmcr/output/output", "little",
        String.valueOf(random.nextInt(1000) + 1000)});
        return tempList;
    }

    /**
     * 产生包含5个测试用例的测试用例集,每一个测试用例包含两个账户名称
     * @return
     */
    public static List<String[]> getTestSuite5(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 5; i++) {
            tempList.add(new String[]{"/Users/phantom/javaDir/CMTJmcr/output/output", "little",
                    String.valueOf(random.nextInt(1000) + 1000)});
        }
        return tempList;
    }

    /**
     * 产生包含25个测试用例的测试用例集,每一个测试用例包含两个账户名称
     * @return
     */
    public static List<String[]> getTestSuite25(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 25; i++) {
            tempList.add(new String[]{"/Users/phantom/javaDir/CMTJmcr/output/output", "little",
                    String.valueOf(random.nextInt(1000) + 1000)});
        }
        return tempList;
    }

    /**
     * 产生包含125个测试用例的测试用例集,每一个测试用例包含两个账户名称
     * @return
     */
    public static List<String[]> getTestSuite125(int seed){
        Random random = Constants.getRandomObj(seed);
        List<String[]> tempList = new ArrayList<String[]>();
        for (int i = 0; i < 125; i++) {
            tempList.add(new String[]{"/Users/phantom/javaDir/CMTJmcr/output/output", "little",
                    String.valueOf(random.nextInt(1000) + 1000)});
        }
        return tempList;
    }


}
