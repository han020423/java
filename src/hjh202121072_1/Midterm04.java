package hjh202121072_1;

public class Midterm04 {
	private String model = "temp";
	private String factory;
	private int id;
	private static int numberOfTv = 200;
	
	Midterm04(String factory) {
		this.model = "B1";
		this.factory = factory;
		numberOfTv++;
		System.out.println("procudtion of Car " + numberOfTv + ", " + model + " From : " + factory);
	}
	Midterm04(String model, String factory) {
		this.model = model;
		this.factory = factory;
		numberOfTv++;
		System.out.println("procudtion of Car " + numberOfTv + ", " + model + " From : " + factory);	
	}
	public static int getNumberOfTv() {
		return (numberOfTv - 200);
	}
	public static void showNumberOfTv() {
		System.out.println("Cumulative production : " + (numberOfTv - 200));
	}
	public void setFactory(String s) {
		System.out.println("[warn] Maker is changed after production");
		this.factory = s;
		System.out.println("procudtion of Car " + numberOfTv + ", " + model + " From : " + factory);
	}
	public static void main(String[] args) {
		Midterm04 obj1 = new Midterm04("A3", "seoul");
		Midterm04 obj2 = new Midterm04("busan");
		Midterm04 obj3 = new Midterm04("A3", "china");
		
		int num = Midterm04.getNumberOfTv();
		System.out.println("Num of Tv : " + num);
		obj3.setFactory("seoul");
		Midterm04.showNumberOfTv();
		
	}
}
