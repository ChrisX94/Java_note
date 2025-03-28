package Ch08_Generics;

public class TestDemo2 {
// 這裡是示範沒有使用泛型的做法: Object 所有class的父類別
	public static void main(String[] args) {
		Object FooObj2 = new String();
		// 但每次都要向下轉型
		Object FooObj1 = new Integer("87");
		Integer Inte =  (Integer)FooObj1;  
	}

}
