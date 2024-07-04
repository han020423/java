package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calculator extends JFrame implements ActionListener{
	private float n1 = 0f;
	private float n2 = 0f;
	private float sum = 0f;
	private boolean plus = false;
	private boolean sub = false;
	private boolean mul = false;
	private boolean divide = false;
	private boolean remain = false;
	
	private JTextField filed;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	
	private JButton buttonCE;
	private JButton buttonC;
	private JButton buttonBackspace; 
	
	private JButton buttonCal;
	private JButton buttonPlus;
	private JButton buttonSub;
	private JButton buttonMul;
	private JButton buttonDivide;
	private JButton buttonRemain;
	
	private JButton buttonPoint;
	private JButton buttonPlusMinus;
	private JButton button1divideX;
	private JButton buttonSqrt;
	public Calculator(String title) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(600, 300);
		setLocation(screenSize.width / 2 - 300, screenSize.height / 2 - 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setResizable(true);
		setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel(new BorderLayout());
		filed = new JTextField();
		panel1.add(filed,BorderLayout.CENTER);
		add(panel1, BorderLayout.NORTH);
		JPanel panel2 = new JPanel(new GridLayout(0, 5, 3, 3));
		buttonBackspace = new JButton("Backspace");
		buttonBackspace.addActionListener(this);
		JButton buttonEmpty1 = new JButton("");
		JButton buttonEmpty2 = new JButton("");
		buttonCE = new JButton("CE");
		buttonCE.addActionListener(this);
		buttonC = new JButton("C");
		buttonC.addActionListener(this);
		
		button7 = new JButton("7");
		button7.addActionListener(this);
		button8 = new JButton("8");
		button8.addActionListener(this);
		button9 = new JButton("9");
		button9.addActionListener(this);
		buttonDivide = new JButton("/");
		buttonDivide.addActionListener(this);
		buttonSqrt = new JButton("sqrt");
		buttonSqrt.addActionListener(this);

		button4 = new JButton("4");
		button4.addActionListener(this);
		button5 = new JButton("5");
		button5.addActionListener(this);
		button6 = new JButton("6");
		button6.addActionListener(this);
		buttonMul = new JButton("*");
		buttonMul.addActionListener(this);
		buttonRemain = new JButton("%");
		buttonRemain.addActionListener(this);
		
		button1 = new JButton("1");
		button1.addActionListener(this);
		button2 = new JButton("2");
		button2.addActionListener(this);
		button3 = new JButton("3");
		button3.addActionListener(this);
		buttonSub = new JButton("-");
		buttonSub.addActionListener(this);
		button1divideX = new JButton("1/x");
		button1divideX.addActionListener(this);

		button0 = new JButton("0");
		button0.addActionListener(this);
		buttonPlusMinus = new JButton("+/-");
		buttonPlusMinus.addActionListener(this);
		buttonPoint = new JButton(".");
		buttonPoint.addActionListener(this);
		buttonPlus = new JButton("+");
		buttonPlus.addActionListener(this);

		buttonCal = new JButton("=");
		buttonCal.addActionListener(this);
		
		panel2.add(buttonBackspace);
		panel2.add(buttonEmpty1);
		panel2.add(buttonEmpty2);
		panel2.add(buttonCE);
		panel2.add(buttonC);
		
		panel2.add(button7);
		panel2.add(button8);
		panel2.add(button9);
		panel2.add(buttonDivide);
		panel2.add(buttonSqrt);

		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(buttonMul);
		panel2.add(buttonRemain);
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(buttonSub);
		panel2.add(button1divideX);
		
		panel2.add(button0);
		panel2.add(buttonPlusMinus);
		panel2.add(buttonPoint);
		panel2.add(buttonPlus);
		panel2.add(buttonCal);
		add(panel2, BorderLayout.CENTER);
		
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button1) {
			filed.setText(filed.getText()+1);
		}
		else if(e.getSource() == button2) {
			filed.setText(filed.getText()+2);
		}
		else if(e.getSource() == button3) {			
			filed.setText(filed.getText()+3);
		}
		else if(e.getSource() == button4) {
			filed.setText(filed.getText()+4);
		}
		else if(e.getSource() == button5) {
			filed.setText(filed.getText()+5);
		}
		else if(e.getSource() == button6) {
			filed.setText(filed.getText()+6);
		}
		else if(e.getSource() == button7) {
			filed.setText(filed.getText()+7);
		}
		else if(e.getSource() == button8) {
			filed.setText(filed.getText()+8);
		}
		else if(e.getSource() == button9) {
			filed.setText(filed.getText()+9);
		}
		else if(e.getSource() == button0) {
			filed.setText(filed.getText()+0);
		}
		else if(e.getSource() == buttonPoint) {
			filed.setText(filed.getText()+".");
		}
		
		
		else if(e.getSource() == buttonCE) {
			filed.setText("");
			n1 = 0;
			n2 = 0;
		}
		else if(e.getSource() == buttonC || e.getSource() == buttonBackspace) {
			int t = filed.getText().length();
			if(t == 0) {
				filed.setText("");
			}
			else {
				filed.setText(filed.getText().substring(0, t - 1));
			}
		}
		
		
		else if(e.getSource() == buttonPlus) {
			n1 = Float.valueOf(filed.getText());
			plus = true;
			filed.setText("");
		}
		else if(e.getSource() == buttonSub) {
			n1 = Float.valueOf(filed.getText());
			sub = true;
			filed.setText("");
		}
		else if(e.getSource() == buttonMul) {
			n1 = Float.valueOf(filed.getText());
			mul = true;
			filed.setText("");
		}
		else if(e.getSource() == buttonDivide) {
			n1 = Float.valueOf(filed.getText());
			divide = true;
			filed.setText("");
		}
		else if(e.getSource() == buttonRemain) {
			n1 = Float.valueOf(filed.getText());
			remain = true;
			filed.setText("");
		}
		else if(e.getSource() == buttonCal) {
			n2 = Float.valueOf(filed.getText());
			if(plus == true) {
				sum = n1 + n2;
				plus = false;
			}
			else if(sub == true) {
				sum = n1 - n2;
				sub = false;
			}
			else if(mul == true) {
				sum = n1 * n2;
				mul = false;
			}
			else if(divide == true){
				sum = n1 / n2;
				divide = false;
			}
			else if(remain == true){
				sum = n1 % n2;
				remain = false;
			}
			
			filed.setText(sum + "");
		}
		else if(e.getSource() == buttonPlusMinus) {
			float temp = Float.valueOf(filed.getText());
			temp *= -1;
			filed.setText(temp + "");
		}
		else if(e.getSource() == button1divideX) {
			float temp = Float.valueOf(filed.getText());
			temp = 1 / temp;
			filed.setText(temp + "");
		}
		else if(e.getSource() == buttonSqrt) {
			double temp = Double.valueOf(filed.getText());
			temp = Math.sqrt(temp);
			filed.setText((float)temp + "");
		}
		
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator("Calculator");

	}

}
