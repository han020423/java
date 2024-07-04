package finalTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event5 extends JFrame implements ActionListener{
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	public Event5() {
		Toolkit kit = Toolkit.getDefaultToolkit();      //키트 설정
		Dimension screenSize = kit.getScreenSize();     //스크린사이즈 받기
		
		setSize(500, 300);      //사이즈 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X를 누르면 닫힘
		setTitle("기말연습2");       // 제목
		setResizable(true);        //사이즈 변경
		setLocation(screenSize.width / 2 - 250, screenSize.height / 2 - 150);    //화면 위치 설정
		
		
		setLayout(new BorderLayout());  //레이아웃 설정

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 3, 3, 3));
		
		btn1 = new JButton("1");
		p.add(btn1);
		btn1.addActionListener(new EventClass1());
		
		
		btn2 = new JButton("2");
		btn2.addActionListener(new Event2());
		p.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		p.add(btn3);
		btn4 = new JButton("4");
		
		
		//무명 클래스 사용
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn4) {
					btn4.setText("버튼 4 클릭됨");
				}		
			}
		});
		p.add(btn4);
		btn5 = new JButton("5");
		
		
		//람다식 사용
		btn5.addActionListener(e-> {
			btn5.setText("버튼 5 클릭됨");
		});
		p.add(btn5);
		
		add(p, BorderLayout.CENTER);
		
		setVisible(true);
	}
	//프레임 클래스에 이벤트 처리  구현
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn3) {
			btn3.setText("버튼 3 클릭됨");
		}	
	}
	
	//내부 클래스로 이벤트 처리
	private class Event2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if((e.getSource() == btn2)) {
				btn2.setText("버튼 2 클릭됨");
			}
		}
	}
	
	public static void main(String[] args) {
		Event5 l = new Event5();
	
	}
}
