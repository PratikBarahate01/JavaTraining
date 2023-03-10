package thread;


public class ThreadLambdaExample extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
	
		Thread t = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t.start();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread...");
			Thread.sleep(1000);
		}
	}
	
	
}
