package Ch8_Encaosulation;

public class TestDemo {

	public static void main(String[] args) {
		
		Video video = new Video();
		video.setFileName("Test.txt");
		System.out.println(video.getFileName());
	}

}
