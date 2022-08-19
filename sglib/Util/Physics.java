package sglib.Util;

import java.util.LinkedList;

import sglib.*;

public class Physics {
    private GameObject object;
	
    //set controlled object
	public Physics(GameObject object) {
        this.object = object;
	}

    //calculate selected object
	public void calculate() {
        //loop all object
        LinkedList<GameObject> detectedObjectsRight = object.checkTrigger(0, 0, (object.size.getWidth() / 2) + object.velocity.getX(), 0, 3, Setting.VELOCITY_GUI_ACTIVE, "right");
        LinkedList<GameObject> detectedObjectsLeft = object.checkTrigger(0, 0, (-1) * (object.size.getWidth() / 2) + object.velocity.getX(), 0, 3, Setting.VELOCITY_GUI_ACTIVE, "left");
        LinkedList<GameObject> detectedObjectsDown = object.checkTrigger(0, 0, 0, (object.size.getHeight() / 2) + object.velocity.getY(), 3, Setting.VELOCITY_GUI_ACTIVE, "down");
        GameObject.staticGUIId = 0;

        if(detectedObjectsRight.size() != 0 || detectedObjectsLeft.size() != 0) {
            //move if object movable
            object.velocity.setX(0);
        }
        if(detectedObjectsDown.size() == 0) {
            //add gravity force to velocity y
            object.velocity.addY(Setting.GRAVITY * 6);
        }
        else{
            object.position.setY(detectedObjectsDown.get(0).position.getY() - object.size.getHeight());
        }
    }
}
