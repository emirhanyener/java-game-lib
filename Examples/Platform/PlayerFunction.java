package Examples.Platform;

import sglib.KeyManager.KeyManager;
import sglib.Util.Alert;
import sglib.Util.EventFunction;
import sglib.Util.GameObject;
import sglib.Util.StaticValues.AlertLevel;

public class PlayerFunction extends EventFunction {
    @Override
    public void execute() {
        Alert.getInstance().setAlertRow(0, "Player position: " + GameObject.find("player").position.getX() + ", " + GameObject.find("player").position.getY(), AlertLevel.info);
        Alert.getInstance().setAlertRow(1, "Player velocity: " + GameObject.find("player").getPhysics().velocity.getX() + ", " + GameObject.find("player").getPhysics().velocity.getY(), AlertLevel.info);

        if (KeyManager.getManager().isKeySpace()) {
            if(GameObject.find("player").getPhysics().isGround())
                GameObject.find("player").getPhysics().velocity.setY(-10);
        }
        if (KeyManager.getManager().isKeyLeft()) {
            GameObject.find("player").getPhysics().velocity.setX(-5);
        }
        if (KeyManager.getManager().isKeyRight()) {
            GameObject.find("player").getPhysics().velocity.setX(5);
        }
    }
}
