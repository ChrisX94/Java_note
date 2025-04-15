package Ch22;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		String str = getStr();
//		String result = str.toUpperCase();
//		System.out.println(result);
		
//		//原本只能用if去判斷
//		String str2 = getStr();
//		String result2 = "";
//		if(str2 != null) {
//			result2 = str2.toUpperCase();
//		}else {
//			result2 = "It's null";
//		}
		// 先建立一個 Optional物件並用Optional.ofNullable(str) 來建立一個實體
		Optional<String> maybeString = Optional.ofNullable(str);
//		// 這裡直接用orElse("t's null") 裡面輸入如果是空值的話要給的值
//		String result3 = maybeString.orElse("It's null");
//		System.out.println(result3);
		
//		// 這裡用ifPresent(s -> System.out.println(s)); 可以指定如果不是空值的話則要做的事
//		maybeString.ifPresent(s -> System.out.println(s));
		
		// 這裡用map(用在每個元素根據提供的函數逕行轉換)(lambda)
		String result4 = maybeString.map(String :: trim).map(String:: toUpperCase).orElse("It's Null");
		System.out.println(result4);
		
		String result5 = maybeString.filter(s -> s.length() > 20).orElse("length is under 20");
		System.out.println(result5);
		
	}

	public static String getStr() {
		String str = "Test For Optional  ";
//		String str = null;  // java.lang.NullPointerException
		return str;
	}
}
