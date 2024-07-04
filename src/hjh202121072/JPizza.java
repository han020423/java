package hjh202121072;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;



public class JPizza extends JFrame{
	public JPizza() {
		setLayout(new BorderLayout());
		
		JButton button = new JButton("combo");
		JLabel txt = new JLabel("pcs");
		JTextField feild = new JTextField(10);
		JPanel panel = new JPanel(new FlowLayout());
		JButton button2 = new JButton("order");
		panel.add(txt);
		panel.add(feild);
		
		add(button);
		add(panel);
		add(button2);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JPizza");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JPizza l = new JPizza();
	
	}
}
