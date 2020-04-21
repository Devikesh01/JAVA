import java.lang.*;

class Demo implements Runnable
{
	// This method is considered as thread code
	public void run()
	{
		synchronized(this)
		{	
			for(int i=0;i<=5;i++)
			{
				System.out.print(i);
			}
			
		}
	}
}

class Thread_Synchronized
{
	public static void main(String args[])
	{
		// Creating object of demo class which extends thread class
		Demo d = new Demo();
		//Demo d1=new Demo();
		
		// Create Thread class object and attach to above object		
		Thread t  = new Thread(d);
		Thread t1=new Thread(d);

		System.out.println("Inside main");

		// Start the execution of thread
		t.start();
		t1.start();
	}
}