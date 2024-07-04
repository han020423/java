package hjh202121072_1;

public class Midterm06 implements Order, Payment{
	public void addMenu(String name, int value) {
		
	}
	public int getPay() {
		return 0; 
	}
	int price;
	public static void main(String[] args) {
		Midterm06 obj = new Midterm06();
		
		Order a = obj;
		Payment b = obj;
		a.addMenu("Coffee", 3000);
		a.addMenu("Toasr", 12000);
		System.out.println("Total " + b.getPay());

	}

}
