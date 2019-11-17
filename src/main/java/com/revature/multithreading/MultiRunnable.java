package com.revature.multithreading;

public class MultiRunnable {
	 public static void main(String[] args) 
	    { 
	        
	        for (int i=10; i<=21; i++) 
	        { 
	            Thread object = new Thread(new MultiThreadRunnable()); 
	            object.start(); 
	        } 
	    } 

}
