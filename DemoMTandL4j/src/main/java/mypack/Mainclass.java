 package mypack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass {

	public static void main(String[] args) {
		
		Users user =new Users("kalpesh","123456");
		ExecutorService exec= Executors.newFixedThreadPool(2);
		exec.execute(new Test(user));
		exec.execute(new Test());
	}

}
