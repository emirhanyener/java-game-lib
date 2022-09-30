package Examples.MultipleCamera;

import sglib.Util.*;
import sglib.KeyManager.*;

public class ObjectMoveEvent extends EventFunction {
    @Override
    public void execute() {
        if(KeyManager.getManager().isKeyUp()){
            this.getObject().position.addY(-1);
        }
        if(KeyManager.getManager().isKeyDown()){
            this.getObject().position.addY(1);
        }
        if(KeyManager.getManager().isKeyRight()){
            this.getObject().position.addX(1);
        }
        if(KeyManager.getManager().isKeyLeft()){
            this.getObject().position.addX(-1);
        }
    }
}
