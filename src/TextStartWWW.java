import java.util.Scanner;
public class TextStartWWW {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("문자열을 입력하세요>");
			String str = input.next();
			if(str.equals("quit"))
				break;
			boolean ox = TextInput.parseWWW(str);
		
			if(ox == true)
				System.out.println(str + "은 'www'로 시작합니다.");
			else
				System.out.println(str + "은 'www'로 시작하지 않습니다.");		
		}
	}
}
