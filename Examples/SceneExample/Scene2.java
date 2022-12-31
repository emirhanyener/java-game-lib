package Examples.SceneExample;
import sglib.Scene.Scene;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class Scene2 extends Scene{
    @Override
    public void setup() {
        GameObject.create("obj1", new Position(-100, 100), new Size(50, 50));
        GameObject.create("obj2", new Position(-100, -100), new Size(50, 50));
        GameObject.create("obj3", new Position(100, 100), new Size(50, 50));
        GameObject.create("obj4", new Position(100, -100), new Size(50, 50));

        GameObject.find("obj1").setColor(100, 20, 20);
        GameObject.find("obj2").setColor(100, 50, 20);
        GameObject.find("obj3").setColor(100, 80, 20);
        GameObject.find("obj4").setColor(100, 110, 20);
    }
}
