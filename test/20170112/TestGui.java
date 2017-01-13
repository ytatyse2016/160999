// TestGui.java
//   Swingのテスト。

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TestGui {
	public static void main(String[] args) {
		AlohaWindowMan awm = new AlohaWindowMan();
		awm.write("ALOHA");
	}
}


class AlohaWindowMan implements ActionListener{
	// field
	JFrame frame;
	JPanel panel;
	JScrollPane scrollPane;
	Container con;
	JTextField textField;
	JButton button1;
	JButton button2;
	JTextArea textArea;

	// method
	public AlohaWindowMan() {
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400, 400);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		textField = new JTextField("", 20);
		button1 = new JButton("Read");
		button1.addActionListener(this);
		button1.setActionCommand("read");
		button2 = new JButton("Save");
		button2.addActionListener(this);
		button2.setActionCommand("save");

		con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));

		panel.add(textField);
		panel.add(button1);
		panel.add(button2);

		con.add(panel);
		con.add(scrollPane);

		frame.setVisible(true);
	}

	public void write(String str) {
		this.textArea.setForeground(Color.blue);
		this.textArea.setText(str);
	}

	public void actionPerformed(ActionEvent ae) {
		// String msg = textField.getText();
		// textArea.setText(msg);
		String cmd = ae.getActionCommand();
		String fileName = textField.getText();

		if(cmd.equals("read")){
			FileReader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);

				String line;
				while((line = br.readLine()) != null) {
					textArea.append(line+'\n');
				}
			} catch(IOException e) {
				System.out.println("IO error on reading data.");
			} finally {
				try {
					br.close();
				} catch(IOException e) {
					System.out.println("IO error at closing input file.");
				}
			}
		} else if(cmd.equals("save")) {
			FileWriter fw = null;
			PrintWriter pw = null;

			try {
				fw = new FileWriter(fileName);
				pw = new PrintWriter(fw);

				String textData = textArea.getText();
				pw.println(textData);
			} catch(IOException e) {
				System.out.println("IO error on saving data.");
			} finally {
				try {
					pw.close();
					fw.close();
				} catch(IOException e) {
					System.out.println("IO error at closing output file.");
				}
			}
		}
	}
}