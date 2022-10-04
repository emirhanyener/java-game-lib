package sglib.Developer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DeveloperFrame extends JFrame{
    private static DeveloperFrame frame = null;
    private static GameObjectsFrame gameObjectsFrame = null;

    private DeveloperFrame(){
        this.setTitle("Developer Console");
        this.setBounds(10, 10, 300, 600);
        this.setLayout(new FlowLayout());
        gameObjectsFrame = new GameObjectsFrame();
        gameObjectsFrame.setVisible(false);

        JButton shutdownBtn = new JButton("shutdown");
        shutdownBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(shutdownBtn);

        JButton gameObjectsBtn = new JButton("GameObjects");
        gameObjectsBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                gameObjectsFrame.setVisible(true);
            }
        });
        this.add(gameObjectsBtn);

    }

    public static DeveloperFrame getInstance(){
        if(frame == null){
            frame = new DeveloperFrame();
        }
        return frame;
    }
}
