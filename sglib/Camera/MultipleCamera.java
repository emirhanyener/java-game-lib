package sglib.Camera;

import sglib.Setting;
import sglib.Util.GameObject;
import sglib.Util.Position;

//follower camera follows a target object automaticly
public class MultipleCamera extends Camera{
    private GameObject[] targets;
    private Position offset;

    //constuctors
    public MultipleCamera(GameObject[] objects, Position offset){
        this.targets = objects;
        this.offset = offset;
        this.position = new Position();
    }
    //set offset position 0, 0 if offset not sended
    public MultipleCamera(GameObject[] objects){
        this.targets = objects;
        this.offset = new Position();
        this.position = new Position();
    }

    @Override
    public Position getCameraPosition() {
        float sumX = 0;
        float sumY = 0;
        for (GameObject gameObject : targets) {
            sumX += gameObject.position.getX();
            sumY += gameObject.position.getY();
        }
        this.position.setX(sumX / targets.length + offset.getX());
        this.position.setY(sumY / targets.length + offset.getY());
        return this.position;
    }

    @Override
    public void setPosition(Position position) {
        
    }

    @Override
    public Position getPosition() {
        float sumX = 0;
        float sumY = 0;
        for (GameObject gameObject : targets) {
            sumX += gameObject.position.getX();
            sumY += gameObject.position.getY();
        }

        return new Position((sumX / targets.length) + offset.getX() - Setting.WINDOW_WIDTH / 2, (sumY / targets.length) + offset.getY() - Setting.WINDOW_HEIGHT / 2);
    }
}
