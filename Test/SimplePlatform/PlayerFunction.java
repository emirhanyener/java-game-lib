package Test.SimplePlatform;

import sglib.Util.Alert;
import sglib.Util.EventFunction;
import sglib.Util.GameObject;
import sglib.Util.KeyManager;
import sglib.Util.StaticValues.AlertLevel;

public class PlayerFunction extends EventFunction {
    @Override
    public void execute() {
        Alert.getInstance().setAlertRow(0, "Player position: " + GameObject.find("player").position.getX() + ", " + GameObject.find("player").position.getY(), AlertLevel.info);
        Alert.getInstance().setAlertRow(1, "Player velocity: " + GameObject.find("player").velocity.getX() + ", " + GameObject.find("player").velocity.getY(), AlertLevel.info);

        if (KeyManager.getManager().isKeySpace()) {
            GameObject.find("player").velocity.setY(-10);
        }
        if (KeyManager.getManager().isKeyLeft()) {
            GameObject.find("player").velocity.setX(-1);
        }
        if (KeyManager.getManager().isKeyRight()) {
            GameObject.find("player").velocity.setX(1);
        }

        if (!KeyManager.getManager().isKeyLeft() && !KeyManager.getManager().isKeyRight()) {
            GameObject.find("player").velocity.setX(0);
        }
        if (KeyManager.getManager().isKeyLeft() && KeyManager.getManager().isKeyRight()) {
            GameObject.find("player").velocity.setX(0);
        }
    }
}
