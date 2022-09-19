package Tests;

import sglib.*;
import sglib.Util.GameObject;

public class SGLibTest {
    public SGLibTest(){
        int all = 4;
        int success = 0;

        System.out.println("SGLibTest tests start");

        if(gameObjectsInstanceTest()) success++;
        if(gameObjectsAddTest()) success++;
        if(gameObjectsRemoveTest()) success++;
        if(gameObjectsFindTest()) success++;

        System.out.println("SGLibTest tests end");

        System.out.println("SGLib tests " + success + " / " + all);
    }

    public boolean gameObjectsInstanceTest(){
        GameObjects g = GameObjects.getInstance();
        g.resetInstance();
        if(g != null){
            return true;
        }
        System.out.println("gameObjectsInstanceTest failed");
        return false;
    }

    public boolean gameObjectsAddTest(){
        GameObjects g = GameObjects.getInstance();
        g.resetInstance();
        GameObject o = new GameObject("test");
        g.addObject(o);
        if(g.findObject("test") != null){
            return true;
        }
        System.out.println("gameObjectsAddTest failed");
        return false;
    }

    public boolean gameObjectsRemoveTest(){
        GameObjects g = GameObjects.getInstance();
        g.resetInstance();
        GameObject o = new GameObject("test");
        g.addObject(o);
        g.removeObject(o);
        if(g.findObject("test") == null){
            return true;
        }
        System.out.println("gameObjectsRemoveTest failed");
        return false;
    }

    public boolean gameObjectsFindTest(){
        GameObjects g = GameObjects.getInstance();
        g.resetInstance();
        g.addObject(new GameObject("test1"));
        g.addObject(new GameObject("test2"));
        g.addObject(new GameObject("test3"));
        if(g.findObject("test2") != null){
            return true;
        }
        System.out.println("gameObjectsFindTest failed");
        return false;
    }
}
