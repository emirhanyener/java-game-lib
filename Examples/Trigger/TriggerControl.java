package Examples.Trigger;

import sglib.KeyManager.KeyManager;
import sglib.Util.*;

public class TriggerControl extends EventFunction {
    @Override
    public void execute() {
        if (GameObject.find("player").checkTrigger(0, 0, 30, 0, true, "test") != null) {
            for (GameObject item : GameObject.find("player").checkTrigger(0, 0, 30, 0, true, "test")) {
                item.destroy();
            }
        }

        if (KeyManager.getManager().isKeySpace()) {
            GameObject.find("player").getPhysics().velocity.setY(-10);
        }
        if (KeyManager.getManager().isKeyLeft()) {
            GameObject.find("player").getPhysics().velocity.setX(-1);
        }
        if (KeyManager.getManager().isKeyRight()) {
            GameObject.find("player").getPhysics().velocity.setX(1);
        }
    }
}
