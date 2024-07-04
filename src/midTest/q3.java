package midTest;


public class q3 {
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		q3 obj = new q3();
		 obj.sum(10,20,30);
		 obj.sum(10,20);
	}

}
