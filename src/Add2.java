import java.util.Scanner;
//두 정수를 입력받아 더하는 프로그램
public class Add2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		a = input.nextInt();
		int b;
		b = input.nextInt();
		int sum = a + b;
		System.out.println("Result: " + sum);

	}

}
