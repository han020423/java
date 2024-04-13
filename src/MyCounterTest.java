
public class MyCounterTest {

	public static void main(String[] args) {
		MyCounter obj = new MyCounter();
		
		MyCounter obj2 = new MyCounter();
		obj2.value = 10;
		int x = 10;
		obj.inc(obj2);
		System.out.println("x = " + obj2.value);
	}

}
