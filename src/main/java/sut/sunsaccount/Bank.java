package sut.sunsaccount;
import java.util.*;

public class Bank{

	// Total balance as recorded in bank.
	static int Bank_Total = 0;
	
	// all accounts
	static Account[] accounts; 
	
	// random numbers generator
	static Random Bank_random = new Random();
	
	// The number of accounts is randomly chosen from [10,110]
	static int NUM_ACCOUNTS = Math.abs((Bank_random.nextInt(1) + 2));

	public static boolean isKilled = false;
	
	/*
	 * Method main creates all the accounts from which the Bank accepts requests
	 * for actions. The total sum of the accounts is recorded on each
	 * action execution.
	 */
	public static void testBank(){
		isKilled = false;
		
		accounts = new Account[NUM_ACCOUNTS];

		// create all accounts
		for(int i = 0; i< NUM_ACCOUNTS; i++){
			accounts[i] = new Account(i);
		}


		// start all accounts
		for(int i = 0; i< NUM_ACCOUNTS; i++){
			accounts[i].start();
		}

		// wait for all threads (accounts) to die.
		for(int i = 0; i< NUM_ACCOUNTS; i++){
			if(accounts[i].isAlive()){
//				i = 0;
				// if some are alive, sleep for a while
				try{
					Thread.sleep(2);
				}catch(Exception exception){
				}
			}
		}	

		int Total_Balance = 0;
		// sum up all balances.
		for(int i = 0; i< NUM_ACCOUNTS; i++){
			Total_Balance += accounts[i].Balance;
		}	

		if(Bank_Total == Total_Balance){
			System.out.println("Records match.");}
		else{
			isKilled = true;
			System.out.println("ERROR: records don't match !!!");}
	}

	public static void Service(int id,int sum){
		accounts[id].Balance += sum;
		Bank_Total += sum;
	}


	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Bank.testBank();
		}
	}
}

