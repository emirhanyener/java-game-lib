package sglib.Camera;

import sglib.Util.Position;

public abstract class Camera {
	private float zoomValue;
    protected Position position;

	public Camera(){
		this.zoomValue = 1;
	}
	
	//getters
	public Position getCameraPosition(){
		return this.position;
	}
	public float getZoomValue(){
		return this.zoomValue;
	}

	//setters
    public void setPosition(Position position) {
        this.position = position;
    }
	public void setZoomValue(float zoomValue){
		this.zoomValue = zoomValue;
	}
	public void addZoomValue(float zoomValue){
		this.zoomValue += zoomValue;
	}

	public abstract Position getPosition();
}
