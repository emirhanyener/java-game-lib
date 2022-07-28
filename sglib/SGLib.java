package sglib;

import sglib.Util.Camera;;

public class SGLib {
    public SGLib(){
        
    }

	public void setMainCamera(Camera mainCamera) {
		GameObjects.getInstance().setMainCamera(mainCamera);
	}
}
