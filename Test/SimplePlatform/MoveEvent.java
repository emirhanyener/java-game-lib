package Test.SimplePlatform;

import sglib.Util.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MoveEvent implements KeyListener{
    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            GameObject.find("player").velocity.setY(-10);
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            GameObject.find("player").velocity.setX(-1);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            GameObject.find("player").velocity.setX(1);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT){
            GameObject.find("player").velocity.setX(0);
        }
    }
}
