
public class SafeArrayTest {

	public static void main(String[] args) {
		SafeArray array = new SafeArray(3);
		
		for(int i = 0; i < (array.length + 5); i++) {
			array.put(i, i * 10);
		}
	}

}
