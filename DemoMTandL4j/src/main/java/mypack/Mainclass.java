 package mypack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Mainclass {

	public static void main(String[] args) {
		
		System.out.println("In Main Method");
		Users user =new Users("kalpesh","123456");
	    System.out.println("Starting Executor Service");
		ExecutorService exec= Executors.newFixedThreadPool(5);
		exec.execute(new Test(user));
		for(int i=0;i<5;i++)
		exec.execute(new Test());
		System.out.println("Shutting down Executor Service");
		exec.shutdown();
		
		
	}

}
