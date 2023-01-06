package Examples.SceneExample;

import sglib.*;
import sglib.Camera.StaticCamera;
import sglib.Scene.Scene;
import sglib.Util.Alert;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;
import sglib.Util.StaticValues.AlertLevel;

public class Game {
    public Game() {

    }

    public static void main(String[] args) {
        //first usage
        new Scene1();
        new Scene2();

        //second usage
        new Scene("Scene3") {
            @Override
            public void setup() {
                GameObject.create("obj1", new Position(-50, 50), new Size(50, 50));
                GameObject.create("obj2", new Position(-50, -50), new Size(50, 50));
                GameObject.create("obj3", new Position(50, 50), new Size(50, 50));
                GameObject.create("obj4", new Position(50, -50), new Size(50, 50));
        
                GameObject.find("obj1").setColor(20, 20, 20);
                GameObject.find("obj2").setColor(50, 20, 20);
                GameObject.find("obj3").setColor(80, 20, 20);
                GameObject.find("obj4").setColor(110, 20, 20);
            }
        };
        new Scene("Scene4") {
            @Override
            public void setup() {
                GameObject.create("obj1", new Position(-100, 100), new Size(50, 50));
                GameObject.create("obj2", new Position(-100, -100), new Size(50, 50));
                GameObject.create("obj3", new Position(100, 100), new Size(50, 50));
                GameObject.create("obj4", new Position(100, -100), new Size(50, 50));

                GameObject.find("obj1").setColor(20, 20, 20);
                GameObject.find("obj2").setColor(50, 20, 20);
                GameObject.find("obj3").setColor(80, 20, 20);
                GameObject.find("obj4").setColor(110, 20, 20);
            }
        };

        GameObjects.getInstance().addGlobalEvent(new SceneLoadEvent());
        GameObjects.getInstance().setMainCamera(new StaticCamera(new Position(0, 0)));
        Scene.loadScene("Scene1");

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
