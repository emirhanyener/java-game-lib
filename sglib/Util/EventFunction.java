package sglib.Util;

import sglib.GameObjects;

public abstract class EventFunction {
    public EventFunction(){
        GameObjects.getInstance().addEvent(this);
    }

    public abstract void execute();
}
