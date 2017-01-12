// Aloha.java

public class Aloha {
  public static void main(String[] args) {
    Alohaman am = new Alohaman();
    am.sayAloha();
  }
}

class Alohaman {
  private String msg;
  private String msg2;

  public Alohaman() {
    this.msg = "ALOHA!";
    this.msg2 = "�A���n�I";
  }

  public void sayAloha() {
    System.out.println(this.msg);
  }

  public void sayAloha(int num) {
    for(int i = 0;  i < num;  i++) {
    	System.out.println(i + this.msg);
    }
  }

  public void sayAloha(int num, int x) {
    for(int i = 0;  i < num;  i++) {
      if(i%x == 0) {
    	System.out.println(i + this.msg2);
      } else {
    	System.out.println(i + this.msg);
      }
    }
  }
}
