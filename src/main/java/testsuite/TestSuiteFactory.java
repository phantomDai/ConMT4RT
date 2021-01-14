package testsuite;

import java.util.List;

/**
 * 测试用例集的工厂，负责根据需要生产相应的测试用例集
 */
public class TestSuiteFactory {

    public static List<String[]> getTestSuite(String testSuiteName, String numOfTestCases, int seed){
         List<String[]> testSuite = null;
        if (testSuiteName.equals("TestSuite4Account")){
            if (numOfTestCases.equals("1")){
                testSuite = TestSuite4Account.getTestSuite1(seed);
            }else if (numOfTestCases.equals("5")){
                testSuite = TestSuite4Account.getTestSuite5(seed);
            }else if (numOfTestCases.equals("25")){
                testSuite = TestSuite4Account.getTestSuite25(seed);
            }else {
                testSuite = TestSuite4Account.getTestSuite125(seed);
            }

        }else if (testSuiteName.equals("TestSuite4Airline")){
            if (numOfTestCases.equals("1")){
                testSuite = TestSuite4Airline.getTestSuite1(seed);
            }else if (numOfTestCases.equals("5")){
                testSuite = TestSuite4Airline.getTestSuite5(seed);
            }else if (numOfTestCases.equals("25")){
                testSuite = TestSuite4Airline.getTestSuite25(seed);
            }else {
                testSuite = TestSuite4Airline.getTestSuite125(seed);
            }
        }else if (testSuiteName.equals("TestSuite4BufWriter")){
            if (numOfTestCases.equals("1")){
                testSuite = TestSuite4BufWriter.getTestSuite1(seed);
            }else if (numOfTestCases.equals("5")){
                testSuite = TestSuite4BufWriter.getTestSuite5(seed);
            }else if (numOfTestCases.equals("25")){
                testSuite = TestSuite4BufWriter.getTestSuite25(seed);
            }else {
                testSuite = TestSuite4BufWriter.getTestSuite125(seed);
            }
        }else if (testSuiteName.equals("TestSuite4Counter")){
            if (numOfTestCases.equals("1")){
                testSuite = TestSuite4Counter.getTestSuite1(seed);
            }else if (numOfTestCases.equals("5")){
                testSuite = TestSuite4Counter.getTestSuite5(seed);
            }else if (numOfTestCases.equals("25")){
                testSuite = TestSuite4Counter.getTestSuite25(seed);
            }else {
                testSuite = TestSuite4Counter.getTestSuite125(seed);
            }
        }else if (testSuiteName.equals("TestSuite4HierarchyExample")){
            if (numOfTestCases.equals("1")){
                testSuite = TestSuite4HierarchyExample.getTestSuite1(seed);
            }else if (numOfTestCases.equals("5")){
                testSuite = TestSuite4HierarchyExample.getTestSuite5(seed);
            }else if (numOfTestCases.equals("25")){
                testSuite = TestSuite4HierarchyExample.getTestSuite25(seed);
            }else {
                testSuite = TestSuite4HierarchyExample.getTestSuite125(seed);
            }
        }else if (testSuiteName.equals("TestSuite4LinkedList")){
            if (numOfTestCases.equals("1")){
                testSuite = TestSuite4LinkedList.getTestSuite1(seed);
            }else if (numOfTestCases.equals("5")){
                testSuite = TestSuite4LinkedList.getTestSuite5(seed);
            }else if (numOfTestCases.equals("25")){
                testSuite = TestSuite4LinkedList.getTestSuite25(seed);
            }else {
                testSuite = TestSuite4LinkedList.getTestSuite125(seed);
            }
        }else if (testSuiteName.equals("TestSuite4Lottery")){
            if (numOfTestCases.equals("1")){
                testSuite = TestSuite4Lottery.getTestSuite1(seed);
            }else if (numOfTestCases.equals("5")){
                testSuite = TestSuite4Lottery.getTestSuite5(seed);
            }else if (numOfTestCases.equals("25")){
                testSuite = TestSuite4Lottery.getTestSuite25(seed);
            }else {
                testSuite = TestSuite4Lottery.getTestSuite125(seed);
            }
        }
        return testSuite;
    }
}
