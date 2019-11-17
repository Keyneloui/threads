package com.revature.multithreading;

public class MultiRunnable {
	public static void main(String[] args) {

		for (int i = 10; i <= 21; i++) {
			MultiThreadRunnable obj = new MultiThreadRunnable();
			Thread tobj = new Thread(obj);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tobj.start();
		}
	}

}
