import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan2 {
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}

// ↓"ActionListener" を実装(implements)する
class FrameMan implements ActionListener{
	// field
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JLabel label;
	JButton button;
	JTextField textfield;

	// method
	public FrameMan(){
		System.out.println("ALOHA from FrameMan!");

		// windowをつくる・設定する
		frame = new JFrame("FrameMan!");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new BorderLayout() );

		// パーツをつくる
		panel1 = new JPanel();
		panel2 = new JPanel();
		label = new JLabel("HELLO");
		button = new JButton("ClickMe!");
		textfield = new JTextField(10);

		// ボタンに ActionListener をつける
		button.addActionListener(this);

		// パーツを載せる
		panel1.add(textfield);
		panel1.add(button);
		panel2.add(label);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);

		// windowを表示する
		frame.setVisible(true);
	} // コンストラクタの終わり


	// クリックに反応するメソッド
	public void actionPerformed(ActionEvent e) {
		String data = textfield.getText();
		label.setText(data);
	}
}





