package thread;

public class B implements Runnable{
	
	
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("welcome to ust...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
