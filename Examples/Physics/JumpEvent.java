package Examples.Physics;

import sglib.KeyManager.KeyManager;
import sglib.Util.*;

public class JumpEvent extends EventFunction {
    @Override
    public void execute() {
        if (KeyManager.getManager().isKeySpace()) {
            GameObject.find("player").getPhysics().velocity.setY(-10);
        }
    }
}
