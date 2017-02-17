// TestIcon.java
//   画像を表示する

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestIcon {
	public static void main(String[] args) {
		Iconman man = new Iconman();
	}
}



class Iconman implements ActionListener{
	// データ
	ImageIcon img;
	ImageIcon img2;
	JFrame frame;
	JPanel panel;
	JLabel label;
	JPanel panel2;
	JLabel label2;
	JButton button;
	Container con;

	// メソッド
	//   コンストラクタ
	public Iconman(){
		// frameをつくる
		frame = new JFrame("Iconman");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ImageIconをつくる
		img = new ImageIcon("Ni_icons/1_Desktop_Icons/icon_256.png");
		img2 = new ImageIcon("Cd_icons/1_Desktop_Icons/icon_256.png");

		// label, panel, buttonをつくる
		label = new JLabel(img);
		panel = new JPanel();
		label2 = new JLabel(img2);
		panel2 = new JPanel();
		button = new JButton("ClickMe");
		button.addActionListener(this);

		// のせる
		panel.add(label);
		panel2.add(label2);
		panel.add(button);
		con = frame.getContentPane();
		con.add(panel);

		// frameを表示する
		frame.setVisible(true);
	}

	// クリックしたとき
	public void actionPerformed(ActionEvent ae) {
		label.setIcon(img2);
	}
}