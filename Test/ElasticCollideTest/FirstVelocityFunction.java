package Test.ElasticCollideTest;

import sglib.KeyManager.KeyManager;
import sglib.Util.Alert;
import sglib.Util.EventFunction;
import sglib.Util.GameObject;
import sglib.Util.StaticValues.AlertLevel;

public class FirstVelocityFunction extends EventFunction {
    @Override
    public void execute() {
        Alert.getInstance().setAlertRow(0, "o1; posx" + GameObject.find("o2").position.getX() + ", velocity: " + GameObject.find("o2").getPhysics().velocity.getX() + ", " + GameObject.find("o2").getPhysics().velocity.getY(), AlertLevel.info);
        Alert.getInstance().setAlertRow(1, "o2; posx" + GameObject.find("o3").position.getX() + GameObject.find("o3").getPhysics().velocity.getX() + ", " + GameObject.find("o3").getPhysics().velocity.getY(), AlertLevel.info);

        if (KeyManager.getManager().isKeySpace()) {
            GameObject.find("o2").getPhysics().velocity.setX(5);
            GameObject.find("o3").getPhysics().velocity.setX(-1);
        }
        if(GameObject.find("o2").position.getX() < -385){
            GameObject.find("o2").getPhysics().velocity.setX(Math.abs(GameObject.find("o2").getPhysics().velocity.getX()));
        }
        if(GameObject.find("o3").position.getX() > 385){
            GameObject.find("o3").getPhysics().velocity.setX(-Math.abs(GameObject.find("o3").getPhysics().velocity.getX()));
        }
    }
}
