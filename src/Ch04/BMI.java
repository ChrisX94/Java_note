package Ch04;

public class BMI {
	public static void main(String[] args) {
		double weight = 75.1;
		double height = 1.8;
		double bmi = weight / Math.pow(height, 2);
		
		System.out.println(bmi);
	}

}
