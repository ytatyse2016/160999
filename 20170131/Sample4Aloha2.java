// Sample4Aloha2.java

import java.io.*;

public class Sample4Aloha2{
	public static void main(String[] args) {
		// 準備する
		String[] data = new String[100];
		Dataman dataman = new Dataman();

		// データを入力する
		dataman.saveData(data);

		System.out.println("ALOHA");
		for(int i = 0;  i < 3;  i++) {
			System.out.println(data[i]);
		}
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
		int numData = 2;
		data[0] = "Aoki,Ebina,52";
		data[1] = "Horie,Yokohama,55";
	}
	// 3. データを保存する
	public void saveData(String[] strData){
		strData[0] = "Aoki";
		strData[1] = "Horie";
		strData[2] = "Miwa";
	}
}

