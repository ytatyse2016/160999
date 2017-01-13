// ReadTextBr.java
//   BufferedReaderのテスト

import java.io.*;

public class ReadTextBr {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("data.txt");
			br = new BufferedReader(fr);

			String str;

			while((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			try {
				br.close();
			} catch(IOException e) {
				System.out.println("IO error.");
			}
		}
	}
}