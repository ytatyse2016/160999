import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Memo {
	public static void main(String[] args) {
		MemoWindow mw = new MemoWindow();
	}
}


class MemoWindow implements ActionListener{
	// データ
	JFrame frame;
	JButton btnSave;
	JTextArea textArea;
	JPanel panel;
	JScrollPane scrollPane;
	String fileName;

	// メソッド
	public MemoWindow() {
		// ファイル名
		fileName = "test.txt";

		// ウィンドウをつくる
		frame = new JFrame("Memo");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタン、テキストエリア、パネルをつくる
		btnSave = new JButton("保存");
		btnSave.addActionListener(this);
		panel = new JPanel();
		textArea = new JTextArea(5, 20);
		scrollPane = new JScrollPane(textArea);

		// のせる
		panel.add(btnSave);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);
		con.add(scrollPane);


		// 表示する
		frame.setVisible(true);
	}

	// クリックしたら、保存する
	public void actionPerformed(ActionEvent ae) {
		// ファイルを開く準備をする
		FileWriter fw = null;
		PrintWriter pw = null;

		// ファイルを開いて、メモを保存する
		try {
			fw = new FileWriter(fileName, true);
			pw = new PrintWriter(fw);

			String data = textArea.getText();
			pw.println(data);

		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			// ファイルを閉じる
			try {
				fw.close();
				pw.close();
			} catch(IOException e) {
				System.out.println("IO Error.");
			}
		}
	}
}
