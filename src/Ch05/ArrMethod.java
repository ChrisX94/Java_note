package Ch05;
// Java Regular Expression
import java.util.regex.Pattern;

public class ArrMethod {
	static String str = "id, name, age";
	static String str2 = "abcdefghabcdefgh";
	static String str3 = "aabbcc112233AABBCC";
	static String str4 = "abc";
	static String str5 = "abc";

	public static void main(String[] args) {
		System.out.println(str);
		StrSplit(str);
//		StrTrim(str);
//		System.out.println(str2);
//		SubStr(str2);
//		IndexOf(str2);
//		lastIndSubStr(str2);
//		contains(str2);
//		System.out.println(str3);
//		replace(str3);
//		replaceAll(str3);
//		starstWithAndEnds(str3);
//		equals(str4,str5);
//		
		
	}

	private static void StrSplit(String str) {
		String[] aArr = str.split(",");
		for (String s : aArr)
			System.out.print(s + " ");
		System.out.println();
	}

	public static void StrTrim(String str) {
		String s = str.trim();
		System.out.print(s);
		System.out.println();
	}

	public static void SubStr(String str) {
		String s = str.substring(0, 4);
		System.out.println(s);
	}

	public static void IndexOf(String str) {
		int index = str.indexOf('b');
		System.out.println(index);
		int lastIndex = str.lastIndexOf("b");
		System.out.println(lastIndex);		
	}
	public static void lastIndSubStr(String str) {
		String s = str.substring(str.indexOf("b"), (str.lastIndexOf("b")+1));
		System.out.println(s);
	}
	public static void contains(String str) {
		boolean s = str.contains("abc");
		System.out.println(s);
	}
	public static void replace(String str) {
		String s = str.replace("a", "A");
		System.out.println(s);
	}
	public static void replaceAll(String str) {
		String s = str.replaceAll("\\d", "!");
		System.out.println(s);
		String s2 = str.replaceAll("[a-zA-z]", "!");
		System.out.println(s2);
	}
	public static void starstWithAndEnds(String str) {
		boolean starstWithT = (str.startsWith("a"));
		System.out.println(starstWithT);
		boolean starstWithF = (str.startsWith("s"));
		System.out.println(starstWithF);
		boolean enstWithT = (str.endsWith("C"));
		System.out.println(enstWithT);
		boolean enstWithF = (str.endsWith("a"));
		System.out.println(enstWithF);
	}
	
	public static void equals(String str, String str2) {
		boolean equals =  str.equals(str2);
		System.out.println(equals);
		
	}
	
	

}
