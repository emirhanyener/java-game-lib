package sglib.Util;

import java.awt.Image;

public class Object{
	protected String name;
	public Position position;
	public Size size;
	private Image image;

	public Object(String name, Position position, Size size, Image image) {
		this.name = name;
		this.position = position;
		this.size = size;
        this.image = image;
	}
	public Object(String name) {
		this.name = name;
		this.position = new Position(0, 0);
		this.size = new Size(50, 50);
        this.image = null;
	}
	
	public String getName() {
		return name;
	}
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void OnTriggered(Object object) { };
}