 package mypack;
 
 
 

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kalpesh.manersure
 *
 */

public class Mainclass {

	public static void main(String[] args) {
		
		Users user =new Users("kalpesh","123456");
		ExecutorService exec= Executors.newFixedThreadPool(2);
		exec.execute(new Test(user));
		exec.execute(new Test());
		System.out.println("In main method");
		
		Thread t1=new Thread(new Test(user));
		Thread t2=new Thread(new Test());
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();
	}

}
