package sglib.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GUIText extends GUI {
    private String text;
    private int textSize = 12;

    public GUIText(String text, Color color) {
        this.text = text;
        this.setColor(color);
    }

    public GUIText(String text) {
        this.text = text;
        this.setColor(Color.BLACK);
    }

    public String getText() {
        return text;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.setFont(new Font("Arial", 0, this.getTextSize()));
        g.drawString(text, (int) this.getPosition().getX(), (int) this.getPosition().getY());
    }
}
