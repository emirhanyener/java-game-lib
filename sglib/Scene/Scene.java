package sglib.Scene;

import sglib.GameObjects;

public abstract class Scene {
    private String name;
    public Scene(){
        this.name = this.getClass().getSimpleName();
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
        GameObjects.getInstance().resetAll();
        GameObjects.getInstance().findScene(name).setup();
    }
}
