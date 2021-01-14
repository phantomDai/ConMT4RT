package utl;

import testsuite.TestSuite;
import testsuite.TestSuiteFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 打印产生的测试用例
 */
public class PrintTestCase {

    public static void printAll(){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < Constants.TestSuiteNames.length; i++) {
            for (int j = 1; j <= 30; j++) {
                stringBuffer.append("待测对象是：" + Constants.TestSuiteNames[i] +
                        "种子是：" + String.valueOf(j) + "\n");
                stringBuffer.append("测试用例数目为1的测试用例集：" + "\n");
                List<String[]> testSuite1 = TestSuiteFactory.getTestSuite(Constants.TestSuiteNames[i],
                        "1", j);

                for (int k = 0; k < testSuite1.size(); k++) {
                    stringBuffer.append("test case" + String.valueOf(k) + "：");
                    for (int l = 0; l < testSuite1.get(k).length; l++) {
                        stringBuffer.append(" " + testSuite1.get(k)[l] + " ");
                    }
                    stringBuffer.append("\n");
                }

                stringBuffer.append("测试用例数目为5的测试用例集：" + "\n");
                List<String[]> testSuite5 = TestSuiteFactory.getTestSuite(Constants.TestSuiteNames[i],
                        "5", j);
                for (int k = 0; k < testSuite5.size(); k++) {
                    stringBuffer.append("test case" + String.valueOf(k) + "：");
                    for (int l = 0; l < testSuite5.get(k).length; l++) {
                        stringBuffer.append(" " + testSuite5.get(k)[l] + " ");
                    }
                    stringBuffer.append("\n");
                }
                stringBuffer.append("测试用例数目为25的测试用例集：" + "\n");
                List<String[]> testSuite25 = TestSuiteFactory.getTestSuite(Constants.TestSuiteNames[i],
                        "25", j);

                for (int k = 0; k < testSuite25.size(); k++) {
                    stringBuffer.append("test case" + String.valueOf(k) + "：");
                    for (int l = 0; l < testSuite25.get(k).length; l++) {
                        stringBuffer.append(" " + testSuite25.get(k)[l] + " ");
                    }
                    stringBuffer.append("\n");
                }
                stringBuffer.append("测试用例数目为125的测试用例集：" + "\n");
                List<String[]> testSuite125 = TestSuiteFactory.getTestSuite(Constants.TestSuiteNames[i],
                        "125", j);
                for (int k = 0; k < testSuite125.size(); k++) {
                    stringBuffer.append("test case" + String.valueOf(k) + "：");
                    for (int l = 0; l < testSuite125.get(k).length; l++) {
                        stringBuffer.append(" " + testSuite125.get(k)[l] + " ");
                    }
                    stringBuffer.append("\n");
                }
            }
        }
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(new File(Constants.PoolPath)));
            pw.write(stringBuffer.toString());
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PrintTestCase.printAll();
    }
}
