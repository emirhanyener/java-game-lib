package Examples.Alert;

import sglib.Util.*;
import sglib.Util.StaticValues.AlertLevel;

public class AlertEvent extends EventFunction {
    @Override
    public void execute() {
        Alert.getInstance().setAlertRow(0, "info: " + this.getObject().getPhysics().velocity.getY(), AlertLevel.info);
        Alert.getInstance().setAlertRow(1, "warning: " + this.getObject().getPhysics().velocity.getY(), AlertLevel.warning);
        Alert.getInstance().setAlertRow(2, "error: " + this.getObject().getPhysics().velocity.getY(), AlertLevel.error);
    }
}
