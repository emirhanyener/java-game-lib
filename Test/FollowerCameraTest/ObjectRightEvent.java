package Test.FollowerCameraTest;

import sglib.Util.*;

public class ObjectRightEvent extends EventFunction{
    @Override
    public void execute() {
        this.getObject().velocity.setX(1);
    }
}
