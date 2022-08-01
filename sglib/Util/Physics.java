package sglib.Util;

import sglib.*;

public class Physics {
    private GameObject object;
	private boolean isMovable = true;
	private boolean isGravityControlled = false;
	
    //set controlled object
	public Physics(GameObject object) {
        this.object = object;
	}

    //calculate selected object
	public void calculate() {
        //loop all object
        for(int o = 0; o < GameObjects.getInstance().getObjects().size(); o++) {
            GameObject item = GameObjects.getInstance().getObjects().get(o);

            //skip iteration if item and object is same
            if(item == object){
                continue;
            }
            
            //conflict control for y axis
            if(object.position.getX() + object.size.getWidth() > item.position.getX() && object.position.getX() < item.position.getX() + item.size.getWidth() && object.position.getY() + object.velocity.getY() + object.size.getHeight() > item.position.getY() && object.position.getY() + object.velocity.getY() < item.position.getY() + item.size.getHeight())
            {	
                if(!item.isAbstract()) {
                    if(object.position.getY() + object.velocity.getY() < item.position.getY()) {
                        object.position.setY(item.position.getY() - object.size.getHeight());
                    }
                    object.velocity.setY(0);
                }
            }
            else {
                isGravityControlled = true;
            }
            
            //confict control for x axis
            if(object.position.getY() + object.size.getHeight() - 1 > item.position.getY()){
                if(object.position.getY() < item.position.getY() + item.size.getHeight()) {
                    if(object.position.getX() + object.size.getWidth() + object.velocity.getX() > item.position.getX()) {
                        if(object.position.getX() + object.velocity.getX() < item.position.getX() + item.size.getWidth()) {
                            if(item.isAbstract()) {	
                                item.OnTriggered(item);
                                continue;
                            }
                            else{
                                isMovable = false;
                        
                            }
                        }
                    }
                }
            }
        }
        
        if(isMovable) {
            //move if object movable
            object.position.setX(object.position.getX() + object.velocity.getX());
        }
        if(isGravityControlled) {
            //add gravity force to velocity y
            object.velocity.addY(Setting.GRAVITY * 6);
        }

        //reset variables
        isMovable = true;
        isGravityControlled = false;
    }
}
