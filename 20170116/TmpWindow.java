// TmpWindow.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TmpWindow {
	public static void main(String[] args) {
		TmpWindowMan man = new TmpWindowMan();
	}
}


class TmpWindowMan implements ActionListener{
	// field
	JFrame frame;
	JTextField fileName;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JTextArea textArea;
	JScrollPane scrollPane;

	public TmpWindowMan() {
		// frameをつくる
		frame = new JFrame("TmpWindow");
		frame.setLocation(400, 400);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ボタン等をつくる
		fileName = new JTextField("ALOHA", 20);

		btnOpen = new JButton("OPEN");
		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");

		btnSave = new JButton("SAVE");
		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");

		panel = new JPanel();

		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);

		// のせる
		panel.add(fileName);
		panel.add(btnOpen);
		panel.add(btnSave);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);
		con.add(scrollPane);

		// 可視化する
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String cmd = ae.getActionCommand();

		if(cmd.equals("open")) {
			String textFile = fileName.getText();
			FileReader fr;
			BufferedReader br;

			fileName.setText("OPEN");
//			textArea.setText(textFile);

			try {
				fr = new FileReader(textFile);
				br = new BufferedReader(fr);

				String data;

				while((data = br.readLine()) != null) {
					textArea.append(data + '\n');
				}

			} catch(IOException e) {
				System.out.println("IO error.");
			}

		} else if(cmd.equals("save")) {
			fileName.setText("SAVE");
		}
	}
}