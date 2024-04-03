
public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setColor("빨강");
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
		myCar.changeGear(2);
		myCar.speedUp();
		System.out.println(myCar);
		myCar.changeGear(1);
		myCar.speedDown();
		System.out.println(myCar);
	}

}
