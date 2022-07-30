package sglib;

import sglib.Util.Object;
import sglib.Camera.StaticCamera;
import sglib.Util.Camera;
import java.util.LinkedList;

public class GameObjects {
	private static GameObjects instance;
	private Camera mainCamera = null;
	private LinkedList<Object> objects = new LinkedList<Object>();
    
	public static GameObjects getInstance() {
		if(instance == null) 
			instance = new GameObjects();

		return instance;
	}

	public void addObject(Object item) {
		objects.add(item);
	}
	public void removeObject(Object item) {
		objects.remove(item);
	}
	public Object findObject(String name) {
		for(int i = 0; i < objects.size(); i++) 
			if(objects.get(i).getName() == name)
				return objects.get(i);

		return null;
	}
	public LinkedList<Object> getObjects(){
		return objects;
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
