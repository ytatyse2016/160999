// TestFile.java
//   test "utf-8"

import java.io.*;

public class TestFile {
	public static void main(String[] args) {
		File inFile;
		File outFile;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try {
			inFile = new File("test.txt");
			fis = new FileInputStream(inFile);
			isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);

			outFile = new File("kekka.txt");
			

			String data = br.readLine();
			System.out.println(data);
		} catch(IOException e) {
			System.out.println("IO error.");
		}
	}
}