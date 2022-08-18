package sglib.GUI;

import java.awt.Color;
import java.awt.Graphics;

import sglib.Setting;
import sglib.Util.Position;

public abstract class GUI {
    private String name;
    private Color color;
    private Position position;

    public GUI(){
        this.color = Setting.DEFAULT_COLOR;
        this.position = new Position();
    }

    public String getName() {
        return name;
    }
    public Position getPosition() {
        return position;
    }
    public Color getColor() {
        return color;
    }
    public GUI setName(String name) {
        this.name = name;
        return this;
    }
    public GUI setPosition(Position position) {
        this.position = position;
        return this;
    }
    public GUI setColor(Color color) {
        this.color = color;
        return this;
    }

    public GUIText toGUIText(){
        return ((GUIText)this);
    }
    public GUIBox toGUIBox(){
        return ((GUIBox)this);
    }
    public GUILine toGUILine(){
        return ((GUILine)this);
    }

    public abstract void draw(Graphics g);
}
