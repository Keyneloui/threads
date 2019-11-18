package com.revature.multithreading;

public class Threading  extends Thread {
		public void run()
		{
			try {
				for(int i=0;i<3;i++)
				{
					System.out.println(i);
					Thread.sleep(600);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread is running");
		}
		public static void main(String[]args)
		{
			ThreadClass threadclass=new ThreadClass();
			threadclass.start();
			ThreadClass threadclass1=new ThreadClass();
			threadclass1.start();
			System.out.println("Name of the thread is :"+threadclass.getName());
			
		}

	}



