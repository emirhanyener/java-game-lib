package sglib.Camera;

import sglib.Setting;
import sglib.Util.Camera;
import sglib.Util.GameObject;
import sglib.Util.Position;

public class DynamicCamera implements Camera{
    private GameObject target;
    private Position offset;

    public DynamicCamera(GameObject object, Position offset){
        this.target = object;
        this.offset = offset;
    }
    public DynamicCamera(GameObject object){
        this.target = object;
        this.offset = new Position();
    }

    @Override
    public Position getPosition() {
        return new Position(target.position.getX() + offset.getX() + (target.size.getWidth() / 2) - Setting.WINDOW_WIDTH / 2, target.position.getY() + offset.getY() + target.size.getHeight() - Setting.WINDOW_HEIGHT / 2);
    }
}
