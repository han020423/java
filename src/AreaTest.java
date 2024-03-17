import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.141592;
		double r, area;
		System.out.print("반지름을 입력하시오: ");
		r = input.nextDouble();
		area = r * r * PI;
		System.out.println("반지름이" + r + "인 원의 면적은" + area + "입니다");
	}
}
