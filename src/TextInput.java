import java.util.Scanner;

public class TextInput {
	
	public
	static boolean parseWWW(String str) {
		if(str.indexOf("www") == 0)
			return true;
		else
			return false;
	}
}
