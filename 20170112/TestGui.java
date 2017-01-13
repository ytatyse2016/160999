// TestGui.java

import java.awt.*;
import javax.swing.*;

public class TestGui {
	public static void main(String[] args) {
		JFrame frame;
		Container con;
		JButton button1;
		JButton button2;
		JButton button3;

		frame = new JFrame();
		con = frame.getContentPane();
		button1 = new JButton("BTN1");
		button2 = new JButton("BTN2");
		button3 = new JButton("BTN3");

		con.setLayout(new BorderLayout());
		con.add(button1, BorderLayout.NORTH);
		con.add(button2, BorderLayout.CENTER);
		con.add(button3, BorderLayout.SOUTH);

		frame.setLocation(400, 400);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}