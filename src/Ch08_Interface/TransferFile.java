package Ch08_Interface;

public class TransferFile implements Network{
	public void connect() {
		System.out.println("Connect to xxxxx");
	}
	public void transfer(String fileName) {
		System.out.println(fileName);
	}
	public void disconnect() {
		System.out.println("Diconnect");
	}

}
