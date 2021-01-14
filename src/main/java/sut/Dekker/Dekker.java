package sut.Dekker;


import sut.peterson.Peterson;

public class Dekker {

	final static int N1 = 1;
	final static int N2 = 1;
	
	public static int flag1;
	public static int flag2;
	public static int turn;
	public static int x;

	public static boolean tt1 = false;
	public static boolean tt2 = false;

	public static void testDekker() {
		tt1 = false;
		tt2 = false;
		flag1 = 0;
		flag2 = 0;
		turn = 1;
		x = 0;
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				int n1 = 0;
				int n2 = 0;
				flag1 = 1;
				while(flag2==1){
					if(n2++ > N2)break;
					if (turn != 1) {
						flag1 = 0;
						while (turn!=1) {
							if(n1++ > N1)break;
						}
						flag1 = 1;
					}
					else{
						//break;
					}
				}
				
				//critical section
				x = 1;
				if(x != 1)
					tt1 = true;
				//assert(x==1);
				turn = 2;
				flag1 = 0;
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			

			public void run() {
				// TODO Auto-generated method stub
				int n1 = 0;
				int n2 = 0;
				
				flag2 = 1;
				while(flag1==1){
					if(n2++ > N2)break;
					if (turn != 2) {
						flag2 = 0;
						while (turn!=2) {
							if(n1++ > N1)break;
						}
						flag2 = 1;
					}
					else {
						//break;
					}
				}
				
				//critical section
				x = 2;
				if(x != 2)
					tt2 = true;
				//assert(x==2);
				turn = 1;
				flag2 = 0;
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}