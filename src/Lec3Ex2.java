import java.util.Scanner;

public class Lec3Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int n = input.nextInt();
		
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				System.out.print(i + " " +(n / i) + " ");
				
			}
				
		}
	}
}
