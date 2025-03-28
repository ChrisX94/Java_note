package Ch10_MyException;

public class TestDome {

	public static void main(String[] args) {
		
		try {
			throw new MyException("Error message");
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
