package sglib.Util;

import java.awt.Graphics;

import sglib.GameObjects;

public class Polygon {
	private Polygon() {

	}

	public static void draw(Graphics g, GameObject item/* , Position anchor, int shape, int angle */) {
		int[] xPositions = new int[4];
		int[] yPositions = new int[4];

		/*
		 * for(int i = 0; i < shape; i++){
		* 		xPositions[i] = (int)(position.getX() + (size.getWidth()) * Math.cos(Math.toRadians(((180 - ((shape - 2) * 180) / shape) * i ) + 45)));
		* 		yPositions[i] = (int)(position.getY() + (size.getHeight()) * Math.sin(Math.toRadians(((180 - ((shape - 2) * 180) / shape) * i ) + 45)));
		 * }
		*/

		
		// position
		xPositions[0] = (int) item.position.getX() - item.size.getWidth() / 2 - (int) GameObjects.getInstance().getMainCamera().getPosition().getX();
		yPositions[0] = (int) item.position.getY() - item.size.getHeight() / 2 - (int) GameObjects.getInstance().getMainCamera().getPosition().getY();

		// size
		xPositions[1] = (int)(((int) item.position.getX() + item.size.getWidth() / 2 - (int) GameObjects.getInstance().getMainCamera().getPosition().getX()) * GameObjects.getInstance().getMainCamera().getZoomValue());
		yPositions[1] = (int) item.position.getY() - item.size.getHeight() / 2 - (int) GameObjects.getInstance().getMainCamera().getPosition().getY();
		xPositions[2] = (int)(((int) item.position.getX() + item.size.getWidth() / 2 - (int) GameObjects.getInstance().getMainCamera().getPosition().getX()) * GameObjects.getInstance().getMainCamera().getZoomValue());
		yPositions[2] = (int)(((int) item.position.getY() + item.size.getHeight() / 2 - (int) GameObjects.getInstance().getMainCamera().getPosition().getY()) * GameObjects.getInstance().getMainCamera().getZoomValue());
		xPositions[3] = (int) item.position.getX() - item.size.getWidth() / 2 - (int) GameObjects.getInstance().getMainCamera().getPosition().getX();
		yPositions[3] = (int)(((int) item.position.getY() + item.size.getHeight() / 2 - (int) GameObjects.getInstance().getMainCamera().getPosition().getY()) * GameObjects.getInstance().getMainCamera().getZoomValue());

		g.fillPolygon(xPositions, yPositions, 4);
	}
}
