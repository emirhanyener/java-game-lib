package sglib.Util;

import java.awt.Graphics;

public class Polygon {
    private Polygon(){

    }

    public static void draw(Graphics g, Position position, Size size, int shape, int rotation){
		int[] xPositions = new int[shape];
		int[] yPositions = new int[shape];

		for(int i = 0; i < shape; i++){
			xPositions[i] = (int)(position.getX() + size.getWidth() * Math.cos(Math.toRadians(((((shape - 2) * 180) / shape) * i ) + rotation)));
			yPositions[i] = (int)(position.getY() + size.getHeight() * Math.sin(Math.toRadians(((((shape - 2) * 180) / shape) * i ) + rotation)));
		}
		g.fillPolygon(xPositions, yPositions, shape);
    }
}
