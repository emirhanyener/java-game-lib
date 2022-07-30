package sglib;

import sglib.Util.Camera;;

public class SGLib {
    public SGLib(){
        
    }

	public void start(){
		GameFrame gframe = new GameFrame();
	}

	public void setMainCamera(Camera mainCamera) {
		GameObjects.getInstance().setMainCamera(mainCamera);
	}
}
