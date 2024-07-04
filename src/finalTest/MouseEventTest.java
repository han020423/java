package finalTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventTest extends JFrame implements MouseListener, MouseMotionListener {
	public MouseEventTest() {
		setTitle("Mouse Event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(this);   //마우스 동작 감지
		panel.addMouseMotionListener(this); //마우스 이동 감지
		add(panel);
		setVisible(true);
	}

	//마우스 버튼이 눌렸는지 확인
	public void mousePressed(MouseEvent e) {
		display("Mouse pressed (# of clicks: " + e.getClickCount() + ")", e);
	}
	//마우스 버튼을 땠는지 확인
	public void mouseReleased(MouseEvent e) {
		display("Mouse released (# of clicks: " + e.getClickCount() + ")", e);
	}
	
	//마우스가 화면에 진입했는지 확인
	public void mouseEntered(MouseEvent e) {
		display("Mouse entered", e);
	}
	
	//마우스가 화면에서 나갔는지 확인
	public void mouseExited(MouseEvent e) {
		display("Mouse exited", e);
	}
	
	//마우스버튼이 클릭됐는지 확인
	public void mouseClicked(MouseEvent e) {
		display("Mouse clicked (# of clicks: " + e.getClickCount() + ")", e);
	}

	
	protected void display(String s, MouseEvent e) {
		System.out.println(s + " X=" + e.getX() + " Y=" + e.getY());
	}
	
	//마우스를 누르면서 이동(드래그) 하는중인지 확인
	public void mouseDragged(MouseEvent e) {
			display("Mouse dragged", e);
	}
	
	//마우스가 움직이고 있는지 확인
	public void mouseMoved(MouseEvent e) {
		display("Mouse moved", e);
	}
	
	public static void main(String[] args) {
	MouseEventTest f = new MouseEventTest();
}
}





