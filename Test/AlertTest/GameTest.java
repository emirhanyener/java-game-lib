package Test.AlertTest;

import sglib.*;
import sglib.Camera.FollowerCamera;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class GameTest {
    public GameTest(){

    }

    public static void main(String[] args) {
        GameObject.create("o1", new Position(-500,500), new Size(1000, 30));
        GameObject.create("o2", new Position(0,0), new Size(30, 30));
        GameObjects.getInstance().setMainCamera(new FollowerCamera(GameObjects.getInstance().findObject("o2"), new Position(0, 0)));
        
        GameObject.find("o2").addPhysics();
        GameObject.find("o2").setFunction(new AlertEvent());

        SGLib sglib = new SGLib();
        sglib.start();
	}
}
