// TestFileWriter

import java.io.*;

public class TestFileWriter {
	public static void main(String[] args) {
		FileOutputStream fos;
		OutputStreamWriter osw;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try {
			fos = new FileOutputStream("result.txt", true);
			osw = new OutputStreamWriter(fos, "UTF-8");
			bw = new BufferedWriter(osw);
			pw = new PrintWriter(bw);

			pw.println("アロハ！");
		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			try {
				bw.close();
				pw.close();
			} catch(IOException e) {
				System.out.println("IO Error at closing.");
			}
		}
	}
}