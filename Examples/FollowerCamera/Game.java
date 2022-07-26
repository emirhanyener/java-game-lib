package Examples.FollowerCamera;

import sglib.*;
import sglib.Camera.FollowerCamera;
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
        GameObjects.getInstance().setMainCamera(new FollowerCamera(GameObjects.getInstance().findObject("o2"), new Position(0, 0)));

        GameObject.find("o2").setFunction(new ObjectRightEvent());

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
