package Ch08_Design_Patterns;

import java.util.Calendar;

//工廠模式
public class TestDemo {

	public static void main(String[] args) {
		// 直接利用呼叫方法的方式去建立Product物件
		Product product = Factory.getProduct();
		// Java API中的Calendar也是用這種方式
		Calendar cal = Calendar.getInstance();
		

	}

}
