package Examples.FollowerCamera;

import sglib.Util.*;

public class ObjectRightEvent extends EventFunction {
    @Override
    public void execute() {
        this.getObject().getPhysics().velocity.setX(1);
    }
}
