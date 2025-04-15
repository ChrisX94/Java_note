package Ch21_practice;

/*程式根據指定的行數
 * 列印出一個由星號組成的金字塔形狀
 * 輸入行數4
   *
  ***
 *****
*******
 
 * */
import java.util.Scanner;

public class P1_PrintoutPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the rows:");
		int input = sc.nextInt();
		printStars(input);
		printStars2(input);
		
		sc.close();
	}
	
	public static void printStars(int rows) {
//		int input = 4;
		for (int i = 1; i <= rows; i++) {
			// first printout no need a blank therefore j-1
			for (int j = rows - 1; j >= i; j--) {
				System.out.print(" ");
			}
			// printout *
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	

	public static void printStars2(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
