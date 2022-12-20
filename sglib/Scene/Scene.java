package sglib.Scene;

public abstract class Scene {
    private Scene(){
        this.setup();
    }
    
    public abstract void setup();
}
