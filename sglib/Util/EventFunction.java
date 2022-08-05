package sglib.Util;

import sglib.GameObjects;

//execute function in per refresh
public abstract class EventFunction {
    private GameObject object;

    //automaticly add event to gameobjects
    public EventFunction(){
        GameObjects.getInstance().addEvent(this);
    }

    //set / get object
    public void setObject(GameObject object) {
        this.object = object;
    }
    public GameObject getObject() {
        return this.object;
    }

    //executed function
    public abstract void execute();
}
