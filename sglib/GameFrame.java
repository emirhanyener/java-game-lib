package sglib;

import java.awt.BorderLayout;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

public class GameFrame{
    GameCanvas canvas;
    public GameFrame(){
        JFrame frame = new JFrame();
        frame.setBounds(Setting.WINDOW_POSITION_X, Setting.WINDOW_POSITION_Y, Setting.WINDOW_WIDTH, Setting.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new GameCanvas();
        frame.add(canvas, BorderLayout.CENTER);
        frame.setVisible(true);
        update();
    }

    public void update() {
		while(true) {
			try {
				TimeUnit.MILLISECONDS.sleep(Setting.REFRESH_RATE);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			canvas.repaint();
		}
    }
}
