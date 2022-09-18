package Test.PhysicsTest;

import sglib.KeyManager.KeyManager;
import sglib.Util.*;

public class JumpEvent extends EventFunction {
    @Override
    public void execute() {
        if (KeyManager.getManager().isKeySpace()) {
            GameObject.find("o2").getPhysics().velocity.setY(-10);
        }
    }
}
