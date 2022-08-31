package Test.CursorTest;

import sglib.*;
import sglib.Camera.FollowerCamera;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class GameTest {
    public GameTest(){

    }

    public static void main(String[] args) {
        GameObject.create("o1", new Position(0,-300), new Size(30, 30));
        GameObjects.getInstance().setMainCamera(new FollowerCamera(GameObjects.getInstance().findObject("o1"), new Position(0, 0)));
        
        GameObject.find("o1").setFunction(new CursorPosition());

        SGLib sglib = new SGLib();
        sglib.start();
	}
}