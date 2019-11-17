package com.revature.multithreading;

public class MultiThread {

	public static void main(String[] args) {
	//	int n = 8; // Number of threads
		for (int i = 0; i < 8; i++) {
			Multithreading object = new Multithreading();
			object.start();
		//	object.getName();
		}
	}

}
