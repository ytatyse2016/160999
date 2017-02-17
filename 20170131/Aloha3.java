// Aloha3.java
//   データ入力ウィンドウ

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Aloha3 {
	public static void main(String[] args) {
		String[] data = new String[100];
		Windowman wman = new Windowman();
		Dataman dman = new Dataman();
		Fileman fman = new Fileman();
	}
}



class Windowman {
	// データ
	JFrame frame;
	JLabel labelName;
	JPanel panelName;
	JPanel panelButton;
	JButton buttonOk;

	// メソッド
	public Windowman(){
		System.out.println("Aloha, Windowman!");

		// frameをつくる
		frame = new JFrame("windowman");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// labelをつくる
		labelName = new JLabel("名前");

		// buttonをつくる
		buttonOk = new JButton("OK");

		// panelをつくる
		panelName = new JPanel();
		panelButton = new JPanel();

		// panelに、label, buttonをのせる
		panelName.add(labelName);
		panelButton.add(buttonOk);

		// frameに、panelをのせる
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(4, 1));
		con.add(panelName);
		con.add(panelButton);

		// frameを表示する
		frame.setVisible(true);
	}
}


class Dataman {
	// データ

	// メソッド
	public Dataman() {
		System.out.println("Aloha, Dataman!");
	}
}


class Fileman {
	// データ

	// メソッド
	public Fileman() {
		System.out.println("Aloha, Fileman!");
	}
}