package Test;
import sglib.Util.*;

public class UtilTest {
    public UtilTest(){
        int all = 3;
        int success = 0;

        System.out.println("Util tests start");
        
        if(positionTest()) success++;
        if(velocityTest()) success++;
        if(sizeTest()) success++;

        System.out.println("Util tests end");

        System.out.println("Util tests " + success + " / " + all);
    }

    public boolean positionTest(){
        Position p = new Position();
        if(p.getX() == 0 && p.getY() == 0){
            return true;
        }
        System.out.println("positionTest failed");
        return false;
    }
    public boolean velocityTest(){
        Velocity v = new Velocity();
        if(v.getX() == 0 && v.getY() == 0){
            return true;
        }
        System.out.println("velocityTest failed");
        return false;
    }
    public boolean sizeTest(){
        Size s = new Size(100, 100);
        if(s.getHeight() == 100 && s.getWidth() == 100){
            return true;
        }
        System.out.println("sizeTest failed");
        return false;
    }
}
