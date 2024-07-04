package finalTest;

import javax.swing.*;
import java.awt.*;


public class borderLayout extends JFrame{
	public borderLayout() {
		setSize(400, 400);      //사이즈 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X를 누르면 닫힘
		setTitle("보더레이아웃");       // 제목
		
		setLayout(new BorderLayout());  //레이아웃 설정
		
		add(new JButton("CENTER"), BorderLayout.CENTER);
		add(new JButton("top"), BorderLayout.NORTH);
		add(new JButton("bottom"), BorderLayout.SOUTH);
		add(new JButton("lfet"), BorderLayout.WEST);
		add(new JButton("right"), BorderLayout.EAST);
		
		setVisible(true);    // 이미지 표시
	}
	
	public static void main(String[] args) {
		borderLayout l = new borderLayout();
	
	}
 }