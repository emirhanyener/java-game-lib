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
    
	public static GameObjects getInstance() {
		if(instance == null) 
			instance = new GameObjects();

		return instance;
	}

	public void addObject(GameObject item) {
		objects.add(item);
	}
	public void removeObject(GameObject item) {
		objects.remove(item);
	}
	public GameObject findObject(String name) {
		for(int i = 0; i < objects.size(); i++) 
			if(objects.get(i).getName() == name)
				return objects.get(i);

		return null;
	}
	public LinkedList<GameObject> getObjects(){
		return objects;
	}

	public void addEvent(EventFunction item) {
		events.add(item);
	}
	public void addPhysics(Physics item) {
		physics.add(item);
	}
	public LinkedList<EventFunction> getEvents(){
		return events;
	}
	public LinkedList<Physics> getPhysics() {
		return physics;
	}

	public Camera getMainCamera() {
		if(this.mainCamera == null)
			this.mainCamera = new StaticCamera();
		return mainCamera;
	}
	public void setMainCamera(Camera mainCamera) {
		this.mainCamera = mainCamera;
	}

    public void resetInstance(){
        instance = new GameObjects();
    }
}
