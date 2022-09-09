package Test.ElasticCollideTest;

import sglib.Util.Alert;
import sglib.Util.EventFunction;
import sglib.Util.GameObject;
import sglib.Util.KeyManager;
import sglib.Util.StaticValues.AlertLevel;

public class FirstVelocityFunction extends EventFunction {
    @Override
    public void execute() {
        Alert.getInstance().setAlertRow(0, "object 1 velocity: " + GameObject.find("o2").getPhysics().velocity.getX() + ", " + GameObject.find("o2").getPhysics().velocity.getY(), AlertLevel.info);
        Alert.getInstance().setAlertRow(1, "object 2 velocity: " + GameObject.find("o3").getPhysics().velocity.getX() + ", " + GameObject.find("o3").getPhysics().velocity.getY(), AlertLevel.info);

        if (KeyManager.getManager().isKeySpace()) {
            GameObject.find("o2").getPhysics().velocity.setX(1);
            GameObject.find("o3").getPhysics().velocity.setX(-1);
        }
    }
}
