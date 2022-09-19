package Tests;

import sglib.GameObjects;
import sglib.Camera.*;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.Size;

public class CameraTest {
    public CameraTest(){
        int all = 5;
        int success = 0;

        System.out.println("Camera tests start");
        if(staticCameraDefaultConstructorTest()) success++;
        if(staticCameraParameterConstructorTest()) success++;
        if(followerCameraPositionTest()) success++;
        if(followerCameraVariableObjectPositionTest()) success++;
        if(MultipleCameraPositionTest()) success++;
        System.out.println("Camera tests end");

        System.out.println("Camera tests " + success + " / " + all);
    }

    public boolean staticCameraDefaultConstructorTest(){
        StaticCamera c = new StaticCamera();
        if(c.getCameraPosition().getX() == 0 && c.getCameraPosition().getY() == 0){
            return true;
        }
        System.out.println("staticCameraDefaultConstructorTest failed");
        return false;
    }
    public boolean staticCameraParameterConstructorTest(){
        StaticCamera c = new StaticCamera(new Position(100, 200));
        if(c.getCameraPosition().getX() == 100 && c.getCameraPosition().getY() == 200){
            return true;
        }
        System.out.println("staticCameraParameterConstructorTest failed");
        return false;
    }
    public boolean followerCameraPositionTest(){
        GameObjects.getInstance().resetInstance();
        GameObject.create("o1", new Position(150, 300), new Size(50, 50));
        GameObject.create("o2", new Position(0, 10), new Size(50, 50));
        FollowerCamera c = new FollowerCamera(GameObject.find("o1"));
        if(c.getCameraPosition().getX() == 150 && c.getCameraPosition().getY() == 300){
            return true;
        }
        System.out.println("followerCameraPositionTest failed");
        return false;
    }
    public boolean followerCameraVariableObjectPositionTest(){
        GameObjects.getInstance().resetInstance();
        GameObject.create("o1", new Position(150, 300), new Size(50, 50));
        GameObject.create("o2", new Position(300, 600), new Size(50, 50));
        GameObject.create("o3", new Position(600, 1200), new Size(50, 50));
        GameObject.find("o2").position.setX(1000);
        FollowerCamera c = new FollowerCamera(GameObject.find("o2"));
        if(c.getCameraPosition().getX() == 1000 && c.getCameraPosition().getY() == 600){
            return true;
        }
        System.out.println("followerCameraVariableObjectPositionTest failed");
        return false;
    }
    public boolean MultipleCameraPositionTest(){
        GameObjects.getInstance().resetInstance();
        GameObject.create("o1", new Position(150, 300), new Size(50, 50));
        GameObject.create("o2", new Position(300, 600), new Size(50, 50));
        GameObject.create("o3", new Position(600, 1200), new Size(50, 50));
        MultipleCamera c = new MultipleCamera(new GameObject[]{GameObject.find("o2"), GameObject.find("o3")});
        if(c.getCameraPosition().getX() == 450 && c.getCameraPosition().getY() == 900){
            return true;
        }
        System.out.println("MultipleCameraPositionTest failed");
        return false;
    }
}
