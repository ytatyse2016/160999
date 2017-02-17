// TestQuiz.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TestQuiz {
	public static void main(String[] args) {
		Quizman man = new Quizman();
	}
}



class Quizman implements ActionListener{
	// データ
	JFrame frame;
	JLabel label;
	JPanel panelLabel;
	JPanel panelAnswer;
	JPanel panelButton;
	String[] quiz;
	int num = 3;
	JTextField answer;
	JButton button;

	// メソッド
	//   コンストラクタ
	public Quizman() {
		// frameをつくる
		frame = new JFrame("Quizman");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// つくる
		quiz = new String[num*2];
		label = new JLabel();
		panelLabel = new JPanel();
		panelAnswer = new JPanel();
		panelButton = new JPanel();
		answer = new JTextField("", 15);
		button = new JButton("submit");
		button.addActionListener(this);

		// "quiz.txt"から、データをもらう
		getQuiz();

		// labelにクイズの問題を書く
		label.setText(quiz[0]);

		// のせる
		panelLabel.add(label);
		panelAnswer.add(answer);
		panelButton.add(button);
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(3, 1));
		con.add(panelLabel);
		con.add(panelAnswer);
		con.add(panelButton);

		// frameを表示する
		frame.setVisible(true);
	}

	private void getQuiz() {
		FileInputStream fis;
		InputStreamReader isr;
		BufferedReader br;

		try {
			fis = new FileInputStream("quiz.txt");
			isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);

			String str;
			int i = 0;
			while((str = br.readLine()) != null) {
				quiz[i] = str;
				i++;
			}
		} catch(IOException e) {
			System.out.println("IO error.");
		}
	}

	// クリックされたとき
	public void actionPerformed(ActionEvent ae) {
		String target = answer.getText();
		if(target.equals(quiz[1])){
			System.out.println("right.");
		} else {
			System.out.println("wrong.");
		}
	}
}