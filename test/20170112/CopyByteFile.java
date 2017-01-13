// CopyByteFile.java
//   データのやり取り: ストリーム: 画像ファイルを扱う
//   jpg_file: f00.jpg

import java.io.*;

public class CopyByteFile {
	public static void main(String[] args) {
		// stream
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("f00.jpg");
			out = new FileOutputStream("copy.jpg");

			int d;
			while((d = in.read()) != -1) {
				out.write(d);
			}

		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			try {
				in.close();
				out.close();
			} catch(IOException e) {
				System.out.println("IO error");
			}
		}
	}
}