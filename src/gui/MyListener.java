package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener{
	int cnt = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();

		cnt = cnt + 1;
		System.out.println(btn.getText() + cnt);
		if(btn.getText() == "버튼")
			btn.setText("클릭");
		else
			btn.setText("버튼");
		
	}

}
//컴포넌트 하나에만 할당 가능