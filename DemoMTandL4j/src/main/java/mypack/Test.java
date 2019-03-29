package mypack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test implements Runnable
{
	private static Object lock1=new Object();
	private static Object lock2=new Object();
	int i=1;
    boolean valid;
    static boolean validit;
	
	private static Logger logger=LogManager.getLogger(Test.class);

	
	//No-args constructor
	public Test()
	{
		System.out.println("Test default Constructor : "+Thread.currentThread());
	}
	
	//validating the user credential
	public boolean validate(Users s)
	{
		if((s.getUsername()=="kalpesh") && (s.getPassword()=="123456"))
			return true;
		return false;
			
	}
	
	
	public Test(Users s)
	{
	 valid=validate(s);
	}
	
	
	@Override
	public void run() 
	{
		//Printing the numbers only if user is valid
		 synchronized(lock1)
			{
			
				logger.info("In Printit"+Thread.currentThread());
				while(validit)
				{
					
					try {
						System.out.println(i++ +" "+Thread.currentThread());
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						logger.error("Thread Interupted");
					}
				
				}
				
			}
		 
		//checking the credential of the user and changing the value of Validit
		synchronized(lock2)
		{
	 logger.debug("In Doit"+Thread.currentThread());
	          if(valid)
			{
				
				try {
					 	validit=true;
					 	System.out.println("in Validate()"+Thread.currentThread());
					 	logger.debug("Sleeping :"+Thread.currentThread());
						Thread.sleep(1000);
						logger.debug("Active :"+Thread.currentThread());
						validit =false;
					} 
				catch (InterruptedException e) {
							// TODO Auto-generated catch block
							logger.error("Thread Interupted");
						
				}
			} 	  	
		}
	}
}



