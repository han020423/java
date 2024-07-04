package finalTest;

import java.awt.*;
import javax.swing.*;

public class GUIclassic extends JFrame{
	public GUIclassic() {
		Toolkit kit = Toolkit.getDefaultToolkit();      //키트 설정
		Dimension screenSize = kit.getScreenSize();     //스크린사이즈 받기
		
		setSize(300, 150);      //사이즈 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //X를 누르면 닫힘
		setTitle("기말연습2");       // 제목
		setResizable(true);        //사이즈 변경
		setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 75);    //화면 위치 설정
		
		setLayout(new FlowLayout());  //레이아웃 설정
		JPanel panel = new JPanel(); 
		JButton button = new JButton("버튼");
		
		add(panel);    //프레임에 add
		panel.add(button);
		
		
		setVisible(true);    // 이미지 표시
	}
	public static void main(String[] args) {
		GUIclassic l = new GUIclassic();
	
	}
}
//setLocation(x, y) , setBounds(x, y, width, height), setSize(width, height) 위치, 크기 설정
/*
//JTextField - 기본적인 텍스트 필드 
//JFormattedTextField - 사용자가 입력할 수 있는 문자를 제한한다. 
//JPasswordField - 사용자가 입력하는 내용이 보이지 않는다.
//JComboBox - 사용자가 직접 입력할 수도 있지만 항목 중에서 선택할 수 있다.
//JSpinner - 텍스트 필드와 버튼이 조합된 것으로 사용자는 이전 버튼과 다음 버튼을 이용하여 선택할 수 있다.
*/
/*
➢ JButton - 가장 일반적인 버튼이다.
➢ JCheckBox - 체크박스 버튼
➢ JRadioButton - 라디오 버튼으로 그룹 중의 하나의 버튼만 체크할 수 있다
*/
//setMinimumSize(), setPreferredSize(), setMaximumSize(new Dimension(300, 200)) 버튼 크기 조절 
//button.setAlignmentX(JComponent.CENTER_ALIGNMENT); // 중앙 정렬
//panel.applyComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT)   //배치 방향 설정