package Examples.CameraZoom;

import sglib.GameObjects;
import sglib.KeyManager.KeyManager;
import sglib.Util.Alert;
import sglib.Util.EventFunction;
import sglib.Util.GameObject;
import sglib.Util.StaticValues.AlertLevel;

public class ZoomFuntion extends EventFunction {
    @Override
    public void execute() {
        Alert.getInstance().setAlertRow(0, "zoom value = " + GameObjects.getInstance().getMainCamera().getZoomValue(), AlertLevel.info);

        if (KeyManager.getManager().isKeyNumMinus()) {
            GameObjects.getInstance().getMainCamera().addZoomValue(GameObjects.getInstance().getMainCamera().getZoomValue() * -0.01f);
        }
        if (KeyManager.getManager().isKeyNumAdd()) {
            GameObjects.getInstance().getMainCamera().addZoomValue(GameObjects.getInstance().getMainCamera().getZoomValue() * 0.01f);
        }
        if (KeyManager.getManager().isKeyLeft()) {
            GameObject.find("empty").position.addX(-2);
        }
        if (KeyManager.getManager().isKeyRight()) {
            GameObject.find("empty").position.addX(2);
        }
        if (KeyManager.getManager().isKeyUp()) {
            GameObject.find("empty").position.addY(-2);
        }
        if (KeyManager.getManager().isKeyDown()) {
            GameObject.find("empty").position.addY(2);
        }
    }
}
