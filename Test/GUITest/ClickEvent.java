package Test.GUITest;

import sglib.GameObjects;
import sglib.Util.EventFunction;
import sglib.Util.KeyManager;

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
