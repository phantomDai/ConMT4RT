package sut.HierarchyExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {

	String name;
	boolean active = true;
	Company parent;
	List children = new ArrayList();

	public static boolean isKilled = false;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString() {
		return name 
			//+ " " + (active?"A":"I")
			//+ " (" + parent + ")"
			;
	}
	
	public synchronized boolean isActive() {
		return active;
	}
	
	public synchronized boolean setParent(Company newParent) {
		if(newParent == null) {
			this.parent = null;
			return true;
		} else if(newParent.isActive() 
				|| !this.isActive()) {
			newParent.children.add(this);
			if(parent!=null) {
				parent.children.remove(this);
			}			
			parent = newParent;
			return true;
		} else {
			return false;		
    	}
	}
	
	public synchronized boolean setActive() {
		if(parent == null || parent.isActive()) {
			active = false;
			return true;
		} else {
			return false;
		}			
	}
	synchronized boolean isChildrenInactive() {
		for(Iterator i=children.iterator(); i.hasNext();) {
			Company child = (Company)i.next();
			if(child.isActive())
				return false;
		}
		return true;
	}
	
	public synchronized boolean setInactive() {
		if(isChildrenInactive()) {
			active = false;
			return true;			
		} else {
			return false;
		}
	}
	
	static Company clients[] = new Company[] {
		new Company(), new Company()
	};
	
	public static void test(String[] args) {
		isKilled = false;
		clients[0].setName(args[0]);
		clients[1].setName(args[1]);

		Thread t1 =  new Thread() {
			public void run() {
				clients[0].setParent(clients[1]);
			}
		};
		Thread t2 =  new Thread() {
			public void run() {
				clients[1].setInactive();
			}
		};
		
		t2.start();
		t1.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		boolean b = clients[0].parent == null
			|| clients[1].isActive()
			|| !clients[0].isActive();

		if (clients[1].isActive() && !clients[0].isActive()){
			isKilled = true;
		}
		if (!b){
			System.out.println(b);
		}

	}

	public static void main(String[] args) {
		args = new String[]{"A", "B"};
		for (int i = 0; i < 1000000; i++) {
			Company.test(args);
		}
	}

}
