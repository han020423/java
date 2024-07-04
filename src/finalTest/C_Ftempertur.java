package finalTest;

import javax.swing.*;

public class C_Ftempertur extends JFrame{
	public C_Ftempertur() {
		setSize(300, 150);      //사이즈 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X를 누르면 닫힘
		setTitle("기말연습1");       // 제목
		JPanel panel = new JPanel(); 
		
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JButton button = new JButton("변환");
		
		add(panel);    //프레임에 add
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(button);
		
		
		setVisible(true);    // 이미지 표시
	}
	public static void main(String[] args) {
		C_Ftempertur l = new C_Ftempertur();
	
	}

}
