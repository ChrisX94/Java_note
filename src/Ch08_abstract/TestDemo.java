package Ch08_abstract;

public class TestDemo {

	public static void main(String[] args) {
		Network net = new FTP();

		net.transfer("TestFile.txt");
	

	}

}
