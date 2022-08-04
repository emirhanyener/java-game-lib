package Test;

import sglib.Camera.*;
import sglib.Util.Position;

public class CameraTest {
    public CameraTest(){
        int all = 2;
        int success = 0;

        System.out.println("Camera tests start");
        if(staticCameraDefaultConstructorTest()) success++;
        if(staticCameraParameterConstructorTest()) success++;
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
}
