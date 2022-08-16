package sglib.GUI;

import java.awt.Color;
import java.awt.Graphics;

import sglib.Setting;
import sglib.Util.Position;

public abstract class GUI {
    private Color color;
    private Position position;

    public GUI(){
        this.color = Setting.DEFAULT_COLOR;
        this.position = new Position();
    }

    public Position getPosition() {
        return position;
    }
    public Color getColor() {
        return color;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics g);
}
