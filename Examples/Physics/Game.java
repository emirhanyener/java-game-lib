package Examples.Physics;

import sglib.*;
import sglib.Camera.FollowerCamera;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class Game {
    public Game() {

    }

    public static void main(String[] args) {
        GameObject.create("o1", new Position(0, 200), new Size(1000, 30));
        GameObject.create("player", new Position(0, 0), new Size(30, 30));
        GameObjects.getInstance().setMainCamera(new FollowerCamera(GameObjects.getInstance().findObject("player"), new Position(0, 0)));

        GameObject.find("player").addPhysics();
        GameObject.create("empty1");
        GameObject.find("empty1").setFunction(new JumpEvent());

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
