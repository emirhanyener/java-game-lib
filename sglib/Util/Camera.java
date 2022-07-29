package sglib.Util;

import sglib.Setting;

public class Camera {
	protected Position position;
	
	public Camera(Position position) {
		this.position = position;
	}
	public Camera() {
		this.position = new Position();
	}
	
	public Position getPosition() {
		return new Position(position.getX() - Setting.WINDOW_WIDTH / 2, position.getY() - Setting.WINDOW_HEIGHT / 2);
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Position getRawPosition() {
		return this.position;
	}
}
