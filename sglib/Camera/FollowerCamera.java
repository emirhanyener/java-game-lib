package sglib.Camera;

import sglib.GlobalValues;
import sglib.Setting;
import sglib.Util.GameObject;
import sglib.Util.Position;

//follower camera follows a target object automaticly
public class FollowerCamera extends Camera {
    private GameObject target;
    private Position offset;

    // constuctors
    public FollowerCamera(GameObject object, Position offset) {
        this.target = object;
        this.offset = offset;
    }

    // set offset position 0, 0 if offset not sended
    public FollowerCamera(GameObject object) {
        this.target = object;
        this.offset = new Position();
    }

    @Override
    public Position getCameraPosition() {

        return target.position;
    }

    @Override
    public void setPosition(Position position) {

    }

    @Override
    public Position getPosition() {
        return new Position(
                target.position.getX() + offset.getX() - (GlobalValues.getInstance().getCanvasSize().getWidth() / 2),
                target.position.getY() + offset.getY() + target.size.getHeight() - GlobalValues.getInstance().getCanvasSize().getHeight() / 2);
    }
}
