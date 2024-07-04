package hjh202121072;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Finalterm02 extends JFrame{
	public Finalterm02() {
		JPanel panel = new JPanel();
		add(panel);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel.add(panel1);
		panel.add(panel2);
		
		JLabel label1 = new JLabel("Welcome to java Pizza! Select your Pizza!.");
		panel1.add(label1);
		
		JButton button = new JButton("Combo Pizza");
		JButton button2 = new JButton("Potato Pizza");
		JButton button3 = new JButton("Hawaian Pizza");
		panel2.add(button);
		panel2.add(button2);
		panel2.add(button3);
		
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Finalterm02");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Finalterm02 l = new Finalterm02();
	
	}
}
