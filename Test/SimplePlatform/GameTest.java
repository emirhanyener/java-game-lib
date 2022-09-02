package Test.SimplePlatform;

import sglib.*;
import sglib.Camera.FollowerCamera;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class GameTest {
    public GameTest(){

    }

    public static void main(String[] args) {
        GameObject.create("o1", new Position(0,200), new Size(1000, 30));
        GameObject.create("o3", new Position(100,170), new Size(100, 30));
        GameObject.create("o4", new Position(200,140), new Size(100, 30));
        GameObject.create("o5", new Position(300,110), new Size(100, 30));
        GameObject.create("player", new Position(0,-300), new Size(30, 30));
        GameObjects.getInstance().setMainCamera(new FollowerCamera(GameObjects.getInstance().findObject("player"), new Position(0, 0)));
        
        GameObject.find("player").addPhysics();
        GameObject.find("player").setFunction(new AlertPlayerFunction());


        SGLib sglib = new SGLib();
        sglib.setKeyListener(new MoveEvent());
        sglib.start();
	}
}