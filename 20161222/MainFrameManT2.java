	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class MainFrameManT2 {
		public static void main(String[] args) {
			FrameMan fm = new FrameMan();
		}
	}



	class FrameMan implements ActionListener{
		// データ
		JFrame frame;
		JPanel panel;
		JLabel label;
		JButton button;

		// メソッド( 処理 )
		public FrameMan(){
			System.out.println("ALOHA2!");

			// windowをつくる
			openWindow();
		}

		private void openWindow(){
			// windowをつくる
			frame = new JFrame();

			// windowの設定
			frame.setLocation(200, 200);
			frame.setSize(300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


			// パネルとラベルとボタンをつくる
			panel = new JPanel();
			panel.setLayout(new FlowLayout());
			label = new JLabel("ALOHA!");
			button = new JButton("ClickMe!");
			button.addActionListener(this);

			// パネルとラベルを表示する
			panel.add(label);
			panel.add(button);
			frame.add(panel);

			// windowを表示する
			frame.setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			label.setText("Aoki");
		}
	}