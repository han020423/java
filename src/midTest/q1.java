package midTest;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int  a, b;
		System.out.print("사각형의 가로를 입력하시오: ");
		a = input.nextInt();
		System.out.print("사각형의 세로를 입력하시오: ");
		b = input.nextInt();
		System.out.println("사각형의 넓이는 " + (double)(a * b) + "입니다");
		System.out.println("사각형의 둘레는 " + (double)((a * 2) + (b * 2)) + "입니다");
	}
}
