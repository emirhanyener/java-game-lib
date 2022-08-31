package sglib.Util;

import java.awt.Color;
import java.awt.Image;
import java.util.LinkedList;

import sglib.GameObjects;
import sglib.GUI.*;

public class GameObject{
	protected String name;
	public Position position;
	public Velocity velocity = new Velocity();
	public Size size;
	public boolean isAbstract = false;
	private Image image;
	public static int staticGUIId = 0;

	//constructors
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
	
	//getters
	public boolean isAbstract() {
		return isAbstract;
	}
	public String getName() {
		return name;
	}
	public Image getImage() {
		return image;
	}

	//set object image
	public void setImage(Image image) {
		this.image = image;
	}

	//static methods
	//(short usage)
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
	public static void remove(String name){
		GameObjects.getInstance().removeObject(GameObject.find(name));
	}
	public static GameObject find(String name){
		return GameObjects.getInstance().findObject(name);
	}
	public static void add(GameObject object){
		GameObjects.getInstance().addObject(object);
	}

	//setters
	public GameObject setFunction(EventFunction function){
		function.setObject(this);
		GameObjects.getInstance().addEvent(function);
		return this;
	}
	public void addPhysics(){
		Physics p = new Physics(this);
		GameObjects.getInstance().addPhysics(p);
	}

	//add to position from velocity
	public void calculate(){
		this.position.addX(this.velocity.getX());
		this.position.addY(this.velocity.getY());
	}

	public LinkedList<GameObject> checkTrigger(float offsetX, float offsetY, float x, float y, int step, boolean isVisible, String guiName){
		if(isVisible){
			if(GameObjects.getInstance().findGUIObject(guiName) == null){
				GameObjects.getInstance().addGUIObject(new GUILine(new Position(this.position.getX() + offsetX, this.position.getY() + offsetY), new Position(this.position.getX() + offsetX + x, this.position.getY() + offsetY + y)).setName(guiName).setColor(Color.GREEN));
			}
			GameObjects.getInstance().findGUIObject(guiName).getPosition().setX(this.position.getX() + offsetX);
			GameObjects.getInstance().findGUIObject(guiName).getPosition().setY(this.position.getY() + offsetY);
			GameObjects.getInstance().findGUIObject(guiName).toGUILine().getToPosition().setX(this.position.getX() + offsetX + x);
			GameObjects.getInstance().findGUIObject(guiName).toGUILine().getToPosition().setY(this.position.getY() + offsetY + y);
		}

		LinkedList<GameObject> detectedObjects = new LinkedList<GameObject>();

		for(int i = 0; i < step + 2; i++){
			for(GameObject item : GameObjects.getInstance().getObjects()){
				if(item == this){
					continue;
				}
				if(this.position.getX() + offsetX + (x / step) * i > item.position.getX() - item.size.getWidth()){
					if(this.position.getX() + offsetX + (x / step) * i < item.position.getX() + item.size.getWidth()){
						if(this.position.getY() + offsetY + (y / step) * i > item.position.getY() - item.size.getHeight()){
							if(this.position.getY() + offsetY + (y / step) * i < item.position.getY() + item.size.getHeight()){
								detectedObjects.add(item);
							}
						}
					}
				}
			}
		}
		return detectedObjects;
	}

	public void destroy(){
		GameObject.remove(this.getName());
	}

	//execute triggered function if any object in object
	public void OnTriggered(GameObject object) { };
}