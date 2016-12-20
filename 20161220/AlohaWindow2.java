// AlohaWindow2.java

import java.awt.*;
import javax.swing.*;

public class AlohaWindow2 {
	// 変数をつくる
	static JFrame frame;
	static JLabel label;
	static JButton button;
	static Container ctnr;

	// mainメソッド
	public static void main(String[] args) {
		// ウィンドウをつくる
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setTitle("アオキ！");
		frame.setLayout(new FlowLayout());

		// ラベルをつくる
		label = new JLabel("HELLO");

		// ボタンをつくる
		button = new JButton("ClickMe!");

		// ラベルとボタンを表示する
		ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		// ウィンドウを表示する
		frame.setVisible(true);
	}

}