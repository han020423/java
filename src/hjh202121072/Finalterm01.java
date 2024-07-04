package hjh202121072;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import finalTest.GUIclassic;

public class Finalterm01 extends JFrame implements ActionListener{
	private JButton button;
	private JTextField filed1;
	private JTextField filed2;
	public Finalterm01() {
		JPanel panel = new JPanel();
		setLayout(new GridLayout(3, 0));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		add(panel1);
		add(panel2);
		add(panel3);
		
		//panel1
		JLabel label1 = new JLabel("Temperature F");
		filed1 = new JTextField(15);
		panel1.add(label1);
		panel1.add(filed1);
		
		//panel2
		JLabel label2 = new JLabel("Temperature C");
		filed2 = new JTextField(15);
		panel2.add(label2);
		panel2.add(filed2);
		
		//panel3
		button = new JButton("Change");
		button.addActionListener(this);
		panel3.add(button);
		
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Finalterm01");
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		float f;
		if(e.getSource() == button) {
			f = Float.valueOf(filed1.getText());
			filed2.setText("" + (32 * f - 32) * 5 / 9);
		}	
	}
	
	public static void main(String[] args) {
		Finalterm01 l = new Finalterm01();
	
	}
}
