package Ch09_Collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("test1");
		set.add("test2");
		set.add("test3");

		// Set不會按照順序
		for (String s : set)
			System.out.print(s + " ");
		
		System.out.println();
		
		set.remove("test2");
		
		for (String s : set)
			System.out.print(s + " ");
		
		System.out.println();
		
		System.out.println(set.size());
	}

}
