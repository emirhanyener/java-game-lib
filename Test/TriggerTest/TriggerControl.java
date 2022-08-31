package Test.TriggerTest;

import sglib.Util.*;

public class TriggerControl extends EventFunction{
    @Override
    public void execute() {
        if(GameObject.find("o2").checkTrigger(0, 0, 30, 0, 3, true, "test") != null){
            for(GameObject item : GameObject.find("o2").checkTrigger(0, 0, 30, 0, 3, true, "test")){
                item.destroy();
            }
        }
    }
}
