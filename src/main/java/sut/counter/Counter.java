package sut.counter;

public class Counter
{
    public static int counter;
    public  static int MAX=5;

    public static void setMAX(int theMAX) {
        MAX = theMAX;
    }

    public static void test(String[] args)
    {
        setMAX(Integer.valueOf(args[0]));
        counter = 0;
        Thread inc = new Thread(new Runnable() {

            public void run() {
                for (int i=0; i<MAX; i++){
                    counter = counter +1;
                }
            }
        });
        Thread dec = new Thread(new Runnable() {
            public void run() {
                for (int i=0; i<MAX; i++){
                    counter = counter - 1;
                }
            }
        });

        inc.start();
        dec.start();

        try {
            inc.join();
            dec.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Counter.test(new String[]{"6"});
        }
    }

}