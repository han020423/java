package gui;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	private JButton button2;
	private JLabel label;
	private int cnt = 0;
	public MyFrame(String title) {
		Toolkit kit = Toolkit.getDefaultToolkit();      //키트 설정
		Dimension screenSize = kit.getScreenSize();      //스크린사이즈 받기
		
		setSize(200, 200);       //사이즈 지정
		setLocation(screenSize.width / 2 - 100, screenSize.height / 2 - 100);     //화면 위치 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //X를 누르면 닫힘
		setTitle(title);   // 제목
		setResizable(true);     //사이즈 변경 여부
		setLayout(new BorderLayout());     //레이아웃 설정
		
		//가운데 버튼
		JButton button = new JButton("button");
		add(button, BorderLayout.CENTER);
		button.addActionListener(this);
		
		//아래 버튼들
		JPanel panel2 = new JPanel(new BorderLayout());
		button2 = new JButton("눌러보든가");
		JButton buttonBefore = new JButton("<");
		JButton buttonAfter = new JButton(">");
		panel2.add(button2, BorderLayout.CENTER);
		panel2.add(buttonBefore, BorderLayout.WEST);
		panel2.add(buttonAfter, BorderLayout.EAST);
		add(panel2, BorderLayout.SOUTH);
		
		//위쪽 라벨
		label = new JLabel("메롱");
		//label.setText("여기에 내용이 들어갑니다");
		add(label, BorderLayout.NORTH);
		setVisible(true);
		
		
	}
		@Override
		public void actionPerformed(ActionEvent e) {
		//	JButton btn = (JButton)e.getSource();
			
			cnt = cnt + 1;
			if(cnt % 2 == 0) {
				button2.setText("클릭" + cnt);
				label.setText(button2.getText());
			}
			else {
				button2.setText("버튼" + cnt);
				label.setText(button2.getText());
			}
			
		}

	public static void main(String[] args) {
		MyFrame f = new MyFrame("Frame Test");
	}
}
