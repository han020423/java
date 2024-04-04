
public class Car {
	public String color;
	public int speed = 0;
	public int gear = 0;
	
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
