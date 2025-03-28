package Ch08_Class;

public class TestDemo {
	
	public static void main(String[] args) {
		
		SuperClass superClass1 = new SuperClass("Test Name");
		SuperClass superClass2 = new SuperClass();
		
		System.out.println(superClass1.name);
		System.out.println(superClass2.name);
		
		SubClass subClass1 = new SubClass();
		System.out.println(subClass1.nickName);
	}

}
