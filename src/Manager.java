
public class Manager extends Employee{
	private int bonus;
	
	Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	public void test() {
		System.out.println("name=" + name);
		System.out.println("address=" + address);
		System.out.println("salary=" + salary);
	}
}
