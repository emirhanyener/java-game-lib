package sglib.Camera;

import sglib.Util.Position;

public abstract class Camera {
	private float zoomValue;

	public Camera(){
		this.zoomValue = 1;
	}
	
	public float getZoomValue(){
		return this.zoomValue;
	}
	public void setZoomValue(float zoomValue){
		this.zoomValue = zoomValue;
	}
	public void addZoomValue(float zoomValue){
		this.zoomValue += zoomValue;
	}

	public abstract Position getPosition();
}
