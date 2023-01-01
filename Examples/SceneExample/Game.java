package Examples.SceneExample;

import sglib.*;
import sglib.Camera.StaticCamera;
import sglib.Scene.Scene;
import sglib.Util.Alert;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.StaticValues.AlertLevel;

public class Game {
    public Game() {

    }

    public static void main(String[] args) {
        Scene1 scene1 = new Scene1();
        Scene2 scene2 = new Scene2();
        GameObjects.getInstance().addGlobalEvent(new SceneLoadEvent());

        GameObjects.getInstance().setMainCamera(new StaticCamera(new Position(0, 0)));
        Scene.loadScene("Scene1");

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
