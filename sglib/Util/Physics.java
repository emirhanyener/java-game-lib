package sglib.Util;

import java.util.LinkedList;

import sglib.*;

public class Physics {
    private GameObject object;
    private boolean isGround;
    private boolean isFrictionActive;
    private boolean isGravityActive;
    private float mass;
	public Velocity velocity = new Velocity();

    // set controlled object
    public Physics(GameObject object) {
        this.object = object;
        this.isGround = false;
        this.isFrictionActive = true;
        this.isGravityActive = true;
        this.mass = 1;
    }

    public GameObject getObject() {
        return this.object;
    }
    public boolean isGround() {
        return isGround;
    }
    public boolean isFrictionActive() {
        return isFrictionActive;
    }
    public boolean isGravityActive() {
        return isGravityActive;
    }
    public float getMass() {
        return mass;
    }
    public void setFrictionActive(boolean isFrictionActive) {
        this.isFrictionActive = isFrictionActive;
    }
    public void setGravityActive(boolean isGravityActive) {
        this.isGravityActive = isGravityActive;
    }
    public void setMass(float mass) {
        this.mass = mass;
    }

    public static Physics find(GameObject object) {
        for (Physics item : GameObjects.getInstance().getPhysics()) {
            if (item.getObject() == object) {
                return item;
            }
        }
        return null;
    }

    // calculate selected object
    public void calculate() {
        //object position update
		object.position.addX(velocity.getX());
		object.position.addY(velocity.getY());
        
        this.isGround = false;
        // detect object using gameobject checktrigger method.
        LinkedList<GameObject> detectedObjectsRight = object.checkTrigger(0, 0,
                (object.size.getWidth() / 2) + object.getPhysics().velocity.getX(), 0, Setting.VELOCITY_GUI_ACTIVE, "right");
        LinkedList<GameObject> detectedObjectsLeft = object.checkTrigger(0, 0,
                (-1) * (object.size.getWidth() / 2) + object.getPhysics().velocity.getX(), 0, Setting.VELOCITY_GUI_ACTIVE, "left");
        LinkedList<GameObject> detectedObjectsRightDown = object.checkTrigger((object.size.getWidth() / 2), 0, 0,
                (object.size.getHeight() / 2) + object.getPhysics().velocity.getY() + 10, Setting.VELOCITY_GUI_ACTIVE, "rdown");
        LinkedList<GameObject> detectedObjectsLeftDown = object.checkTrigger((-1) * (object.size.getWidth() / 2), 0, 0,
                (object.size.getHeight() / 2) + object.getPhysics().velocity.getY() + 10, Setting.VELOCITY_GUI_ACTIVE, "ldown");
        LinkedList<GameObject> detectedObjectsDownDown = object.checkTrigger((-1) * (object.size.getWidth() / 2),
                (object.size.getHeight() / 2) + object.getPhysics().velocity.getY() + 10, object.size.getWidth(), 0,
                Setting.VELOCITY_GUI_ACTIVE, "ddown");
        LinkedList<GameObject> detectedObjectsRightUp = object.checkTrigger((object.size.getWidth() / 2), 0, 0,
                (-1) * (object.size.getHeight() / 2) + object.getPhysics().velocity.getY(), Setting.VELOCITY_GUI_ACTIVE, "rup");
        LinkedList<GameObject> detectedObjectsLeftUp = object.checkTrigger((-1) * (object.size.getWidth() / 2), 0, 0,
                (-1) * (object.size.getHeight() / 2) + object.getPhysics().velocity.getY(), Setting.VELOCITY_GUI_ACTIVE, "lup");
        LinkedList<GameObject> detectedObjectsUpUp = object.checkTrigger((-1) * (object.size.getWidth() / 2),
                (-1) * (object.size.getHeight() / 2) + object.getPhysics().velocity.getY(), object.size.getWidth(), 0,
                Setting.VELOCITY_GUI_ACTIVE, "uup");
        GameObject.staticGUIId = 0;


        if (detectedObjectsRight.size() != 0) {
            // move if object movable
            if(Physics.find(detectedObjectsRight.get(0)) == null){
                object.position.setX(detectedObjectsRight.get(0).position.getX() - detectedObjectsRight.get(0).size.getWidth() / 2 - object.size.getWidth() / 2);
                object.getPhysics().velocity.setX(0);
            } else {
                velocity.setX(-this.velocity.getX());
                detectedObjectsRight.get(0).getPhysics().velocity.setX(-detectedObjectsRight.get(0).getPhysics().velocity.getX());
            }
        }
        if (detectedObjectsLeft.size() != 0) {
            // move if object movable
            if(Physics.find(detectedObjectsLeft.get(0)) == null){
                object.position.setX(detectedObjectsLeft.get(0).position.getX() - detectedObjectsLeft.get(0).size.getWidth() / 2 - object.size.getWidth() / 2);
                object.getPhysics().velocity.setX(0);
            } else {
                velocity.setX(-this.velocity.getX());
                detectedObjectsLeft.get(0).getPhysics().velocity.setX(-detectedObjectsLeft.get(0).getPhysics().velocity.getX());
            }
        }

        if (detectedObjectsRightUp.size() != 0) {
            object.getPhysics().velocity.setY(0);
            object.position.setY(detectedObjectsRightUp.get(0).position.getY() + detectedObjectsRightUp.get(0).size.getHeight());
        }
        if (detectedObjectsLeftUp.size() != 0) {
            object.getPhysics().velocity.setY(0);
            object.position.setY(detectedObjectsLeftUp.get(0).position.getY() + detectedObjectsLeftUp.get(0).size.getHeight());
        }
        if (detectedObjectsUpUp.size() != 0) {
            object.getPhysics().velocity.setY(0);
            object.position.setY(detectedObjectsUpUp.get(0).position.getY() + detectedObjectsUpUp.get(0).size.getHeight());
        }
        // control for gravity
        if ((detectedObjectsLeftDown.size() == 0 
                || detectedObjectsRightDown.size() == 0
                || detectedObjectsDownDown.size() == 0)
                && isGravityActive) {
            object.getPhysics().velocity.addY(Setting.GRAVITY * 6 * mass);
        }

        if (detectedObjectsRightDown.size() != 0) {
            isGround = true;
            object.getPhysics().velocity.setY(0);
            object.position.setY(detectedObjectsRightDown.get(0).position.getY() - object.size.getHeight());
        }
        if (detectedObjectsLeftDown.size() != 0) {
            isGround = true;
            object.getPhysics().velocity.setY(0);
            object.position.setY(detectedObjectsLeftDown.get(0).position.getY() - object.size.getHeight());
        }
        if (detectedObjectsDownDown.size() != 0) {
            isGround = true;
            object.getPhysics().velocity.setY(0);
            object.position.setY(detectedObjectsDownDown.get(0).position.getY() - object.size.getHeight());
        }

        if(isFrictionActive){
            if(this.isGround) {
                if(Math.abs(object.getPhysics().velocity.getX()) > 0.0000000001f){
                    object.getPhysics().velocity.addX((-1) * object.getPhysics().velocity.getX() / 10 * mass);
                } else {
                    object.getPhysics().velocity.setX(0);
                }
            } else {
                if(Math.abs(object.getPhysics().velocity.getX()) > 0.0000000001f){
                    object.getPhysics().velocity.addX((-1) * object.getPhysics().velocity.getX() / 100);
                } else {
                    object.getPhysics().velocity.setX(0);
                }
            }
        }
    }
}
