package my.test;

public class main {
	private static int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Worker());
		Thread t2 = new Thread(new Worker());
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.print(number);		

	}
	
	public synchronized static void increaseNum()
	{
		number++;	
	}

}
