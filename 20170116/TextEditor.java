// TextEditor.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextEditor {
	public static void main(String[] args) {
		TextEditorMan man = new TextEditorMan();
	}
}


class TextEditorMan implements ActionListener{
	// field
	JFrame frame;		// ウィンドウ
	JTextField fileName;	// テキストフィールド
	JPanel fieldPanel;		// パネル
	JButton btnOpen;		// ボタン
	JButton btnSave;		// ボタン
	JTextArea textArea;		// テキストエリア
	JScrollPane scrollPane;	// スクロールペイン

	// method
	public TextEditorMan() {
		// ウィンドウをつくる
		frame = new JFrame("Text Editor");
		frame.setLocation(400, 400);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// フィールド、パネル、ボタン、テキストエリア、スクロールペインをつくる
		fileName = new JTextField("ALOHA", 15);
		fieldPanel = new JPanel();

		btnOpen = new JButton("開く");
		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");

		btnSave = new JButton("保存");
		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");

		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);

		// のせる
		// パネルに、フィールドをのせる
		fieldPanel.add(fileName);
		fieldPanel.add(btnOpen);
		fieldPanel.add(btnSave);

		// ウィンドウに、パネルをのせる
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(fieldPanel);
		con.add(scrollPane);

		// ウィンドウを可視化する
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		// コマンドを、しらべる
		String cmd = ae.getActionCommand();

		// もし、、、なら、、、
		if(cmd.equals("open")) {
			// ファイル名を、しらべる
			String textFileName = "ALOHA";

			// 「ファイルを開く」を開く
			JFileChooser fc = new JFileChooser();

			// 表示するdirをきめる
			fc.setCurrentDirectory(new File("."));

			// ダイアログをひらく
			int ret = fc.showOpenDialog(frame);

			// 選択されたファイルを、しらべる
			if(ret == JFileChooser.APPROVE_OPTION) {
				// ファイルをしらべる
				File file = fc.getSelectedFile();

				// ファイル名、場所をしらべる
				textFileName = file.getAbsolutePath();

				// テキストフィールドに、表示する
				fileName.setText(textFileName);
			}

			// 必要なデータをつくる
			FileReader fr;
			BufferedReader br;

			try {
				// ファイルを開く
				fr = new FileReader(textFileName);
				br = new BufferedReader(fr);

				// データを読んで、表示する
				String data;
				while((data = br.readLine()) != null) {
					textArea.append(data + '\n');
				}
			} catch(IOException e) {
				System.out.println("IO error.");
			}
		} else if(cmd.equals("save")) {
			// ファイル名をしらべる
			String textFileName = fileName.getText();

			// 必要なデータをつくる
			FileWriter fw = null;
			PrintWriter pw = null;

			try {
				// ファイルを開く
				fw = new FileWriter(textFileName);
				pw = new PrintWriter(fw);

				// テキストエリアのデータを読み取る
				String data = textArea.getText();

				// ファイルに書き込み、保存する
				pw.println(data);
			} catch(IOException e) {
				System.out.println("IO error.");
			} finally {
				// ファイルを閉じる
				try {
					fw.close();
					pw.close();
				} catch(IOException e) {
					System.out.println("IO error.");
				}
			}

		}
	}
}