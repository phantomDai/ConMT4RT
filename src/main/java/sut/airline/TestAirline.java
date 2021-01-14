package sut.airline;

import testsuite.TestSuiteFactory;
import utl.Constants;
import utl.PrintResults;

import java.util.List;

public class TestAirline {

    public void testAirline(String numOfTestCase){
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
            List<String[]> testSuite = TestSuiteFactory.getTestSuite("TestSuite4Airline", numOfTestCase, i);
            while(!isKilled){
                for (int j = 0; j < testSuite.size(); j++) {
                    counter++;
                    AirlineTickets airline = new AirlineTickets(Integer.valueOf(testSuite.get(j)[0]));
                    try{
                        airline.makeBookings();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    long endTime = System.currentTimeMillis();
                    if (airline.numberOfSeatsSold != airline.maximumCapacity) {
                        isKilled = true;
                        stringBuffer.append("使用的测试用例:" + String.valueOf(counter) + ";" +
                                "用时:" + String.valueOf(endTime - startTime) + "\n");
                        break;
                    }else {
                        if ((endTime - startTime) >= Constants.timeThreshold){
                            isKilled = true;
                            stringBuffer.append("repetition" + String.valueOf(i) + ":" +
                                    "使用的测试用例:" + String.valueOf(counter) + ";" +
                                    "用时:" + String.valueOf(endTime - startTime) + "\n");
                            break;
                        }else {
                            continue;
                        }
                    }
                }
            }
            PrintResults.printResults("Airline", stringBuffer.toString());
        }
    }

    public static void main(String[] args) {
        new TestAirline().testAirline(Constants.NUMOFTESTCASE1);
    }


}
