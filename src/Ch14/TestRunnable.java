package Ch14;
// 因為Java無法直接多重繼承所以已需要的時候可以實作Runnable(Interface)並實作run()來使用在已經有繼承其他的類別的類別
public class TestRunnable implements Runnable{
	
	private String name;
	
	public TestRunnable(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + "implements Runnable");
	}
	
	
}
