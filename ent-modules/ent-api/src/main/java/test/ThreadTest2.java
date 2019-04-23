package test;

public class ThreadTest2 {

	private static int number;
	private static boolean ready;
	
	private static class ReaderThread extends Thread{

		@Override
		public void run() {
			System.out.println(ready);
			while(!ready)
				Thread.yield();
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		new ReaderThread().start();
		ready = true;
		number = 2;
	}
}
