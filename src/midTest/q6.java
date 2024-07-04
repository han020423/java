package midTest;

public class q6 implements Fly, drive{
	public void drive() {
		System.out.println("Im driving");
	}
	public void fly() {
		System.out.println("Im flying");
	}

	public static void main(String[] args) {
		q6 obj = new q6();
		Fly a = obj;
		drive b = obj;
		a.fly();
		b.drive();

	}

}
