// Aloha2.java

import java.io.*;

public class Aloha2 {
	public static void main(String[] args) {
		// 準備する
		String[] data = new String[100];
		Dataman dataman = new Dataman();
		Fileman fileman = new Fileman();

		// データを入力する
		dataman.inputData();
		dataman.saveData(data);

		// ファイルに保存する
		fileman.writeFile(data);
	}
}


// データを入力する & データを保存する
class Dataman {
	// データ
	String[] data;
	int numData;

	// メソッド
	// 1. コンストラクタ; 準備する
	public Dataman(){
		data = new String[100];
	}
	// 2. データを入力する
	public void inputData(){
		// メッセージを表示する
		System.out.print("何人のデータ？ > ");
		this.numData = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
	}
	// 3. データを保存する
	public void saveData(String[] strData){
		
	}
}


class Fileman {
	// データ

	// メソッド
	// 1. コンストラクタ
	public Fileman(){
		System.out.println("Fileman!");
	}
	// 2. ファイルに書く
	public void writeFile(String[] strData) {
		System.out.println("writeFile()!");
	}
}
