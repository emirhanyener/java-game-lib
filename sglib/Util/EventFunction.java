package sglib.Util;

import sglib.GameObjects;

public abstract class EventFunction {
    private Object object;

    public EventFunction(){
        GameObjects.getInstance().addEvent(this);
    }

    public void setObject(Object object) {
        this.object = object;
    }
    public Object getObject() {
        return this.object;
    }

    public abstract void execute();
}
