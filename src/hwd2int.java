import java.util.Scanner;

public class hwd2int {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("한글을 입력하시오: ");
		String hwdNum = input.next();
		
		switch(hwdNum) {
		
		case "하나", "일", "첫째":
			System.out.print(1);
			break;
		case "둘", "이", "둘째":
			System.out.print(2);
			break;
		default:
			System.out.print("없음");
			break;
		}
	}

}
