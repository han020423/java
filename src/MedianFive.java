import java.util.Scanner;
import java.util.Arrays;
public class MedianFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("양수 다섯개를 입력하세요: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();
		Arrays.sort(arr);
		System.out.println("가운데 값: " + arr[2]);
	}

}
