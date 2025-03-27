package Ch8_Interface;

public class TestDemo {
	public static void main(String[] args) {
		
		File file = new Multimedia();
		System.out.println(file.getFileName());
		
		
		TransferFile net = new TransferFile();
		TestDemo test = new TestDemo();
		
		test.process( file, net);
		
		
	}
	public void process(File file, Network net) {
		net.connect();
		net.transfer(file.getFileName());
		net.disconnect();
	}

}
