//Box 클래스의 생성자를 만들어 값을 입력받고 같은 크기의 박스인지 확인하는 프로그램
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
