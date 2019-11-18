package com.revature.multithreading;

class Example extends Thread{
	   public void run()
	   {
			

	       for(int i=1;i<=11;i++)
	       {
	           try {
				sleep(200);
				System.out.println("Thread " + Thread.currentThread().getName() + " is running");
				 System.out.println(i);

			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	       }
	   }
	}
	class Test extends Thread{
	   public void run()
	   {
	         for(int i=65;i<=75;i++)
	       {
	           System.out.println((char)i);
	           try {
					sleep(200);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	       }
	   }
	}
	public class Main
	{
	    public static void main(String[] args) {
	    Example example = new Example();
	    Example example1 = new Example();
	    example.setName("HEADS");
	    example.start();
	    example1.setName("Tails");
	    example1.start(); 
	    }
	}