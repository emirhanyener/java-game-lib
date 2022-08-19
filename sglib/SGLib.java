package sglib;

import sglib.Camera.Camera;
import sglib.Cursor.Cursor;
import sglib.Util.*;

import java.awt.event.KeyListener;
import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;

public class SGLib {
	GameFrame gframe;

    public SGLib(){
		gframe = new GameFrame();
		gframe.frame.addMouseListener(Cursor.getInstance());
    }

	//this method starts sglib
	public void start(){
		update();
	}

	//setters
	public void setMainCamera(Camera mainCamera) {
		GameObjects.getInstance().setMainCamera(mainCamera);
	}
	public void setKeyListener(KeyListener kl){
		gframe.frame.addKeyListener(kl);
	}

	//this method executes per refresh in game
    public void update() {
		Cursor.getInstance().getPosition().setX((float)(gframe.frame.getLocation().getX() + MouseInfo.getPointerInfo().getLocation().getX()));
		Cursor.getInstance().getPosition().setY((float)(gframe.frame.getLocation().getY() + MouseInfo.getPointerInfo().getLocation().getY()));  
		while(true) {
			try {
				TimeUnit.MILLISECONDS.sleep(Setting.REFRESH_RATE);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			gframe.canvas.repaint();
			for (EventFunction item : GameObjects.getInstance().getEvents()) {
				item.execute();
			}
			for (Physics item : GameObjects.getInstance().getPhysics()) {
				item.calculate();
			}
			for (GameObject item : GameObjects.getInstance().getObjects()) {
				item.calculate();
			}
		}
	}
}
