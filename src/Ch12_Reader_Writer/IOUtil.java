package Ch12_Reader_Writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOUtil {

	public static void createFolder(String fileName) {
		File file = new File(fileName);
		file.mkdirs();
	}

	public static String[] readFolder(String fileName) {
		File file = new File(fileName);
		return file.list();
	}

	public static void deleteFolder(String fileName) {
		File file = new File(fileName);
		file.delete();
	}

	public static void readTxtFile(String fileName) {
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String tmp;
		try {
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void wirteTxtFile(String fileName) {
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test2");

		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);

			for (String s : list) {
				bw.write(s);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyPictureFile(File source, File dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			byte[] buffer = new byte[1024];
			int off = 0;
			int len = 0;
			
			while((len=fis.read(buffer)) != -1) {
				fos.write(buffer,off,len);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
