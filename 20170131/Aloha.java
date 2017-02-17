// Aloha.java
//  test: scanner

import java.io.*;

public class Aloha {
	public static void main(String[] args) {
		// データを準備する
		String msg;
		FileWriter fw = null;
		PrintWriter pw = null;

		System.out.print("input msg > ");
		msg = new java.util.Scanner(System.in).nextLine();
		System.out.println(msg);

		try {
			// ファイルを開く
			fw = new FileWriter("output.txt");
			pw = new PrintWriter(fw);

			// ファイルに書く
			pw.println(msg);

		} catch(IOException e) {
			// エラーメッセージ
			System.out.println("IO Error.");
		} finally {
			try {
				// ファイルを閉じる
				fw.close();
				pw.close();
			} catch(IOException e) {
				System.out.println("IO error.");
			}
		}
	}
}