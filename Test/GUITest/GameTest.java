package Test.GUITest;

import sglib.*;
import sglib.Util.*;
import sglib.GUI.*;

public class GameTest {
    public GameTest(){

    }

    public static void main(String[] args) {
        SGLib sglib = new SGLib();

        GameObjects.getInstance().addGUIObject((new GUIBox(new Size(100,100))).setPosition(new Position(100, 100)).setName("box1"));
        GameObjects.getInstance().addGUIObject((new GUIText("text")).setPosition(new Position(0, 400)).setName("text1"));
        GameObject.create("empty");
        GameObject.find("empty").setFunction(new ClickEvent());

        sglib.start();
	}
}
