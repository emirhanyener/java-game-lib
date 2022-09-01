package sglib;

import sglib.Util.Alert;
import sglib.Util.AlertInfo;
import sglib.Util.GameObject;
import sglib.Util.Polygon;
import sglib.Util.Position;
import sglib.Util.Size;
import sglib.GUI.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

//game canvas
//for repaint panel
public class GameCanvas extends JPanel{
	public GameCanvas() {
        
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Setting.BACKGROUND_COLOR);
		g.fillRect(0, 0, Setting.WINDOW_WIDTH, Setting.WINDOW_HEIGHT);
		g.setColor(Setting.DEFAULT_COLOR);

		//draw all gameobjects
		for(GameObject item : GameObjects.getInstance().getObjects()) {
			if(item.getImage() == null)	{
				g.setColor(Setting.DEFAULT_COLOR);
				Polygon.draw(g, item);
				//Polygon.draw(g, new Position((int)(item.position.getX() - GameObjects.getInstance().getMainCamera().getPosition().getX()), (int)(item.position.getY() - GameObjects.getInstance().getMainCamera().getPosition().getY())), new Size((int)(item.size.getWidth()), (int)(item.size.getHeight())));
			}
			else{
				g.drawImage(item.getImage(), (int)item.position.getX() - (int)GameObjects.getInstance().getMainCamera().getPosition().getX(), (int)item.position.getY() - (int)GameObjects.getInstance().getMainCamera().getPosition().getY(), item.size.getWidth(), item.size.getHeight(), Setting.DEFAULT_COLOR, new ImageObserver() {
					@Override
					public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
						return false;
					}
				});
			}
		}
		if(Setting.IS_ALERT_ACTIVE) {
			int i = 0;
			for(AlertInfo alert : Alert.getInstance().getAlerts()) {
				i++;
				switch (alert.getAlertLevel()) {
					case info:
						g.setColor(Color.BLUE);
						break;
					case warning:
						g.setColor(Color.YELLOW);
						break;
					case error:
						g.setColor(Color.RED);
						break;
					default:
						g.setColor(Color.BLACK);
						break;
				}
				g.drawString(alert.getMessage(), 10, i * 15);
			}
		}
		
		if(Setting.IS_GUI_ACTIVE){
			for(GUI gui : GameObjects.getInstance().getGUIObjects()){
				gui.draw(g);
			}
		}
	}
}