
public class AUtoCarTest {

	public static void main(String[] args) {
		OperateCar car = new AutoCar();
		
		car.start();
		car.setSpeed(100);
		car.turn(90);
		car.stop();
	}

}
