// Aloha2.java

public class Aloha2 {
  public static void main(String[] args) {
    Alohaman2 am = null;

    // もしデータが4個なら
    if(args.length == 4) {
      am = new Alohaman2(args[2], args[3]);
    } else if(args.length < 3) {
      am = new Alohaman2();
    }

    // もしデータが1個・2個なら
    if(args.length == 1){
    	am.sayAloha(Integer.parseInt(args[0]));
    } else if(args.length == 2 || args.length == 4) {
        am.sayAloha(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
  }
}

class Alohaman2 {
  private String msg;
  private String msg2;

  public Alohaman2() {
    System.out.println("x<4");
    this.msg = "ALOHA!";
    this.msg2 = "アロハ！";
  }

  public Alohaman2(String m, String m2) {
    System.out.println("x=4");
    this.msg = m;
    this.msg2 = m2;
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
