package Ch12_Reader_Writer;

import java.io.File;

public class TestDemo {
	public static void main(String[] args) {
		String dirName = "/Users/chrisxiao/Desktop/Tibame/Java_Hahow/Practice/test";
		String dirName2 = "/Users/chrisxiao/Desktop/Tibame/Java_Hahow/Practice";
		String fileName = "/Users/chrisxiao/Desktop/Tibame/Java_Hahow/Practice";
		String txt = "/Users/chrisxiao/Desktop/Tibame/Java_Hahow/Material/sample3.txt";
		String fileName2 = "/Users/chrisxiao/Desktop/Tibame/Java_Hahow/Practice/test.txt";
		String source = "/Users/chrisxiao/Desktop/Tibame/Java_Hahow/Material/test.jpeg";
		String dest = "/Users/chrisxiao/Desktop/Tibame/Java_Hahow/Practice/test.jpeg";

//		IOUtil.createFolder(dirName);
		
//		String[] files = IOUtil.readFolder(dirName2);
//		for(String f: files) {
//			System.out.print(f + " " );
//		}
		
//		IOUtil.deleteFolder(dirName);
		
//		IOUtil.readTxtFile(txt);
		
//		IOUtil.wirteTxtFile(fileName2);
		
		File sourceFile = new File(source);
		File destFile = new File(dest);
		IOUtil.copyPictureFile(sourceFile, destFile);
		
	}
	
	

}
