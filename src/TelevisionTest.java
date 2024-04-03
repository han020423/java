
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv1 = new Television();
		tv1.setChannel(3);
		tv1.setChannel(15);
		tv1.volume = 10;
		tv1.onOff = true;
		tv1.print();
		
		Television tv2 = new Television();
		tv2.setChannel(-1);
		tv2.volume =12;
		tv2.print();
	}

}
