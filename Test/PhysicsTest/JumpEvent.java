package Test.PhysicsTest;

import sglib.Util.*;

public class JumpEvent extends EventFunction {
    @Override
    public void execute() {
        if (KeyManager.getManager().isKeySpace()) {
            GameObject.find("o2").velocity.setY(-10);
        }
    }
}
