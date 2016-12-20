// Aloha.java

public class Aloha {
  public static void main(String[] args) {
<<<<<<< HEAD
    while(true) {
      System.out.print("Input data >");
      String data = new java.util.Scanner(System.in).nextLine();
      System.out.println(data);

      if( data.equals("exit") ){
        break;
=======
    // くり返し制御のフラグ
    boolean flag = true;

    while(flag) {
      System.out.print("Input message >");
      String msg = new java.util.Scanner(System.in).nextLine();
      System.out.println(msg);

      // キーワードで終了.
      if(msg.equals("exit")) {
        flag = false;
>>>>>>> caf99d5b755a3b487838f188ca7f4cb540cfbc0e
      }
    }
  }
}
