package Ch8_GarbageCollection;

public class TestDemo {
	public static void main(String[] args) {
		GC gc1 = new GC("gc1");
		GC gc2 = new GC("gc2");
		GC gc3 = new GC("gc3");

		// 將這些變數轉指定空值
		gc1 = null;
		gc2 = null;
		gc3 = null;

		// 這裡呼叫的是System.gc() Java的資源回收機置
		System.gc();
		
		// 	以下是觀察結果用
		try {
			Thread.sleep(9000); //
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
