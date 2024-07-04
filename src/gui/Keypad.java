package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Keypad extends JFrame implements ActionListener{
	private JButton[] btn;
	private JTextField text ;
	public Keypad(String title) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(400, 400);
		setLocation(screenSize.width / 2 - 200, screenSize.height / 2 - 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setResizable(true);
		
		
		setLayout(new BorderLayout());
		
		text = new JTextField(30);
		add(text, BorderLayout.NORTH);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 3, 3, 3));
		btn = new JButton[9];
		for(int i = 0; i < 9; i++) {
			btn[i] = new JButton("" + i);
			btn[i].addActionListener(this);
			p.add(btn[i]);
		}
		add(p, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 9; i++) {
			if(e.getSource() == btn[i]) {
				btn[i].setText(i + "버튼 클릭됨");
				text.setText(text.getText() + i);
				System.out.println(i + "버튼 클릭됨");
			}
		}
	}
		
	
	public static void main(String[] args) {
		Keypad f = new Keypad("Keypad Test");
	}
}
//gridLayot을 이용한 키패드