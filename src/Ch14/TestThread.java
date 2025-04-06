package Ch14;

//要使用多執行序要繼承Thread並Override run(), 如果沒有要繼承其他class時可用這個方式
public class TestThread extends Thread{
	
	private String name;
	
	public TestThread(String name) {
		this.name = name;
	}
	
	public void run(){
		System.out.println(name+ " Extends Thread Start");
		if("thread1".equals(name)) {
			Thread.yield(); // 會先把執行資源讓出來讓排程器先處理其他執行續但無法確定要等多久才會進行
		}else if("thread2".equals(name)){
			try {
				Thread.sleep(3000); // 這裡會直接進入到block的狀態等到設定的毫秒術後再執行
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+ " Running Extends Thread ");
		System.out.println(name+ " Extends Thread End");
	}
	

}
