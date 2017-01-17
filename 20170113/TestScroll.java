	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class TestScroll {
		public static void main(String[] args) {
			TestScrollMan man = new TestScrollMan();
		}
	}


	class TestScrollMan implements ActionListener{
		// データ
		JFrame frame;
		JButton button1;
		JButton button2;
		JTextField fileName;
		JPanel fieldPanel;
		JTextArea textArea;
		JScrollPane scrollPane;

		// メソッド
		// コンストラクタ(constructor) ウィンドウを表示する
		public TestScrollMan() {
			// frameをつくる
			frame = new JFrame("TestScroll");
			frame.setLocation(400, 400);
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// ボタン、フィールド、パネル、テキストエリアをつくる
			button1 = new JButton("HELLO");
			button1.addActionListener(this);
			button1.setActionCommand("btn1");

			button2 = new JButton("あおき！");
			button2.addActionListener(this);
			button2.setActionCommand("btn2");

			fileName = new JTextField("ALOHA", 20);		// フィールド
			fieldPanel = new JPanel();				// パネル
			textArea = new JTextArea(10, 30);		// テキストエリア
			scrollPane = new JScrollPane(textArea);	// スクロールペイン

			// のせる
			fieldPanel.add(fileName);	// パネルに、フィールドをのせる
			fieldPanel.add(button1);	// パネルに、ボタンをのせる
			fieldPanel.add(button2);

			Container con = frame.getContentPane();
			con.setLayout(new GridLayout(2, 1));
			con.add(fieldPanel);	// ウィンドウに、パネルをのせる
			con.add(scrollPane);	// ウィンドウに、スクロールペインをのせる

			// 表示する
			frame.setVisible(true);
		}

		// クリックしたときの処理
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
