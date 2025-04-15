package Ch21_practice;
/*
 * 
 * • 請撰寫一個銀行ATM 操作存款系統，功能包含了
1. 存款
2. 取款
3. 查詢餘額
4. 退出
 * 
 * */

import java.util.Scanner;

public class P6_BankAccount {
	private static double balance = 0.0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int set = 0;
		while (true) {
			System.out.println("1. 存款\n" + "2. 取款\n" + "3. 查詢餘額\n" + "4. 退出\n" );
			set = sc.nextInt();
			if(set == 1) {
				System.out.println("Please Enter deposit amount: ");
				Double amount = sc.nextDouble();
				deposit(amount);
			}
			if(set == 2) {
				System.out.println("Please Enter withdraw amount: ");
				Double amount = sc.nextDouble();
				withdraw(amount);
			}
			if(set == 3) {
				System.out.println("The amount balance: " + getBalance());
			} 
			if(set == 4) {
				System.out.println("退出");
				break;
			}
			
		}

	}
	

    public static void deposit(double amount) {
    	if(amount > 0) {
    	balance += amount;
    	System.out.println("Deposit " + amount + " in the account, The balance: " + getBalance());
    	}else {
    		System.out.println(" Amount can not be under 0 and equal 0 ");
    	}
    }

    public static void withdraw(double amount) {
    	if(amount <= 0) {
    		System.out.println(" Amount can not be under 0 and equal 0 ");
    	}else if (amount > balance){
    		System.out.println("Transaction failed: Insufficient funds.");
    	}else {
    	balance -= amount;
    	System.out.println("Withdraw " + amount + " from the account, The balance: " + getBalance());}
    }

    public static double getBalance() {
    	return balance;
        
    }

}
