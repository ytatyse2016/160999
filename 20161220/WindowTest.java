	import java.awt.*;
	import javax.swing.*;

	public class WindowTest {
		public static void main(String[] args) {
			// 変数をつくる
			JFrame frame = new JFrame();
			JLabel label = new JLabel("HELLO");
			JButton button = new JButton("ClickMe!");

			// windowの設定
			frame.setBounds(50, 50, 300, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout( new FlowLayout() );

			// ラベルとボタンをはりつける
			Container ctnr = frame.getContentPane();
			ctnr.add(label);
			ctnr.add(button);

			// windowを表示する
			frame.setVisible(true);
		}
	}
