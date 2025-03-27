package Ch8_Class;

public class SuperClass {
	public String name;
	
	// static block 靜態區塊 載入類別時進行初始化動作，只執行一次
	static {
		System.out.println("Run static black");
	}
	

	public SuperClass() {
		name ="SomeOne";
		System.out.println("Run Constructor");
	}
	
	public SuperClass(String name) {
		this.name = name;
		System.out.println("Run Constructor");
	}
	

	
	
	
}
