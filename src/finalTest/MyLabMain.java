package finalTest;
import javax.swing.*;

public class MyLabMain {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		//panel1
		JLabel label1 = new JLabel("화씨 온도");
		JTextField filed1 = new JTextField(15);
		panel1.add(label1);
		panel1.add(filed1);
		
		//panel2
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField filed2 = new JTextField(15);
		panel2.add(label2);
		panel2.add(filed2);
		
		//panel3
		JButton button = new JButton("변환");
		panel3.add(button);
		
		f.setSize(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도변환기");
		f.setVisible(true);
	}
}

// main 안에 다넣는거