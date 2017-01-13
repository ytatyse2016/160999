import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame{

  public static void main(String[] args){
    JScrollPaneTest frame = new JScrollPaneTest();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("JScrollPaneTest");
    frame.setVisible(true);
  }

  JScrollPaneTest(){
    JTextArea textarea = new JTextArea("JTextArea");
    //テキストエリアをビューポートに持ったスクロールペインを作る
    JScrollPane scrollpane = new JScrollPane(textarea); 
    //スクロールペインのサイズを設定
    scrollpane.setPreferredSize(new Dimension(200, 120));
    //パネルを作ってスクロールペインを貼り付ける
    JPanel panel = new JPanel();
    panel.setBackground(new Color(0xdddddd)); 
    panel.add(scrollpane);
    getContentPane().add(panel, BorderLayout.CENTER);
  }
}