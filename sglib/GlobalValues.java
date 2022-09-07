package sglib;

import sglib.Util.Size;;

public class GlobalValues {
    private static GlobalValues instance = null;
    private Size canvasSize = null;

    private GlobalValues(){
        this.canvasSize = new Size();
    }

    public static GlobalValues getInstance(){
        if(instance == null){
            instance = new GlobalValues();
        }
        return instance;
    }

    public Size getCanvasSize() {
        return canvasSize;
    }
    public void setCanvasSize(Size canvasSize) {
        this.canvasSize = canvasSize;
    }
}
