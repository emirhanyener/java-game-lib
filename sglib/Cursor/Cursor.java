package sglib.Cursor;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.MouseInfo;

import sglib.Util.Position;

public class Cursor implements MouseListener{
    private static Cursor cursor;
    private Position position;
    private boolean isClicking;
    private boolean isInWindow;

    private Cursor(){
        this.position = new Position();
        this.isClicking = false;
        this.isInWindow = false;
    }

    public static Cursor getInstance(){
        if(cursor == null){
            cursor = new Cursor();
        }
        return cursor;
    }

    public Position getGamePosition(){
        return new Position((float)MouseInfo.getPointerInfo().getLocation().getX(), (float)MouseInfo.getPointerInfo().getLocation().getY());
    }

    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isClicking() {
        return isClicking;
    }
    public boolean isInWindow() {
        return isInWindow;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.isClicking = true;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.isClicking = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.isInWindow = true;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.isInWindow = false;
    }
}
