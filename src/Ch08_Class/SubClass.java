package Ch08_Class;

public class SubClass extends SuperClass{
	public String nickName;
	
	public SubClass() {
		this.nickName = "Little "+ super.name;
	}
	
}
