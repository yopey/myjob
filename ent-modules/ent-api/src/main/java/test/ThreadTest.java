package test;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		while  (Ticket.count > 0) {
			mt.run();
		}
		
		ThreadLocal<T>
	}

}

class MyThread implements Runnable{
	public void run() {
		Ticket.count --;
		System.out.println("还剩下" + Ticket.count);
	}
}

class Ticket {
	static int count = 100;
}