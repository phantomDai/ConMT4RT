package sut.peterson;

public class Peterson {
	
	final static int COUNT = 1;
	public static int flag1;
	public static int flag2;
	public static int turn;
	public static int x;


	public static boolean tt1 = false;
	public static boolean tt2 = false;

	
	public static void test() {
		tt1 = false;
		tt2 = false;
		flag1 = 0;
		flag2 = 0;
		turn = 0;
		x = 0;
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				int count = 0;
				flag1 = 1;
				turn = 2;
				while(flag2 == 1 && turn ==2){
					if(count++ > COUNT)break;
				}
				x = 1;
				if (x != 1){
					tt1 = true;
				}
				flag1 = 0;
				System.out.println("线程1" + tt1);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			//@Override
			public void run() {
				int count = 0;
				flag2 = 1;
				turn = 1;
				while(flag1 == 1 && turn ==1){
					if(count++ > COUNT)break;
				}
				x = 2;
				if (x != 2){
					tt2 = true;
				}
				flag2 = 0;
				System.out.println("线程2" + tt2);
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
