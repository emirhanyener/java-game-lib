package sglib;

import sglib.Util.GameObject;
import sglib.Util.Physics;
import sglib.Camera.StaticCamera;
import sglib.Util.Camera;
import sglib.Util.EventFunction;

import java.util.LinkedList;

public class GameObjects {
	private static GameObjects instance;
	private Camera mainCamera = null;
	private LinkedList<GameObject> objects = new LinkedList<GameObject>();
	private LinkedList<Physics> physics = new LinkedList<Physics>();
	private LinkedList<EventFunction> events = new LinkedList<EventFunction>();
    
	//for return single instance
	public static GameObjects getInstance() {
		if(instance == null) 
			instance = new GameObjects();

		return instance;
	}

	//add gameobject to list
	public void addObject(GameObject item) {
		objects.add(item);
	}
	//remove gameobject from list
	public void removeObject(GameObject item) {
		objects.remove(item);
	}
	//search 'name' named gameobject
	public GameObject findObject(String name) {
		for(int i = 0; i < objects.size(); i++) 
			if(objects.get(i).getName() == name)
				return objects.get(i);

		return null;
	}
	//get all gameobjects
	public LinkedList<GameObject> getObjects(){
		return objects;
	}

	//add event for execute
	public void addEvent(EventFunction item) {
		events.add(item);
	}
	//add physics for calculate
	public void addPhysics(Physics item) {
		physics.add(item);
	}
	//get all events
	public LinkedList<EventFunction> getEvents(){
		return events;
	}
	//get all physics
	public LinkedList<Physics> getPhysics() {
		return physics;
	}

	//get/set main camera
	public Camera getMainCamera() {
		if(this.mainCamera == null)
			this.mainCamera = new StaticCamera();
		return mainCamera;
	}
	public void setMainCamera(Camera mainCamera) {
		this.mainCamera = mainCamera;
	}

	//create new object
    public void resetInstance(){
        instance = new GameObjects();
    }
}
