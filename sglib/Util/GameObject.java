package sglib.Util;

import java.awt.Image;

import sglib.GameObjects;

public class GameObject{
	protected String name;
	public Position position;
	public Velocity velocity = new Velocity();
	public Size size;
	public boolean isAbstract = false;
	private Image image;

	public GameObject(String name, Position position, Size size, Image image) {
		this.name = name;
		this.position = position;
		this.size = size;
        this.image = image;
	}
	public GameObject(String name, Position position, Size size) {
		this.name = name;
		this.position = position;
		this.size = size;
	}
	public GameObject(String name) {
		this.name = name;
		this.position = new Position(0, 0);
		this.size = new Size(50, 50);
        this.image = null;
	}
	
	public boolean isAbstract() {
		return isAbstract;
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

	public static GameObject create(String name, Position position, Size size){
		GameObject object = new GameObject(name, position, size);
		GameObject.add(object);
		return object;
	}
	public static GameObject create(String name){
		GameObject object = new GameObject(name);
		GameObject.add(object);
		return object;
	}
	public static GameObject find(String name){
		return GameObjects.getInstance().findObject(name);
	}
	public static void add(GameObject object){
		GameObjects.getInstance().addObject(object);
	}

	public GameObject setFunction(EventFunction function){
		function.setObject(this);
		GameObjects.getInstance().addEvent(function);
		return this;
	}
	public void addPhysics(){
		Physics p = new Physics(this);
		GameObjects.getInstance().addPhysics(p);
	}

	public void calculate(){
		this.position.addX(this.velocity.getX());
		this.position.addY(this.velocity.getY());
	}

	public void OnTriggered(GameObject object) { };
}