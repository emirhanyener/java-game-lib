package sglib;

import sglib.Util.GameObject;
import sglib.Util.Physics;
import sglib.Camera.Camera;
import sglib.Camera.StaticCamera;
import sglib.Developer.DeveloperConsole;
import sglib.Util.EventFunction;
import sglib.GUI.*;
import sglib.Scene.Scene;

import java.util.LinkedList;

public class GameObjects {
	private static GameObjects instance;
	private Camera mainCamera = null;
	private LinkedList<GameObject> objects = new LinkedList<GameObject>();
	private LinkedList<Physics> physics = new LinkedList<Physics>();
	private LinkedList<Scene> scenes = new LinkedList<Scene>();
	private LinkedList<EventFunction> events = new LinkedList<EventFunction>();
	private LinkedList<EventFunction> globalEvents = new LinkedList<EventFunction>();
	private LinkedList<GUI> gui = new LinkedList<GUI>();
	private LinkedList<DeveloperConsole> developer = new LinkedList<DeveloperConsole>();

	// for return single instance
	public static GameObjects getInstance() {
		if (instance == null) {
			instance = new GameObjects();
		}

		return instance;
	}

	// ++++++++++ Object ++++++++++
	// add gameobject to list
	public void addObject(GameObject item) {
		objects.add(item);
	}

	// remove gameobject from list
	public void removeObject(GameObject item) {
		objects.remove(item);
	}

	// search 'name' named gameobject
	public GameObject findObject(String name) {
		for (int i = 0; i < objects.size(); i++) {
			if (objects.get(i).getName().equals(name)) {
				return objects.get(i);
			}
		}
		return null;
	}

	// get all gameobjects
	public LinkedList<GameObject> getObjects() {
		return objects;
	}

	// ++++++++++ Event ++++++++++\\
	// add event for execute
	public void addEvent(EventFunction item) {
		events.add(item);
	}
	public void addGlobalEvent(EventFunction item) {
		globalEvents.add(item);
	}

	public void addScene(Scene item) {
		scenes.add(item);
	}

	// add physics for calculate
	public void addPhysics(Physics item) {
		physics.add(item);
	}

	// get all events
	public LinkedList<EventFunction> getEvents() {
		return events;
	}
	public LinkedList<EventFunction> getGlobalEvents() {
		return globalEvents;
	}

	// get all physics
	public LinkedList<Physics> getPhysics() {
		return physics;
	}
	
	// get all physics
	public LinkedList<Scene> getScenes() {
		return scenes;
	}

	// search 'name' named scene
	public Scene findScene(String name) {
		for (int i = 0; i < scenes.size(); i++) {
			if (scenes.get(i).getName().equals(name)) {
				return scenes.get(i);
			}
		}
		return null;
	}

	// ++++++++++ Camera ++++++++++\\
	// get/set main camera
	public Camera getMainCamera() {
		if (this.mainCamera == null) {
			this.mainCamera = new StaticCamera();
		}
		return mainCamera;
	}

	public void setMainCamera(Camera mainCamera) {
		this.mainCamera = mainCamera;
	}

	// ++++++++++ GUI ++++++++++\\
	// add gui object to list
	public void addGUIObject(GUI item) {
		gui.add(item);
	}

	// remove gui object from list
	public void removeGUIObject(GUI item) {
		gui.remove(item);
	}

	// search 'name' named gui object
	public GUI findGUIObject(String name) {
		for (int i = 0; i < gui.size(); i++) {
			if (gui.get(i).getName() == name) {
				return gui.get(i);
			}
		}

		return null;
	}

	//Developer console add and update functions
	public void addConsole(DeveloperConsole console){
		developer.add(console);
	}
	public void updateConsole(){
		for(DeveloperConsole item : developer){
			item.update();
		}
	}

	// get all gui objects
	public LinkedList<GUI> getGUIObjects() {
		return gui;
	}

	public void resetAll(){
		events.clear();
		physics.clear();
		objects.clear();
		gui.clear();
	}

	// create new object
	public void resetInstance() {
		instance = new GameObjects();
	}
}
