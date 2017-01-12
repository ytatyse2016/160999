	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class MainFrameMan3 {
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
		int num=0;

		// メソッド( 処理 )
		public FrameMan(){
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
			label = new JLabel("HELLO");
			button = new JButton("ClickMe!");
			button.addActionListener(this);

			// パネルとラベルとボタンを表示する
			panel.add(label);
			panel.add(button);
			frame.add(panel);

			// windowを表示する
			frame.setVisible(true);
		}

		public void actionPerformed(ActionEvent e){
			// ラベルを書きかえる.
			if(num%2==0){
				label.setText("Aoki!");
			} else {
				label.setText("HELLO");
			}
			num++;
		}
	}
