package com.ibm.training.threads;

public class PrimeCounterThread extends Thread{

	int start;
	int end;
	int count = 0;
	
	public PrimeCounterThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}



	@Override 
	public void run() {
		System.out.println("Beginning to count primes from "+start+" to "+end+" in "+Thread.currentThread().getName());
		
		for(int i = start; i <= end; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		
		System.out.println("Finished counting in "+Thread.currentThread().getName());
	}
	
	public static boolean isPrime(long num) {
		if (num <= 2) {
			return true;
		}
		for (long i = 2; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int getCount() {
		return count;
	}
}
