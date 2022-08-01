package Test.PhysicsTest;

import sglib.*;
import sglib.Camera.DynamicCamera;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class GameTest {
    public GameTest(){

    }

    public static void main(String[] args) {
        GameObject.create("o1", new Position(-500,200), new Size(1000, 30));
        GameObject.create("o2", new Position(0,0), new Size(30, 30));
        GameObjects.getInstance().setMainCamera(new DynamicCamera(GameObjects.getInstance().findObject("o2"), new Position(0, 0)));
        
        GameObject.find("o2").addPhysics();

        SGLib sglib = new SGLib();
        sglib.setKeyListener(new JumpEvent());
        sglib.start();
	}
}
