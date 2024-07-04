package midTest;

public class q4 {
	private String name = "temp";
	private String make;
	private static int numberOfCar = 0;
	
	q4(String n, String m) {
		this.name = n;
		this.make = m;
		numberOfCar++;
		System.out.println("자동차 1대 생산. 생산지 : " + make);	
	}
	q4(String m) {
		this.make = m;
		numberOfCar++;
		System.out.println("자동차 1대 생산. 생산지 : " + make);	
	}
	
	public static int getNumberOfCars() {
	        return numberOfCar;
	}
	public static void ShowNumberOfCar() {
		System.out.println("누적 생산량 : " + numberOfCar + "대");
	
	}
	
	public static void main(String[] args) {
		q4 obj1 = new q4("A4", "seoul");
		q4 obj2 = new q4("Busan");
		q4 obj3 = new q4("A3", "Busan");
		 int num = getNumberOfCars();
		 System.out.println(num + "대");
		q4.ShowNumberOfCar();
	}

}
