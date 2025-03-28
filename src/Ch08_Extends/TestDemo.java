package Ch08_Extends;

public class TestDemo {

	public static void main(String[] args) {
		Multimedia media = new Video();
		media.play();
		
		Multimedia superMedia = media;
		superMedia.play();
		
		Multimedia multimedia = new Multimedia();
		multimedia.play();
		
		Video subMedia = (Video)media;
		subMedia.play();
	}

}
