package finalTest;

import javax.swing.*;
import java.awt.event.*;

public class EventClass1 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("버튼 1 클릭됨");
	}
}
//독랍적인 클래스로 이벤트 처리