package midTest;

public class q7 implements annnimal{
	private String name;
	q7(String name) {
		this.name = name;
	}
	public String walk() {
		return "walk";
	}
	public String fly() {
		return "fit";
	}
	public String sing() {
		return "sing";
	}
	@Override
	public String toString() {
		return name + "is able to " + walk() + ", able to" + fly() + ", able to " + sing();
	}
	public static void main(String args[]){
		q7 obj = new q7("bird");
		 System.out.print(obj);
		} 
}
