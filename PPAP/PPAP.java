// PPAP.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class PPAP {
	public static void main(String[] args) {
		PPAPMan man = new PPAPMan();
	}
}


class PPAPMan implements ActionListener{
	// データ
	JFrame frame;				// ウィンドウ
	JButton buttonSave;			// ボタン
	JButton buttonNext;
	JPanel buttonPanel;			// ボタンをのせる、パネル
	JLabel word1;				// 単語を表示する、ラベル
	JLabel word2;
	JPanel wordPanel;			// ラベルをのせる、パネル
	JTextArea memo;			// メモを書く、テキストエリア
	JScrollPane memoPane;		// テキストエリアをのせる、ペイン
	String[] words = new String[23];

	// メソッド
	public PPAPMan() {
		// ウィンドウをつくる
		frame = new JFrame("PPAP");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタン、ラベル、テキストエリアをつくる
		buttonSave = new JButton("Save");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");

		buttonNext = new JButton("Next");
		buttonNext.addActionListener(this);
		buttonNext.setActionCommand("next");

		word1 = new JLabel("ALOHA");
		word2 = new JLabel("ALOHA");

		memo = new JTextArea(5, 20);


		// ボタン、ラベル、テキストエリアをのせる
		//   のせるための、場所をつくる
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(3, 1));	// 場所を3個、つくる
		buttonPanel = new JPanel();				// ボタンをのせる場所
		wordPanel = new JPanel();				// ラベルをのせる場所
		memoPane = new JScrollPane(memo);		// テキストエリアをのせる場所

		//   のせる
		buttonPanel.add(buttonSave);
		buttonPanel.add(buttonNext);
		wordPanel.add(word1);
		wordPanel.add(word2);

		con.add(buttonPanel);
		con.add(wordPanel);
		con.add(memoPane);

		// ウィンドウを表示する
		frame.setVisible(true);
	}


	// クリックしたときの、処理
	public void actionPerformed(ActionEvent ae) {
		// コマンドをしらべる
		String cmd = ae.getActionCommand();

		// もし、コマンドが "save" だったら、"SAVE" と表示する。
		if(cmd.equals("save")) {
			FileWriter fw = null;
			PrintWriter pw = null;

			// ファイルを開いて、データ保存
			try {
				fw = new FileWriter("memo.txt");
				pw = new PrintWriter(fw);

				String data = memo.getText();
				pw.println(data);

			} catch(IOException e) {
				System.out.println("IO Error.");
			} finally {
				// 最後に、ファイルを閉じる
				try {
					fw.close();
					pw.close();
				} catch(IOException e) {
					System.out.println("IO Error.");
				}
			}
		} else if(cmd.equals("next")) {
			// ファイルを開く準備
			FileReader fr;
			BufferedReader br;

			try {
				// ファイルを開く
				fr = new FileReader("words.txt");
				// br = new BufferedReader(new InputStreamReader(new FileInputStream("words.txt"),"UTF-8"));
				br = new BufferedReader(fr);

				// データをもらって、配列に入れる
				String data;
				int i = 0;
				while((data = br.readLine()) != null) {
					words[i] = data;
					i++;
				}

				// ランダムに表示する
				//   ランダムをつくる
				int rdm1 = (int)(Math.random()*23);
				int rdm2 = (int)(Math.random()*23);

				//   表示する
				word1.setText(words[rdm1]);
				word2.setText(words[rdm2]);

			} catch(IOException e) {
				System.out.println("IO Error.");
			}

		}
	}
}