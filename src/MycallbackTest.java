import java.awt.event.ActionListener;
import javax.swing.Timer;

//람다식을 사용해 beep 출력
public class MycallbackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener obj = new MyClass();
		Timer t = new Timer(100, event->{System.out.println("삐뽀삐뽀");});
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}