package Test.GUITest;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import sglib.GameObjects;

public class ClickEvent implements KeyListener{
    private int clickCount = 12;

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            clickCount++;
            GameObjects.getInstance().findGUIObject("text1").toGUIText().setTextSize(clickCount);
            GameObjects.getInstance().findGUIObject("text1").toGUIText().setText("click counter : " + clickCount);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
}
