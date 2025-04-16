package Ch22;
// Java 12以後 才可以用
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FileMismatch {

	public static void main(String[] args) {
		String filePath1 = "srcFile/file1.txt";
		String filePath2 = "srcFile/file2.txt";

//		File file1 = new File(filePath1);
//		File file2 = new File(filePath2);
//		System.out.println(file1.exists());	
//		System.out.println(file2.exists());	

//		Path path1 = Paths.get(filePath1);
//		Path path2 = Paths.get(filePath2);
//
//		long offset = 112;
//		long length = 50;
//
//		try {
//			long mismatchOffset = Files.mismatch(path1, path2); // 檔案內容一樣會回傳 -1, 不一樣會回傳位置
//			if (mismatchOffset != -1 && mismatchOffset >= offset && mismatchOffset < (offset + length)) {
//				System.out.println("Files differ at byte offset: " + mismatchOffset);
//			} else if (mismatchOffset == -1) {
//				System.out.println("Files are identical.");
//			} else {
//				System.out.println("No difference found in the specified range.");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
