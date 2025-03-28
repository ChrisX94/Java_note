package Ch08_Generics;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {

	public static void main(String[] args) {
		// 在<>中放入資料型別,建立物件方式如下
		Foo<String> fooObj = new Foo<String>();
		fooObj.setFoo("Test String");
		System.out.println(fooObj.getFoo());
		// Sample2
		Foo<Double> fooObj2 = new Foo<Double>();
		fooObj2.setFoo(94.87);
		System.out.println(fooObj2.getFoo());
		
		/* Wildcard 通配字元
		* 共變性
		* *************繼承於List的子類別或實作List介面的類別
		* *************List的父類別
		*/
//		Foo<? extends List> FooObj3 = new Foo<List>();
//		Foo<? super ArrayList> FooObj3 = new Foo<List>();
//		Foo<? extends List> FooObj3 = new Foo<ArrayList>();
		
		
	}

}
