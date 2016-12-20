import java.awt.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setTitle("アオキ！");
		frame.setLayout(new FlowLayout());

		// "HELLO"と表示するラベル(JLabel)をつくる.
		JLabel label = new JLabel("HELLO");

		Container ctnr = frame.getContentPane();		// パネルを作る
		ctnr.add(label);						// ラベルを、はる
		JButton button = new JButton("Click Me!");
		Container ctnr2 = frame.getContentPane();		// パネルを作る
		ctnr2.add(button);
		frame.setVisible(true);
	}
}