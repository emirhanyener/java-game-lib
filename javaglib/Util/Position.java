package Util;

public class Position {
	private float X;
	private float Y;
	
	public Position() {
		resetPosition();
	}
	
	public Position(float X, float Y) {
		this.X = X;
		this.Y = Y;
	}

	public Position add(Position pos) {
		return new Position(this.getX() + pos.getX(), this.getY() + pos.getY());
	}
	
	public Position diff(Position pos) {
		return new Position(this.getX() - pos.getX(), this.getY() - pos.getY());
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
	public void addX(float X) {
		this.X += X;
	}
	public void setY(float Y) {
		this.Y = Y;
	}
	public void addY(float Y) {
		this.Y += Y;
	}
	
	public void resetPosition() {
		this.X = 0;
		this.Y = 0;
	}
}
