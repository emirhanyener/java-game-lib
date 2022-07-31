package sglib.Util;

import sglib.GameObjects;

public abstract class EventFunction {
    private GameObject object;

    public EventFunction(){
        GameObjects.getInstance().addEvent(this);
    }

    public void setObject(GameObject object) {
        this.object = object;
    }
    public GameObject getObject() {
        return this.object;
    }

    public abstract void execute();
}
