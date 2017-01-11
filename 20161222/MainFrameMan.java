	import java.awt.*;
	import javax.swing.*;

	public class MainFrameMan {
		public static void main(String[] args) {
			FrameMan fm = new FrameMan();
		}
	}



	class FrameMan {
		// データ
		JFrame frame;
		JPanel panel;
		JLabel label;

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

			// パネルとラベルをつくる
			panel = new JPanel();
			label = new JLabel("ALOHA!");

			// パネルとラベルを表示する
			panel.add(label);
			frame.add(panel);

			// windowを表示する
			frame.setVisible(true);
		}
	}