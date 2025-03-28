package Ch09_Collections;

import java.util.List;
import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		String str1 = "test1";
		String str2 = "test2";
		String str3 = "test3";
		
		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		
		for(String s: list)
			System.out.print(s+ " ");
		System.out.println();
		
		System.out.println(list.get(0));
		
		list.remove("test2");
		for(String s: list)
			System.out.print(s+ " ");
		
		System.out.println();
		
		System.out.println(list.size());
	}

}
