package synchronization;

public class Table {
	public static synchronized void table(int n) {
		//synchronized(this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		//}
	}
}
