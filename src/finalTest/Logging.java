package finalTest;

import java.util.logging.Logger;

public class Logging {
	public static void main(String argv[]) {
		String filename = "test.dat";
		Logger.getGlobal().info(filename + " 파일을 오픈하였음 ");
		}
}
