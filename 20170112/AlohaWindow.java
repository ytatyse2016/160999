// AlohaWindow
import java.awt.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
		JFrame frame;
		Container con;
		JLabel label;
		JButton button;

		button = new JButton("HELLO");
		label = new JLabel("ALOHA");

		frame = new JFrame("AlohaWindow");
		con = frame.getContentPane();

		con.setLayout(new GridLayout(2, 1));
		con.add(label);
		con.add(button);

		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}