package sglib.Util;

public class Size {
	private int width;
	private int height;
	
	public Size(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//getters
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	
	//setters
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
