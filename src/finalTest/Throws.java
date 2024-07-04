package finalTest;

import java.io.IOException;

public class Throws {
	public static void main(String[] args) {
		try {
			System.out.println(readString());
		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오: ");
		System.in.read(buf);
		return new String(buf);
	}
}

/*
 public Object pop() {
Object obj;
if (size == 0) {
throw new EmptyStackException();
}
...
return obj;
}
*/
