// CopyByteFileLine.java
//   画像ファイルをコピーする。読み書きの際、バッファを使う。

import java.io.*;

public class CopyByteFileLine {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		byte[] buf = new byte[1024];

		try {
			in = new FileInputStream("f00.jpg");
			out = new FileOutputStream("copy.jpg");

			int size;
			while((size = in.read(buf, 0, buf.length)) != -1) {
				out.write(buf, 0, size);
			}

			System.out.println("file copy done");
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