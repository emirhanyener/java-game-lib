package Test.CursorTest;

import sglib.Cursor.Cursor;
import sglib.Util.Alert;
import sglib.Util.EventFunction;
import sglib.Util.GameObject;
import sglib.Util.StaticValues.AlertLevel;

public class CursorPosition extends EventFunction {
    @Override
    public void execute() {
        Alert.getInstance().setAlertRow(0, "Cursor position: " + Cursor.getInstance().getGamePosition().getX() + ", " + Cursor.getInstance().getGamePosition().getY(), AlertLevel.info);
        GameObject.find("o1").position.setX(Cursor.getInstance().getGamePosition().getX());
        GameObject.find("o1").position.setY(Cursor.getInstance().getGamePosition().getY());
    }
}
