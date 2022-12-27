package synchronization;

public class Main {
	public static void main(String[] args) {
		//Table e = new Table();
//		MyThread t1 = new MyThread(e);
//		MyThread1 t2 = new MyThread1(e);
		MyThread t1 = new MyThread();
		MyThread1 t2 = new MyThread1();
		t1.start();
		t2.start();
	}
}
