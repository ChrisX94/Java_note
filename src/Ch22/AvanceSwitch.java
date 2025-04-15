package Ch22;
// java 8 unable to run
import java.util.Scanner;

public class AvanceSwitch {

	public static void main(String[] args) {

////		oldSwitch(6);
////		newSwitch(6);
////		newSwitch2();
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ordered amount: ");
//		int amount = sc.nextInt();
//		System.out.println("Ordered quantity: ");
//		int quantity = sc.nextInt();
//		
//		int discount = switch(quantity) {
//		case 1,2,3 -> {
//			int deduct = (int)(amount * 0.05);
//			System.out.println("Deduction: " + deduct);
//			yield deduct;
//		}
//		case 4,5,6 -> {
//			int deduct = (int)(amount * 0.1);
//			System.out.println("Deduction: " + deduct);
//			yield deduct;
//		}
//		case 7,8,9,10 -> {
//			int deduct = (int)(amount * 0.15);
//			System.out.println("Deduction: " + deduct);
//			yield deduct;
//		}
//		default->{
//			int deduct = (int)(amount * 0.2);
//			System.out.println("Deduction: " + deduct);
//			yield deduct;
//		}
//		};
//		amount -= discount;
//		System.out.println(amount);
//
	}
//
//	public static void newSwitch(int day) {
//		String weekday = switch (day) {
//		case 0 -> "Sunday";
//		case 1 -> "Monday";
//		case 2 -> "Tuesday";
//		case 3 -> "Wendesday";
//		case 4 -> "Thursday";
//		case 5 -> "Friday";
//		case 6 -> "Saturday";
//		default -> "error";
//		};
//
//		System.out.println(weekday);
//	}
//
//	public static void newSwitch2() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter base salary: ");
//		double baseSalary = sc.nextDouble();
//		System.out.println("Enter year of experience: ");
//		int yearOfExperience = sc.nextInt();
//
//		double salaryAdjustment = switch (yearOfExperience) {
//		case 0, 1 -> {
//			double adjustment = baseSalary * 0.05;
//			System.out.println("Junior employee : " + adjustment);
//			yield adjustment;
//		}
//		case 2, 3, 4 -> {
//			double adjustment = baseSalary * 0.1;
//			System.out.println("Internediate employee : " + adjustment);
//			yield adjustment;
//		}
//		case 5, 6, 7 -> {
//			double adjustment = baseSalary * 0.15;
//			System.out.println("Senior employee : " + adjustment);
//			yield adjustment;
//		}
//		default -> {
//			double adjustment = baseSalary * 0.2;
//			System.out.println("Advance employee : " + adjustment);
//			yield adjustment;
//		}
//		};
//		double totalSalary = baseSalary + salaryAdjustment;
//		System.out.println(totalSalary);
//		
//		sc.close();
//		
//	}
	
	
	
	public static void oldSwitch(int day) {
		String weekday;
		switch (day) {

		case 0:
			weekday = "Sunday";
			break;
		case 1:
			weekday = "Monday";
			break;
		case 2:
			weekday = "Tuesday";
			break;
		case 3:
			weekday = "Wendesday";
			break;
		case 4:
			weekday = "Thursday";
			break;
		case 5:
			weekday = "Friday";
			break;
		case 6:
			weekday = "Saturday";
			break;
		default:
			weekday = "error";
			break;
		}
		System.out.println(weekday);
	}

}
