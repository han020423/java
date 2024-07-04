package finalTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class changeBackground extends JFrame implements ActionListener{
	private JPanel panel;
	private JButton btn1;
	private JButton btn2;
	public changeBackground() {
		Toolkit kit = Toolkit.getDefaultToolkit();      //키트 설정
		Dimension screenSize = kit.getScreenSize();     //스크린사이즈 받기
		
		setSize(300, 200);      //사이즈 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X를 누르면 닫힘
		setTitle("기말연습2");       // 제목
		setResizable(true);        //사이즈 변경
		setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);    //화면 위치 설정
		
		panel = new JPanel();
		btn1 = new JButton("노랑색");
		btn1.addActionListener(this);
		btn2 = new JButton("분홍색");
		btn2.addActionListener(this);
		panel.add(btn1);
		panel.add(btn2);
		add(panel);
		setVisible(true);    // 이미지 표시
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			panel.setBackground(Color.YELLOW);
		}
		if(e.getSource() == btn2) {
			panel.setBackground(Color.PINK);
		}
		
	}
	public static void main(String[] args) {
		changeBackground l = new changeBackground();
	
	}
}
