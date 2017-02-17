// Aloha31.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Aloha31 {
	public static void main(String[] args) {
		Alohaman man = new Alohaman();
	}
}


class Alohaman implements ActionListener{
	// field
	JFrame frame;
	JTextField msg;
	JPanel buttonPanel;
	JPanel msgPanel;
	JButton button;

	// method
	public Alohaman() {
		frame = new JFrame("aloha31");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		msg = new JTextField("", 10);
		msgPanel = new JPanel();
		msgPanel.add(msg);

		button = new JButton("OK");
		button.addActionListener(this);
		buttonPanel = new JPanel();

		buttonPanel.add(button);
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(msgPanel);
		con.add(buttonPanel);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		System.out.println("ALOHA");

		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			// ファイルを開く
			fw = new FileWriter("output31.txt", true);
			pw = new PrintWriter(fw);

			// 書きこむ
			// pw.println("アロハ");
			pw.println(msg.getText());

		} catch(IOException e){
			System.out.println("IO error.");
		} finally {
			try {
				fw.close();
				pw.close();
			} catch(IOException e) {
				System.out.println("IO Error.");
			}
		}
	}
}