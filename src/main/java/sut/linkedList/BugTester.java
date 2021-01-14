package sut.linkedList;//BugTester.java

import java.util.*;

public class BugTester {

	public static int size;
	public static void test(String[] args) {
		size = 0;
		try
		{
			MyListBuilder mlist1;
			MyListBuilder mlist2;
			MyLinkedList mlst = null;

			int lT = 0;			//times to sleep
			int nT = 0;
			if ( args.length >= 1 )
			{
				if ( args.length > 1 && args[1].equals("1") )
				{
					if ( args.length >= 3 )
					{
						lT = Integer.parseInt(args[2]);
						nT = Integer.parseInt(args[3]);
					}
					//no else

					mlst = new MyLinkedList(lT,nT,args[0]);

					mlist1 = new MyListBuilder(mlst,0,5,true,args[0]);
					mlist2 = new MyListBuilder(mlst,5,10,true,args[0]);
				}
				else		//showing the case in the linked list of java's collection
				{
					LinkedList lst = new LinkedList();

					mlist1 = new MyListBuilder(lst,0,5,false,args[0]);
					mlist2 = new MyListBuilder(lst,5,10,false,args[0]);
				}

				Thread t1 = new Thread(mlist1);
				Thread t2 = new Thread(mlist2);

				t1.start();				//starting the two threads
				t2.start();

				t1.join();				//waiting for all threads to finish
				t2.join();
				size = mlst.size();

				System.out.println(size);
				mlist1.print();			//prints results to output file

				mlist1.empty();			//empties list
			}
			else
				System.out.println("Name of output file is required as argument!!!");


		} catch(InterruptedException e)
		{
			e.getMessage();
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.getMessage();
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			BugTester.test(new String[]{"/Users/phantom/javaDir/ConMT4RT/output/out.txt",  "1",  "1", "0"});
		}
	}

}

