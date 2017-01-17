import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestButton2 {
	public static void main(String[] args) {
		TestButtonMan2 man = new TestButtonMan2();
	}
}


class TestButtonMan2 implements ActionListener{
	// データ
	JFrame frame;
	JButton button1;		// ボタン１（左）
	JButton button2;		// ボタン２（右）
	JTextField fileName;
	JPanel panel;

	// メソッド
	// コンストラクタ(constructor)
	public TestButtonMan2() {
		// frameをつくる
		frame = new JFrame("TestButton2");
		frame.setLocation(400, 400);		// 場所
		frame.setSize(500, 500);			// サイズ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタン(2個)、フィールド、パネルをつくる
		button1 = new JButton("HELLO");		// ボタン１
		button1.addActionListener(this);
		button1.setActionCommand("btn1");	// ボタンコマンド

		button2 = new JButton("あおき！");	// ボタン２
		button2.addActionListener(this);
		button2.setActionCommand("btn2");	// ボタンコマンド

		fileName = new JTextField("ALOHA", 20);	  // フィールド
		panel = new JPanel();					  // パネル

		// のせる
		panel.add(fileName);	// パネルに、フィールドをのせる
		panel.add(button1);		// パネルに、ボタン１をのせる
		panel.add(button2);		// パネルに、ボタン２をのせる
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);			// ウィンドウに、パネルをのせる

		// 表示する
		frame.setVisible(true);
	}

	// クリックしたときの仕事
	public void actionPerformed(ActionEvent ae) {
		// ボタンコマンドを、しらべる
		String btn = ae.getActionCommand();

		// もし「左」ボタン(btn1)なら、"HELLO"と表示
		// もし「右」ボタン(btn2)なら、"あおき！"と表示
		if(btn.equals("btn1")) {
			// "HELLO"と表示する
			fileName.setText("HELLO");

		} else if(btn.equals("btn2")) {
			// "あおき！"と表示する
			fileName.setText("あおき！");

		}
	}
}