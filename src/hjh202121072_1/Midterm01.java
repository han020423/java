package hjh202121072_1;
import java.util.*;
public class Midterm01 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			final double PI = 3.141592;
			double area, area2;
			int r;
			System.out.print("radius of sphere : ");
			r = input.nextInt();
			area = 4 * r * r * PI;
			area2 = (double)4 / 3 * r * r * r * PI;
			System.out.println("Volume of sphere : " + area2);
			System.out.println("Volume of sphere : " + area);
		}
	}