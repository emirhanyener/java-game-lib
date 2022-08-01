package sglib;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class GameFrame{
    public GameCanvas canvas;
    public JFrame frame;
    public GameFrame(){
        frame = new JFrame();
        frame.setBounds(Setting.WINDOW_POSITION_X, Setting.WINDOW_POSITION_Y, Setting.WINDOW_WIDTH, Setting.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new GameCanvas();
        frame.add(canvas, BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
