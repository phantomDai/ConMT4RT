package sut.counter;

import sut.account.ManageAccount;
import testsuite.TestSuiteFactory;
import utl.Constants;
import utl.PrintResults;

import java.util.List;

public class TestCounter {
    public void testCounter(String numOfTestCase){
        //执行测试用例集
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("测试用例集的测试用例数目为" + numOfTestCase + ":\n");
        for (int i = 1; i <= Constants.repetitionTimes; i++) {
            stringBuffer.append("repetition" + String.valueOf(i) + ":");
            //是否揭示故障的标识
            boolean isKilled = false;
            //测试用例的计数器
            int counter = 0;
            //记录开始执行测试用例的时间
            long startTime = System.currentTimeMillis();
            //开始执行测试用例
            //测试用例集
            List<String[]> testSuite = TestSuiteFactory.getTestSuite("TestSuite4Counter", numOfTestCase, i);
            while(!isKilled){
                for (int j = 0; j < testSuite.size(); j++) {
                    counter++;
                    Counter.test(testSuite.get(j));
                    long endTime = System.currentTimeMillis();
                    //判断是否揭示故障
                    if (Counter.counter != 0){
                        System.out.println("揭示故障！");
                        isKilled = true;
                        stringBuffer.append("用时:" + String.valueOf(endTime - startTime) +
                                ";使用的测试用例:" + String.valueOf(counter) + "\n");
                        break;
                    }else {
                        if ((endTime - startTime) >= Constants.timeThreshold){
                            isKilled = true;
                            stringBuffer.append("用时:" + String.valueOf(endTime - startTime) +
                                    ";使用的测试用例:N/A\n");
                            break;
                        }else {
                            continue;
                        }
                    }
                }
            }
        }
        PrintResults.printResults("Counter", stringBuffer.toString());
    }

    public static void main(String[] args) {
        new TestCounter().testCounter(Constants.NUMOFTESTCASE1);
        new TestCounter().testCounter(Constants.NUMOFTESTCASE5);
        new TestCounter().testCounter(Constants.NUMOFTESTCASE25);
        new TestCounter().testCounter(Constants.NUMOFTESTCASE125);
    }

}
