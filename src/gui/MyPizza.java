package gui;
import javax.swing.*;

public class MyPizza {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel.add(panel1);
		panel.add(panel2);
		
		JLabel label1 = new JLabel("자바 피자에 오신것을 환영합니다. 피자의 종류를 선택하십시오.");
		panel1.add(label1);
		
		JButton button = new JButton("콤보 피자");
		JButton button2 = new JButton("포테이토 피자");
		JButton button3 = new JButton("불고기 피자");
		JLabel label2 = new JLabel("개수");
		JTextField filed2 = new JTextField(10);
		panel2.add(button);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(label2);
		panel2.add(filed2);
		
		f.setSize(600, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("MyPizza");
		f.setVisible(true);
	}

}
