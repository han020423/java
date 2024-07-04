
public class AutoCar implements OperateCar{
// OperateCar 인터체이스를 상속받아 만든 AutoCar 클래스
	@Override
	public void start() {
		System.out.println("start");	
	}

	@Override
	public void stop() {
		System.out.println("stop");		
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("setSpeed: " + speed);		
	}

	@Override
	public void turn(int digree) {
		System.out.println("turn: " + digree);		
	}

}
