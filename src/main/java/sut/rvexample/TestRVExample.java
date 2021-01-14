package sut.rvexample;

import sut.sunsaccount.Bank;
import utl.Constants;
import utl.PrintResults;

public class TestRVExample {

    public void testRVExample(){
        //执行测试用例集
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("测试用例集的测试用例数目为1" + ":\n");
        for (int i = 1; i <= Constants.repetitionTimes; i++) {
            stringBuffer.append("repetition" + String.valueOf(i) + ":");
            //是否揭示故障的标识
            boolean isKilled1 = false;
            //测试用例的计数器
            int counter = 0;
            //记录开始执行测试用例的时间
            long startTime = System.currentTimeMillis();
            //开始执行测试用例
            //测试用例集
//            List<String[]> testSuite = TestSuiteFactory.getTestSuite("TestSuite4Account", numOfTestCase, i);
            while (!isKilled1) {
                counter++;
                RVExample.test();
                long endTime = System.currentTimeMillis();
                if(RVExample.isKilled){
                    isKilled1 = true;
                    stringBuffer.append("用时:" + String.valueOf(endTime - startTime) +
                            ";使用的测试用例:" + String.valueOf(counter) + "\n");
                }else {
                    if ((endTime - startTime) >= Constants.timeThreshold){
                        isKilled1 = true;
                        stringBuffer.append("用时:" + String.valueOf(endTime - startTime) +
                                ";使用的测试用例:N/A\n");
                    }else {
                        continue;
                    }
                }
            }
        }
        PrintResults.printResults("RVExample", stringBuffer.toString());
    }

    public static void main(String[] args) {
        new TestRVExample().testRVExample();
    }


}
