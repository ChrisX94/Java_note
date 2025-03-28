package Ch08_abstract;

public class FTP extends Network{

	@Override
	public void connect() {
		System.out.println("FTP connect");
		
	}
	
	
	@Override
	public void disconnect() {
		System.out.println("FTP disconnect");
		
	}
}
