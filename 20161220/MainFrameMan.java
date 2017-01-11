import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan {
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}

// ↓"ActionListener" を実装(implements)する
class FrameMan implements ActionListener{
	// field
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;

	// method
	public FrameMan(){
		System.out.println("ALOHA from FrameMan!");

		// windowをつくる・設定する
		frame = new JFrame("FrameMan!");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new FlowLayout() );

		// パーツをつくる
		panel = new JPanel();
		label = new JLabel("HELLO");
		button = new JButton("ClickMe!");

		// ボタンに ActionListener をつける
		button.addActionListener(this);

		// パーツを載せる
		panel.add(label);
		panel.add(button);
		frame.add(panel);

		// windowを表示する
		frame.setVisible(true);
	} // コンストラクタの終わり


	// クリックに反応するメソッド
	public void actionPerformed(ActionEvent e) {
		label.setText("ALOHA!");
	}
}





