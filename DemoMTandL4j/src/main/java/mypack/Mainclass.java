 package mypack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Mainclass {

	public static void main(String[] args) {
		
		Users user =new Users("kalpesh","123456");
		ExecutorService exec= Executors.newFixedThreadPool(6);
		exec.execute(new Test(user));
		for(int i=0;i<5;i++)
		exec.execute(new Test());
		
		
	}

}
