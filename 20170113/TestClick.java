import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestClick {
	public static void main(String[] args) {
		TestClickMan man = new TestClickMan();
	}
}


class TestClickMan implements ActionListener{
	// データ
	JFrame frame;					// ウィンドウ
	JButton button;					// ボタン
	JTextField fileName;			// 文字を書くところ
	JPanel fieldPanel;				// パネル(ボタンをのせるもの)

	// メソッド
	public TestClickMan(){
		// frameをつくる
		frame = new JFrame("TestClick");
		frame.setLocation(400, 400);		// 場所をきめる
		frame.setSize(500, 500);			// サイズをきめる
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタン、フィールド、パネルをつくる
		button = new JButton("Click Me!");		// ボタン
		button.addActionListener(this);			// クリックの準備
		fileName = new JTextField("ALOHA", 20); // フィールド
		fieldPanel = new JPanel();				// パネル

		// のせる
		fieldPanel.add(fileName);	// パネルに、フィールドをのせる
		fieldPanel.add(button);		// パネルに、ボタンをのせる
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(fieldPanel);		// ウィンドウに、パネルをのせる

		// 表示する
		frame.setVisible(true);
	}

	// クリックしたときに、やること
	public void actionPerformed(ActionEvent ae) {
		// フィールドに、"HELLO"と表示する
		fileName.setText("HELLO");
	}
}