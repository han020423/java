
public class Television {
	private int channel;
	private int volume;
	private boolean onOff;

	public Television() {
		this(1, 1, false);
	}
	public Television(int c) {
		this(c, 1, false);
	}
	public Television(int c, int v) {
		this(c, v, false);
	}
	public Television(int c, int v, boolean of) {
		this.channel = c;
		this.volume = v;
		this.onOff = of;
	}
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
