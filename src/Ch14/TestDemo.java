package Ch14;

public class TestDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Start");
		
		TestThread thread1 = new TestThread("thread1");
		TestThread thread2 = new TestThread("thread2");
		TestThread thread3 = new TestThread("thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join(); // .join()可以設定該執行續先行完成在進行下一個
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		// 在使用runnable時要用Thread去接， 並將已經實作的Runnable介面作為引數給Thread(Class)
//		Thread runnable1 = new Thread(new TestRunnable("runnable1"));
//		Thread runnable2 = new Thread(new TestRunnable("runnable2"));
//		Thread runnable3 = new Thread(new TestRunnable("runnable3"));
//		
//		runnable1.start();
//		runnable2.start();
//		runnable3.start();
//		
		/////////////////////////////////////////////

		
		
		System.out.println("Main Thread End");
	}

}
