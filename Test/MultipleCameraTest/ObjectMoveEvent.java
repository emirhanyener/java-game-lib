package Test.MultipleCameraTest;

import sglib.Util.*;

public class ObjectMoveEvent extends EventFunction {
    @Override
    public void execute() {
        this.getObject().getPhysics().velocity.setX(1);
        this.getObject().getPhysics().velocity.setY(0.5f);
    }
}
