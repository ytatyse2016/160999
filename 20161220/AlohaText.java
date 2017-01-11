import javax.swing.*;
import java.awt.*;

public class AlohaText implements ActionListener{

  JFrame frame;
  JTextField text;
  JLabel label;
  JButton button;

  public static void main(String args[]){
    text = new JTextField();
    label = new JLabel();
    button = new JButton("Click me!");
    button.addActionListener(this);

    frame = new JFrame("タイトル");
    frame.setLayout( new FlowLayout() );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container ctnr = new frame.getContentPane();
    ctnr.add(text);
    ctnr.add(label);
    ctnr.add(button);

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    label.setText("ALOHA!");
  }

}