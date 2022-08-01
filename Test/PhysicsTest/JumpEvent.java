package Test.PhysicsTest;

import sglib.Util.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class JumpEvent implements KeyListener{
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            GameObject.find("o2").velocity.setY(-10);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
