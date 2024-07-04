
public class BacIndex {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		try {
			int result = array[12];
		} catch(Exception e) {
			System.out.println("인덱스 잘못");
		}
		System.out.println("xnp 잘못");

		
	}

}
