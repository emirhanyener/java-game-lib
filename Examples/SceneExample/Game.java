package Examples.SceneExample;

import sglib.*;
import sglib.Camera.StaticCamera;
import sglib.Scene.Scene;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class Game {
    public Game() {

    }

    public static void main(String[] args) {
        Scene1 scene1 = new Scene1();
        
        Scene.loadScene("Scene1");

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
