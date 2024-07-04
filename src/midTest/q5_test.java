package midTest;

public class q5_test {

	public static void main(String[] args) {
		q5 obj[] = new q5[2];
		obj[0] = new doggy();
		obj[1] = new kitty();
		for (int i = 0; i < 2; i++){
			obj[i].sound();
		}

	}

}
