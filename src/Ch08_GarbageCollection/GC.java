package Ch08_GarbageCollection;

public class GC {

	private String name;
	
	public GC(String name) {
		this.name = name;
		System.out.println(this.name + ": Start");
	}
	
	protected void finalize() {
		System.out.println(this.name + ": End");
	} 
	
}
