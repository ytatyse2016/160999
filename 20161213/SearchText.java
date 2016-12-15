// SearchText.java
// テキストファイルの内容を標準出力に出力するプログラム.
// usage:  java ShowText  ファイル名

import java.io.*;

public class SearchText {
  public static void main(String[] args) {
    // 0.変数をつくる
    String fileName = args[0];
    String keyword = args[1];
    FileReader fr = null;
    BufferedReader in = null;

    System.out.println(args[0]);

    try {
      // 1. ファイルを開く
      fr = new FileReader(fileName);
      in = new BufferedReader(fr);

      // くり返し処理
      while(true){
      	// 2. データを読む
	String data = in.readLine();

	if(data.contains(keyword)){ 

	  // 3. データを書く( 出力する )
	  System.out.println(data);
	  break;
	}
      }
      // 4. ファイルを閉じる
      in.close();

    } catch(IOException e){
      System.err.println("IO ERROR");
    }
  }
}
