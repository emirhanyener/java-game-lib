package sglib.Camera;

import sglib.GameObjects;
import sglib.Setting;
import sglib.KeyManager.KeyManager;
import sglib.Util.Alert;
import sglib.Util.GameObject;
import sglib.Util.Position;
import sglib.Util.StaticValues.AlertLevel;

//follower camera follows a target object automaticly
public class MultipleCamera extends Camera {
    private GameObject[] targets;
    private Position offset;

    // constuctors
    public MultipleCamera(GameObject[] objects, Position offset) {
        this.targets = objects;
        this.offset = offset;
        this.position = new Position();
    }

    // set offset position 0, 0 if offset not sended
    public MultipleCamera(GameObject[] objects) {
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
        float left = targets[0].position.getX();
        float right = targets[0].position.getX() + targets[0].size.getWidth();

        for (GameObject gameObject : targets) {
            if(gameObject.position.getX() < left){
                left = gameObject.position.getX();
            }
            if(gameObject.position.getX() > right){
                right = gameObject.position.getX() + gameObject.size.getWidth();
            }
            sumX += gameObject.position.getX();
            sumY += gameObject.position.getY();
        }
        //GameObjects.getInstance().getMainCamera().setZoomValue(1 + (float)(2 * Math.atan((0.5f * (right - left)) / (((sumX / targets.length) * (Setting.WINDOW_HEIGHT / Setting.WINDOW_WIDTH))))));
        GameObjects.getInstance().getMainCamera().setZoomValue(1 + ((Setting.WINDOW_WIDTH - (right - left)) / Setting.WINDOW_WIDTH) * GameObjects.getInstance().getMainCamera().getZoomValue());
                
        return new Position((sumX / targets.length) + offset.getX() - Setting.WINDOW_WIDTH / 2,
                (sumY / targets.length) + offset.getY() - Setting.WINDOW_HEIGHT / 2);
    }
}
