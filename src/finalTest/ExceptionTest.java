package finalTest;

public class ExceptionTest {
	public static void main(String args[]) {
		try {
			int num = Integer.parseInt("aa");
			System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println("오류발생 ㅋㅋ");
			//throw e;
		}
				
	}
}
