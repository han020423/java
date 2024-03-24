import java.util.Scanner;

public class int2hwd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int num = input.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.print("하나");
			break;
		case 2:
			System.out.print("둘");
			break;
		default:
			System.out.print("없음");
			break;
		}
	}

}
