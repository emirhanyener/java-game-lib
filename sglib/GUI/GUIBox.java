package sglib.GUI;

import java.awt.Color;
import java.awt.Graphics;

import sglib.Util.Size;

public class GUIBox extends GUI {
    private Size size;

    public GUIBox(Size size, Color color) {
        this.size = size;
        this.setColor(color);
    }

    public GUIBox(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect((int) this.getPosition().getX(), (int) this.getPosition().getY(), this.size.getWidth(),
                this.size.getHeight());
    }
}
