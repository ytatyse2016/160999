// ShowByteImage.java

import java.io.*;

public class ShowByteImage {
  public static void main(String[] args) {
    // 1. 変数をつくる
    FileInputStream inFile = null;

    // 2. try{}catch(){}
    try {
      // 1. streamをつくる
      inFile = new FileInputStream("JellyFish.jpg");

      // 2. データを読む
//      int data = inFile.read();
      int data;
      while((data = inFile.read()) != -1){
        // 3. データを書く
        System.out.println(data);
      }


      // 4. streamを閉じる
      inFile.close();

    } catch(IOException e) {
      System.err.println("エラーです。");
      System.exit(1);
    }
  }
}
