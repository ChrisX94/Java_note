package Ch21_practice;


/*
 * • 建立一個函式 copyFile(String inputFile, String
outputFile)，讀取 inputFile 的內容並將其寫入
outputFile。
• 在函式main 中，使用scanner 讓使用者輸入檔案路
徑。
• 呼叫函式copyFile完成文件的複製操作
*/



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P2_fileIO {

	public static void main(String args[]) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the source file path :");
//		String source = sc.next();
//		System.out.println("Please enter the output file dir :");
//		String output = sc.next();
//		String source = "/Users/chrisxiao/eclipse-workspace/Java_Hahow/src/srcFile/sample.txt"; 

		String source = "/Users/chrisxiao/eclipse-workspace/Java_Hahow/src/srcFile/test2.jpeg"; 
//		String source = "/Users/chrisxiao/eclipse-workspace/Java_Hahow/src/srcFile/SamplePDF.pdf";
		String output = "/Users/chrisxiao/eclipse-workspace/Java_Hahow/src/srcFile/ouput/";

//		CopyTextFile(source, output);

		CopyBinFile(source, output);

//		sc.close();
	}

	public static void CopyTextFile(String source, String output) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		PrintWriter pw = null;

		File srcFile = new File(source);
		File outputFileDir = new File(output);
		if (!outputFileDir.exists()) {
			outputFileDir.mkdirs();
		}

		try {
			// reader
			br = new BufferedReader(new FileReader(srcFile));
			// writer
			fw = new FileWriter(output + srcFile.getName());
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);

			String content;
			while ((content = br.readLine()) != null) {
				pw.println(content);

				pw.flush();
			}

			System.out.println("Copy text file is done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
				if (br != null) {
					br.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void CopyBinFile(String source, String output) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		File srcFile = new File(source);
		File outputFileDir = new File(output);
		if (!outputFileDir.exists()) {
			outputFileDir.mkdirs();
		}

		try {
			// InputfileStream
			fis = new FileInputStream(srcFile);
			bis = new BufferedInputStream(fis);

			// OutputfileStream
			fos = new FileOutputStream(output + srcFile.getName());
			bos = new BufferedOutputStream(fos);

			int len;
			byte[] b = new byte[4096];
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
				bos.flush();
			}

			fos.close();

			System.out.println("Copy Binary file is done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (bos != null) {
					bos.close();
				}
				if (fos != null) {
					fos.close();
				}
				if (bis != null) {
					bis.close();
				}
				if (fis != null) {
					fis.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void copyFile(String source, String output) {
		BufferedReader br = null;
		BufferedWriter bw = null;

		File srcFile = new File(source);
		File outputFileDir = new File(output);
		if (!outputFileDir.exists()) {
			outputFileDir.mkdirs();

			try {

				br = new BufferedReader(new FileReader(srcFile));
				bw = new BufferedWriter(new FileWriter(output + srcFile.getName()));

				String line;
				while ((line = br.readLine()) != null) {
					bw.write(line);
					bw.newLine();
				}

				System.out.println("Copy text file is done");

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (bw != null) {
						bw.close();
					}
					if (br != null) {
						br.close();
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}