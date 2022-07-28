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
		position = new Position(position.getX(), position.getY());

		position.addX(-Setting.WINDOW_WIDTH / 2);
		position.addY(-Setting.WINDOW_HEIGHT / 2);
		
		return this.position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Position getRawPosition() {
		return this.position;
	}
}
