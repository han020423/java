package finalTest;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseCar extends JFrame implements MouseMotionListener, MouseListener{
	private JButton car;
	private int x = 170;
	private int y = 200;
	public MouseCar() {
		Toolkit kit = Toolkit.getDefaultToolkit();      //키트 설정
		Dimension screenSize = kit.getScreenSize();     //스크린사이즈 받기
		
		setSize(500, 500);      //사이즈 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X를 누르면 닫힘
		setTitle("기말연습2");       // 제목
		setResizable(true);        //사이즈 변경
		setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 75);    //화면 위치 설정
		
		JPanel p = new JPanel();
		p.setLayout(null);
		car = new JButton("car");
		car.setBounds(x, y, 100, 50);  //위치 설정
	//	p.addMouseListener(this);
		p.addMouseMotionListener(this);
		p.add(car);
		
		
		
		add(p);
		setVisible(true);    // 이미지 표시
	}
	//마우스 버튼이 눌렸는지 확인
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			System.out.println(x + ", " + y);
			car.setBounds(x, y, 100, 50);
		}
		//마우스 버튼을 땠는지 확인
		public void mouseReleased(MouseEvent e) {

		}
		
		//마우스가 화면에 진입했는지 확인
		public void mouseEntered(MouseEvent e) {

		}
		
		//마우스가 화면에서 나갔는지 확인
		public void mouseExited(MouseEvent e) {

		}
		
		//마우스버튼이 클릭됐는지 확인
		public void mouseClicked(MouseEvent e) {
		
		}
	//마우스를 누르면서 이동(드래그) 하는중인지 확인
		public void mouseDragged(MouseEvent e) {
				
		}
		
		//마우스가 움직이고 있는지 확인
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			System.out.println(x + ", " + y);
			car.setBounds(x + 10, y + 10, 100, 50);
		}
	
	public static void main(String args[]) {
		MouseCar f = new MouseCar();
	}
}