package my.test;

public class Worker implements Runnable {

	@Override
	public void run() {
		for (int i = 0;i<3000;i++){
			main.increaseNum();			
		}
			
		
	}	


}
