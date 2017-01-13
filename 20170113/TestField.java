import java.awt.*;
import javax.swing.*;

public class TestField {
	public static void main(String[] args) {
		TestFieldMan man = new TestFieldMan();
	}
}


class TestFieldMan {
	// データ
	JFrame frame;					// ウィンドウ
	JButton button;					// ボタン
	JTextField fileName;			// 文字を書くところ
	JPanel fieldPanel;				// パネル(ボタンをのせるもの)

	// メソッド
	public TestFieldMan() {
		// frameをつくる
		frame = new JFrame("TestField");
		frame.setLocation(400, 400);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタン、フィールド、パネルをつくる
		button = new JButton("Click Me!");
		fileName = new JTextField("ALOHA", 20);
		fieldPanel = new JPanel();

		// のせる
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));

		fieldPanel.add(fileName);	// パネルにフィールドをのせる
		fieldPanel.add(button);		// パネルにボタンをのせる

		con.add(fieldPanel);		// ウィンドウにパネルをのせる

		// 表示する
		frame.setVisible(true);
	}
}
