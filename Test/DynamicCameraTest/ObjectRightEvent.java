package Test.DynamicCameraTest;

import sglib.Util.*;

public class ObjectRightEvent extends EventFunction{
    @Override
    public void execute() {
        this.getObject().position.addX(1);
    }
}
