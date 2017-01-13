// ReadTextFromFile.java
//   テキストファイルを読んで、標準出力に出力する。

import java.io.*;

public class ReadTextFromFile {
	public static void main(String[] args) {
		FileReader in = null;

		try {
			in = new FileReader("data.txt");

			int c;
			while((c = in.read()) != -1 ) {
				System.out.print((char)c);
			}
			System.out.print("\n");

		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			try {
				in.close();
			} catch(IOException e) {
				System.out.println("IO error.");
			}
		}
	}
}