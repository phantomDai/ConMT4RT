package sut.airline;


import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class AirlineTicketsTest {
    private AirlineTickets airline;
    public void makeBookings(int numTickets) throws Exception {




        airline = new AirlineTickets(numTickets);
        airline.makeBookings();
    }

    public void testAirline(String numOfTestCases){

        try{
            makeBookings(2);
            testSoldInvarient();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws Exception {
        AirlineTicketsTest airlineTest = new AirlineTicketsTest();

        airlineTest.test2ThreadsNotTooMany();

    }

    public void test2ThreadsNotTooMany() throws Exception {
         for (int i = 0; i < 1; i++) {
             long start = System.currentTimeMillis();

             long end = System.currentTimeMillis();
             String timeInfo = "执行原始测试用例的时间为:" + (end - start);

         }

    }






    public void testSoldInvarient() {
        if (airline.numberOfSeatsSold > airline.maximumCapacity) {
            PrintStream oldPrintStream = System.out; //将原来的System.out交给printStream 对象保存
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos)); //设置新的out
            System.out.println("Too many were sold! Number of tickets sold: " + airline.numberOfSeatsSold + " lager than max: " + airline.maximumCapacity);
            System.setOut(oldPrintStream);

            FileWriter fileWriter2 = null;
            try {

                fileWriter2 = new FileWriter("F:\\CMT\\output\\AirlineTickets.txt",true);
                fileWriter2.write("source output:"+"\n\n");
                fileWriter2.write(bos.toString());
                fileWriter2.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileWriter2!=null){
                    try{
                        fileWriter2.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }else if (airline.numberOfSeatsSold < airline.maximumCapacity) {
            PrintStream oldPrintStream = System.out; //将原来的System.out交给printStream 对象保存
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos)); //设置新的out
            System.out.println("Too few were sold! Number of tickets sold: " + airline.numberOfSeatsSold + " less than max: " + airline.maximumCapacity);
            System.setOut(oldPrintStream);

            FileWriter fileWriter2 = null;
            try {

                fileWriter2 = new FileWriter("F:\\CMT\\output\\AirlineTickets.txt",true);
                fileWriter2.write("source output:"+"\n\n");
                fileWriter2.write(bos.toString());
                fileWriter2.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileWriter2!=null){
                    try{
                        fileWriter2.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        else {
            PrintStream oldPrintStream = System.out; //将原来的System.out交给printStream 对象保存
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos)); //设置新的out
            System.out.println("Sold out "+ airline.numberOfSeatsSold+"!");
            System.setOut(oldPrintStream);

            FileWriter fileWriter2 = null;
            try {

                fileWriter2 = new FileWriter("F:\\CMT\\output\\AirlineTickets.txt",true);
                fileWriter2.write("source output:"+"\n\n");
                fileWriter2.write(bos.toString());
                fileWriter2.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileWriter2!=null){
                    try{
                        fileWriter2.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
