package hjh202121072;

import java.io.IOException;

public class Finalterm04 {
	public class TooSmallException extends ArithmeticException {
		public TooSmallException() {
			super("First number is too small");
		}
	}
	public static void main(String[] args) {
		try {
			int case1 = 3 / 0;
			
		} catch(ArithmeticException e) {
			System.out.println("/ by zero");
		}

		int[] check = new int[1];
		
		try {
			int case2 = Integer.parseInt("ABC");
		} catch(NumberFormatException e) {
			System.out.println("For intut string: ABC");
		}
		
		try {
			int case3 = check[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index 1 out of bounds for length 1");
		}
		try {
			int case4 = new Finalterm04().sum(0, 2); 
		} catch(TooSmallException e) {
			System.out.println("First number is too small");
		}
		
		try {
			int case5 = System.in.read(new byte[100]);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
	}
	public int sum(int a, int b)throws TooSmallException{
		if(a == 0) {
			throw new TooSmallException();
		}
		return a+b;
	}
}
