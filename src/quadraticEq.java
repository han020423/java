import java.util.Scanner;

public class quadraticEq {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, A1, A2;
		a = 1; //이차항
		System.out.print("일차항의 계수를 입력하시오: ");
		b = input.nextDouble(); //일차항
		System.out.print("상수항을 입력하시오: ");
		c = input.nextDouble(); //상수항
		
		if(b * b - (4 * a * c) >= 0) {
			A1 = (b * -1 + Math.sqrt(b * b - (4 * a * c))) / (2 * a);
			A2 = (b * -1 - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
			
			System.out.print("이차방정식의 근은 ");
			if(A1 == A2) {
				System.out.println(A1 + "입니다.");
			}
			else {
				System.out.println(A1 + ", " +A2 + "입니다.");
			}
		}
		else {
			System.out.println("없습니다.");
		}
	}

}
