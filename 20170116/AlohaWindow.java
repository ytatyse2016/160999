// AlohaWindow
//  GUIã®ç·´ç¿ã??
//  ã?ã­ã¹ãã¨ã?ã£ã¿ãã¤ããåã«ã?

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class AlohaWindow {
	public static void main(String[] args) {
		AlohaWindowMan man = new AlohaWindowMan();
	}
}



class AlohaWindowMan implements ActionListener{
	// field
	JFrame frame;
	JTextField fileName;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JTextArea textArea;
	JScrollPane scrollPane;

	// method
	public AlohaWindowMan() {
		// ã³ã³ã¹ãã©ã¯ã¿(constructor)
		// ã¦ã£ã³ãã¦ãã¤ãã
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400, 400);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ãã¿ã³ããã£ã¼ã«ãã?ããã«ãã¤ãã
		btnOpen = new JButton("OPEN");
		btnOpen.addActionListener(this);
		btnOpen.setActionCommand("open");

		btnSave= new JButton("SAVE");
		btnSave.addActionListener(this);
		btnSave.setActionCommand("save");

		fileName = new JTextField("ALOHA", 20);
		panel = new JPanel();

		textArea = new JTextArea(10, 30);
		scrollPane = new JScrollPane(textArea);

		// ã®ãã
		panel.add(fileName);
		panel.add(btnOpen);
		panel.add(btnSave);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);
		con.add(scrollPane);

		// è¡¨ç¤ºãã
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		// ã¯ãªã?ã¯ãããå?´åã?®å¦ç?
		String cmd = ae.getActionCommand();

		if(cmd.equals("open")) {
			fileName.setText("OPEN");

			// ãã¡ã¤ã«ãèª­ã?ããã®ã?ã¼ã¿æºå
			String textFile = fileName.getText();
			FileReader fr;
			BufferedReader br;

			// ãã¡ã¤ã«ã®èª­ã¿æ¸ã?
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

