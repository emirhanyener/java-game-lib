package sglib.Scene;

import sglib.GameObjects;

public abstract class Scene {
    public Scene(){
        GameObjects.getInstance().addScene(this);
        this.setup();
    }
    
    public abstract void setup();
}
