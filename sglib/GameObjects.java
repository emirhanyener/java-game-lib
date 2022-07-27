package sglib;

import sglib.Util.Object;
import java.util.LinkedList;

public class GameObjects {
	private static GameObjects instance;
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

    public void resetInstance(){
        instance = new GameObjects();
    }
}
