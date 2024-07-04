package midTest;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		int num =-1;
		Scanner input = new Scanner(System.in);
		while(num < 0) {
			System.out.print("양의 정수를 입력학시오: ");
			num = input.nextInt();
			if(num < 0) {
				System.out.println("양의 정수가 아닙니다.");
			}
		}
		System.out.println(num + "의 약수는 다음과 같습니다.");
		for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");			
			}
				
		}	
		System.out.println(num);	
	}
}
