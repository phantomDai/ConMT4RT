package utl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 记录程序的执行结果
 */
public class PrintResults {

    public static void printResults(String SUTName, String content){
        String path = Constants.resultsPath + File.separator + SUTName;
        PrintWriter printWriter = null;
        try{
            printWriter = new PrintWriter(new FileWriter(path,true));
            printWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            printWriter.close();
        }
    }
}
