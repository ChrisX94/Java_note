package Ch05;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str.charAt(1));

	
	}
	
	public static void test1() {
		int[]x[] = {{1,2}, {3,4,5},{6,7,8,9}};
		int[][] y = x;
		System.out.println(y[2][1]);
		
		for(int[] i :x) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}
	
	public static void arr() {
		int[] num1 = {1,2,3};
		int[] num2 = new int[3];
		int [][] td = new int[2][2];
		td[0][0]= 1;
		int[][]td2 = {{9,4,8,7},{9,4,0}};
		int[] num3 = Arrays.copyOf(num1, num1.length);
		for(int i = 0; i < num3.length; i++)
			System.out.println(num3[i]);
		
	}
}
