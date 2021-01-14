package sut.account;


import testsuite.TestSuiteFactory;
import utl.Constants;
import utl.PrintResults;

import java.util.List;

public class TestAccount {

    public void testAccount(String numOfTestCase){
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
            List<String[]> testSuite = TestSuiteFactory.getTestSuite("TestSuite4Account", numOfTestCase, i);
            while(!isKilled){
                for (int j = 0; j < testSuite.size(); j++) {
                    counter++;
                    ManageAccount.num=2;
                    ManageAccount[] bank=new ManageAccount[ManageAccount.num];
                    String[] accountName = testSuite.get(j);
                    for (int k=0; k < ManageAccount.num; k++){
                        bank[k]=new ManageAccount(accountName[k],100);
                        ManageAccount.accounts[k].print();
                    }
                    for (int l=0; l < ManageAccount.num; l++){
                        bank[l].start();
                    }
                    for (int m=0; m < ManageAccount.num; m++){
                        try{
                            bank[m].join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("The final values:");
                    ManageAccount.printAllAccounts();
                    boolean less = false, more = false;
                    for (int n=0; n < ManageAccount.num; n++){
                        if(ManageAccount.accounts[n].amount < 300){
                            less = true;
                        }
                        else if(ManageAccount.accounts[n].amount > 300){
                            more = true;
                        }
                    }
                    long endTime = System.currentTimeMillis();
                    //判断是否揭示故障
                    if (less || more){
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
            PrintResults.printResults("Account", stringBuffer.toString());
        }
    }

    public static void main(String[] args) {
        new TestAccount().testAccount(Constants.NUMOFTESTCASE1);
        new TestAccount().testAccount(Constants.NUMOFTESTCASE5);
        new TestAccount().testAccount(Constants.NUMOFTESTCASE25);
        new TestAccount().testAccount(Constants.NUMOFTESTCASE125);
    }
}
