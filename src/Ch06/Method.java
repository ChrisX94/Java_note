package Ch06;

public class Method {
	public static void main(String[] args) {
		Method method = new Method();
		System.out.println(method.syaHolle("Ryan"));
		System.out.println(method.BMI(78, 1.66));
		
	}
	
	public String syaHolle (String name) {
		String str = name;
		return "Hello "+ str;
	}
	
	public double BMI (double wieght, double height) {
		
		double BMI = wieght/ Math.pow(height, 2);
		
		return BMI;
	}
}
