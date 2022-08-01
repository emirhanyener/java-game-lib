package sglib.Util;

public class Velocity {
	private float X;
	private float Y;
	
	public Velocity() {
		this.X = 0;
		this.Y = 0;
	}
	
	public Velocity(float X, float Y) {
		this.X = X;
		this.Y = Y;
	}
	
	public float getX() {
		return this.X;
	}
	public float getY() {
		return this.Y;
	}
	
	public void setX(float X) {
		this.X = X;
	}
	public void addX(float X){
		this.X += X;
	}
	public void setY(float Y) {
		this.Y = Y;
	}
	public void addY(float Y){
		this.Y += Y;
	}

}
