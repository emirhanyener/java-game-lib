package sglib;

public class GameTime {
    private static GameTime instance = null;
    private int milliseconds = 0;

    private GameTime(){

    }

    public static GameTime getInstance(){
        if(instance == null){
            instance = new GameTime();
        }
        return instance;
    }

    public void addTime(){
        this.milliseconds += Setting.REFRESH_RATE;
    }
    public int getRuntimeMilliseconds(){
        return this.milliseconds;
    }
}
