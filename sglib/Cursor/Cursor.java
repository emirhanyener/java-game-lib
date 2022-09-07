package sglib.Cursor;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import sglib.GameObjects;
import sglib.Util.Position;

public class Cursor implements MouseListener, MouseMotionListener {
    private static Cursor cursor;
    private Position position;
    private boolean isClicking;
    private boolean isInWindow;

    private Cursor() {
        this.position = new Position();
        this.isClicking = false;
        this.isInWindow = false;
    }

    public static Cursor getInstance() {
        if (cursor == null) {
            cursor = new Cursor();
        }
        return cursor;
    }

    public Position getGamePosition() {
        return new Position(position.getX() + GameObjects.getInstance().getMainCamera().getPosition().getX(),
                position.getY() + GameObjects.getInstance().getMainCamera().getPosition().getY());
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

    @Override
    public void mouseDragged(MouseEvent e) {
        position.setX(e.getX());
        position.setY(e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        position.setX(e.getX());
        position.setY(e.getY());
    }
}
