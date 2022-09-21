package Examples.MultipleCamera;

import sglib.*;
import sglib.Camera.MultipleCamera;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class Game {
    public Game() {

    }

    public static void main(String[] args) {
        GameObject.create("o1", new Position(0, 0), new Size(100, 100));
        GameObject.create("o2", new Position(300, 80), new Size(70, 70));
        GameObject.create("o3", new Position(-70, 50), new Size(50, 50));
        GameObjects.getInstance().setMainCamera(new MultipleCamera(new GameObject[] { GameObjects.getInstance().findObject("o1"),
                        GameObjects.getInstance().findObject("o2") }, new Position(0, 0)));
        
        GameObject.find("o2").setFunction(new ObjectMoveEvent());

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
