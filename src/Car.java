
public class Car {
	private
	String color;
	int speed = 0;
	int gear = 0;
	
	public 
	void changeGear(int newGear) {
		gear = newGear;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed =+ 10;
	}
	
	void setColor(String newColor) {
		color = newColor;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
		
}
