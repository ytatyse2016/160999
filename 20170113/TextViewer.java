import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextViewer {
	public static void main(String[] args) {
		TextViewerMan man = new TextViewerMan();
	}
}


class TextViewerMan implements ActionListener{
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
	public TextViewerMan() {
		// frameをつくる
		frame = new JFrame("TestScroll");
		frame.setLocation(400, 400);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタン、フィールド、パネル、テキストエリアをつくる
		button1 = new JButton("開く");
		button1.addActionListener(this);
		button1.setActionCommand("btn1");

		button2 = new JButton("保存する");
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

		// もし「開く」ボタン(btn1)なら、データを表示
		if(btn.equals("btn1")) {
			// フィールドから、ファイル名をもらう
			String file = fileName.getText();

			// ファイルを開いて、データをもらう。表示する。
			FileReader fr;
			BufferedReader br;

			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				String data;

				while((data = br.readLine()) != null) {
					textArea.append(data+'\n');
				}
			} catch(IOException e) {
				System.out.println("IO error.");
			}
		}
	}
}
