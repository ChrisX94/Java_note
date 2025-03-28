package Ch04;

public class FV {
	public static void main(String[] args) {
		double pv = 100000;
		double i = 0.03;
		int n = 5;
		double fv = pv* Math.pow((1+i),n);
		
		System.out.println(fv);
	}

}
