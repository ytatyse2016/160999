// ArrayFile.java

import java.io.*;

public class ArrayFile {
  public static void main(String[] args) {
    FileReader fr;
    BufferedReader br;
    String[] words = new String[23];
    int num = 0;

    try {
      fr = new FileReader("words.txt");
      br = new BufferedReader(fr);

      String data;
      int i = 0;

      while((data = br.readLine()) != null) {
	words[i] = data;
	i++;
      }

    } catch(IOException e) {
      System.out.println("IO Error.");
    }

    // show 2 words
    //System.out.println(words[0]);
    //System.out.println(words[1]);

    //System.out.println(words[20]);
    //System.out.println(words[21]);

    // random 2 words
    int rdm = (int)(Math.random() * 22);
    System.out.println(words[rdm]);
    rdm = (int)(Math.random() * 22);
    System.out.println(words[rdm]);

    // use num
    for(int i = 0;  i < num;  i++) {
      System.out.println(words[i]);
    }

  }
}
