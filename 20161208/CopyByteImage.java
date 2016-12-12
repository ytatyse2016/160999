// CopyByteImage.java

import java.io.*;

public class CopyByteImage {
  public static void main(String[] args) {
    // 1. 変数をつくる
    FileInputStream inFile = null;
    FileOutputStream outFile = null;

    // 2. try{}catch(){}
    try {
      // 1. streamをつくる
      inFile = new FileInputStream("JellyFish.jpg");
      outFile = new FileOutputStream("result.jpg");

      // 2. データを読む
//      int data = inFile.read();
      int data;
      while((data = inFile.read()) != -1){
        // 3. データを書く
//        System.out.println(data);
        outFile.write(data);
      }


      // 4. streamを閉じる
      inFile.close();
      outFile.close();

    } catch(IOException e) {
      System.err.println("エラーです。");
      System.exit(1);
    }
  }
}
