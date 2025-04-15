package Ch21_practice;

import java.util.Scanner;

/*
 *  使用者輸入陣列的大小，然後依序輸入整數
• 過濾出陣列中最大值和最小值
 * */


public class P4_Max_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr = {32,5,33,2};	
		System.out.println("Please enter lenth of an array:");
		int input = sc.nextInt();
		
		int len = 4;
		int[] arr = new int[len];
		for(int i = 0 ; i < len; i++) {
		System.out.println("Please enter numbers:");
		arr[i] = sc.nextInt();
		
		}

		
		int max = arr[0];
		int min = arr[0];
		
		
		for(int i =1 ; i < arr.length; i++ ) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max: " + max + ", Min: " + min);

		
		
		
		sc.close();
		

	}

}
