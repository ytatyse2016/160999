import java.awt.*;
import javax.swing.*;

public class TestButton {
	public static void main(String[] args) {
		TestButtonMan tbm = new TestButtonMan();
	}
}


// 仕事をするクラス
class TestButtonMan {
	// データ
	JFrame frame;
	JButton button;

	// メソッド
	public TestButtonMan() {
		// frameをつくる
		frame = new JFrame("TestButton");
		frame.setLocation(400, 400);		// 場所
		frame.setSize(400, 400);			// サイズ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// buttonをつくる
		button = new JButton("Click Me!");

		// buttonをのせる
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(button);

		// frame（ウィンドウ）を表示する
		frame.setVisible(true);
	}
}
