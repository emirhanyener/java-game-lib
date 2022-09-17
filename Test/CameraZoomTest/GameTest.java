package Test.CameraZoomTest;

import sglib.*;
import sglib.Camera.FollowerCamera;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class GameTest {
    public GameTest() {

    }

    public static void main(String[] args) {
        GameObject.create("o1", new Position(0, 100), new Size(1000, 30));
        GameObject.create("o2", new Position(100, 70), new Size(100, 30));
        GameObject.create("o3", new Position(200, 40), new Size(100, 30));
        GameObject.create("o4", new Position(300, 10), new Size(100, 30));
        GameObject.create("empty", new Position(0, 0), new Size(10, 10));
        GameObject.find("empty").setFunction(new ZoomFuntion());
        GameObject.find("empty").addPhysics().setGravityActive(false);
        GameObject.find("empty").getPhysics().setAbstract(true);
        GameObjects.getInstance().setMainCamera(new FollowerCamera(GameObject.find("empty")));


        SGLib sglib = new SGLib();
        sglib.start();
    }
}
