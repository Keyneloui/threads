package com.revature.multithreading;

public class ThreadClass extends Thread{
	ThreadClass()
	   {
	     super("my extending thread");
	     System.out.println("my thread created" + this);
	     start();
	   }
	   public void run()
	   {
	     try
	     {
	        for (int i=0 ;i<10;i++)
	        {
	           System.out.println("Printing the count " + i);
	           Thread.sleep(1000);
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("My thread run is over" );
	   }
	}
	

