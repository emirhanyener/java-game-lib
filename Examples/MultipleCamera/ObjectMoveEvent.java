package Examples.MultipleCamera;

import sglib.Util.*;
import sglib.KeyManager.*;
import sglib.*;

public class ObjectMoveEvent extends EventFunction {
    @Override
    public void execute() {
        this.getObject().position.addX(1);
        this.getObject().position.addY(0.5f);
    }
}
