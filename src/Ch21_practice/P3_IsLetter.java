package Ch21_practice;


/*
 *  計算字串中所有英文字母的數量（不區分大小寫）
• 特殊符號與空白不能計算
• 提示：Character.isLetter
 * */



import java.util.Scanner;

public class P3_IsLetter {

	public static void main(String[] args) {
//		String str = "Hello World!";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter text:");
		String str = sc.next();
		
		
		int count = 0;
		
		for(int i =0 ; i < str.length(); i++) {
			char l = str.charAt(i);
//			System.out.println(Character.isLetter(l));
			if(Character.isLetter(l)) {
				count++;
			}
		}
		System.out.println(count);

		sc.close();
	}

}
