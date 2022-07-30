package sglib.Util;

import java.awt.Image;

import sglib.GameObjects;

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
	public Object(String name, Position position, Size size) {
		this.name = name;
		this.position = position;
		this.size = size;
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

	public static Object create(String name, Position position, Size size){
		Object object = new Object(name, position, size);
		Object.add(object);
		return object;
	}
	public static Object create(String name){
		Object object = new Object(name);
		Object.add(object);
		return object;
	}
	public static Object find(String name){
		return GameObjects.getInstance().findObject(name);
	}
	public static void add(Object object){
		GameObjects.getInstance().addObject(object);
	}

	public Object setFunction(EventFunction function){
		function.setObject(this);
		GameObjects.getInstance().addEvent(function);
		return this;
	}

	public void OnTriggered(Object object) { };
}