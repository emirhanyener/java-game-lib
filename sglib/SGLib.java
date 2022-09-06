package sglib;

import sglib.Camera.Camera;
import sglib.Cursor.Cursor;
import sglib.Util.*;

import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;

public class SGLib {
	GameFrame gframe;

    public SGLib(){
		gframe = new GameFrame();
		gframe.frame.addMouseListener(Cursor.getInstance());
		gframe.frame.addMouseMotionListener(Cursor.getInstance());
		gframe.frame.addKeyListener(KeyController.getManager());
    }

	//this method starts sglib
	public void start(){
		update();
	}

	//setters
	public void setMainCamera(Camera mainCamera) {
		GameObjects.getInstance().setMainCamera(mainCamera);
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
			//Function execute
			for (EventFunction item : GameObjects.getInstance().getEvents()) {
				item.execute();
			}
			//GameObject update
			for (GameObject item : GameObjects.getInstance().getObjects()) {
				item.calculate();
			}
			//Physics update
			for (Physics item : GameObjects.getInstance().getPhysics()) {
				item.calculate();
			}
			gframe.canvas.repaint();
		}
	}
}
