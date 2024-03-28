import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("확인할 숫자를 입력하세요: ");
		int n = input.nextInt();
		if(n % 3 == 0)
			System.out.println(n + "은(는) 3의 배수입니다.");
		else
			System.out.println(n + "은(는) 3의 배수가 아닙니다.");
	}
}
