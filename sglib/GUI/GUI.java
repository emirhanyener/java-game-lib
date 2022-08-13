package sglib.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import sglib.Util.Position;

public class GUI {
    private Color color;
    private Position position;

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
}
