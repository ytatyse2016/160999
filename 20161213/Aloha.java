// Aloha.java

public class Aloha {
  public static void main(String[] args) {
    while(true) {
      System.out.print("Input data >");
      String data = new java.util.Scanner(System.in).nextLine();
      System.out.println(data);

      if( data.equals("exit") ){
        break;
      }
    }
  }
}
