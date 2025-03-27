package Ch8_InnerClass;

public class InnerClass {
	
	
	private class Inner{
		private String name;
		public void sayHello() {
		System.out.println("Hello " + name);
		}
	}
	
	public void callInnerClass() {
		Inner inner = new Inner();
		inner.name= "eighty-seven";
		inner.sayHello();
	}

}
