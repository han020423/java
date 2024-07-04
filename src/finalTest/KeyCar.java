package finalTest;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCar extends JFrame implements KeyListener{
	private JButton car;
	private int x = 170;
	private int y = 200;
	public KeyCar() {
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
		car.addKeyListener(this);
		p.add(car);
		
		
		
		add(p);
		setVisible(true);    // 이미지 표시
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
	//키가 눌렸는지
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == 37) {
			x -= 10;
		}
		if(key == 38) {
			y -= 10;
		}
		if(key == 39) {
			x += 10;
		}
		if(key == 40) {
			y += 10;
		}
		car.setBounds(x, y, 100, 50);
	}
	
	//키가 떼졌는지
	public void keyReleased(KeyEvent e) {
		
	}
	
	public static void main(String args[]) {
		KeyCar f = new KeyCar();
	}
}


//자동차 이미지 세팅, 이동 함수
/*
	try {
	img = ImageIO.read(new File("car.gif"));
	} catch (IOException e) {
	System.out.println("no image");
	System.exit(1);
	}
*/
/*
public void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawImage(img, img_x, img_y, null);
}
*/