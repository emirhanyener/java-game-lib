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
        //detect object using gameobject checktrigger method.
        LinkedList<GameObject> detectedObjectsRight = object.checkTrigger(0, 0, (object.size.getWidth() / 2) + object.velocity.getX(), 0, Setting.VELOCITY_GUI_ACTIVE, "right");
        LinkedList<GameObject> detectedObjectsLeft = object.checkTrigger(0, 0, (-1) * (object.size.getWidth() / 2) + object.velocity.getX(), 0, Setting.VELOCITY_GUI_ACTIVE, "left");
        LinkedList<GameObject> detectedObjectsRightDown = object.checkTrigger((object.size.getWidth() / 2), 0, 0, (object.size.getHeight() / 2) + object.velocity.getY() + 10, Setting.VELOCITY_GUI_ACTIVE, "rdown");
        LinkedList<GameObject> detectedObjectsLeftDown = object.checkTrigger((-1) * (object.size.getWidth() / 2), 0, 0, (object.size.getHeight() / 2) + object.velocity.getY() + 10, Setting.VELOCITY_GUI_ACTIVE, "ldown");
        LinkedList<GameObject> detectedObjectsDownDown = object.checkTrigger((-1) * (object.size.getWidth() / 2), (object.size.getHeight() / 2) + object.velocity.getY() + 10, object.size.getWidth(), 0, Setting.VELOCITY_GUI_ACTIVE, "ddown");
        GameObject.staticGUIId = 0;

        if(detectedObjectsRight.size() != 0) {
            //move if object movable
            object.position.setX(detectedObjectsRight.get(0).position.getX() - detectedObjectsRight.get(0).size.getWidth() / 2 - object.size.getWidth() / 2);
            object.velocity.setX(0);
        }
        if(detectedObjectsLeft.size() != 0) {
            //move if object movable
            object.position.setX(detectedObjectsRight.get(0).position.getX() + detectedObjectsRight.get(0).size.getWidth() / 2 + object.size.getWidth() / 2);
            object.velocity.setX(0);
        }
        
        //control for gravity
        if(detectedObjectsLeftDown.size() == 0 || detectedObjectsRightDown.size() == 0 || detectedObjectsDownDown.size() == 0) {
            object.velocity.addY(Setting.GRAVITY * 6);
        }
        if(detectedObjectsRightDown.size() != 0) {
            object.velocity.setY(0);
            object.position.setY(detectedObjectsRightDown.get(0).position.getY() - object.size.getHeight());
        }
        if(detectedObjectsLeftDown.size() != 0) {
            object.velocity.setY(0);
            object.position.setY(detectedObjectsLeftDown.get(0).position.getY() - object.size.getHeight());
        }
        if(detectedObjectsDownDown.size() != 0) {
            object.velocity.setY(0);
            object.position.setY(detectedObjectsDownDown.get(0).position.getY() - object.size.getHeight());
        }
    }
}
