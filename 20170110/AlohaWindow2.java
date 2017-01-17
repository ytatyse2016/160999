import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlohaWindow2 {
	public static void main(String[] args) {
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}


class AlohaWindowMan implements ActionListener{
	// field
	JFrame frame;
	JButton button;
	JPanel panel;		// ボタンとフィールドを載せる
	JTextField fileNameField;

	// method
	public AlohaWindowMan() {
		// フレームをつくる
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタンとフィールドを、パネルにのせる
		button = new JButton("Click Me!");
		button.addActionListener(this);
		fileNameField = new JTextField("ALOHA", 20);

		panel = new JPanel();
		panel.add(fileNameField);
		panel.add(button);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);

		// 表示する
		frame.setVisible(true);
	}

	// ↓クリックしたときの処理
	public void actionPerformed(ActionEvent ae) {
		fileNameField.setText("HELLO");
	}

}








