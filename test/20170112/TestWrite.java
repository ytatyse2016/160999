// TestWrite.java
//   FileWriterクラスの write()メソッドのテスト。引数が int の場合。

import java.io.*;

public class TestWrite {
	public static void main(String[] args) {
		FileWriter out = null;

		try {
			out = new FileWriter("kekka.txt");

			int c = 'z';

			out.write(c);
		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			try {
				out.close();
			} catch(IOException e) {
				System.out.println("IO error.");
			}
		}
	}
}