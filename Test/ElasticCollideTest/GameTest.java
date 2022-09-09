package Test.ElasticCollideTest;

import sglib.*;
import sglib.Camera.FollowerCamera;
import sglib.Camera.StaticCamera;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class GameTest {
    public GameTest() {

    }

    public static void main(String[] args) {
        GameObject.create("o1", new Position(0, 200), new Size(1000, 30));
        GameObject.create("o2", new Position(-100, 100), new Size(20, 20));
        GameObject.create("o3", new Position(100, 100), new Size(20, 20));
        GameObject.create("fn");
        GameObjects.getInstance().setMainCamera(new StaticCamera(new Position(0, 100)));

        GameObject.find("o2").addPhysics();
        GameObject.find("o3").addPhysics();
        GameObject.find("o2").getPhysics().setFrictionActive(false);
        GameObject.find("o3").getPhysics().setFrictionActive(false);
        GameObject.find("o2").getPhysics().setMass(1);
        GameObject.find("o3").getPhysics().setMass(3);
        GameObject.find("fn").setFunction(new FirstVelocityFunction());

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
