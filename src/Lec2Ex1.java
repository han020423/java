import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		
		System.out.print("비교할 두 수를 입력하시오: ");
		a = input.nextInt();
		b = input.nextInt();
		if(a > b)
			System.out.println(a);
		else if(a < b)
			System.out.println(b);
		else
			System.out.println("같은 수입니다.");

	}

}
