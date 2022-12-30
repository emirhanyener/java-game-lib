package sglib.Util;

import java.awt.Color;
import java.awt.Image;
import java.util.LinkedList;

import sglib.GameObjects;
import sglib.GUI.*;

public class GameObject {
	protected String name;
	public Position position;
	public Size size;
	public boolean isAbstract = false;
	private Image image;
	private Color color;
	public static int staticGUIId = 0;

	// constructors
	public GameObject(String name, Position position, Size size, Image image) {
		this.name = name;
		this.position = position;
		this.size = size;
		this.image = image;
		GameObjects.getInstance().addObject(this);
	}

	public GameObject(String name, Position position, Size size) {
		this.name = name;
		this.position = position;
		this.size = size;
		this.image = null;
		GameObjects.getInstance().addObject(this);
	}

	public GameObject(String name) {
		this.isAbstract = true;
		this.name = name;
		this.position = new Position(0, 0);
		this.size = new Size(0, 0);
		this.image = null;
		GameObjects.getInstance().addObject(this);
	}

	// getters
	public boolean isAbstract() {
		return isAbstract;
	}

	public String getName() {
		return name;
	}

	public Image getImage() {
		return image;
	}

	public Color getColor() {
		return color;
	}

	// set object image
	public void setImage(Image image) {
		this.image = image;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public void setColor(int r, int g, int b) {
		this.color = new Color(r, g, b);
	}
	public void setColor(int r, int g, int b, int a) {
		this.color = new Color(r, g, b, a);
	}

	// static methods
	// (short usage)
	public static GameObject create(String name, Position position, Size size) {
		GameObject object = new GameObject(name, position, size);
		GameObject.add(object);
		return object;
	}

	public static GameObject create(String name) {
		GameObject object = new GameObject(name);
		GameObject.add(object);
		return object;
	}

	public static void remove(String name) {
		GameObjects.getInstance().removeObject(GameObject.find(name));
	}

	public static GameObject find(String name) {
		return GameObjects.getInstance().findObject(name);
	}

	public static void add(GameObject object) {
		GameObjects.getInstance().addObject(object);
	}

	public float distance(GameObject object){
		return (float)(Math.sqrt(Math.pow(this.position.getX() - object.position.getX(), 2) + Math.pow(this.position.getY() - object.position.getY(), 2)));
	}

	// setters
	public GameObject setFunction(EventFunction function) {
		function.setObject(this);
		GameObjects.getInstance().addEvent(function);
		return this;
	}

	// add physics to this object.
	public Physics addPhysics() {
		if(Physics.find(this) == null){
			Physics p = new Physics(this);
			GameObjects.getInstance().addPhysics(p);
			return p;
		}
		return Physics.find(this);
	}
	// get linked physics to this gameobject.
	public Physics getPhysics(){
		return Physics.find(this);
	}

	/*
	 * Check trigger method is a trigger control system for detect any object in line.
	 */
	public LinkedList<GameObject> checkTrigger(float offsetX, float offsetY, float x, float y, boolean isVisible) {
		if (isVisible) {
			if(GameObjects.getInstance().getGUIObjects().size() == 0) {
				GameObjects.getInstance().addGUIObject(new GUILine(new Position(), new Position()).setName("gui" + staticGUIId).setColor(Color.GREEN));
			}
			try{
				GameObjects.getInstance().getGUIObjects().get(staticGUIId);
			}
			catch(Exception e){
				GameObjects.getInstance().addGUIObject(new GUILine(new Position(), new Position()).setName("gui" + staticGUIId).setColor(Color.GREEN));
			}
			GameObjects.getInstance().getGUIObjects().get(staticGUIId).getPosition().setX(this.position.getX() + offsetX - GameObjects.getInstance().getMainCamera().getPosition().getX());
			GameObjects.getInstance().getGUIObjects().get(staticGUIId).getPosition().setY(this.position.getY() + offsetY - GameObjects.getInstance().getMainCamera().getPosition().getY());
			GameObjects.getInstance().getGUIObjects().get(staticGUIId).toGUILine().getToPosition().setX(this.position.getX() + offsetX + x - GameObjects.getInstance().getMainCamera().getPosition().getX());
			GameObjects.getInstance().getGUIObjects().get(staticGUIId).toGUILine().getToPosition().setY(this.position.getY() + offsetY + y - GameObjects.getInstance().getMainCamera().getPosition().getY());
			staticGUIId++;
		}

		LinkedList<GameObject> detectedObjects = new LinkedList<GameObject>();
		int step = (int) (Math.sqrt(Math.pow(x - offsetX, 2) + Math.pow(y - offsetY, 2)));

		for (int i = 0; i < step + 2; i++) {
			for (GameObject item : GameObjects.getInstance().getObjects()) {
				if (item == this) {
					continue;
				}
				if (this.position.getX() + offsetX + (x / step) * i > item.position.getX() - item.size.getWidth() / 2) {
					if (this.position.getX() + offsetX + (x / step) * i < item.position.getX() + item.size.getWidth() / 2) {
						if (this.position.getY() + offsetY + (y / step) * i > item.position.getY() - item.size.getHeight() / 2) {
							if (this.position.getY() + offsetY + (y / step) * i < item.position.getY() + item.size.getHeight() / 2) {
								detectedObjects.add(item);
							}
						}
					}
				}
			}
		}
		return detectedObjects;
	}

	// Destroy method removes this object from the game.
	public void destroy() {
		GameObject.remove(this.getName());
	}

	// Execute triggered function if any object collide this object.
	public void OnTriggered(GameObject object) {
	};
}