package sglib.Scene;

import sglib.GameObjects;

public abstract class Scene {
    private String name;
    public Scene(String name){
        this.name = name;
        GameObjects.getInstance().addScene(this);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void setup();

    public static void loadScene(String name){
        //load scene
    }
}
