package Examples.MultipleCamera;

import sglib.Util.*;
import sglib.KeyManager.*;
import sglib.*;

public class ObjectMoveEvent extends EventFunction {
    @Override
    public void execute() {
        if(KeyManager.getManager().isKeyNumMinus()){
            this.getObject().position.addX(1);
            this.getObject().position.addY(0.5f);
        }
        if(KeyManager.getManager().isKeyNumAdd()){
            this.getObject().position.addX(-1);
            this.getObject().position.addY(-0.5f);
        }
    }
}
