package Examples.GUI;

import sglib.GameObjects;
import sglib.KeyManager.KeyManager;
import sglib.Util.EventFunction;

public class ClickEvent extends EventFunction {
    private int clickCount = 12;

    @Override
    public void execute() {
        if (KeyManager.getManager().isKeySpace()) {
            clickCount++;
            GameObjects.getInstance().findGUIObject("text1").toGUIText().setTextSize(clickCount);
            GameObjects.getInstance().findGUIObject("text1").toGUIText().setText("click counter : " + clickCount);
        }
    }
}
