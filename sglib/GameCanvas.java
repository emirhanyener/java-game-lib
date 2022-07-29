package sglib;

import sglib.Util.Object;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

public class GameCanvas extends JPanel{
	public GameCanvas() {
        
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Setting.BACKGROUND_COLOR);
		g.fillRect(0, 0, Setting.WINDOW_WIDTH, Setting.WINDOW_HEIGHT);
		g.setColor(Setting.DEFAULT_COLOR);
		
		for(Object item : GameObjects.getInstance().getObjects()) {
			if(item.getImage() == null)			
				g.fillRect((int)item.position.getX() - (int)GameObjects.getInstance().getMainCamera().getPosition().getX(), (int)item.position.getY() - (int)GameObjects.getInstance().getMainCamera().getPosition().getY(), item.size.getWidth(), item.size.getHeight());
			else
				g.drawImage(item.getImage(), (int)item.position.getX() - (int)GameObjects.getInstance().getMainCamera().getPosition().getX(), (int)item.position.getY() - (int)GameObjects.getInstance().getMainCamera().getPosition().getY(), item.size.getWidth(), item.size.getHeight(), Setting.DEFAULT_COLOR, new ImageObserver() {
					@Override
					public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
						return false;
					}
				});
		}
	}
}