package Ch11_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/* Lambda 
 * 定義函式介面的一種方式
 * 不用建立實作介面
 * 不用輸入方法名稱
 */
public class TestLambda {

	public static void main(String[] args) {
		// 目標型態 變數名稱 = lambda表達式  input -> body 
		Comparator<Integer> com = (x, y) -> x - y;
		int result = com.compare(94, 87);
		System.out.println(result);
		
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		// 這裡是用lambda去實作ArrayList的forEach方法 (變數名稱(代表list中的元素名稱 -> 要執行的動作))
		list.forEach(name -> System.out.println(name));
		
		
		///////////////////////////////////////////////////////////////////////////////////
		
		/* 使用靜態方法來定義還是介面實作
		 * 函式介面的實作參考某一個類別靜態方法
		 * 輸入與回傳的參數需一致
		 */
		
		// 目標型態 變數名稱 = lambda表達式  物件名稱 :: 方法名稱 
		Comparator<Integer> com2 = Math::subtractExact;
		int result2 = com2.compare(94, 87);
		System.out.println(result2);
	
	}

}
