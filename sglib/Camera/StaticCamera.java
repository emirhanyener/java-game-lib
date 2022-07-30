package sglib.Camera;

import sglib.Setting;
import sglib.Util.Camera;
import sglib.Util.Position;

public class StaticCamera implements Camera{
    private Position position;

    public StaticCamera(){
        this.position = new Position();
    }
    public StaticCamera(Position position){
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return new Position(position.getX() - Setting.WINDOW_WIDTH / 2, position.getY() - Setting.WINDOW_HEIGHT / 2);
    }
}
