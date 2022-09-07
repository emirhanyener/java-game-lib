package sglib.GUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

import sglib.GameObjects;
import sglib.Setting;
import sglib.Util.*;

public class GUILine extends GUI {
    private Position toPosition;

    public GUILine(Position pos1, Position pos2) {
        this.setPosition(pos1);
        this.toPosition = pos2;
    }

    public Position getToPosition() {
        return toPosition;
    }

    public void setToPosition(Position toPosition) {
        this.toPosition = toPosition;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(Setting.STOKE_WIDTH));
        g2d.drawLine((int) (this.getPosition().getX() - GameObjects.getInstance().getMainCamera().getPosition().getX()),
                (int) (this.getPosition().getY() - GameObjects.getInstance().getMainCamera().getPosition().getY()),
                (int) (this.toPosition.getX() - GameObjects.getInstance().getMainCamera().getPosition().getX()),
                (int) (this.toPosition.getY() - GameObjects.getInstance().getMainCamera().getPosition().getY()));
    }
}
