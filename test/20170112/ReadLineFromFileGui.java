// ReadLineFromFileGui.java
//   テキストファイルビューアを作る。

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReadLineFromFileGui {
	public static void main(String[] args) {
		JFrame frame;
		JPanel buttonPanel;
		JTextField fileNameField;
		JButton readButton;
		JScrollPane scrollPane;
		JTextArea fileContentsArea;
		Container con;

		frame = new JFrame("TextFile Viewer");
		frame.setLocation(400, 400);
		frame.setSize(400, 400);

		buttonPanel = new JPanel();
		fileNameField = new JTextField("ALOHA", 20);
		readButton = new JButton("Read");
		fileContentsArea = new JTextArea();
		scrollPane = new JScrollPane(fileContentsArea);

		con = frame.getContentPane();
		con.setLayout(new BorderLayout());

		buttonPanel.add(fileNameField);
		buttonPanel.add(readButton);

		con.add(buttonPanel, BorderLayout.NORTH);
		con.add(scrollPane, BorderLayout.CENTER);

		frame.setVisible(true);

		fileContentsArea.setForeground(Color.blue);
		fileContentsArea.setText("ALOHA");

	}
}