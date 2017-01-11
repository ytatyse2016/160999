import java.awt.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
		JFrame frame;

		// ウィンドウをつくる
		frame = new JFrame();

		// ウィンドウの設定
		frame.setLocation(200, 200);	// 場所
		frame.setSize(300, 300);		// サイズ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ウィンドウを表示する
		frame.setVisible(true);
	}
}
