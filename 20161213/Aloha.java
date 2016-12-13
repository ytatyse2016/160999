// Aloha.java

public class Aloha {
  public static void main(String[] args) {
    // くり返し制御のフラグ
    boolean flag = true;

    while(flag) {
      System.out.print("Input message >");
      String msg = new java.util.Scanner(System.in).nextLine();
      System.out.println(msg);

      // キーワードで終了.
      if(msg.equals("exit")) {
        flag = false;
      }
    }
  }
}
