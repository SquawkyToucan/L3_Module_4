package threads;
// Below is a completed program that uses brute force to crack a 9-digit password. 

// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class BruteForceCracker {
	static long code = (long) (new Random().nextDouble() * Integer.MAX_VALUE);
	static long startTime;
	static long endTime;
	static float elapsedTime;
	static Thread[] threads = new Thread[20];
	public static void main(String[] args) {
		boolean unsolved = true;
		for(int i = 0; i < 20; i++) {
			int j = i;
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					startThread(j*100000000);
				}} );
		}
		for(int i = 0; i < 20; i++) {
			threads[i].start();
		}
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();
		
	}
	public static void startThread(int start) {
		while (!checkCode(start++))
			;
	}
	public static void finish() {
		endTime = System.currentTimeMillis();
		elapsedTime = (float) (endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
		for(int i = 0; i < 20; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static boolean checkCode(long p) {
		if (p == code) {
			System.out.println(code);
			finish();
			return true;
		} else {
			return false;
		}
	}
}
