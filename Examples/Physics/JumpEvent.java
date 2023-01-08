package Examples.Physics;

import sglib.KeyManager.KeyManager;
import sglib.Util.*;

public class JumpEvent extends EventFunction {
    @Override
    public void execute() {
        if (KeyManager.getManager().isKeySpace()) {
            if(GameObject.find("player").getPhysics().isGround())
                GameObject.find("player").getPhysics().velocity.setY(-10);
        }
    }
}
