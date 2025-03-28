package Ch10_MyException;

public class MyException extends Exception {
	
	private String msg;
	
	public MyException() {}
	
	public MyException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return "Test Massage : " + msg;
	}
	
}
