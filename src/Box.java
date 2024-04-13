
public class Box {
	int width;
	int length;
	int height;
	int volume;
	public Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume = w * l * h;
	}
	public boolean isSameBox(Box obj) {
		if(this.volume == obj.volume)
			return true;
		else
			return false;
	}
}
