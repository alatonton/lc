package conc1114;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Exe {
	 public static void main(String args[]){

		 PrintFirst pf = new PrintFirst();
		 PrintSecond ps = new PrintSecond();
		 PrintThird pt = new PrintThird();
		 Foo foo = new Foo();
		 int waitFirst = 0;
		 int waitSecond = 0;
		 int waitThird = 0;

		 Runnable exeFirst = ()->{
			 try {
					Thread.sleep(waitFirst);
					foo.first(pf);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 };

		 Runnable exeSecond = ()->{
			 try {
				 	Thread.sleep(waitSecond);
				 	foo.second(ps);
			 	}catch(InterruptedException e) {
			 		e.printStackTrace();
			 }
		 };

		 Runnable exeThird = ()->{
			 try {
				 Thread.sleep(waitThird);
				 foo.third(pt);
			 }catch(InterruptedException e) {e.printStackTrace();}

		 };
		 ExecutorService exec = Executors.newFixedThreadPool(3);

		 exec.execute(exeFirst);
		 exec.execute(exeSecond);
		 exec.execute(exeThird);


	 }
}
