package sglib;

import sglib.Util.*;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class SGLib {
	GameFrame gframe;
    public SGLib(){
		gframe = new GameFrame();
        
    }

	public void start(){
		update();
	}

	public void setMainCamera(Camera mainCamera) {
		GameObjects.getInstance().setMainCamera(mainCamera);
	}

	public void setKeyListener(KeyListener kl){
		gframe.frame.addKeyListener(kl);
	}

	
    public void update() {
		while(true) {
		  try {
			TimeUnit.MILLISECONDS.sleep(Setting.REFRESH_RATE);
		  } 
		  catch (InterruptedException e) {
			e.printStackTrace();
		  }
		  gframe.canvas.repaint();
		  for (GameObject item : GameObjects.getInstance().getObjects()) {
			item.calculate();
		  }
		  for (Physics item : GameObjects.getInstance().getPhysics()) {
			item.calculate();
		  }
		  for (EventFunction item : GameObjects.getInstance().getEvents()) {
			item.execute();
		  }
		}
	  }
}
