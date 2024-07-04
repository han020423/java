package hjh202121072_1;
import java.util.*;
public class Midterm02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = -99;
		int num2 = -99;
		int big;
		while(true) {
			num = -99;
			num2 = -99;
			while(num < 0) {
				System.out.print("Positive Number1 : ");
				num = input.nextInt();
				if(num == -1) {
					break;
				}
				if(num < 0) {
					System.out.println("It is not a positive value");
				}
			}
			if(num == -1) break;
			while(num2 < 0) {
				System.out.print("Positive Number2 : ");
				num2 = input.nextInt();
				if(num2 == -1) {
					break;
				}
				if(num2 < 0) {
					System.out.println("It is not a positive value");
				}
			}
			if(num2 == -1) break;
			System.out.println("The common divisor of " + num + " and " + num2 + " are");
			if(num > num2) big = num;
			else big = num2;
			for(int i = 1; i <= big / 2; i++) {
				if(num % i == 0 && num2 % i == 0) {
					System.out.print(i + " ");			
				}	
			}
			System.out.println();	
			
		}
		System.out.println("End of program");	
		
	}
}
