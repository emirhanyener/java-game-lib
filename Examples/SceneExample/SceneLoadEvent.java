package Examples.SceneExample;

import sglib.KeyManager.KeyManager;
import sglib.Scene.Scene;
import sglib.Util.Alert;
import sglib.Util.EventFunction;
import sglib.Util.StaticValues.AlertLevel;

public class SceneLoadEvent extends EventFunction {
    @Override
    public void execute() {
        if (KeyManager.getManager().isKey1()) {
            Alert.getInstance().addAlert("scene1",AlertLevel.info);
            Scene.loadScene("Scene1");
        }
        if (KeyManager.getManager().isKey2()) {
            Alert.getInstance().addAlert("scene2",AlertLevel.info);
            Scene.loadScene("Scene2");
        }
        if (KeyManager.getManager().isKey3()) {
            Alert.getInstance().addAlert("scene3",AlertLevel.info);
            Scene.loadScene("Scene3");
        }
        if (KeyManager.getManager().isKey4()) {
            Alert.getInstance().addAlert("scene4",AlertLevel.info);
            Scene.loadScene("Scene4");
        }
    }
}
