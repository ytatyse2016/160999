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
		// データ
		JFrame frame;				// ウィンドウ
		JTextField fileName;		// テキストフィールド
		JPanel fieldPanel;			// パネル
		JButton buttonOpen;			// ボタン
		JButton buttonSave;
		JTextArea textArea;			// テキストエリア
		JScrollPane scrollPane;		// スクロールペイン

		// メソッド
		public TextEditorMan() {
			// コンストラクタ(constructor)
			// frameをつくる
			frame = new JFrame("TextEditor");
			frame.setLocation(400, 400); 	// 場所
			frame.setSize(500, 500);		// サイズ
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// フィールド、パネル、ボタン、テキストエリア、スクロールペインをつくる
			fileName = new JTextField("ALOHA", 10);
			fieldPanel = new JPanel();

			buttonOpen = new JButton("開く");
			buttonOpen.addActionListener(this);
			buttonOpen.setActionCommand("open");
			buttonSave = new JButton("保存");
			buttonSave.addActionListener(this);
			buttonSave.setActionCommand("save");

			textArea = new JTextArea(10, 30);
			scrollPane = new JScrollPane(textArea);

			// パネルに、フィールド、ボタンをのせる
			fieldPanel.add(fileName);
			fieldPanel.add(buttonOpen);
			fieldPanel.add(buttonSave);

			// ウィンドウにのせる
			Container con = frame.getContentPane();
			con.setLayout(new GridLayout(2, 1));
			con.add(fieldPanel);
			con.add(scrollPane);

			// frameを表示する
			frame.setVisible(true);
		}

		// クリックされたときに実行するメソッド
		public void actionPerformed(ActionEvent ae) {
			// コマンドを、しらべる
			String cmd = ae.getActionCommand();

			// もし、～なら、、、
			if(cmd.equals("open")) {
				// データを準備する
				FileReader fr;
				BufferedReader br;
				String textFileName = "xyz";

				try {
					// ファイル選択の準備
					JFileChooser fc = new JFileChooser();
					fc.setCurrentDirectory(new File("."));

					// 「ファイルを開く」をひらく
					int ret = fc.showOpenDialog(frame);

					// ファイル名を、もらう
					if(ret == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						textFileName = file.getAbsolutePath();
						fileName.setText(textFileName);
					}

					// ファイルを開く
					fr = new FileReader(textFileName);
					br = new BufferedReader(fr);

					// 色をつける
					textArea.setOpaque(true);
					textArea.setForeground(Color.blue);

					// ぜんぶ読んで、表示する
					String data;
					while((data = br.readLine()) != null) {
						textArea.append(data + '\n');
					}

				} catch(IOException e) {
					System.out.println("IO error.");
				}

			} else if(cmd.equals("save")) {

				// データをつくる
				FileWriter fw = null;
				PrintWriter pw = null;
				String textFileName = "ALOHA";

				try {
					// ファイル選択の準備
					JFileChooser fc = new JFileChooser();
					fc.setCurrentDirectory(new File("."));

					// 「ファイルを開く」をひらく
					int ret = fc.showSaveDialog(frame);

					// ファイル名を、もらう
					if(ret == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						textFileName = file.getAbsolutePath();
						fileName.setText(textFileName);
					}
					// ファイルを開く
					fw = new FileWriter(textFileName);
					pw = new PrintWriter(fw);

					// データをもらう
					String data = textArea.getText();

					// ファイルに書く
					pw.println(data);

				} catch(IOException e) {
					System.out.println("IO error.");
				} finally {
					// ファイルを、とじる(close)
					try {
						pw.close();
						fw.close();
					} catch(IOException e) {
						System.out.println("IO error.");
					}
				}
			}
		}
	}