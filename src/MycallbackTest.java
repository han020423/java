import java.awt.event.ActionListener;
import javax.swing.Timer;


public class MycallbackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener obj = new MyClass();
		Timer t = new Timer(1000, event->{System.out.println("beep");});
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}