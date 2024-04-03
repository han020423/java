
public class Television {
	private int channel = 7;
	int volume;
	boolean onOff;

	void print() {
		System.out.println("텔레비전의 채널은 " + channel + "이고 볼륨은" + volume + "입니다.");
	}
	
	public void setChannel(int newChannel) {
		if(newChannel >= 1 && newChannel <= 9)
			channel = newChannel;
	}
	
/*	public String toString() {
		System.out.println("텔레비전의 채널은 " + channel + "이고 볼륨은" + volume + "입니다.");
	}*/
}
