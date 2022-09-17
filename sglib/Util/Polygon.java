package sglib.Util;

import java.awt.Graphics;

import sglib.GameObjects;
import sglib.Setting;

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
		xPositions[0] = (int) ((item.position.getX() - Setting.WINDOW_WIDTH / 2) * GameObjects.getInstance().getMainCamera().getZoomValue() + Setting.WINDOW_WIDTH / 2) - (int)((item.size.getWidth() / 2) * GameObjects.getInstance().getMainCamera().getZoomValue()) - (int) (GameObjects.getInstance().getMainCamera().getPosition().getX() * GameObjects.getInstance().getMainCamera().getZoomValue());
		yPositions[0] = (int) ((item.position.getY() - Setting.WINDOW_HEIGHT / 2) * GameObjects.getInstance().getMainCamera().getZoomValue() + Setting.WINDOW_HEIGHT / 2) - (int)((item.size.getHeight() / 2) * GameObjects.getInstance().getMainCamera().getZoomValue()) - (int) (GameObjects.getInstance().getMainCamera().getPosition().getY() * GameObjects.getInstance().getMainCamera().getZoomValue());

		// size
		xPositions[1] = (int) ((item.position.getX() - Setting.WINDOW_WIDTH / 2) * GameObjects.getInstance().getMainCamera().getZoomValue() + Setting.WINDOW_WIDTH / 2) + (int)((item.size.getWidth() / 2) * GameObjects.getInstance().getMainCamera().getZoomValue()) - (int) (GameObjects.getInstance().getMainCamera().getPosition().getX() * GameObjects.getInstance().getMainCamera().getZoomValue());
		yPositions[1] = (int) ((item.position.getY() - Setting.WINDOW_HEIGHT / 2) * GameObjects.getInstance().getMainCamera().getZoomValue() + Setting.WINDOW_HEIGHT / 2) - (int)((item.size.getHeight() / 2) * GameObjects.getInstance().getMainCamera().getZoomValue()) - (int) (GameObjects.getInstance().getMainCamera().getPosition().getY() * GameObjects.getInstance().getMainCamera().getZoomValue());
		xPositions[2] = (int) ((item.position.getX() - Setting.WINDOW_WIDTH / 2) * GameObjects.getInstance().getMainCamera().getZoomValue() + Setting.WINDOW_WIDTH / 2) + (int)((item.size.getWidth() / 2) * GameObjects.getInstance().getMainCamera().getZoomValue()) - (int) (GameObjects.getInstance().getMainCamera().getPosition().getX() * GameObjects.getInstance().getMainCamera().getZoomValue());
		yPositions[2] = (int) ((item.position.getY() - Setting.WINDOW_HEIGHT / 2) * GameObjects.getInstance().getMainCamera().getZoomValue() + Setting.WINDOW_HEIGHT / 2) + (int)((item.size.getHeight() / 2) * GameObjects.getInstance().getMainCamera().getZoomValue()) - (int) (GameObjects.getInstance().getMainCamera().getPosition().getY() * GameObjects.getInstance().getMainCamera().getZoomValue());
		xPositions[3] = (int) ((item.position.getX() - Setting.WINDOW_WIDTH / 2) * GameObjects.getInstance().getMainCamera().getZoomValue() + Setting.WINDOW_WIDTH / 2) - (int)((item.size.getWidth() / 2) * GameObjects.getInstance().getMainCamera().getZoomValue()) - (int) (GameObjects.getInstance().getMainCamera().getPosition().getX() * GameObjects.getInstance().getMainCamera().getZoomValue());
		yPositions[3] = (int) ((item.position.getY() - Setting.WINDOW_HEIGHT / 2) * GameObjects.getInstance().getMainCamera().getZoomValue() + Setting.WINDOW_HEIGHT / 2) + (int)((item.size.getHeight() / 2) * GameObjects.getInstance().getMainCamera().getZoomValue()) - (int) (GameObjects.getInstance().getMainCamera().getPosition().getY() * GameObjects.getInstance().getMainCamera().getZoomValue());

		g.fillPolygon(xPositions, yPositions, 4);
	}
}
