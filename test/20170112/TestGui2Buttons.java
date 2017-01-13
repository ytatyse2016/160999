// TestGui2Buttons.java
//  複数のボタンのテスト。ActionCommandのテスト。

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TestGui2Buttons {
	public static void main(String[] args) {
		AlohaButtonMan abm = new AlohaButtonMan();
	}
}


class AlohaButtonMan implements ActionListener{
	JFrame frame;
	JButton button1;
	JButton button2;
	JPanel buttonPanel;
	JPanel labelPanel;
	JLabel label;

	public AlohaButtonMan() {
		frame = new JFrame("Test: 2 Buttons");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonPanel = new JPanel();
		labelPanel = new JPanel();

		button1 = new JButton("btn1");
		button1.addActionListener(this);
		button1.setActionCommand("btn1");
		button2 = new JButton("btn2");
		button2.addActionListener(this);
		button2.setActionCommand("btn2");

		label = new JLabel("ALOHA");

		buttonPanel.add(button1);
		buttonPanel.add(button2);

		labelPanel.add(label);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(buttonPanel);
		con.add(labelPanel);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String eventName = ae.getActionCommand();
		label.setText(eventName);
	}
}