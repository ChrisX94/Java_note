package Ch04;

public class a {

	public static void main(String[] args) {
		double d1 = 3.14;
		Double d2 = new Double(9.87);
				
		System.out.println(d1);
		System.out.println(d2);
		
		
		String strNum = "9.487";
		double douNum = Double.parseDouble(strNum);
		System.out.println(douNum);
		
		String s = String.valueOf(d1);
		System.out.println(s);
		
		float f = Float.parseFloat(s);
		System.out.println(f);
		
		Float ff = new Float(f);
		int i = ff.intValue();
		System.out.println(i);

//		// Part 1
//		double d = 3.14;
//		String s = String.valueOf(d);
//		float f = Float.parseFloat(s);
//		
//		// Part 2
//		Float ff = new Float(f);
//		int i = ff.intValue();
//		System.out.println(i);
		int a = 4;
		int b = 3;
		
		System.out.println(a++);
		System.out.println( a += b);
		
		String str = "420";
		str += 42;
		System.out.println(str);
		
		System.out.println(a< b? "yes":"no"); 
		
		

	}

}
