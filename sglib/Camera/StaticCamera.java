package sglib.Camera;

import sglib.Setting;
import sglib.Util.Position;

//static camera, used for set position manually 
public class StaticCamera extends Camera {
    // set position 0, 0 if constructor has no parameter
    public StaticCamera() {
        this.position = new Position();
    }

    public StaticCamera(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return new Position(position.getX() - Setting.WINDOW_WIDTH / 2, position.getY() - Setting.WINDOW_HEIGHT / 2);
    }
}
